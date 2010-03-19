package org.mod4j.dsl.presentation.mm.helpers;

import java.util.List;

//import org.mod4j.crossx.broker.CrossxEnvironment;
//import org.mod4j.crossx.mm.crossx.Symbol;
import org.eclipse.emf.common.util.EList;
import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Process;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;
//import org.eclipse.xtend.util.stdlib.ElementPropertiesExtensions;

public class PresentationHelpers {

//    static public Symbol referredSymbol(UICall call) {
//        Symbol result = null;
//        List<Symbol> dialogues = CrossxEnvironment.findAllEverywhere("Dialogue");
//        for (Symbol symbol : dialogues) {
//            if( symbol.getName().equals(call.getName())){
//                result = symbol;
//                break;
//            }
//        }
//        return result;
//    }

    static public String standardExpressionResultType(String sourceContext, String targetContext, StandardExpression exp){
        Mod4jType result = standardExpressionMod4jType(sourceContext, targetContext, exp);
        if( result.hasError()){
            return result.getError();
        } else {
            return result.getBaseType();
        }
    }

    /**
     * @param context the context of the expression
     * @param exp The expression to find the type for
     * @return
     */
    private static Mod4jType standardExpressionMod4jType(String sourceContext, String targetContext, StandardExpression exp) {
        Mod4jType result = new Mod4jType("UNKNOWN", "UNNOWN");
        if( exp.getType() == ExpressionType.ALL ){
            result.setBaseType(targetContext);
            result.setCollection("LIST");
        } else if( exp.getType() == ExpressionType.FIND){
            result.setBaseType(sourceContext);
            result.setCollection("LIST");
        } else {
            result.setError("ERROR 10: Unknown standard expression type [" + exp.getType().getLiteral() + "]" );
        }
        return result;
    }

    static public String serviceCallResultType(String context, ServiceExpression exp){
        Mod4jType result = serviceCallMod4jType(context, exp);
        if( result.hasError()){
            return result.getError();
        } else {
            return result.getBaseType();
        }
    }
    /**
     * returns the result type of the service call referred to by the ServiceExpression.
     * Returns a string starting with ERROR:  if there is an error with the service call
     */
    static public Mod4jType serviceCallMod4jType(String context, ServiceExpression exp){
        Mod4jType result = new Mod4jType("UNKNOWN", "UNKOWN");
        Symbol service = CrossxBroker.lookupSymbol(exp.getService().getModelName(), exp.getService().getModelName(), "Service");
        if( service == null ){
            // Error has been catched before
//            result.setError("ERROR: 5 service [" + exp.getService().getName() + "] does not exist");
            result.setError(" ");
            return result;
        }
//        Symbol serviceMethod = CrossxBroker.getSubSymbol(service, exp.getServiceMethod());
        Symbol serviceMethod = CrossxBroker.getSubSymbol(service, exp.getService().getName());
        if( serviceMethod == null ){
            result.setError("ERROR: 6 service method [" + exp.getService().getName() + "] does not exist");
            return result;
        }
        // found the service method.
        
        String methodType = CrossxBroker.getPropertyValue(serviceMethod, "methodType");
        if( methodType.equals("CustomMethod") ) {
            String inDto = CrossxBroker.getPropertyValue(serviceMethod, "in");
            if( ! inDto.equals(context ) ){
                result.setError("ERROR: 7 service method [" + exp.getService().getName() + "] has input [" + inDto + "] should be [" + context + "]");
                return result;
            }
            String outDto = CrossxBroker.getPropertyValue(serviceMethod, "out");
            String outCollection = CrossxBroker.getPropertyValue(serviceMethod, "outCollection");
            if( outDto == null ){
                result.setError("ERROR: 8 service method [" + exp.getService().getName() + "] has no output should be [" + context + "]");
                return result;
            }
            result.setBaseType(outDto);
            result.setCollection(outCollection);
            return result;
        } else if( methodType.equals("LISTALL") ) {
            String outDto = CrossxBroker.getPropertyValue(serviceMethod, "dto");
            result.setBaseType(outDto);
            result.setCollection("LIST");
            return result;
        } else if( methodType.equals("UPDATE") ) {
            String outDto = CrossxBroker.getPropertyValue(serviceMethod, "dto");
            String inDto = outDto;
            if( ! inDto.equals(context ) ){
                result.setError("ERROR: 7 service method [" + exp.getService().getName() + "] has input [" + inDto + "] should be [" + context + "]");
                return result;
            }
            result.setBaseType(outDto);
            result.setCollection("SINGLE");
            return result;
        } else if( methodType.equals("READ") ) {
            String outDto = CrossxBroker.getPropertyValue(serviceMethod, "dto");
            result.setBaseType(outDto);
            result.setCollection("SINGLE");
            return result;
        } else if( methodType.equals("Create") ) {
            String outDto = CrossxBroker.getPropertyValue(serviceMethod, "dto");
            result.setBaseType(outDto);
            result.setCollection("SINGLE");
            return result;
        } else if( methodType.equals("GETFROM") ) {
            String inDto = CrossxBroker.getPropertyValue(serviceMethod, "whole");
            if( ! inDto.equals(context ) ){
                result.setError("ERROR: 7 service method [" + exp.getService().getName() + "] has input [" + inDto + "] should be [" + context + "]");
                return result;
            }
            String outDto = CrossxBroker.getPropertyValue(serviceMethod, "part");
            String outCollection = CrossxBroker.getPropertyValue(serviceMethod, "outCollection");
            result.setBaseType(outDto);
            result.setCollection(outCollection);
            return result;
        }
        return result;
    }
        
