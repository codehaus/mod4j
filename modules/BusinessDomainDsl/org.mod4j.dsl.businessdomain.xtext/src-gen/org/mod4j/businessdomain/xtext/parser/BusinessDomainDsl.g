grammar BusinessDomainDsl;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package org.mod4j.businessdomain.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package org.mod4j.businessdomain.xtext.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.businessdomain.xtext.MetaModelRegistration;

}
@lexer::members {
	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg;
	}
}

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}
	private Token getNextToken() {
		return input.LT(1);
	}

	private int line() {
		Token t = getNextToken();
		if (t==null)
			return 1;
		return t.getLine();
	}

	private int start() {
		Token t = getNextToken();
		if (t==null)
			return 0;
		if (t instanceof CommonToken) {
			return ((CommonToken)t).getStartIndex();
		}
		return t.getTokenIndex();
	}

	private int end() {
		Token t = getLastToken();
		if (t==null)
			return 1;
		if (t instanceof CommonToken) {
			return ((CommonToken)t).getStopIndex()+1;
		}
		return t.getTokenIndex();
	}

	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == BusinessDomainDslLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==BusinessDomainDslLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==BusinessDomainDslLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}


	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
    private ParseTreeManager ptm = new ParseTreeManager();
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	{
			factory.addImport("", "http://www.mod4j.org/busmod");
		
	}

	public ParseTreeManager getResult() {
		return ptm;
	}

	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	@Override
		public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
			ptm.addError(msg, e);
			ptm.ruleFinished(null, end());
		}

}


parse returns [Node r]:
	 result=ruleBusinessDomainModel EOF
{ptm.ruleFinished(result,end());$r = ptm.getCurrent();};

ruleBusinessDomainModel returns [EObject result] :
			{
				$result = factory.create("", "BusinessDomainModel");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}'BusinessDomain'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());}temp_types=ruleBusinessClassReference {factory.add($result,"types",convert(temp_types),false); ptm.ruleFinished(temp_types,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());}temp_types=ruleBusinessClass {factory.add($result,"types",convert(temp_types),false); ptm.ruleFinished(temp_types,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());}temp_enumerations=ruleEnumeration {factory.add($result,"enumerations",convert(temp_enumerations),false); ptm.ruleFinished(temp_enumerations,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(6)),line(),start());}temp_associations=ruleAssociation {factory.add($result,"associations",convert(temp_associations),false); ptm.ruleFinished(temp_associations,end()); }
)*
)
;

ruleBusinessClassReference returns [EObject result] :
			{
				$result = factory.create("", "BusinessClassReference");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());}'from'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());}temp_model=RULE_ID {factory.set($result,"model",convert(temp_model),false); ptm.ruleFinished(temp_model,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());}'import'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleAssociation returns [EObject result] :
			{
				$result = factory.create("", "Association");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}'Association'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());}temp_sourceRoleName=RULE_ID {factory.set($result,"sourceRoleName",convert(temp_sourceRoleName),false); ptm.ruleFinished(temp_sourceRoleName,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)),line(),start());}temp_source=RULE_ID
 {factory.set($result,"source",convert(temp_source),true); ptm.ruleFinished(temp_source,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(5)),line(),start());}temp_sourceMultiplicity=ruleMultiplicity {factory.set($result,"sourceMultiplicity",convert(temp_sourceMultiplicity),false); ptm.ruleFinished(temp_sourceMultiplicity,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(6)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());}temp_bidirectional='<->' {factory.set($result,"bidirectional",true); ptm.ruleFinished(temp_bidirectional,end()); }
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());}'->'{ptm.ruleFinished(getLastToken(),end());})
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(8)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(9)),line(),start());}temp_targetMultiplicity=ruleMultiplicity {factory.set($result,"targetMultiplicity",convert(temp_targetMultiplicity),false); ptm.ruleFinished(temp_targetMultiplicity,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(10)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(11)),line(),start());}temp_ordered='ordered' {factory.set($result,"ordered",true); ptm.ruleFinished(temp_ordered,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(12)),line(),start());}temp_targetRoleName=RULE_ID {factory.set($result,"targetRoleName",convert(temp_targetRoleName),false); ptm.ruleFinished(temp_targetRoleName,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(13)),line(),start());}temp_target=RULE_ID
 {factory.set($result,"target",convert(temp_target),true); ptm.ruleFinished(temp_target,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(14)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleMultiplicity returns [Object r] :
			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)),line(),start());}
		 '0..*'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Multiplicity","ZeroMany"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(2)),line(),start());}
		 '1'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Multiplicity","One"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(3)),line(),start());}
		 '1..*'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Multiplicity","OneMany"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(4)),line(),start());}
		 '0..1'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Multiplicity","ZeroOne"),end());}
;

ruleBusinessClass returns [EObject result] :
			{
				$result = factory.create("", "BusinessClass");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());}'Class'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}'inherits'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());}temp_superclass=RULE_ID
 {factory.set($result,"superclass",convert(temp_superclass),true); ptm.ruleFinished(temp_superclass,end()); }
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(5)),line(),start());}temp_properties=ruleProperty {factory.add($result,"properties",convert(temp_properties),false); ptm.ruleFinished(temp_properties,end()); }
)*

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(6)).eContents().get(0)),line(),start());}'Rules'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(6)).eContents().get(1)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(6)).eContents().get(2)),line(),start());}temp_businessRules=ruleAbstractBusinessRule {factory.add($result,"businessRules",convert(temp_businessRules),false); ptm.ruleFinished(temp_businessRules,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(6)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleEnumeration returns [EObject result] :
			{
				$result = factory.create("", "Enumeration");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());}'Enumeration'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)),line(),start());}temp_enumerationLiterals=ruleEnumerationLiteral {factory.add($result,"enumerationLiterals",convert(temp_enumerationLiterals),false); ptm.ruleFinished(temp_enumerationLiterals,end()); }
)+

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleEnumerationLiteral returns [EObject result] :
			{
				$result = factory.create("", "EnumerationLiteral");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}'='{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}temp_persistedValue=RULE_INT {factory.set($result,"persistedValue",convert(temp_persistedValue),false); ptm.ruleFinished(temp_persistedValue,end()); }
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleAbstractBusinessRule returns [EObject result] :
        temp_businessrule=ruleBusinessRule {$result=temp_businessrule;}	|        temp_uniquerule=ruleUniqueRule {$result=temp_uniquerule;}	;

