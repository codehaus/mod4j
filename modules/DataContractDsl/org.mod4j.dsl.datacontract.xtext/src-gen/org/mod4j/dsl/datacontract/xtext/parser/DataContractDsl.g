grammar DataContractDsl;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package org.mod4j.dsl.datacontract.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package org.mod4j.dsl.datacontract.xtext.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.dsl.datacontract.xtext.MetaModelRegistration;

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
			if (t.getType() == DataContractDslLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==DataContractDslLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==DataContractDslLexer.RULE_INT) {
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
			factory.addImport("", "http://www.mod4j.org/datacontract");
		
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
	 result=ruleDataContractModel EOF
{ptm.ruleFinished(result,end());$r = ptm.getCurrent();};

ruleDataContractModel returns [EObject result] :
			{
				$result = factory.create("", "DataContractModel");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}'DataContract'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());}temp_externalReferences=ruleExternalReference {factory.add($result,"externalReferences",convert(temp_externalReferences),false); ptm.ruleFinished(temp_externalReferences,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());}temp_dtos=ruleDto {factory.add($result,"dtos",convert(temp_dtos),false); ptm.ruleFinished(temp_dtos,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());}temp_enumerations=ruleEnumerationDto {factory.add($result,"enumerations",convert(temp_enumerations),false); ptm.ruleFinished(temp_enumerations,end()); }
)*
)
;

ruleDto returns [EObject result] :
			{
				$result = factory.create("", "Dto");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}
temp_BusinessClassDto=ruleBusinessClassDto {$result=temp_BusinessClassDto;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}
temp_ListDto=ruleListDto {$result=temp_ListDto;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}
temp_CustomDto=ruleCustomDto {$result=temp_CustomDto;}
{ptm.ruleFinished(getLastToken(),end());})
)
)
;

ruleExternalReference returns [EObject result] :
			{
				$result = factory.create("", "ExternalReference");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}'from'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());}temp_modelname=RULE_ID {factory.set($result,"modelname",convert(temp_modelname),false); ptm.ruleFinished(temp_modelname,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)),line(),start());}'import'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleBusinessClassDto returns [EObject result] :
			{
				$result = factory.create("", "BusinessClassDto");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)),line(),start());}'BusinessClassDto'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)),line(),start());}'base'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)),line(),start());}temp_base=RULE_ID
 {factory.set($result,"base",convert(temp_base),true); ptm.ruleFinished(temp_base,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());}temp_propertyReferences=ruleBusinessClassPropertyReference {factory.add($result,"propertyReferences",convert(temp_propertyReferences),false); ptm.ruleFinished(temp_propertyReferences,end()); }
)+

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(2)).eContents().get(0)),line(),start());}'references'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(2)).eContents().get(1)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(2)).eContents().get(2)),line(),start());}temp_associationReferences=ruleBusinessClassAssociationRoleReference {factory.add($result,"associationReferences",convert(temp_associationReferences),false); ptm.ruleFinished(temp_associationReferences,end()); }
)+

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(2)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?
)
;

ruleEnumerationDto returns [EObject result] :
			{
				$result = factory.create("", "EnumerationDto");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}'EnumerationDto'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());}'base'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)),line(),start());}temp_base=RULE_ID
 {factory.set($result,"base",convert(temp_base),true); ptm.ruleFinished(temp_base,end()); }
)
)
;

ruleBusinessClassPropertyReference returns [EObject result] :
			{
				$result = factory.create("", "BusinessClassPropertyReference");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleBusinessClassAssociationRoleReference returns [EObject result] :
			{
				$result = factory.create("", "BusinessClassAssociationRoleReference");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)),line(),start());}temp_dtoType=RULE_ID
 {factory.set($result,"dtoType",convert(temp_dtoType),true); ptm.ruleFinished(temp_dtoType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleListDto returns [EObject result] :
			{
				$result = factory.create("", "ListDto");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());}'ListDto'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)),line(),start());}'base'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());}temp_baseDto=RULE_ID
 {factory.set($result,"baseDto",convert(temp_baseDto),true); ptm.ruleFinished(temp_baseDto,end()); }
)
)
;

ruleCustomDto returns [EObject result] :
			{
				$result = factory.create("", "CustomDto");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());}'CustomDto'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)),line(),start());}temp_properties=ruleDtoProperty {factory.add($result,"properties",convert(temp_properties),false); ptm.ruleFinished(temp_properties,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(4)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleDtoProperty returns [EObject result] :
			{
				$result = factory.create("", "DtoProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}
temp_DtoBooleanProperty=ruleDtoBooleanProperty {$result=temp_DtoBooleanProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}
temp_DtoStringProperty=ruleDtoStringProperty {$result=temp_DtoStringProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}
temp_DtoDateTimeProperty=ruleDtoDateTimeProperty {$result=temp_DtoDateTimeProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());}
temp_DtoIntegerProperty=ruleDtoIntegerProperty {$result=temp_DtoIntegerProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());}
temp_DtoDecimalProperty=ruleDtoDecimalProperty {$result=temp_DtoDecimalProperty;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());}
temp_DtoEnumerationProperty=ruleDtoEnumerationProperty {$result=temp_DtoEnumerationProperty;}
{ptm.ruleFinished(getLastToken(),end());})
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleDtoBooleanProperty returns [EObject result] :
			{
				$result = factory.create("", "DtoBooleanProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)),line(),start());}temp_dataType='boolean' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleDtoStringProperty returns [EObject result] :
			{
				$result = factory.create("", "DtoStringProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)),line(),start());}temp_dataType='string' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleDtoDateTimeProperty returns [EObject result] :
			{
				$result = factory.create("", "DtoDateTimeProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());}temp_dataType='datetime' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleDtoIntegerProperty returns [EObject result] :
			{
				$result = factory.create("", "DtoIntegerProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)),line(),start());}temp_dataType='integer' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleDtoDecimalProperty returns [EObject result] :
			{
				$result = factory.create("", "DtoDecimalProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)),line(),start());}temp_dataType='decimal' {factory.set($result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleDtoEnumerationProperty returns [EObject result] :
			{
				$result = factory.create("", "DtoEnumerationProperty");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID
 {factory.set($result,"type",convert(temp_type),true); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
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

