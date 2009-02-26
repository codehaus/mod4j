lexer grammar PresentationDsl;
@members {
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
@header {
package org.mod4j.dsl.presentation.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'PresentationModel' ;
T11 : 'from' ;
T12 : 'import' ;
T13 : 'ContentForm' ;
T14 : 'using' ;
T15 : 'readonly' ;
T16 : 'true' ;
T17 : 'false' ;
T18 : ';' ;
T19 : 'Processes' ;
T20 : '[' ;
T21 : ']' ;
T22 : 'CompoundDialogue' ;
T23 : 'Dialogues' ;
T24 : 'CollectionDialogue' ;
T25 : 'AutomatedProcess' ;
T26 : 'InteractiveProcess' ;
T27 : 'FormElement' ;
T28 : 'references' ;
T29 : 'navigate' ;
T30 : 'Link' ;

// $ANTLR src "..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g" 480
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g" 486
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g" 493
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g" 499
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g" 505
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g" 511
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