    static public PresentationModel findModel(ModelElement elem){
        if( elem instanceof PresentationModel){
            return (PresentationModel)elem;
        } else {
            return findModel( (ModelElement)elem.eContainer());
        }
    }
    
    static public Dialogue referredDialogue(UICall call) {
        PresentationModel model = findModel(call);

        if( call instanceof DialogueCall){
            DialogueCall dcall = (DialogueCall)call;
            AbstractDialogue dialogue = dcall.getReferredDialogue();
            if( dialogue instanceof Dialogue){
                return (Dialogue)dialogue;
            } else {
                return null;
            }
        }

        EList<ModelElementWithContext> elements = model.getElements();
        for (ModelElementWithContext element : elements) {
            if( element instanceof Dialogue) {
                Dialogue result = (Dialogue)element;
                if( result.getName().equals(call.getName())){
                    return result;
                }
            }
        }
        return null;
    }

    static public UIModelElement referredUIModelElement(UICall call) {
        PresentationModel model = findModel(call);

        if( call instanceof ProcessCall){
            ProcessCall pcall = (ProcessCall)call;
            return pcall.getReferredProcess();
        }
        
        if( call instanceof DialogueCall){
            DialogueCall dcall = (DialogueCall)call;
            AbstractDialogue dialogue = dcall.getReferredDialogue();
            return dialogue;
        }
        EList<ModelElementWithContext> elements = model.getElements();
        for (ModelElementWithContext element : elements) {
            if( element instanceof UIModelElement) {
                UIModelElement result = (UIModelElement)element;
                if( result.getName().equals(call.getName())){
                    return result;
                }
            }
        }
        return null;
    }

    static public ContentForm referredContentForm(UICall call) {
        if( call instanceof DialogueCall){
            DialogueCall dcall = (DialogueCall)call;
            AbstractDialogue dialogue = dcall.getReferredDialogue();
            if( dialogue instanceof ContentForm){
                return (ContentForm)dialogue;
            } else {
                return null;
            }
        }

        PresentationModel model = findModel(call);
        EList<ModelElementWithContext> elements = model.getElements();
        for (ModelElementWithContext element : elements) {
            if( element instanceof ContentForm) {
                ContentForm result = (ContentForm)element;
                if( result.getName().equals(call.getName())){
                    return result;
                }
            }
        }
        return null;
    }

    static public CollectionDialogue referredCollectionDialogue(UICall call) {
        PresentationModel model = findModel(call);
        EList<ModelElementWithContext> elements = model.getElements();
        for (ModelElementWithContext element : elements) {
            if( element instanceof CollectionDialogue ) {
                CollectionDialogue result = (CollectionDialogue )element;
                if( result.getName().equals(call.getName())){
                    return result;
                }
            }
        }
        return null;
    }

