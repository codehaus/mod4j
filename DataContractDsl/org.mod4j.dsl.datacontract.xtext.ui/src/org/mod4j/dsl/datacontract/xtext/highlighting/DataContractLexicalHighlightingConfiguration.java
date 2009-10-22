package org.mod4j.dsl.datacontract.xtext.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ILexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class DataContractLexicalHighlightingConfiguration extends DefaultLexicalHighlightingConfiguration
{
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(151, 0, 184));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

}
