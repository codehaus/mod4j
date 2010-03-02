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
T23 : 'presentation' ;
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

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6247
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6249
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6251
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6253
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6255
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6257
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6259
RULE_ANY_OTHER : .;


