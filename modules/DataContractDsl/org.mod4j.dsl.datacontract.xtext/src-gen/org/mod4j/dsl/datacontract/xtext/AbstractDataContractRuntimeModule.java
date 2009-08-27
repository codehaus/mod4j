
/*
 * generated by Xtext
 */
package org.mod4j.dsl.datacontract.xtext;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.service.DefaultRuntimeModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {org.mod4j.dsl.datacontract.xtext.DataContractRuntimeModule}
 */
public abstract class AbstractDataContractRuntimeModule extends DefaultRuntimeModule {
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance(
			"org.mod4j.dsl.datacontract.xtext.DataContract");
	}
	
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return org.mod4j.dsl.datacontract.xtext.services.DataContractGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.parseTreeConstructor.ParseTreeConstructorFragment
	public Class<? extends org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor> bindIParseTreeConstructor() {
		return org.mod4j.dsl.datacontract.xtext.parseTreeConstruction.DataContractParsetreeConstructor.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.CheckFragment
	public Class<? extends org.eclipse.xtend.expression.ExecutionContext> bindExecutionContext() {
		return org.eclipse.xtext.xtend.InjectableExecutionContext.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.CheckFragment
	public Class<? extends org.eclipse.xtend.expression.ResourceManager> bindResourceManager() {
		return org.eclipse.xtext.xtend.InjectableResourceManager.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.CheckFragment
	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return AbstractDataContractRuntimeModule.class.getClassLoader();
	}

	// contributed by org.eclipse.xtext.generator.validation.CheckFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.mod4j.dsl.datacontract.xtext.validation.DataContractCheckValidator> bindDataContractCheckValidator() {
		return org.mod4j.dsl.datacontract.xtext.validation.DataContractCheckValidator.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrParser> bindIAntlrParser() {
		return org.mod4j.dsl.datacontract.xtext.parser.antlr.DataContractParser.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return org.mod4j.dsl.datacontract.xtext.parser.antlr.DataContractAntlrTokenFileProvider.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return org.mod4j.dsl.datacontract.xtext.parser.antlr.internal.InternalDataContractLexer.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.mod4j.dsl.datacontract.xtext.validation.DataContractJavaValidator> bindDataContractJavaValidator() {
		return org.mod4j.dsl.datacontract.xtext.validation.DataContractJavaValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.JavaScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return org.mod4j.dsl.datacontract.xtext.scoping.DataContractScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return org.mod4j.dsl.datacontract.xtext.formatting.DataContractFormatter.class;
	}

}
