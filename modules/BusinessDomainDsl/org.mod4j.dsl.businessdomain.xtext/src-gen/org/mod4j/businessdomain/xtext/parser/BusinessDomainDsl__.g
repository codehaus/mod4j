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

T10 : 'Model' ;
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
T32 : 'persistency' ;
T33 : 'boolean' ;
T34 : 'default' ;
T35 : 'true' ;
T36 : 'false' ;
T37 : 'string' ;
T38 : 'minlength' ;
T39 : 'maxlength' ;
T40 : 'regexp' ;
T41 : 'datetime' ;
T42 : 'integer' ;
T43 : 'min' ;
T44 : 'max' ;
T45 : 'decimal' ;
T46 : 'ReadWrite' ;
T47 : 'Read' ;
T48 : 'NONE' ;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 587
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 593
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 600
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 606
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 612
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 618
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

