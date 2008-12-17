package org.mod4j.dsl.service.xtext.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import org.mod4j.dsl.service.xtext.parser.XtextParser;

public class ServiceDslResource extends AbstractXtextResource {
	public ServiceDslResource(URI uri) {
		super(uri);
		setFormattingExtension("org::mod4j::dsl::service::xtext::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

