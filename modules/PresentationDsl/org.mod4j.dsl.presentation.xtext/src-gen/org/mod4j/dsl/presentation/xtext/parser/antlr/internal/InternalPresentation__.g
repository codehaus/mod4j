lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'presentation' ;
T12 : ';' ;
T13 : 'from' ;
T14 : 'import' ;
T15 : 'ListForm' ;
T16 : 'ContentForm' ;
T17 : 'context' ;
T18 : '[' ;
T19 : 'readonly' ;
T20 : 'true' ;
T21 : 'false' ;
T22 : 'actions' ;
T23 : ']' ;
T24 : 'processes' ;
T25 : 'use' ;
T26 : 'CompoundDialogue' ;
T27 : 'dialogues' ;
T28 : 'CollectionDialogue' ;
T29 : 'MasterDetail' ;
T30 : 'master' ;
T31 : 'detail' ;
T32 : 'Process' ;
T33 : 'start' ;
T34 : 'step' ;
T35 : 'element' ;
T36 : 'label' ;
T37 : 'to' ;
T38 : 'alias' ;
T39 : '(' ;
T40 : ',' ;
T41 : ')' ;
T42 : ':' ;
T43 : 'call' ;
T44 : '.' ;
T45 : 'navigate' ;
T46 : 'dialogue' ;
T47 : 'process' ;
T48 : 'new' ;
T49 : 'save' ;
T50 : 'edit' ;
T51 : 'remove' ;
T52 : 'Cancel' ;
T53 : 'all' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2387
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2389
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2391
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2393
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2395
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2397
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2399
RULE_ANY_OTHER : .;


