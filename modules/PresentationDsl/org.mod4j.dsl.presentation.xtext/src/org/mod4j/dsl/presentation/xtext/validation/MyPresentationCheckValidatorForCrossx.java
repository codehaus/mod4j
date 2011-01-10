
package org.mod4j.dsl.presentation.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.validation.CheckType;
import org.mod4j.crossx.mm.crossx.CrossxPackage;

public class MyPresentationCheckValidatorForCrossx extends PresentationCheckValidator {

	public MyPresentationCheckValidatorForCrossx() { 
	    System.out.println("MyPresentationCheckValidatorForCrossx()  MyPresentationCheckValidatorForCrossx()  MyPresentationCheckValidatorForCrossx()  MyPresentationCheckValidatorForCrossx() ");
		configure();
	}
	
	protected void configure() {
//        addCheckFile("org::mod4j::dsl::presentation::xtext::validation::CrossxChecks1", CheckType.FAST);
//        addCheckFile("org::mod4j::dsl::presentation::validation::checks::CrossxChecks", CheckType.FAST);
//        addCheckFile("org::mod4j::dsl::presentation::validation::checks::PresentationChecks", CheckType.FAST);
	}
	
//	@Override
//	protected List<? extends EPackage> getEPackages() {
//	    List<EPackage> result = new ArrayList<EPackage>();
//		return result;
//	}
	
	   protected void registerCrossx() {
	        // Create a resource set to hold the resources.
	        //
	        EPackage.Registry.INSTANCE.put(CrossxPackage.eNS_URI, CrossxPackage.eINSTANCE);
	        ResourceSet resourceSet = new ResourceSetImpl();
	        
	        // Register the appropriate resource factory to handle all file extensions.
	        //
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
	            (Resource.Factory.Registry.DEFAULT_EXTENSION, 
	             new XMIResourceFactoryImpl());

	        // Register the package to ensure it is available during loading.
	        //
	        resourceSet.getPackageRegistry().put
	            (CrossxPackage.eNS_URI, 
	             CrossxPackage.eINSTANCE);

	    }

	    @Override
	    protected List<? extends EPackage> getEPackages() {
	        List<EPackage> result = new ArrayList<EPackage>();
	        result.add(org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage.eINSTANCE);
//	      result.add(org.mod4j.crossx.mm.crossx.CrossxPackage.eINSTANCE);
	        return result;
	    }

}
