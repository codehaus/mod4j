lexer grammar DataContractDsl;
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
package org.mod4j.dsl.datacontract.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'datacontract' ;
T11 : ';' ;
T12 : 'from' ;
T13 : 'import' ;
T14 : 'class' ;
T15 : 'represents' ;
T16 : '[' ;
T17 : 'references' ;
T18 : ']' ;
T19 : 'enumeration' ;
T20 : 'as' ;
T21 : 'list' ;
T22 : 'contains' ;
T23 : 'custom' ;
T24 : 'boolean' ;
T25 : 'string' ;
T26 : 'datetime' ;
T27 : 'integer' ;
T28 : 'decimal' ;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 427
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 433
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 440
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 446
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 452
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 458
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

