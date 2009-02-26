lexer grammar ServiceDsl;
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
package org.mod4j.dsl.service.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'service' ;
T11 : ';' ;
T12 : 'for' ;
T13 : 'reference' ;
T14 : 'create' ;
T15 : 'read' ;
T16 : 'update' ;
T17 : 'delete' ;
T18 : 'listall' ;
T19 : 'find' ;
T20 : 'add' ;
T21 : 'remove' ;
T22 : 'from' ;
T23 : 'import' ;
T24 : 'method' ;
T25 : 'in' ;
T26 : '[' ;
T27 : ']' ;
T28 : 'out' ;
T29 : 'crud' ;

// $ANTLR src "..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g" 351
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g" 357
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g" 364
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g" 370
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g" 376
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g" 382
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

