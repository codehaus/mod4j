lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'ContentForm' ;
T12 : 'false' ;
T13 : 'batch' ;
T14 : 'new' ;
T15 : 'save' ;
T16 : 'edit' ;
T17 : 'remove' ;
T18 : 'presentation' ;
T19 : ';' ;
T20 : 'from' ;
T21 : 'import' ;
T22 : 'context' ;
T23 : '[' ;
T24 : ']' ;
T25 : 'readonly' ;
T26 : 'actions' ;
T27 : 'processes' ;
T28 : 'services' ;
T29 : ',' ;
T30 : 'use' ;
T31 : 'CompoundDialogue' ;
T32 : 'dialogues' ;
T33 : 'CollectionDialogue' ;
T34 : 'MasterDetail' ;
T35 : 'master' ;
T36 : 'detail' ;
T37 : 'AutomatedProcess' ;
T38 : 'steps' ;
T39 : 'InteractiveProcess' ;
T40 : 'step' ;
T41 : 'element' ;
T42 : 'label' ;
T43 : 'to' ;
T44 : 'alias' ;
T45 : '(' ;
T46 : ')' ;
T47 : 'call' ;
T48 : '.' ;
T49 : ':' ;
T50 : 'navigate' ;
T51 : 'dialogue' ;
T52 : 'process' ;
T53 : 'ListForm' ;
T54 : 'true' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6663
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6665
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6667
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6669
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6671
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6673
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g" 6675
RULE_ANY_OTHER : .;


