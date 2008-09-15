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

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.crossx.mm.crossx.ModelInfo;

// import crossx.util.EclipseUtil;

/** This class is a singleton with static members only.
 *  It keeps all cross reference information for DSL models 
 * 
 * @author Jos Warmer
 *
 */
public class CrossxLocation {

	private List<ModelInfo> information = new ArrayList<ModelInfo>();
	private String name;
	
	public CrossxLocation(String theName) {
	    this.name = theName;
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ModelInfo> getAll() {
	    return Collections.unmodifiableList(information);
	}

	public void addModelInfo(ModelInfo modelinfo) {
		ModelInfo existing = findModelInfo(modelinfo, information);
		if( existing != null ) {
			information.remove(existing);
			print("XXXX Removing " + modelinfo.getResource());
		}
		information.add(modelinfo);
		print("XXXX Adding " + modelinfo.getResource());
	}

	private ModelInfo findModelInfo(ModelInfo modelinfo, List<ModelInfo> modelInfoList) {
		for(ModelInfo existing: modelInfoList){
			if( modelinfo.getResource().equals( existing.getResource())){
				return existing;
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
	public String find(String model, String name, String elemType) {
		for(ModelInfo modelinfo : information){
			if( modelinfo.getModelname().equals(model) ){
				for(Symbol symbol : modelinfo.getSymbols()){
					if( symbol.getName().equals(name) && 
						symbol.getType().equals(elemType) )
					{
						return modelinfo.getResource();
					}
				}
			}
		}
		return null;
	}

	/**  Find all symbols of type 'elemType'.
	 * 
	 * @param elemType
	 * @return The list of names (String) of all found symbols. If there is no such symbol, an empty list.
	 */
	public List<String> findAll(String elemType) {
		List<String> result = new ArrayList<String>();
		for(ModelInfo modelinfo : information){
			for(Symbol symbol : modelinfo.getSymbols()){
				String value = symbol.getType();
				if( (value != null) && value.equals(elemType) )
				{
					result.add(symbol.getName());
				} else {
				}
			}
		}
		return result;
	}
	
	private PrintWriter pr = null;
	
	public void setPrintWriter(PrintWriter pw) {
		pr = pw;
	}

	/** Print to the error output or the given printstream
	 * 
	 * @param text
	 */
	private void print(String text){
		if( pr == null ) { 
			System.err.println(text);
		} else {
    		pr.println(text);
    		pr.flush();
		}
	}
}
