package org.mod4j.dsl.service.xtext;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class ServiceDslEditorPlugin extends AbstractXtextEditorPlugin {
   private static ServiceDslEditorPlugin plugin;
   public static ServiceDslEditorPlugin getDefault() {
      return plugin;
   }

   private ServiceDslUtilities utilities = new ServiceDslUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public ServiceDslEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
