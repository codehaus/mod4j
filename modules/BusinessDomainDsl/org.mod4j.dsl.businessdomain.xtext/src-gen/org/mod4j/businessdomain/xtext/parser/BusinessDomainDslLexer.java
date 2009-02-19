// $ANTLR 3.0 ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g 2009-02-19 17:20:23

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
    public static final int Tokens=46;
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:42:7: ( 'abstract' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:42:7: 'abstract'
            {
            match("abstract"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:43:7: ( 'final' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:43:7: 'final'
            {
            match("final"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:44:7: ( 'nullable' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:44:7: 'nullable'
            {
            match("nullable"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:45:7: ( 'boolean' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:45:7: 'boolean'
            {
            match("boolean"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:46:7: ( 'default' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:46:7: 'default'
            {
            match("default"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:47:7: ( 'true' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:47:7: 'true'
            {
            match("true"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:48:7: ( 'false' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:48:7: 'false'
            {
            match("false"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:49:7: ( 'string' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:49:7: 'string'
            {
            match("string"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:50:7: ( 'minlength' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:50:7: 'minlength'
            {
            match("minlength"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:51:7: ( 'maxlength' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:51:7: 'maxlength'
            {
            match("maxlength"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:52:7: ( 'regexp' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:52:7: 'regexp'
            {
            match("regexp"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:53:7: ( 'datetime' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:53:7: 'datetime'
            {
            match("datetime"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:54:7: ( 'integer' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:54:7: 'integer'
            {
            match("integer"); 


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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:55:7: ( 'min' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:55:7: 'min'
            {
            match("min"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:56:7: ( 'max' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:56:7: 'max'
            {
            match("max"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:57:7: ( 'decimal' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:57:7: 'decimal'
            {
            match("decimal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:572:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:572:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:572:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:572:4: '^'
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

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:572:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
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
                    new NoViableAltException("576:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
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
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:53: ~ ( '\\\\' | '\"' )
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
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:579:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:579:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
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
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:579:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:579:54: ~ ( '\\\\' | '\\'' )
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:9: ( '0' .. '9' )+
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
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:10: '0' .. '9'
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:597:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:597:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:597:8: ( options {greedy=false; } : . )*
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
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:597:36: .
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
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:603:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:603:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:603:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:603:8: ~ ( '\\n' | '\\r' )
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

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:603:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:603:22: '\\r'
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
        // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=42;
        switch ( input.LA(1) ) {
        case 'B':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='u') ) {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='s') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='i') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='n') ) {
                            int LA12_112 = input.LA(6);

                            if ( (LA12_112=='e') ) {
                                int LA12_136 = input.LA(7);

                                if ( (LA12_136=='s') ) {
                                    int LA12_158 = input.LA(8);

                                    if ( (LA12_158=='s') ) {
                                        int LA12_176 = input.LA(9);

                                        if ( (LA12_176=='D') ) {
                                            int LA12_190 = input.LA(10);

                                            if ( (LA12_190=='o') ) {
                                                int LA12_199 = input.LA(11);

                                                if ( (LA12_199=='m') ) {
                                                    int LA12_204 = input.LA(12);

                                                    if ( (LA12_204=='a') ) {
                                                        int LA12_207 = input.LA(13);

                                                        if ( (LA12_207=='i') ) {
                                                            int LA12_210 = input.LA(14);

                                                            if ( (LA12_210=='n') ) {
                                                                int LA12_211 = input.LA(15);

                                                                if ( ((LA12_211>='0' && LA12_211<='9')||(LA12_211>='A' && LA12_211<='Z')||LA12_211=='_'||(LA12_211>='a' && LA12_211<='z')) ) {
                                                                    alt12=37;
                                                                }
                                                                else {
                                                                    alt12=1;}
                                                            }
                                                            else {
                                                                alt12=37;}
                                                        }
                                                        else {
                                                            alt12=37;}
                                                    }
                                                    else {
                                                        alt12=37;}
                                                }
                                                else {
                                                    alt12=37;}
                                            }
                                            else {
                                                alt12=37;}
                                        }
                                        else {
                                            alt12=37;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='o') ) {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='m') ) {
                        int LA12_85 = input.LA(5);

                        if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                            alt12=37;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
                }
                break;
            case 'a':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='l') ) {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='s') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='e') ) {
                            int LA12_114 = input.LA(6);

                            if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                                alt12=37;
                            }
                            else {
                                alt12=27;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
                }
                break;
            case 'i':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='n') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='a') ) {
                        int LA12_87 = input.LA(5);

                        if ( (LA12_87=='l') ) {
                            int LA12_115 = input.LA(6);

                            if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                                alt12=37;
                            }
                            else {
                                alt12=22;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
                }
                break;
            default:
                alt12=37;}

            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='p') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='o') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='r') ) {
                            int LA12_116 = input.LA(6);

                            if ( (LA12_116=='t') ) {
                                int LA12_139 = input.LA(7);

                                if ( ((LA12_139>='0' && LA12_139<='9')||(LA12_139>='A' && LA12_139<='Z')||LA12_139=='_'||(LA12_139>='a' && LA12_139<='z')) ) {
                                    alt12=37;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
                }
                break;
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='e') ) {
                        int LA12_89 = input.LA(5);

                        if ( (LA12_89=='g') ) {
                            int LA12_117 = input.LA(6);

                            if ( (LA12_117=='e') ) {
                                int LA12_140 = input.LA(7);

                                if ( (LA12_140=='r') ) {
                                    int LA12_160 = input.LA(8);

                                    if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
                                        alt12=37;
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                    }
                    break;
                case 'h':
                    {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='e') ) {
                        int LA12_90 = input.LA(5);

                        if ( (LA12_90=='r') ) {
                            int LA12_118 = input.LA(6);

                            if ( (LA12_118=='i') ) {
                                int LA12_141 = input.LA(7);

                                if ( (LA12_141=='t') ) {
                                    int LA12_161 = input.LA(8);

                                    if ( (LA12_161=='s') ) {
                                        int LA12_178 = input.LA(9);

                                        if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
                                            alt12=37;
                                        }
                                        else {
                                            alt12=16;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                    }
                    break;
                default:
                    alt12=37;}

                }
                break;
            default:
                alt12=37;}

            }
            break;
        case 'A':
            {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='s') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='s') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='o') ) {
                        int LA12_91 = input.LA(5);

                        if ( (LA12_91=='c') ) {
                            int LA12_119 = input.LA(6);

                            if ( (LA12_119=='i') ) {
                                int LA12_142 = input.LA(7);

                                if ( (LA12_142=='a') ) {
                                    int LA12_162 = input.LA(8);

                                    if ( (LA12_162=='t') ) {
                                        int LA12_179 = input.LA(9);

                                        if ( (LA12_179=='i') ) {
                                            int LA12_192 = input.LA(10);

                                            if ( (LA12_192=='o') ) {
                                                int LA12_200 = input.LA(11);

                                                if ( (LA12_200=='n') ) {
                                                    int LA12_205 = input.LA(12);

                                                    if ( ((LA12_205>='0' && LA12_205<='9')||(LA12_205>='A' && LA12_205<='Z')||LA12_205=='_'||(LA12_205>='a' && LA12_205<='z')) ) {
                                                        alt12=37;
                                                    }
                                                    else {
                                                        alt12=4;}
                                                }
                                                else {
                                                    alt12=37;}
                                            }
                                            else {
                                                alt12=37;}
                                        }
                                        else {
                                            alt12=37;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
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
                alt12=39;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 8, input);

                throw nvae;
            }
            }
            break;
        case 'o':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='r') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='d') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='e') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='r') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='e') ) {
                                int LA12_143 = input.LA(7);

                                if ( (LA12_143=='d') ) {
                                    int LA12_163 = input.LA(8);

                                    if ( ((LA12_163>='0' && LA12_163<='9')||(LA12_163>='A' && LA12_163<='Z')||LA12_163=='_'||(LA12_163>='a' && LA12_163<='z')) ) {
                                        alt12=37;
                                    }
                                    else {
                                        alt12=9;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
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
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='.') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='1') ) {
                        alt12=14;
                    }
                    else if ( (LA12_68=='*') ) {
                        alt12=11;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 68, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 40, input);

                    throw nvae;
                }
            }
            else {
                alt12=39;}
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
                alt12=39;
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
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='a') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='s') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='s') ) {
                            int LA12_121 = input.LA(6);

                            if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                                alt12=37;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
            }
            break;
        case 'R':
            {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='u') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='l') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='e') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='s') ) {
                            int LA12_122 = input.LA(6);

                            if ( ((LA12_122>='0' && LA12_122<='9')||(LA12_122>='A' && LA12_122<='Z')||LA12_122=='_'||(LA12_122>='a' && LA12_122<='z')) ) {
                                alt12=37;
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
            }
            break;
        case 'E':
            {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='n') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='u') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='m') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='e') ) {
                            int LA12_123 = input.LA(6);

                            if ( (LA12_123=='r') ) {
                                int LA12_146 = input.LA(7);

                                if ( (LA12_146=='a') ) {
                                    int LA12_164 = input.LA(8);

                                    if ( (LA12_164=='t') ) {
                                        int LA12_181 = input.LA(9);

                                        if ( (LA12_181=='i') ) {
                                            int LA12_193 = input.LA(10);

                                            if ( (LA12_193=='o') ) {
                                                int LA12_201 = input.LA(11);

                                                if ( (LA12_201=='n') ) {
                                                    int LA12_206 = input.LA(12);

                                                    if ( ((LA12_206>='0' && LA12_206<='9')||(LA12_206>='A' && LA12_206<='Z')||LA12_206=='_'||(LA12_206>='a' && LA12_206<='z')) ) {
                                                        alt12=37;
                                                    }
                                                    else {
                                                        alt12=18;}
                                                }
                                                else {
                                                    alt12=37;}
                                            }
                                            else {
                                                alt12=37;}
                                        }
                                        else {
                                            alt12=37;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
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
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='i') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='q') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='u') ) {
                            int LA12_124 = input.LA(6);

                            if ( (LA12_124=='e') ) {
                                int LA12_147 = input.LA(7);

                                if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                                    alt12=37;
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
            }
            break;
        case 'a':
            {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='b') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='s') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='t') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='r') ) {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='a') ) {
                                int LA12_148 = input.LA(7);

                                if ( (LA12_148=='c') ) {
                                    int LA12_166 = input.LA(8);

                                    if ( (LA12_166=='t') ) {
                                        int LA12_182 = input.LA(9);

                                        if ( ((LA12_182>='0' && LA12_182<='9')||(LA12_182>='A' && LA12_182<='Z')||LA12_182=='_'||(LA12_182>='a' && LA12_182<='z')) ) {
                                            alt12=37;
                                        }
                                        else {
                                            alt12=21;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
            }
            break;
        case 'n':
            {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='u') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='l') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='l') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='a') ) {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='b') ) {
                                int LA12_149 = input.LA(7);

                                if ( (LA12_149=='l') ) {
                                    int LA12_167 = input.LA(8);

                                    if ( (LA12_167=='e') ) {
                                        int LA12_183 = input.LA(9);

                                        if ( ((LA12_183>='0' && LA12_183<='9')||(LA12_183>='A' && LA12_183<='Z')||LA12_183=='_'||(LA12_183>='a' && LA12_183<='z')) ) {
                                            alt12=37;
                                        }
                                        else {
                                            alt12=23;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
            }
            break;
        case 'b':
            {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='o') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='o') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='l') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='e') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='a') ) {
                                int LA12_150 = input.LA(7);

                                if ( (LA12_150=='n') ) {
                                    int LA12_168 = input.LA(8);

                                    if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
                                        alt12=37;
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
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
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='a') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='u') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='l') ) {
                                int LA12_151 = input.LA(7);

                                if ( (LA12_151=='t') ) {
                                    int LA12_169 = input.LA(8);

                                    if ( ((LA12_169>='0' && LA12_169<='9')||(LA12_169>='A' && LA12_169<='Z')||LA12_169=='_'||(LA12_169>='a' && LA12_169<='z')) ) {
                                        alt12=37;
                                    }
                                    else {
                                        alt12=25;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='i') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='m') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='a') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='l') ) {
                                    int LA12_170 = input.LA(8);

                                    if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
                                        alt12=37;
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                    }
                    break;
                default:
                    alt12=37;}

                }
                break;
            case 'a':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='t') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='e') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='t') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='i') ) {
                                int LA12_153 = input.LA(7);

                                if ( (LA12_153=='m') ) {
                                    int LA12_171 = input.LA(8);

                                    if ( (LA12_171=='e') ) {
                                        int LA12_187 = input.LA(9);

                                        if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                            alt12=37;
                                        }
                                        else {
                                            alt12=32;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
                }
                break;
            default:
                alt12=37;}

            }
            break;
        case 't':
            {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='r') ) {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='u') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='e') ) {
                        int LA12_105 = input.LA(5);

                        if ( ((LA12_105>='0' && LA12_105<='9')||(LA12_105>='A' && LA12_105<='Z')||LA12_105=='_'||(LA12_105>='a' && LA12_105<='z')) ) {
                            alt12=37;
                        }
                        else {
                            alt12=26;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
            }
            break;
        case 's':
            {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='t') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='r') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='i') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='n') ) {
                            int LA12_132 = input.LA(6);

                            if ( (LA12_132=='g') ) {
                                int LA12_154 = input.LA(7);

                                if ( ((LA12_154>='0' && LA12_154<='9')||(LA12_154>='A' && LA12_154<='Z')||LA12_154=='_'||(LA12_154>='a' && LA12_154<='z')) ) {
                                    alt12=37;
                                }
                                else {
                                    alt12=28;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
            }
            break;
        case 'm':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='x') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='e') ) {
                            int LA12_133 = input.LA(6);

                            if ( (LA12_133=='n') ) {
                                int LA12_155 = input.LA(7);

                                if ( (LA12_155=='g') ) {
                                    int LA12_173 = input.LA(8);

                                    if ( (LA12_173=='t') ) {
                                        int LA12_188 = input.LA(9);

                                        if ( (LA12_188=='h') ) {
                                            int LA12_197 = input.LA(10);

                                            if ( ((LA12_197>='0' && LA12_197<='9')||(LA12_197>='A' && LA12_197<='Z')||LA12_197=='_'||(LA12_197>='a' && LA12_197<='z')) ) {
                                                alt12=37;
                                            }
                                            else {
                                                alt12=30;}
                                        }
                                        else {
                                            alt12=37;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
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
                        alt12=37;
                        }
                        break;
                    default:
                        alt12=35;}

                }
                else {
                    alt12=37;}
                }
                break;
            case 'i':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='n') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_109 = input.LA(5);

                        if ( (LA12_109=='e') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='n') ) {
                                int LA12_156 = input.LA(7);

                                if ( (LA12_156=='g') ) {
                                    int LA12_174 = input.LA(8);

                                    if ( (LA12_174=='t') ) {
                                        int LA12_189 = input.LA(9);

                                        if ( (LA12_189=='h') ) {
                                            int LA12_198 = input.LA(10);

                                            if ( ((LA12_198>='0' && LA12_198<='9')||(LA12_198>='A' && LA12_198<='Z')||LA12_198=='_'||(LA12_198>='a' && LA12_198<='z')) ) {
                                                alt12=37;
                                            }
                                            else {
                                                alt12=29;}
                                        }
                                        else {
                                            alt12=37;}
                                    }
                                    else {
                                        alt12=37;}
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
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
                        alt12=37;
                        }
                        break;
                    default:
                        alt12=34;}

                }
                else {
                    alt12=37;}
                }
                break;
            default:
                alt12=37;}

            }
            break;
        case 'r':
            {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='e') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='g') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='e') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='x') ) {
                            int LA12_135 = input.LA(6);

                            if ( (LA12_135=='p') ) {
                                int LA12_157 = input.LA(7);

                                if ( ((LA12_157>='0' && LA12_157<='9')||(LA12_157>='A' && LA12_157<='Z')||LA12_157=='_'||(LA12_157>='a' && LA12_157<='z')) ) {
                                    alt12=37;
                                }
                                else {
                                    alt12=31;}
                            }
                            else {
                                alt12=37;}
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=37;}
                }
                else {
                    alt12=37;}
            }
            else {
                alt12=37;}
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
            alt12=37;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=38;
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
            alt12=39;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=40;
            }
            break;
        case '/':
            {
            int LA12_30 = input.LA(2);

            if ( (LA12_30=='*') ) {
                alt12=41;
            }
            else if ( (LA12_30=='/') ) {
                alt12=42;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 30, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

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
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:146: T44
                {
                mT44(); 

                }
                break;
            case 36 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:150: T45
                {
                mT45(); 

                }
                break;
            case 37 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:154: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:162: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:174: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:183: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:191: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:207: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}