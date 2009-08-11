
/*
 * generated by Xtext
 */
package org.mod4j.dsl.service.xtext.internal;

import org.eclipse.xtext.ui.common.service.UIPluginModule;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class ServiceActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static ServiceActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		
		injectors.put("org.mod4j.dsl.service.xtext.Service", Guice.createInjector(
			new org.mod4j.dsl.service.xtext.ServiceUiModule(),
			createUIPluginModule()
		));
		
	}
	
	public static ServiceActivator getInstance() {
		return INSTANCE;
	}
	
	protected UIPluginModule createUIPluginModule() {
		return new UIPluginModule(this);
	}
	
}