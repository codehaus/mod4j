package org.mod4j.dsl.service.xtext.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.xtend.typesystem.emf.check.CheckEValidatorAdapter;
import org.eclipse.xtend.typesystem.emf.check.CheckFileWithContext;
import org.eclipse.xtext.validation.CheckType;
import org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage;


public class MyServiceCheckValidator extends ServiceCheckValidator {

	public MyServiceCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("org::mod4j::dsl::service::xtext::validation::ServiceChecks", CheckType.FAST);
		addCheckFile("org::mod4j::dsl::service::xtext::validation::CrossxChecks", CheckType.FAST);

	}

	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(ServiceDslPackage.eINSTANCE);
		return result;
	}

}
