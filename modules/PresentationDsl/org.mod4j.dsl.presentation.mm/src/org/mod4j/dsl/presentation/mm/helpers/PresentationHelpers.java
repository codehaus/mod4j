package org.mod4j.dsl.presentation.mm.helpers;

import java.util.List;

//import org.mod4j.crossx.broker.CrossxEnvironment;
//import org.mod4j.crossx.mm.crossx.Symbol;
import org.eclipse.emf.common.util.EList;
import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Process;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall;
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
        Mod4jType result = new Mod4jType("UNKNOWN", "UNNOWN");
        Symbol service = CrossxBroker.lookupSymbol(exp.getServiceName(), exp.getServiceName(), "Service");
        if( service == null ){
            result.setError("ERROR: 5 service [" + exp.getServiceName() + "] does not exist");
            return result;
        }
        Symbol serviceMethod = CrossxBroker.getSubSymbol(service, exp.getServiceMethod());
        if( serviceMethod == null ){
            result.setError("ERROR: 6 service method [" + exp.getServiceMethod() + "] does not exist");
            return result;
        }
        // found the service method.
        
        String methodType = CrossxBroker.getPropertyValue(serviceMethod, "methodType");
        if( methodType.equals("CustomMethod") ) {
            String inDto = CrossxBroker.getPropertyValue(serviceMethod, "in");
            if( ! inDto.equals(context ) ){
                result.setError("ERROR: 7 service method [" + exp.getServiceMethod() + "] has input [" + inDto + "] should be [" + context + "]");
                return result;
            }
            String outDto = CrossxBroker.getPropertyValue(serviceMethod, "out");
            String outCollection = CrossxBroker.getPropertyValue(serviceMethod, "outCollection");
            if( outDto == null ){
                result.setError("ERROR: 8 service method [" + exp.getServiceMethod() + "] has no output should be [" + context + "]");
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
                result.setError("ERROR: 7 service method [" + exp.getServiceMethod() + "] has input [" + inDto + "] should be [" + context + "]");
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
                result.setError("ERROR: 7 service method [" + exp.getServiceMethod() + "] has input [" + inDto + "] should be [" + context + "]");
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
        
    private static PresentationModel findModel(ModelElement elem){
        if( elem instanceof PresentationModel){
            return (PresentationModel)elem;
        } else {
            return findModel( (ModelElement)elem.eContainer());
        }
    }
    
    static public Dialogue referredDialogue(UICall call) {
        PresentationModel model = findModel(call);

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

    static public ContentForm referredContentForm(UICall call) {
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

    static public Process referredProcess(ProcessCall call) {
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
    
    static public NavigationExpression getNavigationExpression(UICall call){
        if( call instanceof UIModelElementCall){
            UIModelElementCall uiCall = (UIModelElementCall)call;
            Expression link = uiCall.getContextExp();
            if( link instanceof NavigationExpression ){
                return (NavigationExpression) link;
            }
        }
        return null;
    }

    static public StandardExpression getStandardExpression(UICall call){
        if( call instanceof UIModelElementCall){
            UIModelElementCall uiCall = (UIModelElementCall)call;
            Expression link = uiCall.getContextExp();
            if( link instanceof StandardExpression ){
                return (StandardExpression) link;
            }
        }
        return null;
    }

    /**
     * rETURNS THE LINKsERVICE IF THERE IS ONE, OTHHERWISE RETURNS NULL
     * @param call
     * @return
     */
    static public ServiceExpression getServiceExpression(UICall call){
        if( call instanceof UIModelElementCall){
            UIModelElementCall linkedCall = (UIModelElementCall)call;
            Expression link = linkedCall.getContextExp();
            if( link instanceof ServiceExpression){
                return (ServiceExpression) link;
            }
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
     * @param dtoName
     * @param nav
     * @return
     */
    static public Mod4jType getMod4jType(String model, String dtoName, NavigationExpression nav){
        Mod4jType result = new Mod4jType("UNKNOWN", "UNKNOW");
        
        if( nav == null) {
            return null;
        }
        EList<AssociationRoleReference> x = nav.getReferences(); // extra line to avoid incporrect error message of java compiler in Eclipse
        AssociationRoleReference ref = x.get(0);
        Symbol dto = CrossxBroker.lookupSymbol(model, dtoName, "Dto");
        Symbol reference = CrossxBroker.getSubSymbol(dto, ref.getName());
        if( reference == null){
            result.setError("ERROR: 9 [" + ref.getName() + "] not found for [" + dtoName + "]");
            return result;
        }
        
        if( reference.getType().equals("AssociationRoleReference") ){
            ReferenceSymbolProperty referredType = CrossxBroker.getReferenceProperty(reference, "ReferencedDto");
            Symbol returnType = CrossxBroker.lookupSymbol(referredType.getModelname(),
                          referredType.getSymbolname(), "Dto") ;
            if( CrossxBroker.getPropertyValue(returnType, "dtoType" ).equals("ListDto") ){
                String baseType = CrossxBroker.getPropertyValue(returnType, "baseDto");
                result.setBaseType(baseType);
                result.setCollection("LIST" );
                return result;
            } else {
                result.setBaseType(returnType.getName());
                result.setCollection("SINGLE");
                return result;
            }
        }
        
        return result;
    }

    static public boolean refOk(String model, String dtoName, NavigationExpression nav){
        String result= null;
        
        EList<AssociationRoleReference> x = nav.getReferences(); // extra line to avoid incporrect error message of java compiler in Eclipse
        AssociationRoleReference ref = x.get(0);
        System.err.println("MOD4J REFOK NAV [" + ref.getName() + "]" );
        Symbol dto = CrossxBroker.lookupSymbol(model, dtoName, "Dto");
        System.err.println("MOD4J REFOK DTO [" + dto.getName() + "]" );
        Symbol reference = CrossxBroker.getSubSymbol(dto, ref.getName());
        if( reference == null){
            return false;
        } else {
            return true;
        }
    }

    public static String checkProcessCall(ProcessCall call) {
        Process process = referredProcess(call);
        if( process == null ){
            return "";  //  error handled elsewhere
        }
        ExternalReference context = findContext(process);
        
        
        
        return "";
    }
    /**
     * Checks process p for 
     * ERROR 1: proces refers to non existing form
     * ERROR 2-4: type of referred form and context (through all, service or navigation) incorrect
     * @param p
     * @return
     */
    public static String checkProcess(Process p) {
        // check for 
        ExternalReference context = findContext(p);
        if( p.getProcessElements() == null ) {
            return null;
        }
        for (UICall uicall : p.getProcessElements()) {
            if( uicall instanceof DialogueCall ) {
                ContentForm form = referredContentForm(uicall);
                DialogueCall dialogueCall = (DialogueCall)uicall;
                if( form == null ){
                    // referred form cannot be found, but that is checked elsewhere
                    return "ERROR: 1 referred form [" + dialogueCall.getName() + "] not found";
                }
                Mod4jType expectedType = new Mod4jType(form.getContextRef().getName(), (form.isCollectionContext() ? "LIST" : "SINGLE"));
                if( dialogueCall.getContextExp() == null ){
                    // check whether context of referred form is identical to that of the process
                    if( ! form.getContextRef().getName().equals(context.getName())){
                        return "ERROR: 2 context of process and called dialogue should be the same";
                    }
                } else {
                    // dialogueCall.getContextExp() != null 
                    NavigationExpression navExp = getNavigationExpression(dialogueCall);
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
                    ServiceExpression serExp = getServiceExpression(dialogueCall);
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
                    StandardExpression stdExp = getStandardExpression(dialogueCall);
                    if( stdExp != null ){
                        String resultType = findContext(p).getName();
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
        }
        return null;
    }

    /** Find the context for a process
     * 
     * @param p
     * @return
     */
    private static ExternalReference findContext(Process p) {
        if( p.getContextRef()!= null ){
            return p.getContextRef() ;
        } else {
            return p.getContentForm().getContextRef() ;
        }
    }
}
