
package org.mod4j.dsl.datacontract.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend.typesystem.emf.check.CheckEValidatorAdapter;
import org.eclipse.xtend.typesystem.emf.check.CheckFileWithContext;
import org.eclipse.xtext.validation.CheckType;
import org.mod4j.crossx.mm.crossx.CrossxPackage;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;

public class MyDataContractCheckValidator extends DataContractCheckValidator {

	public MyDataContractCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("org::mod4j::dsl::datacontract::xtext::validation::CrossxChecks1", CheckType.FAST);
		addCheckFile("org::mod4j::dsl::datacontract::validation::checks::DatacontractChecks", CheckType.FAST);
//		addCheckFile("org::mod4j::dsl::datacontract::xtext::validation::DataContractFastChecks", CheckType.FAST);
//		addCheckFile("org::mod4j::dsl::datacontract::xtext::validation::DataContractChecks", CheckType.NORMAL);
//		addCheckFile("org::mod4j::dsl::datacontract::xtext::validation::DataContractExpensiveChecks", CheckType.EXPENSIVE);
	}
	
//	protected void configure() {
//		registerCrossx();
//		CheckEValidatorAdapter val = new CheckEValidatorAdapter(DataContractDslPackage.eINSTANCE);
//		val.addCheckFile(new CheckFileWithContext("org::mod4j::dsl::datacontract::validation::checks::DatacontractChecks"));
////		val.addCheckFile(new CheckFileWithContext("org::mod4j::dsl::datacontract::validation::checks::CrossxChecks"));
////		val.addCheckFile(new CheckFileWithContext("org::mod4j::dsl::datacontract::xtext::validation::DatacontractChecks"));
//		val.addCheckFile(new CheckFileWithContext("org::mod4j::dsl::datacontract::xtext::validation::CrossxChecks1"));
//		EValidator.Registry.INSTANCE.put(DataContractDslPackage.eINSTANCE,val);
//
////		CheckEValidatorAdapter val2 = new CheckEValidatorAdapter(CrossxPackage.eINSTANCE);
////		val2.addCheckFile(new CheckFileWithContext("org::mod4j::dsl::datacontract::xtext::validation::CrossxChecks"));
////		EValidator.Registry.INSTANCE.put(CrossxPackage.eINSTANCE,val2);
//
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
	    result.add(org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage.eINSTANCE);
//	    result.add(org.mod4j.crossx.mm.crossx.CrossxPackage.eINSTANCE);
		return result;
	}

}
