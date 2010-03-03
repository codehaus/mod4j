lexer grammar InternalPresentation;
@header {
package org.mod4j.dsl.presentation.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'application' ;
T12 : ';' ;
T13 : 'from' ;
T14 : 'process' ;
T15 : 'presentation' ;
T16 : '[' ;
T17 : ']' ;
T18 : 'import' ;
T19 : 'form' ;
T20 : 'context' ;
T21 : 'list' ;
T22 : 'readonly' ;
T23 : 'true' ;
T24 : 'false' ;
T25 : 'actions' ;
T26 : 'processes' ;
T27 : 'label' ;
T28 : 'CompoundDialogue' ;
T29 : 'dialogues' ;
T30 : 'CollectionDialogue' ;
T31 : 'MasterDetail' ;
T32 : 'master' ;
T33 : 'detail' ;
T34 : 'element' ;
T35 : ':' ;
T36 : 'if' ;
T37 : '(' ;
T38 : ')' ;
T39 : 'call' ;
T40 : 'service' ;
T41 : '.' ;
T42 : 'composite' ;
T43 : 'navigate' ;
T44 : 'new' ;
T45 : 'save' ;
T46 : 'edit' ;
T47 : 'delete' ;
T48 : 'cancel' ;
T49 : 'removefrom' ;
T50 : 'addto' ;
T51 : 'link' ;
T52 : 'all' ;
T53 : 'find' ;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2909
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2911
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2913
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2915
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2917
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2919
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g" 2921
RULE_ANY_OTHER : .;


