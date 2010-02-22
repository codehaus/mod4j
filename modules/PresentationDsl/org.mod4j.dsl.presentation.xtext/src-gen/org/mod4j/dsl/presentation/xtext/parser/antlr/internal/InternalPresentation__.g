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
T39 : 'if' ;
T40 : '(' ;
T41 : ')' ;
T42 : 'dialogue' ;
T43 : 'process' ;
T44 : 'call' ;
T45 : 'service' ;
T46 : '.' ;
T47 : 'composite' ;
T48 : 'navigate' ;
T49 : 'new' ;
T50 : 'save' ;
T51 : 'edit' ;
T52 : 'delete' ;
T53 : 'cancel' ;
T54 : 'removefrom' ;
T55 : 'addto' ;
T56 : 'all' ;
T57 : 'find' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2595
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2597
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2599
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2601
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2603
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2605
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2607
RULE_ANY_OTHER : .;