    static public Process referredProcess(UICall call) {
        if( call instanceof ProcessCall){
            ProcessCall pcall = (ProcessCall)call;
            AbstractProcess process = pcall.getReferredProcess();
            if( process instanceof Process){
                return (Process)process;
            } else {
                return null;
            }
        }

        PresentationModel model = findModel(call);
        EList<ModelElementWithContext> elements = model.getElements();
        for (ModelElementWithContext element : elements ){
            if( element instanceof Process ) {
                Process result = (Process )element;
                if( result.getName().equals(call.getName())){
                    return result;
                }
            }
        }
        return null;
    }
    
    static public NavigationExpression getNavigationExpression(UICall uiCall){
        Expression link = uiCall.getContextExp();
        if( link instanceof NavigationExpression ){
            return (NavigationExpression) link;
        }
        return null;
    }

    static public OperationExpression getOperationExpression(UICall uiCall){
        Expression link = uiCall.getContextExp();
        if( link instanceof OperationExpression ){
            return (OperationExpression) link;
        }
        return null;
    }

    static public StandardExpression getStandardExpression(UICall uiCall){
        Expression link = uiCall.getContextExp();
        if( link instanceof StandardExpression ){
            return (StandardExpression) link;
        }
        return null;
    }

    /**
     * rETURNS THE LINKsERVICE IF THERE IS ONE, OTHHERWISE RETURNS NULL
     * @param call
     * @return
     */
    static public ServiceExpression getServiceExpression(UICall uiCall){
        Expression link = uiCall.getContextExp();
        if( link instanceof ServiceExpression){
            return (ServiceExpression) link;
        }
        return null;
    }
    
    static public String getResultType(String model, String dtoName, NavigationExpression nav){
        Mod4jType result = getMod4jType(model, dtoName, nav);
        if( result.hasError()){
            return result.getError();
        } else {
            return result.getBaseType();
        }
    }
        
    /**
     * Returns the result type of the navigation "nav starting with the Dto at "model.dtoName'
     * @param model
     * @param sourceDtoName
     * @param nav
     * @return
     */
    static public Mod4jType getMod4jType(String model, String sourceDtoName, NavigationExpression nav){
        Mod4jType result = new Mod4jType("UNKNOWN", "UNKNOW");
        
        if( nav == null) {
            return null;
        }
        EList<AssociationRoleReference> x = nav.getReferences(); // extra line to avoid incporrect error message of java compiler in Eclipse
        AssociationRoleReference ref = x.get(0);
        Symbol sourceDtoSymbol = CrossxBroker.lookupSymbol(model, sourceDtoName, "Dto");
        Symbol reference = CrossxBroker.getSubSymbol(sourceDtoSymbol, ref.getName());
        if( reference == null){
            result.setError("ERROR: 9 [" + ref.getName() + "] not found for [" + sourceDtoName + "]");
            return result;
        }
        
        if( reference.getType().equals("AssociationRoleReference") ){
            ReferenceSymbolProperty referredType = CrossxBroker.getReferenceProperty(reference, "ReferencedDto");
            Symbol returnType = CrossxBroker.lookupSymbol(referredType.getModelname(),
                          referredType.getSymbolname(), "Dto") ;
            result.setBaseType(returnType.getName());
            String multiplicity = CrossxBroker.getPropertyValue(reference, "multiplicity");
            result.setCollection( multiplicity.equals("MANY") ? "LIST" : "SINGLE") ;
            return result;
        }
        
        return result;
    }

