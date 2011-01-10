lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'application' ;
T12 : ';' ;
T13 : 'presentation' ;
T14 : 'menu' ;
T15 : '[' ;
T16 : ']' ;
T17 : 'from' ;
T18 : 'dto' ;
T19 : 'page' ;
T20 : 'service' ;
T21 : 'panel' ;
T22 : 'extends' ;
T23 : 'actions' ;
T24 : 'context' ;
T25 : 'list' ;
T26 : 'label' ;
T27 : ':' ;
T28 : '-->' ;
T29 : 'collection' ;
T30 : 'shows' ;
T31 : 'readonly' ;
T32 : 'true' ;
T33 : 'false' ;
T34 : 'call' ;
T35 : 'navigate' ;
T36 : '.' ;
T37 : 'new' ;
T38 : 'save' ;
T39 : 'edit' ;
T40 : 'delete' ;
T41 : 'cancel' ;
T42 : 'removefrom' ;
T43 : 'addto' ;
T44 : 'custom' ;
T45 : 'link' ;
T46 : 'all' ;
T47 : 'find' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2054
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2056
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2058
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2060
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2062
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2064
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2066
RULE_ANY_OTHER : .;


