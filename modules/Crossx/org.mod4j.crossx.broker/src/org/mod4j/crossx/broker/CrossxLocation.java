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
import java.util.List;

import org.mod4j.crossx.mm.crossx.Element;
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

	public void addModelInfo(ModelInfo modelinfo) {
		ModelInfo existing = findModelInfo(modelinfo, information);
		if( existing != null ) {
			information.remove(existing);
			print("XXXX Removing " + modelinfo.getModel().getResource());
		}
		information.add(modelinfo);
		print("XXXX Adding " + modelinfo.getModel().getResource());
	}

	private ModelInfo findModelInfo(ModelInfo modelinfo, List<ModelInfo> modelInfoList) {
		for(ModelInfo existing: modelInfoList){
			if( modelinfo.getModel().getResource().equals( existing.getModel().getResource())){
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
			if( modelinfo.getModel().getName().equals(model) ){
				for(Element elem : modelinfo.getElements()){
					if( elem.getName().equals(name) && 
						elem.getElemType().equals(elemType) )
					{
						return modelinfo.getModel().getResource();
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
			for(Element elem : modelinfo.getElements()){
				String value = elem.getElemType();
				if( (value != null) && value.equals(elemType) )
				{
					result.add(elem.getName());
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
