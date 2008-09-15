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

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.Symbol;

// import crossx.util.EclipseUtil;

/** This class is a singleton with static members only.
 *  It keeps all cross reference information for DSL models 
 * 
 * @author Jos Warmer
 *
 */
public class CrossxEnvironment {

	static private Map<String, CrossxLocation> environment = new HashMap<String, CrossxLocation>();
	
	public static Map<String, CrossxLocation> getAll() {
        return Collections.unmodifiableMap(environment);
    }
	
	public static void addModelInfo(String location, ModelInfo modelinfo) {
        print("CrossxEnvironment::AddModelInfo [" + location + "]");
		CrossxLocation atLocation = findLocation(location);
		atLocation.addModelInfo(modelinfo);
	}

	/** Find the CrossxLocation named 'location' or create a new one if it does not exist.
	 * 
	 * @param location
	 * @return
	 */
	private static CrossxLocation findLocation(String location) {
		CrossxLocation result = environment.get(location);
		if( result == null ) {
			result = new CrossxLocation(location);
			if( pr != null ) {
				result.setPrintWriter(pr);
			}
			environment.put(location, result);
		}
		return result;
	}	

    /** Find the symbol with name 'name' and type 'type'.
     * 
     * @param name
     * @param elemType
     * @return The name of the resource if the element is found, null if it isn't found
     */
    static public String find(String model, String name, String elemType) {
        for(CrossxLocation location: environment.values()){
            String result = location.find(model, name, elemType);
            if( result != null ){
                return result;
            }
        }
        return null;
    }

    /** Find the symbol with name 'name' and type 'type'.
     * 
     * @param name
     * @param elemType
     * @return The name of the resource if the element is found, null if it isn't found
     */
    static public Symbol lookup(String model, String name, String elemType) {
        if( environment == null ) {
            System.err.println("CrossxEnvironment::find environment = null");
        }
        for(CrossxLocation location: environment.values()){
            Symbol result = location.lookup(model, name, elemType);
            if( result != null ){
                return result;
            }
        }
        return null;
    }

	/**  Find all symbols of type 'elemType'.
	 * 
	 * @param elemType
	 * @return The list of names (String) of all found symbols. If there is no such symbol, an empty list.
	 */
    static public List<String> findAll(String projectLocation, String elemType) {
       print("CrossxEnvironment::findAll [" + projectLocation + "]");
         CrossxLocation loc = environment.get(projectLocation);
        if( loc != null ){
            return loc.findAll(elemType);
        } else {
            return new ArrayList<String>();
        }
    }

    static public List<String> findAllEverywhere(String elemType) {
        List<String> result = new ArrayList<String>();
        for(CrossxLocation location: environment.values()){
            result.addAll( location.findAll(elemType) );
        }
        return result;
    }
	
	static private PrintWriter pr = null;
	
	static public void setPrintStream(OutputStream s) {
		pr = new PrintWriter(s);
		for(CrossxLocation loc : environment.values()) {
			loc.setPrintWriter(pr);
		}
	}

	/** Print to the error output or the given printstream
	 * 
	 * @param text
	 */
	private static void print(String text){
		if( pr == null ) { 
			System.err.println(text);
		} else {
    		pr.println(text);
    		pr.flush();
		}
	}
}
