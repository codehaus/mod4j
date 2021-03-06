
/*
 * generated by Xtext
 */
package org.mod4j.dsl.service.xtext;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.service.DefaultRuntimeModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {org.mod4j.dsl.service.xtext.ServiceRuntimeModule}
 */
public abstract class AbstractServiceRuntimeModule extends DefaultRuntimeModule {
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance(
			"org.mod4j.dsl.service.xtext.Service");
	}
	
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return org.mod4j.dsl.service.xtext.services.ServiceGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.parseTreeConstructor.ParseTreeConstructorFragment
	public Class<? extends org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor> bindIParseTreeConstructor() {
		return org.mod4j.dsl.service.xtext.parseTreeConstruction.ServiceParsetreeConstructor.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrParser> bindIAntlrParser() {
		return org.mod4j.dsl.service.xtext.parser.antlr.ServiceParser.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return org.mod4j.dsl.service.xtext.parser.antlr.ServiceAntlrTokenFileProvider.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return org.mod4j.dsl.service.xtext.parser.antlr.internal.InternalServiceLexer.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.mod4j.dsl.service.xtext.validation.ServiceJavaValidator> bindServiceJavaValidator() {
		return org.mod4j.dsl.service.xtext.validation.ServiceJavaValidator.class;
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
		return AbstractServiceRuntimeModule.class.getClassLoader();
	}

	// contributed by org.eclipse.xtext.generator.validation.CheckFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.mod4j.dsl.service.xtext.validation.ServiceCheckValidator> bindServiceCheckValidator() {
		return org.mod4j.dsl.service.xtext.validation.ServiceCheckValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.JavaScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return org.mod4j.dsl.service.xtext.scoping.ServiceScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return org.mod4j.dsl.service.xtext.formatting.ServiceFormatter.class;
	}

}
