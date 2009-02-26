package org.mod4j.dsl.presentation.xtext.parser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.xtext.parser.impl.AbstractParserComponent;
import org.openarchitectureware.xtext.resource.IXtextResource;

import org.mod4j.dsl.presentation.xtext.resource.PresentationDslResourceFactory;

public class ParserComponent extends AbstractParserComponent {
	static {
		PresentationDslResourceFactory.register();
	}

	protected String getFileExtension() {
		return "pmfmod";
	}

}
