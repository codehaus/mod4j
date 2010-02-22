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
T15 : 'form' ;
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
T31 : 'process' ;
T32 : 'start' ;
T33 : 'element' ;
T34 : 'label' ;
T35 : 'to' ;
T36 : 'alias' ;
T37 : 'if' ;
T38 : '(' ;
T39 : ')' ;
T40 : 'dialogue' ;
T41 : 'call' ;
T42 : 'service' ;
T43 : '.' ;
T44 : 'composite' ;
T45 : 'navigate' ;
T46 : 'new' ;
T47 : 'save' ;
T48 : 'edit' ;
T49 : 'delete' ;
T50 : 'cancel' ;
T51 : 'removefrom' ;
T52 : 'addto' ;
T53 : 'all' ;
T54 : 'find' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2553
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2555
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2557
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2559
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2561
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2563
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2565
RULE_ANY_OTHER : .;


