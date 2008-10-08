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

T10 : 'DataContract' ;
T11 : 'from' ;
T12 : 'import' ;
T13 : 'BusinessClassDto' ;
T14 : 'base' ;
T15 : '[' ;
T16 : 'references' ;
T17 : ']' ;
T18 : 'EnumerationDto' ;
T19 : ';' ;
T20 : 'ListDto' ;
T21 : 'CustomDto' ;
T22 : 'boolean' ;
T23 : 'string' ;
T24 : 'datetime' ;
T25 : 'integer' ;
T26 : 'decimal' ;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 428
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 434
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 441
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 447
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 453
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g" 459
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

