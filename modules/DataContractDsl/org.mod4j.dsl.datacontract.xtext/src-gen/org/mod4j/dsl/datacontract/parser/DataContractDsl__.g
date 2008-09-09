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
package org.mod4j.dsl.datacontract.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'DataContract' ;
T11 : 'import' ;
T12 : 'DomainDto' ;
T13 : 'base' ;
T14 : '[' ;
T15 : ']' ;
T16 : 'ListDto' ;
T17 : 'CustomDto' ;
T18 : ';' ;
T19 : 'boolean' ;
T20 : 'string' ;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g" 271
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g" 277
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g" 284
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g" 290
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g" 296
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g" 302
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

