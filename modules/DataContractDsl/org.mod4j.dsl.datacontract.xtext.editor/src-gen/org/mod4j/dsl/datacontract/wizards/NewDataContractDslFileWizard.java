
package org.mod4j.dsl.datacontract.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import org.mod4j.dsl.datacontract.DataContractDslEditorPlugin;

public class NewDataContractDslFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return DataContractDslEditorPlugin.getDefault().getUtilities();
	}
}
