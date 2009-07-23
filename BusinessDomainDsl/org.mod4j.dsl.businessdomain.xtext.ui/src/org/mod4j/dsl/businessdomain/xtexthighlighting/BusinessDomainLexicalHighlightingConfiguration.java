package org.mod4j.dsl.businessdomain.xtexthighlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ILexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class BusinessDomainLexicalHighlightingConfiguration extends DefaultLexicalHighlightingConfiguration
{
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 100, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

}