ruleBusinessRule returns [EObject result] :
			{
				$result = factory.create("", "BusinessRule");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleUniqueRule returns [EObject result] :
			{
				$result = factory.create("", "UniqueRule");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)),line(),start());}'unique'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(4)),line(),start());}temp_properties=RULE_ID
 {factory.add($result,"properties",convert(temp_properties),true); ptm.ruleFinished(temp_properties,end()); }
)+

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(5)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleProperty returns [EObject result] :
			{
				$result = factory.create("", "Property");
				ptm.setModelElement($result);
			 }
((({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}
temp_BoolProperty=ruleBoolProperty {$result=temp_BoolProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());}
temp_StringProperty=ruleStringProperty {$result=temp_StringProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());}
temp_DateTimeProperty=ruleDateTimeProperty {$result=temp_DateTimeProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)).eContents().get(3)),line(),start());}
temp_IntegerProperty=ruleIntegerProperty {$result=temp_IntegerProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)).eContents().get(4)),line(),start());}
temp_DecimalProperty=ruleDecimalProperty {$result=temp_DecimalProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)).eContents().get(5)),line(),start());}
temp_EnumerationProperty=ruleEnumerationProperty {$result=temp_EnumerationProperty;}
{ptm.ruleFinished(getLastToken(),end());})
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());}temp_nullable='nullable' {factory.set($result,"nullable",true); ptm.ruleFinished(temp_nullable,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleBoolProperty returns [EObject result] :
			{
				$result = factory.create("", "BoolProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());}temp_dataType='boolean' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_hasDefault='default' {factory.set($result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_defaultValue='true' {factory.set($result,"defaultValue",true); ptm.ruleFinished(temp_defaultValue,end()); }
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}'false'{ptm.ruleFinished(getLastToken(),end());})
)
)?
)
;

ruleStringProperty returns [EObject result] :
			{
				$result = factory.create("", "StringProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)),line(),start());}temp_dataType='string' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_hasDefault='default' {factory.set($result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());}temp_defaultValue=RULE_STRING {factory.set($result,"defaultValue",convert(temp_defaultValue),false); ptm.ruleFinished(temp_defaultValue,end()); }
)
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());}'minlength'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());}temp_minLength=RULE_INT {factory.set($result,"minLength",convert(temp_minLength),false); ptm.ruleFinished(temp_minLength,end()); }
)
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());}'maxlength'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)).eContents().get(1)),line(),start());}temp_maxLength=RULE_INT {factory.set($result,"maxLength",convert(temp_maxLength),false); ptm.ruleFinished(temp_maxLength,end()); }
)
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(6)).eContents().get(0)),line(),start());}'regexp'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(6)).eContents().get(1)),line(),start());}temp_regularExpression=RULE_STRING {factory.set($result,"regularExpression",convert(temp_regularExpression),false); ptm.ruleFinished(temp_regularExpression,end()); }
)
)?
)
;

ruleDateTimeProperty returns [EObject result] :
			{
				$result = factory.create("", "DateTimeProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)),line(),start());}temp_dataType='datetime' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_hasDefault='default' {factory.set($result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());}temp_defaultValue=RULE_STRING {factory.set($result,"defaultValue",convert(temp_defaultValue),false); ptm.ruleFinished(temp_defaultValue,end()); }
)
)?
)
;

ruleIntegerProperty returns [EObject result] :
			{
				$result = factory.create("", "IntegerProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)),line(),start());}temp_dataType='integer' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_hasDefault='default' {factory.set($result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());}temp_defaultValue=RULE_INT {factory.set($result,"defaultValue",convert(temp_defaultValue),false); ptm.ruleFinished(temp_defaultValue,end()); }
)
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());}'min'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());}temp_minValue=RULE_INT {factory.set($result,"minValue",convert(temp_minValue),false); ptm.ruleFinished(temp_minValue,end()); }
)
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());}'max'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(5)).eContents().get(1)),line(),start());}temp_maxValue=RULE_INT {factory.set($result,"maxValue",convert(temp_maxValue),false); ptm.ruleFinished(temp_maxValue,end()); }
)
)?
)
;

ruleDecimalProperty returns [EObject result] :
			{
				$result = factory.create("", "DecimalProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)),line(),start());}temp_dataType='decimal' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleEnumerationProperty returns [EObject result] :
			{
				$result = factory.create("", "EnumerationProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)),line(),start());}temp_type=RULE_ID
 {factory.set($result,"type",convert(temp_type),true); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_hasDefault='default' {factory.set($result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());}temp_defaultValueAsString=RULE_ID {factory.set($result,"defaultValueAsString",convert(temp_defaultValueAsString),false); ptm.ruleFinished(temp_defaultValueAsString,end()); }
)
)?
)
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

