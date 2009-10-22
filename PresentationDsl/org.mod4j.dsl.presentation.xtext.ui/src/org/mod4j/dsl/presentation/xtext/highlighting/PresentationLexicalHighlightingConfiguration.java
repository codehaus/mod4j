package org.mod4j.dsl.presentation.xtext.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class PresentationLexicalHighlightingConfiguration extends DefaultLexicalHighlightingConfiguration
{
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(233, 131, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

}
