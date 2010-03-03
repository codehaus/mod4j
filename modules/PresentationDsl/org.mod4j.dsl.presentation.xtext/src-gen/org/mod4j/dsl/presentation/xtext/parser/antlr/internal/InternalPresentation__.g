lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'application' ;
T12 : ';' ;
T13 : 'from' ;
T14 : 'process' ;
T15 : 'presentation' ;
T16 : '[' ;
T17 : ']' ;
T18 : 'dto' ;
T19 : 'service' ;
T20 : 'form' ;
T21 : 'context' ;
T22 : 'list' ;
T23 : 'readonly' ;
T24 : 'true' ;
T25 : 'false' ;
T26 : 'actions' ;
T27 : 'processes' ;
T28 : 'label' ;
T29 : 'CompoundDialogue' ;
T30 : 'dialogues' ;
T31 : 'CollectionDialogue' ;
T32 : 'MasterDetail' ;
T33 : 'master' ;
T34 : 'detail' ;
T35 : 'element' ;
T36 : ':' ;
T37 : 'if' ;
T38 : '(' ;
T39 : ')' ;
T40 : 'call' ;
T41 : '.' ;
T42 : 'composite' ;
T43 : 'navigate' ;
T44 : 'new' ;
T45 : 'save' ;
T46 : 'edit' ;
T47 : 'delete' ;
T48 : 'cancel' ;
T49 : 'removefrom' ;
T50 : 'addto' ;
T51 : 'link' ;
T52 : 'all' ;
T53 : 'find' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 3107
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 3109
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 3111
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 3113
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 3115
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 3117
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 3119
RULE_ANY_OTHER : .;


