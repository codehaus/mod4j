package org.mod4j.businessdomain.xtext.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import org.mod4j.businessdomain.xtext.BusinessDomainDslEditorPlugin;

public class BusinessDomainDslEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return BusinessDomainDslEditorPlugin.getDefault();
   }
}
