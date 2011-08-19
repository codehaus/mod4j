lexer grammar InternalBusinessDomain;
@header {
package org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : '->' ;
T12 : 'false' ;
T13 : 'many' ;
T14 : 'one' ;
T15 : 'domain' ;
T16 : ';' ;
T17 : 'association' ;
T18 : 'class' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'inherits' ;
T22 : 'rules' ;
T23 : 'enumeration' ;
T24 : '=' ;
T25 : 'unique' ;
T26 : ',' ;
T27 : 'minlength' ;
T28 : 'maxlength' ;
T29 : 'regexp' ;
T30 : 'min' ;
T31 : 'max' ;
T32 : 'precision' ;
T33 : 'scale' ;
T34 : '<->' ;
T35 : 'ordered' ;
T36 : 'nullable' ;
T37 : 'derived' ;
T38 : 'writable' ;
T39 : 'boolean' ;
T40 : 'default' ;
T41 : 'true' ;
T42 : 'string' ;
T43 : 'datetime' ;
T44 : 'integer' ;
T45 : 'decimal' ;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4127
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4129
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4131
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4133
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4135
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4137
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4139
RULE_ANY_OTHER : .;


