package org.mod4j.businessdomain.xtext.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import org.mod4j.businessdomain.xtext.BusinessDomainDslEditorPlugin;

public class Mod4jNewBusinessDomainDslProjectWizard extends Mod4jAbstractNewProjectWizard {

	public Mod4jNewBusinessDomainDslProjectWizard() {
		super();
		setLangName("BusinessDomainDsl");
//		setGeneratorProjectName("BusinessDomain.generator");
//		setDslProjectName("BusinessDomain.xtext");
		setFileExtension("busmod");
		setPackageName("org/mod4j/businessdomain/xtext/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return BusinessDomainDslEditorPlugin.getDefault().getUtilities();
	}
}

