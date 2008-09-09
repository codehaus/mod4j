package org.mod4j.dsl.service.xtext.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import org.mod4j.dsl.service.xtext.ServiceDslEditorPlugin;

public class ServiceDslEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return ServiceDslEditorPlugin.getDefault();
   }
}
