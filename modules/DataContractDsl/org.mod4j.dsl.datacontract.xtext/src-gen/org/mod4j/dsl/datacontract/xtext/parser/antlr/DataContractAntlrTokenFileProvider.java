/*
* generated by Xtext
*/
package org.mod4j.dsl.datacontract.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DataContractAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.tokens");
	}
}
