/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/

package org.mod4j.dsl.service.xtext.parser;

import java.io.InputStream;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.check.CheckFacade;
import org.openarchitectureware.emf.EcoreUtil2;
import org.openarchitectureware.expression.ExecutionContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.issues.IssuesImpl;
import org.openarchitectureware.workflow.util.ResourceLoader;
import org.openarchitectureware.workflow.util.ResourceLoaderFactory;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;


public class XtextParser extends GenParser {

	public XtextParser(InputStream in) {
		super(in);
	}
	
    public Issues doCheck() {
        IssuesImpl issues = new IssuesImpl();
        ResourceLoader cl = ResourceLoaderFactory.createResourceLoader();
        try {
            ResourceLoaderFactory.setCurrentThreadResourceLoader(new ResourceLoaderImpl(GenParser.class.getClassLoader()));
            ExecutionContext ctx = getExecutionContext();
            Collection<EObject> allElements = EcoreUtil2.allContents(getRootNode().getModelElement());
            allElements.add(getRootNode().getModelElement());
            String[] checkFiles = new String[]{
                    "org::mod4j::dsl::service::xtext::GenChecks",
                    "org::mod4j::dsl::service::validation::checks::CrossxChecks",
                    "org::mod4j::dsl::service::validation::checks::ServiceChecks",
                    "org::mod4j::dsl::service::xtext::Checks"};
            for (String checkFile : checkFiles) {
                CheckFacade.checkAll(checkFile, allElements, ctx, issues);
            }
        } catch (Exception e) {
            issues.addError("Error during validation phase : "+e.getMessage(), getRootNode().getModelElement());
            e.printStackTrace();
        } finally {
            ResourceLoaderFactory.setCurrentThreadResourceLoader(cl);
        }
        return issues;
    }
}
