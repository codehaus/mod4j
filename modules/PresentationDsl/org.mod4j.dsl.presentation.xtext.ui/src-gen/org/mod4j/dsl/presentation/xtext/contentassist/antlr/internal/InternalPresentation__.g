lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'all' ;
T12 : 'ContentForm' ;
T13 : 'false' ;
T14 : 'new' ;
T15 : 'save' ;
T16 : 'edit' ;
T17 : 'remove' ;
T18 : 'Cancel' ;
T19 : 'presentation' ;
T20 : ';' ;
T21 : 'from' ;
T22 : 'import' ;
T23 : 'context' ;
T24 : '[' ;
T25 : ']' ;
T26 : 'readonly' ;
T27 : 'actions' ;
T28 : 'processes' ;
T29 : 'use' ;
T30 : 'CompoundDialogue' ;
T31 : 'dialogues' ;
T32 : 'CollectionDialogue' ;
T33 : 'MasterDetail' ;
T34 : 'master' ;
T35 : 'detail' ;
T36 : 'Process' ;
T37 : 'step' ;
T38 : 'element' ;
T39 : 'label' ;
T40 : 'to' ;
T41 : 'alias' ;
T42 : '(' ;
T43 : ')' ;
T44 : ',' ;
T45 : 'call' ;
T46 : '.' ;
T47 : ':' ;
T48 : 'navigate' ;
T49 : 'dialogue' ;
T50 : 'process' ;
T51 : 'ListForm' ;
T52 : 'true' ;
T53 : 'start' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5754
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5756
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5758
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5760
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5762
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5764
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5766
RULE_ANY_OTHER : .;


