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
    public static final int T45=45;
    public static final int T20=20;
    public static final int T34=34;
    public static final int T25=25;
    public static final int T18=18;
    public static final int T37=37;
    public static final int T26=26;
    public static final int RULE_INT=6;
    public static final int T32=32;
    public static final int T17=17;
    public static final int T51=51;
    public static final int T46=46;
    public static final int T16=16;
    public static final int T38=38;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T39=39;
    public static final int T21=21;
    public static final int T44=44;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int T33=33;
    public static final int T11=11;
    public static final int T22=22;
    public static final int T50=50;
    public static final int T43=43;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T28=28;
    public static final int T42=42;
    public static final int T40=40;
    public static final int T13=13;
    public static final int RULE_WS=9;
    public static final int T48=48;
    public static final int T15=15;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T47=47;
    public static final int Tokens=55;
    public static final int T53=53;
    public static final int RULE_ANY_OTHER=10;
    public static final int T31=31;
    public static final int T49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int T27=27;
    public static final int T52=52;
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:14:5: ( 'ListForm' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:14:7: 'ListForm'
            {
            match("ListForm"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:15:5: ( 'ContentForm' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:15:7: 'ContentForm'
            {
            match("ContentForm"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:16:5: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:16:7: 'context'
            {
            match("context"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:17:5: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:17:7: '['
            {
            match('['); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:18:5: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:18:7: 'readonly'
            {
            match("readonly"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:19:5: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:19:7: 'true'
            {
            match("true"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:20:5: ( 'false' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:20:7: 'false'
            {
            match("false"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:21:5: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:21:7: 'actions'
            {
            match("actions"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:22:5: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:22:7: ']'
            {
            match(']'); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:23:5: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:23:7: 'processes'
            {
            match("processes"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:24:5: ( 'batch' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:24:7: 'batch'
            {
            match("batch"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:25:5: ( 'use' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:25:7: 'use'
            {
            match("use"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:26:5: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:26:7: 'CompoundDialogue'
            {
            match("CompoundDialogue"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:27:5: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:27:7: 'dialogues'
            {
            match("dialogues"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:28:5: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:28:7: 'CollectionDialogue'
            {
            match("CollectionDialogue"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:29:5: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:29:7: 'MasterDetail'
            {
            match("MasterDetail"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:30:5: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:30:7: 'master'
            {
            match("master"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:31:5: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:31:7: 'detail'
            {
            match("detail"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:32:5: ( 'AutomatedProcess' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:32:7: 'AutomatedProcess'
            {
            match("AutomatedProcess"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:33:5: ( 'steps' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:33:7: 'steps'
            {
            match("steps"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:34:5: ( 'InteractiveProcess' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:34:7: 'InteractiveProcess'
            {
            match("InteractiveProcess"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:35:5: ( 'step' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:35:7: 'step'
            {
            match("step"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:36:5: ( 'element' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:36:7: 'element'
            {
            match("element"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:37:5: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:37:7: 'label'
            {
            match("label"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:38:5: ( 'to' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:38:7: 'to'
            {
            match("to"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:39:5: ( 'alias' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:39:7: 'alias'
            {
            match("alias"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:40:5: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:40:7: '('
            {
            match('('); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:41:5: ( ',' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:41:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:42:5: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:42:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:43:5: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:43:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:44:5: ( 'call' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:44:7: 'call'
            {
            match("call"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:45:5: ( '.' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:45:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:46:5: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:46:7: 'navigate'
            {
            match("navigate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:47:5: ( 'dialogue' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:47:7: 'dialogue'
            {
            match("dialogue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:48:5: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:48:7: 'process'
            {
            match("process"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:49:5: ( 'new' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:49:7: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:50:5: ( 'save' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:50:7: 'save'
            {
            match("save"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:51:5: ( 'edit' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:51:7: 'edit'
            {
            match("edit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:52:5: ( 'remove' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:52:7: 'remove'
            {
            match("remove"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:53:5: ( 'Cancel' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:53:7: 'Cancel'
            {
            match("Cancel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2599:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2599:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2599:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2599:11: '^'
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2599:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2601:10: ( ( '0' .. '9' )+ )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2601:12: ( '0' .. '9' )+
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2601:12: ( '0' .. '9' )+
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
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2601:13: '0' .. '9'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2603:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2603:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2605:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2605:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2605:24: ( options {greedy=false; } : . )*
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
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2605:52: .
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:41: '\\r'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2609:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2609:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2609:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2611:16: ( . )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2611:18: .
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
        // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=51;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='c') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='e') ) {
                            int LA12_145 = input.LA(6);

                            if ( (LA12_145=='s') ) {
                                int LA12_176 = input.LA(7);

                                if ( (LA12_176=='s') ) {
                                    switch ( input.LA(8) ) {
                                    case 'e':
                                        {
                                        int LA12_221 = input.LA(9);

                                        if ( (LA12_221=='s') ) {
                                            int LA12_237 = input.LA(10);

                                            if ( ((LA12_237>='0' && LA12_237<='9')||(LA12_237>='A' && LA12_237<='Z')||LA12_237=='_'||(LA12_237>='a' && LA12_237<='z')) ) {
                                                alt12=45;
                                            }
                                            else {
                                                alt12=14;}
                                        }
                                        else {
                                            alt12=45;}
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
                                        alt12=45;
                                        }
                                        break;
                                    default:
                                        alt12=39;}

                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                    }
                    break;
                case 'e':
                    {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='s') ) {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='e') ) {
                            int LA12_146 = input.LA(6);

                            if ( (LA12_146=='n') ) {
                                int LA12_177 = input.LA(7);

                                if ( (LA12_177=='t') ) {
                                    int LA12_202 = input.LA(8);

                                    if ( (LA12_202=='a') ) {
                                        int LA12_223 = input.LA(9);

                                        if ( (LA12_223=='t') ) {
                                            int LA12_238 = input.LA(10);

                                            if ( (LA12_238=='i') ) {
                                                int LA12_251 = input.LA(11);

                                                if ( (LA12_251=='o') ) {
                                                    int LA12_259 = input.LA(12);

                                                    if ( (LA12_259=='n') ) {
                                                        int LA12_266 = input.LA(13);

                                                        if ( ((LA12_266>='0' && LA12_266<='9')||(LA12_266>='A' && LA12_266<='Z')||LA12_266=='_'||(LA12_266>='a' && LA12_266<='z')) ) {
                                                            alt12=45;
                                                        }
                                                        else {
                                                            alt12=1;}
                                                    }
                                                    else {
                                                        alt12=45;}
                                                }
                                                else {
                                                    alt12=45;}
                                            }
                                            else {
                                                alt12=45;}
                                        }
                                        else {
                                            alt12=45;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                    }
                    break;
                default:
                    alt12=45;}

            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0==';') ) {
            alt12=2;
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='o') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='m') ) {
                        int LA12_115 = input.LA(5);

                        if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                            alt12=45;
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'a':
                {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='l') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='s') ) {
                        int LA12_116 = input.LA(5);

                        if ( (LA12_116=='e') ) {
                            int LA12_148 = input.LA(6);

                            if ( ((LA12_148>='0' && LA12_148<='9')||(LA12_148>='A' && LA12_148<='Z')||LA12_148=='_'||(LA12_148>='a' && LA12_148<='z')) ) {
                                alt12=45;
                            }
                            else {
                                alt12=11;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0=='i') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='m') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='p') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='o') ) {
                        int LA12_117 = input.LA(5);

                        if ( (LA12_117=='r') ) {
                            int LA12_149 = input.LA(6);

                            if ( (LA12_149=='t') ) {
                                int LA12_179 = input.LA(7);

                                if ( ((LA12_179>='0' && LA12_179<='9')||(LA12_179>='A' && LA12_179<='Z')||LA12_179=='_'||(LA12_179>='a' && LA12_179<='z')) ) {
                                    alt12=45;
                                }
                                else {
                                    alt12=4;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='L') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='i') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='s') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='t') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='F') ) {
                            int LA12_150 = input.LA(6);

                            if ( (LA12_150=='o') ) {
                                int LA12_180 = input.LA(7);

                                if ( (LA12_180=='r') ) {
                                    int LA12_204 = input.LA(8);

                                    if ( (LA12_204=='m') ) {
                                        int LA12_224 = input.LA(9);

                                        if ( ((LA12_224>='0' && LA12_224<='9')||(LA12_224>='A' && LA12_224<='Z')||LA12_224=='_'||(LA12_224>='a' && LA12_224<='z')) ) {
                                            alt12=45;
                                        }
                                        else {
                                            alt12=5;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='C') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='n') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='c') ) {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='e') ) {
                            int LA12_151 = input.LA(6);

                            if ( (LA12_151=='l') ) {
                                int LA12_181 = input.LA(7);

                                if ( ((LA12_181>='0' && LA12_181<='9')||(LA12_181>='A' && LA12_181<='Z')||LA12_181=='_'||(LA12_181>='a' && LA12_181<='z')) ) {
                                    alt12=45;
                                }
                                else {
                                    alt12=44;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='t') ) {
                        int LA12_120 = input.LA(5);

                        if ( (LA12_120=='e') ) {
                            int LA12_152 = input.LA(6);

                            if ( (LA12_152=='n') ) {
                                int LA12_182 = input.LA(7);

                                if ( (LA12_182=='t') ) {
                                    int LA12_206 = input.LA(8);

                                    if ( (LA12_206=='F') ) {
                                        int LA12_225 = input.LA(9);

                                        if ( (LA12_225=='o') ) {
                                            int LA12_240 = input.LA(10);

                                            if ( (LA12_240=='r') ) {
                                                int LA12_252 = input.LA(11);

                                                if ( (LA12_252=='m') ) {
                                                    int LA12_260 = input.LA(12);

                                                    if ( ((LA12_260>='0' && LA12_260<='9')||(LA12_260>='A' && LA12_260<='Z')||LA12_260=='_'||(LA12_260>='a' && LA12_260<='z')) ) {
                                                        alt12=45;
                                                    }
                                                    else {
                                                        alt12=6;}
                                                }
                                                else {
                                                    alt12=45;}
                                            }
                                            else {
                                                alt12=45;}
                                        }
                                        else {
                                            alt12=45;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='l') ) {
                        int LA12_121 = input.LA(5);

                        if ( (LA12_121=='e') ) {
                            int LA12_153 = input.LA(6);

                            if ( (LA12_153=='c') ) {
                                int LA12_183 = input.LA(7);

                                if ( (LA12_183=='t') ) {
                                    int LA12_207 = input.LA(8);

                                    if ( (LA12_207=='i') ) {
                                        int LA12_226 = input.LA(9);

                                        if ( (LA12_226=='o') ) {
                                            int LA12_241 = input.LA(10);

                                            if ( (LA12_241=='n') ) {
                                                int LA12_253 = input.LA(11);

                                                if ( (LA12_253=='D') ) {
                                                    int LA12_261 = input.LA(12);

                                                    if ( (LA12_261=='i') ) {
                                                        int LA12_268 = input.LA(13);

                                                        if ( (LA12_268=='a') ) {
                                                            int LA12_274 = input.LA(14);

                                                            if ( (LA12_274=='l') ) {
                                                                int LA12_279 = input.LA(15);

                                                                if ( (LA12_279=='o') ) {
                                                                    int LA12_283 = input.LA(16);

                                                                    if ( (LA12_283=='g') ) {
                                                                        int LA12_287 = input.LA(17);

                                                                        if ( (LA12_287=='u') ) {
                                                                            int LA12_291 = input.LA(18);

                                                                            if ( (LA12_291=='e') ) {
                                                                                int LA12_295 = input.LA(19);

                                                                                if ( ((LA12_295>='0' && LA12_295<='9')||(LA12_295>='A' && LA12_295<='Z')||LA12_295=='_'||(LA12_295>='a' && LA12_295<='z')) ) {
                                                                                    alt12=45;
                                                                                }
                                                                                else {
                                                                                    alt12=19;}
                                                                            }
                                                                            else {
                                                                                alt12=45;}
                                                                        }
                                                                        else {
                                                                            alt12=45;}
                                                                    }
                                                                    else {
                                                                        alt12=45;}
                                                                }
                                                                else {
                                                                    alt12=45;}
                                                            }
                                                            else {
                                                                alt12=45;}
                                                        }
                                                        else {
                                                            alt12=45;}
                                                    }
                                                    else {
                                                        alt12=45;}
                                                }
                                                else {
                                                    alt12=45;}
                                            }
                                            else {
                                                alt12=45;}
                                        }
                                        else {
                                            alt12=45;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                    }
                    break;
                case 'm':
                    {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='p') ) {
                        int LA12_122 = input.LA(5);

                        if ( (LA12_122=='o') ) {
                            int LA12_154 = input.LA(6);

                            if ( (LA12_154=='u') ) {
                                int LA12_184 = input.LA(7);

                                if ( (LA12_184=='n') ) {
                                    int LA12_208 = input.LA(8);

                                    if ( (LA12_208=='d') ) {
                                        int LA12_227 = input.LA(9);

                                        if ( (LA12_227=='D') ) {
                                            int LA12_242 = input.LA(10);

                                            if ( (LA12_242=='i') ) {
                                                int LA12_254 = input.LA(11);

                                                if ( (LA12_254=='a') ) {
                                                    int LA12_262 = input.LA(12);

                                                    if ( (LA12_262=='l') ) {
                                                        int LA12_269 = input.LA(13);

                                                        if ( (LA12_269=='o') ) {
                                                            int LA12_275 = input.LA(14);

                                                            if ( (LA12_275=='g') ) {
                                                                int LA12_280 = input.LA(15);

                                                                if ( (LA12_280=='u') ) {
                                                                    int LA12_284 = input.LA(16);

                                                                    if ( (LA12_284=='e') ) {
                                                                        int LA12_288 = input.LA(17);

                                                                        if ( ((LA12_288>='0' && LA12_288<='9')||(LA12_288>='A' && LA12_288<='Z')||LA12_288=='_'||(LA12_288>='a' && LA12_288<='z')) ) {
                                                                            alt12=45;
                                                                        }
                                                                        else {
                                                                            alt12=17;}
                                                                    }
                                                                    else {
                                                                        alt12=45;}
                                                                }
                                                                else {
                                                                    alt12=45;}
                                                            }
                                                            else {
                                                                alt12=45;}
                                                        }
                                                        else {
                                                            alt12=45;}
                                                    }
                                                    else {
                                                        alt12=45;}
                                                }
                                                else {
                                                    alt12=45;}
                                            }
                                            else {
                                                alt12=45;}
                                        }
                                        else {
                                            alt12=45;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                    }
                    break;
                default:
                    alt12=45;}

                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='n') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='t') ) {
                        int LA12_123 = input.LA(5);

                        if ( (LA12_123=='e') ) {
                            int LA12_155 = input.LA(6);

                            if ( (LA12_155=='x') ) {
                                int LA12_185 = input.LA(7);

                                if ( (LA12_185=='t') ) {
                                    int LA12_209 = input.LA(8);

                                    if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
                                        alt12=45;
                                    }
                                    else {
                                        alt12=7;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'a':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='l') ) {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='l') ) {
                        int LA12_124 = input.LA(5);

                        if ( ((LA12_124>='0' && LA12_124<='9')||(LA12_124>='A' && LA12_124<='Z')||LA12_124=='_'||(LA12_124>='a' && LA12_124<='z')) ) {
                            alt12=45;
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0=='[') ) {
            alt12=8;
        }
        else if ( (LA12_0=='r') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='e') ) {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='d') ) {
                        int LA12_125 = input.LA(5);

                        if ( (LA12_125=='o') ) {
                            int LA12_157 = input.LA(6);

                            if ( (LA12_157=='n') ) {
                                int LA12_186 = input.LA(7);

                                if ( (LA12_186=='l') ) {
                                    int LA12_210 = input.LA(8);

                                    if ( (LA12_210=='y') ) {
                                        int LA12_229 = input.LA(9);

                                        if ( ((LA12_229>='0' && LA12_229<='9')||(LA12_229>='A' && LA12_229<='Z')||LA12_229=='_'||(LA12_229>='a' && LA12_229<='z')) ) {
                                            alt12=45;
                                        }
                                        else {
                                            alt12=9;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                    }
                    break;
                case 'm':
                    {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='o') ) {
                        int LA12_126 = input.LA(5);

                        if ( (LA12_126=='v') ) {
                            int LA12_158 = input.LA(6);

                            if ( (LA12_158=='e') ) {
                                int LA12_187 = input.LA(7);

                                if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                    alt12=45;
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                    }
                    break;
                default:
                    alt12=45;}

            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='u') ) {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='e') ) {
                        int LA12_127 = input.LA(5);

                        if ( ((LA12_127>='0' && LA12_127<='9')||(LA12_127>='A' && LA12_127<='Z')||LA12_127=='_'||(LA12_127>='a' && LA12_127<='z')) ) {
                            alt12=45;
                        }
                        else {
                            alt12=10;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'o':
                {
                int LA12_51 = input.LA(3);

                if ( ((LA12_51>='0' && LA12_51<='9')||(LA12_51>='A' && LA12_51<='Z')||LA12_51=='_'||(LA12_51>='a' && LA12_51<='z')) ) {
                    alt12=45;
                }
                else {
                    alt12=29;}
                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='t') ) {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='i') ) {
                        int LA12_128 = input.LA(5);

                        if ( (LA12_128=='o') ) {
                            int LA12_160 = input.LA(6);

                            if ( (LA12_160=='n') ) {
                                int LA12_188 = input.LA(7);

                                if ( (LA12_188=='s') ) {
                                    int LA12_212 = input.LA(8);

                                    if ( ((LA12_212>='0' && LA12_212<='9')||(LA12_212>='A' && LA12_212<='Z')||LA12_212=='_'||(LA12_212>='a' && LA12_212<='z')) ) {
                                        alt12=45;
                                    }
                                    else {
                                        alt12=12;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'l':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='i') ) {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='a') ) {
                        int LA12_129 = input.LA(5);

                        if ( (LA12_129=='s') ) {
                            int LA12_161 = input.LA(6);

                            if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                                alt12=45;
                            }
                            else {
                                alt12=30;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0==']') ) {
            alt12=13;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='a') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='t') ) {
                    int LA12_98 = input.LA(4);

                    if ( (LA12_98=='c') ) {
                        int LA12_130 = input.LA(5);

                        if ( (LA12_130=='h') ) {
                            int LA12_162 = input.LA(6);

                            if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                                alt12=45;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='s') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='e') ) {
                    int LA12_99 = input.LA(4);

                    if ( ((LA12_99>='0' && LA12_99<='9')||(LA12_99>='A' && LA12_99<='Z')||LA12_99=='_'||(LA12_99>='a' && LA12_99<='z')) ) {
                        alt12=45;
                    }
                    else {
                        alt12=16;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='a') ) {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='l') ) {
                        int LA12_132 = input.LA(5);

                        if ( (LA12_132=='o') ) {
                            int LA12_163 = input.LA(6);

                            if ( (LA12_163=='g') ) {
                                int LA12_191 = input.LA(7);

                                if ( (LA12_191=='u') ) {
                                    int LA12_213 = input.LA(8);

                                    if ( (LA12_213=='e') ) {
                                        switch ( input.LA(9) ) {
                                        case 's':
                                            {
                                            int LA12_244 = input.LA(10);

                                            if ( ((LA12_244>='0' && LA12_244<='9')||(LA12_244>='A' && LA12_244<='Z')||LA12_244=='_'||(LA12_244>='a' && LA12_244<='z')) ) {
                                                alt12=45;
                                            }
                                            else {
                                                alt12=18;}
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
                                            alt12=45;
                                            }
                                            break;
                                        default:
                                            alt12=38;}

                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'e':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='t') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='a') ) {
                        int LA12_133 = input.LA(5);

                        if ( (LA12_133=='i') ) {
                            int LA12_164 = input.LA(6);

                            if ( (LA12_164=='l') ) {
                                int LA12_192 = input.LA(7);

                                if ( ((LA12_192>='0' && LA12_192<='9')||(LA12_192>='A' && LA12_192<='Z')||LA12_192=='_'||(LA12_192>='a' && LA12_192<='z')) ) {
                                    alt12=45;
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0=='M') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='a') ) {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='s') ) {
                    int LA12_102 = input.LA(4);

                    if ( (LA12_102=='t') ) {
                        int LA12_134 = input.LA(5);

                        if ( (LA12_134=='e') ) {
                            int LA12_165 = input.LA(6);

                            if ( (LA12_165=='r') ) {
                                int LA12_193 = input.LA(7);

                                if ( (LA12_193=='D') ) {
                                    int LA12_215 = input.LA(8);

                                    if ( (LA12_215=='e') ) {
                                        int LA12_232 = input.LA(9);

                                        if ( (LA12_232=='t') ) {
                                            int LA12_246 = input.LA(10);

                                            if ( (LA12_246=='a') ) {
                                                int LA12_256 = input.LA(11);

                                                if ( (LA12_256=='i') ) {
                                                    int LA12_263 = input.LA(12);

                                                    if ( (LA12_263=='l') ) {
                                                        int LA12_270 = input.LA(13);

                                                        if ( ((LA12_270>='0' && LA12_270<='9')||(LA12_270>='A' && LA12_270<='Z')||LA12_270=='_'||(LA12_270>='a' && LA12_270<='z')) ) {
                                                            alt12=45;
                                                        }
                                                        else {
                                                            alt12=20;}
                                                    }
                                                    else {
                                                        alt12=45;}
                                                }
                                                else {
                                                    alt12=45;}
                                            }
                                            else {
                                                alt12=45;}
                                        }
                                        else {
                                            alt12=45;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='a') ) {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='s') ) {
                    int LA12_103 = input.LA(4);

                    if ( (LA12_103=='t') ) {
                        int LA12_135 = input.LA(5);

                        if ( (LA12_135=='e') ) {
                            int LA12_166 = input.LA(6);

                            if ( (LA12_166=='r') ) {
                                int LA12_194 = input.LA(7);

                                if ( ((LA12_194>='0' && LA12_194<='9')||(LA12_194>='A' && LA12_194<='Z')||LA12_194=='_'||(LA12_194>='a' && LA12_194<='z')) ) {
                                    alt12=45;
                                }
                                else {
                                    alt12=21;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='A') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='u') ) {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='t') ) {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='o') ) {
                        int LA12_136 = input.LA(5);

                        if ( (LA12_136=='m') ) {
                            int LA12_167 = input.LA(6);

                            if ( (LA12_167=='a') ) {
                                int LA12_195 = input.LA(7);

                                if ( (LA12_195=='t') ) {
                                    int LA12_217 = input.LA(8);

                                    if ( (LA12_217=='e') ) {
                                        int LA12_233 = input.LA(9);

                                        if ( (LA12_233=='d') ) {
                                            int LA12_247 = input.LA(10);

                                            if ( (LA12_247=='P') ) {
                                                int LA12_257 = input.LA(11);

                                                if ( (LA12_257=='r') ) {
                                                    int LA12_264 = input.LA(12);

                                                    if ( (LA12_264=='o') ) {
                                                        int LA12_271 = input.LA(13);

                                                        if ( (LA12_271=='c') ) {
                                                            int LA12_277 = input.LA(14);

                                                            if ( (LA12_277=='e') ) {
                                                                int LA12_281 = input.LA(15);

                                                                if ( (LA12_281=='s') ) {
                                                                    int LA12_285 = input.LA(16);

                                                                    if ( (LA12_285=='s') ) {
                                                                        int LA12_289 = input.LA(17);

                                                                        if ( ((LA12_289>='0' && LA12_289<='9')||(LA12_289>='A' && LA12_289<='Z')||LA12_289=='_'||(LA12_289>='a' && LA12_289<='z')) ) {
                                                                            alt12=45;
                                                                        }
                                                                        else {
                                                                            alt12=23;}
                                                                    }
                                                                    else {
                                                                        alt12=45;}
                                                                }
                                                                else {
                                                                    alt12=45;}
                                                            }
                                                            else {
                                                                alt12=45;}
                                                        }
                                                        else {
                                                            alt12=45;}
                                                    }
                                                    else {
                                                        alt12=45;}
                                                }
                                                else {
                                                    alt12=45;}
                                            }
                                            else {
                                                alt12=45;}
                                        }
                                        else {
                                            alt12=45;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='e') ) {
                    int LA12_105 = input.LA(4);

                    if ( (LA12_105=='p') ) {
                        switch ( input.LA(5) ) {
                        case 's':
                            {
                            int LA12_168 = input.LA(6);

                            if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
                                alt12=45;
                            }
                            else {
                                alt12=24;}
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
                            alt12=45;
                            }
                            break;
                        default:
                            alt12=26;}

                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'a':
                {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='v') ) {
                    int LA12_106 = input.LA(4);

                    if ( (LA12_106=='e') ) {
                        int LA12_138 = input.LA(5);

                        if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
                            alt12=45;
                        }
                        else {
                            alt12=41;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0=='I') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='n') ) {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='t') ) {
                    int LA12_107 = input.LA(4);

                    if ( (LA12_107=='e') ) {
                        int LA12_139 = input.LA(5);

                        if ( (LA12_139=='r') ) {
                            int LA12_171 = input.LA(6);

                            if ( (LA12_171=='a') ) {
                                int LA12_197 = input.LA(7);

                                if ( (LA12_197=='c') ) {
                                    int LA12_218 = input.LA(8);

                                    if ( (LA12_218=='t') ) {
                                        int LA12_234 = input.LA(9);

                                        if ( (LA12_234=='i') ) {
                                            int LA12_248 = input.LA(10);

                                            if ( (LA12_248=='v') ) {
                                                int LA12_258 = input.LA(11);

                                                if ( (LA12_258=='e') ) {
                                                    int LA12_265 = input.LA(12);

                                                    if ( (LA12_265=='P') ) {
                                                        int LA12_272 = input.LA(13);

                                                        if ( (LA12_272=='r') ) {
                                                            int LA12_278 = input.LA(14);

                                                            if ( (LA12_278=='o') ) {
                                                                int LA12_282 = input.LA(15);

                                                                if ( (LA12_282=='c') ) {
                                                                    int LA12_286 = input.LA(16);

                                                                    if ( (LA12_286=='e') ) {
                                                                        int LA12_290 = input.LA(17);

                                                                        if ( (LA12_290=='s') ) {
                                                                            int LA12_294 = input.LA(18);

                                                                            if ( (LA12_294=='s') ) {
                                                                                int LA12_296 = input.LA(19);

                                                                                if ( ((LA12_296>='0' && LA12_296<='9')||(LA12_296>='A' && LA12_296<='Z')||LA12_296=='_'||(LA12_296>='a' && LA12_296<='z')) ) {
                                                                                    alt12=45;
                                                                                }
                                                                                else {
                                                                                    alt12=25;}
                                                                            }
                                                                            else {
                                                                                alt12=45;}
                                                                        }
                                                                        else {
                                                                            alt12=45;}
                                                                    }
                                                                    else {
                                                                        alt12=45;}
                                                                }
                                                                else {
                                                                    alt12=45;}
                                                            }
                                                            else {
                                                                alt12=45;}
                                                        }
                                                        else {
                                                            alt12=45;}
                                                    }
                                                    else {
                                                        alt12=45;}
                                                }
                                                else {
                                                    alt12=45;}
                                            }
                                            else {
                                                alt12=45;}
                                        }
                                        else {
                                            alt12=45;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA12_65 = input.LA(3);

                if ( (LA12_65=='e') ) {
                    int LA12_108 = input.LA(4);

                    if ( (LA12_108=='m') ) {
                        int LA12_140 = input.LA(5);

                        if ( (LA12_140=='e') ) {
                            int LA12_172 = input.LA(6);

                            if ( (LA12_172=='n') ) {
                                int LA12_198 = input.LA(7);

                                if ( (LA12_198=='t') ) {
                                    int LA12_219 = input.LA(8);

                                    if ( ((LA12_219>='0' && LA12_219<='9')||(LA12_219>='A' && LA12_219<='Z')||LA12_219=='_'||(LA12_219>='a' && LA12_219<='z')) ) {
                                        alt12=45;
                                    }
                                    else {
                                        alt12=27;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'd':
                {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='i') ) {
                    int LA12_109 = input.LA(4);

                    if ( (LA12_109=='t') ) {
                        int LA12_141 = input.LA(5);

                        if ( ((LA12_141>='0' && LA12_141<='9')||(LA12_141>='A' && LA12_141<='Z')||LA12_141=='_'||(LA12_141>='a' && LA12_141<='z')) ) {
                            alt12=45;
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0=='l') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='a') ) {
                int LA12_67 = input.LA(3);

                if ( (LA12_67=='b') ) {
                    int LA12_110 = input.LA(4);

                    if ( (LA12_110=='e') ) {
                        int LA12_142 = input.LA(5);

                        if ( (LA12_142=='l') ) {
                            int LA12_174 = input.LA(6);

                            if ( ((LA12_174>='0' && LA12_174<='9')||(LA12_174>='A' && LA12_174<='Z')||LA12_174=='_'||(LA12_174>='a' && LA12_174<='z')) ) {
                                alt12=45;
                            }
                            else {
                                alt12=28;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
            }
            else {
                alt12=45;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=31;
        }
        else if ( (LA12_0==',') ) {
            alt12=32;
        }
        else if ( (LA12_0==')') ) {
            alt12=33;
        }
        else if ( (LA12_0==':') ) {
            alt12=34;
        }
        else if ( (LA12_0=='.') ) {
            alt12=36;
        }
        else if ( (LA12_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_73 = input.LA(3);

                if ( (LA12_73=='w') ) {
                    int LA12_111 = input.LA(4);

                    if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
                        alt12=45;
                    }
                    else {
                        alt12=40;}
                }
                else {
                    alt12=45;}
                }
                break;
            case 'a':
                {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='v') ) {
                    int LA12_112 = input.LA(4);

                    if ( (LA12_112=='i') ) {
                        int LA12_144 = input.LA(5);

                        if ( (LA12_144=='g') ) {
                            int LA12_175 = input.LA(6);

                            if ( (LA12_175=='a') ) {
                                int LA12_200 = input.LA(7);

                                if ( (LA12_200=='t') ) {
                                    int LA12_220 = input.LA(8);

                                    if ( (LA12_220=='e') ) {
                                        int LA12_236 = input.LA(9);

                                        if ( ((LA12_236>='0' && LA12_236<='9')||(LA12_236>='A' && LA12_236<='Z')||LA12_236=='_'||(LA12_236>='a' && LA12_236<='z')) ) {
                                            alt12=45;
                                        }
                                        else {
                                            alt12=37;}
                                    }
                                    else {
                                        alt12=45;}
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=45;}
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=45;}
                }
                else {
                    alt12=45;}
                }
                break;
            default:
                alt12=45;}

        }
        else if ( (LA12_0=='^') ) {
            int LA12_29 = input.LA(2);

            if ( ((LA12_29>='A' && LA12_29<='Z')||LA12_29=='_'||(LA12_29>='a' && LA12_29<='z')) ) {
                alt12=45;
            }
            else {
                alt12=51;}
        }
        else if ( (LA12_0=='B'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='N' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {
            alt12=45;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=46;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_32 = input.LA(2);

            if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFE')) ) {
                alt12=47;
            }
            else {
                alt12=51;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_33 = input.LA(2);

            if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFE')) ) {
                alt12=47;
            }
            else {
                alt12=51;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=49;
                }
                break;
            case '*':
                {
                alt12=48;
                }
                break;
            default:
                alt12=51;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=50;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=51;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

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
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:186: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:194: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 47 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:203: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 48 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:215: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:231: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 50 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:247: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 51 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:255: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}