// $ANTLR 3.0 ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g 2009-03-11 20:36:46

package org.mod4j.dsl.presentation.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PresentationDslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=36;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=7;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;

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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:31:7: ( 'processes' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:31:7: 'processes'
            {
            match("processes"); 


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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:35:7: ( 'dialogues' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:35:7: 'dialogues'
            {
            match("dialogues"); 


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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:37:7: ( 'MasterDetail' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:37:7: 'MasterDetail'
            {
            match("MasterDetail"); 


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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:38:7: ( 'master' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:38:7: 'master'
            {
            match("master"); 


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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:39:7: ( 'detail' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:39:7: 'detail'
            {
            match("detail"); 


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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:40:7: ( 'AutomatedProcess' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:40:7: 'AutomatedProcess'
            {
            match("AutomatedProcess"); 


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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:41:7: ( 'InteractiveProcess' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:41:7: 'InteractiveProcess'
            {
            match("InteractiveProcess"); 


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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:42:7: ( 'formElement' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:42:7: 'formElement'
            {
            match("formElement"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:43:7: ( 'navigate' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:43:7: 'navigate'
            {
            match("navigate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:44:7: ( 'to' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:44:7: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:45:7: ( 'named' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:45:7: 'named'
            {
            match("named"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:46:7: ( 'LinkStep' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:46:7: 'LinkStep'
            {
            match("LinkStep"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:47:7: ( 'LinkPath' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:47:7: 'LinkPath'
            {
            match("LinkPath"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:594:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:594:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:594:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:594:4: '^'
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

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:594:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:600:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
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
                    new NoViableAltException("598:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:600:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:600:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
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
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:600:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:600:53: ~ ( '\\\\' | '\"' )
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
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:601:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:601:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
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
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:601:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:601:54: ~ ( '\\\\' | '\\'' )
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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:607:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:607:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:607:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:607:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:607:9: ( '0' .. '9' )+
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
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:607:10: '0' .. '9'
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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:613:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:613:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:613:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:619:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:619:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:619:8: ( options {greedy=false; } : . )*
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
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:619:36: .
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
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:625:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:625:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:625:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:625:8: ~ ( '\\n' | '\\r' )
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

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:625:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:625:22: '\\r'
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
        // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=32;
        switch ( input.LA(1) ) {
        case 'P':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='e') ) {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='s') ) {
                        int LA12_67 = input.LA(5);

                        if ( (LA12_67=='e') ) {
                            int LA12_88 = input.LA(6);

                            if ( (LA12_88=='n') ) {
                                int LA12_110 = input.LA(7);

                                if ( (LA12_110=='t') ) {
                                    int LA12_130 = input.LA(8);

                                    if ( (LA12_130=='a') ) {
                                        int LA12_147 = input.LA(9);

                                        if ( (LA12_147=='t') ) {
                                            int LA12_161 = input.LA(10);

                                            if ( (LA12_161=='i') ) {
                                                int LA12_175 = input.LA(11);

                                                if ( (LA12_175=='o') ) {
                                                    int LA12_185 = input.LA(12);

                                                    if ( (LA12_185=='n') ) {
                                                        int LA12_193 = input.LA(13);

                                                        if ( (LA12_193=='M') ) {
                                                            int LA12_201 = input.LA(14);

                                                            if ( (LA12_201=='o') ) {
                                                                int LA12_207 = input.LA(15);

                                                                if ( (LA12_207=='d') ) {
                                                                    int LA12_212 = input.LA(16);

                                                                    if ( (LA12_212=='e') ) {
                                                                        int LA12_217 = input.LA(17);

                                                                        if ( (LA12_217=='l') ) {
                                                                            int LA12_222 = input.LA(18);

                                                                            if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                                                                alt12=27;
                                                                            }
                                                                            else {
                                                                                alt12=1;}
                                                                        }
                                                                        else {
                                                                            alt12=27;}
                                                                    }
                                                                    else {
                                                                        alt12=27;}
                                                                }
                                                                else {
                                                                    alt12=27;}
                                                            }
                                                            else {
                                                                alt12=27;}
                                                        }
                                                        else {
                                                            alt12=27;}
                                                    }
                                                    else {
                                                        alt12=27;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='o') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='m') ) {
                        int LA12_68 = input.LA(5);

                        if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                            alt12=27;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            case 'o':
                {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='r') ) {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='m') ) {
                        int LA12_69 = input.LA(5);

                        if ( (LA12_69=='E') ) {
                            int LA12_90 = input.LA(6);

                            if ( (LA12_90=='l') ) {
                                int LA12_111 = input.LA(7);

                                if ( (LA12_111=='e') ) {
                                    int LA12_131 = input.LA(8);

                                    if ( (LA12_131=='m') ) {
                                        int LA12_148 = input.LA(9);

                                        if ( (LA12_148=='e') ) {
                                            int LA12_162 = input.LA(10);

                                            if ( (LA12_162=='n') ) {
                                                int LA12_176 = input.LA(11);

                                                if ( (LA12_176=='t') ) {
                                                    int LA12_186 = input.LA(12);

                                                    if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                                                        alt12=27;
                                                    }
                                                    else {
                                                        alt12=21;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            case 'a':
                {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='l') ) {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='s') ) {
                        int LA12_70 = input.LA(5);

                        if ( (LA12_70=='e') ) {
                            int LA12_91 = input.LA(6);

                            if ( ((LA12_91>='0' && LA12_91<='9')||(LA12_91>='A' && LA12_91<='Z')||LA12_91=='_'||(LA12_91>='a' && LA12_91<='z')) ) {
                                alt12=27;
                            }
                            else {
                                alt12=8;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            default:
                alt12=27;}

            }
            break;
        case 'i':
            {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='m') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='p') ) {
                    int LA12_49 = input.LA(4);

                    if ( (LA12_49=='o') ) {
                        int LA12_71 = input.LA(5);

                        if ( (LA12_71=='r') ) {
                            int LA12_92 = input.LA(6);

                            if ( (LA12_92=='t') ) {
                                int LA12_113 = input.LA(7);

                                if ( ((LA12_113>='0' && LA12_113<='9')||(LA12_113>='A' && LA12_113<='Z')||LA12_113=='_'||(LA12_113>='a' && LA12_113<='z')) ) {
                                    alt12=27;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 'C':
            {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='o') ) {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='t') ) {
                        int LA12_72 = input.LA(5);

                        if ( (LA12_72=='e') ) {
                            int LA12_93 = input.LA(6);

                            if ( (LA12_93=='n') ) {
                                int LA12_114 = input.LA(7);

                                if ( (LA12_114=='t') ) {
                                    int LA12_133 = input.LA(8);

                                    if ( (LA12_133=='F') ) {
                                        int LA12_149 = input.LA(9);

                                        if ( (LA12_149=='o') ) {
                                            int LA12_163 = input.LA(10);

                                            if ( (LA12_163=='r') ) {
                                                int LA12_177 = input.LA(11);

                                                if ( (LA12_177=='m') ) {
                                                    int LA12_187 = input.LA(12);

                                                    if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                                        alt12=27;
                                                    }
                                                    else {
                                                        alt12=4;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='l') ) {
                        int LA12_73 = input.LA(5);

                        if ( (LA12_73=='e') ) {
                            int LA12_94 = input.LA(6);

                            if ( (LA12_94=='c') ) {
                                int LA12_115 = input.LA(7);

                                if ( (LA12_115=='t') ) {
                                    int LA12_134 = input.LA(8);

                                    if ( (LA12_134=='i') ) {
                                        int LA12_150 = input.LA(9);

                                        if ( (LA12_150=='o') ) {
                                            int LA12_164 = input.LA(10);

                                            if ( (LA12_164=='n') ) {
                                                int LA12_178 = input.LA(11);

                                                if ( (LA12_178=='D') ) {
                                                    int LA12_188 = input.LA(12);

                                                    if ( (LA12_188=='i') ) {
                                                        int LA12_196 = input.LA(13);

                                                        if ( (LA12_196=='a') ) {
                                                            int LA12_202 = input.LA(14);

                                                            if ( (LA12_202=='l') ) {
                                                                int LA12_208 = input.LA(15);

                                                                if ( (LA12_208=='o') ) {
                                                                    int LA12_213 = input.LA(16);

                                                                    if ( (LA12_213=='g') ) {
                                                                        int LA12_218 = input.LA(17);

                                                                        if ( (LA12_218=='u') ) {
                                                                            int LA12_223 = input.LA(18);

                                                                            if ( (LA12_223=='e') ) {
                                                                                int LA12_228 = input.LA(19);

                                                                                if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
                                                                                    alt12=27;
                                                                                }
                                                                                else {
                                                                                    alt12=15;}
                                                                            }
                                                                            else {
                                                                                alt12=27;}
                                                                        }
                                                                        else {
                                                                            alt12=27;}
                                                                    }
                                                                    else {
                                                                        alt12=27;}
                                                                }
                                                                else {
                                                                    alt12=27;}
                                                            }
                                                            else {
                                                                alt12=27;}
                                                        }
                                                        else {
                                                            alt12=27;}
                                                    }
                                                    else {
                                                        alt12=27;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                    }
                    break;
                case 'm':
                    {
                    int LA12_52 = input.LA(4);

                    if ( (LA12_52=='p') ) {
                        int LA12_74 = input.LA(5);

                        if ( (LA12_74=='o') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='u') ) {
                                int LA12_116 = input.LA(7);

                                if ( (LA12_116=='n') ) {
                                    int LA12_135 = input.LA(8);

                                    if ( (LA12_135=='d') ) {
                                        int LA12_151 = input.LA(9);

                                        if ( (LA12_151=='D') ) {
                                            int LA12_165 = input.LA(10);

                                            if ( (LA12_165=='i') ) {
                                                int LA12_179 = input.LA(11);

                                                if ( (LA12_179=='a') ) {
                                                    int LA12_189 = input.LA(12);

                                                    if ( (LA12_189=='l') ) {
                                                        int LA12_197 = input.LA(13);

                                                        if ( (LA12_197=='o') ) {
                                                            int LA12_203 = input.LA(14);

                                                            if ( (LA12_203=='g') ) {
                                                                int LA12_209 = input.LA(15);

                                                                if ( (LA12_209=='u') ) {
                                                                    int LA12_214 = input.LA(16);

                                                                    if ( (LA12_214=='e') ) {
                                                                        int LA12_219 = input.LA(17);

                                                                        if ( ((LA12_219>='0' && LA12_219<='9')||(LA12_219>='A' && LA12_219<='Z')||LA12_219=='_'||(LA12_219>='a' && LA12_219<='z')) ) {
                                                                            alt12=27;
                                                                        }
                                                                        else {
                                                                            alt12=13;}
                                                                    }
                                                                    else {
                                                                        alt12=27;}
                                                                }
                                                                else {
                                                                    alt12=27;}
                                                            }
                                                            else {
                                                                alt12=27;}
                                                        }
                                                        else {
                                                            alt12=27;}
                                                    }
                                                    else {
                                                        alt12=27;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                    }
                    break;
                default:
                    alt12=27;}

            }
            else {
                alt12=27;}
            }
            break;
        case 'u':
            {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='s') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='i') ) {
                    int LA12_53 = input.LA(4);

                    if ( (LA12_53=='n') ) {
                        int LA12_75 = input.LA(5);

                        if ( (LA12_75=='g') ) {
                            int LA12_96 = input.LA(6);

                            if ( ((LA12_96>='0' && LA12_96<='9')||(LA12_96>='A' && LA12_96<='Z')||LA12_96=='_'||(LA12_96>='a' && LA12_96<='z')) ) {
                                alt12=27;
                            }
                            else {
                                alt12=5;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 'r':
            {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='e') ) {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='a') ) {
                    int LA12_54 = input.LA(4);

                    if ( (LA12_54=='d') ) {
                        int LA12_76 = input.LA(5);

                        if ( (LA12_76=='o') ) {
                            int LA12_97 = input.LA(6);

                            if ( (LA12_97=='n') ) {
                                int LA12_118 = input.LA(7);

                                if ( (LA12_118=='l') ) {
                                    int LA12_136 = input.LA(8);

                                    if ( (LA12_136=='y') ) {
                                        int LA12_152 = input.LA(9);

                                        if ( ((LA12_152>='0' && LA12_152<='9')||(LA12_152>='A' && LA12_152<='Z')||LA12_152=='_'||(LA12_152>='a' && LA12_152<='z')) ) {
                                            alt12=27;
                                        }
                                        else {
                                            alt12=6;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_32 = input.LA(3);

                if ( ((LA12_32>='0' && LA12_32<='9')||(LA12_32>='A' && LA12_32<='Z')||LA12_32=='_'||(LA12_32>='a' && LA12_32<='z')) ) {
                    alt12=27;
                }
                else {
                    alt12=23;}
                }
                break;
            case 'r':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='u') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='e') ) {
                        int LA12_77 = input.LA(5);

                        if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                            alt12=27;
                        }
                        else {
                            alt12=7;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            default:
                alt12=27;}

            }
            break;
        case ';':
            {
            alt12=9;
            }
            break;
        case 'p':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='r') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='o') ) {
                    int LA12_57 = input.LA(4);

                    if ( (LA12_57=='c') ) {
                        int LA12_78 = input.LA(5);

                        if ( (LA12_78=='e') ) {
                            int LA12_99 = input.LA(6);

                            if ( (LA12_99=='s') ) {
                                int LA12_119 = input.LA(7);

                                if ( (LA12_119=='s') ) {
                                    int LA12_137 = input.LA(8);

                                    if ( (LA12_137=='e') ) {
                                        int LA12_153 = input.LA(9);

                                        if ( (LA12_153=='s') ) {
                                            int LA12_167 = input.LA(10);

                                            if ( ((LA12_167>='0' && LA12_167<='9')||(LA12_167>='A' && LA12_167<='Z')||LA12_167=='_'||(LA12_167>='a' && LA12_167<='z')) ) {
                                                alt12=27;
                                            }
                                            else {
                                                alt12=10;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
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
        case 'd':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='a') ) {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='l') ) {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='o') ) {
                            int LA12_100 = input.LA(6);

                            if ( (LA12_100=='g') ) {
                                int LA12_120 = input.LA(7);

                                if ( (LA12_120=='u') ) {
                                    int LA12_138 = input.LA(8);

                                    if ( (LA12_138=='e') ) {
                                        int LA12_154 = input.LA(9);

                                        if ( (LA12_154=='s') ) {
                                            int LA12_168 = input.LA(10);

                                            if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
                                                alt12=27;
                                            }
                                            else {
                                                alt12=14;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            case 'e':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='t') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='a') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='i') ) {
                            int LA12_101 = input.LA(6);

                            if ( (LA12_101=='l') ) {
                                int LA12_121 = input.LA(7);

                                if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                                    alt12=27;
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
                }
                break;
            default:
                alt12=27;}

            }
            break;
        case 'M':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='a') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='s') ) {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='t') ) {
                        int LA12_81 = input.LA(5);

                        if ( (LA12_81=='e') ) {
                            int LA12_102 = input.LA(6);

                            if ( (LA12_102=='r') ) {
                                int LA12_122 = input.LA(7);

                                if ( (LA12_122=='D') ) {
                                    int LA12_140 = input.LA(8);

                                    if ( (LA12_140=='e') ) {
                                        int LA12_155 = input.LA(9);

                                        if ( (LA12_155=='t') ) {
                                            int LA12_169 = input.LA(10);

                                            if ( (LA12_169=='a') ) {
                                                int LA12_182 = input.LA(11);

                                                if ( (LA12_182=='i') ) {
                                                    int LA12_190 = input.LA(12);

                                                    if ( (LA12_190=='l') ) {
                                                        int LA12_198 = input.LA(13);

                                                        if ( ((LA12_198>='0' && LA12_198<='9')||(LA12_198>='A' && LA12_198<='Z')||LA12_198=='_'||(LA12_198>='a' && LA12_198<='z')) ) {
                                                            alt12=27;
                                                        }
                                                        else {
                                                            alt12=16;}
                                                    }
                                                    else {
                                                        alt12=27;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 'm':
            {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='a') ) {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='s') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='t') ) {
                        int LA12_82 = input.LA(5);

                        if ( (LA12_82=='e') ) {
                            int LA12_103 = input.LA(6);

                            if ( (LA12_103=='r') ) {
                                int LA12_123 = input.LA(7);

                                if ( ((LA12_123>='0' && LA12_123<='9')||(LA12_123>='A' && LA12_123<='Z')||LA12_123=='_'||(LA12_123>='a' && LA12_123<='z')) ) {
                                    alt12=27;
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 'A':
            {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='u') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='t') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='o') ) {
                        int LA12_83 = input.LA(5);

                        if ( (LA12_83=='m') ) {
                            int LA12_104 = input.LA(6);

                            if ( (LA12_104=='a') ) {
                                int LA12_124 = input.LA(7);

                                if ( (LA12_124=='t') ) {
                                    int LA12_142 = input.LA(8);

                                    if ( (LA12_142=='e') ) {
                                        int LA12_156 = input.LA(9);

                                        if ( (LA12_156=='d') ) {
                                            int LA12_170 = input.LA(10);

                                            if ( (LA12_170=='P') ) {
                                                int LA12_183 = input.LA(11);

                                                if ( (LA12_183=='r') ) {
                                                    int LA12_191 = input.LA(12);

                                                    if ( (LA12_191=='o') ) {
                                                        int LA12_199 = input.LA(13);

                                                        if ( (LA12_199=='c') ) {
                                                            int LA12_205 = input.LA(14);

                                                            if ( (LA12_205=='e') ) {
                                                                int LA12_210 = input.LA(15);

                                                                if ( (LA12_210=='s') ) {
                                                                    int LA12_215 = input.LA(16);

                                                                    if ( (LA12_215=='s') ) {
                                                                        int LA12_220 = input.LA(17);

                                                                        if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                                                            alt12=27;
                                                                        }
                                                                        else {
                                                                            alt12=19;}
                                                                    }
                                                                    else {
                                                                        alt12=27;}
                                                                }
                                                                else {
                                                                    alt12=27;}
                                                            }
                                                            else {
                                                                alt12=27;}
                                                        }
                                                        else {
                                                            alt12=27;}
                                                    }
                                                    else {
                                                        alt12=27;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 'I':
            {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='n') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='t') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='e') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='r') ) {
                            int LA12_105 = input.LA(6);

                            if ( (LA12_105=='a') ) {
                                int LA12_125 = input.LA(7);

                                if ( (LA12_125=='c') ) {
                                    int LA12_143 = input.LA(8);

                                    if ( (LA12_143=='t') ) {
                                        int LA12_157 = input.LA(9);

                                        if ( (LA12_157=='i') ) {
                                            int LA12_171 = input.LA(10);

                                            if ( (LA12_171=='v') ) {
                                                int LA12_184 = input.LA(11);

                                                if ( (LA12_184=='e') ) {
                                                    int LA12_192 = input.LA(12);

                                                    if ( (LA12_192=='P') ) {
                                                        int LA12_200 = input.LA(13);

                                                        if ( (LA12_200=='r') ) {
                                                            int LA12_206 = input.LA(14);

                                                            if ( (LA12_206=='o') ) {
                                                                int LA12_211 = input.LA(15);

                                                                if ( (LA12_211=='c') ) {
                                                                    int LA12_216 = input.LA(16);

                                                                    if ( (LA12_216=='e') ) {
                                                                        int LA12_221 = input.LA(17);

                                                                        if ( (LA12_221=='s') ) {
                                                                            int LA12_226 = input.LA(18);

                                                                            if ( (LA12_226=='s') ) {
                                                                                int LA12_229 = input.LA(19);

                                                                                if ( ((LA12_229>='0' && LA12_229<='9')||(LA12_229>='A' && LA12_229<='Z')||LA12_229=='_'||(LA12_229>='a' && LA12_229<='z')) ) {
                                                                                    alt12=27;
                                                                                }
                                                                                else {
                                                                                    alt12=20;}
                                                                            }
                                                                            else {
                                                                                alt12=27;}
                                                                        }
                                                                        else {
                                                                            alt12=27;}
                                                                    }
                                                                    else {
                                                                        alt12=27;}
                                                                }
                                                                else {
                                                                    alt12=27;}
                                                            }
                                                            else {
                                                                alt12=27;}
                                                        }
                                                        else {
                                                            alt12=27;}
                                                    }
                                                    else {
                                                        alt12=27;}
                                                }
                                                else {
                                                    alt12=27;}
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 'n':
            {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='a') ) {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='e') ) {
                        int LA12_85 = input.LA(5);

                        if ( (LA12_85=='d') ) {
                            int LA12_106 = input.LA(6);

                            if ( ((LA12_106>='0' && LA12_106<='9')||(LA12_106>='A' && LA12_106<='Z')||LA12_106=='_'||(LA12_106>='a' && LA12_106<='z')) ) {
                                alt12=27;
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                    }
                    break;
                case 'v':
                    {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='i') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='g') ) {
                            int LA12_107 = input.LA(6);

                            if ( (LA12_107=='a') ) {
                                int LA12_127 = input.LA(7);

                                if ( (LA12_127=='t') ) {
                                    int LA12_144 = input.LA(8);

                                    if ( (LA12_144=='e') ) {
                                        int LA12_158 = input.LA(9);

                                        if ( ((LA12_158>='0' && LA12_158<='9')||(LA12_158>='A' && LA12_158<='Z')||LA12_158=='_'||(LA12_158>='a' && LA12_158<='z')) ) {
                                            alt12=27;
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=27;}
                    }
                    break;
                default:
                    alt12=27;}

            }
            else {
                alt12=27;}
            }
            break;
        case 'L':
            {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='i') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='n') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='k') ) {
                        switch ( input.LA(5) ) {
                        case 'P':
                            {
                            int LA12_108 = input.LA(6);

                            if ( (LA12_108=='a') ) {
                                int LA12_128 = input.LA(7);

                                if ( (LA12_128=='t') ) {
                                    int LA12_145 = input.LA(8);

                                    if ( (LA12_145=='h') ) {
                                        int LA12_159 = input.LA(9);

                                        if ( ((LA12_159>='0' && LA12_159<='9')||(LA12_159>='A' && LA12_159<='Z')||LA12_159=='_'||(LA12_159>='a' && LA12_159<='z')) ) {
                                            alt12=27;
                                        }
                                        else {
                                            alt12=26;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                            }
                            break;
                        case 'S':
                            {
                            int LA12_109 = input.LA(6);

                            if ( (LA12_109=='t') ) {
                                int LA12_129 = input.LA(7);

                                if ( (LA12_129=='e') ) {
                                    int LA12_146 = input.LA(8);

                                    if ( (LA12_146=='p') ) {
                                        int LA12_160 = input.LA(9);

                                        if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
                                            alt12=27;
                                        }
                                        else {
                                            alt12=25;}
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=27;}
                            }
                            break;
                        default:
                            alt12=27;}

                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
            }
            break;
        case 'B':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'J':
        case 'K':
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
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'o':
        case 'q':
        case 's':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=27;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=28;
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
            alt12=29;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=30;
            }
            break;
        case '/':
            {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='/') ) {
                alt12=32;
            }
            else if ( (LA12_23=='*') ) {
                alt12=31;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 23, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

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
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:106: T34
                {
                mT34(); 

                }
                break;
            case 26 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:110: T35
                {
                mT35(); 

                }
                break;
            case 27 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:122: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:134: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:151: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:1:167: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}