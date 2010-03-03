lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'link' ;
T12 : 'false' ;
T13 : ';' ;
T14 : 'new' ;
T15 : 'save' ;
T16 : 'edit' ;
T17 : 'delete' ;
T18 : 'cancel' ;
T19 : 'removefrom' ;
T20 : 'addto' ;
T21 : 'all' ;
T22 : 'find' ;
T23 : 'application' ;
T24 : 'from' ;
T25 : 'process' ;
T26 : 'presentation' ;
T27 : '[' ;
T28 : ']' ;
T29 : 'dto' ;
T30 : 'service' ;
T31 : 'form' ;
T32 : 'context' ;
T33 : 'readonly' ;
T34 : 'actions' ;
T35 : 'processes' ;
T36 : 'label' ;
T37 : 'CompoundDialogue' ;
T38 : 'dialogues' ;
T39 : 'CollectionDialogue' ;
T40 : 'MasterDetail' ;
T41 : 'master' ;
T42 : 'detail' ;
T43 : 'element' ;
T44 : ':' ;
T45 : 'if' ;
T46 : '(' ;
T47 : ')' ;
T48 : 'call' ;
T49 : '.' ;
T50 : 'navigate' ;
T51 : 'list' ;
T52 : 'true' ;
T53 : 'composite' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 7119
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 7121
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 7123
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 7125
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 7127
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 7129
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 7131
RULE_ANY_OTHER : .;


