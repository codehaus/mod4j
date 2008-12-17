lexer grammar BusinessDomainDsl;
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
package org.mod4j.businessdomain.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'BusinessDomain' ;
T11 : 'from' ;
T12 : 'import' ;
T13 : 'Association' ;
T14 : '[' ;
T15 : ']' ;
T16 : '<->' ;
T17 : '->' ;
T18 : ';' ;
T19 : '0..*' ;
T20 : '1' ;
T21 : '1..*' ;
T22 : '0..1' ;
T23 : 'Class' ;
T24 : 'inherits' ;
T25 : 'Rules' ;
T26 : 'Enumeration' ;
T27 : '=' ;
T28 : 'unique' ;
T29 : 'abstract' ;
T30 : 'final' ;
T31 : 'nullable' ;
T32 : 'boolean' ;
T33 : 'default' ;
T34 : 'true' ;
T35 : 'false' ;
T36 : 'string' ;
T37 : 'minlength' ;
T38 : 'maxlength' ;
T39 : 'regexp' ;
T40 : 'datetime' ;
T41 : 'integer' ;
T42 : 'min' ;
T43 : 'max' ;
T44 : 'decimal' ;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 567
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 573
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 580
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 586
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 592
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 598
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

