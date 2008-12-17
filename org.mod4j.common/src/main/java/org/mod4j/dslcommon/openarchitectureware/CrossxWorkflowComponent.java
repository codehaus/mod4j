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
package org.mod4j.dslcommon.openarchitectureware;

import org.mod4j.crossx.broker.CrossxEnvironment;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.lib.WorkflowComponentWithModelSlot;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

/* 
 * Workflow component to write a Crossx model to an XML file.
 * Referenced from workflow (*.oaw) files.
 */
public class CrossxWorkflowComponent extends WorkflowComponentWithModelSlot {

    /**
     * Converts a ModelInfo into an XML structure and writes this to file.
     * 
     * Then calling MyWorkflowComponent the invoke method is called. We use it, to instance the model and apply it to a
     * modelslot, so it can be used later by the generator component.
     * 
     * @see org.openarchitectureware.workflow.WorkflowComponent#invoke(org.openarchitectureware.workflow.WorkflowContext,
     *      org.openarchitectureware.workflow.monitor.ProgressMonitor, org.openarchitectureware.workflow.issues.Issues)
     */
    public void invoke(WorkflowContext wfCxt, ProgressMonitor arg1, Issues arg2) {

        Object model = wfCxt.get(getModelSlot());
        // Object outputslot = wfCxt.get(getOutputFile());

        ModelInfo modelInfo = (ModelInfo) model;

        System.err.println("Found slot [" + modelInfo.getModelname() + "]");
        // Document doc = createDocument(modelInfo);
        // writeDocument(doc, outputFile, false, "    ");
        System.err.println("Crossx: NOTNOTNOTNOT writing document to ");
        // CrossxBroker.addInfo(doc);
        CrossxEnvironment.addModelInfo(getProject(), modelInfo);

    }

    // private Document createDocument(ModelInfo modelInfo){
    // Document result = new Document();
    // Element root = new Element("ModelInfo");
    // result.setRootElement(root);
    //
    // Element modelref = new Element("ModelReference");
    // modelref.setAttribute("name", modelInfo.getName());
    // modelref.setAttribute("resource", modelInfo.getResource());
    // root.addContent(modelref);
    //		
    // for (org.mod4j.crossx.mm.crossx.Symbol elem : modelInfo.getElements()) {
    // createFromCrossxElement(root, elem);
    // }
    // return result;
    // }
    //
    // private void createFromCrossxElement(Element parent, org.mod4j.crossx.mm.crossx.Symbol elem) {
    // Element child = new Element("Element");
    // child.setAttribute("name", elem.getName());
    // child.setAttribute("elemType", elem.getType());
    // parent.addContent(child);
    //		
    // for(org.mod4j.crossx.mm.crossx.SymbolProperty prop : elem.getProperties()){
    // org.mod4j.crossx.mm.crossx.LiteralSymbolProperty lit = (org.mod4j.crossx.mm.crossx.LiteralSymbolProperty)prop;
    // createFromCrossxProperty(child, lit);
    // }
    // // Process the sub elements
    // for(org.mod4j.crossx.mm.crossx.Symbol sub : elem.getSubSymbols()){
    // createFromCrossxElement(child, sub);
    // }
    // }
    //
    // private void createFromCrossxProperty(Element parent, org.mod4j.crossx.mm.crossx.LiteralSymbolProperty litProp) {
    // Element child = new Element("Property");
    // child.setAttribute("name", litProp.getName());
    // child.setAttribute("elemType", litProp.getValue());
    // parent.addContent(child);
    // }
    //
    // capture the value of the <outputFile> slot in the workflow
    public String outputFile;

    protected String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(final String outlet) {
        this.outputFile = outlet;
    }

    // capture the value of the <outputFile> slot in the workflow
    public String project;

    protected String getProject() {
        return project;
    }

    public void setProject(final String theProject) {
        this.project = theProject;
    }

}
