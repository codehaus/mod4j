package org.mod4j.dsl.service.xtext.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.openarchitectureware.xtext.resource.IXtextResourceFactory;

public class ServiceDslResourceFactory extends ResourceFactoryImpl implements IXtextResourceFactory {
	@Override
	public Resource createResource(URI uri) {
		return new ServiceDslResource(uri);
	}
	
	public static void register() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sermod", new ServiceDslResourceFactory());
	}
}

