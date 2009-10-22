package org.mod4j.dsl.presentation.xtext.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import org.mod4j.dsl.presentation.xtext.PresentationDslEditorPlugin;

public class PresentationDslEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return PresentationDslEditorPlugin.getDefault();
   }
}
