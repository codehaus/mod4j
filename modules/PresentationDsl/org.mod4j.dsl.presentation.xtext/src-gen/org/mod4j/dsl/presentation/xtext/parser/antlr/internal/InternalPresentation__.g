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
T35 : 'dialogue' ;
T36 : ':' ;
T37 : 'if' ;
T38 : '(' ;
T39 : ')' ;
T40 : 'call' ;
T41 : 'service' ;
T42 : '.' ;
T43 : 'composite' ;
T44 : 'navigate' ;
T45 : 'new' ;
T46 : 'save' ;
T47 : 'edit' ;
T48 : 'delete' ;
T49 : 'cancel' ;
T50 : 'removefrom' ;
T51 : 'addto' ;
T52 : 'link' ;
T53 : 'all' ;
T54 : 'find' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2693
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2695
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2697
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2699
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2701
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2703
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2705
RULE_ANY_OTHER : .;


