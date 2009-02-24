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
T18 : 'ordered' ;
T19 : ';' ;
T20 : '0..*' ;
T21 : '1' ;
T22 : '1..*' ;
T23 : '0..1' ;
T24 : 'Class' ;
T25 : 'inherits' ;
T26 : 'Rules' ;
T27 : 'Enumeration' ;
T28 : '=' ;
T29 : 'unique' ;
T30 : 'nullable' ;
T31 : 'boolean' ;
T32 : 'default' ;
T33 : 'true' ;
T34 : 'false' ;
T35 : 'string' ;
T36 : 'minlength' ;
T37 : 'maxlength' ;
T38 : 'regexp' ;
T39 : 'datetime' ;
T40 : 'integer' ;
T41 : 'min' ;
T42 : 'max' ;
T43 : 'decimal' ;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 558
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 564
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 571
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 577
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 583
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 589
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

