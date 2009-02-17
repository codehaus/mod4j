package org.mod4j.businessdomain.xtext;

// import org.mod4j.eclipse.builder.CrossxBuilder;
import org.mod4j.eclipse.builder.Mod4jBuilder;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class BusinessDomainDslEditorPlugin extends AbstractXtextEditorPlugin {
   private static BusinessDomainDslEditorPlugin plugin;
   public static BusinessDomainDslEditorPlugin getDefault() {
      return plugin;
   }

   private BusinessDomainDslUtilities utilities = new BusinessDomainDslUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public BusinessDomainDslEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
   
   protected void refreshPluginActions() {
       super.refreshPluginActions();
       System.err.println("BusinessDslEditor.refreshPluginActions");
       Mod4jBuilder.initCrossx(); 
   }
   
}
