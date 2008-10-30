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

import org.mod4j.crossx.mm.crossx.LiteralSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.crossx.mm.crossx.SymbolProperty;

/**
 * This class contains all operations that are needed in the oAW xTend, xPand and Checks files. Therefore all methods
 * need to be static.
 * 
 * @author jwa11799
 * 
 */
public class CrossxCheck {

    /**
     * Private constructor, this class contains static members only.
     */
    private CrossxCheck() {
    }

    /**
     * Lookup a symbol in a model of a certain type
     * 
     * @param model
     *            The model in which to look for the symbol
     * @param symbolname
     *            The name of the symbol to find
     * @param type
     *            The type of the symbol to find
     * @return the symbol found, or null if no such symbol could be found
     */
    public static Symbol lookupSymbol(String model, String symbolname, String type) {
        return CrossxEnvironment.lookupSymbol(model, symbolname, type);
    }

    /**
     * Find all symbol names with type 'elemType' within models named 'modelname'
     * 
     * @param modelname
     * @param elemType
     * @return
     */
    public static List<String> findAllFromModel(String modelname, String elemType) {
        return CrossxEnvironment.findAllFromModel(modelname, elemType);
    }

    public static List<String> lookupSymbolNames(String modelname, String elemType) {
        return CrossxEnvironment.findAllFromModel(modelname, elemType);
    }

    /**
     * Find all symbol names with type 'elemType' within models named 'modelname' and within the project named 'project'
     * 
     * @param project
     * @param modelname
     * @param elemType
     * @return
     */
    public static List<String> findAllFromModel(String project, String modelname, String elemType) {
        return CrossxEnvironment.findAllFromModelInProject(project, modelname, elemType);
    }

    public static List<String> lookupSymbolNames(String project, String modelname, String elemType) {
        return CrossxEnvironment.findAllFromModelInProject(project, modelname, elemType);
    }

    /**
     * Find all models within the workspace
     * 
     * @return
     */
    public static List<String> findAllModels() {
        return CrossxEnvironment.findAllModels();
    }

    // public static List<String> lookupModelNames() {
    // return CrossxEnvironment.findAllModels();
    // }

    /**
     * Find all models within project with name 'project'
     * 
     * @param project
     * @return
     */
    public static List<String> findAllModelsInProject(String project) {
        return CrossxEnvironment.findAllModelsInProject(project);
    }

    // public static List<String> lookupModelNames(String project) {
    // return CrossxEnvironment.findAllModelsInProject(project);
    // }

    /**
      */
    public static Symbol lookupSymbolWithProperty(String model, String symbolname, String type, String propertyName,
            String propertyValue) {
        Symbol symbol = CrossxEnvironment.lookupSymbol(model, symbolname, type);
        if (hasProperty(symbol, propertyName, propertyValue)) {
            return symbol;
        }
        return null;
    }

    public static Symbol lookupSymbolWithSubsymbol(String model, String symbolname, String symboltype,
            String subsymbolType, String subsymbolName) {
        Symbol symbol = CrossxEnvironment.lookupSymbol(model, symbolname, symboltype);
        if (symbol == null) {
            return null;
        }
        for (Symbol subsym : symbol.getSubSymbols()) {
            if (subsym.getType().equals(subsymbolType) && subsym.getName().equals(subsymbolName)) {
                return symbol;
            }
        }
        return null;
    }

    /**
     * @param classname
     * @return Returns true of a BusinessClass with the name path exists in any model in the workspace
     */
    public static boolean hasProperty(Symbol symbol, String propertyName, String propertyValue) {
        for (SymbolProperty property : symbol.getProperties()) {
            if (property instanceof LiteralSymbolProperty) {
                LiteralSymbolProperty l = (LiteralSymbolProperty) property;
                if (l.getName().equals(propertyName) && l.getValue().equals(propertyValue))
                    return true;
            }
        }
        return false;
    }

    static public String getPropertyValue(Symbol symbol, String propertyName) {
        for (SymbolProperty prop : symbol.getProperties()) {
            if (prop.getName().equals(propertyName)) {
                if (prop instanceof LiteralSymbolProperty) {
                    return ((LiteralSymbolProperty) prop).getValue();
                }
            }
        }
        return null;
    }

    static public List<Symbol> findAllSubSymbols(Symbol symbol, String symbolType) {
        List<Symbol> result = new ArrayList<Symbol>();
        for (Symbol sub : symbol.getSubSymbols()) {
            System.err.println("     sub [" + sub.getName() + "] type [" + sub.getType() + "]");
            if (sub.getType().equals(symbolType)) {
                result.add(sub);
            }
        }
        return result;
    }

    /**
     * Find all symbols of type 'symboltype' in project 'project'
     * 
     * @param project
     * @param symboltype
     * @return
     */
    public static List<String>  lookupAll(String project, String symboltype) {
        List<String> result = new ArrayList<String>(); 
        List<String> tmp = CrossxEnvironment.findAll(project, symboltype);
        if (tmp != null) {
            System.err.println("CrossxCheck lookup all " + symboltype + " [" + tmp.toString() + "]");
            result.addAll(tmp);
        } else {
            System.err.println("CrossxCheck lookup all returns null");
        }
        return result;
    }
}