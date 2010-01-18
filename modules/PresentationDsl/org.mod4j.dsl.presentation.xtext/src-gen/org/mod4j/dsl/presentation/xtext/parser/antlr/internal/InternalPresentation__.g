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
T15 : 'ContentForm' ;
T16 : 'context' ;
T17 : 'list' ;
T18 : '[' ;
T19 : 'readonly' ;
T20 : 'true' ;
T21 : 'false' ;
T22 : 'actions' ;
T23 : ']' ;
T24 : 'processes' ;
T25 : 'CompoundDialogue' ;
T26 : 'dialogues' ;
T27 : 'CollectionDialogue' ;
T28 : 'MasterDetail' ;
T29 : 'master' ;
T30 : 'detail' ;
T31 : 'Process' ;
T32 : 'start' ;
T33 : 'step' ;
T34 : 'steps' ;
T35 : 'element' ;
T36 : 'label' ;
T37 : 'to' ;
T38 : 'alias' ;
T39 : ':' ;
T40 : 'service' ;
T41 : '.' ;
T42 : 'composite' ;
T43 : 'navigate' ;
T44 : 'dialogue' ;
T45 : 'process' ;
T46 : 'new' ;
T47 : 'save' ;
T48 : 'edit' ;
T49 : 'delete' ;
T50 : 'cancel' ;
T51 : 'removefrom' ;
T52 : 'addto' ;
T53 : 'all' ;
T54 : 'find' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2526
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2528
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2530
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2532
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2534
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2536
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2538
RULE_ANY_OTHER : .;


