package org.mod4j.dsl.businessdomain.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBusinessDomainLexer extends Lexer {
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
    public static final int T43=43;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T28=28;
    public static final int T42=42;
    public static final int T40=40;
    public static final int T13=13;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int Tokens=46;
    public static final int RULE_ANY_OTHER=10;
    public static final int T31=31;
    public static final int RULE_SL_COMMENT=8;
    public static final int T27=27;
    public static final int T30=30;
    public InternalBusinessDomainLexer() {;} 
    public InternalBusinessDomainLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:10:5: ( 'domain' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:10:7: 'domain'
            {
            match("domain"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:11:5: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:11:7: ';'
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:12:5: ( 'from' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:12:7: 'from'
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:13:5: ( 'import' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:13:7: 'import'
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:14:5: ( 'association' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:14:7: 'association'
            {
            match("association"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:15:5: ( '<->' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:15:7: '<->'
            {
            match("<->"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:16:5: ( '->' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:16:7: '->'
            {
            match("->"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:17:5: ( 'ordered' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:17:7: 'ordered'
            {
            match("ordered"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:18:5: ( 'class' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:18:7: 'class'
            {
            match("class"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:19:5: ( 'inherits' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:19:7: 'inherits'
            {
            match("inherits"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:20:5: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:20:7: '['
            {
            match('['); 

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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:21:5: ( 'rules' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:21:7: 'rules'
            {
            match("rules"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:22:5: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:22:7: ']'
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:23:5: ( 'enumeration' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:23:7: 'enumeration'
            {
            match("enumeration"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:24:5: ( '=' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:24:7: '='
            {
            match('='); 

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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:25:5: ( 'unique' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:25:7: 'unique'
            {
            match("unique"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:26:5: ( ',' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:26:7: ','
            {
            match(','); 

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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:27:5: ( 'nullable' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:27:7: 'nullable'
            {
            match("nullable"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:28:5: ( 'derived' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:28:7: 'derived'
            {
            match("derived"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:29:5: ( 'writable' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:29:7: 'writable'
            {
            match("writable"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:30:5: ( 'boolean' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:30:7: 'boolean'
            {
            match("boolean"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:31:5: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:31:7: 'default'
            {
            match("default"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:32:5: ( 'true' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:32:7: 'true'
            {
            match("true"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:33:5: ( 'false' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:33:7: 'false'
            {
            match("false"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:34:5: ( 'string' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:34:7: 'string'
            {
            match("string"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:35:5: ( 'minlength' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:35:7: 'minlength'
            {
            match("minlength"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:36:5: ( 'maxlength' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:36:7: 'maxlength'
            {
            match("maxlength"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:37:5: ( 'regexp' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:37:7: 'regexp'
            {
            match("regexp"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:38:5: ( 'datetime' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:38:7: 'datetime'
            {
            match("datetime"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:39:5: ( 'integer' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:39:7: 'integer'
            {
            match("integer"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:40:5: ( 'min' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:40:7: 'min'
            {
            match("min"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:41:5: ( 'max' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:41:7: 'max'
            {
            match("max"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:42:5: ( 'decimal' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:42:7: 'decimal'
            {
            match("decimal"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:43:5: ( 'many' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:43:7: 'many'
            {
            match("many"); 


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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:44:5: ( 'one' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:44:7: 'one'
            {
            match("one"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2024:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2024:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2024:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2024:11: '^'
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2024:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2026:10: ( ( '0' .. '9' )+ )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2026:12: ( '0' .. '9' )+
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2026:12: ( '0' .. '9' )+
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
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2026:13: '0' .. '9'
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2028:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2028:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2030:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2030:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2030:24: ( options {greedy=false; } : . )*
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
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2030:52: .
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2032:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2032:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2032:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2032:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2032:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2032:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2032:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2032:41: '\\r'
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2034:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2034:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2034:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2036:16: ( . )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2036:18: .
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
        // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=42;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='m') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='a') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='i') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='n') ) {
                                int LA12_145 = input.LA(7);

                                if ( ((LA12_145>='0' && LA12_145<='9')||(LA12_145>='A' && LA12_145<='Z')||LA12_145=='_'||(LA12_145>='a' && LA12_145<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=1;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'f':
                    {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='a') ) {
                        int LA12_93 = input.LA(5);

                        if ( (LA12_93=='u') ) {
                            int LA12_121 = input.LA(6);

                            if ( (LA12_121=='l') ) {
                                int LA12_146 = input.LA(7);

                                if ( (LA12_146=='t') ) {
                                    int LA12_168 = input.LA(8);

                                    if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='i') ) {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='m') ) {
                            int LA12_122 = input.LA(6);

                            if ( (LA12_122=='a') ) {
                                int LA12_147 = input.LA(7);

                                if ( (LA12_147=='l') ) {
                                    int LA12_169 = input.LA(8);

                                    if ( ((LA12_169>='0' && LA12_169<='9')||(LA12_169>='A' && LA12_169<='Z')||LA12_169=='_'||(LA12_169>='a' && LA12_169<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                case 'r':
                    {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='i') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='v') ) {
                            int LA12_123 = input.LA(6);

                            if ( (LA12_123=='e') ) {
                                int LA12_148 = input.LA(7);

                                if ( (LA12_148=='d') ) {
                                    int LA12_170 = input.LA(8);

                                    if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                default:
                    alt12=36;}

                }
                break;
            case 'a':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='t') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='e') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='t') ) {
                            int LA12_124 = input.LA(6);

                            if ( (LA12_124=='i') ) {
                                int LA12_149 = input.LA(7);

                                if ( (LA12_149=='m') ) {
                                    int LA12_171 = input.LA(8);

                                    if ( (LA12_171=='e') ) {
                                        int LA12_189 = input.LA(9);

                                        if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                                            alt12=36;
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0==';') ) {
            alt12=2;
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='o') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='m') ) {
                        int LA12_97 = input.LA(5);

                        if ( ((LA12_97>='0' && LA12_97<='9')||(LA12_97>='A' && LA12_97<='Z')||LA12_97=='_'||(LA12_97>='a' && LA12_97<='z')) ) {
                            alt12=36;
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'a':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='l') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='s') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='e') ) {
                            int LA12_126 = input.LA(6);

                            if ( ((LA12_126>='0' && LA12_126<='9')||(LA12_126>='A' && LA12_126<='Z')||LA12_126=='_'||(LA12_126>='a' && LA12_126<='z')) ) {
                                alt12=36;
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='p') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='o') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='r') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='t') ) {
                                int LA12_151 = input.LA(7);

                                if ( ((LA12_151>='0' && LA12_151<='9')||(LA12_151>='A' && LA12_151<='Z')||LA12_151=='_'||(LA12_151>='a' && LA12_151<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=4;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='e') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='g') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='e') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='r') ) {
                                    int LA12_173 = input.LA(8);

                                    if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                case 'h':
                    {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='e') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='r') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='i') ) {
                                int LA12_153 = input.LA(7);

                                if ( (LA12_153=='t') ) {
                                    int LA12_174 = input.LA(8);

                                    if ( (LA12_174=='s') ) {
                                        int LA12_191 = input.LA(9);

                                        if ( ((LA12_191>='0' && LA12_191<='9')||(LA12_191>='A' && LA12_191<='Z')||LA12_191=='_'||(LA12_191>='a' && LA12_191<='z')) ) {
                                            alt12=36;
                                        }
                                        else {
                                            alt12=10;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                default:
                    alt12=36;}

                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='a') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='s') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='s') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='o') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='c') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='i') ) {
                                int LA12_154 = input.LA(7);

                                if ( (LA12_154=='a') ) {
                                    int LA12_175 = input.LA(8);

                                    if ( (LA12_175=='t') ) {
                                        int LA12_192 = input.LA(9);

                                        if ( (LA12_192=='i') ) {
                                            int LA12_202 = input.LA(10);

                                            if ( (LA12_202=='o') ) {
                                                int LA12_208 = input.LA(11);

                                                if ( (LA12_208=='n') ) {
                                                    int LA12_212 = input.LA(12);

                                                    if ( ((LA12_212>='0' && LA12_212<='9')||(LA12_212>='A' && LA12_212<='Z')||LA12_212=='_'||(LA12_212>='a' && LA12_212<='z')) ) {
                                                        alt12=36;
                                                    }
                                                    else {
                                                        alt12=5;}
                                                }
                                                else {
                                                    alt12=36;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='<') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='-') ) {
                alt12=6;
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='-') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='>') ) {
                alt12=7;
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='e') ) {
                    int LA12_77 = input.LA(4);

                    if ( ((LA12_77>='0' && LA12_77<='9')||(LA12_77>='A' && LA12_77<='Z')||LA12_77=='_'||(LA12_77>='a' && LA12_77<='z')) ) {
                        alt12=36;
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'r':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='d') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='e') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='r') ) {
                            int LA12_131 = input.LA(6);

                            if ( (LA12_131=='e') ) {
                                int LA12_155 = input.LA(7);

                                if ( (LA12_155=='d') ) {
                                    int LA12_176 = input.LA(8);

                                    if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=8;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='c') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='l') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='a') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='s') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='s') ) {
                            int LA12_132 = input.LA(6);

                            if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                                alt12=36;
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='[') ) {
            alt12=11;
        }
        else if ( (LA12_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='l') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='e') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='s') ) {
                            int LA12_133 = input.LA(6);

                            if ( ((LA12_133>='0' && LA12_133<='9')||(LA12_133>='A' && LA12_133<='Z')||LA12_133=='_'||(LA12_133>='a' && LA12_133<='z')) ) {
                                alt12=36;
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'e':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='g') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='e') ) {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='x') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='p') ) {
                                int LA12_158 = input.LA(7);

                                if ( ((LA12_158>='0' && LA12_158<='9')||(LA12_158>='A' && LA12_158<='Z')||LA12_158=='_'||(LA12_158>='a' && LA12_158<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=28;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0==']') ) {
            alt12=13;
        }
        else if ( (LA12_0=='e') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='n') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='u') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='m') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='e') ) {
                            int LA12_135 = input.LA(6);

                            if ( (LA12_135=='r') ) {
                                int LA12_159 = input.LA(7);

                                if ( (LA12_159=='a') ) {
                                    int LA12_178 = input.LA(8);

                                    if ( (LA12_178=='t') ) {
                                        int LA12_194 = input.LA(9);

                                        if ( (LA12_194=='i') ) {
                                            int LA12_203 = input.LA(10);

                                            if ( (LA12_203=='o') ) {
                                                int LA12_209 = input.LA(11);

                                                if ( (LA12_209=='n') ) {
                                                    int LA12_213 = input.LA(12);

                                                    if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                                                        alt12=36;
                                                    }
                                                    else {
                                                        alt12=14;}
                                                }
                                                else {
                                                    alt12=36;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=15;
        }
        else if ( (LA12_0=='u') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='n') ) {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='i') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='q') ) {
                        int LA12_109 = input.LA(5);

                        if ( (LA12_109=='u') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='e') ) {
                                int LA12_160 = input.LA(7);

                                if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=16;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0==',') ) {
            alt12=17;
        }
        else if ( (LA12_0=='n') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='u') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='l') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='l') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='a') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='b') ) {
                                int LA12_161 = input.LA(7);

                                if ( (LA12_161=='l') ) {
                                    int LA12_180 = input.LA(8);

                                    if ( (LA12_180=='e') ) {
                                        int LA12_195 = input.LA(9);

                                        if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                            alt12=36;
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='w') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='r') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='i') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='t') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='a') ) {
                            int LA12_138 = input.LA(6);

                            if ( (LA12_138=='b') ) {
                                int LA12_162 = input.LA(7);

                                if ( (LA12_162=='l') ) {
                                    int LA12_181 = input.LA(8);

                                    if ( (LA12_181=='e') ) {
                                        int LA12_196 = input.LA(9);

                                        if ( ((LA12_196>='0' && LA12_196<='9')||(LA12_196>='A' && LA12_196<='Z')||LA12_196=='_'||(LA12_196>='a' && LA12_196<='z')) ) {
                                            alt12=36;
                                        }
                                        else {
                                            alt12=20;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='b') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='o') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='o') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='l') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='e') ) {
                            int LA12_139 = input.LA(6);

                            if ( (LA12_139=='a') ) {
                                int LA12_163 = input.LA(7);

                                if ( (LA12_163=='n') ) {
                                    int LA12_182 = input.LA(8);

                                    if ( ((LA12_182>='0' && LA12_182<='9')||(LA12_182>='A' && LA12_182<='Z')||LA12_182=='_'||(LA12_182>='a' && LA12_182<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=21;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='r') ) {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='u') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='e') ) {
                        int LA12_113 = input.LA(5);

                        if ( ((LA12_113>='0' && LA12_113<='9')||(LA12_113>='A' && LA12_113<='Z')||LA12_113=='_'||(LA12_113>='a' && LA12_113<='z')) ) {
                            alt12=36;
                        }
                        else {
                            alt12=23;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='t') ) {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='r') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='i') ) {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='n') ) {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='g') ) {
                                int LA12_164 = input.LA(7);

                                if ( ((LA12_164>='0' && LA12_164<='9')||(LA12_164>='A' && LA12_164<='Z')||LA12_164=='_'||(LA12_164>='a' && LA12_164<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=25;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'x':
                    {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='e') ) {
                            int LA12_142 = input.LA(6);

                            if ( (LA12_142=='n') ) {
                                int LA12_165 = input.LA(7);

                                if ( (LA12_165=='g') ) {
                                    int LA12_184 = input.LA(8);

                                    if ( (LA12_184=='t') ) {
                                        int LA12_198 = input.LA(9);

                                        if ( (LA12_198=='h') ) {
                                            int LA12_206 = input.LA(10);

                                            if ( ((LA12_206>='0' && LA12_206<='9')||(LA12_206>='A' && LA12_206<='Z')||LA12_206=='_'||(LA12_206>='a' && LA12_206<='z')) ) {
                                                alt12=36;
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
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
                        alt12=36;
                        }
                        break;
                    default:
                        alt12=32;}

                    }
                    break;
                case 'n':
                    {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='y') ) {
                        int LA12_117 = input.LA(5);

                        if ( ((LA12_117>='0' && LA12_117<='9')||(LA12_117>='A' && LA12_117<='Z')||LA12_117=='_'||(LA12_117>='a' && LA12_117<='z')) ) {
                            alt12=36;
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                default:
                    alt12=36;}

                }
                break;
            case 'i':
                {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='n') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='e') ) {
                            int LA12_144 = input.LA(6);

                            if ( (LA12_144=='n') ) {
                                int LA12_166 = input.LA(7);

                                if ( (LA12_166=='g') ) {
                                    int LA12_185 = input.LA(8);

                                    if ( (LA12_185=='t') ) {
                                        int LA12_199 = input.LA(9);

                                        if ( (LA12_199=='h') ) {
                                            int LA12_207 = input.LA(10);

                                            if ( ((LA12_207>='0' && LA12_207<='9')||(LA12_207>='A' && LA12_207<='Z')||LA12_207=='_'||(LA12_207>='a' && LA12_207<='z')) ) {
                                                alt12=36;
                                            }
                                            else {
                                                alt12=26;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
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
                        alt12=36;
                        }
                        break;
                    default:
                        alt12=31;}

                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='^') ) {
            int LA12_23 = input.LA(2);

            if ( ((LA12_23>='A' && LA12_23<='Z')||LA12_23=='_'||(LA12_23>='a' && LA12_23<='z')) ) {
                alt12=36;
            }
            else {
                alt12=42;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='p' && LA12_0<='q')||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=36;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=37;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
                alt12=38;
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFE')) ) {
                alt12=38;
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=40;
                }
                break;
            case '*':
                {
                alt12=39;
                }
                break;
            default:
                alt12=42;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=41;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='.'||LA12_0==':'||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=42;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:150: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:158: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:167: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:179: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:195: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:211: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1:219: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}