package org.mod4j.dsl.presentation.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalPresentationLexer extends Lexer {
    public static final int T14=14;
    public static final int T29=29;
    public static final int T36=36;
    public static final int RULE_STRING=4;
    public static final int T35=35;
    public static final int T20=20;
    public static final int T34=34;
    public static final int T25=25;
    public static final int T18=18;
    public static final int T37=37;
    public static final int T26=26;
    public static final int RULE_INT=6;
    public static final int T32=32;
    public static final int T17=17;
    public static final int T16=16;
    public static final int T38=38;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T39=39;
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int T33=33;
    public static final int T11=11;
    public static final int T22=22;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T28=28;
    public static final int T42=42;
    public static final int T40=40;
    public static final int T13=13;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int Tokens=43;
    public static final int RULE_ANY_OTHER=10;
    public static final int T31=31;
    public static final int RULE_SL_COMMENT=8;
    public static final int T27=27;
    public static final int T30=30;
    public InternalPresentationLexer() {;} 
    public InternalPresentationLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:10:5: ( 'presentation' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:10:7: 'presentation'
            {
            match("presentation"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:11:5: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:11:7: ';'
            {
            match(';'); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:12:5: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:12:7: 'from'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:13:5: ( 'import' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:13:7: 'import'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:14:5: ( 'ContentForm' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:14:7: 'ContentForm'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:15:5: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:15:7: 'context'
            {
            match("context"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:16:5: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:16:7: '['
            {
            match('['); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:17:5: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:17:7: 'readonly'
            {
            match("readonly"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:18:5: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:18:7: 'true'
            {
            match("true"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:19:5: ( 'false' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:19:7: 'false'
            {
            match("false"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:20:5: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:20:7: 'actions'
            {
            match("actions"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:21:5: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:21:7: ']'
            {
            match(']'); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:22:5: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:22:7: 'processes'
            {
            match("processes"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:23:5: ( 'use' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:23:7: 'use'
            {
            match("use"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:24:5: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:24:7: 'CompoundDialogue'
            {
            match("CompoundDialogue"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:25:5: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:25:7: 'dialogues'
            {
            match("dialogues"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:26:5: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:26:7: 'CollectionDialogue'
            {
            match("CollectionDialogue"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:27:5: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:27:7: 'MasterDetail'
            {
            match("MasterDetail"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:28:5: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:28:7: 'master'
            {
            match("master"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:29:5: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:29:7: 'detail'
            {
            match("detail"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:30:5: ( 'AutomatedProcess' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:30:7: 'AutomatedProcess'
            {
            match("AutomatedProcess"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:31:5: ( 'steps' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:31:7: 'steps'
            {
            match("steps"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:32:5: ( 'InteractiveProcess' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:32:7: 'InteractiveProcess'
            {
            match("InteractiveProcess"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:33:5: ( 'element' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:33:7: 'element'
            {
            match("element"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:34:5: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:34:7: 'label'
            {
            match("label"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:35:5: ( 'alias' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:35:7: 'alias'
            {
            match("alias"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:36:5: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:36:7: 'navigate'
            {
            match("navigate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:37:5: ( 'to' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:37:7: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:38:5: ( 'LinkStep' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:38:7: 'LinkStep'
            {
            match("LinkStep"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:39:5: ( 'LinkPath' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:39:7: 'LinkPath'
            {
            match("LinkPath"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:40:5: ( 'dialogue' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:40:7: 'dialogue'
            {
            match("dialogue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:41:5: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:41:7: 'process'
            {
            match("process"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2485:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2485:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2485:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2485:11: '^'
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2485:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2487:10: ( ( '0' .. '9' )+ )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2487:12: ( '0' .. '9' )+
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2487:12: ( '0' .. '9' )+
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
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2487:13: '0' .. '9'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2489:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2489:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2491:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2491:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2491:24: ( options {greedy=false; } : . )*
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
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2491:52: .
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2493:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2493:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2493:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2493:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2493:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2493:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2493:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2493:41: '\\r'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2495:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2495:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2495:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2497:16: ( . )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2497:18: .
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
        // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=39;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='s') ) {
                        int LA12_89 = input.LA(5);

                        if ( (LA12_89=='e') ) {
                            int LA12_114 = input.LA(6);

                            if ( (LA12_114=='n') ) {
                                int LA12_139 = input.LA(7);

                                if ( (LA12_139=='t') ) {
                                    int LA12_162 = input.LA(8);

                                    if ( (LA12_162=='a') ) {
                                        int LA12_181 = input.LA(9);

                                        if ( (LA12_181=='t') ) {
                                            int LA12_198 = input.LA(10);

                                            if ( (LA12_198=='i') ) {
                                                int LA12_212 = input.LA(11);

                                                if ( (LA12_212=='o') ) {
                                                    int LA12_221 = input.LA(12);

                                                    if ( (LA12_221=='n') ) {
                                                        int LA12_228 = input.LA(13);

                                                        if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
                                                            alt12=33;
                                                        }
                                                        else {
                                                            alt12=1;}
                                                    }
                                                    else {
                                                        alt12=33;}
                                                }
                                                else {
                                                    alt12=33;}
                                            }
                                            else {
                                                alt12=33;}
                                        }
                                        else {
                                            alt12=33;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                    }
                    break;
                case 'o':
                    {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='c') ) {
                        int LA12_90 = input.LA(5);

                        if ( (LA12_90=='e') ) {
                            int LA12_115 = input.LA(6);

                            if ( (LA12_115=='s') ) {
                                int LA12_140 = input.LA(7);

                                if ( (LA12_140=='s') ) {
                                    switch ( input.LA(8) ) {
                                    case 'e':
                                        {
                                        int LA12_182 = input.LA(9);

                                        if ( (LA12_182=='s') ) {
                                            int LA12_199 = input.LA(10);

                                            if ( ((LA12_199>='0' && LA12_199<='9')||(LA12_199>='A' && LA12_199<='Z')||LA12_199=='_'||(LA12_199>='a' && LA12_199<='z')) ) {
                                                alt12=33;
                                            }
                                            else {
                                                alt12=13;}
                                        }
                                        else {
                                            alt12=33;}
                                        }
                                        break;
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
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
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
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt12=33;
                                        }
                                        break;
                                    default:
                                        alt12=32;}

                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                    }
                    break;
                default:
                    alt12=33;}

            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0==';') ) {
            alt12=2;
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='o') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='m') ) {
                        int LA12_91 = input.LA(5);

                        if ( ((LA12_91>='0' && LA12_91<='9')||(LA12_91>='A' && LA12_91<='Z')||LA12_91=='_'||(LA12_91>='a' && LA12_91<='z')) ) {
                            alt12=33;
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
                }
                break;
            case 'a':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='l') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='s') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='e') ) {
                            int LA12_117 = input.LA(6);

                            if ( ((LA12_117>='0' && LA12_117<='9')||(LA12_117>='A' && LA12_117<='Z')||LA12_117=='_'||(LA12_117>='a' && LA12_117<='z')) ) {
                                alt12=33;
                            }
                            else {
                                alt12=10;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
                }
                break;
            default:
                alt12=33;}

        }
        else if ( (LA12_0=='i') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='m') ) {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='p') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='o') ) {
                        int LA12_93 = input.LA(5);

                        if ( (LA12_93=='r') ) {
                            int LA12_118 = input.LA(6);

                            if ( (LA12_118=='t') ) {
                                int LA12_142 = input.LA(7);

                                if ( ((LA12_142>='0' && LA12_142<='9')||(LA12_142>='A' && LA12_142<='Z')||LA12_142=='_'||(LA12_142>='a' && LA12_142<='z')) ) {
                                    alt12=33;
                                }
                                else {
                                    alt12=4;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='o') ) {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='p') ) {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='o') ) {
                            int LA12_119 = input.LA(6);

                            if ( (LA12_119=='u') ) {
                                int LA12_143 = input.LA(7);

                                if ( (LA12_143=='n') ) {
                                    int LA12_165 = input.LA(8);

                                    if ( (LA12_165=='d') ) {
                                        int LA12_184 = input.LA(9);

                                        if ( (LA12_184=='D') ) {
                                            int LA12_200 = input.LA(10);

                                            if ( (LA12_200=='i') ) {
                                                int LA12_214 = input.LA(11);

                                                if ( (LA12_214=='a') ) {
                                                    int LA12_222 = input.LA(12);

                                                    if ( (LA12_222=='l') ) {
                                                        int LA12_229 = input.LA(13);

                                                        if ( (LA12_229=='o') ) {
                                                            int LA12_236 = input.LA(14);

                                                            if ( (LA12_236=='g') ) {
                                                                int LA12_241 = input.LA(15);

                                                                if ( (LA12_241=='u') ) {
                                                                    int LA12_245 = input.LA(16);

                                                                    if ( (LA12_245=='e') ) {
                                                                        int LA12_249 = input.LA(17);

                                                                        if ( ((LA12_249>='0' && LA12_249<='9')||(LA12_249>='A' && LA12_249<='Z')||LA12_249=='_'||(LA12_249>='a' && LA12_249<='z')) ) {
                                                                            alt12=33;
                                                                        }
                                                                        else {
                                                                            alt12=15;}
                                                                    }
                                                                    else {
                                                                        alt12=33;}
                                                                }
                                                                else {
                                                                    alt12=33;}
                                                            }
                                                            else {
                                                                alt12=33;}
                                                        }
                                                        else {
                                                            alt12=33;}
                                                    }
                                                    else {
                                                        alt12=33;}
                                                }
                                                else {
                                                    alt12=33;}
                                            }
                                            else {
                                                alt12=33;}
                                        }
                                        else {
                                            alt12=33;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='l') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='e') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='c') ) {
                                int LA12_144 = input.LA(7);

                                if ( (LA12_144=='t') ) {
                                    int LA12_166 = input.LA(8);

                                    if ( (LA12_166=='i') ) {
                                        int LA12_185 = input.LA(9);

                                        if ( (LA12_185=='o') ) {
                                            int LA12_201 = input.LA(10);

                                            if ( (LA12_201=='n') ) {
                                                int LA12_215 = input.LA(11);

                                                if ( (LA12_215=='D') ) {
                                                    int LA12_223 = input.LA(12);

                                                    if ( (LA12_223=='i') ) {
                                                        int LA12_230 = input.LA(13);

                                                        if ( (LA12_230=='a') ) {
                                                            int LA12_237 = input.LA(14);

                                                            if ( (LA12_237=='l') ) {
                                                                int LA12_242 = input.LA(15);

                                                                if ( (LA12_242=='o') ) {
                                                                    int LA12_246 = input.LA(16);

                                                                    if ( (LA12_246=='g') ) {
                                                                        int LA12_250 = input.LA(17);

                                                                        if ( (LA12_250=='u') ) {
                                                                            int LA12_254 = input.LA(18);

                                                                            if ( (LA12_254=='e') ) {
                                                                                int LA12_257 = input.LA(19);

                                                                                if ( ((LA12_257>='0' && LA12_257<='9')||(LA12_257>='A' && LA12_257<='Z')||LA12_257=='_'||(LA12_257>='a' && LA12_257<='z')) ) {
                                                                                    alt12=33;
                                                                                }
                                                                                else {
                                                                                    alt12=17;}
                                                                            }
                                                                            else {
                                                                                alt12=33;}
                                                                        }
                                                                        else {
                                                                            alt12=33;}
                                                                    }
                                                                    else {
                                                                        alt12=33;}
                                                                }
                                                                else {
                                                                    alt12=33;}
                                                            }
                                                            else {
                                                                alt12=33;}
                                                        }
                                                        else {
                                                            alt12=33;}
                                                    }
                                                    else {
                                                        alt12=33;}
                                                }
                                                else {
                                                    alt12=33;}
                                            }
                                            else {
                                                alt12=33;}
                                        }
                                        else {
                                            alt12=33;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                    }
                    break;
                case 'n':
                    {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='t') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='e') ) {
                            int LA12_121 = input.LA(6);

                            if ( (LA12_121=='n') ) {
                                int LA12_145 = input.LA(7);

                                if ( (LA12_145=='t') ) {
                                    int LA12_167 = input.LA(8);

                                    if ( (LA12_167=='F') ) {
                                        int LA12_186 = input.LA(9);

                                        if ( (LA12_186=='o') ) {
                                            int LA12_202 = input.LA(10);

                                            if ( (LA12_202=='r') ) {
                                                int LA12_216 = input.LA(11);

                                                if ( (LA12_216=='m') ) {
                                                    int LA12_224 = input.LA(12);

                                                    if ( ((LA12_224>='0' && LA12_224<='9')||(LA12_224>='A' && LA12_224<='Z')||LA12_224=='_'||(LA12_224>='a' && LA12_224<='z')) ) {
                                                        alt12=33;
                                                    }
                                                    else {
                                                        alt12=5;}
                                                }
                                                else {
                                                    alt12=33;}
                                            }
                                            else {
                                                alt12=33;}
                                        }
                                        else {
                                            alt12=33;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                    }
                    break;
                default:
                    alt12=33;}

            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='o') ) {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='n') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='t') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='e') ) {
                            int LA12_122 = input.LA(6);

                            if ( (LA12_122=='x') ) {
                                int LA12_146 = input.LA(7);

                                if ( (LA12_146=='t') ) {
                                    int LA12_168 = input.LA(8);

                                    if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
                                        alt12=33;
                                    }
                                    else {
                                        alt12=6;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='[') ) {
            alt12=7;
        }
        else if ( (LA12_0=='r') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='e') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='a') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='d') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='o') ) {
                            int LA12_123 = input.LA(6);

                            if ( (LA12_123=='n') ) {
                                int LA12_147 = input.LA(7);

                                if ( (LA12_147=='l') ) {
                                    int LA12_169 = input.LA(8);

                                    if ( (LA12_169=='y') ) {
                                        int LA12_188 = input.LA(9);

                                        if ( ((LA12_188>='0' && LA12_188<='9')||(LA12_188>='A' && LA12_188<='Z')||LA12_188=='_'||(LA12_188>='a' && LA12_188<='z')) ) {
                                            alt12=33;
                                        }
                                        else {
                                            alt12=8;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_41 = input.LA(3);

                if ( ((LA12_41>='0' && LA12_41<='9')||(LA12_41>='A' && LA12_41<='Z')||LA12_41=='_'||(LA12_41>='a' && LA12_41<='z')) ) {
                    alt12=33;
                }
                else {
                    alt12=28;}
                }
                break;
            case 'r':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='u') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='e') ) {
                        int LA12_99 = input.LA(5);

                        if ( ((LA12_99>='0' && LA12_99<='9')||(LA12_99>='A' && LA12_99<='Z')||LA12_99=='_'||(LA12_99>='a' && LA12_99<='z')) ) {
                            alt12=33;
                        }
                        else {
                            alt12=9;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
                }
                break;
            default:
                alt12=33;}

        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='i') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='a') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='s') ) {
                            int LA12_125 = input.LA(6);

                            if ( ((LA12_125>='0' && LA12_125<='9')||(LA12_125>='A' && LA12_125<='Z')||LA12_125=='_'||(LA12_125>='a' && LA12_125<='z')) ) {
                                alt12=33;
                            }
                            else {
                                alt12=26;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
                }
                break;
            case 'c':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='t') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='i') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='o') ) {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='n') ) {
                                int LA12_149 = input.LA(7);

                                if ( (LA12_149=='s') ) {
                                    int LA12_170 = input.LA(8);

                                    if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
                                        alt12=33;
                                    }
                                    else {
                                        alt12=11;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
                }
                break;
            default:
                alt12=33;}

        }
        else if ( (LA12_0==']') ) {
            alt12=12;
        }
        else if ( (LA12_0=='u') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='s') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='e') ) {
                    int LA12_77 = input.LA(4);

                    if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                        alt12=33;
                    }
                    else {
                        alt12=14;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='a') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='l') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='o') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='g') ) {
                                int LA12_150 = input.LA(7);

                                if ( (LA12_150=='u') ) {
                                    int LA12_171 = input.LA(8);

                                    if ( (LA12_171=='e') ) {
                                        switch ( input.LA(9) ) {
                                        case 's':
                                            {
                                            int LA12_204 = input.LA(10);

                                            if ( ((LA12_204>='0' && LA12_204<='9')||(LA12_204>='A' && LA12_204<='Z')||LA12_204=='_'||(LA12_204>='a' && LA12_204<='z')) ) {
                                                alt12=33;
                                            }
                                            else {
                                                alt12=16;}
                                            }
                                            break;
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
                                        case 'A':
                                        case 'B':
                                        case 'C':
                                        case 'D':
                                        case 'E':
                                        case 'F':
                                        case 'G':
                                        case 'H':
                                        case 'I':
                                        case 'J':
                                        case 'K':
                                        case 'L':
                                        case 'M':
                                        case 'N':
                                        case 'O':
                                        case 'P':
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
                                        case '_':
                                        case 'a':
                                        case 'b':
                                        case 'c':
                                        case 'd':
                                        case 'e':
                                        case 'f':
                                        case 'g':
                                        case 'h':
                                        case 'i':
                                        case 'j':
                                        case 'k':
                                        case 'l':
                                        case 'm':
                                        case 'n':
                                        case 'o':
                                        case 'p':
                                        case 'q':
                                        case 'r':
                                        case 't':
                                        case 'u':
                                        case 'v':
                                        case 'w':
                                        case 'x':
                                        case 'y':
                                        case 'z':
                                            {
                                            alt12=33;
                                            }
                                            break;
                                        default:
                                            alt12=31;}

                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
                }
                break;
            case 'e':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='t') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='a') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='i') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='l') ) {
                                int LA12_151 = input.LA(7);

                                if ( ((LA12_151>='0' && LA12_151<='9')||(LA12_151>='A' && LA12_151<='Z')||LA12_151=='_'||(LA12_151>='a' && LA12_151<='z')) ) {
                                    alt12=33;
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
                }
                break;
            default:
                alt12=33;}

        }
        else if ( (LA12_0=='M') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='a') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='s') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='t') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='e') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='r') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='D') ) {
                                    int LA12_173 = input.LA(8);

                                    if ( (LA12_173=='e') ) {
                                        int LA12_191 = input.LA(9);

                                        if ( (LA12_191=='t') ) {
                                            int LA12_206 = input.LA(10);

                                            if ( (LA12_206=='a') ) {
                                                int LA12_218 = input.LA(11);

                                                if ( (LA12_218=='i') ) {
                                                    int LA12_225 = input.LA(12);

                                                    if ( (LA12_225=='l') ) {
                                                        int LA12_232 = input.LA(13);

                                                        if ( ((LA12_232>='0' && LA12_232<='9')||(LA12_232>='A' && LA12_232<='Z')||LA12_232=='_'||(LA12_232>='a' && LA12_232<='z')) ) {
                                                            alt12=33;
                                                        }
                                                        else {
                                                            alt12=18;}
                                                    }
                                                    else {
                                                        alt12=33;}
                                                }
                                                else {
                                                    alt12=33;}
                                            }
                                            else {
                                                alt12=33;}
                                        }
                                        else {
                                            alt12=33;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='a') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='s') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='t') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='e') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='r') ) {
                                int LA12_153 = input.LA(7);

                                if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                                    alt12=33;
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='A') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='u') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='t') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='o') ) {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='m') ) {
                            int LA12_131 = input.LA(6);

                            if ( (LA12_131=='a') ) {
                                int LA12_154 = input.LA(7);

                                if ( (LA12_154=='t') ) {
                                    int LA12_175 = input.LA(8);

                                    if ( (LA12_175=='e') ) {
                                        int LA12_192 = input.LA(9);

                                        if ( (LA12_192=='d') ) {
                                            int LA12_207 = input.LA(10);

                                            if ( (LA12_207=='P') ) {
                                                int LA12_219 = input.LA(11);

                                                if ( (LA12_219=='r') ) {
                                                    int LA12_226 = input.LA(12);

                                                    if ( (LA12_226=='o') ) {
                                                        int LA12_233 = input.LA(13);

                                                        if ( (LA12_233=='c') ) {
                                                            int LA12_239 = input.LA(14);

                                                            if ( (LA12_239=='e') ) {
                                                                int LA12_243 = input.LA(15);

                                                                if ( (LA12_243=='s') ) {
                                                                    int LA12_247 = input.LA(16);

                                                                    if ( (LA12_247=='s') ) {
                                                                        int LA12_251 = input.LA(17);

                                                                        if ( ((LA12_251>='0' && LA12_251<='9')||(LA12_251>='A' && LA12_251<='Z')||LA12_251=='_'||(LA12_251>='a' && LA12_251<='z')) ) {
                                                                            alt12=33;
                                                                        }
                                                                        else {
                                                                            alt12=21;}
                                                                    }
                                                                    else {
                                                                        alt12=33;}
                                                                }
                                                                else {
                                                                    alt12=33;}
                                                            }
                                                            else {
                                                                alt12=33;}
                                                        }
                                                        else {
                                                            alt12=33;}
                                                    }
                                                    else {
                                                        alt12=33;}
                                                }
                                                else {
                                                    alt12=33;}
                                            }
                                            else {
                                                alt12=33;}
                                        }
                                        else {
                                            alt12=33;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='t') ) {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='e') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='p') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='s') ) {
                            int LA12_132 = input.LA(6);

                            if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                                alt12=33;
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='I') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='n') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='t') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='e') ) {
                        int LA12_109 = input.LA(5);

                        if ( (LA12_109=='r') ) {
                            int LA12_133 = input.LA(6);

                            if ( (LA12_133=='a') ) {
                                int LA12_156 = input.LA(7);

                                if ( (LA12_156=='c') ) {
                                    int LA12_176 = input.LA(8);

                                    if ( (LA12_176=='t') ) {
                                        int LA12_193 = input.LA(9);

                                        if ( (LA12_193=='i') ) {
                                            int LA12_208 = input.LA(10);

                                            if ( (LA12_208=='v') ) {
                                                int LA12_220 = input.LA(11);

                                                if ( (LA12_220=='e') ) {
                                                    int LA12_227 = input.LA(12);

                                                    if ( (LA12_227=='P') ) {
                                                        int LA12_234 = input.LA(13);

                                                        if ( (LA12_234=='r') ) {
                                                            int LA12_240 = input.LA(14);

                                                            if ( (LA12_240=='o') ) {
                                                                int LA12_244 = input.LA(15);

                                                                if ( (LA12_244=='c') ) {
                                                                    int LA12_248 = input.LA(16);

                                                                    if ( (LA12_248=='e') ) {
                                                                        int LA12_252 = input.LA(17);

                                                                        if ( (LA12_252=='s') ) {
                                                                            int LA12_256 = input.LA(18);

                                                                            if ( (LA12_256=='s') ) {
                                                                                int LA12_258 = input.LA(19);

                                                                                if ( ((LA12_258>='0' && LA12_258<='9')||(LA12_258>='A' && LA12_258<='Z')||LA12_258=='_'||(LA12_258>='a' && LA12_258<='z')) ) {
                                                                                    alt12=33;
                                                                                }
                                                                                else {
                                                                                    alt12=23;}
                                                                            }
                                                                            else {
                                                                                alt12=33;}
                                                                        }
                                                                        else {
                                                                            alt12=33;}
                                                                    }
                                                                    else {
                                                                        alt12=33;}
                                                                }
                                                                else {
                                                                    alt12=33;}
                                                            }
                                                            else {
                                                                alt12=33;}
                                                        }
                                                        else {
                                                            alt12=33;}
                                                    }
                                                    else {
                                                        alt12=33;}
                                                }
                                                else {
                                                    alt12=33;}
                                            }
                                            else {
                                                alt12=33;}
                                        }
                                        else {
                                            alt12=33;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='e') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='l') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='e') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='m') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='e') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='n') ) {
                                int LA12_157 = input.LA(7);

                                if ( (LA12_157=='t') ) {
                                    int LA12_177 = input.LA(8);

                                    if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                                        alt12=33;
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='l') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='a') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='b') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='e') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='l') ) {
                            int LA12_135 = input.LA(6);

                            if ( ((LA12_135>='0' && LA12_135<='9')||(LA12_135>='A' && LA12_135<='Z')||LA12_135=='_'||(LA12_135>='a' && LA12_135<='z')) ) {
                                alt12=33;
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='a') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='v') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='i') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='g') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='a') ) {
                                int LA12_159 = input.LA(7);

                                if ( (LA12_159=='t') ) {
                                    int LA12_178 = input.LA(8);

                                    if ( (LA12_178=='e') ) {
                                        int LA12_195 = input.LA(9);

                                        if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                            alt12=33;
                                        }
                                        else {
                                            alt12=27;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='L') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='i') ) {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='n') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='k') ) {
                        switch ( input.LA(5) ) {
                        case 'S':
                            {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='t') ) {
                                int LA12_160 = input.LA(7);

                                if ( (LA12_160=='e') ) {
                                    int LA12_179 = input.LA(8);

                                    if ( (LA12_179=='p') ) {
                                        int LA12_196 = input.LA(9);

                                        if ( ((LA12_196>='0' && LA12_196<='9')||(LA12_196>='A' && LA12_196<='Z')||LA12_196=='_'||(LA12_196>='a' && LA12_196<='z')) ) {
                                            alt12=33;
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                            }
                            break;
                        case 'P':
                            {
                            int LA12_138 = input.LA(6);

                            if ( (LA12_138=='a') ) {
                                int LA12_161 = input.LA(7);

                                if ( (LA12_161=='t') ) {
                                    int LA12_180 = input.LA(8);

                                    if ( (LA12_180=='h') ) {
                                        int LA12_197 = input.LA(9);

                                        if ( ((LA12_197>='0' && LA12_197<='9')||(LA12_197>='A' && LA12_197<='Z')||LA12_197=='_'||(LA12_197>='a' && LA12_197<='z')) ) {
                                            alt12=33;
                                        }
                                        else {
                                            alt12=30;}
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=33;}
                            }
                            break;
                        default:
                            alt12=33;}

                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=33;}
            }
            else {
                alt12=33;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_23 = input.LA(2);

            if ( ((LA12_23>='A' && LA12_23<='Z')||LA12_23=='_'||(LA12_23>='a' && LA12_23<='z')) ) {
                alt12=33;
            }
            else {
                alt12=39;}
        }
        else if ( (LA12_0=='B'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='N' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {
            alt12=33;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=34;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
                alt12=35;
            }
            else {
                alt12=39;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFE')) ) {
                alt12=35;
            }
            else {
                alt12=39;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=37;
                }
                break;
            case '*':
                {
                alt12=36;
                }
                break;
            default:
                alt12=39;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=38;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=39;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:138: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:146: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:155: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:167: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:183: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:199: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:207: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}