    /**
     * Checks process p for 
     * ERROR 1: proces refers to non existing form
     * ERROR 2-4: type of referred form and context (through all, service or navigation) incorrect
     * @param p
     * @return
     */
    public static String checkProcess(Process p) {
        try{
            // check for 
            DtoReference context = findContext(p);
            if( (context == null) || (context.getName() == null) ) {
                return "ERROR: internal Mod4j error, cannot find context";
            }
            if( p.getProcessElements() == null ) {
                return "ERROR:  process has no elements";
            }
            for (UICall uicall : p.getProcessElements()) {
                String calledName;
                String contextName ;
                Boolean isCollectionContext ;
                if( uicall instanceof DialogueCall ) {
                    ContentForm form = referredContentForm(uicall);
                    if( form == null ){
                        // referred form cannot be found, but that is checked elsewhere
                        return "";   //"ERROR: 1 referred form [" + dialogueCall.getName() + "] not found";
                    }
                    calledName = form.getName();
                    contextName = form.getContextRef().getName();
                    isCollectionContext = form.isCollectionContext();
                } else if( uicall instanceof ProcessCall) {
                    Process process = referredProcess(uicall);
                    if( process == null ){
                        // referred process cannot be found, but that is checked elsewhere
                        return ""; // ERROR: 1 referred process [" + uicall.getName() + "] not found";
                    }
                    calledName = process.getName();
                    contextName = process.getContextRef().getName();
                    isCollectionContext = process.isCollectionContext();
                } else {
                    return "ERROR: Internal Mod4j error, UIcall is neither a process nor a form";
                }
                if( contextName == null ){
                    // referred form has incorrect context, stop checking 
                    return "ERROR: internal error, context name is null";
                }
    
                Mod4jType expectedType = new Mod4jType(contextName, (isCollectionContext ? "LIST" : "SINGLE"));
                if( uicall.getContextExp() == null ){
                    // check whether context of referred form is identical to that of the process
                    if( ! contextName.equals(context.getName())){
                        return "ERROR: 2 context of process and called dialogue/process [" + calledName + ":" + contextName + "]should be the same";
                    }
                } else {
                    NavigationExpression navExp = getNavigationExpression(uicall);
                    if( navExp != null ){
                        Mod4jType resultType = getMod4jType(context.getModelName(), context.getName(), navExp);
                        if( resultType.hasError()){
                            return resultType.getError();
                        }
                        if( ! expectedType.matches(resultType)){
                            return "ERROR: 3 type of navigation [" + resultType.toString() + 
                                  "] and called dialogue [" + expectedType.toString() + "] should be the same";
                        }
                    }
                    ServiceExpression serExp = getServiceExpression(uicall);
                    if( serExp != null ){
                        Mod4jType resultType = serviceCallMod4jType(context.getName(), serExp);
                        if( resultType.hasError() ){
                            return resultType.getError();
                        } else {
                            if( ! expectedType.matches(resultType) ){
                                return "ERROR: 4 type of service [" + resultType.toString() + 
                                "] and called dialogue [" + expectedType.toString() + "] should be the same";
                            }
                        }
    //                        String resultType = getResultType(context.getModelName(), context.getName(), navExp);
    //                        if( ! form.getContextRef().getName().equals(resultType)){
    //                            return "ERROR: context of navigation and called dialogue should be the same";
    //                        }
                    }
                    StandardExpression stdExp = getStandardExpression(uicall);
                    if( stdExp != null ){
    //                        String resultType = findContext(p).getName();
                        String resultType = standardExpressionResultType(context.getName(),
                                contextName, stdExp);
                        if( resultType.startsWith("ERROR:")){
                            return resultType;
                        } else {
                            Mod4jType result = new Mod4jType(resultType, "LIST");
                            if( ! expectedType.matches(result) ){
                                return "ERROR: 5 type of process [" + result.toString() + 
                                "] and called dialogue [" + expectedType.toString() + "] should be the same";
                            }
                        }
                    }
                }
            }
            return "";
        } catch(RuntimeException e){
            System.out.println("checkProcess Exception for Process [" + p.getName() + "]");
            throw e;
        }
    }

