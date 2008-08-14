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
T11 : 'import' ;
T12 : 'Association' ;
T13 : '[' ;
T14 : ']' ;
T15 : '<->' ;
T16 : '->' ;
T17 : ';' ;
T18 : '0..*' ;
T19 : '1' ;
T20 : '1..*' ;
T21 : '0..1' ;
T22 : 'Class' ;
T23 : 'inherits' ;
T24 : 'Rules' ;
T25 : 'Enumeration' ;
T26 : '=' ;
T27 : 'unique' ;
T28 : 'abstract' ;
T29 : 'final' ;
T30 : 'nullable' ;
T31 : 'persistency' ;
T32 : 'boolean' ;
T33 : 'default' ;
T34 : 'true' ;
T35 : 'false' ;
T36 : 'string' ;
T37 : 'minlength' ;
T38 : 'maxlength' ;
T39 : 'regexp' ;
T40 : 'datetime' ;
T41 : 'month' ;
T42 : 'year' ;
T43 : 'day' ;
T44 : 'hour' ;
T45 : 'minute' ;
T46 : 'second' ;
T47 : 'millisecond' ;
T48 : 'integer' ;
T49 : 'min' ;
T50 : 'max' ;
T51 : 'decimal' ;
T52 : 'ReadWrite' ;
T53 : 'Read' ;
T54 : 'NONE' ;

// $ANTLR src "..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 609
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 615
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 622
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 628
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 634
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g" 640
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

