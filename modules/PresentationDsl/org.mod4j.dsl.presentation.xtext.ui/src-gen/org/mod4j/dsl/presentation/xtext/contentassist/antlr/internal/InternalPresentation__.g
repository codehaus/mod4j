lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'false' ;
T12 : 'presentation' ;
T13 : ';' ;
T14 : 'from' ;
T15 : 'import' ;
T16 : 'ContentForm' ;
T17 : 'context' ;
T18 : '[' ;
T19 : ']' ;
T20 : 'readonly' ;
T21 : 'actions' ;
T22 : 'processes' ;
T23 : 'use' ;
T24 : 'CompoundDialogue' ;
T25 : 'dialogues' ;
T26 : 'CollectionDialogue' ;
T27 : 'MasterDetail' ;
T28 : 'master' ;
T29 : 'detail' ;
T30 : 'AutomatedProcess' ;
T31 : 'steps' ;
T32 : 'InteractiveProcess' ;
T33 : 'element' ;
T34 : 'label' ;
T35 : 'alias' ;
T36 : 'navigate' ;
T37 : 'to' ;
T38 : 'LinkStep' ;
T39 : 'LinkPath' ;
T40 : 'dialogue' ;
T41 : 'process' ;
T42 : 'true' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5825
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5827
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5829
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5831
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5833
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5835
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 5837
RULE_ANY_OTHER : .;


