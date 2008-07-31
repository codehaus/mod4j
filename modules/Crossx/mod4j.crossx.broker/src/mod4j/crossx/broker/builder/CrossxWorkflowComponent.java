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
package mod4j.crossx.broker.builder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import mod4j.crossx.broker.repository.*;
import mod4j.crossx.broker.views.CrossxView;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.lib.WorkflowComponentWithModelSlot;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

import mod4j.crossx.ModelInfo;

/* 
 * Workflow component to write a Crossx model to an XML file.
 * Referenced from workflow (*.oaw) files.
 */
public class CrossxWorkflowComponent extends WorkflowComponentWithModelSlot {


	/**
	 * Converts a ModelInfo into an XML structure and writes this to file.
	 * 
	 * Then calling MyWorkflowComponent the invoke method is called. We use it, to instance
	 * the model and apply it to a modelslot, so it can be used later by the generator component.
	 *
	 * @see org.openarchitectureware.workflow.WorkflowComponent#invoke(org.openarchitectureware.workflow.WorkflowContext, org.openarchitectureware.workflow.monitor.ProgressMonitor, org.openarchitectureware.workflow.issues.Issues)
	 */
	public void invoke(WorkflowContext wfCxt, ProgressMonitor arg1, Issues arg2) {

		Object model = wfCxt.get(getModelSlot());
		Object outputslot = wfCxt.get(getOutputFile());
		
		
		ModelInfo modelInfo = (ModelInfo )model;

		System.err.println("Found slot [" + modelInfo .getModel().getName()+ "]");
		Document doc = createDocument(modelInfo);
//		writeDocument(doc, (String) outputslot, false, "    ");
		writeDocument(doc, outputFile, false, "    ");
		CrossxRepository.addInfo(doc);
		CrossxView.myrefresh();
		
	}

	private Document createDocument(ModelInfo modelInfo){
		Document result = new Document();
		Element root = new Element("ModelInfo");
		result.setRootElement(root);

		Element modelref = new Element("ModelReference");
		modelref.setAttribute("name", modelInfo.getModel().getName());
		modelref.setAttribute("resource", modelInfo.getModel().getResource());
		root.addContent(modelref);
		
		for (mod4j.crossx.Element elem : modelInfo.getElements()) {
			createFromCrossxElement(root, elem);
		}
		return result;
	}

	private void createFromCrossxElement(Element parent, mod4j.crossx.Element elem) {
		Element child = new Element("Element");
		child.setAttribute("name", elem.getName());
		child.setAttribute("elemType", elem.getElemType());
		parent.addContent(child);
		
		for(mod4j.crossx.Property prop : elem.getProperties()){
			mod4j.crossx.LiteralProperty lit = (mod4j.crossx.LiteralProperty)prop;
			createFromCrossxProperty(child, lit);
		}
		// Process the sub elements
		for(mod4j.crossx.Element sub : elem.getSubElements()){
			createFromCrossxElement(child, sub);
		}
	}

	private void createFromCrossxProperty(Element parent, mod4j.crossx.LiteralProperty litProp) {
		Element child = new Element("Property");
		child.setAttribute("name", litProp.getName());
		child.setAttribute("elemType", litProp.getValue());
		parent.addContent(child);
	}

	public void writeDocument(Document doc, String outfilename, boolean newLines, String indent){
		System.err.println("Crossx: writing document to [" + outfilename + "]");
		try {
			FileOutputStream stream = new FileOutputStream(new File(outfilename));
			writeDocument(doc, stream, newLines, indent);
			stream.close();
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}

	public void writeDocument(Document doc, FileOutputStream stream, boolean newLines, String indent){
		try {
			XMLOutputter outputter = new XMLOutputter();

			Format fmt = Format.getPrettyFormat();
			if( indent !=null ) {
				fmt.setIndent(indent); // use four space indent
			}
			outputter.setFormat(fmt);
			outputter.output(doc, stream);
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}

	// capture the value of the <outputFile> slot in the workflow
	public String outputFile;

	protected String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(final String outlet) {
		this.outputFile = outlet;
	}

}
