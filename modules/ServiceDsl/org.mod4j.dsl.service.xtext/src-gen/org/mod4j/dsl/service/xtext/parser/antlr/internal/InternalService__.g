lexer grammar InternalService;
@header {
package org.mod4j.dsl.service.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'service' ;
T12 : ';' ;
T13 : 'for' ;
T14 : 'reference' ;
T15 : 'from' ;
T16 : 'import' ;
T17 : 'method' ;
T18 : 'in' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'out' ;
T22 : 'crud' ;
T23 : 'create' ;
T24 : 'read' ;
T25 : 'update' ;
T26 : 'delete' ;
T27 : 'listall' ;
T28 : 'find' ;
T29 : 'add' ;
T30 : 'remove' ;
T31 : 'get' ;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 897
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 899
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 901
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 903
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 905
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 907
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g" 909
RULE_ANY_OTHER : .;


