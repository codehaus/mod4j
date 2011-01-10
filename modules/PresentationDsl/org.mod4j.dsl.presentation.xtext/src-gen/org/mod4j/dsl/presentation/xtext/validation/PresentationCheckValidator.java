
package org.mod4j.dsl.presentation.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.CheckType;

public class PresentationCheckValidator extends org.eclipse.xtext.check.AbstractCheckValidator {

	public PresentationCheckValidator() {
		configure();
	}
	
	protected void configure() {
		addCheckFile("org::mod4j::dsl::presentation::xtext::validation::PresentationFastChecks", CheckType.FAST);
		addCheckFile("org::mod4j::dsl::presentation::xtext::validation::PresentationChecks", CheckType.NORMAL);
		addCheckFile("org::mod4j::dsl::presentation::xtext::validation::PresentationExpensiveChecks", CheckType.EXPENSIVE);
	}
	
	@Override
	protected List<? extends EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
		return result;
	}
	
}
