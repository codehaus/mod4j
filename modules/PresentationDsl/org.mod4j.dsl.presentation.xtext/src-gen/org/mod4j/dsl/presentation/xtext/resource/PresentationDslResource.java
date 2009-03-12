package org.mod4j.dsl.presentation.xtext.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import org.mod4j.dsl.presentation.xtext.parser.XtextParser;

public class PresentationDslResource extends AbstractXtextResource {
	public PresentationDslResource(URI uri) {
		super(uri);
		setFormattingExtension("org::mod4j::dsl::presentation::xtext::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