    public static String checkDialogueCall(DialogueCall dcall) {
        DtoReference context = null ;
        Process owner = dcall.getProcess();
        if( owner != null ){
            context = findContext(owner);
        }
        if( (context == null) || (context.getName() == null) ) {
            return "ERROR: internal Mod4j error 2, cannot find context";
        }
        ContentForm form = referredContentForm(dcall);
        if( form == null ){
            // referred process cannot be found, but that is checked elsewhere
            return ""; // ERROR: 1 referred process [" + uicall.getName() + "] not found";
        }
        String calledName = form.getName();
        String contextName = form.getContextRef().getName();
        Boolean isCollectionContext = form.isCollectionContext();
        if( contextName == null ){
            // referred form has incorrect context, stop checking 
            return "ERROR: internal error, context name is null";
        }
        return checkUICall(dcall, context, calledName, contextName, isCollectionContext);
    }
    public static String checkProcessCall(ProcessCall pcall) {
        try{
            DtoReference context = null ;
            // check for 
            Dialogue dia = pcall.getOwningDialogue();
            if( dia != null ){
                context = dia.getContextRef();
            }
            Process owner = pcall.getProcess();
            if( owner != null ){
                context = findContext(owner);
            }
            if( pcall.getOwningMenu() != null ){
                return "";  /// no checks for a process call in a menu
            }
            if( (context == null) || (context.getName() == null) ) {
                return "ERROR: internal Mod4j 003 error, cannot find context";
            }
            Process process = referredProcess(pcall);
            if( process == null ){
                // referred process cannot be found, but that is checked elsewhere
                return ""; // ERROR: 1 referred process [" + uicall.getName() + "] not found";
            }
            
            String calledName = process.getName();
            String contextName = process.getContextRef().getName();
            Boolean isCollectionContext = process.isCollectionContext();
            if( contextName == null ){
                // referred form has incorrect context, stop checking 
                return "ERROR: internal error, context name is null";
            }

            return checkUICall(pcall, context, calledName, contextName, isCollectionContext);
        } catch(RuntimeException e){
            System.out.println("checkProcess Exception for ProcessCall [" + pcall.getReferredProcess().getName() + "]");
            throw e;
        }
    }

    /**
     * @param pcall
     * @param context
     * @param calledName
     * @param contextName
     * @param isCollectionContext
     */
    private static String checkUICall(UICall pcall, DtoReference context, String calledName, String contextName,
            Boolean isCollectionContext) {
        Mod4jType expectedType = new Mod4jType(contextName, (isCollectionContext ? "LIST" : "SINGLE"));
        if( pcall.getContextExp() == null ){
            // check whether context of referred form is identical to that of the process
            if( ! contextName.equals(context.getName())){
                return "ERROR: 2 context of process and called process [" + calledName + ":" + contextName + "]should be the same";
            }
        } else {
            NavigationExpression navExp = getNavigationExpression(pcall);
            if( navExp != null ){
                Mod4jType resultType = getMod4jType(context.getModelName(), context.getName(), navExp);
                if( resultType.hasError()){
                    return resultType.getError();
                }
                if( ! expectedType.matches(resultType)){
                    return "ERROR: 3 type of navigation [" + resultType.toString() + 
                          "] and called dialogue [" + expectedType.toString() + "] should be the same";
                }
            }
            ServiceExpression serExp = getServiceExpression(pcall);
            if( (serExp != null) && (serExp.getService() != null)  ){
                Mod4jType resultType = serviceCallMod4jType(context.getName(), serExp);
                if( resultType.hasError() ){
                    return resultType.getError();
                } else {
                    if( ! expectedType.matches(resultType) ){
                        return "ERROR: 4 type of service [" + resultType.toString() + 
                        "] and called process [" + expectedType.toString() + "] should be the same";
                    }
                }
//                        String resultType = getResultType(context.getModelName(), context.getName(), navExp);
//                        if( ! form.getContextRef().getName().equals(resultType)){
//                            return "ERROR: context of navigation and called dialogue should be the same";
//                        }
            }
            StandardExpression stdExp = getStandardExpression(pcall);
            if( stdExp != null ){
//                        String resultType = findContext(p).getName();
                String resultType = standardExpressionResultType(context.getName(),
                        contextName, stdExp);
                if( resultType.startsWith("ERROR:")){
                    return resultType;
                } else {
                    Mod4jType result = new Mod4jType(resultType, "LIST");
                    if( ! expectedType.matches(result) ){
                        return "ERROR: 5 type of process [" + result.toString() + 
                        "] and called dialogue [" + expectedType.toString() + "] should be the same";
                    }
                }
            }
        }
        return "";
    }

    /** Find the context for a process
     * 
     * @param p
     * @return
     */
    private static DtoReference findContext(Process p) {
        if( p.getContextRef() != null ){
            return p.getContextRef() ;
        } else if( p.getContentForm() != null ){
            return p.getContentForm().getContextRef() ;
        } else {
            return null;
        }
    }
}
