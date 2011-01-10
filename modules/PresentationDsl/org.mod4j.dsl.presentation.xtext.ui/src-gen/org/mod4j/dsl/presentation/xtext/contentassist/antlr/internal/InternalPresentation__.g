lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'link' ;
T12 : 'false' ;
T13 : 'new' ;
T14 : 'save' ;
T15 : 'edit' ;
T16 : 'delete' ;
T17 : 'cancel' ;
T18 : 'removefrom' ;
T19 : 'addto' ;
T20 : 'custom' ;
T21 : 'all' ;
T22 : 'find' ;
T23 : 'application' ;
T24 : ';' ;
T25 : 'presentation' ;
T26 : 'menu' ;
T27 : '[' ;
T28 : ']' ;
T29 : 'from' ;
T30 : 'dto' ;
T31 : 'page' ;
T32 : 'service' ;
T33 : 'panel' ;
T34 : 'extends' ;
T35 : 'actions' ;
T36 : 'context' ;
T37 : ':' ;
T38 : 'label' ;
T39 : '-->' ;
T40 : 'shows' ;
T41 : 'readonly' ;
T42 : 'call' ;
T43 : 'navigate' ;
T44 : '.' ;
T45 : 'list' ;
T46 : 'collection' ;
T47 : 'true' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 4206
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 4208
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 4210
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 4212
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 4214
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 4216
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 4218
RULE_ANY_OTHER : .;


