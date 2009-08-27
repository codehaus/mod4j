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
T17 : 'from' ;
T18 : 'import' ;
T19 : 'association' ;
T20 : 'class' ;
T21 : '[' ;
T22 : ']' ;
T23 : 'inherits' ;
T24 : 'rules' ;
T25 : 'enumeration' ;
T26 : '=' ;
T27 : 'unique' ;
T28 : ',' ;
T29 : 'minlength' ;
T30 : 'maxlength' ;
T31 : 'regexp' ;
T32 : 'min' ;
T33 : 'max' ;
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

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4172
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4174
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4176
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4178
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4180
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4182
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4184
RULE_ANY_OTHER : .;


