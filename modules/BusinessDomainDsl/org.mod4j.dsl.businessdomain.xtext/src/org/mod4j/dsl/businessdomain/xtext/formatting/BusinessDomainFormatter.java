/*
 * generated by Xtext
 */
package org.mod4j.dsl.businessdomain.xtext.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://wiki.eclipse.org/Xtext/Documentation#Formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class BusinessDomainFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		org.mod4j.dsl.businessdomain.xtext.services.BusinessDomainGrammarAccess f = (org.mod4j.dsl.businessdomain.xtext.services.BusinessDomainGrammarAccess) getGrammarAccess();

		//...
	}
}
