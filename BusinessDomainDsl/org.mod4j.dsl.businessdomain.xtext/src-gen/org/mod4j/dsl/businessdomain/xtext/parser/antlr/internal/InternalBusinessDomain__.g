lexer grammar InternalBusinessDomain;
@header {
package org.mod4j.dsl.businessdomain.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'domain' ;
T12 : ';' ;
T13 : 'from' ;
T14 : 'import' ;
T15 : 'association' ;
T16 : '<->' ;
T17 : '->' ;
T18 : 'ordered' ;
T19 : 'class' ;
T20 : 'inherits' ;
T21 : '[' ;
T22 : 'rules' ;
T23 : ']' ;
T24 : 'enumeration' ;
T25 : '=' ;
T26 : 'unique' ;
T27 : ',' ;
T28 : 'nullable' ;
T29 : 'derived' ;
T30 : 'writable' ;
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
T44 : 'many' ;
T45 : 'one' ;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2024
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2026
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2028
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2030
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2032
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2034
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2036
RULE_ANY_OTHER : .;


