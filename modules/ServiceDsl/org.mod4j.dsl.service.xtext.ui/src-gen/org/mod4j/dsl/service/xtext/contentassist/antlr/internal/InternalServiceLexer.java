package org.mod4j.dsl.service.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalServiceLexer extends Lexer {
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int T25=25;
    public static final int T18=18;
    public static final int RULE_WS=9;
    public static final int T26=26;
    public static final int T15=15;
    public static final int RULE_INT=6;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=32;
    public static final int T31=31;
    public static final int RULE_ANY_OTHER=10;
    public static final int T16=16;
    public static final int T27=27;
    public static final int RULE_SL_COMMENT=8;
    public static final int T30=30;
    public static final int T24=24;
    public static final int T19=19;
    public InternalServiceLexer() {;} 
    public InternalServiceLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:10:5: ( 'create' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:10:7: 'create'
            {
            match("create"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:11:5: ( 'read' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:11:7: 'read'
            {
            match("read"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:12:5: ( 'update' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:12:7: 'update'
            {
            match("update"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:13:5: ( 'delete' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:13:7: 'delete'
            {
            match("delete"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:14:5: ( 'listall' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:14:7: 'listall'
            {
            match("listall"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:15:5: ( 'find' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:15:7: 'find'
            {
            match("find"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:16:5: ( 'add' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:16:7: 'add'
            {
            match("add"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:17:5: ( 'remove' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:17:7: 'remove'
            {
            match("remove"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:18:5: ( 'get' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:18:7: 'get'
            {
            match("get"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:19:5: ( 'service' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:19:7: 'service'
            {
            match("service"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:20:5: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:20:7: ';'
            {
            match(';'); 

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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:21:5: ( 'reference' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:21:7: 'reference'
            {
            match("reference"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:22:5: ( 'from' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:22:7: 'from'
            {
            match("from"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:23:5: ( 'import' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:23:7: 'import'
            {
            match("import"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:24:5: ( 'method' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:24:7: 'method'
            {
            match("method"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:25:5: ( 'in' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:25:7: 'in'
            {
            match("in"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:26:5: ( '[' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:26:7: '['
            {
            match('['); 

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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:27:5: ( ']' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:27:7: ']'
            {
            match(']'); 

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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:28:5: ( 'out' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:28:7: 'out'
            {
            match("out"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:29:5: ( 'for' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:29:7: 'for'
            {
            match("for"); 


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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:30:5: ( 'crud' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:30:7: 'crud'
            {
            match("crud"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1778:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1778:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1778:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1778:11: '^'
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

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1778:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:
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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1780:10: ( ( '0' .. '9' )+ )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1780:12: ( '0' .. '9' )+
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1780:12: ( '0' .. '9' )+
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
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1780:13: '0' .. '9'
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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1782:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1782:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1784:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1784:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1784:24: ( options {greedy=false; } : . )*
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
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1784:52: .
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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1786:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1786:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1786:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1786:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1786:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1786:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1786:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1786:41: '\\r'
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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1788:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1788:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1788:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:
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
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1790:16: ( . )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1790:18: .
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
        // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='c') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='r') ) {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='a') ) {
                        int LA12_66 = input.LA(5);

                        if ( (LA12_66=='t') ) {
                            int LA12_83 = input.LA(6);

                            if ( (LA12_83=='e') ) {
                                int LA12_96 = input.LA(7);

                                if ( ((LA12_96>='0' && LA12_96<='9')||(LA12_96>='A' && LA12_96<='Z')||LA12_96=='_'||(LA12_96>='a' && LA12_96<='z')) ) {
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
                    break;
                case 'u':
                    {
                    int LA12_49 = input.LA(4);

                    if ( (LA12_49=='d') ) {
                        int LA12_67 = input.LA(5);

                        if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                            alt12=22;
                        }
                        else {
                            alt12=21;}
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
        else if ( (LA12_0=='r') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='e') ) {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='d') ) {
                        int LA12_68 = input.LA(5);

                        if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                            alt12=22;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=22;}
                    }
                    break;
                case 'm':
                    {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='o') ) {
                        int LA12_69 = input.LA(5);

                        if ( (LA12_69=='v') ) {
                            int LA12_86 = input.LA(6);

                            if ( (LA12_86=='e') ) {
                                int LA12_97 = input.LA(7);

                                if ( ((LA12_97>='0' && LA12_97<='9')||(LA12_97>='A' && LA12_97<='Z')||LA12_97=='_'||(LA12_97>='a' && LA12_97<='z')) ) {
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
                case 'f':
                    {
                    int LA12_52 = input.LA(4);

                    if ( (LA12_52=='e') ) {
                        int LA12_70 = input.LA(5);

                        if ( (LA12_70=='r') ) {
                            int LA12_87 = input.LA(6);

                            if ( (LA12_87=='e') ) {
                                int LA12_98 = input.LA(7);

                                if ( (LA12_98=='n') ) {
                                    int LA12_107 = input.LA(8);

                                    if ( (LA12_107=='c') ) {
                                        int LA12_114 = input.LA(9);

                                        if ( (LA12_114=='e') ) {
                                            int LA12_117 = input.LA(10);

                                            if ( ((LA12_117>='0' && LA12_117<='9')||(LA12_117>='A' && LA12_117<='Z')||LA12_117=='_'||(LA12_117>='a' && LA12_117<='z')) ) {
                                                alt12=22;
                                            }
                                            else {
                                                alt12=12;}
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
        else if ( (LA12_0=='u') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='p') ) {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='d') ) {
                    int LA12_53 = input.LA(4);

                    if ( (LA12_53=='a') ) {
                        int LA12_71 = input.LA(5);

                        if ( (LA12_71=='t') ) {
                            int LA12_88 = input.LA(6);

                            if ( (LA12_88=='e') ) {
                                int LA12_99 = input.LA(7);

                                if ( ((LA12_99>='0' && LA12_99<='9')||(LA12_99>='A' && LA12_99<='Z')||LA12_99=='_'||(LA12_99>='a' && LA12_99<='z')) ) {
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
        else if ( (LA12_0=='d') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='e') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='l') ) {
                    int LA12_54 = input.LA(4);

                    if ( (LA12_54=='e') ) {
                        int LA12_72 = input.LA(5);

                        if ( (LA12_72=='t') ) {
                            int LA12_89 = input.LA(6);

                            if ( (LA12_89=='e') ) {
                                int LA12_100 = input.LA(7);

                                if ( ((LA12_100>='0' && LA12_100<='9')||(LA12_100>='A' && LA12_100<='Z')||LA12_100=='_'||(LA12_100>='a' && LA12_100<='z')) ) {
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
        else if ( (LA12_0=='l') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='i') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='s') ) {
                    int LA12_55 = input.LA(4);

                    if ( (LA12_55=='t') ) {
                        int LA12_73 = input.LA(5);

                        if ( (LA12_73=='a') ) {
                            int LA12_90 = input.LA(6);

                            if ( (LA12_90=='l') ) {
                                int LA12_101 = input.LA(7);

                                if ( (LA12_101=='l') ) {
                                    int LA12_110 = input.LA(8);

                                    if ( ((LA12_110>='0' && LA12_110<='9')||(LA12_110>='A' && LA12_110<='Z')||LA12_110=='_'||(LA12_110>='a' && LA12_110<='z')) ) {
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
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='n') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='d') ) {
                        int LA12_74 = input.LA(5);

                        if ( ((LA12_74>='0' && LA12_74<='9')||(LA12_74>='A' && LA12_74<='Z')||LA12_74=='_'||(LA12_74>='a' && LA12_74<='z')) ) {
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
                break;
            case 'o':
                {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='r') ) {
                    int LA12_57 = input.LA(4);

                    if ( ((LA12_57>='0' && LA12_57<='9')||(LA12_57>='A' && LA12_57<='Z')||LA12_57=='_'||(LA12_57>='a' && LA12_57<='z')) ) {
                        alt12=22;
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=22;}
                }
                break;
            case 'r':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='o') ) {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='m') ) {
                        int LA12_76 = input.LA(5);

                        if ( ((LA12_76>='0' && LA12_76<='9')||(LA12_76>='A' && LA12_76<='Z')||LA12_76=='_'||(LA12_76>='a' && LA12_76<='z')) ) {
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
                break;
            default:
                alt12=22;}

        }
        else if ( (LA12_0=='a') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='d') ) {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='d') ) {
                    int LA12_59 = input.LA(4);

                    if ( ((LA12_59>='0' && LA12_59<='9')||(LA12_59>='A' && LA12_59<='Z')||LA12_59=='_'||(LA12_59>='a' && LA12_59<='z')) ) {
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
        else if ( (LA12_0=='g') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='e') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='t') ) {
                    int LA12_60 = input.LA(4);

                    if ( ((LA12_60>='0' && LA12_60<='9')||(LA12_60>='A' && LA12_60<='Z')||LA12_60=='_'||(LA12_60>='a' && LA12_60<='z')) ) {
                        alt12=22;
                    }
                    else {
                        alt12=9;}
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=22;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='e') ) {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='r') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='v') ) {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='i') ) {
                            int LA12_93 = input.LA(6);

                            if ( (LA12_93=='c') ) {
                                int LA12_102 = input.LA(7);

                                if ( (LA12_102=='e') ) {
                                    int LA12_111 = input.LA(8);

                                    if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
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
        else if ( (LA12_0==';') ) {
            alt12=11;
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_37 = input.LA(3);

                if ( ((LA12_37>='0' && LA12_37<='9')||(LA12_37>='A' && LA12_37<='Z')||LA12_37=='_'||(LA12_37>='a' && LA12_37<='z')) ) {
                    alt12=22;
                }
                else {
                    alt12=16;}
                }
                break;
            case 'm':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='p') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='o') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='r') ) {
                            int LA12_94 = input.LA(6);

                            if ( (LA12_94=='t') ) {
                                int LA12_103 = input.LA(7);

                                if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
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
                break;
            default:
                alt12=22;}

        }
        else if ( (LA12_0=='m') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='e') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='t') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='h') ) {
                        int LA12_81 = input.LA(5);

                        if ( (LA12_81=='o') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='d') ) {
                                int LA12_104 = input.LA(7);

                                if ( ((LA12_104>='0' && LA12_104<='9')||(LA12_104>='A' && LA12_104<='Z')||LA12_104=='_'||(LA12_104>='a' && LA12_104<='z')) ) {
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
        else if ( (LA12_0=='[') ) {
            alt12=17;
        }
        else if ( (LA12_0==']') ) {
            alt12=18;
        }
        else if ( (LA12_0=='o') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='u') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='t') ) {
                    int LA12_65 = input.LA(4);

                    if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
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
        else if ( (LA12_0=='^') ) {
            int LA12_16 = input.LA(2);

            if ( ((LA12_16>='A' && LA12_16<='Z')||LA12_16=='_'||(LA12_16>='a' && LA12_16<='z')) ) {
                alt12=22;
            }
            else {
                alt12=28;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='e'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='n'||(LA12_0>='p' && LA12_0<='q')||LA12_0=='t'||(LA12_0>='v' && LA12_0<='z')) ) {
            alt12=22;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=23;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_19 = input.LA(2);

            if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFE')) ) {
                alt12=24;
            }
            else {
                alt12=28;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFE')) ) {
                alt12=24;
            }
            else {
                alt12=28;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=25;
                }
                break;
            case '/':
                {
                alt12=26;
                }
                break;
            default:
                alt12=28;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=27;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=28;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:94: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:102: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:111: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:139: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:155: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1:163: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}