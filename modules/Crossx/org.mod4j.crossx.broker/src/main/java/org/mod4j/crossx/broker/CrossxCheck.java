/*******************************************************************************
 * Copyright (c) 2008 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package org.mod4j.crossx.broker;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.mod4j.crossx.mm.crossx.LiteralSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.crossx.mm.crossx.SymbolProperty;;

public class CrossxCheck {

    /**
     * @param classname
     * @return Returns true of a BusinessClass with the name path exists in any model in the workspace
     */
    public static Symbol lookup(String model, String symbolname, String type){
        System.err.println("Lookup model [" + model + "] symbol ["+ symbolname + "]");
        return CrossxEnvironment.lookup(model, symbolname, type) ;
    }

    public static List<String> findAllFromModel(String modelname, String elemType){
        return CrossxEnvironment.findAllFromModel(modelname, elemType);
    }

    public static List<String> findAllFromModel(String project, String modelname, String elemType){ 
        return CrossxEnvironment.findAllFromModelInProject(project, modelname, elemType);
    }

    
    public static List<String> findAllModels(){
        return CrossxEnvironment.findAllModels();
    }
    public static List<String> findAllModelsInProject(String project){
        return CrossxEnvironment.findAllModelsInProject(project);
    }
    /**
     * @param classname
     * @return Returns true of a BusinessClass with the name path exists in any model in the workspace
     */
    public static Symbol lookupWithProperty(String model, String symbolname, String type, 
                                            String propertyName, String propertyValue){
        Symbol symbol = CrossxEnvironment.lookup(model, symbolname, type) ;
        if( hasProperty(symbol, propertyName, propertyValue)){
            return symbol;
        }
        return null;
    }

    /**
     * @param classname
     * @return Returns true of a BusinessClass with the name path exists in any model in the workspace
     */
    public static boolean hasProperty(Symbol symbol, String propertyName, String propertyValue){
        for( SymbolProperty property : symbol.getProperties()) {
            if( property instanceof LiteralSymbolProperty ) {
                LiteralSymbolProperty l = (LiteralSymbolProperty)property;
                if(  l.getName().equals(propertyName) && l.getValue().equals(propertyValue))
                    return true;
            }
        }
        return false;
    }

    /** This does the same as classExists, need a way to not do this twice
     *   Returns the name of the resource in which the BusinessClass path is defined.
     */
//    public static String definedInResource(String model, String classname){
//    	String result = CrossxEnvironment.find(model, classname, "BusinessClass") ;
//    	return result ;
//    }
    
    /**
     * Find all symbols of type 'symboltype' in project 'project'
     * @param project
     * @param symboltype
     * @return
     */
    public static List<String> lookupAll(String project, String symboltype) {
        List<String> result = new ArrayList<String>();
        List<String> tmp = CrossxEnvironment.findAll(project, symboltype);
        if (tmp != null) {
            System.err.println("CROSSX lookup all "+ symboltype + " [" + tmp.toString() + "]");
            result.addAll(tmp);
        } else {
            System.err.println("CROSSX HELPER FINDALL NULL");
        }
        return result;
    }
}