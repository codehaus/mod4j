// $ANTLR 3.0 ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g 2009-02-24 14:57:08

package org.mod4j.businessdomain.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BusinessDomainDslLexer extends Lexer {
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
    public static final int RULE_ML_COMMENT=8;
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
    public static final int T10=10;
    public static final int RULE_WS=7;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int Tokens=44;
    public static final int T31=31;
    public static final int RULE_SL_COMMENT=9;
    public static final int T27=27;
    public static final int T30=30;

    	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg;
    	}

    public BusinessDomainDslLexer() {;} 
    public BusinessDomainDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:22:7: ( 'BusinessDomain' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:22:7: 'BusinessDomain'
            {
            match("BusinessDomain"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:23:7: ( 'from' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:23:7: 'from'
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:24:7: ( 'import' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:24:7: 'import'
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:25:7: ( 'Association' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:25:7: 'Association'
            {
            match("Association"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:26:7: ( '[' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:26:7: '['
            {
            match('['); 

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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:27:7: ( ']' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:27:7: ']'
            {
            match(']'); 

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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:28:7: ( '<->' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:28:7: '<->'
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
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:29:7: ( '->' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:29:7: '->'
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
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:30:7: ( 'ordered' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:30:7: 'ordered'
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
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:31:7: ( ';' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:31:7: ';'
            {
            match(';'); 

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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:32:7: ( '0..*' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:32:7: '0..*'
            {
            match("0..*"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:33:7: ( '1' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:33:7: '1'
            {
            match('1'); 

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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:34:7: ( '1..*' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:34:7: '1..*'
            {
            match("1..*"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:35:7: ( '0..1' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:35:7: '0..1'
            {
            match("0..1"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:36:7: ( 'Class' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:36:7: 'Class'
            {
            match("Class"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:37:7: ( 'inherits' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:37:7: 'inherits'
            {
            match("inherits"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:38:7: ( 'Rules' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:38:7: 'Rules'
            {
            match("Rules"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:39:7: ( 'Enumeration' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:39:7: 'Enumeration'
            {
            match("Enumeration"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:40:7: ( '=' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:40:7: '='
            {
            match('='); 

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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:41:7: ( 'unique' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:41:7: 'unique'
            {
            match("unique"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:42:7: ( 'nullable' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:42:7: 'nullable'
            {
            match("nullable"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:43:7: ( 'boolean' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:43:7: 'boolean'
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
    public void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:44:7: ( 'default' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:44:7: 'default'
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
    public void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:45:7: ( 'true' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:45:7: 'true'
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
    public void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:46:7: ( 'false' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:46:7: 'false'
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
    public void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:47:7: ( 'string' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:47:7: 'string'
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
    public void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:48:7: ( 'minlength' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:48:7: 'minlength'
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
    public void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:49:7: ( 'maxlength' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:49:7: 'maxlength'
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
    public void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:50:7: ( 'regexp' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:50:7: 'regexp'
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
    public void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:51:7: ( 'datetime' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:51:7: 'datetime'
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
    public void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:52:7: ( 'integer' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:52:7: 'integer'
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
    public void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:53:7: ( 'min' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:53:7: 'min'
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
    public void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:54:7: ( 'max' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:54:7: 'max'
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
    public void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:55:7: ( 'decimal' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:55:7: 'decimal'
            {
            match("decimal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:560:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:560:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:560:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:560:4: '^'
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

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:560:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
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
                    new NoViableAltException("564:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
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
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:53: ~ ( '\\\\' | '\"' )
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
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:567:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:567:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
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
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:567:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:567:54: ~ ( '\\\\' | '\\'' )
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:573:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:573:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:573:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:573:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:573:9: ( '0' .. '9' )+
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
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:573:10: '0' .. '9'
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:579:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:579:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:579:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:8: ( options {greedy=false; } : . )*
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
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:36: .
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:8: ~ ( '\\n' | '\\r' )
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

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:22: '\\r'
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
        // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=40;
        switch ( input.LA(1) ) {
        case 'B':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='u') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='s') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='i') ) {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='n') ) {
                            int LA12_105 = input.LA(6);

                            if ( (LA12_105=='e') ) {
                                int LA12_127 = input.LA(7);

                                if ( (LA12_127=='s') ) {
                                    int LA12_147 = input.LA(8);

                                    if ( (LA12_147=='s') ) {
                                        int LA12_164 = input.LA(9);

                                        if ( (LA12_164=='D') ) {
                                            int LA12_177 = input.LA(10);

                                            if ( (LA12_177=='o') ) {
                                                int LA12_185 = input.LA(11);

                                                if ( (LA12_185=='m') ) {
                                                    int LA12_190 = input.LA(12);

                                                    if ( (LA12_190=='a') ) {
                                                        int LA12_193 = input.LA(13);

                                                        if ( (LA12_193=='i') ) {
                                                            int LA12_196 = input.LA(14);

                                                            if ( (LA12_196=='n') ) {
                                                                int LA12_197 = input.LA(15);

                                                                if ( ((LA12_197>='0' && LA12_197<='9')||(LA12_197>='A' && LA12_197<='Z')||LA12_197=='_'||(LA12_197>='a' && LA12_197<='z')) ) {
                                                                    alt12=35;
                                                                }
                                                                else {
                                                                    alt12=1;}
                                                            }
                                                            else {
                                                                alt12=35;}
                                                        }
                                                        else {
                                                            alt12=35;}
                                                    }
                                                    else {
                                                        alt12=35;}
                                                }
                                                else {
                                                    alt12=35;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='l') ) {
                    int LA12_57 = input.LA(4);

                    if ( (LA12_57=='s') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='e') ) {
                            int LA12_106 = input.LA(6);

                            if ( ((LA12_106>='0' && LA12_106<='9')||(LA12_106>='A' && LA12_106<='Z')||LA12_106=='_'||(LA12_106>='a' && LA12_106<='z')) ) {
                                alt12=35;
                            }
                            else {
                                alt12=25;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            case 'r':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='o') ) {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='m') ) {
                        int LA12_81 = input.LA(5);

                        if ( ((LA12_81>='0' && LA12_81<='9')||(LA12_81>='A' && LA12_81<='Z')||LA12_81=='_'||(LA12_81>='a' && LA12_81<='z')) ) {
                            alt12=35;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'h':
                    {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='e') ) {
                        int LA12_82 = input.LA(5);

                        if ( (LA12_82=='r') ) {
                            int LA12_108 = input.LA(6);

                            if ( (LA12_108=='i') ) {
                                int LA12_129 = input.LA(7);

                                if ( (LA12_129=='t') ) {
                                    int LA12_148 = input.LA(8);

                                    if ( (LA12_148=='s') ) {
                                        int LA12_165 = input.LA(9);

                                        if ( ((LA12_165>='0' && LA12_165<='9')||(LA12_165>='A' && LA12_165<='Z')||LA12_165=='_'||(LA12_165>='a' && LA12_165<='z')) ) {
                                            alt12=35;
                                        }
                                        else {
                                            alt12=16;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                case 't':
                    {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='e') ) {
                        int LA12_83 = input.LA(5);

                        if ( (LA12_83=='g') ) {
                            int LA12_109 = input.LA(6);

                            if ( (LA12_109=='e') ) {
                                int LA12_130 = input.LA(7);

                                if ( (LA12_130=='r') ) {
                                    int LA12_149 = input.LA(8);

                                    if ( ((LA12_149>='0' && LA12_149<='9')||(LA12_149>='A' && LA12_149<='Z')||LA12_149=='_'||(LA12_149>='a' && LA12_149<='z')) ) {
                                        alt12=35;
                                    }
                                    else {
                                        alt12=31;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                default:
                    alt12=35;}

                }
                break;
            case 'm':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='p') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='o') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='r') ) {
                            int LA12_110 = input.LA(6);

                            if ( (LA12_110=='t') ) {
                                int LA12_131 = input.LA(7);

                                if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

            }
            break;
        case 'A':
            {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='s') ) {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='s') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='o') ) {
                        int LA12_85 = input.LA(5);

                        if ( (LA12_85=='c') ) {
                            int LA12_111 = input.LA(6);

                            if ( (LA12_111=='i') ) {
                                int LA12_132 = input.LA(7);

                                if ( (LA12_132=='a') ) {
                                    int LA12_151 = input.LA(8);

                                    if ( (LA12_151=='t') ) {
                                        int LA12_167 = input.LA(9);

                                        if ( (LA12_167=='i') ) {
                                            int LA12_179 = input.LA(10);

                                            if ( (LA12_179=='o') ) {
                                                int LA12_186 = input.LA(11);

                                                if ( (LA12_186=='n') ) {
                                                    int LA12_191 = input.LA(12);

                                                    if ( ((LA12_191>='0' && LA12_191<='9')||(LA12_191>='A' && LA12_191<='Z')||LA12_191=='_'||(LA12_191>='a' && LA12_191<='z')) ) {
                                                        alt12=35;
                                                    }
                                                    else {
                                                        alt12=4;}
                                                }
                                                else {
                                                    alt12=35;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case '[':
            {
            alt12=5;
            }
            break;
        case ']':
            {
            alt12=6;
            }
            break;
        case '<':
            {
            alt12=7;
            }
            break;
        case '-':
            {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='>') ) {
                alt12=8;
            }
            else if ( ((LA12_8>='0' && LA12_8<='9')) ) {
                alt12=37;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 8, input);

                throw nvae;
            }
            }
            break;
        case 'o':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='r') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='d') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='e') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='r') ) {
                            int LA12_112 = input.LA(6);

                            if ( (LA12_112=='e') ) {
                                int LA12_133 = input.LA(7);

                                if ( (LA12_133=='d') ) {
                                    int LA12_152 = input.LA(8);

                                    if ( ((LA12_152>='0' && LA12_152<='9')||(LA12_152>='A' && LA12_152<='Z')||LA12_152=='_'||(LA12_152>='a' && LA12_152<='z')) ) {
                                        alt12=35;
                                    }
                                    else {
                                        alt12=9;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case ';':
            {
            alt12=10;
            }
            break;
        case '0':
            {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='.') ) {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='.') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='*') ) {
                        alt12=11;
                    }
                    else if ( (LA12_64=='1') ) {
                        alt12=14;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 64, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 38, input);

                    throw nvae;
                }
            }
            else {
                alt12=37;}
            }
            break;
        case '1':
            {
            switch ( input.LA(2) ) {
            case '.':
                {
                alt12=13;
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
                {
                alt12=37;
                }
                break;
            default:
                alt12=12;}

            }
            break;
        case 'C':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='l') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='a') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='s') ) {
                        int LA12_89 = input.LA(5);

                        if ( (LA12_89=='s') ) {
                            int LA12_113 = input.LA(6);

                            if ( ((LA12_113>='0' && LA12_113<='9')||(LA12_113>='A' && LA12_113<='Z')||LA12_113=='_'||(LA12_113>='a' && LA12_113<='z')) ) {
                                alt12=35;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 'R':
            {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='u') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='l') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='e') ) {
                        int LA12_90 = input.LA(5);

                        if ( (LA12_90=='s') ) {
                            int LA12_114 = input.LA(6);

                            if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                                alt12=35;
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 'E':
            {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='n') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='u') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='m') ) {
                        int LA12_91 = input.LA(5);

                        if ( (LA12_91=='e') ) {
                            int LA12_115 = input.LA(6);

                            if ( (LA12_115=='r') ) {
                                int LA12_136 = input.LA(7);

                                if ( (LA12_136=='a') ) {
                                    int LA12_153 = input.LA(8);

                                    if ( (LA12_153=='t') ) {
                                        int LA12_169 = input.LA(9);

                                        if ( (LA12_169=='i') ) {
                                            int LA12_180 = input.LA(10);

                                            if ( (LA12_180=='o') ) {
                                                int LA12_187 = input.LA(11);

                                                if ( (LA12_187=='n') ) {
                                                    int LA12_192 = input.LA(12);

                                                    if ( ((LA12_192>='0' && LA12_192<='9')||(LA12_192>='A' && LA12_192<='Z')||LA12_192=='_'||(LA12_192>='a' && LA12_192<='z')) ) {
                                                        alt12=35;
                                                    }
                                                    else {
                                                        alt12=18;}
                                                }
                                                else {
                                                    alt12=35;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case '=':
            {
            alt12=19;
            }
            break;
        case 'u':
            {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='n') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='i') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='q') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='u') ) {
                            int LA12_116 = input.LA(6);

                            if ( (LA12_116=='e') ) {
                                int LA12_137 = input.LA(7);

                                if ( ((LA12_137>='0' && LA12_137<='9')||(LA12_137>='A' && LA12_137<='Z')||LA12_137=='_'||(LA12_137>='a' && LA12_137<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 'n':
            {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='u') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='l') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='l') ) {
                        int LA12_93 = input.LA(5);

                        if ( (LA12_93=='a') ) {
                            int LA12_117 = input.LA(6);

                            if ( (LA12_117=='b') ) {
                                int LA12_138 = input.LA(7);

                                if ( (LA12_138=='l') ) {
                                    int LA12_155 = input.LA(8);

                                    if ( (LA12_155=='e') ) {
                                        int LA12_170 = input.LA(9);

                                        if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
                                            alt12=35;
                                        }
                                        else {
                                            alt12=21;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 'b':
            {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='o') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='o') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='l') ) {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='e') ) {
                            int LA12_118 = input.LA(6);

                            if ( (LA12_118=='a') ) {
                                int LA12_139 = input.LA(7);

                                if ( (LA12_139=='n') ) {
                                    int LA12_156 = input.LA(8);

                                    if ( ((LA12_156>='0' && LA12_156<='9')||(LA12_156>='A' && LA12_156<='Z')||LA12_156=='_'||(LA12_156>='a' && LA12_156<='z')) ) {
                                        alt12=35;
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 'd':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'f':
                    {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='a') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='u') ) {
                            int LA12_119 = input.LA(6);

                            if ( (LA12_119=='l') ) {
                                int LA12_140 = input.LA(7);

                                if ( (LA12_140=='t') ) {
                                    int LA12_157 = input.LA(8);

                                    if ( ((LA12_157>='0' && LA12_157<='9')||(LA12_157>='A' && LA12_157<='Z')||LA12_157=='_'||(LA12_157>='a' && LA12_157<='z')) ) {
                                        alt12=35;
                                    }
                                    else {
                                        alt12=23;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='i') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='m') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='a') ) {
                                int LA12_141 = input.LA(7);

                                if ( (LA12_141=='l') ) {
                                    int LA12_158 = input.LA(8);

                                    if ( ((LA12_158>='0' && LA12_158<='9')||(LA12_158>='A' && LA12_158<='Z')||LA12_158=='_'||(LA12_158>='a' && LA12_158<='z')) ) {
                                        alt12=35;
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                default:
                    alt12=35;}

                }
                break;
            case 'a':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='t') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='e') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='t') ) {
                            int LA12_121 = input.LA(6);

                            if ( (LA12_121=='i') ) {
                                int LA12_142 = input.LA(7);

                                if ( (LA12_142=='m') ) {
                                    int LA12_159 = input.LA(8);

                                    if ( (LA12_159=='e') ) {
                                        int LA12_174 = input.LA(9);

                                        if ( ((LA12_174>='0' && LA12_174<='9')||(LA12_174>='A' && LA12_174<='Z')||LA12_174=='_'||(LA12_174>='a' && LA12_174<='z')) ) {
                                            alt12=35;
                                        }
                                        else {
                                            alt12=30;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

            }
            break;
        case 't':
            {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='r') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='u') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='e') ) {
                        int LA12_98 = input.LA(5);

                        if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                            alt12=35;
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 's':
            {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='t') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='r') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='i') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='n') ) {
                            int LA12_123 = input.LA(6);

                            if ( (LA12_123=='g') ) {
                                int LA12_143 = input.LA(7);

                                if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=26;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 'm':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='x') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='e') ) {
                            int LA12_124 = input.LA(6);

                            if ( (LA12_124=='n') ) {
                                int LA12_144 = input.LA(7);

                                if ( (LA12_144=='g') ) {
                                    int LA12_161 = input.LA(8);

                                    if ( (LA12_161=='t') ) {
                                        int LA12_175 = input.LA(9);

                                        if ( (LA12_175=='h') ) {
                                            int LA12_183 = input.LA(10);

                                            if ( ((LA12_183>='0' && LA12_183<='9')||(LA12_183>='A' && LA12_183<='Z')||LA12_183=='_'||(LA12_183>='a' && LA12_183<='z')) ) {
                                                alt12=35;
                                            }
                                            else {
                                                alt12=28;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
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
                        alt12=35;
                        }
                        break;
                    default:
                        alt12=33;}

                }
                else {
                    alt12=35;}
                }
                break;
            case 'i':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='n') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='e') ) {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='n') ) {
                                int LA12_145 = input.LA(7);

                                if ( (LA12_145=='g') ) {
                                    int LA12_162 = input.LA(8);

                                    if ( (LA12_162=='t') ) {
                                        int LA12_176 = input.LA(9);

                                        if ( (LA12_176=='h') ) {
                                            int LA12_184 = input.LA(10);

                                            if ( ((LA12_184>='0' && LA12_184<='9')||(LA12_184>='A' && LA12_184<='Z')||LA12_184=='_'||(LA12_184>='a' && LA12_184<='z')) ) {
                                                alt12=35;
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
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
                        alt12=35;
                        }
                        break;
                    default:
                        alt12=32;}

                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

            }
            break;
        case 'r':
            {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='e') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='g') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='e') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='x') ) {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='p') ) {
                                int LA12_146 = input.LA(7);

                                if ( ((LA12_146>='0' && LA12_146<='9')||(LA12_146>='A' && LA12_146<='Z')||LA12_146=='_'||(LA12_146>='a' && LA12_146<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
            }
            break;
        case 'D':
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
        case 'c':
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'p':
        case 'q':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=35;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=36;
            }
            break;
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt12=37;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=38;
            }
            break;
        case '/':
            {
            int LA12_29 = input.LA(2);

            if ( (LA12_29=='*') ) {
                alt12=39;
            }
            else if ( (LA12_29=='/') ) {
                alt12=40;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 29, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:106: T34
                {
                mT34(); 

                }
                break;
            case 26 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:110: T35
                {
                mT35(); 

                }
                break;
            case 27 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:114: T36
                {
                mT36(); 

                }
                break;
            case 28 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:118: T37
                {
                mT37(); 

                }
                break;
            case 29 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:122: T38
                {
                mT38(); 

                }
                break;
            case 30 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:126: T39
                {
                mT39(); 

                }
                break;
            case 31 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:130: T40
                {
                mT40(); 

                }
                break;
            case 32 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:134: T41
                {
                mT41(); 

                }
                break;
            case 33 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:138: T42
                {
                mT42(); 

                }
                break;
            case 34 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:142: T43
                {
                mT43(); 

                }
                break;
            case 35 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:146: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:154: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:175: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:183: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:199: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}