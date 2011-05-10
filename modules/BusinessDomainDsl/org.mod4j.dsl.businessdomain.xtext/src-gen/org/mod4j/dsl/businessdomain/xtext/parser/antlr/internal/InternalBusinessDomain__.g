lexer grammar InternalBusinessDomain;
@header {
package org.mod4j.dsl.businessdomain.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'domain' ;
T12 : ';' ;
T13 : 'association' ;
T14 : 'foreign key' ;
T15 : '<->' ;
T16 : '->' ;
T17 : 'table' ;
T18 : 'ordered' ;
T19 : 'column' ;
T20 : 'class' ;
T21 : 'inherits' ;
T22 : '[' ;
T23 : 'rules' ;
T24 : ']' ;
T25 : 'enumeration' ;
T26 : '=' ;
T27 : 'unique' ;
T28 : ',' ;
T29 : 'nullable' ;
T30 : 'derived' ;
T31 : 'writable' ;
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
T45 : 'many' ;
T46 : 'one' ;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2074
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2076
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2078
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2080
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2082
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2084
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2086
RULE_ANY_OTHER : .;


