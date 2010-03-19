package org.mod4j.dsl.presentation.validation;

import java.util.List;

import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;


public class ValidationUtils {

    /*
     * 
     *
String findSpecialMethodInService(String dtoName, String methodType, Symbol service) :
    service.findAllSubSymbols("ServiceMethod").
    select( method | method.getPropertyValue("methodType").endsWith(methodType) && method.getPropertyValue("dto").endsWith(dtoName)).first().name;
    
// returns the symbol of the special method of "methodType" for the referred DTO 
// TODO: should only look in the current project, but this p[roject cannot be found
Symbol findServiceMethod(UICall self, String dtoName, String methodType) :
//    findAllSymbols(getProjectForEObject(self), "Service").select( s | findSpecialMethodInService(dtoName, methodType, s) != null ).first();
    findAllModels().modelname.findAllFromModel("Service").select( s | findSpecialMethodInService(dtoName, methodType, s) != null ).first();

     */
    public static Symbol lookupServiceMethod(UICall element, String dtoName, String methodType){
        for (ModelInfo  model : CrossxBroker.findAllModels()) {
            List<Symbol> serviceSymbols = CrossxBroker.findAllFromModel(model.getModelname(), "Service");   
            for (Symbol symbol : serviceSymbols) {
                for( Symbol method : CrossxBroker.findAllSubSymbols(symbol, "ServiceMethod") ){
                    String type = CrossxBroker.getPropertyValue(method, "methodType");
                    if( type.equals(methodType) ){
                        if( CrossxBroker.getPropertyValue(method, "dto").equals(dtoName) ){
                            return method;
                        }
                    }
                }
            }
        }
        return null;
    }
}
