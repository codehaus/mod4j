lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'false' ;
T12 : 'new' ;
T13 : 'save' ;
T14 : 'edit' ;
T15 : 'delete' ;
T16 : 'cancel' ;
T17 : 'removefrom' ;
T18 : 'addto' ;
T19 : 'all' ;
T20 : 'find' ;
T21 : 'presentation' ;
T22 : ';' ;
T23 : 'from' ;
T24 : 'import' ;
T25 : 'ContentForm' ;
T26 : 'context' ;
T27 : '[' ;
T28 : ']' ;
T29 : 'readonly' ;
T30 : 'actions' ;
T31 : 'processes' ;
T32 : 'CompoundDialogue' ;
T33 : 'dialogues' ;
T34 : 'CollectionDialogue' ;
T35 : 'MasterDetail' ;
T36 : 'master' ;
T37 : 'detail' ;
T38 : 'Process' ;
T39 : 'step' ;
T40 : 'steps' ;
T41 : 'element' ;
T42 : 'label' ;
T43 : 'to' ;
T44 : 'alias' ;
T45 : 'if' ;
T46 : '(' ;
T47 : ')' ;
T48 : 'service' ;
T49 : '.' ;
T50 : ':' ;
T51 : 'navigate' ;
T52 : 'dialogue' ;
T53 : 'process' ;
T54 : 'list' ;
T55 : 'true' ;
T56 : 'start' ;
T57 : 'composite' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6227
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6229
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6231
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6233
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6235
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6237
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6239
RULE_ANY_OTHER : .;


