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
import org.mod4j.dsl.presentation.mm.PresentationDsl.Action;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;
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

    static public String standardExpressionResultType(StandardExpression exp){
        Mod4jType result = standardExpressionMod4jType(exp);
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
    private static Mod4jType standardExpressionMod4jType(StandardExpression exp) {
        Mod4jType result = new Mod4jType("UNKNOWN", "UNNOWN");
        if( exp.getType() == ExpressionType.ALL ){
            result.setBaseType(exp.getContextRef().getName());
            result.setCollection("LIST");
        } else if( exp.getType() == ExpressionType.FIND){
            result.setBaseType(exp.getContextRef().getName());
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
    
    
    static public NavigationExpression getNavigationExpression(Action a){
        Expression link = a.getContextExp();
        if( link instanceof NavigationExpression ){
            return (NavigationExpression) link;
        }
        return null;
    }

    static public OperationExpression getOperationExpression(Action uiCall){
        Expression link = uiCall.getContextExp();
        if( link instanceof OperationExpression ){
            return (OperationExpression) link;
        }
        return null;
    }

    static public StandardExpression getStandardExpression(Action uiCall){
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
    static public ServiceExpression getServiceExpression(Action uiCall){
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
        
    static public Mod4jType getMod4jType(Action a){
    	switch( a.getType()) {
		case EDIT   : 
		case NEW    : return new Mod4jType(a.getContextRef().getName(), "SINGLE") ;
		case ADDTO  : return new Mod4jType(a.getContextRef().getName(), "LIST") ;
		case CUSTOM : 
			if( a.isCollectionContext() ){
				return new Mod4jType(a.getContextRef().getName(), "LIST") ;
			} else {
				return new Mod4jType(a.getContextRef().getName(), "SINGLE") ;
			}
		default     : return new Mod4jType();
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
        Mod4jType result = new Mod4jType("UNKNOWN", "UNKNOWN");
        
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
    public static String checkAction(Action a) {
        try{
            // check for 
            DtoReference sourceContext = a.getContextRef();
            if( (sourceContext == null) || (sourceContext.getName() == null) ) {
                return "ERROR: internal Mod4j error, cannot find context for action";
            }
            if( a.getNextPage() == null) {
            	return "";
            }
            AbstractDialogue form = a.getNextPage().getDialogue();
            if( form == null ){
                // referred form cannot be found, but that is checked elsewhere
                return "";   //"ERROR: 1 referred form [" + dialogueCall.getName() + "] not found";
            }
            // NOW WE REALLY START
            String targetContextName = form.getContextRef().getName();
            Boolean isCollectionContext = form.isCollectionContext();

            if( targetContextName == null ){
                // referred form has incorrect context, stop checking 
                return "ERROR: internal error, context name is null";
            }
            Mod4jType expectedType = new Mod4jType(targetContextName, (isCollectionContext ? "LIST" : "SINGLE"));

            if( a.getContextExp() == null ){
            	if( a.getType() == ProcessType.CUSTOM){
            		return "";
            	}
                Mod4jType actionType = getMod4jType(a);
                // check whether context of referred form is identical to that of the process
                if( !actionType.matches(expectedType) ){
                    return "ERROR: 2 context of action [" + actionType.toString() + "] and called page [" + expectedType.toString()+ "] should be the same";
                }
            } else {
                NavigationExpression navExp = getNavigationExpression(a);
                if( navExp != null ){
                    Mod4jType resultType = getMod4jType(sourceContext.getModelName(), sourceContext.getName(), navExp);
                    if( resultType.hasError()){
                        return resultType.getError();
                    }
                    if( a.getType() == ProcessType.LINK ){
                    	resultType.setCollection("LIST");
                    }
                    if( ! expectedType.matches(resultType)){
                        return "ERROR: 3 type of navigation [" + resultType.toString() + 
                              "] and called page [" + expectedType.toString() + "] should be the same";
                    }
                }
                ServiceExpression serExp = getServiceExpression(a);
//                if( serExp != null ){
//                    Mod4jType resultType = serviceCallMod4jType(context.getName(), serExp);
//                    if( resultType.hasError() ){
//                        return resultType.getError();
//                    } else {
//                        if( ! expectedType.matches(resultType) ){
//                            return "ERROR: 4 type of service [" + resultType.toString() + 
//                            "] and called dialogue [" + expectedType.toString() + "] should be the same";
//                        }
//                    }
////                        String resultType = getResultType(context.getModelName(), context.getName(), navExp);
////                        if( ! form.getContextRef().getName().equals(resultType)){
////                            return "ERROR: context of navigation and called dialogue should be the same";
////                        }
//                }
                StandardExpression stdExp = getStandardExpression(a);
                if( stdExp != null ){
                	Mod4jType resultType = standardExpressionMod4jType(stdExp);
                    if( resultType.hasError()){
                        return resultType.getError();
                    } else {
                        if( ! expectedType.matches(resultType) ){
                            return "ERROR: 5 type of process [" + resultType.toString() + 
                            "] and called page [" + expectedType.toString() + "] should be the same";
                        }
                    }
                }
            }
            return "";
        } catch(RuntimeException e){
            System.out.println("checkProcess Exception for Action [" + a.getName() + "]");
            throw e;
        }
    }


    /** Find the context for a process
     * 
     * @param p
     * @return
     */
    private static DtoReference findContext(Action p) {
        if( p.getContextRef() != null ){
            return p.getContextRef() ;
        } else if( p.getView() != null ){
            return p.getView().getContextRef() ;
        } else {
            return null;
        }
    }
}
