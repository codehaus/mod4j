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
T18 : 'column' ;
T19 : 'references' ;
T20 : 'table' ;
T21 : 'on' ;
T22 : 'class' ;
T23 : '[' ;
T24 : ']' ;
T25 : 'inherits' ;
T26 : 'rules' ;
T27 : 'enumeration' ;
T28 : '=' ;
T29 : 'unique' ;
T30 : ',' ;
T31 : 'minlength' ;
T32 : 'maxlength' ;
T33 : 'regexp' ;
T34 : 'min' ;
T35 : 'max' ;
T36 : '<->' ;
T37 : 'ordered' ;
T38 : 'nullable' ;
T39 : 'derived' ;
T40 : 'writable' ;
T41 : 'boolean' ;
T42 : 'default' ;
T43 : 'true' ;
T44 : 'string' ;
T45 : 'datetime' ;
T46 : 'integer' ;
T47 : 'decimal' ;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4854
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4856
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4858
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4860
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4862
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4864
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4866
RULE_ANY_OTHER : .;


