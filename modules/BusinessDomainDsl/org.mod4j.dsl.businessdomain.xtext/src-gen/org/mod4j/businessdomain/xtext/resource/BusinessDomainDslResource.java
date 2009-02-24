package org.mod4j.businessdomain.xtext.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import org.mod4j.businessdomain.xtext.parser.XtextParser;

public class BusinessDomainDslResource extends AbstractXtextResource {
	public BusinessDomainDslResource(URI uri) {
		super(uri);
		setFormattingExtension("org::mod4j::businessdomain::xtext::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

