/*
 * generated by Xtext
 */
package org.mod4j.dsl.datacontract.xtext;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ILexicalHighlightingConfiguration;
import org.mod4j.dsl.datacontract.xtext.highlighting.DataContractLexicalHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DataContractUiModule extends org.mod4j.dsl.datacontract.xtext.AbstractDataContractUiModule {

    public Class<? extends ILexicalHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
        return DataContractLexicalHighlightingConfiguration.class;
    }

}
