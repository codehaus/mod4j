// $ANTLR 3.0 ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g 2008-10-08 08:09:08

package org.mod4j.dsl.datacontract.xtext.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DataContractDslLexer extends Lexer {
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=8;
    public static final int T14=14;
    public static final int RULE_ID=5;
    public static final int T22=22;
    public static final int T11=11;
    public static final int RULE_STRING=4;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T25=25;
    public static final int T18=18;
    public static final int RULE_WS=7;
    public static final int T26=26;
    public static final int T15=15;
    public static final int RULE_INT=6;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=27;
    public static final int T16=16;
    public static final int RULE_SL_COMMENT=9;
    public static final int T24=24;
    public static final int T19=19;

    	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg;
    	}

    public DataContractDslLexer() {;} 
    public DataContractDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:22:7: ( 'DataContract' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:22:7: 'DataContract'
            {
            match("DataContract"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:23:7: ( 'from' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:23:7: 'from'
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:24:7: ( 'import' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:24:7: 'import'
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:25:7: ( 'BusinessClassDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:25:7: 'BusinessClassDto'
            {
            match("BusinessClassDto"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:26:7: ( 'base' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:26:7: 'base'
            {
            match("base"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:27:7: ( '[' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:27:7: '['
            {
            match('['); 

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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:28:7: ( 'references' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:28:7: 'references'
            {
            match("references"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:29:7: ( ']' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:29:7: ']'
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
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:30:7: ( 'EnumerationDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:30:7: 'EnumerationDto'
            {
            match("EnumerationDto"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:31:7: ( ';' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:31:7: ';'
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:32:7: ( 'ListDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:32:7: 'ListDto'
            {
            match("ListDto"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:33:7: ( 'CustomDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:33:7: 'CustomDto'
            {
            match("CustomDto"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:34:7: ( 'boolean' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:34:7: 'boolean'
            {
            match("boolean"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:35:7: ( 'string' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:35:7: 'string'
            {
            match("string"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:36:7: ( 'datetime' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:36:7: 'datetime'
            {
            match("datetime"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:37:7: ( 'integer' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:37:7: 'integer'
            {
            match("integer"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:38:7: ( 'decimal' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:38:7: 'decimal'
            {
            match("decimal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:430:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:430:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:430:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:430:4: '^'
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

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:430:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:436:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
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
                    new NoViableAltException("434:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:436:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:436:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
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
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:436:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:436:53: ~ ( '\\\\' | '\"' )
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
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:437:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:437:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
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
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:437:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:437:54: ~ ( '\\\\' | '\\'' )
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:443:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:443:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:443:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:443:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:443:9: ( '0' .. '9' )+
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
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:443:10: '0' .. '9'
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:449:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:449:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:449:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:455:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:455:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:455:8: ( options {greedy=false; } : . )*
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
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:455:36: .
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:461:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:461:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:461:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:461:8: ~ ( '\\n' | '\\r' )
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

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:461:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:461:22: '\\r'
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
        // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=23;
        switch ( input.LA(1) ) {
        case 'D':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='a') ) {
                int LA12_20 = input.LA(3);

                if ( (LA12_20=='t') ) {
                    int LA12_36 = input.LA(4);

                    if ( (LA12_36=='a') ) {
                        int LA12_50 = input.LA(5);

                        if ( (LA12_50=='C') ) {
                            int LA12_64 = input.LA(6);

                            if ( (LA12_64=='o') ) {
                                int LA12_78 = input.LA(7);

                                if ( (LA12_78=='n') ) {
                                    int LA12_90 = input.LA(8);

                                    if ( (LA12_90=='t') ) {
                                        int LA12_102 = input.LA(9);

                                        if ( (LA12_102=='r') ) {
                                            int LA12_112 = input.LA(10);

                                            if ( (LA12_112=='a') ) {
                                                int LA12_118 = input.LA(11);

                                                if ( (LA12_118=='c') ) {
                                                    int LA12_123 = input.LA(12);

                                                    if ( (LA12_123=='t') ) {
                                                        int LA12_127 = input.LA(13);

                                                        if ( ((LA12_127>='0' && LA12_127<='9')||(LA12_127>='A' && LA12_127<='Z')||LA12_127=='_'||(LA12_127>='a' && LA12_127<='z')) ) {
                                                            alt12=18;
                                                        }
                                                        else {
                                                            alt12=1;}
                                                    }
                                                    else {
                                                        alt12=18;}
                                                }
                                                else {
                                                    alt12=18;}
                                            }
                                            else {
                                                alt12=18;}
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
            }
            break;
        case 'f':
            {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='r') ) {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='o') ) {
                    int LA12_37 = input.LA(4);

                    if ( (LA12_37=='m') ) {
                        int LA12_51 = input.LA(5);

                        if ( ((LA12_51>='0' && LA12_51<='9')||(LA12_51>='A' && LA12_51<='Z')||LA12_51=='_'||(LA12_51>='a' && LA12_51<='z')) ) {
                            alt12=18;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA12_22 = input.LA(3);

                if ( (LA12_22=='p') ) {
                    int LA12_38 = input.LA(4);

                    if ( (LA12_38=='o') ) {
                        int LA12_52 = input.LA(5);

                        if ( (LA12_52=='r') ) {
                            int LA12_66 = input.LA(6);

                            if ( (LA12_66=='t') ) {
                                int LA12_79 = input.LA(7);

                                if ( ((LA12_79>='0' && LA12_79<='9')||(LA12_79>='A' && LA12_79<='Z')||LA12_79=='_'||(LA12_79>='a' && LA12_79<='z')) ) {
                                    alt12=18;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
                }
                break;
            case 'n':
                {
                int LA12_23 = input.LA(3);

                if ( (LA12_23=='t') ) {
                    int LA12_39 = input.LA(4);

                    if ( (LA12_39=='e') ) {
                        int LA12_53 = input.LA(5);

                        if ( (LA12_53=='g') ) {
                            int LA12_67 = input.LA(6);

                            if ( (LA12_67=='e') ) {
                                int LA12_80 = input.LA(7);

                                if ( (LA12_80=='r') ) {
                                    int LA12_92 = input.LA(8);

                                    if ( ((LA12_92>='0' && LA12_92<='9')||(LA12_92>='A' && LA12_92<='Z')||LA12_92=='_'||(LA12_92>='a' && LA12_92<='z')) ) {
                                        alt12=18;
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
                }
                break;
            default:
                alt12=18;}

            }
            break;
        case 'B':
            {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='u') ) {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='s') ) {
                    int LA12_40 = input.LA(4);

                    if ( (LA12_40=='i') ) {
                        int LA12_54 = input.LA(5);

                        if ( (LA12_54=='n') ) {
                            int LA12_68 = input.LA(6);

                            if ( (LA12_68=='e') ) {
                                int LA12_81 = input.LA(7);

                                if ( (LA12_81=='s') ) {
                                    int LA12_93 = input.LA(8);

                                    if ( (LA12_93=='s') ) {
                                        int LA12_104 = input.LA(9);

                                        if ( (LA12_104=='C') ) {
                                            int LA12_113 = input.LA(10);

                                            if ( (LA12_113=='l') ) {
                                                int LA12_119 = input.LA(11);

                                                if ( (LA12_119=='a') ) {
                                                    int LA12_124 = input.LA(12);

                                                    if ( (LA12_124=='s') ) {
                                                        int LA12_128 = input.LA(13);

                                                        if ( (LA12_128=='s') ) {
                                                            int LA12_131 = input.LA(14);

                                                            if ( (LA12_131=='D') ) {
                                                                int LA12_133 = input.LA(15);

                                                                if ( (LA12_133=='t') ) {
                                                                    int LA12_135 = input.LA(16);

                                                                    if ( (LA12_135=='o') ) {
                                                                        int LA12_137 = input.LA(17);

                                                                        if ( ((LA12_137>='0' && LA12_137<='9')||(LA12_137>='A' && LA12_137<='Z')||LA12_137=='_'||(LA12_137>='a' && LA12_137<='z')) ) {
                                                                            alt12=18;
                                                                        }
                                                                        else {
                                                                            alt12=4;}
                                                                    }
                                                                    else {
                                                                        alt12=18;}
                                                                }
                                                                else {
                                                                    alt12=18;}
                                                            }
                                                            else {
                                                                alt12=18;}
                                                        }
                                                        else {
                                                            alt12=18;}
                                                    }
                                                    else {
                                                        alt12=18;}
                                                }
                                                else {
                                                    alt12=18;}
                                            }
                                            else {
                                                alt12=18;}
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
            }
            break;
        case 'b':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='o') ) {
                    int LA12_41 = input.LA(4);

                    if ( (LA12_41=='l') ) {
                        int LA12_55 = input.LA(5);

                        if ( (LA12_55=='e') ) {
                            int LA12_69 = input.LA(6);

                            if ( (LA12_69=='a') ) {
                                int LA12_82 = input.LA(7);

                                if ( (LA12_82=='n') ) {
                                    int LA12_94 = input.LA(8);

                                    if ( ((LA12_94>='0' && LA12_94<='9')||(LA12_94>='A' && LA12_94<='Z')||LA12_94=='_'||(LA12_94>='a' && LA12_94<='z')) ) {
                                        alt12=18;
                                    }
                                    else {
                                        alt12=13;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
                }
                break;
            case 'a':
                {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='s') ) {
                    int LA12_42 = input.LA(4);

                    if ( (LA12_42=='e') ) {
                        int LA12_56 = input.LA(5);

                        if ( ((LA12_56>='0' && LA12_56<='9')||(LA12_56>='A' && LA12_56<='Z')||LA12_56=='_'||(LA12_56>='a' && LA12_56<='z')) ) {
                            alt12=18;
                        }
                        else {
                            alt12=5;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
                }
                break;
            default:
                alt12=18;}

            }
            break;
        case '[':
            {
            alt12=6;
            }
            break;
        case 'r':
            {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='e') ) {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='f') ) {
                    int LA12_43 = input.LA(4);

                    if ( (LA12_43=='e') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='r') ) {
                            int LA12_71 = input.LA(6);

                            if ( (LA12_71=='e') ) {
                                int LA12_83 = input.LA(7);

                                if ( (LA12_83=='n') ) {
                                    int LA12_95 = input.LA(8);

                                    if ( (LA12_95=='c') ) {
                                        int LA12_106 = input.LA(9);

                                        if ( (LA12_106=='e') ) {
                                            int LA12_114 = input.LA(10);

                                            if ( (LA12_114=='s') ) {
                                                int LA12_120 = input.LA(11);

                                                if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                                                    alt12=18;
                                                }
                                                else {
                                                    alt12=7;}
                                            }
                                            else {
                                                alt12=18;}
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
            }
            break;
        case ']':
            {
            alt12=8;
            }
            break;
        case 'E':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='n') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='u') ) {
                    int LA12_44 = input.LA(4);

                    if ( (LA12_44=='m') ) {
                        int LA12_58 = input.LA(5);

                        if ( (LA12_58=='e') ) {
                            int LA12_72 = input.LA(6);

                            if ( (LA12_72=='r') ) {
                                int LA12_84 = input.LA(7);

                                if ( (LA12_84=='a') ) {
                                    int LA12_96 = input.LA(8);

                                    if ( (LA12_96=='t') ) {
                                        int LA12_107 = input.LA(9);

                                        if ( (LA12_107=='i') ) {
                                            int LA12_115 = input.LA(10);

                                            if ( (LA12_115=='o') ) {
                                                int LA12_121 = input.LA(11);

                                                if ( (LA12_121=='n') ) {
                                                    int LA12_126 = input.LA(12);

                                                    if ( (LA12_126=='D') ) {
                                                        int LA12_129 = input.LA(13);

                                                        if ( (LA12_129=='t') ) {
                                                            int LA12_132 = input.LA(14);

                                                            if ( (LA12_132=='o') ) {
                                                                int LA12_134 = input.LA(15);

                                                                if ( ((LA12_134>='0' && LA12_134<='9')||(LA12_134>='A' && LA12_134<='Z')||LA12_134=='_'||(LA12_134>='a' && LA12_134<='z')) ) {
                                                                    alt12=18;
                                                                }
                                                                else {
                                                                    alt12=9;}
                                                            }
                                                            else {
                                                                alt12=18;}
                                                        }
                                                        else {
                                                            alt12=18;}
                                                    }
                                                    else {
                                                        alt12=18;}
                                                }
                                                else {
                                                    alt12=18;}
                                            }
                                            else {
                                                alt12=18;}
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
            }
            break;
        case ';':
            {
            alt12=10;
            }
            break;
        case 'L':
            {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='i') ) {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='s') ) {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='t') ) {
                        int LA12_59 = input.LA(5);

                        if ( (LA12_59=='D') ) {
                            int LA12_73 = input.LA(6);

                            if ( (LA12_73=='t') ) {
                                int LA12_85 = input.LA(7);

                                if ( (LA12_85=='o') ) {
                                    int LA12_97 = input.LA(8);

                                    if ( ((LA12_97>='0' && LA12_97<='9')||(LA12_97>='A' && LA12_97<='Z')||LA12_97=='_'||(LA12_97>='a' && LA12_97<='z')) ) {
                                        alt12=18;
                                    }
                                    else {
                                        alt12=11;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
            }
            break;
        case 'C':
            {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='u') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='s') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='t') ) {
                        int LA12_60 = input.LA(5);

                        if ( (LA12_60=='o') ) {
                            int LA12_74 = input.LA(6);

                            if ( (LA12_74=='m') ) {
                                int LA12_86 = input.LA(7);

                                if ( (LA12_86=='D') ) {
                                    int LA12_98 = input.LA(8);

                                    if ( (LA12_98=='t') ) {
                                        int LA12_109 = input.LA(9);

                                        if ( (LA12_109=='o') ) {
                                            int LA12_116 = input.LA(10);

                                            if ( ((LA12_116>='0' && LA12_116<='9')||(LA12_116>='A' && LA12_116<='Z')||LA12_116=='_'||(LA12_116>='a' && LA12_116<='z')) ) {
                                                alt12=18;
                                            }
                                            else {
                                                alt12=12;}
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
            }
            break;
        case 's':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='t') ) {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='r') ) {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='i') ) {
                        int LA12_61 = input.LA(5);

                        if ( (LA12_61=='n') ) {
                            int LA12_75 = input.LA(6);

                            if ( (LA12_75=='g') ) {
                                int LA12_87 = input.LA(7);

                                if ( ((LA12_87>='0' && LA12_87<='9')||(LA12_87>='A' && LA12_87<='Z')||LA12_87=='_'||(LA12_87>='a' && LA12_87<='z')) ) {
                                    alt12=18;
                                }
                                else {
                                    alt12=14;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
            }
            break;
        case 'd':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='c') ) {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='i') ) {
                        int LA12_62 = input.LA(5);

                        if ( (LA12_62=='m') ) {
                            int LA12_76 = input.LA(6);

                            if ( (LA12_76=='a') ) {
                                int LA12_88 = input.LA(7);

                                if ( (LA12_88=='l') ) {
                                    int LA12_100 = input.LA(8);

                                    if ( ((LA12_100>='0' && LA12_100<='9')||(LA12_100>='A' && LA12_100<='Z')||LA12_100=='_'||(LA12_100>='a' && LA12_100<='z')) ) {
                                        alt12=18;
                                    }
                                    else {
                                        alt12=17;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
                }
                break;
            case 'a':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='t') ) {
                    int LA12_49 = input.LA(4);

                    if ( (LA12_49=='e') ) {
                        int LA12_63 = input.LA(5);

                        if ( (LA12_63=='t') ) {
                            int LA12_77 = input.LA(6);

                            if ( (LA12_77=='i') ) {
                                int LA12_89 = input.LA(7);

                                if ( (LA12_89=='m') ) {
                                    int LA12_101 = input.LA(8);

                                    if ( (LA12_101=='e') ) {
                                        int LA12_111 = input.LA(9);

                                        if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
                                            alt12=18;
                                        }
                                        else {
                                            alt12=15;}
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
                }
                break;
            default:
                alt12=18;}

            }
            break;
        case 'A':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
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
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=18;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=19;
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
            alt12=20;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=21;
            }
            break;
        case '/':
            {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='*') ) {
                alt12=22;
            }
            else if ( (LA12_19=='/') ) {
                alt12=23;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 19, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:78: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:86: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:98: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:107: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:115: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:1:131: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}