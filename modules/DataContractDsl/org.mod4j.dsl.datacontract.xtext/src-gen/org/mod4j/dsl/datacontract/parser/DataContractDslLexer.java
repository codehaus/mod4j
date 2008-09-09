// $ANTLR 3.0 ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g 2008-09-09 14:56:42

package org.mod4j.dsl.datacontract.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DataContractDslLexer extends Lexer {
    public static final int RULE_ML_COMMENT=8;
    public static final int T14=14;
    public static final int RULE_ID=4;
    public static final int T11=11;
    public static final int RULE_STRING=5;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T18=18;
    public static final int RULE_WS=7;
    public static final int T15=15;
    public static final int RULE_INT=6;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=21;
    public static final int T16=16;
    public static final int RULE_SL_COMMENT=9;
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
    public String getGrammarFileName() { return "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:22:7: ( 'DataContract' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:22:7: 'DataContract'
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:23:7: ( 'import' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:23:7: 'import'
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:24:7: ( 'DomainDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:24:7: 'DomainDto'
            {
            match("DomainDto"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:25:7: ( 'base' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:25:7: 'base'
            {
            match("base"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:26:7: ( '[' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:26:7: '['
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:27:7: ( ']' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:27:7: ']'
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:28:7: ( 'ListDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:28:7: 'ListDto'
            {
            match("ListDto"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:29:7: ( 'CustomDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:29:7: 'CustomDto'
            {
            match("CustomDto"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:30:7: ( ';' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:30:7: ';'
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
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:31:7: ( 'boolean' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:31:7: 'boolean'
            {
            match("boolean"); 


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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:32:7: ( 'string' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:32:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:273:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:273:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:273:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:273:4: '^'
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

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:273:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:279:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
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
                    new NoViableAltException("277:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:279:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:279:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
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
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:279:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:279:53: ~ ( '\\\\' | '\"' )
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
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:280:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:280:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
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
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:280:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:280:54: ~ ( '\\\\' | '\\'' )
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:286:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:286:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:286:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:286:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:286:9: ( '0' .. '9' )+
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
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:286:10: '0' .. '9'
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:292:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:292:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:292:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:298:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:298:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:298:8: ( options {greedy=false; } : . )*
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
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:298:36: .
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
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:304:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:304:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:304:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:304:8: ~ ( '\\n' | '\\r' )
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

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:304:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:304:22: '\\r'
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
        // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=17;
        switch ( input.LA(1) ) {
        case 'D':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_15 = input.LA(3);

                if ( (LA12_15=='m') ) {
                    int LA12_25 = input.LA(4);

                    if ( (LA12_25=='a') ) {
                        int LA12_33 = input.LA(5);

                        if ( (LA12_33=='i') ) {
                            int LA12_41 = input.LA(6);

                            if ( (LA12_41=='n') ) {
                                int LA12_49 = input.LA(7);

                                if ( (LA12_49=='D') ) {
                                    int LA12_56 = input.LA(8);

                                    if ( (LA12_56=='t') ) {
                                        int LA12_63 = input.LA(9);

                                        if ( (LA12_63=='o') ) {
                                            int LA12_68 = input.LA(10);

                                            if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                                                alt12=12;
                                            }
                                            else {
                                                alt12=3;}
                                        }
                                        else {
                                            alt12=12;}
                                    }
                                    else {
                                        alt12=12;}
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
                }
                break;
            case 'a':
                {
                int LA12_16 = input.LA(3);

                if ( (LA12_16=='t') ) {
                    int LA12_26 = input.LA(4);

                    if ( (LA12_26=='a') ) {
                        int LA12_34 = input.LA(5);

                        if ( (LA12_34=='C') ) {
                            int LA12_42 = input.LA(6);

                            if ( (LA12_42=='o') ) {
                                int LA12_50 = input.LA(7);

                                if ( (LA12_50=='n') ) {
                                    int LA12_57 = input.LA(8);

                                    if ( (LA12_57=='t') ) {
                                        int LA12_64 = input.LA(9);

                                        if ( (LA12_64=='r') ) {
                                            int LA12_69 = input.LA(10);

                                            if ( (LA12_69=='a') ) {
                                                int LA12_72 = input.LA(11);

                                                if ( (LA12_72=='c') ) {
                                                    int LA12_74 = input.LA(12);

                                                    if ( (LA12_74=='t') ) {
                                                        int LA12_75 = input.LA(13);

                                                        if ( ((LA12_75>='0' && LA12_75<='9')||(LA12_75>='A' && LA12_75<='Z')||LA12_75=='_'||(LA12_75>='a' && LA12_75<='z')) ) {
                                                            alt12=12;
                                                        }
                                                        else {
                                                            alt12=1;}
                                                    }
                                                    else {
                                                        alt12=12;}
                                                }
                                                else {
                                                    alt12=12;}
                                            }
                                            else {
                                                alt12=12;}
                                        }
                                        else {
                                            alt12=12;}
                                    }
                                    else {
                                        alt12=12;}
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
                }
                break;
            default:
                alt12=12;}

            }
            break;
        case 'i':
            {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='m') ) {
                int LA12_17 = input.LA(3);

                if ( (LA12_17=='p') ) {
                    int LA12_27 = input.LA(4);

                    if ( (LA12_27=='o') ) {
                        int LA12_35 = input.LA(5);

                        if ( (LA12_35=='r') ) {
                            int LA12_43 = input.LA(6);

                            if ( (LA12_43=='t') ) {
                                int LA12_51 = input.LA(7);

                                if ( ((LA12_51>='0' && LA12_51<='9')||(LA12_51>='A' && LA12_51<='Z')||LA12_51=='_'||(LA12_51>='a' && LA12_51<='z')) ) {
                                    alt12=12;
                                }
                                else {
                                    alt12=2;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
            }
            break;
        case 'b':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_18 = input.LA(3);

                if ( (LA12_18=='o') ) {
                    int LA12_28 = input.LA(4);

                    if ( (LA12_28=='l') ) {
                        int LA12_36 = input.LA(5);

                        if ( (LA12_36=='e') ) {
                            int LA12_44 = input.LA(6);

                            if ( (LA12_44=='a') ) {
                                int LA12_52 = input.LA(7);

                                if ( (LA12_52=='n') ) {
                                    int LA12_59 = input.LA(8);

                                    if ( ((LA12_59>='0' && LA12_59<='9')||(LA12_59>='A' && LA12_59<='Z')||LA12_59=='_'||(LA12_59>='a' && LA12_59<='z')) ) {
                                        alt12=12;
                                    }
                                    else {
                                        alt12=10;}
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
                }
                break;
            case 'a':
                {
                int LA12_19 = input.LA(3);

                if ( (LA12_19=='s') ) {
                    int LA12_29 = input.LA(4);

                    if ( (LA12_29=='e') ) {
                        int LA12_37 = input.LA(5);

                        if ( ((LA12_37>='0' && LA12_37<='9')||(LA12_37>='A' && LA12_37<='Z')||LA12_37=='_'||(LA12_37>='a' && LA12_37<='z')) ) {
                            alt12=12;
                        }
                        else {
                            alt12=4;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
                }
                break;
            default:
                alt12=12;}

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
        case 'L':
            {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='i') ) {
                int LA12_20 = input.LA(3);

                if ( (LA12_20=='s') ) {
                    int LA12_30 = input.LA(4);

                    if ( (LA12_30=='t') ) {
                        int LA12_38 = input.LA(5);

                        if ( (LA12_38=='D') ) {
                            int LA12_46 = input.LA(6);

                            if ( (LA12_46=='t') ) {
                                int LA12_53 = input.LA(7);

                                if ( (LA12_53=='o') ) {
                                    int LA12_60 = input.LA(8);

                                    if ( ((LA12_60>='0' && LA12_60<='9')||(LA12_60>='A' && LA12_60<='Z')||LA12_60=='_'||(LA12_60>='a' && LA12_60<='z')) ) {
                                        alt12=12;
                                    }
                                    else {
                                        alt12=7;}
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
            }
            break;
        case 'C':
            {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='u') ) {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='s') ) {
                    int LA12_31 = input.LA(4);

                    if ( (LA12_31=='t') ) {
                        int LA12_39 = input.LA(5);

                        if ( (LA12_39=='o') ) {
                            int LA12_47 = input.LA(6);

                            if ( (LA12_47=='m') ) {
                                int LA12_54 = input.LA(7);

                                if ( (LA12_54=='D') ) {
                                    int LA12_61 = input.LA(8);

                                    if ( (LA12_61=='t') ) {
                                        int LA12_67 = input.LA(9);

                                        if ( (LA12_67=='o') ) {
                                            int LA12_70 = input.LA(10);

                                            if ( ((LA12_70>='0' && LA12_70<='9')||(LA12_70>='A' && LA12_70<='Z')||LA12_70=='_'||(LA12_70>='a' && LA12_70<='z')) ) {
                                                alt12=12;
                                            }
                                            else {
                                                alt12=8;}
                                        }
                                        else {
                                            alt12=12;}
                                    }
                                    else {
                                        alt12=12;}
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
            }
            break;
        case ';':
            {
            alt12=9;
            }
            break;
        case 's':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='t') ) {
                int LA12_22 = input.LA(3);

                if ( (LA12_22=='r') ) {
                    int LA12_32 = input.LA(4);

                    if ( (LA12_32=='i') ) {
                        int LA12_40 = input.LA(5);

                        if ( (LA12_40=='n') ) {
                            int LA12_48 = input.LA(6);

                            if ( (LA12_48=='g') ) {
                                int LA12_55 = input.LA(7);

                                if ( ((LA12_55>='0' && LA12_55<='9')||(LA12_55>='A' && LA12_55<='Z')||LA12_55=='_'||(LA12_55>='a' && LA12_55<='z')) ) {
                                    alt12=12;
                                }
                                else {
                                    alt12=11;}
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=12;}
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=12;}
            }
            else {
                alt12=12;}
            }
            break;
        case 'A':
        case 'B':
        case 'E':
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
        case 'd':
        case 'e':
        case 'f':
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
        case 'r':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=12;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=13;
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
            alt12=14;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=15;
            }
            break;
        case '/':
            {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='*') ) {
                alt12=16;
            }
            else if ( (LA12_14=='/') ) {
                alt12=17;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 14, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:54: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:62: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:74: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:83: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:91: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:1:107: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}