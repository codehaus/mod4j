package org.mod4j.dsl.presentation.xtext;

import org.mod4j.dsl.presentation.xtext.PresentationDslUtilities;
import org.mod4j.eclipse.builder.Mod4jBuilder;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class PresentationDslEditorPlugin extends AbstractXtextEditorPlugin {
   private static PresentationDslEditorPlugin plugin;
   public static PresentationDslEditorPlugin getDefault() {
      return plugin;
   }

   private PresentationDslUtilities utilities = new PresentationDslUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public PresentationDslEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
   
   protected void refreshPluginActions() {
       super.refreshPluginActions();
       Mod4jBuilder.initCrossx("PresentationDslEditor"); 
   }

}
