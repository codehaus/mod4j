package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalPresentationLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=37;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalPresentationLexer() {;} 
    public InternalPresentationLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:10:5: ( 'false' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:10:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:11:5: ( 'PresentationModel' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:11:7: 'PresentationModel'
            {
            match("PresentationModel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:12:5: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:12:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:13:5: ( 'import' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:13:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:14:5: ( 'ContentForm' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:14:7: 'ContentForm'
            {
            match("ContentForm"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:15:5: ( 'using' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:15:7: 'using'
            {
            match("using"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:16:5: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:16:7: 'readonly'
            {
            match("readonly"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:17:5: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:17:7: ';'
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
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:18:5: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:18:7: 'processes'
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
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:19:5: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:19:7: '['
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
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:20:5: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:20:7: ']'
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
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:21:5: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:21:7: 'CompoundDialogue'
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
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:22:5: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:22:7: 'dialogues'
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
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:23:5: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:23:7: 'CollectionDialogue'
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
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:24:5: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:24:7: 'MasterDetail'
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
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:25:5: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:25:7: 'master'
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
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:26:5: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:26:7: 'detail'
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
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:27:5: ( 'AutomatedProcess' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:27:7: 'AutomatedProcess'
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
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:28:5: ( 'InteractiveProcess' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:28:7: 'InteractiveProcess'
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
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:29:5: ( 'formElement' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:29:7: 'formElement'
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
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:30:5: ( 'named' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:30:7: 'named'
            {
            match("named"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:31:5: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:31:7: 'navigate'
            {
            match("navigate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:32:5: ( 'to' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:32:7: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:33:5: ( 'LinkStep' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:33:7: 'LinkStep'
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
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:34:5: ( 'LinkPath' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:34:7: 'LinkPath'
            {
            match("LinkPath"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:35:5: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:35:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4315:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4315:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4315:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4315:11: '^'
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

            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4315:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:
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

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4317:10: ( ( '0' .. '9' )+ )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4317:12: ( '0' .. '9' )+
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4317:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4317:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4319:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4319:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4321:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4321:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4321:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4321:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4323:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4325:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4325:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4325:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4327:16: ( . )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4327:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=33;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='o') ) {
                    int LA12_55 = input.LA(4);

                    if ( (LA12_55=='m') ) {
                        int LA12_77 = input.LA(5);

                        if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
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
                break;
            case 'a':
                {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='l') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='s') ) {
                        int LA12_78 = input.LA(5);

                        if ( (LA12_78=='e') ) {
                            int LA12_99 = input.LA(6);

                            if ( ((LA12_99>='0' && LA12_99<='9')||(LA12_99>='A' && LA12_99<='Z')||LA12_99=='_'||(LA12_99>='a' && LA12_99<='z')) ) {
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
                break;
            case 'o':
                {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='r') ) {
                    int LA12_57 = input.LA(4);

                    if ( (LA12_57=='m') ) {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='E') ) {
                            int LA12_100 = input.LA(6);

                            if ( (LA12_100=='l') ) {
                                int LA12_121 = input.LA(7);

                                if ( (LA12_121=='e') ) {
                                    int LA12_140 = input.LA(8);

                                    if ( (LA12_140=='m') ) {
                                        int LA12_157 = input.LA(9);

                                        if ( (LA12_157=='e') ) {
                                            int LA12_171 = input.LA(10);

                                            if ( (LA12_171=='n') ) {
                                                int LA12_185 = input.LA(11);

                                                if ( (LA12_185=='t') ) {
                                                    int LA12_195 = input.LA(12);

                                                    if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
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
                break;
            default:
                alt12=27;}

        }
        else if ( (LA12_0=='P') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='r') ) {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='e') ) {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='s') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='e') ) {
                            int LA12_101 = input.LA(6);

                            if ( (LA12_101=='n') ) {
                                int LA12_122 = input.LA(7);

                                if ( (LA12_122=='t') ) {
                                    int LA12_141 = input.LA(8);

                                    if ( (LA12_141=='a') ) {
                                        int LA12_158 = input.LA(9);

                                        if ( (LA12_158=='t') ) {
                                            int LA12_172 = input.LA(10);

                                            if ( (LA12_172=='i') ) {
                                                int LA12_186 = input.LA(11);

                                                if ( (LA12_186=='o') ) {
                                                    int LA12_196 = input.LA(12);

                                                    if ( (LA12_196=='n') ) {
                                                        int LA12_204 = input.LA(13);

                                                        if ( (LA12_204=='M') ) {
                                                            int LA12_211 = input.LA(14);

                                                            if ( (LA12_211=='o') ) {
                                                                int LA12_217 = input.LA(15);

                                                                if ( (LA12_217=='d') ) {
                                                                    int LA12_222 = input.LA(16);

                                                                    if ( (LA12_222=='e') ) {
                                                                        int LA12_227 = input.LA(17);

                                                                        if ( (LA12_227=='l') ) {
                                                                            int LA12_232 = input.LA(18);

                                                                            if ( ((LA12_232>='0' && LA12_232<='9')||(LA12_232>='A' && LA12_232<='Z')||LA12_232=='_'||(LA12_232>='a' && LA12_232<='z')) ) {
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
        else if ( (LA12_0=='i') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='m') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='p') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='o') ) {
                        int LA12_81 = input.LA(5);

                        if ( (LA12_81=='r') ) {
                            int LA12_102 = input.LA(6);

                            if ( (LA12_102=='t') ) {
                                int LA12_123 = input.LA(7);

                                if ( ((LA12_123>='0' && LA12_123<='9')||(LA12_123>='A' && LA12_123<='Z')||LA12_123=='_'||(LA12_123>='a' && LA12_123<='z')) ) {
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
        else if ( (LA12_0=='C') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='o') ) {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='l') ) {
                        int LA12_82 = input.LA(5);

                        if ( (LA12_82=='e') ) {
                            int LA12_103 = input.LA(6);

                            if ( (LA12_103=='c') ) {
                                int LA12_124 = input.LA(7);

                                if ( (LA12_124=='t') ) {
                                    int LA12_143 = input.LA(8);

                                    if ( (LA12_143=='i') ) {
                                        int LA12_159 = input.LA(9);

                                        if ( (LA12_159=='o') ) {
                                            int LA12_173 = input.LA(10);

                                            if ( (LA12_173=='n') ) {
                                                int LA12_187 = input.LA(11);

                                                if ( (LA12_187=='D') ) {
                                                    int LA12_197 = input.LA(12);

                                                    if ( (LA12_197=='i') ) {
                                                        int LA12_205 = input.LA(13);

                                                        if ( (LA12_205=='a') ) {
                                                            int LA12_212 = input.LA(14);

                                                            if ( (LA12_212=='l') ) {
                                                                int LA12_218 = input.LA(15);

                                                                if ( (LA12_218=='o') ) {
                                                                    int LA12_223 = input.LA(16);

                                                                    if ( (LA12_223=='g') ) {
                                                                        int LA12_228 = input.LA(17);

                                                                        if ( (LA12_228=='u') ) {
                                                                            int LA12_233 = input.LA(18);

                                                                            if ( (LA12_233=='e') ) {
                                                                                int LA12_238 = input.LA(19);

                                                                                if ( ((LA12_238>='0' && LA12_238<='9')||(LA12_238>='A' && LA12_238<='Z')||LA12_238=='_'||(LA12_238>='a' && LA12_238<='z')) ) {
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
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='t') ) {
                        int LA12_83 = input.LA(5);

                        if ( (LA12_83=='e') ) {
                            int LA12_104 = input.LA(6);

                            if ( (LA12_104=='n') ) {
                                int LA12_125 = input.LA(7);

                                if ( (LA12_125=='t') ) {
                                    int LA12_144 = input.LA(8);

                                    if ( (LA12_144=='F') ) {
                                        int LA12_160 = input.LA(9);

                                        if ( (LA12_160=='o') ) {
                                            int LA12_174 = input.LA(10);

                                            if ( (LA12_174=='r') ) {
                                                int LA12_188 = input.LA(11);

                                                if ( (LA12_188=='m') ) {
                                                    int LA12_198 = input.LA(12);

                                                    if ( ((LA12_198>='0' && LA12_198<='9')||(LA12_198>='A' && LA12_198<='Z')||LA12_198=='_'||(LA12_198>='a' && LA12_198<='z')) ) {
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
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='p') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='o') ) {
                            int LA12_105 = input.LA(6);

                            if ( (LA12_105=='u') ) {
                                int LA12_126 = input.LA(7);

                                if ( (LA12_126=='n') ) {
                                    int LA12_145 = input.LA(8);

                                    if ( (LA12_145=='d') ) {
                                        int LA12_161 = input.LA(9);

                                        if ( (LA12_161=='D') ) {
                                            int LA12_175 = input.LA(10);

                                            if ( (LA12_175=='i') ) {
                                                int LA12_189 = input.LA(11);

                                                if ( (LA12_189=='a') ) {
                                                    int LA12_199 = input.LA(12);

                                                    if ( (LA12_199=='l') ) {
                                                        int LA12_207 = input.LA(13);

                                                        if ( (LA12_207=='o') ) {
                                                            int LA12_213 = input.LA(14);

                                                            if ( (LA12_213=='g') ) {
                                                                int LA12_219 = input.LA(15);

                                                                if ( (LA12_219=='u') ) {
                                                                    int LA12_224 = input.LA(16);

                                                                    if ( (LA12_224=='e') ) {
                                                                        int LA12_229 = input.LA(17);

                                                                        if ( ((LA12_229>='0' && LA12_229<='9')||(LA12_229>='A' && LA12_229<='Z')||LA12_229=='_'||(LA12_229>='a' && LA12_229<='z')) ) {
                                                                            alt12=27;
                                                                        }
                                                                        else {
                                                                            alt12=12;}
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
        else if ( (LA12_0=='u') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='s') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='i') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='n') ) {
                        int LA12_85 = input.LA(5);

                        if ( (LA12_85=='g') ) {
                            int LA12_106 = input.LA(6);

                            if ( ((LA12_106>='0' && LA12_106<='9')||(LA12_106>='A' && LA12_106<='Z')||LA12_106=='_'||(LA12_106>='a' && LA12_106<='z')) ) {
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
        else if ( (LA12_0=='r') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='e') ) {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='a') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='d') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='o') ) {
                            int LA12_107 = input.LA(6);

                            if ( (LA12_107=='n') ) {
                                int LA12_128 = input.LA(7);

                                if ( (LA12_128=='l') ) {
                                    int LA12_146 = input.LA(8);

                                    if ( (LA12_146=='y') ) {
                                        int LA12_162 = input.LA(9);

                                        if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
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
        else if ( (LA12_0==';') ) {
            alt12=8;
        }
        else if ( (LA12_0=='p') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='r') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='o') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='c') ) {
                        int LA12_87 = input.LA(5);

                        if ( (LA12_87=='e') ) {
                            int LA12_108 = input.LA(6);

                            if ( (LA12_108=='s') ) {
                                int LA12_129 = input.LA(7);

                                if ( (LA12_129=='s') ) {
                                    int LA12_147 = input.LA(8);

                                    if ( (LA12_147=='e') ) {
                                        int LA12_163 = input.LA(9);

                                        if ( (LA12_163=='s') ) {
                                            int LA12_177 = input.LA(10);

                                            if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                                                alt12=27;
                                            }
                                            else {
                                                alt12=9;}
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
        else if ( (LA12_0=='[') ) {
            alt12=10;
        }
        else if ( (LA12_0==']') ) {
            alt12=11;
        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='a') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='l') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='o') ) {
                            int LA12_109 = input.LA(6);

                            if ( (LA12_109=='g') ) {
                                int LA12_130 = input.LA(7);

                                if ( (LA12_130=='u') ) {
                                    int LA12_148 = input.LA(8);

                                    if ( (LA12_148=='e') ) {
                                        int LA12_164 = input.LA(9);

                                        if ( (LA12_164=='s') ) {
                                            int LA12_178 = input.LA(10);

                                            if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
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
                break;
            case 'e':
                {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='t') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='a') ) {
                        int LA12_89 = input.LA(5);

                        if ( (LA12_89=='i') ) {
                            int LA12_110 = input.LA(6);

                            if ( (LA12_110=='l') ) {
                                int LA12_131 = input.LA(7);

                                if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
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
                break;
            default:
                alt12=27;}

        }
        else if ( (LA12_0=='M') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='a') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='s') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='t') ) {
                        int LA12_90 = input.LA(5);

                        if ( (LA12_90=='e') ) {
                            int LA12_111 = input.LA(6);

                            if ( (LA12_111=='r') ) {
                                int LA12_132 = input.LA(7);

                                if ( (LA12_132=='D') ) {
                                    int LA12_150 = input.LA(8);

                                    if ( (LA12_150=='e') ) {
                                        int LA12_165 = input.LA(9);

                                        if ( (LA12_165=='t') ) {
                                            int LA12_179 = input.LA(10);

                                            if ( (LA12_179=='a') ) {
                                                int LA12_192 = input.LA(11);

                                                if ( (LA12_192=='i') ) {
                                                    int LA12_200 = input.LA(12);

                                                    if ( (LA12_200=='l') ) {
                                                        int LA12_208 = input.LA(13);

                                                        if ( ((LA12_208>='0' && LA12_208<='9')||(LA12_208>='A' && LA12_208<='Z')||LA12_208=='_'||(LA12_208>='a' && LA12_208<='z')) ) {
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
        else if ( (LA12_0=='m') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='a') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='s') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='t') ) {
                        int LA12_91 = input.LA(5);

                        if ( (LA12_91=='e') ) {
                            int LA12_112 = input.LA(6);

                            if ( (LA12_112=='r') ) {
                                int LA12_133 = input.LA(7);

                                if ( ((LA12_133>='0' && LA12_133<='9')||(LA12_133>='A' && LA12_133<='Z')||LA12_133=='_'||(LA12_133>='a' && LA12_133<='z')) ) {
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
        else if ( (LA12_0=='A') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='u') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='t') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='o') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='m') ) {
                            int LA12_113 = input.LA(6);

                            if ( (LA12_113=='a') ) {
                                int LA12_134 = input.LA(7);

                                if ( (LA12_134=='t') ) {
                                    int LA12_152 = input.LA(8);

                                    if ( (LA12_152=='e') ) {
                                        int LA12_166 = input.LA(9);

                                        if ( (LA12_166=='d') ) {
                                            int LA12_180 = input.LA(10);

                                            if ( (LA12_180=='P') ) {
                                                int LA12_193 = input.LA(11);

                                                if ( (LA12_193=='r') ) {
                                                    int LA12_201 = input.LA(12);

                                                    if ( (LA12_201=='o') ) {
                                                        int LA12_209 = input.LA(13);

                                                        if ( (LA12_209=='c') ) {
                                                            int LA12_215 = input.LA(14);

                                                            if ( (LA12_215=='e') ) {
                                                                int LA12_220 = input.LA(15);

                                                                if ( (LA12_220=='s') ) {
                                                                    int LA12_225 = input.LA(16);

                                                                    if ( (LA12_225=='s') ) {
                                                                        int LA12_230 = input.LA(17);

                                                                        if ( ((LA12_230>='0' && LA12_230<='9')||(LA12_230>='A' && LA12_230<='Z')||LA12_230=='_'||(LA12_230>='a' && LA12_230<='z')) ) {
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
        else if ( (LA12_0=='I') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='n') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='t') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='e') ) {
                        int LA12_93 = input.LA(5);

                        if ( (LA12_93=='r') ) {
                            int LA12_114 = input.LA(6);

                            if ( (LA12_114=='a') ) {
                                int LA12_135 = input.LA(7);

                                if ( (LA12_135=='c') ) {
                                    int LA12_153 = input.LA(8);

                                    if ( (LA12_153=='t') ) {
                                        int LA12_167 = input.LA(9);

                                        if ( (LA12_167=='i') ) {
                                            int LA12_181 = input.LA(10);

                                            if ( (LA12_181=='v') ) {
                                                int LA12_194 = input.LA(11);

                                                if ( (LA12_194=='e') ) {
                                                    int LA12_202 = input.LA(12);

                                                    if ( (LA12_202=='P') ) {
                                                        int LA12_210 = input.LA(13);

                                                        if ( (LA12_210=='r') ) {
                                                            int LA12_216 = input.LA(14);

                                                            if ( (LA12_216=='o') ) {
                                                                int LA12_221 = input.LA(15);

                                                                if ( (LA12_221=='c') ) {
                                                                    int LA12_226 = input.LA(16);

                                                                    if ( (LA12_226=='e') ) {
                                                                        int LA12_231 = input.LA(17);

                                                                        if ( (LA12_231=='s') ) {
                                                                            int LA12_236 = input.LA(18);

                                                                            if ( (LA12_236=='s') ) {
                                                                                int LA12_239 = input.LA(19);

                                                                                if ( ((LA12_239>='0' && LA12_239<='9')||(LA12_239>='A' && LA12_239<='Z')||LA12_239=='_'||(LA12_239>='a' && LA12_239<='z')) ) {
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
                else {
                    alt12=27;}
            }
            else {
                alt12=27;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='a') ) {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='e') ) {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='d') ) {
                            int LA12_115 = input.LA(6);

                            if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
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
                    break;
                case 'v':
                    {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='i') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='g') ) {
                            int LA12_116 = input.LA(6);

                            if ( (LA12_116=='a') ) {
                                int LA12_137 = input.LA(7);

                                if ( (LA12_137=='t') ) {
                                    int LA12_154 = input.LA(8);

                                    if ( (LA12_154=='e') ) {
                                        int LA12_168 = input.LA(9);

                                        if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
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
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_47 = input.LA(3);

                if ( ((LA12_47>='0' && LA12_47<='9')||(LA12_47>='A' && LA12_47<='Z')||LA12_47=='_'||(LA12_47>='a' && LA12_47<='z')) ) {
                    alt12=27;
                }
                else {
                    alt12=23;}
                }
                break;
            case 'r':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='u') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='e') ) {
                        int LA12_96 = input.LA(5);

                        if ( ((LA12_96>='0' && LA12_96<='9')||(LA12_96>='A' && LA12_96<='Z')||LA12_96=='_'||(LA12_96>='a' && LA12_96<='z')) ) {
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
                break;
            default:
                alt12=27;}

        }
        else if ( (LA12_0=='L') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='i') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='n') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='k') ) {
                        switch ( input.LA(5) ) {
                        case 'P':
                            {
                            int LA12_118 = input.LA(6);

                            if ( (LA12_118=='a') ) {
                                int LA12_138 = input.LA(7);

                                if ( (LA12_138=='t') ) {
                                    int LA12_155 = input.LA(8);

                                    if ( (LA12_155=='h') ) {
                                        int LA12_169 = input.LA(9);

                                        if ( ((LA12_169>='0' && LA12_169<='9')||(LA12_169>='A' && LA12_169<='Z')||LA12_169=='_'||(LA12_169>='a' && LA12_169<='z')) ) {
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
                        case 'S':
                            {
                            int LA12_119 = input.LA(6);

                            if ( (LA12_119=='t') ) {
                                int LA12_139 = input.LA(7);

                                if ( (LA12_139=='e') ) {
                                    int LA12_156 = input.LA(8);

                                    if ( (LA12_156=='p') ) {
                                        int LA12_170 = input.LA(9);

                                        if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
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
        else if ( (LA12_0=='^') ) {
            int LA12_19 = input.LA(2);

            if ( ((LA12_19>='A' && LA12_19<='Z')||LA12_19=='_'||(LA12_19>='a' && LA12_19<='z')) ) {
                alt12=27;
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='B'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='N' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||LA12_0=='o'||LA12_0=='q'||LA12_0=='s'||(LA12_0>='v' && LA12_0<='z')) ) {
            alt12=27;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=28;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_22 = input.LA(2);

            if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFE')) ) {
                alt12=29;
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_23 = input.LA(2);

            if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFE')) ) {
                alt12=29;
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=31;
                }
                break;
            case '*':
                {
                alt12=30;
                }
                break;
            default:
                alt12=33;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=32;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=33;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:122: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:131: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:143: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:175: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1:183: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}