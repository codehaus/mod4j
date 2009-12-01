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
T17 : '[' ;
T18 : 'readonly' ;
T19 : 'true' ;
T20 : 'false' ;
T21 : 'processes' ;
T22 : ']' ;
T23 : 'CompoundDialogue' ;
T24 : 'dialogues' ;
T25 : 'CollectionDialogue' ;
T26 : 'MasterDetail' ;
T27 : 'master' ;
T28 : 'detail' ;
T29 : 'AutomatedProcess' ;
T30 : 'steps' ;
T31 : 'InteractiveProcess' ;
T32 : 'element' ;
T33 : 'label' ;
T34 : 'alias' ;
T35 : 'navigate' ;
T36 : 'to' ;
T37 : 'LinkStep' ;
T38 : 'LinkPath' ;
T39 : 'dialogue' ;
T40 : 'process' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2350
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2352
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2354
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2356
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2358
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2360
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2362
RULE_ANY_OTHER : .;


