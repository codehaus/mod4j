
package org.mod4j.dsl.service.xtext.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import org.mod4j.dsl.service.xtext.ServiceDslEditorPlugin;

public class NewServiceDslFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return ServiceDslEditorPlugin.getDefault().getUtilities();
	}
}
