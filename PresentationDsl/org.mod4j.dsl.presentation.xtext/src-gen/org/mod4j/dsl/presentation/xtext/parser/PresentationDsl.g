grammar PresentationDsl;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package org.mod4j.dsl.presentation.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package org.mod4j.dsl.presentation.xtext.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.dsl.presentation.xtext.MetaModelRegistration;

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
			if (t.getType() == PresentationDslLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==PresentationDslLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==PresentationDslLexer.RULE_INT) {
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
			factory.addImport("", "http://www.mod4j.org/pmfmod");
		
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
	 result=rulePresentationModel EOF
{ptm.ruleFinished(result,end());$r = ptm.getCurrent();};

rulePresentationModel returns [EObject result] :
			{
				$result = factory.create("", "PresentationModel");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}'PresentationModel'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());}temp_externalReferences=ruleExternalReference {factory.add($result,"externalReferences",convert(temp_externalReferences),false); ptm.ruleFinished(temp_externalReferences,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());}temp_elements=ruleModelElement {factory.add($result,"elements",convert(temp_elements),false); ptm.ruleFinished(temp_elements,end()); }
)*
)
;

ruleExternalReference returns [EObject result] :
			{
				$result = factory.create("", "ExternalReference");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());}'from'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());}temp_modelName=RULE_ID {factory.set($result,"modelName",convert(temp_modelName),false); ptm.ruleFinished(temp_modelName,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());}'import'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
)
;

ruleModelElement returns [EObject result] :
        temp_uimodelelement=ruleUIModelElement {$result=temp_uimodelelement;}	|        temp_link=ruleLink {$result=temp_link;}	;

ruleUIModelElement returns [EObject result] :
        temp_dialogue=ruleDialogue {$result=temp_dialogue;}	|        temp_process=ruleProcess {$result=temp_process;}	;

ruleDialogue returns [EObject result] :
        temp_contentform=ruleContentForm {$result=temp_contentform;}	|        temp_compounddialogue=ruleCompoundDialogue {$result=temp_compounddialogue;}	;

ruleContentForm returns [EObject result] :
			{
				$result = factory.create("", "ContentForm");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());}'ContentForm'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());}'using'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)),line(),start());}temp_contextRef=RULE_ID
 {factory.set($result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());}'readonly'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}temp_readonly='true' {factory.set($result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); }
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());}'false'{ptm.ruleFinished(getLastToken(),end());})
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(6)),line(),start());}temp_formElements=ruleFormElement {factory.add($result,"formElements",convert(temp_formElements),false); ptm.ruleFinished(temp_formElements,end()); }
)*

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());}'processes'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)).eContents().get(2)),line(),start());}temp_processes=ruleProcessCall {factory.add($result,"processes",convert(temp_processes),false); ptm.ruleFinished(temp_processes,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?
)
;

ruleCompoundDialogue returns [EObject result] :
			{
				$result = factory.create("", "CompoundDialogue");
				ptm.setModelElement($result);
			 }
((({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());}'CompoundDialogue'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(3)),line(),start());}'using'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(4)),line(),start());}temp_contextRef=RULE_ID
 {factory.set($result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(5)).eContents().get(0)),line(),start());}'readonly'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}temp_readonly='true' {factory.set($result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); }
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());}'false'{ptm.ruleFinished(getLastToken(),end());})
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(5)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(6)).eContents().get(0)),line(),start());}'dialogues'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(6)).eContents().get(1)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(6)).eContents().get(2)),line(),start());}temp_dialogues=ruleDialogueCall {factory.add($result,"dialogues",convert(temp_dialogues),false); ptm.ruleFinished(temp_dialogues,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(6)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(7)).eContents().get(0)),line(),start());}'processes'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(7)).eContents().get(1)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(7)).eContents().get(2)),line(),start());}temp_processes=ruleProcessCall {factory.add($result,"processes",convert(temp_processes),false); ptm.ruleFinished(temp_processes,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(7)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)),line(),start());}
temp_CollectionDialogue=ruleCollectionDialogue {$result=temp_CollectionDialogue;}
{ptm.ruleFinished(getLastToken(),end());})
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)),line(),start());}
temp_MasterDetail=ruleMasterDetail {$result=temp_MasterDetail;}
{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleCollectionDialogue returns [EObject result] :
			{
				$result = factory.create("", "CollectionDialogue");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)),line(),start());}'CollectionDialogue'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());}'using'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)),line(),start());}temp_contextRef=RULE_ID
 {factory.set($result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());}'readonly'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}temp_readonly='true' {factory.set($result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); }
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());}'false'{ptm.ruleFinished(getLastToken(),end());})
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(0)),line(),start());}'dialogues'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(1)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(2)),line(),start());}temp_dialogues=ruleDialogueCall {factory.add($result,"dialogues",convert(temp_dialogues),false); ptm.ruleFinished(temp_dialogues,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());}'processes'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(2)),line(),start());}temp_processes=ruleProcessCall {factory.add($result,"processes",convert(temp_processes),false); ptm.ruleFinished(temp_processes,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?
)
;

ruleMasterDetail returns [EObject result] :
			{
				$result = factory.create("", "MasterDetail");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());}'MasterDetail'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)),line(),start());}'using'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(4)),line(),start());}temp_contextRef=RULE_ID
 {factory.set($result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());}'readonly'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}temp_readonly='true' {factory.set($result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); }
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());}'false'{ptm.ruleFinished(getLastToken(),end());})
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)).eContents().get(2)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(6)),line(),start());}'master'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(7)),line(),start());}temp_master=ruleDialogueCall {factory.set($result,"master",convert(temp_master),false); ptm.ruleFinished(temp_master,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(8)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(9)),line(),start());}'detail'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(10)),line(),start());}temp_detail=ruleDialogueCall {factory.set($result,"detail",convert(temp_detail),false); ptm.ruleFinished(temp_detail,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(11)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(12)).eContents().get(0)),line(),start());}'processes'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(12)).eContents().get(1)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(12)).eContents().get(2)),line(),start());}temp_processes=ruleProcessCall {factory.add($result,"processes",convert(temp_processes),false); ptm.ruleFinished(temp_processes,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(12)).eContents().get(3)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?
)
;

