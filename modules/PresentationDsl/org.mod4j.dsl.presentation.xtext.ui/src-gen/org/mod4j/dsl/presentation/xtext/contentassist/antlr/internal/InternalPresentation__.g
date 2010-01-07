lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'batch' ;
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
T36 : 'AutomatedProcess' ;
T37 : 'steps' ;
T38 : 'InteractiveProcess' ;
T39 : 'step' ;
T40 : 'element' ;
T41 : 'label' ;
T42 : 'to' ;
T43 : 'alias' ;
T44 : '(' ;
T45 : ')' ;
T46 : ',' ;
T47 : 'call' ;
T48 : '.' ;
T49 : ':' ;
T50 : 'navigate' ;
T51 : 'dialogue' ;
T52 : 'process' ;
T53 : 'ListForm' ;
T54 : 'true' ;
T55 : 'start' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6362
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6364
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6366
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6368
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6370
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6372
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6374
RULE_ANY_OTHER : .;


