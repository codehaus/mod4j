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
T18 : 'foreign key' ;
T19 : 'table' ;
T20 : 'column' ;
T21 : 'class' ;
T22 : '[' ;
T23 : ']' ;
T24 : 'inherits' ;
T25 : 'rules' ;
T26 : 'enumeration' ;
T27 : '=' ;
T28 : 'unique' ;
T29 : ',' ;
T30 : 'minlength' ;
T31 : 'maxlength' ;
T32 : 'regexp' ;
T33 : 'min' ;
T34 : 'max' ;
T35 : '<->' ;
T36 : 'ordered' ;
T37 : 'nullable' ;
T38 : 'derived' ;
T39 : 'writable' ;
T40 : 'boolean' ;
T41 : 'default' ;
T42 : 'true' ;
T43 : 'string' ;
T44 : 'datetime' ;
T45 : 'integer' ;
T46 : 'decimal' ;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4450
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4452
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4454
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4456
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4458
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4460
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g" 4462
RULE_ANY_OTHER : .;


