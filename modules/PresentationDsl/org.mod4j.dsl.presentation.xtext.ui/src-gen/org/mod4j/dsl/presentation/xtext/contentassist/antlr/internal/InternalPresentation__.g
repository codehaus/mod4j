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
T29 : 'import' ;
T30 : 'form' ;
T31 : 'context' ;
T32 : 'readonly' ;
T33 : 'actions' ;
T34 : 'processes' ;
T35 : 'label' ;
T36 : 'CompoundDialogue' ;
T37 : 'dialogues' ;
T38 : 'CollectionDialogue' ;
T39 : 'MasterDetail' ;
T40 : 'master' ;
T41 : 'detail' ;
T42 : 'element' ;
T43 : ':' ;
T44 : 'if' ;
T45 : '(' ;
T46 : ')' ;
T47 : 'call' ;
T48 : 'service' ;
T49 : '.' ;
T50 : 'navigate' ;
T51 : 'list' ;
T52 : 'true' ;
T53 : 'composite' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6726
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6728
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6730
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6732
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6734
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6736
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6738
RULE_ANY_OTHER : .;


