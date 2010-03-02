lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'presentation' ;
T12 : ';' ;
T13 : 'application' ;
T14 : '[' ;
T15 : ']' ;
T16 : 'from' ;
T17 : 'import' ;
T18 : 'form' ;
T19 : 'context' ;
T20 : 'list' ;
T21 : 'readonly' ;
T22 : 'true' ;
T23 : 'false' ;
T24 : 'actions' ;
T25 : 'processes' ;
T26 : 'label' ;
T27 : 'CompoundDialogue' ;
T28 : 'dialogues' ;
T29 : 'CollectionDialogue' ;
T30 : 'MasterDetail' ;
T31 : 'master' ;
T32 : 'detail' ;
T33 : 'process' ;
T34 : 'element' ;
T35 : ':' ;
T36 : 'if' ;
T37 : '(' ;
T38 : ')' ;
T39 : 'call' ;
T40 : 'service' ;
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

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2668
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2670
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2672
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2674
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2676
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2678
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2680
RULE_ANY_OTHER : .;


