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
package org.mod4j.dslcommon.generator.helpers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.lib.AbstractWorkflowComponent;
import org.openarchitectureware.workflow.lib.WorkflowComponentWithModelSlot;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

/* 
 * Workflow component to read a properties files
 * Referenced from workflow (*.oaw) files.
 */
public class PropertiesWorkflowComponent extends AbstractWorkflowComponent {

	/**
	 * Then calling MyWorkflowComponent the invoke method is called. We use it, to instance
	 * the model and apply it to a modelslot, so it can be used later by the generator component.
	 *
	 * @see org.openarchitectureware.workflow.WorkflowComponent#invoke(org.openarchitectureware.workflow.WorkflowContext, org.openarchitectureware.workflow.monitor.ProgressMonitor, org.openarchitectureware.workflow.issues.Issues)
	 */
	public void invoke(WorkflowContext wfCxt, ProgressMonitor arg1, Issues arg2) {
		System.err.println("PropertiesWorkflowComponent: Found property slot [" + getPropertyFile() + "]");
		ProjectProperties.setPropertiesFile(getPropertyFile());
	}

    public void checkConfiguration(final Issues issues) {
        if (propertyFile == null)
            issues.addError(this, "modelSlot not specified.");
    }

	// capture the value of the <propertyFileSlot> slot in the workflow
	public String propertyFile;

	protected String getPropertyFile() {
		return propertyFile; 
	}

	public void setPropertyFile(final String outlet) {
		this.propertyFile = outlet;
	}

}
