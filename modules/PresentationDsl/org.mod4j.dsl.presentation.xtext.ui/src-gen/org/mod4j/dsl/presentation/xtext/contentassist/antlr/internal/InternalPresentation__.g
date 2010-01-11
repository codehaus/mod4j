lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'ContentForm' ;
T12 : 'false' ;
T13 : 'new' ;
T14 : 'save' ;
T15 : 'edit' ;
T16 : 'remove' ;
T17 : 'cancel' ;
T18 : 'all' ;
T19 : 'find' ;
T20 : 'presentation' ;
T21 : ';' ;
T22 : 'from' ;
T23 : 'import' ;
T24 : 'context' ;
T25 : '[' ;
T26 : ']' ;
T27 : 'readonly' ;
T28 : 'actions' ;
T29 : 'processes' ;
T30 : 'use' ;
T31 : 'CompoundDialogue' ;
T32 : 'dialogues' ;
T33 : 'CollectionDialogue' ;
T34 : 'MasterDetail' ;
T35 : 'master' ;
T36 : 'detail' ;
T37 : 'Process' ;
T38 : 'step' ;
T39 : 'element' ;
T40 : 'label' ;
T41 : 'to' ;
T42 : 'alias' ;
T43 : '(' ;
T44 : ')' ;
T45 : ',' ;
T46 : 'call' ;
T47 : '.' ;
T48 : ':' ;
T49 : 'navigate' ;
T50 : 'dialogue' ;
T51 : 'process' ;
T52 : 'ListForm' ;
T53 : 'true' ;
T54 : 'start' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5777
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5779
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5781
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5783
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5785
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5787
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5789
RULE_ANY_OTHER : .;


