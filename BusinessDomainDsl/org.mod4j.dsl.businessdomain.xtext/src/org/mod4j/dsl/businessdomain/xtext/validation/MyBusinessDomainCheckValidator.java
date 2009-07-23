package org.mod4j.dsl.businessdomain.xtext.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.xtend.typesystem.emf.check.CheckEValidatorAdapter;
import org.eclipse.xtend.typesystem.emf.check.CheckFileWithContext;
import org.eclipse.xtext.validation.CheckType;

import BusinessDomainDsl.BusinessDomainDslPackage;

public class MyBusinessDomainCheckValidator extends BusinessDomainCheckValidator {

	public MyBusinessDomainCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("org::mod4j::dsl::businessdomain::xtext::validation::BusinessModelChecks", CheckType.FAST);
		addCheckFile("org::mod4j::dsl::businessdomain::xtext::validation::CrossxChecks", CheckType.FAST);

//		val.addCheckFile(new CheckFileWithContext("BusinessDomainDsl::validation::BusinessModelChecks"));
//		val.addCheckFile(new CheckFileWithContext("BusinessDomainDsl::validation::CrossxChecks"));
	}

	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(BusinessDomainDslPackage.eINSTANCE);
		return result;
	}

}
