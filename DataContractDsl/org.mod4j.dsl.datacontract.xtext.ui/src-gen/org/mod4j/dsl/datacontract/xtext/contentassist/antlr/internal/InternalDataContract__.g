lexer grammar InternalDataContract;
@header {
package org.mod4j.dsl.datacontract.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : ';' ;
T12 : 'datacontract' ;
T13 : 'from' ;
T14 : 'import' ;
T15 : 'class' ;
T16 : 'represents' ;
T17 : '[' ;
T18 : ']' ;
T19 : 'references' ;
T20 : 'enumeration' ;
T21 : 'as' ;
T22 : 'custom' ;
T23 : 'boolean' ;
T24 : 'string' ;
T25 : 'datetime' ;
T26 : 'integer' ;
T27 : 'decimal' ;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2567
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2569
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2571
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2573
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2575
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2577
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2579
RULE_ANY_OTHER : .;


