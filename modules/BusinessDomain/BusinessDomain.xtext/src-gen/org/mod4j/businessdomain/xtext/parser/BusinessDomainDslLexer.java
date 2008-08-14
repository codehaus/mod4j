// $ANTLR 3.0 ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g 2008-08-13 22:34:20

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
    public static final int RULE_ML_COMMENT=8;
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
    public static final int T10=10;
    public static final int RULE_WS=7;
    public static final int T48=48;
    public static final int T15=15;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T47=47;
    public static final int Tokens=55;
    public static final int T53=53;
    public static final int T31=31;
    public static final int T49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int T27=27;
    public static final int T52=52;
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
    public String getGrammarFileName() { return "..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:22:7: ( 'Model' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:22:7: 'Model'
            {
            match("Model"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:23:7: ( 'import' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:23:7: 'import'
            {
            match("import"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:24:7: ( 'Association' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:24:7: 'Association'
            {
            match("Association"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:25:7: ( '[' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:25:7: '['
            {
            match('['); 

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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:26:7: ( ']' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:26:7: ']'
            {
            match(']'); 

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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:27:7: ( '<->' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:27:7: '<->'
            {
            match("<->"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:28:7: ( '->' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:28:7: '->'
            {
            match("->"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:29:7: ( ';' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:29:7: ';'
            {
            match(';'); 

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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:30:7: ( '0..*' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:30:7: '0..*'
            {
            match("0..*"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:31:7: ( '1' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:31:7: '1'
            {
            match('1'); 

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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:32:7: ( '1..*' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:32:7: '1..*'
            {
            match("1..*"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:33:7: ( '0..1' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:33:7: '0..1'
            {
            match("0..1"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:34:7: ( 'Class' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:34:7: 'Class'
            {
            match("Class"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:35:7: ( 'inherits' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:35:7: 'inherits'
            {
            match("inherits"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:36:7: ( 'Rules' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:36:7: 'Rules'
            {
            match("Rules"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:37:7: ( 'Enumeration' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:37:7: 'Enumeration'
            {
            match("Enumeration"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:38:7: ( '=' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:38:7: '='
            {
            match('='); 

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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:39:7: ( 'unique' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:39:7: 'unique'
            {
            match("unique"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:40:7: ( 'abstract' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:40:7: 'abstract'
            {
            match("abstract"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:41:7: ( 'final' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:41:7: 'final'
            {
            match("final"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:42:7: ( 'nullable' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:42:7: 'nullable'
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:43:7: ( 'persistency' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:43:7: 'persistency'
            {
            match("persistency"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:44:7: ( 'boolean' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:44:7: 'boolean'
            {
            match("boolean"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:45:7: ( 'default' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:45:7: 'default'
            {
            match("default"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:46:7: ( 'true' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:46:7: 'true'
            {
            match("true"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:47:7: ( 'false' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:47:7: 'false'
            {
            match("false"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:48:7: ( 'string' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:48:7: 'string'
            {
            match("string"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:49:7: ( 'minlength' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:49:7: 'minlength'
            {
            match("minlength"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:50:7: ( 'maxlength' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:50:7: 'maxlength'
            {
            match("maxlength"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:51:7: ( 'regexp' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:51:7: 'regexp'
            {
            match("regexp"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:52:7: ( 'datetime' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:52:7: 'datetime'
            {
            match("datetime"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:53:7: ( 'month' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:53:7: 'month'
            {
            match("month"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:54:7: ( 'year' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:54:7: 'year'
            {
            match("year"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:55:7: ( 'day' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:55:7: 'day'
            {
            match("day"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:56:7: ( 'hour' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:56:7: 'hour'
            {
            match("hour"); 


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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:57:7: ( 'minute' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:57:7: 'minute'
            {
            match("minute"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:58:7: ( 'second' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:58:7: 'second'
            {
            match("second"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:59:7: ( 'millisecond' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:59:7: 'millisecond'
            {
            match("millisecond"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:60:7: ( 'integer' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:60:7: 'integer'
            {
            match("integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:61:7: ( 'min' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:61:7: 'min'
            {
            match("min"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:62:7: ( 'max' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:62:7: 'max'
            {
            match("max"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:63:7: ( 'decimal' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:63:7: 'decimal'
            {
            match("decimal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:64:7: ( 'ReadWrite' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:64:7: 'ReadWrite'
            {
            match("ReadWrite"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:65:7: ( 'Read' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:65:7: 'Read'
            {
            match("Read"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:66:7: ( 'NONE' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:66:7: 'NONE'
            {
            match("NONE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:611:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:611:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:611:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:611:4: '^'
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:611:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:617:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
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
                    new NoViableAltException("615:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:617:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:617:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
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
                    	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:617:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:617:53: ~ ( '\\\\' | '\"' )
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
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:618:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:618:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
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
                    	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:618:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:618:54: ~ ( '\\\\' | '\\'' )
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:624:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:624:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:624:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:624:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:624:9: ( '0' .. '9' )+
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
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:624:10: '0' .. '9'
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:630:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:630:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:630:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:636:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:636:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:636:8: ( options {greedy=false; } : . )*
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
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:636:36: .
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:642:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:642:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:642:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:642:8: ~ ( '\\n' | '\\r' )
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:642:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:642:22: '\\r'
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
        // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=51;
        switch ( input.LA(1) ) {
        case 'M':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='o') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='d') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='e') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='l') ) {
                            int LA12_135 = input.LA(6);

                            if ( ((LA12_135>='0' && LA12_135<='9')||(LA12_135>='A' && LA12_135<='Z')||LA12_135=='_'||(LA12_135>='a' && LA12_135<='z')) ) {
                                alt12=46;
                            }
                            else {
                                alt12=1;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
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
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='e') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='r') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='i') ) {
                                int LA12_168 = input.LA(7);

                                if ( (LA12_168=='t') ) {
                                    int LA12_194 = input.LA(8);

                                    if ( (LA12_194=='s') ) {
                                        int LA12_215 = input.LA(9);

                                        if ( ((LA12_215>='0' && LA12_215<='9')||(LA12_215>='A' && LA12_215<='Z')||LA12_215=='_'||(LA12_215>='a' && LA12_215<='z')) ) {
                                            alt12=46;
                                        }
                                        else {
                                            alt12=14;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                    }
                    break;
                case 't':
                    {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='e') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='g') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='e') ) {
                                int LA12_169 = input.LA(7);

                                if ( (LA12_169=='r') ) {
                                    int LA12_195 = input.LA(8);

                                    if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                        alt12=46;
                                    }
                                    else {
                                        alt12=39;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                    }
                    break;
                default:
                    alt12=46;}

                }
                break;
            case 'm':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='p') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='o') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='r') ) {
                            int LA12_138 = input.LA(6);

                            if ( (LA12_138=='t') ) {
                                int LA12_170 = input.LA(7);

                                if ( ((LA12_170>='0' && LA12_170<='9')||(LA12_170>='A' && LA12_170<='Z')||LA12_170=='_'||(LA12_170>='a' && LA12_170<='z')) ) {
                                    alt12=46;
                                }
                                else {
                                    alt12=2;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
                }
                break;
            default:
                alt12=46;}

            }
            break;
        case 'A':
            {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='s') ) {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='s') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='o') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='c') ) {
                            int LA12_139 = input.LA(6);

                            if ( (LA12_139=='i') ) {
                                int LA12_171 = input.LA(7);

                                if ( (LA12_171=='a') ) {
                                    int LA12_197 = input.LA(8);

                                    if ( (LA12_197=='t') ) {
                                        int LA12_217 = input.LA(9);

                                        if ( (LA12_217=='i') ) {
                                            int LA12_231 = input.LA(10);

                                            if ( (LA12_231=='o') ) {
                                                int LA12_241 = input.LA(11);

                                                if ( (LA12_241=='n') ) {
                                                    int LA12_248 = input.LA(12);

                                                    if ( ((LA12_248>='0' && LA12_248<='9')||(LA12_248>='A' && LA12_248<='Z')||LA12_248=='_'||(LA12_248>='a' && LA12_248<='z')) ) {
                                                        alt12=46;
                                                    }
                                                    else {
                                                        alt12=3;}
                                                }
                                                else {
                                                    alt12=46;}
                                            }
                                            else {
                                                alt12=46;}
                                        }
                                        else {
                                            alt12=46;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case '[':
            {
            alt12=4;
            }
            break;
        case ']':
            {
            alt12=5;
            }
            break;
        case '<':
            {
            alt12=6;
            }
            break;
        case '-':
            {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='>') ) {
                alt12=7;
            }
            else if ( ((LA12_7>='0' && LA12_7<='9')) ) {
                alt12=48;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 7, input);

                throw nvae;
            }
            }
            break;
        case ';':
            {
            alt12=8;
            }
            break;
        case '0':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='.') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='.') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='1') ) {
                        alt12=12;
                    }
                    else if ( (LA12_72=='*') ) {
                        alt12=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 72, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 39, input);

                    throw nvae;
                }
            }
            else {
                alt12=48;}
            }
            break;
        case '1':
            {
            switch ( input.LA(2) ) {
            case '.':
                {
                alt12=11;
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
                alt12=48;
                }
                break;
            default:
                alt12=10;}

            }
            break;
        case 'C':
            {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='l') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='a') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='s') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='s') ) {
                            int LA12_140 = input.LA(6);

                            if ( ((LA12_140>='0' && LA12_140<='9')||(LA12_140>='A' && LA12_140<='Z')||LA12_140=='_'||(LA12_140>='a' && LA12_140<='z')) ) {
                                alt12=46;
                            }
                            else {
                                alt12=13;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'R':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='a') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='d') ) {
                        switch ( input.LA(5) ) {
                        case 'W':
                            {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='r') ) {
                                int LA12_173 = input.LA(7);

                                if ( (LA12_173=='i') ) {
                                    int LA12_198 = input.LA(8);

                                    if ( (LA12_198=='t') ) {
                                        int LA12_218 = input.LA(9);

                                        if ( (LA12_218=='e') ) {
                                            int LA12_232 = input.LA(10);

                                            if ( ((LA12_232>='0' && LA12_232<='9')||(LA12_232>='A' && LA12_232<='Z')||LA12_232=='_'||(LA12_232>='a' && LA12_232<='z')) ) {
                                                alt12=46;
                                            }
                                            else {
                                                alt12=43;}
                                        }
                                        else {
                                            alt12=46;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
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
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt12=46;
                            }
                            break;
                        default:
                            alt12=44;}

                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
                }
                break;
            case 'u':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='l') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='e') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='s') ) {
                            int LA12_143 = input.LA(6);

                            if ( ((LA12_143>='0' && LA12_143<='9')||(LA12_143>='A' && LA12_143<='Z')||LA12_143=='_'||(LA12_143>='a' && LA12_143<='z')) ) {
                                alt12=46;
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
                }
                break;
            default:
                alt12=46;}

            }
            break;
        case 'E':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='n') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='u') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='m') ) {
                        int LA12_109 = input.LA(5);

                        if ( (LA12_109=='e') ) {
                            int LA12_144 = input.LA(6);

                            if ( (LA12_144=='r') ) {
                                int LA12_175 = input.LA(7);

                                if ( (LA12_175=='a') ) {
                                    int LA12_199 = input.LA(8);

                                    if ( (LA12_199=='t') ) {
                                        int LA12_219 = input.LA(9);

                                        if ( (LA12_219=='i') ) {
                                            int LA12_233 = input.LA(10);

                                            if ( (LA12_233=='o') ) {
                                                int LA12_243 = input.LA(11);

                                                if ( (LA12_243=='n') ) {
                                                    int LA12_249 = input.LA(12);

                                                    if ( ((LA12_249>='0' && LA12_249<='9')||(LA12_249>='A' && LA12_249<='Z')||LA12_249=='_'||(LA12_249>='a' && LA12_249<='z')) ) {
                                                        alt12=46;
                                                    }
                                                    else {
                                                        alt12=16;}
                                                }
                                                else {
                                                    alt12=46;}
                                            }
                                            else {
                                                alt12=46;}
                                        }
                                        else {
                                            alt12=46;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case '=':
            {
            alt12=17;
            }
            break;
        case 'u':
            {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='n') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='i') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='q') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='u') ) {
                            int LA12_145 = input.LA(6);

                            if ( (LA12_145=='e') ) {
                                int LA12_176 = input.LA(7);

                                if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                                    alt12=46;
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'a':
            {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='b') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='s') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='t') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='r') ) {
                            int LA12_146 = input.LA(6);

                            if ( (LA12_146=='a') ) {
                                int LA12_177 = input.LA(7);

                                if ( (LA12_177=='c') ) {
                                    int LA12_201 = input.LA(8);

                                    if ( (LA12_201=='t') ) {
                                        int LA12_220 = input.LA(9);

                                        if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                            alt12=46;
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='n') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='a') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='l') ) {
                            int LA12_147 = input.LA(6);

                            if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                                alt12=46;
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
                }
                break;
            case 'a':
                {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='l') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='s') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='e') ) {
                            int LA12_148 = input.LA(6);

                            if ( ((LA12_148>='0' && LA12_148<='9')||(LA12_148>='A' && LA12_148<='Z')||LA12_148=='_'||(LA12_148>='a' && LA12_148<='z')) ) {
                                alt12=46;
                            }
                            else {
                                alt12=26;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
                }
                break;
            default:
                alt12=46;}

            }
            break;
        case 'n':
            {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='u') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='l') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='l') ) {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='a') ) {
                            int LA12_149 = input.LA(6);

                            if ( (LA12_149=='b') ) {
                                int LA12_180 = input.LA(7);

                                if ( (LA12_180=='l') ) {
                                    int LA12_202 = input.LA(8);

                                    if ( (LA12_202=='e') ) {
                                        int LA12_221 = input.LA(9);

                                        if ( ((LA12_221>='0' && LA12_221<='9')||(LA12_221>='A' && LA12_221<='Z')||LA12_221=='_'||(LA12_221>='a' && LA12_221<='z')) ) {
                                            alt12=46;
                                        }
                                        else {
                                            alt12=21;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'p':
            {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='e') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='r') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='s') ) {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='i') ) {
                            int LA12_150 = input.LA(6);

                            if ( (LA12_150=='s') ) {
                                int LA12_181 = input.LA(7);

                                if ( (LA12_181=='t') ) {
                                    int LA12_203 = input.LA(8);

                                    if ( (LA12_203=='e') ) {
                                        int LA12_222 = input.LA(9);

                                        if ( (LA12_222=='n') ) {
                                            int LA12_236 = input.LA(10);

                                            if ( (LA12_236=='c') ) {
                                                int LA12_244 = input.LA(11);

                                                if ( (LA12_244=='y') ) {
                                                    int LA12_250 = input.LA(12);

                                                    if ( ((LA12_250>='0' && LA12_250<='9')||(LA12_250>='A' && LA12_250<='Z')||LA12_250=='_'||(LA12_250>='a' && LA12_250<='z')) ) {
                                                        alt12=46;
                                                    }
                                                    else {
                                                        alt12=22;}
                                                }
                                                else {
                                                    alt12=46;}
                                            }
                                            else {
                                                alt12=46;}
                                        }
                                        else {
                                            alt12=46;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'b':
            {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='o') ) {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='o') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='l') ) {
                        int LA12_116 = input.LA(5);

                        if ( (LA12_116=='e') ) {
                            int LA12_151 = input.LA(6);

                            if ( (LA12_151=='a') ) {
                                int LA12_182 = input.LA(7);

                                if ( (LA12_182=='n') ) {
                                    int LA12_204 = input.LA(8);

                                    if ( ((LA12_204>='0' && LA12_204<='9')||(LA12_204>='A' && LA12_204<='Z')||LA12_204=='_'||(LA12_204>='a' && LA12_204<='z')) ) {
                                        alt12=46;
                                    }
                                    else {
                                        alt12=23;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
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
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='a') ) {
                        int LA12_117 = input.LA(5);

                        if ( (LA12_117=='u') ) {
                            int LA12_152 = input.LA(6);

                            if ( (LA12_152=='l') ) {
                                int LA12_183 = input.LA(7);

                                if ( (LA12_183=='t') ) {
                                    int LA12_205 = input.LA(8);

                                    if ( ((LA12_205>='0' && LA12_205<='9')||(LA12_205>='A' && LA12_205<='Z')||LA12_205=='_'||(LA12_205>='a' && LA12_205<='z')) ) {
                                        alt12=46;
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='i') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='m') ) {
                            int LA12_153 = input.LA(6);

                            if ( (LA12_153=='a') ) {
                                int LA12_184 = input.LA(7);

                                if ( (LA12_184=='l') ) {
                                    int LA12_206 = input.LA(8);

                                    if ( ((LA12_206>='0' && LA12_206<='9')||(LA12_206>='A' && LA12_206<='Z')||LA12_206=='_'||(LA12_206>='a' && LA12_206<='z')) ) {
                                        alt12=46;
                                    }
                                    else {
                                        alt12=42;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                    }
                    break;
                default:
                    alt12=46;}

                }
                break;
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='e') ) {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='t') ) {
                            int LA12_154 = input.LA(6);

                            if ( (LA12_154=='i') ) {
                                int LA12_185 = input.LA(7);

                                if ( (LA12_185=='m') ) {
                                    int LA12_207 = input.LA(8);

                                    if ( (LA12_207=='e') ) {
                                        int LA12_226 = input.LA(9);

                                        if ( ((LA12_226>='0' && LA12_226<='9')||(LA12_226>='A' && LA12_226<='Z')||LA12_226=='_'||(LA12_226>='a' && LA12_226<='z')) ) {
                                            alt12=46;
                                        }
                                        else {
                                            alt12=31;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                    }
                    break;
                case 'y':
                    {
                    int LA12_87 = input.LA(4);

                    if ( ((LA12_87>='0' && LA12_87<='9')||(LA12_87>='A' && LA12_87<='Z')||LA12_87=='_'||(LA12_87>='a' && LA12_87<='z')) ) {
                        alt12=46;
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                default:
                    alt12=46;}

                }
                break;
            default:
                alt12=46;}

            }
            break;
        case 't':
            {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='r') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='u') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='e') ) {
                        int LA12_121 = input.LA(5);

                        if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                            alt12=46;
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 's':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='c') ) {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='o') ) {
                        int LA12_122 = input.LA(5);

                        if ( (LA12_122=='n') ) {
                            int LA12_156 = input.LA(6);

                            if ( (LA12_156=='d') ) {
                                int LA12_186 = input.LA(7);

                                if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                                    alt12=46;
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
                }
                break;
            case 't':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='r') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='i') ) {
                        int LA12_123 = input.LA(5);

                        if ( (LA12_123=='n') ) {
                            int LA12_157 = input.LA(6);

                            if ( (LA12_157=='g') ) {
                                int LA12_187 = input.LA(7);

                                if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                    alt12=46;
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
                }
                break;
            default:
                alt12=46;}

            }
            break;
        case 'm':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='l') ) {
                        int LA12_124 = input.LA(5);

                        if ( (LA12_124=='i') ) {
                            int LA12_158 = input.LA(6);

                            if ( (LA12_158=='s') ) {
                                int LA12_188 = input.LA(7);

                                if ( (LA12_188=='e') ) {
                                    int LA12_210 = input.LA(8);

                                    if ( (LA12_210=='c') ) {
                                        int LA12_227 = input.LA(9);

                                        if ( (LA12_227=='o') ) {
                                            int LA12_238 = input.LA(10);

                                            if ( (LA12_238=='n') ) {
                                                int LA12_245 = input.LA(11);

                                                if ( (LA12_245=='d') ) {
                                                    int LA12_251 = input.LA(12);

                                                    if ( ((LA12_251>='0' && LA12_251<='9')||(LA12_251>='A' && LA12_251<='Z')||LA12_251=='_'||(LA12_251>='a' && LA12_251<='z')) ) {
                                                        alt12=46;
                                                    }
                                                    else {
                                                        alt12=38;}
                                                }
                                                else {
                                                    alt12=46;}
                                            }
                                            else {
                                                alt12=46;}
                                        }
                                        else {
                                            alt12=46;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                    }
                    break;
                case 'n':
                    {
                    switch ( input.LA(4) ) {
                    case 'u':
                        {
                        int LA12_125 = input.LA(5);

                        if ( (LA12_125=='t') ) {
                            int LA12_159 = input.LA(6);

                            if ( (LA12_159=='e') ) {
                                int LA12_189 = input.LA(7);

                                if ( ((LA12_189>='0' && LA12_189<='9')||(LA12_189>='A' && LA12_189<='Z')||LA12_189=='_'||(LA12_189>='a' && LA12_189<='z')) ) {
                                    alt12=46;
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                        }
                        break;
                    case 'l':
                        {
                        int LA12_126 = input.LA(5);

                        if ( (LA12_126=='e') ) {
                            int LA12_160 = input.LA(6);

                            if ( (LA12_160=='n') ) {
                                int LA12_190 = input.LA(7);

                                if ( (LA12_190=='g') ) {
                                    int LA12_212 = input.LA(8);

                                    if ( (LA12_212=='t') ) {
                                        int LA12_228 = input.LA(9);

                                        if ( (LA12_228=='h') ) {
                                            int LA12_239 = input.LA(10);

                                            if ( ((LA12_239>='0' && LA12_239<='9')||(LA12_239>='A' && LA12_239<='Z')||LA12_239=='_'||(LA12_239>='a' && LA12_239<='z')) ) {
                                                alt12=46;
                                            }
                                            else {
                                                alt12=28;}
                                        }
                                        else {
                                            alt12=46;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
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
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt12=46;
                        }
                        break;
                    default:
                        alt12=40;}

                    }
                    break;
                default:
                    alt12=46;}

                }
                break;
            case 'a':
                {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='x') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_128 = input.LA(5);

                        if ( (LA12_128=='e') ) {
                            int LA12_161 = input.LA(6);

                            if ( (LA12_161=='n') ) {
                                int LA12_191 = input.LA(7);

                                if ( (LA12_191=='g') ) {
                                    int LA12_213 = input.LA(8);

                                    if ( (LA12_213=='t') ) {
                                        int LA12_229 = input.LA(9);

                                        if ( (LA12_229=='h') ) {
                                            int LA12_240 = input.LA(10);

                                            if ( ((LA12_240>='0' && LA12_240<='9')||(LA12_240>='A' && LA12_240<='Z')||LA12_240=='_'||(LA12_240>='a' && LA12_240<='z')) ) {
                                                alt12=46;
                                            }
                                            else {
                                                alt12=29;}
                                        }
                                        else {
                                            alt12=46;}
                                    }
                                    else {
                                        alt12=46;}
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
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
                        alt12=46;
                        }
                        break;
                    default:
                        alt12=41;}

                }
                else {
                    alt12=46;}
                }
                break;
            case 'o':
                {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='n') ) {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='t') ) {
                        int LA12_130 = input.LA(5);

                        if ( (LA12_130=='h') ) {
                            int LA12_162 = input.LA(6);

                            if ( ((LA12_162>='0' && LA12_162<='9')||(LA12_162>='A' && LA12_162<='Z')||LA12_162=='_'||(LA12_162>='a' && LA12_162<='z')) ) {
                                alt12=46;
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
                }
                break;
            default:
                alt12=46;}

            }
            break;
        case 'r':
            {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='e') ) {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='g') ) {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='e') ) {
                        int LA12_131 = input.LA(5);

                        if ( (LA12_131=='x') ) {
                            int LA12_163 = input.LA(6);

                            if ( (LA12_163=='p') ) {
                                int LA12_193 = input.LA(7);

                                if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
                                    alt12=46;
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=46;}
                        }
                        else {
                            alt12=46;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'y':
            {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='e') ) {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='a') ) {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='r') ) {
                        int LA12_132 = input.LA(5);

                        if ( ((LA12_132>='0' && LA12_132<='9')||(LA12_132>='A' && LA12_132<='Z')||LA12_132=='_'||(LA12_132>='a' && LA12_132<='z')) ) {
                            alt12=46;
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'h':
            {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='o') ) {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='u') ) {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='r') ) {
                        int LA12_133 = input.LA(5);

                        if ( ((LA12_133>='0' && LA12_133<='9')||(LA12_133>='A' && LA12_133<='Z')||LA12_133=='_'||(LA12_133>='a' && LA12_133<='z')) ) {
                            alt12=46;
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'N':
            {
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='O') ) {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='N') ) {
                    int LA12_98 = input.LA(4);

                    if ( (LA12_98=='E') ) {
                        int LA12_134 = input.LA(5);

                        if ( ((LA12_134>='0' && LA12_134<='9')||(LA12_134>='A' && LA12_134<='Z')||LA12_134=='_'||(LA12_134>='a' && LA12_134<='z')) ) {
                            alt12=46;
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=46;}
                }
                else {
                    alt12=46;}
            }
            else {
                alt12=46;}
            }
            break;
        case 'B':
        case 'D':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
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
        case 'j':
        case 'k':
        case 'l':
        case 'o':
        case 'q':
        case 'v':
        case 'w':
        case 'x':
        case 'z':
            {
            alt12=46;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=47;
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
            alt12=48;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=49;
            }
            break;
        case '/':
            {
            int LA12_33 = input.LA(2);

            if ( (LA12_33=='/') ) {
                alt12=51;
            }
            else if ( (LA12_33=='*') ) {
                alt12=50;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 33, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:106: T34
                {
                mT34(); 

                }
                break;
            case 26 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:110: T35
                {
                mT35(); 

                }
                break;
            case 27 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:114: T36
                {
                mT36(); 

                }
                break;
            case 28 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:118: T37
                {
                mT37(); 

                }
                break;
            case 29 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:122: T38
                {
                mT38(); 

                }
                break;
            case 30 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:126: T39
                {
                mT39(); 

                }
                break;
            case 31 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:130: T40
                {
                mT40(); 

                }
                break;
            case 32 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:134: T41
                {
                mT41(); 

                }
                break;
            case 33 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:138: T42
                {
                mT42(); 

                }
                break;
            case 34 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:142: T43
                {
                mT43(); 

                }
                break;
            case 35 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:146: T44
                {
                mT44(); 

                }
                break;
            case 36 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:150: T45
                {
                mT45(); 

                }
                break;
            case 37 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:154: T46
                {
                mT46(); 

                }
                break;
            case 38 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:158: T47
                {
                mT47(); 

                }
                break;
            case 39 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:162: T48
                {
                mT48(); 

                }
                break;
            case 40 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:166: T49
                {
                mT49(); 

                }
                break;
            case 41 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:170: T50
                {
                mT50(); 

                }
                break;
            case 42 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:174: T51
                {
                mT51(); 

                }
                break;
            case 43 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:178: T52
                {
                mT52(); 

                }
                break;
            case 44 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:182: T53
                {
                mT53(); 

                }
                break;
            case 45 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:186: T54
                {
                mT54(); 

                }
                break;
            case 46 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:190: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 47 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:198: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 48 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:210: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:227: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:1:243: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}