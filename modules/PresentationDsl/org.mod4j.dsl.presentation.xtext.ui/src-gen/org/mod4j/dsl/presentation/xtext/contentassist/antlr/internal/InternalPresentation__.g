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
T15 : 'remove' ;
T16 : 'presentation' ;
T17 : ';' ;
T18 : 'from' ;
T19 : 'import' ;
T20 : 'ContentForm' ;
T21 : 'context' ;
T22 : '[' ;
T23 : ']' ;
T24 : 'readonly' ;
T25 : 'actions' ;
T26 : 'processes' ;
T27 : 'use' ;
T28 : 'CompoundDialogue' ;
T29 : 'dialogues' ;
T30 : 'CollectionDialogue' ;
T31 : 'MasterDetail' ;
T32 : 'master' ;
T33 : 'detail' ;
T34 : 'AutomatedProcess' ;
T35 : 'steps' ;
T36 : 'InteractiveProcess' ;
T37 : 'element' ;
T38 : 'label' ;
T39 : 'alias' ;
T40 : 'to' ;
T41 : 'linkref' ;
T42 : 'call' ;
T43 : '.' ;
T44 : 'LinkStep' ;
T45 : 'navigate' ;
T46 : 'LinkPath' ;
T47 : 'dialogue' ;
T48 : 'process' ;
T49 : 'list' ;
T50 : 'true' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6344
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6346
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6348
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6350
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6352
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6354
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6356
RULE_ANY_OTHER : .;


