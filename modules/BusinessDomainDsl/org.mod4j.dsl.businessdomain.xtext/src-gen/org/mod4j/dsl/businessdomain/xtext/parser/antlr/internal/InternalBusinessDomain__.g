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
T15 : 'references' ;
T16 : '<->' ;
T17 : '->' ;
T18 : 'table' ;
T19 : 'ordered' ;
T20 : 'column' ;
T21 : 'class' ;
T22 : 'inherits' ;
T23 : '[' ;
T24 : 'rules' ;
T25 : ']' ;
T26 : 'enumeration' ;
T27 : '=' ;
T28 : 'unique' ;
T29 : ',' ;
T30 : 'nullable' ;
T31 : 'derived' ;
T32 : 'writable' ;
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
T46 : 'many' ;
T47 : 'one' ;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2240
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2242
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2244
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2246
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2248
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2250
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g" 2252
RULE_ANY_OTHER : .;


