package org.mod4j.dsl.datacontract.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import org.mod4j.dsl.datacontract.DataContractDslEditorPlugin;

public class DataContractDslEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return DataContractDslEditorPlugin.getDefault();
   }
}
