package org.mod4j.dsl.presentation.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=53;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=4;
    public static final int T50=50;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalPresentationLexer() {;} 
    public InternalPresentationLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:10:5: ( 'application' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:10:7: 'application'
            {
            match("application"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:13:5: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:13:7: 'process'
            {
            match("process"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:14:5: ( 'presentation' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:14:7: 'presentation'
            {
            match("presentation"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:15:5: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:15:7: '['
            {
            match('['); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:16:5: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:16:7: ']'
            {
            match(']'); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:17:5: ( 'dto' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:17:7: 'dto'
            {
            match("dto"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:18:5: ( 'service' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:18:7: 'service'
            {
            match("service"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:19:5: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:19:7: 'form'
            {
            match("form"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:20:5: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:20:7: 'context'
            {
            match("context"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:21:5: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:21:7: 'list'
            {
            match("list"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:22:5: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:22:7: 'readonly'
            {
            match("readonly"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:23:5: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:23:7: 'true'
            {
            match("true"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:24:5: ( 'false' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:24:7: 'false'
            {
            match("false"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:25:5: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:25:7: 'actions'
            {
            match("actions"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:26:5: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:26:7: 'processes'
            {
            match("processes"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:27:5: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:27:7: 'label'
            {
            match("label"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:28:5: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:28:7: 'CompoundDialogue'
            {
            match("CompoundDialogue"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:29:5: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:29:7: 'dialogues'
            {
            match("dialogues"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:30:5: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:30:7: 'CollectionDialogue'
            {
            match("CollectionDialogue"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:31:5: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:31:7: 'MasterDetail'
            {
            match("MasterDetail"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:32:5: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:32:7: 'master'
            {
            match("master"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:33:5: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:33:7: 'detail'
            {
            match("detail"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:34:5: ( 'element' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:34:7: 'element'
            {
            match("element"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:35:5: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:35:7: ':'
            {
            match(':'); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:36:5: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:36:7: 'if'
            {
            match("if"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:37:5: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:37:7: '('
            {
            match('('); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:38:5: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:38:7: ')'
            {
            match(')'); 

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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:39:5: ( 'call' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:39:7: 'call'
            {
            match("call"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:40:5: ( 'composite' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:40:7: 'composite'
            {
            match("composite"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:41:5: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:41:7: 'navigate'
            {
            match("navigate"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:42:5: ( 'new' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:42:7: 'new'
            {
            match("new"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:43:5: ( 'save' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:43:7: 'save'
            {
            match("save"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:44:5: ( 'edit' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:44:7: 'edit'
            {
            match("edit"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:45:5: ( 'delete' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:45:7: 'delete'
            {
            match("delete"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:46:5: ( 'cancel' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:46:7: 'cancel'
            {
            match("cancel"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:47:5: ( 'removefrom' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:47:7: 'removefrom'
            {
            match("removefrom"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:48:5: ( 'addto' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:48:7: 'addto'
            {
            match("addto"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:49:5: ( 'link' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:49:7: 'link'
            {
            match("link"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:50:5: ( 'all' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:50:7: 'all'
            {
            match("all"); 


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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:51:5: ( 'find' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:51:7: 'find'
            {
            match("find"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3058:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3058:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3058:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3058:11: '^'
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3058:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3060:10: ( ( '0' .. '9' )+ )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3060:12: ( '0' .. '9' )+
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3060:12: ( '0' .. '9' )+
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
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3060:13: '0' .. '9'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("3062:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3062:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3064:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3064:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3064:24: ( options {greedy=false; } : . )*
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
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3064:52: .
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3066:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3066:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3066:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3066:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3066:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3066:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3066:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3066:41: '\\r'
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3068:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3068:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3068:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3070:16: ( . )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:3070:18: .
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
        // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=49;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'd':
                {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='d') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='t') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='o') ) {
                            int LA12_139 = input.LA(6);

                            if ( ((LA12_139>='0' && LA12_139<='9')||(LA12_139>='A' && LA12_139<='Z')||LA12_139=='_'||(LA12_139>='a' && LA12_139<='z')) ) {
                                alt12=43;
                            }
                            else {
                                alt12=39;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'l':
                {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='l') ) {
                    int LA12_71 = input.LA(4);

                    if ( ((LA12_71>='0' && LA12_71<='9')||(LA12_71>='A' && LA12_71<='Z')||LA12_71=='_'||(LA12_71>='a' && LA12_71<='z')) ) {
                        alt12=43;
                    }
                    else {
                        alt12=41;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'p':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='p') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='l') ) {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='i') ) {
                            int LA12_140 = input.LA(6);

                            if ( (LA12_140=='c') ) {
                                int LA12_171 = input.LA(7);

                                if ( (LA12_171=='a') ) {
                                    int LA12_192 = input.LA(8);

                                    if ( (LA12_192=='t') ) {
                                        int LA12_211 = input.LA(9);

                                        if ( (LA12_211=='i') ) {
                                            int LA12_227 = input.LA(10);

                                            if ( (LA12_227=='o') ) {
                                                int LA12_238 = input.LA(11);

                                                if ( (LA12_238=='n') ) {
                                                    int LA12_247 = input.LA(12);

                                                    if ( ((LA12_247>='0' && LA12_247<='9')||(LA12_247>='A' && LA12_247<='Z')||LA12_247=='_'||(LA12_247>='a' && LA12_247<='z')) ) {
                                                        alt12=43;
                                                    }
                                                    else {
                                                        alt12=1;}
                                                }
                                                else {
                                                    alt12=43;}
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=43;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'c':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='t') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='i') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='o') ) {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='n') ) {
                                int LA12_172 = input.LA(7);

                                if ( (LA12_172=='s') ) {
                                    int LA12_193 = input.LA(8);

                                    if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
                                        alt12=43;
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            default:
                alt12=43;}

        }
        else if ( (LA12_0==';') ) {
            alt12=2;
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='n') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='d') ) {
                        int LA12_109 = input.LA(5);

                        if ( ((LA12_109>='0' && LA12_109<='9')||(LA12_109>='A' && LA12_109<='Z')||LA12_109=='_'||(LA12_109>='a' && LA12_109<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=42;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'r':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='o') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='m') ) {
                        int LA12_110 = input.LA(5);

                        if ( ((LA12_110>='0' && LA12_110<='9')||(LA12_110>='A' && LA12_110<='Z')||LA12_110=='_'||(LA12_110>='a' && LA12_110<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'o':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='r') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='m') ) {
                        int LA12_111 = input.LA(5);

                        if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=10;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'a':
                {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='l') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='s') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='e') ) {
                            int LA12_145 = input.LA(6);

                            if ( ((LA12_145>='0' && LA12_145<='9')||(LA12_145>='A' && LA12_145<='Z')||LA12_145=='_'||(LA12_145>='a' && LA12_145<='z')) ) {
                                alt12=43;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            default:
                alt12=43;}

        }
        else if ( (LA12_0=='p') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='r') ) {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='c') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='e') ) {
                            int LA12_146 = input.LA(6);

                            if ( (LA12_146=='s') ) {
                                int LA12_174 = input.LA(7);

                                if ( (LA12_174=='s') ) {
                                    switch ( input.LA(8) ) {
                                    case 'e':
                                        {
                                        int LA12_213 = input.LA(9);

                                        if ( (LA12_213=='s') ) {
                                            int LA12_228 = input.LA(10);

                                            if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
                                                alt12=43;
                                            }
                                            else {
                                                alt12=17;}
                                        }
                                        else {
                                            alt12=43;}
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
                                        alt12=43;
                                        }
                                        break;
                                    default:
                                        alt12=4;}

                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                case 'e':
                    {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='s') ) {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='e') ) {
                            int LA12_147 = input.LA(6);

                            if ( (LA12_147=='n') ) {
                                int LA12_175 = input.LA(7);

                                if ( (LA12_175=='t') ) {
                                    int LA12_195 = input.LA(8);

                                    if ( (LA12_195=='a') ) {
                                        int LA12_215 = input.LA(9);

                                        if ( (LA12_215=='t') ) {
                                            int LA12_229 = input.LA(10);

                                            if ( (LA12_229=='i') ) {
                                                int LA12_240 = input.LA(11);

                                                if ( (LA12_240=='o') ) {
                                                    int LA12_248 = input.LA(12);

                                                    if ( (LA12_248=='n') ) {
                                                        int LA12_254 = input.LA(13);

                                                        if ( ((LA12_254>='0' && LA12_254<='9')||(LA12_254>='A' && LA12_254<='Z')||LA12_254=='_'||(LA12_254>='a' && LA12_254<='z')) ) {
                                                            alt12=43;
                                                        }
                                                        else {
                                                            alt12=5;}
                                                    }
                                                    else {
                                                        alt12=43;}
                                                }
                                                else {
                                                    alt12=43;}
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=43;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                default:
                    alt12=43;}

            }
            else {
                alt12=43;}
        }
        else if ( (LA12_0=='[') ) {
            alt12=6;
        }
        else if ( (LA12_0==']') ) {
            alt12=7;
        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='a') ) {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='i') ) {
                            int LA12_148 = input.LA(6);

                            if ( (LA12_148=='l') ) {
                                int LA12_176 = input.LA(7);

                                if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                                    alt12=43;
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='e') ) {
                        int LA12_116 = input.LA(5);

                        if ( (LA12_116=='t') ) {
                            int LA12_149 = input.LA(6);

                            if ( (LA12_149=='e') ) {
                                int LA12_177 = input.LA(7);

                                if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                                    alt12=43;
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                default:
                    alt12=43;}

                }
                break;
            case 't':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='o') ) {
                    int LA12_82 = input.LA(4);

                    if ( ((LA12_82>='0' && LA12_82<='9')||(LA12_82>='A' && LA12_82<='Z')||LA12_82=='_'||(LA12_82>='a' && LA12_82<='z')) ) {
                        alt12=43;
                    }
                    else {
                        alt12=8;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'i':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='a') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='l') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='o') ) {
                            int LA12_150 = input.LA(6);

                            if ( (LA12_150=='g') ) {
                                int LA12_178 = input.LA(7);

                                if ( (LA12_178=='u') ) {
                                    int LA12_198 = input.LA(8);

                                    if ( (LA12_198=='e') ) {
                                        int LA12_216 = input.LA(9);

                                        if ( (LA12_216=='s') ) {
                                            int LA12_230 = input.LA(10);

                                            if ( ((LA12_230>='0' && LA12_230<='9')||(LA12_230>='A' && LA12_230<='Z')||LA12_230=='_'||(LA12_230>='a' && LA12_230<='z')) ) {
                                                alt12=43;
                                            }
                                            else {
                                                alt12=20;}
                                        }
                                        else {
                                            alt12=43;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            default:
                alt12=43;}

        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='r') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='v') ) {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='i') ) {
                            int LA12_151 = input.LA(6);

                            if ( (LA12_151=='c') ) {
                                int LA12_179 = input.LA(7);

                                if ( (LA12_179=='e') ) {
                                    int LA12_199 = input.LA(8);

                                    if ( ((LA12_199>='0' && LA12_199<='9')||(LA12_199>='A' && LA12_199<='Z')||LA12_199=='_'||(LA12_199>='a' && LA12_199<='z')) ) {
                                        alt12=43;
                                    }
                                    else {
                                        alt12=9;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'a':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='v') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='e') ) {
                        int LA12_120 = input.LA(5);

                        if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            default:
                alt12=43;}

        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='l') ) {
                        int LA12_121 = input.LA(5);

                        if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                case 'n':
                    {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='c') ) {
                        int LA12_122 = input.LA(5);

                        if ( (LA12_122=='e') ) {
                            int LA12_154 = input.LA(6);

                            if ( (LA12_154=='l') ) {
                                int LA12_180 = input.LA(7);

                                if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                                    alt12=43;
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                default:
                    alt12=43;}

                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='t') ) {
                        int LA12_123 = input.LA(5);

                        if ( (LA12_123=='e') ) {
                            int LA12_155 = input.LA(6);

                            if ( (LA12_155=='x') ) {
                                int LA12_181 = input.LA(7);

                                if ( (LA12_181=='t') ) {
                                    int LA12_201 = input.LA(8);

                                    if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                                        alt12=43;
                                    }
                                    else {
                                        alt12=11;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                case 'm':
                    {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='p') ) {
                        int LA12_124 = input.LA(5);

                        if ( (LA12_124=='o') ) {
                            int LA12_156 = input.LA(6);

                            if ( (LA12_156=='s') ) {
                                int LA12_182 = input.LA(7);

                                if ( (LA12_182=='i') ) {
                                    int LA12_202 = input.LA(8);

                                    if ( (LA12_202=='t') ) {
                                        int LA12_219 = input.LA(9);

                                        if ( (LA12_219=='e') ) {
                                            int LA12_231 = input.LA(10);

                                            if ( ((LA12_231>='0' && LA12_231<='9')||(LA12_231>='A' && LA12_231<='Z')||LA12_231=='_'||(LA12_231>='a' && LA12_231<='z')) ) {
                                                alt12=43;
                                            }
                                            else {
                                                alt12=31;}
                                        }
                                        else {
                                            alt12=43;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                default:
                    alt12=43;}

                }
                break;
            default:
                alt12=43;}

        }
        else if ( (LA12_0=='l') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='t') ) {
                        int LA12_125 = input.LA(5);

                        if ( ((LA12_125>='0' && LA12_125<='9')||(LA12_125>='A' && LA12_125<='Z')||LA12_125=='_'||(LA12_125>='a' && LA12_125<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                case 'n':
                    {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='k') ) {
                        int LA12_126 = input.LA(5);

                        if ( ((LA12_126>='0' && LA12_126<='9')||(LA12_126>='A' && LA12_126<='Z')||LA12_126=='_'||(LA12_126>='a' && LA12_126<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=40;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                default:
                    alt12=43;}

                }
                break;
            case 'a':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='b') ) {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='e') ) {
                        int LA12_127 = input.LA(5);

                        if ( (LA12_127=='l') ) {
                            int LA12_159 = input.LA(6);

                            if ( ((LA12_159>='0' && LA12_159<='9')||(LA12_159>='A' && LA12_159<='Z')||LA12_159=='_'||(LA12_159>='a' && LA12_159<='z')) ) {
                                alt12=43;
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            default:
                alt12=43;}

        }
        else if ( (LA12_0=='r') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='e') ) {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='o') ) {
                        int LA12_128 = input.LA(5);

                        if ( (LA12_128=='v') ) {
                            int LA12_160 = input.LA(6);

                            if ( (LA12_160=='e') ) {
                                int LA12_184 = input.LA(7);

                                if ( (LA12_184=='f') ) {
                                    int LA12_203 = input.LA(8);

                                    if ( (LA12_203=='r') ) {
                                        int LA12_220 = input.LA(9);

                                        if ( (LA12_220=='o') ) {
                                            int LA12_232 = input.LA(10);

                                            if ( (LA12_232=='m') ) {
                                                int LA12_243 = input.LA(11);

                                                if ( ((LA12_243>='0' && LA12_243<='9')||(LA12_243>='A' && LA12_243<='Z')||LA12_243=='_'||(LA12_243>='a' && LA12_243<='z')) ) {
                                                    alt12=43;
                                                }
                                                else {
                                                    alt12=38;}
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=43;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                case 'a':
                    {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='d') ) {
                        int LA12_129 = input.LA(5);

                        if ( (LA12_129=='o') ) {
                            int LA12_161 = input.LA(6);

                            if ( (LA12_161=='n') ) {
                                int LA12_185 = input.LA(7);

                                if ( (LA12_185=='l') ) {
                                    int LA12_204 = input.LA(8);

                                    if ( (LA12_204=='y') ) {
                                        int LA12_221 = input.LA(9);

                                        if ( ((LA12_221>='0' && LA12_221<='9')||(LA12_221>='A' && LA12_221<='Z')||LA12_221=='_'||(LA12_221>='a' && LA12_221<='z')) ) {
                                            alt12=43;
                                        }
                                        else {
                                            alt12=13;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                default:
                    alt12=43;}

            }
            else {
                alt12=43;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='r') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='u') ) {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='e') ) {
                        int LA12_130 = input.LA(5);

                        if ( ((LA12_130>='0' && LA12_130<='9')||(LA12_130>='A' && LA12_130<='Z')||LA12_130=='_'||(LA12_130>='a' && LA12_130<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=14;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
            }
            else {
                alt12=43;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='o') ) {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='p') ) {
                        int LA12_131 = input.LA(5);

                        if ( (LA12_131=='o') ) {
                            int LA12_163 = input.LA(6);

                            if ( (LA12_163=='u') ) {
                                int LA12_186 = input.LA(7);

                                if ( (LA12_186=='n') ) {
                                    int LA12_205 = input.LA(8);

                                    if ( (LA12_205=='d') ) {
                                        int LA12_222 = input.LA(9);

                                        if ( (LA12_222=='D') ) {
                                            int LA12_234 = input.LA(10);

                                            if ( (LA12_234=='i') ) {
                                                int LA12_244 = input.LA(11);

                                                if ( (LA12_244=='a') ) {
                                                    int LA12_250 = input.LA(12);

                                                    if ( (LA12_250=='l') ) {
                                                        int LA12_255 = input.LA(13);

                                                        if ( (LA12_255=='o') ) {
                                                            int LA12_259 = input.LA(14);

                                                            if ( (LA12_259=='g') ) {
                                                                int LA12_262 = input.LA(15);

                                                                if ( (LA12_262=='u') ) {
                                                                    int LA12_264 = input.LA(16);

                                                                    if ( (LA12_264=='e') ) {
                                                                        int LA12_266 = input.LA(17);

                                                                        if ( ((LA12_266>='0' && LA12_266<='9')||(LA12_266>='A' && LA12_266<='Z')||LA12_266=='_'||(LA12_266>='a' && LA12_266<='z')) ) {
                                                                            alt12=43;
                                                                        }
                                                                        else {
                                                                            alt12=19;}
                                                                    }
                                                                    else {
                                                                        alt12=43;}
                                                                }
                                                                else {
                                                                    alt12=43;}
                                                            }
                                                            else {
                                                                alt12=43;}
                                                        }
                                                        else {
                                                            alt12=43;}
                                                    }
                                                    else {
                                                        alt12=43;}
                                                }
                                                else {
                                                    alt12=43;}
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=43;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='l') ) {
                        int LA12_132 = input.LA(5);

                        if ( (LA12_132=='e') ) {
                            int LA12_164 = input.LA(6);

                            if ( (LA12_164=='c') ) {
                                int LA12_187 = input.LA(7);

                                if ( (LA12_187=='t') ) {
                                    int LA12_206 = input.LA(8);

                                    if ( (LA12_206=='i') ) {
                                        int LA12_223 = input.LA(9);

                                        if ( (LA12_223=='o') ) {
                                            int LA12_235 = input.LA(10);

                                            if ( (LA12_235=='n') ) {
                                                int LA12_245 = input.LA(11);

                                                if ( (LA12_245=='D') ) {
                                                    int LA12_251 = input.LA(12);

                                                    if ( (LA12_251=='i') ) {
                                                        int LA12_256 = input.LA(13);

                                                        if ( (LA12_256=='a') ) {
                                                            int LA12_260 = input.LA(14);

                                                            if ( (LA12_260=='l') ) {
                                                                int LA12_263 = input.LA(15);

                                                                if ( (LA12_263=='o') ) {
                                                                    int LA12_265 = input.LA(16);

                                                                    if ( (LA12_265=='g') ) {
                                                                        int LA12_267 = input.LA(17);

                                                                        if ( (LA12_267=='u') ) {
                                                                            int LA12_269 = input.LA(18);

                                                                            if ( (LA12_269=='e') ) {
                                                                                int LA12_270 = input.LA(19);

                                                                                if ( ((LA12_270>='0' && LA12_270<='9')||(LA12_270>='A' && LA12_270<='Z')||LA12_270=='_'||(LA12_270>='a' && LA12_270<='z')) ) {
                                                                                    alt12=43;
                                                                                }
                                                                                else {
                                                                                    alt12=21;}
                                                                            }
                                                                            else {
                                                                                alt12=43;}
                                                                        }
                                                                        else {
                                                                            alt12=43;}
                                                                    }
                                                                    else {
                                                                        alt12=43;}
                                                                }
                                                                else {
                                                                    alt12=43;}
                                                            }
                                                            else {
                                                                alt12=43;}
                                                        }
                                                        else {
                                                            alt12=43;}
                                                    }
                                                    else {
                                                        alt12=43;}
                                                }
                                                else {
                                                    alt12=43;}
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=43;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                    }
                    break;
                default:
                    alt12=43;}

            }
            else {
                alt12=43;}
        }
        else if ( (LA12_0=='M') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='a') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='s') ) {
                    int LA12_98 = input.LA(4);

                    if ( (LA12_98=='t') ) {
                        int LA12_133 = input.LA(5);

                        if ( (LA12_133=='e') ) {
                            int LA12_165 = input.LA(6);

                            if ( (LA12_165=='r') ) {
                                int LA12_188 = input.LA(7);

                                if ( (LA12_188=='D') ) {
                                    int LA12_207 = input.LA(8);

                                    if ( (LA12_207=='e') ) {
                                        int LA12_224 = input.LA(9);

                                        if ( (LA12_224=='t') ) {
                                            int LA12_236 = input.LA(10);

                                            if ( (LA12_236=='a') ) {
                                                int LA12_246 = input.LA(11);

                                                if ( (LA12_246=='i') ) {
                                                    int LA12_252 = input.LA(12);

                                                    if ( (LA12_252=='l') ) {
                                                        int LA12_257 = input.LA(13);

                                                        if ( ((LA12_257>='0' && LA12_257<='9')||(LA12_257>='A' && LA12_257<='Z')||LA12_257=='_'||(LA12_257>='a' && LA12_257<='z')) ) {
                                                            alt12=43;
                                                        }
                                                        else {
                                                            alt12=22;}
                                                    }
                                                    else {
                                                        alt12=43;}
                                                }
                                                else {
                                                    alt12=43;}
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=43;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
            }
            else {
                alt12=43;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='a') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='s') ) {
                    int LA12_99 = input.LA(4);

                    if ( (LA12_99=='t') ) {
                        int LA12_134 = input.LA(5);

                        if ( (LA12_134=='e') ) {
                            int LA12_166 = input.LA(6);

                            if ( (LA12_166=='r') ) {
                                int LA12_189 = input.LA(7);

                                if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                                    alt12=43;
                                }
                                else {
                                    alt12=23;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
            }
            else {
                alt12=43;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='e') ) {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='m') ) {
                        int LA12_135 = input.LA(5);

                        if ( (LA12_135=='e') ) {
                            int LA12_167 = input.LA(6);

                            if ( (LA12_167=='n') ) {
                                int LA12_190 = input.LA(7);

                                if ( (LA12_190=='t') ) {
                                    int LA12_209 = input.LA(8);

                                    if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
                                        alt12=43;
                                    }
                                    else {
                                        alt12=25;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'd':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='i') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='t') ) {
                        int LA12_136 = input.LA(5);

                        if ( ((LA12_136>='0' && LA12_136<='9')||(LA12_136>='A' && LA12_136<='Z')||LA12_136=='_'||(LA12_136>='a' && LA12_136<='z')) ) {
                            alt12=43;
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            default:
                alt12=43;}

        }
        else if ( (LA12_0==':') ) {
            alt12=26;
        }
        else if ( (LA12_0=='i') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='f') ) {
                int LA12_60 = input.LA(3);

                if ( ((LA12_60>='0' && LA12_60<='9')||(LA12_60>='A' && LA12_60<='Z')||LA12_60=='_'||(LA12_60>='a' && LA12_60<='z')) ) {
                    alt12=43;
                }
                else {
                    alt12=27;}
            }
            else {
                alt12=43;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=28;
        }
        else if ( (LA12_0==')') ) {
            alt12=29;
        }
        else if ( (LA12_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='w') ) {
                    int LA12_103 = input.LA(4);

                    if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                        alt12=43;
                    }
                    else {
                        alt12=33;}
                }
                else {
                    alt12=43;}
                }
                break;
            case 'a':
                {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='v') ) {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='i') ) {
                        int LA12_138 = input.LA(5);

                        if ( (LA12_138=='g') ) {
                            int LA12_169 = input.LA(6);

                            if ( (LA12_169=='a') ) {
                                int LA12_191 = input.LA(7);

                                if ( (LA12_191=='t') ) {
                                    int LA12_210 = input.LA(8);

                                    if ( (LA12_210=='e') ) {
                                        int LA12_226 = input.LA(9);

                                        if ( ((LA12_226>='0' && LA12_226<='9')||(LA12_226>='A' && LA12_226<='Z')||LA12_226=='_'||(LA12_226>='a' && LA12_226<='z')) ) {
                                            alt12=43;
                                        }
                                        else {
                                            alt12=32;}
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=43;}
                        }
                        else {
                            alt12=43;}
                    }
                    else {
                        alt12=43;}
                }
                else {
                    alt12=43;}
                }
                break;
            default:
                alt12=43;}

        }
        else if ( (LA12_0=='^') ) {
            int LA12_22 = input.LA(2);

            if ( ((LA12_22>='A' && LA12_22<='Z')||LA12_22=='_'||(LA12_22>='a' && LA12_22<='z')) ) {
                alt12=43;
            }
            else {
                alt12=49;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {
            alt12=43;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=44;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_25 = input.LA(2);

            if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFE')) ) {
                alt12=45;
            }
            else {
                alt12=49;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
                alt12=45;
            }
            else {
                alt12=49;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=46;
                }
                break;
            case '/':
                {
                alt12=47;
                }
                break;
            default:
                alt12=49;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=48;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=49;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

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
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:178: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:186: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 45 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:195: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 46 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:207: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:223: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:239: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 49 :
                // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1:247: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}