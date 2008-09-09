package org.mod4j.dsl.service.xtext.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import org.mod4j.dsl.service.xtext.ServiceDslEditorPlugin;

public class NewServiceDslProjectWizard extends AbstractNewProjectWizard {

	public NewServiceDslProjectWizard() {
		super();
		setLangName("ServiceDsl");
		setGeneratorProjectName("org.mod4j.dsl.service.xtext.generator");
		setDslProjectName("org.mod4j.dsl.service.xtext");
		setFileExtension("sermod");
		setPackageName("org/mod4j/dsl/service/xtext/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return ServiceDslEditorPlugin.getDefault().getUtilities();
	}
}

