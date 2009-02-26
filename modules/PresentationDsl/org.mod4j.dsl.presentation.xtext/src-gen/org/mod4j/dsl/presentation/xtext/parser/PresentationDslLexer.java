// $ANTLR 3.0 ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g 2009-02-26 13:45:50

package org.mod4j.dsl.presentation.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PresentationDslLexer extends Lexer {
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=8;
    public static final int T14=14;
    public static final int T29=29;
    public static final int RULE_ID=5;
    public static final int T22=22;
    public static final int T11=11;
    public static final int RULE_STRING=4;
    public static final int T12=12;
    public static final int T28=28;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T25=25;
    public static final int T18=18;
    public static final int RULE_WS=7;
    public static final int T26=26;
    public static final int T15=15;
    public static final int RULE_INT=6;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=31;
    public static final int T16=16;
    public static final int T27=27;
    public static final int RULE_SL_COMMENT=9;
    public static final int T30=30;
    public static final int T24=24;
    public static final int T19=19;

    	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg;
    	}

    public PresentationDslLexer() {;} 
    public PresentationDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:22:7: ( 'PresentationModel' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:22:7: 'PresentationModel'
            {
            match("PresentationModel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:23:7: ( 'from' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:23:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:24:7: ( 'import' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:24:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:25:7: ( 'ContentForm' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:25:7: 'ContentForm'
            {
            match("ContentForm"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:26:7: ( 'using' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:26:7: 'using'
            {
            match("using"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:27:7: ( 'readonly' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:27:7: 'readonly'
            {
            match("readonly"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:28:7: ( 'true' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:28:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:29:7: ( 'false' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:29:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:30:7: ( ';' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:30:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:31:7: ( 'Processes' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:31:7: 'Processes'
            {
            match("Processes"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:32:7: ( '[' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:32:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:33:7: ( ']' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:33:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:34:7: ( 'CompoundDialogue' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:34:7: 'CompoundDialogue'
            {
            match("CompoundDialogue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:35:7: ( 'Dialogues' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:35:7: 'Dialogues'
            {
            match("Dialogues"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:36:7: ( 'CollectionDialogue' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:36:7: 'CollectionDialogue'
            {
            match("CollectionDialogue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:37:7: ( 'AutomatedProcess' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:37:7: 'AutomatedProcess'
            {
            match("AutomatedProcess"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:38:7: ( 'InteractiveProcess' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:38:7: 'InteractiveProcess'
            {
            match("InteractiveProcess"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:39:7: ( 'FormElement' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:39:7: 'FormElement'
            {
            match("FormElement"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:40:7: ( 'references' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:40:7: 'references'
            {
            match("references"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:41:7: ( 'navigate' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:41:7: 'navigate'
            {
            match("navigate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:42:7: ( 'Link' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:42:7: 'Link'
            {
            match("Link"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:482:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:482:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:482:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:482:4: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:482:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:488:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("486:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:488:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:488:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:488:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:488:53: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:489:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:489:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:489:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:489:54: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:495:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:495:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:495:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:495:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:495:9: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:495:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_WS
    public void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:501:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:501:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:501:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ML_COMMENT
    public void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:507:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:507:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:507:8: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:507:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:513:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:513:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:513:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:513:8: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:513:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:513:22: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    public void mTokens() throws RecognitionException {
        // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=27;
        switch ( input.LA(1) ) {
        case 'P':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    int LA12_38 = input.LA(4);

                    if ( (LA12_38=='c') ) {
                        int LA12_56 = input.LA(5);

                        if ( (LA12_56=='e') ) {
                            int LA12_74 = input.LA(6);

                            if ( (LA12_74=='s') ) {
                                int LA12_92 = input.LA(7);

                                if ( (LA12_92=='s') ) {
                                    int LA12_107 = input.LA(8);

                                    if ( (LA12_107=='e') ) {
                                        int LA12_120 = input.LA(9);

                                        if ( (LA12_120=='s') ) {
                                            int LA12_132 = input.LA(10);

                                            if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                                                alt12=22;
                                            }
                                            else {
                                                alt12=10;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                    }
                    break;
                case 'e':
                    {
                    int LA12_39 = input.LA(4);

                    if ( (LA12_39=='s') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='e') ) {
                            int LA12_75 = input.LA(6);

                            if ( (LA12_75=='n') ) {
                                int LA12_93 = input.LA(7);

                                if ( (LA12_93=='t') ) {
                                    int LA12_108 = input.LA(8);

                                    if ( (LA12_108=='a') ) {
                                        int LA12_121 = input.LA(9);

                                        if ( (LA12_121=='t') ) {
                                            int LA12_133 = input.LA(10);

                                            if ( (LA12_133=='i') ) {
                                                int LA12_145 = input.LA(11);

                                                if ( (LA12_145=='o') ) {
                                                    int LA12_154 = input.LA(12);

                                                    if ( (LA12_154=='n') ) {
                                                        int LA12_162 = input.LA(13);

                                                        if ( (LA12_162=='M') ) {
                                                            int LA12_169 = input.LA(14);

                                                            if ( (LA12_169=='o') ) {
                                                                int LA12_174 = input.LA(15);

                                                                if ( (LA12_174=='d') ) {
                                                                    int LA12_179 = input.LA(16);

                                                                    if ( (LA12_179=='e') ) {
                                                                        int LA12_184 = input.LA(17);

                                                                        if ( (LA12_184=='l') ) {
                                                                            int LA12_189 = input.LA(18);

                                                                            if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                                                                                alt12=22;
                                                                            }
                                                                            else {
                                                                                alt12=1;}
                                                                        }
                                                                        else {
                                                                            alt12=22;}
                                                                    }
                                                                    else {
                                                                        alt12=22;}
                                                                }
                                                                else {
                                                                    alt12=22;}
                                                            }
                                                            else {
                                                                alt12=22;}
                                                        }
                                                        else {
                                                            alt12=22;}
                                                    }
                                                    else {
                                                        alt12=22;}
                                                }
                                                else {
                                                    alt12=22;}
                                            }
                                            else {
                                                alt12=22;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                    }
                    break;
                default:
                    alt12=22;}

            }
            else {
                alt12=22;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_23 = input.LA(3);

                if ( (LA12_23=='l') ) {
                    int LA12_40 = input.LA(4);

                    if ( (LA12_40=='s') ) {
                        int LA12_58 = input.LA(5);

                        if ( (LA12_58=='e') ) {
                            int LA12_76 = input.LA(6);

                            if ( ((LA12_76>='0' && LA12_76<='9')||(LA12_76>='A' && LA12_76<='Z')||LA12_76=='_'||(LA12_76>='a' && LA12_76<='z')) ) {
                                alt12=22;
                            }
                            else {
                                alt12=8;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
                }
                break;
            case 'r':
                {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='o') ) {
                    int LA12_41 = input.LA(4);

                    if ( (LA12_41=='m') ) {
                        int LA12_59 = input.LA(5);

                        if ( ((LA12_59>='0' && LA12_59<='9')||(LA12_59>='A' && LA12_59<='Z')||LA12_59=='_'||(LA12_59>='a' && LA12_59<='z')) ) {
                            alt12=22;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
                }
                break;
            default:
                alt12=22;}

            }
            break;
        case 'i':
            {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='m') ) {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='p') ) {
                    int LA12_42 = input.LA(4);

                    if ( (LA12_42=='o') ) {
                        int LA12_60 = input.LA(5);

                        if ( (LA12_60=='r') ) {
                            int LA12_78 = input.LA(6);

                            if ( (LA12_78=='t') ) {
                                int LA12_95 = input.LA(7);

                                if ( ((LA12_95>='0' && LA12_95<='9')||(LA12_95>='A' && LA12_95<='Z')||LA12_95=='_'||(LA12_95>='a' && LA12_95<='z')) ) {
                                    alt12=22;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case 'C':
            {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='o') ) {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA12_43 = input.LA(4);

                    if ( (LA12_43=='l') ) {
                        int LA12_61 = input.LA(5);

                        if ( (LA12_61=='e') ) {
                            int LA12_79 = input.LA(6);

                            if ( (LA12_79=='c') ) {
                                int LA12_96 = input.LA(7);

                                if ( (LA12_96=='t') ) {
                                    int LA12_110 = input.LA(8);

                                    if ( (LA12_110=='i') ) {
                                        int LA12_122 = input.LA(9);

                                        if ( (LA12_122=='o') ) {
                                            int LA12_134 = input.LA(10);

                                            if ( (LA12_134=='n') ) {
                                                int LA12_146 = input.LA(11);

                                                if ( (LA12_146=='D') ) {
                                                    int LA12_155 = input.LA(12);

                                                    if ( (LA12_155=='i') ) {
                                                        int LA12_163 = input.LA(13);

                                                        if ( (LA12_163=='a') ) {
                                                            int LA12_170 = input.LA(14);

                                                            if ( (LA12_170=='l') ) {
                                                                int LA12_175 = input.LA(15);

                                                                if ( (LA12_175=='o') ) {
                                                                    int LA12_180 = input.LA(16);

                                                                    if ( (LA12_180=='g') ) {
                                                                        int LA12_185 = input.LA(17);

                                                                        if ( (LA12_185=='u') ) {
                                                                            int LA12_190 = input.LA(18);

                                                                            if ( (LA12_190=='e') ) {
                                                                                int LA12_195 = input.LA(19);

                                                                                if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                                                                    alt12=22;
                                                                                }
                                                                                else {
                                                                                    alt12=15;}
                                                                            }
                                                                            else {
                                                                                alt12=22;}
                                                                        }
                                                                        else {
                                                                            alt12=22;}
                                                                    }
                                                                    else {
                                                                        alt12=22;}
                                                                }
                                                                else {
                                                                    alt12=22;}
                                                            }
                                                            else {
                                                                alt12=22;}
                                                        }
                                                        else {
                                                            alt12=22;}
                                                    }
                                                    else {
                                                        alt12=22;}
                                                }
                                                else {
                                                    alt12=22;}
                                            }
                                            else {
                                                alt12=22;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                    }
                    break;
                case 'n':
                    {
                    int LA12_44 = input.LA(4);

                    if ( (LA12_44=='t') ) {
                        int LA12_62 = input.LA(5);

                        if ( (LA12_62=='e') ) {
                            int LA12_80 = input.LA(6);

                            if ( (LA12_80=='n') ) {
                                int LA12_97 = input.LA(7);

                                if ( (LA12_97=='t') ) {
                                    int LA12_111 = input.LA(8);

                                    if ( (LA12_111=='F') ) {
                                        int LA12_123 = input.LA(9);

                                        if ( (LA12_123=='o') ) {
                                            int LA12_135 = input.LA(10);

                                            if ( (LA12_135=='r') ) {
                                                int LA12_147 = input.LA(11);

                                                if ( (LA12_147=='m') ) {
                                                    int LA12_156 = input.LA(12);

                                                    if ( ((LA12_156>='0' && LA12_156<='9')||(LA12_156>='A' && LA12_156<='Z')||LA12_156=='_'||(LA12_156>='a' && LA12_156<='z')) ) {
                                                        alt12=22;
                                                    }
                                                    else {
                                                        alt12=4;}
                                                }
                                                else {
                                                    alt12=22;}
                                            }
                                            else {
                                                alt12=22;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                    }
                    break;
                case 'm':
                    {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='p') ) {
                        int LA12_63 = input.LA(5);

                        if ( (LA12_63=='o') ) {
                            int LA12_81 = input.LA(6);

                            if ( (LA12_81=='u') ) {
                                int LA12_98 = input.LA(7);

                                if ( (LA12_98=='n') ) {
                                    int LA12_112 = input.LA(8);

                                    if ( (LA12_112=='d') ) {
                                        int LA12_124 = input.LA(9);

                                        if ( (LA12_124=='D') ) {
                                            int LA12_136 = input.LA(10);

                                            if ( (LA12_136=='i') ) {
                                                int LA12_148 = input.LA(11);

                                                if ( (LA12_148=='a') ) {
                                                    int LA12_157 = input.LA(12);

                                                    if ( (LA12_157=='l') ) {
                                                        int LA12_165 = input.LA(13);

                                                        if ( (LA12_165=='o') ) {
                                                            int LA12_171 = input.LA(14);

                                                            if ( (LA12_171=='g') ) {
                                                                int LA12_176 = input.LA(15);

                                                                if ( (LA12_176=='u') ) {
                                                                    int LA12_181 = input.LA(16);

                                                                    if ( (LA12_181=='e') ) {
                                                                        int LA12_186 = input.LA(17);

                                                                        if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                                                                            alt12=22;
                                                                        }
                                                                        else {
                                                                            alt12=13;}
                                                                    }
                                                                    else {
                                                                        alt12=22;}
                                                                }
                                                                else {
                                                                    alt12=22;}
                                                            }
                                                            else {
                                                                alt12=22;}
                                                        }
                                                        else {
                                                            alt12=22;}
                                                    }
                                                    else {
                                                        alt12=22;}
                                                }
                                                else {
                                                    alt12=22;}
                                            }
                                            else {
                                                alt12=22;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                    }
                    break;
                default:
                    alt12=22;}

            }
            else {
                alt12=22;}
            }
            break;
        case 'u':
            {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='s') ) {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='i') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='n') ) {
                        int LA12_64 = input.LA(5);

                        if ( (LA12_64=='g') ) {
                            int LA12_82 = input.LA(6);

                            if ( ((LA12_82>='0' && LA12_82<='9')||(LA12_82>='A' && LA12_82<='Z')||LA12_82=='_'||(LA12_82>='a' && LA12_82<='z')) ) {
                                alt12=22;
                            }
                            else {
                                alt12=5;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case 'r':
            {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='e') ) {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='d') ) {
                        int LA12_65 = input.LA(5);

                        if ( (LA12_65=='o') ) {
                            int LA12_83 = input.LA(6);

                            if ( (LA12_83=='n') ) {
                                int LA12_100 = input.LA(7);

                                if ( (LA12_100=='l') ) {
                                    int LA12_113 = input.LA(8);

                                    if ( (LA12_113=='y') ) {
                                        int LA12_125 = input.LA(9);

                                        if ( ((LA12_125>='0' && LA12_125<='9')||(LA12_125>='A' && LA12_125<='Z')||LA12_125=='_'||(LA12_125>='a' && LA12_125<='z')) ) {
                                            alt12=22;
                                        }
                                        else {
                                            alt12=6;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                    }
                    break;
                case 'f':
                    {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='e') ) {
                        int LA12_66 = input.LA(5);

                        if ( (LA12_66=='r') ) {
                            int LA12_84 = input.LA(6);

                            if ( (LA12_84=='e') ) {
                                int LA12_101 = input.LA(7);

                                if ( (LA12_101=='n') ) {
                                    int LA12_114 = input.LA(8);

                                    if ( (LA12_114=='c') ) {
                                        int LA12_126 = input.LA(9);

                                        if ( (LA12_126=='e') ) {
                                            int LA12_138 = input.LA(10);

                                            if ( (LA12_138=='s') ) {
                                                int LA12_149 = input.LA(11);

                                                if ( ((LA12_149>='0' && LA12_149<='9')||(LA12_149>='A' && LA12_149<='Z')||LA12_149=='_'||(LA12_149>='a' && LA12_149<='z')) ) {
                                                    alt12=22;
                                                }
                                                else {
                                                    alt12=19;}
                                            }
                                            else {
                                                alt12=22;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                    }
                    break;
                default:
                    alt12=22;}

            }
            else {
                alt12=22;}
            }
            break;
        case 't':
            {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='r') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='u') ) {
                    int LA12_49 = input.LA(4);

                    if ( (LA12_49=='e') ) {
                        int LA12_67 = input.LA(5);

                        if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                            alt12=22;
                        }
                        else {
                            alt12=7;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case ';':
            {
            alt12=9;
            }
            break;
        case '[':
            {
            alt12=11;
            }
            break;
        case ']':
            {
            alt12=12;
            }
            break;
        case 'D':
            {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='i') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='a') ) {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='l') ) {
                        int LA12_68 = input.LA(5);

                        if ( (LA12_68=='o') ) {
                            int LA12_86 = input.LA(6);

                            if ( (LA12_86=='g') ) {
                                int LA12_102 = input.LA(7);

                                if ( (LA12_102=='u') ) {
                                    int LA12_115 = input.LA(8);

                                    if ( (LA12_115=='e') ) {
                                        int LA12_127 = input.LA(9);

                                        if ( (LA12_127=='s') ) {
                                            int LA12_139 = input.LA(10);

                                            if ( ((LA12_139>='0' && LA12_139<='9')||(LA12_139>='A' && LA12_139<='Z')||LA12_139=='_'||(LA12_139>='a' && LA12_139<='z')) ) {
                                                alt12=22;
                                            }
                                            else {
                                                alt12=14;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case 'A':
            {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='u') ) {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='t') ) {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='o') ) {
                        int LA12_69 = input.LA(5);

                        if ( (LA12_69=='m') ) {
                            int LA12_87 = input.LA(6);

                            if ( (LA12_87=='a') ) {
                                int LA12_103 = input.LA(7);

                                if ( (LA12_103=='t') ) {
                                    int LA12_116 = input.LA(8);

                                    if ( (LA12_116=='e') ) {
                                        int LA12_128 = input.LA(9);

                                        if ( (LA12_128=='d') ) {
                                            int LA12_140 = input.LA(10);

                                            if ( (LA12_140=='P') ) {
                                                int LA12_151 = input.LA(11);

                                                if ( (LA12_151=='r') ) {
                                                    int LA12_159 = input.LA(12);

                                                    if ( (LA12_159=='o') ) {
                                                        int LA12_166 = input.LA(13);

                                                        if ( (LA12_166=='c') ) {
                                                            int LA12_172 = input.LA(14);

                                                            if ( (LA12_172=='e') ) {
                                                                int LA12_177 = input.LA(15);

                                                                if ( (LA12_177=='s') ) {
                                                                    int LA12_182 = input.LA(16);

                                                                    if ( (LA12_182=='s') ) {
                                                                        int LA12_187 = input.LA(17);

                                                                        if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                                                            alt12=22;
                                                                        }
                                                                        else {
                                                                            alt12=16;}
                                                                    }
                                                                    else {
                                                                        alt12=22;}
                                                                }
                                                                else {
                                                                    alt12=22;}
                                                            }
                                                            else {
                                                                alt12=22;}
                                                        }
                                                        else {
                                                            alt12=22;}
                                                    }
                                                    else {
                                                        alt12=22;}
                                                }
                                                else {
                                                    alt12=22;}
                                            }
                                            else {
                                                alt12=22;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case 'I':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='n') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='t') ) {
                    int LA12_52 = input.LA(4);

                    if ( (LA12_52=='e') ) {
                        int LA12_70 = input.LA(5);

                        if ( (LA12_70=='r') ) {
                            int LA12_88 = input.LA(6);

                            if ( (LA12_88=='a') ) {
                                int LA12_104 = input.LA(7);

                                if ( (LA12_104=='c') ) {
                                    int LA12_117 = input.LA(8);

                                    if ( (LA12_117=='t') ) {
                                        int LA12_129 = input.LA(9);

                                        if ( (LA12_129=='i') ) {
                                            int LA12_141 = input.LA(10);

                                            if ( (LA12_141=='v') ) {
                                                int LA12_152 = input.LA(11);

                                                if ( (LA12_152=='e') ) {
                                                    int LA12_160 = input.LA(12);

                                                    if ( (LA12_160=='P') ) {
                                                        int LA12_167 = input.LA(13);

                                                        if ( (LA12_167=='r') ) {
                                                            int LA12_173 = input.LA(14);

                                                            if ( (LA12_173=='o') ) {
                                                                int LA12_178 = input.LA(15);

                                                                if ( (LA12_178=='c') ) {
                                                                    int LA12_183 = input.LA(16);

                                                                    if ( (LA12_183=='e') ) {
                                                                        int LA12_188 = input.LA(17);

                                                                        if ( (LA12_188=='s') ) {
                                                                            int LA12_193 = input.LA(18);

                                                                            if ( (LA12_193=='s') ) {
                                                                                int LA12_196 = input.LA(19);

                                                                                if ( ((LA12_196>='0' && LA12_196<='9')||(LA12_196>='A' && LA12_196<='Z')||LA12_196=='_'||(LA12_196>='a' && LA12_196<='z')) ) {
                                                                                    alt12=22;
                                                                                }
                                                                                else {
                                                                                    alt12=17;}
                                                                            }
                                                                            else {
                                                                                alt12=22;}
                                                                        }
                                                                        else {
                                                                            alt12=22;}
                                                                    }
                                                                    else {
                                                                        alt12=22;}
                                                                }
                                                                else {
                                                                    alt12=22;}
                                                            }
                                                            else {
                                                                alt12=22;}
                                                        }
                                                        else {
                                                            alt12=22;}
                                                    }
                                                    else {
                                                        alt12=22;}
                                                }
                                                else {
                                                    alt12=22;}
                                            }
                                            else {
                                                alt12=22;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case 'F':
            {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='o') ) {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='r') ) {
                    int LA12_53 = input.LA(4);

                    if ( (LA12_53=='m') ) {
                        int LA12_71 = input.LA(5);

                        if ( (LA12_71=='E') ) {
                            int LA12_89 = input.LA(6);

                            if ( (LA12_89=='l') ) {
                                int LA12_105 = input.LA(7);

                                if ( (LA12_105=='e') ) {
                                    int LA12_118 = input.LA(8);

                                    if ( (LA12_118=='m') ) {
                                        int LA12_130 = input.LA(9);

                                        if ( (LA12_130=='e') ) {
                                            int LA12_142 = input.LA(10);

                                            if ( (LA12_142=='n') ) {
                                                int LA12_153 = input.LA(11);

                                                if ( (LA12_153=='t') ) {
                                                    int LA12_161 = input.LA(12);

                                                    if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                                                        alt12=22;
                                                    }
                                                    else {
                                                        alt12=18;}
                                                }
                                                else {
                                                    alt12=22;}
                                            }
                                            else {
                                                alt12=22;}
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case 'n':
            {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='a') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='v') ) {
                    int LA12_54 = input.LA(4);

                    if ( (LA12_54=='i') ) {
                        int LA12_72 = input.LA(5);

                        if ( (LA12_72=='g') ) {
                            int LA12_90 = input.LA(6);

                            if ( (LA12_90=='a') ) {
                                int LA12_106 = input.LA(7);

                                if ( (LA12_106=='t') ) {
                                    int LA12_119 = input.LA(8);

                                    if ( (LA12_119=='e') ) {
                                        int LA12_131 = input.LA(9);

                                        if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
                                            alt12=22;
                                        }
                                        else {
                                            alt12=20;}
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=22;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case 'L':
            {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='i') ) {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='n') ) {
                    int LA12_55 = input.LA(4);

                    if ( (LA12_55=='k') ) {
                        int LA12_73 = input.LA(5);

                        if ( ((LA12_73>='0' && LA12_73<='9')||(LA12_73>='A' && LA12_73<='Z')||LA12_73=='_'||(LA12_73>='a' && LA12_73<='z')) ) {
                            alt12=22;
                        }
                        else {
                            alt12=21;}
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
            }
            break;
        case 'B':
        case 'E':
        case 'G':
        case 'H':
        case 'J':
        case 'K':
        case 'M':
        case 'N':
        case 'O':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'o':
        case 'p':
        case 'q':
        case 's':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=22;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=23;
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt12=24;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=25;
            }
            break;
        case '/':
            {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='/') ) {
                alt12=27;
            }
            else if ( (LA12_21=='*') ) {
                alt12=26;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 21, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:94: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:102: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:114: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:123: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}