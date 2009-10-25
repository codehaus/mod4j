lexer grammar InternalDataContract;
@header {
package org.mod4j.dsl.datacontract.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'datacontract' ;
T12 : ';' ;
T13 : 'from' ;
T14 : 'import' ;
T15 : 'class' ;
T16 : 'represents' ;
T17 : '[' ;
T18 : 'references' ;
T19 : ']' ;
T20 : 'enumeration' ;
T21 : 'as' ;
T22 : 'list' ;
T23 : 'contains' ;
T24 : 'custom' ;
T25 : 'boolean' ;
T26 : 'string' ;
T27 : 'datetime' ;
T28 : 'integer' ;
T29 : 'decimal' ;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1452
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1454
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1456
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1458
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1460
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1462
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g" 1464
RULE_ANY_OTHER : .;