ruleProcess returns [EObject result] :
        temp_automatedprocess=ruleAutomatedProcess {$result=temp_automatedprocess;}	|        temp_interactiveprocess=ruleInteractiveProcess {$result=temp_interactiveprocess;}	;

ruleAutomatedProcess returns [EObject result] :
			{
				$result = factory.create("", "AutomatedProcess");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());}'AutomatedProcess'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)),line(),start());}'using'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)),line(),start());}temp_contextRef=RULE_ID
 {factory.set($result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); }
)
)
;

ruleInteractiveProcess returns [EObject result] :
			{
				$result = factory.create("", "InteractiveProcess");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());}'InteractiveProcess'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)),line(),start());}'using'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(4)),line(),start());}temp_contextRef=RULE_ID
 {factory.set($result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); }
)
)
;

ruleFormElement returns [EObject result] :
			{
				$result = factory.create("", "FormElement");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());}'formElement'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}'navigate'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}
temp_LinkRef=ruleLinkRef {$result=temp_LinkRef;}
{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}'to'{ptm.ruleFinished(getLastToken(),end());})
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)),line(),start());}temp_references=ruleDtoPropertyReference {factory.set($result,"references",convert(temp_references),false); ptm.ruleFinished(temp_references,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)),line(),start());}'named'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());}'readonly'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}temp_readonly='true' {factory.set($result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); }
)
	|
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());}'false'{ptm.ruleFinished(getLastToken(),end());})
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(6)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleDialogueCall returns [EObject result] :
        temp_directdialoguecall=ruleDirectDialogueCall {$result=temp_directdialoguecall;}	|        temp_linkeddialoguecall=ruleLinkedDialogueCall {$result=temp_linkeddialoguecall;}	;

ruleLinkedDialogueCall returns [EObject result] :
			{
				$result = factory.create("", "LinkedDialogueCall");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)),line(),start());}'navigate'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)),line(),start());}temp_link=ruleLinkRef {factory.set($result,"link",convert(temp_link),false); ptm.ruleFinished(temp_link,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(2)),line(),start());}'to'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(3)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(4)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleDirectDialogueCall returns [EObject result] :
			{
				$result = factory.create("", "DirectDialogueCall");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleProcessCall returns [EObject result] :
			{
				$result = factory.create("", "ProcessCall");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleLinkRef returns [EObject result] :
			{
				$result = factory.create("", "LinkRef");
				ptm.setModelElement($result);
			 }
({ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
;

ruleLink returns [EObject result] :
        temp_linkstep=ruleLinkStep {$result=temp_linkstep;}	|        temp_linkpath=ruleLinkPath {$result=temp_linkpath;}	;

ruleLinkStep returns [EObject result] :
			{
				$result = factory.create("", "LinkStep");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(1)),line(),start());}'LinkStep'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(3)),line(),start());}'using'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(4)),line(),start());}temp_contextRef=RULE_ID
 {factory.set($result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(5)),line(),start());}'navigate'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(6)),line(),start());}temp_reference=ruleAssociationRoleReference {factory.set($result,"reference",convert(temp_reference),false); ptm.ruleFinished(temp_reference,end()); }
)
)
;

ruleLinkPath returns [EObject result] :
			{
				$result = factory.create("", "LinkPath");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(0)),line(),start());}temp_description=RULE_STRING {factory.set($result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); }
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)),line(),start());}'LinkPath'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(3)),line(),start());}'using'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(4)),line(),start());}temp_contextRef=RULE_ID
 {factory.set($result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); }
)
)
;

ruleDtoPropertyReference returns [EObject result] :
			{
				$result = factory.create("", "DtoPropertyReference");
				ptm.setModelElement($result);
			 }
({ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)
;

ruleAssociationRoleReference returns [EObject result] :
			{
				$result = factory.create("", "AssociationRoleReference");
				ptm.setModelElement($result);
			 }
({ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
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

