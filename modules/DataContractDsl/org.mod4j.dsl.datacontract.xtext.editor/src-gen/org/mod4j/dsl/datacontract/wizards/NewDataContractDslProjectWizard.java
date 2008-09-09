package org.mod4j.dsl.datacontract.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import org.mod4j.dsl.datacontract.DataContractDslEditorPlugin;

public class NewDataContractDslProjectWizard extends AbstractNewProjectWizard {

	public NewDataContractDslProjectWizard() {
		super();
		setLangName("DataContractDsl");
		setGeneratorProjectName("org.mod4j.dsl.datacontract.xtext.generator");
		setDslProjectName("org.mod4j.dsl.datacontract.xtext");
		setFileExtension("dtcmod");
		setPackageName("org/mod4j/dsl/datacontract/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return DataContractDslEditorPlugin.getDefault().getUtilities();
	}
}

