lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'link' ;
T12 : 'false' ;
T13 : 'new' ;
T14 : 'save' ;
T15 : 'edit' ;
T16 : 'delete' ;
T17 : 'cancel' ;
T18 : 'removefrom' ;
T19 : 'addto' ;
T20 : 'all' ;
T21 : 'find' ;
T22 : 'presentation' ;
T23 : ';' ;
T24 : 'application' ;
T25 : '[' ;
T26 : ']' ;
T27 : 'from' ;
T28 : 'import' ;
T29 : 'form' ;
T30 : 'context' ;
T31 : 'readonly' ;
T32 : 'actions' ;
T33 : 'processes' ;
T34 : 'label' ;
T35 : 'CompoundDialogue' ;
T36 : 'dialogues' ;
T37 : 'CollectionDialogue' ;
T38 : 'MasterDetail' ;
T39 : 'master' ;
T40 : 'detail' ;
T41 : 'process' ;
T42 : 'element' ;
T43 : 'dialogue' ;
T44 : ':' ;
T45 : 'if' ;
T46 : '(' ;
T47 : ')' ;
T48 : 'call' ;
T49 : 'service' ;
T50 : '.' ;
T51 : 'navigate' ;
T52 : 'list' ;
T53 : 'true' ;
T54 : 'composite' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6231
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6233
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6235
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6237
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6239
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6241
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6243
RULE_ANY_OTHER : .;


