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
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Process;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall;

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
        Symbol service = CrossxBroker.lookupSymbol(exp.getServiceName(), exp.getServiceName(), "Service");
        if( service == null ){
            return "ERROR: service [" + exp.getServiceName() + "] does not exist";
        }
        Symbol serviceMethod = CrossxBroker.getSubSymbol(service, exp.getServiceMethod());
        if( serviceMethod == null ){
            return "ERROR: service method [" + exp.getServiceMethod() + "] does not exist";
        }
        // found the service method.
        
        String methodType = CrossxBroker.getPropertyValue(serviceMethod, "type");
        if( methodType == "CustomMethod" ) {
            String inDto = CrossxBroker.getPropertyValue(serviceMethod, "in");
            if( inDto != context ){
                return "ERROR: service method [" + exp.getServiceMethod() + "] has input [" + inDto + "] should be [" + context + "]";
            }
            String outDto = CrossxBroker.getPropertyValue(serviceMethod, "out");
            if( outDto == null ){
                return "ERROR: service method [" + exp.getServiceMethod() + "] has no output should be [" + context + "]";
            }
            return outDto;
        }
        return "UNKNOWN";
    }
    
    static public ContentForm referredContentForm(UICall call) {
        UIModelElement container = null;
        if( call instanceof DialogueCall ) {
            DialogueCall dcall = (DialogueCall)call;
            container = (dcall.getCompoundDialogue() != null ? dcall.getCompoundDialogue() : dcall.getProcess() );
        } else {
            container = call.getProcess();
        }
        if( container == null ) {
            return null;
        }
        EList<ModelElementWithContext> elements = container.getPresentationModel().getElements();
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
        Process process = call.getProcess();
        if( process == null ) {
            return null;
        }
        EList<ModelElementWithContext> elements = process.getPresentationModel().getElements();
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
        Dialogue dia = call.getOwningDialogue();
        if( dia == null ) {
            return null;
        }
        EList<ModelElementWithContext> elements = dia.getPresentationModel().getElements();
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
            Expression link = uiCall.getContext();
            if( link instanceof NavigationExpression ){
                return (NavigationExpression) link;
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
            Expression link = linkedCall.getContext();
            if( link instanceof ServiceExpression){
                return (ServiceExpression) link;
            }
        }
        return null;
    }
    
    /**
     * Returns the result type of the navigation "nav starting with the Dto at "model.dtoName'
     * @param model
     * @param dtoName
     * @param nav
     * @return
     */
    static public String getResultType(String model, String dtoName, NavigationExpression nav){
        String result= null;
        
        EList<AssociationRoleReference> x = nav.getReferences(); // extra line to avoid incporrect error message of java compiler in Eclipse
        AssociationRoleReference ref = x.get(0);
        System.err.println("MOD4J GETRESULT NAV [" + ref.getName() + "]" );
        Symbol dto = CrossxBroker.lookupSymbol(model, dtoName, "Dto");
        System.err.println("MOD4J GETRESULT DTO [" + dto.getName() + "]" );
        Symbol reference = CrossxBroker.getSubSymbol(dto, ref.getName());
        if( reference == null){
            return null;
        }
        System.err.println("MOD4J GETRESULT REF [" + reference.getName() + "]" );
        
        if( reference.getType().equals("AssociationRoleReference") ){
            ReferenceSymbolProperty referredType = CrossxBroker.getReferenceProperty(reference, "ReferencedDto");
            System.err.println("MOD4J GETRESULT referredType [" + referredType.getName() + "] + model [" + referredType.getModelname() + "] symbolname [" + referredType.getSymbolname() + "]");
          Symbol returnType = CrossxBroker.lookupSymbol(referredType.getModelname(),
                          referredType.getSymbolname(), "Dto") ;
//            Symbol returnType = CrossxBroker.lookupReference(referredType);
//            System.err.println("MOD4J GETRESULT return type [" + returnType.getName() + "]" );

            return CrossxBroker.getPropertyValue(returnType, "baseDto");
        }
        
        return result;
    }

//    static public String invariantNavigationCorrect(SimpleProcess p) {
//        if( )
//        
//        return "";
//    }
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
}
