package mod4j.crossx.broker.builder;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import crossx.util.EclipseUtil;

/** Keeps all information regarding extension points from other plugins
 * 
 * @author jwa11799
 *
 */
public class DslExtension {

	private static final String EXTENSION_ID = CrossxBuilder.bundleName + ".dsl";

	private String dslContributor;
	private String dslName ;
	private String dslMetamodelPackage;
	private String dslFileExtension;
	private String dsl2crossxWorkflow;
	private String dslXtendModule;
	
	public DslExtension(String contributor, String name,
			            String metamodelPackage, String fileExtension, String crossxWorkflow) {
		dslContributor = contributor;
		dslName = name;
		dslMetamodelPackage = metamodelPackage;
		dslFileExtension = fileExtension;
		dsl2crossxWorkflow = crossxWorkflow;
		dslXtendModule = "busmod2crossx"; 
	}

	public String getDslContributor() {
		return dslContributor;
	}
	public String getDslName() {
		return dslName;
	}
	public String getDslMetamodelPackage() {
		return dslMetamodelPackage;
	}
	public String getDslFileExtension() {
		return dslFileExtension;
	}
	public String getDsl2crossxWorkflow() {
		return dsl2crossxWorkflow;
	}
	public String getDslXtendModule() {
		return dslXtendModule;
	}
	
	public static List<DslExtension> getExtensions() {
		List<DslExtension> result = new ArrayList<DslExtension>();
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = reg.getConfigurationElementsFor(EXTENSION_ID);
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement element = extensions[i];
			String name = element.getAttribute("dslName");
			String metamodelPackage = element.getAttribute("dslMetamodelPackage");
			String fileExtension = element.getAttribute("dslFileExtension");
			String crossxWorkflow = element.getAttribute("dsl2crossxWorkflow");
			String contributor= element.getContributor().getName();
			System.err.println("DSL [" + name + "] CONTRIBUTED BY [" + contributor + "]" );

			DslExtension dsl = new DslExtension(contributor, name, metamodelPackage, fileExtension, crossxWorkflow);
			if( dsl.validate() ){
				result.add( dsl );
			} else {
				EclipseUtil.showError("crossx extension point is invalid");
			}
		}
		return result;
	}
	
	private boolean validate(){
		if( getDslName() == null ) return false;
		if( getDslName().length() == 0 ) return false;
		if( getDsl2crossxWorkflow() == null ) return false;
		if( ! getDsl2crossxWorkflow().endsWith(".oaw")) return false;
		if( getDslContributor() == null ) return false;
		if( getDslFileExtension() == null ) return false;
		if( getDslMetamodelPackage() == null ) return false;
		
		return true;
	}
	
}
