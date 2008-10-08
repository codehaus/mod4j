// $ANTLR 3.0 ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g 2008-10-08 08:09:07

package org.mod4j.dsl.datacontract.xtext.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.dsl.datacontract.xtext.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DataContractDslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'DataContract'", "'from'", "'import'", "'BusinessClassDto'", "'base'", "'['", "'references'", "']'", "'EnumerationDto'", "';'", "'ListDto'", "'CustomDto'", "'boolean'", "'string'", "'datetime'", "'integer'", "'decimal'"
    };
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_ID=5;
    public static final int RULE_WS=7;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;

        public DataContractDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[36+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g"; }



    	private Token getLastToken() {
    		return input.LT(-1);
    	}
    	private Token getNextToken() {
    		return input.LT(1);
    	}

    	private int line() {
    		Token t = getNextToken();
    		if (t==null)
    			return 1;
    		return t.getLine();
    	}

    	private int start() {
    		Token t = getNextToken();
    		if (t==null)
    			return 0;
    		if (t instanceof CommonToken) {
    			return ((CommonToken)t).getStartIndex();
    		}
    		return t.getTokenIndex();
    	}

    	private int end() {
    		Token t = getLastToken();
    		if (t==null)
    			return 1;
    		if (t instanceof CommonToken) {
    			return ((CommonToken)t).getStopIndex()+1;
    		}
    		return t.getTokenIndex();
    	}

    	protected Object convert(Object arg) {
    		if (arg instanceof org.antlr.runtime.Token) {
    			Token t = (Token) arg;
    			String s = t.getText();
    			if (t.getType() == DataContractDslLexer.RULE_ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==DataContractDslLexer.RULE_STRING) {
    				return s.substring(1,s.length()-1);
    			} else if (t.getType()==DataContractDslLexer.RULE_INT) {
    				return Integer.valueOf(s);
    			}
    			return s;
    		}
    		return arg;
    	}


    	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
        private ParseTreeManager ptm = new ParseTreeManager();
    	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
    	
    	{
    			factory.addImport("", "http://www.mod4j.org/datacontract");
    		
    	}

    	public ParseTreeManager getResult() {
    		return ptm;
    	}

    	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	@Override
    		public void reportError(RecognitionException e) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    			ptm.addError(msg, e);
    			ptm.ruleFinished(null, end());
    		}




    // $ANTLR start parse
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:122:1: parse returns [Node r] : result= ruleDataContractModel EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:123:3: (result= ruleDataContractModel EOF )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:123:3: result= ruleDataContractModel EOF
            {
            pushFollow(FOLLOW_ruleDataContractModel_in_parse67);
            result=ruleDataContractModel();
            _fsp--;
            if (failed) return r;
            match(input,EOF,FOLLOW_EOF_in_parse69); if (failed) return r;
            if ( backtracking==0 ) {
              ptm.ruleFinished(result,end());r = ptm.getCurrent();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start ruleDataContractModel
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:126:1: ruleDataContractModel returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'DataContract' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_dtos= ruleDto )* (temp_enumerations= ruleEnumerationDto )* ) ;
    public EObject ruleDataContractModel() throws RecognitionException {
        EObject result = null;
        int ruleDataContractModel_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        EObject temp_externalReferences = null;

        EObject temp_dtos = null;

        EObject temp_enumerations = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:127:4: ( ( (temp_description= RULE_STRING )? ( 'DataContract' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_dtos= ruleDto )* (temp_enumerations= ruleEnumerationDto )* ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:127:4: ( (temp_description= RULE_STRING )? ( 'DataContract' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_dtos= ruleDto )* (temp_enumerations= ruleEnumerationDto )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DataContractModel");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:131:1: ( (temp_description= RULE_STRING )? ( 'DataContract' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_dtos= ruleDto )* (temp_enumerations= ruleEnumerationDto )* )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:131:2: (temp_description= RULE_STRING )? ( 'DataContract' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_dtos= ruleDto )* (temp_enumerations= ruleEnumerationDto )*
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:131:2: (temp_description= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:131:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataContractModel93); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:134:1: ( 'DataContract' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:134:2: 'DataContract'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,10,FOLLOW_10_in_ruleDataContractModel103); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:136:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:136:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataContractModel112); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:139:1: (temp_externalReferences= ruleExternalReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==11) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:139:2: temp_externalReferences= ruleExternalReference
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleExternalReference_in_ruleDataContractModel123);
            	    temp_externalReferences=ruleExternalReference();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"externalReferences",convert(temp_externalReferences),false); ptm.ruleFinished(temp_externalReferences,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:142:1: (temp_dtos= ruleDto )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==13||(LA3_0>=20 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:142:2: temp_dtos= ruleDto
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleDto_in_ruleDataContractModel135);
            	    temp_dtos=ruleDto();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"dtos",convert(temp_dtos),false); ptm.ruleFinished(temp_dtos,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:145:1: (temp_enumerations= ruleEnumerationDto )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:145:2: temp_enumerations= ruleEnumerationDto
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleEnumerationDto_in_ruleDataContractModel147);
            	    temp_enumerations=ruleEnumerationDto();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"enumerations",convert(temp_enumerations),false); ptm.ruleFinished(temp_enumerations,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, ruleDataContractModel_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDataContractModel


    // $ANTLR start ruleDto
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:150:1: ruleDto returns [EObject result] : ( (temp_description= RULE_STRING )? ( (temp_BusinessClassDto= ruleBusinessClassDto ) | (temp_ListDto= ruleListDto ) | (temp_CustomDto= ruleCustomDto ) ) ) ;
    public EObject ruleDto() throws RecognitionException {
        EObject result = null;
        int ruleDto_StartIndex = input.index();
        Token temp_description=null;
        EObject temp_BusinessClassDto = null;

        EObject temp_ListDto = null;

        EObject temp_CustomDto = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:151:4: ( ( (temp_description= RULE_STRING )? ( (temp_BusinessClassDto= ruleBusinessClassDto ) | (temp_ListDto= ruleListDto ) | (temp_CustomDto= ruleCustomDto ) ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:151:4: ( (temp_description= RULE_STRING )? ( (temp_BusinessClassDto= ruleBusinessClassDto ) | (temp_ListDto= ruleListDto ) | (temp_CustomDto= ruleCustomDto ) ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Dto");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:155:1: ( (temp_description= RULE_STRING )? ( (temp_BusinessClassDto= ruleBusinessClassDto ) | (temp_ListDto= ruleListDto ) | (temp_CustomDto= ruleCustomDto ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:155:2: (temp_description= RULE_STRING )? ( (temp_BusinessClassDto= ruleBusinessClassDto ) | (temp_ListDto= ruleListDto ) | (temp_CustomDto= ruleCustomDto ) )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:155:2: (temp_description= RULE_STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:155:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDto177); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:158:1: ( (temp_BusinessClassDto= ruleBusinessClassDto ) | (temp_ListDto= ruleListDto ) | (temp_CustomDto= ruleCustomDto ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("158:1: ( (temp_BusinessClassDto= ruleBusinessClassDto ) | (temp_ListDto= ruleListDto ) | (temp_CustomDto= ruleCustomDto ) )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:158:2: (temp_BusinessClassDto= ruleBusinessClassDto )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:158:2: (temp_BusinessClassDto= ruleBusinessClassDto )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:158:3: temp_BusinessClassDto= ruleBusinessClassDto
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleBusinessClassDto_in_ruleDto191);
                    temp_BusinessClassDto=ruleBusinessClassDto();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_BusinessClassDto;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:162:1: (temp_ListDto= ruleListDto )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:162:1: (temp_ListDto= ruleListDto )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:162:2: temp_ListDto= ruleListDto
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleListDto_in_ruleDto206);
                    temp_ListDto=ruleListDto();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_ListDto;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:166:1: (temp_CustomDto= ruleCustomDto )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:166:1: (temp_CustomDto= ruleCustomDto )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:166:2: temp_CustomDto= ruleCustomDto
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleCustomDto_in_ruleDto221);
                    temp_CustomDto=ruleCustomDto();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_CustomDto;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, ruleDto_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDto


    // $ANTLR start ruleExternalReference
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:173:1: ruleExternalReference returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleExternalReference() throws RecognitionException {
        EObject result = null;
        int ruleExternalReference_StartIndex = input.index();
        Token temp_description=null;
        Token temp_modelname=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:174:4: ( ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:174:4: ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ExternalReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:178:1: ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:178:2: (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:178:2: (temp_description= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:178:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExternalReference253); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:181:1: ( 'from' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:181:2: 'from'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleExternalReference263); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:183:1: (temp_modelname= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:183:2: temp_modelname= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_modelname=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference272); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"modelname",convert(temp_modelname),false); ptm.ruleFinished(temp_modelname,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:186:1: ( 'import' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:186:2: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleExternalReference281); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:188:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:188:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference290); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, ruleExternalReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleExternalReference


    // $ANTLR start ruleBusinessClassDto
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:193:1: ruleBusinessClassDto returns [EObject result] : ( ( 'BusinessClassDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( ( '[' ) (temp_propertyReferences= ruleBusinessClassPropertyReference )+ ( ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' ) )? ( ']' ) )? ) ;
    public EObject ruleBusinessClassDto() throws RecognitionException {
        EObject result = null;
        int ruleBusinessClassDto_StartIndex = input.index();
        Token temp_name=null;
        Token temp_base=null;
        EObject temp_propertyReferences = null;

        EObject temp_associationReferences = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:194:4: ( ( ( 'BusinessClassDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( ( '[' ) (temp_propertyReferences= ruleBusinessClassPropertyReference )+ ( ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' ) )? ( ']' ) )? ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:194:4: ( ( 'BusinessClassDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( ( '[' ) (temp_propertyReferences= ruleBusinessClassPropertyReference )+ ( ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' ) )? ( ']' ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessClassDto");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:198:1: ( ( 'BusinessClassDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( ( '[' ) (temp_propertyReferences= ruleBusinessClassPropertyReference )+ ( ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' ) )? ( ']' ) )? )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:198:2: ( 'BusinessClassDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( ( '[' ) (temp_propertyReferences= ruleBusinessClassPropertyReference )+ ( ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' ) )? ( ']' ) )?
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:198:2: ( 'BusinessClassDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:198:3: 'BusinessClassDto'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleBusinessClassDto317); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:200:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:200:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassDto326); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:203:1: ( 'base' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:203:2: 'base'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleBusinessClassDto335); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:205:1: (temp_base= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:205:2: temp_base= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_base=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassDto344); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"base",convert(temp_base),true); ptm.ruleFinished(temp_base,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:209:1: ( ( '[' ) (temp_propertyReferences= ruleBusinessClassPropertyReference )+ ( ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' ) )? ( ']' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:209:2: ( '[' ) (temp_propertyReferences= ruleBusinessClassPropertyReference )+ ( ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' ) )? ( ']' )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:209:2: ( '[' )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:209:3: '['
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleBusinessClassDto355); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:211:1: (temp_propertyReferences= ruleBusinessClassPropertyReference )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:211:2: temp_propertyReferences= ruleBusinessClassPropertyReference
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_ruleBusinessClassDto364);
                    	    temp_propertyReferences=ruleBusinessClassPropertyReference();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      factory.add(result,"propertyReferences",convert(temp_propertyReferences),false); ptm.ruleFinished(temp_propertyReferences,end()); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (backtracking>0) {failed=true; return result;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:214:1: ( ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==16) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:214:2: ( 'references' ) ( '[' ) (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+ ( ']' )
                            {
                            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:214:2: ( 'references' )
                            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:214:3: 'references'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(2)).eContents().get(0)),line(),start());
                            }
                            match(input,16,FOLLOW_16_in_ruleBusinessClassDto375); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }

                            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:216:1: ( '[' )
                            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:216:2: '['
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(2)).eContents().get(1)),line(),start());
                            }
                            match(input,15,FOLLOW_15_in_ruleBusinessClassDto382); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }

                            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:218:1: (temp_associationReferences= ruleBusinessClassAssociationRoleReference )+
                            int cnt9=0;
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==RULE_ID) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:218:2: temp_associationReferences= ruleBusinessClassAssociationRoleReference
                            	    {
                            	    if ( backtracking==0 ) {
                            	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(2)).eContents().get(2)),line(),start());
                            	    }
                            	    pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_ruleBusinessClassDto391);
                            	    temp_associationReferences=ruleBusinessClassAssociationRoleReference();
                            	    _fsp--;
                            	    if (failed) return result;
                            	    if ( backtracking==0 ) {
                            	      factory.add(result,"associationReferences",convert(temp_associationReferences),false); ptm.ruleFinished(temp_associationReferences,end()); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt9 >= 1 ) break loop9;
                            	    if (backtracking>0) {failed=true; return result;}
                                        EarlyExitException eee =
                                            new EarlyExitException(9, input);
                                        throw eee;
                                }
                                cnt9++;
                            } while (true);

                            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:221:1: ( ']' )
                            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:221:2: ']'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(2)).eContents().get(3)),line(),start());
                            }
                            match(input,17,FOLLOW_17_in_ruleBusinessClassDto401); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }


                            }
                            break;

                    }

                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:224:1: ( ']' )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:224:2: ']'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(3)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleBusinessClassDto411); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, ruleBusinessClassDto_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessClassDto


    // $ANTLR start ruleEnumerationDto
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:229:1: ruleEnumerationDto returns [EObject result] : ( ( 'EnumerationDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ) ;
    public EObject ruleEnumerationDto() throws RecognitionException {
        EObject result = null;
        int ruleEnumerationDto_StartIndex = input.index();
        Token temp_name=null;
        Token temp_base=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:230:4: ( ( ( 'EnumerationDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:230:4: ( ( 'EnumerationDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "EnumerationDto");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:234:1: ( ( 'EnumerationDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:234:2: ( 'EnumerationDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:234:2: ( 'EnumerationDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:234:3: 'EnumerationDto'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleEnumerationDto439); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:236:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:236:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationDto448); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:239:1: ( 'base' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:239:2: 'base'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleEnumerationDto457); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:241:1: (temp_base= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:241:2: temp_base= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_base=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationDto466); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"base",convert(temp_base),true); ptm.ruleFinished(temp_base,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, ruleEnumerationDto_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleEnumerationDto


    // $ANTLR start ruleBusinessClassPropertyReference
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:247:1: ruleBusinessClassPropertyReference returns [EObject result] : ( (temp_name= RULE_ID ) ( ';' ) ) ;
    public EObject ruleBusinessClassPropertyReference() throws RecognitionException {
        EObject result = null;
        int ruleBusinessClassPropertyReference_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:248:4: ( ( (temp_name= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:248:4: ( (temp_name= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessClassPropertyReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:252:1: ( (temp_name= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:252:2: (temp_name= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:252:2: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:252:3: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassPropertyReference496); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:255:1: ( ';' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:255:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,19,FOLLOW_19_in_ruleBusinessClassPropertyReference505); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, ruleBusinessClassPropertyReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessClassPropertyReference


    // $ANTLR start ruleBusinessClassAssociationRoleReference
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:259:1: ruleBusinessClassAssociationRoleReference returns [EObject result] : ( (temp_dtoType= RULE_ID ) (temp_name= RULE_ID ) ( ';' ) ) ;
    public EObject ruleBusinessClassAssociationRoleReference() throws RecognitionException {
        EObject result = null;
        int ruleBusinessClassAssociationRoleReference_StartIndex = input.index();
        Token temp_dtoType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:260:4: ( ( (temp_dtoType= RULE_ID ) (temp_name= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:260:4: ( (temp_dtoType= RULE_ID ) (temp_name= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessClassAssociationRoleReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:264:1: ( (temp_dtoType= RULE_ID ) (temp_name= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:264:2: (temp_dtoType= RULE_ID ) (temp_name= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:264:2: (temp_dtoType= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:264:3: temp_dtoType= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_dtoType=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference532); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dtoType",convert(temp_dtoType),true); ptm.ruleFinished(temp_dtoType,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:268:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:268:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference544); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:271:1: ( ';' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:271:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,19,FOLLOW_19_in_ruleBusinessClassAssociationRoleReference553); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, ruleBusinessClassAssociationRoleReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessClassAssociationRoleReference


    // $ANTLR start ruleListDto
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:275:1: ruleListDto returns [EObject result] : ( ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID ) ) ;
    public EObject ruleListDto() throws RecognitionException {
        EObject result = null;
        int ruleListDto_StartIndex = input.index();
        Token temp_name=null;
        Token temp_baseDto=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:276:4: ( ( ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:276:4: ( ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ListDto");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:280:1: ( ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:280:2: ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:280:2: ( 'ListDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:280:3: 'ListDto'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,20,FOLLOW_20_in_ruleListDto578); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:282:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:282:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListDto587); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:285:1: ( 'base' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:285:2: 'base'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleListDto596); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:287:1: (temp_baseDto= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:287:2: temp_baseDto= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_baseDto=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListDto605); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"baseDto",convert(temp_baseDto),true); ptm.ruleFinished(temp_baseDto,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, ruleListDto_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleListDto


    // $ANTLR start ruleCustomDto
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:293:1: ruleCustomDto returns [EObject result] : ( ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleDtoProperty )* ( ']' ) ) ;
    public EObject ruleCustomDto() throws RecognitionException {
        EObject result = null;
        int ruleCustomDto_StartIndex = input.index();
        Token temp_name=null;
        EObject temp_properties = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:294:4: ( ( ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleDtoProperty )* ( ']' ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:294:4: ( ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleDtoProperty )* ( ']' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CustomDto");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:298:1: ( ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleDtoProperty )* ( ']' ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:298:2: ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleDtoProperty )* ( ']' )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:298:2: ( 'CustomDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:298:3: 'CustomDto'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,21,FOLLOW_21_in_ruleCustomDto633); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:300:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:300:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomDto642); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:303:1: ( '[' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:303:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleCustomDto651); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:305:1: (temp_properties= ruleDtoProperty )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||(LA12_0>=22 && LA12_0<=26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:305:2: temp_properties= ruleDtoProperty
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleDtoProperty_in_ruleCustomDto660);
            	    temp_properties=ruleDtoProperty();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"properties",convert(temp_properties),false); ptm.ruleFinished(temp_properties,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:308:1: ( ']' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:308:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleCustomDto670); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, ruleCustomDto_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCustomDto


    // $ANTLR start ruleDtoProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:312:1: ruleDtoProperty returns [EObject result] : ( (temp_description= RULE_STRING )? ( (temp_DtoBooleanProperty= ruleDtoBooleanProperty ) | (temp_DtoStringProperty= ruleDtoStringProperty ) | (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty ) | (temp_DtoIntegerProperty= ruleDtoIntegerProperty ) | (temp_DtoDecimalProperty= ruleDtoDecimalProperty ) | (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty ) ) ( ';' ) ) ;
    public EObject ruleDtoProperty() throws RecognitionException {
        EObject result = null;
        int ruleDtoProperty_StartIndex = input.index();
        Token temp_description=null;
        EObject temp_DtoBooleanProperty = null;

        EObject temp_DtoStringProperty = null;

        EObject temp_DtoDateTimeProperty = null;

        EObject temp_DtoIntegerProperty = null;

        EObject temp_DtoDecimalProperty = null;

        EObject temp_DtoEnumerationProperty = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:313:4: ( ( (temp_description= RULE_STRING )? ( (temp_DtoBooleanProperty= ruleDtoBooleanProperty ) | (temp_DtoStringProperty= ruleDtoStringProperty ) | (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty ) | (temp_DtoIntegerProperty= ruleDtoIntegerProperty ) | (temp_DtoDecimalProperty= ruleDtoDecimalProperty ) | (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty ) ) ( ';' ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:313:4: ( (temp_description= RULE_STRING )? ( (temp_DtoBooleanProperty= ruleDtoBooleanProperty ) | (temp_DtoStringProperty= ruleDtoStringProperty ) | (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty ) | (temp_DtoIntegerProperty= ruleDtoIntegerProperty ) | (temp_DtoDecimalProperty= ruleDtoDecimalProperty ) | (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty ) ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:317:1: ( (temp_description= RULE_STRING )? ( (temp_DtoBooleanProperty= ruleDtoBooleanProperty ) | (temp_DtoStringProperty= ruleDtoStringProperty ) | (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty ) | (temp_DtoIntegerProperty= ruleDtoIntegerProperty ) | (temp_DtoDecimalProperty= ruleDtoDecimalProperty ) | (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty ) ) ( ';' ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:317:2: (temp_description= RULE_STRING )? ( (temp_DtoBooleanProperty= ruleDtoBooleanProperty ) | (temp_DtoStringProperty= ruleDtoStringProperty ) | (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty ) | (temp_DtoIntegerProperty= ruleDtoIntegerProperty ) | (temp_DtoDecimalProperty= ruleDtoDecimalProperty ) | (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty ) ) ( ';' )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:317:2: (temp_description= RULE_STRING )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:317:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoProperty697); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:320:1: ( (temp_DtoBooleanProperty= ruleDtoBooleanProperty ) | (temp_DtoStringProperty= ruleDtoStringProperty ) | (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty ) | (temp_DtoIntegerProperty= ruleDtoIntegerProperty ) | (temp_DtoDecimalProperty= ruleDtoDecimalProperty ) | (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt14=1;
                }
                break;
            case 23:
                {
                alt14=2;
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            case 25:
                {
                alt14=4;
                }
                break;
            case 26:
                {
                alt14=5;
                }
                break;
            case RULE_ID:
                {
                alt14=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("320:1: ( (temp_DtoBooleanProperty= ruleDtoBooleanProperty ) | (temp_DtoStringProperty= ruleDtoStringProperty ) | (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty ) | (temp_DtoIntegerProperty= ruleDtoIntegerProperty ) | (temp_DtoDecimalProperty= ruleDtoDecimalProperty ) | (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:320:2: (temp_DtoBooleanProperty= ruleDtoBooleanProperty )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:320:2: (temp_DtoBooleanProperty= ruleDtoBooleanProperty )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:320:3: temp_DtoBooleanProperty= ruleDtoBooleanProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDtoBooleanProperty_in_ruleDtoProperty711);
                    temp_DtoBooleanProperty=ruleDtoBooleanProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_DtoBooleanProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:324:1: (temp_DtoStringProperty= ruleDtoStringProperty )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:324:1: (temp_DtoStringProperty= ruleDtoStringProperty )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:324:2: temp_DtoStringProperty= ruleDtoStringProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDtoStringProperty_in_ruleDtoProperty726);
                    temp_DtoStringProperty=ruleDtoStringProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_DtoStringProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:328:1: (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:328:1: (temp_DtoDateTimeProperty= ruleDtoDateTimeProperty )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:328:2: temp_DtoDateTimeProperty= ruleDtoDateTimeProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_ruleDtoProperty741);
                    temp_DtoDateTimeProperty=ruleDtoDateTimeProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_DtoDateTimeProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 4 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:332:1: (temp_DtoIntegerProperty= ruleDtoIntegerProperty )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:332:1: (temp_DtoIntegerProperty= ruleDtoIntegerProperty )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:332:2: temp_DtoIntegerProperty= ruleDtoIntegerProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDtoIntegerProperty_in_ruleDtoProperty756);
                    temp_DtoIntegerProperty=ruleDtoIntegerProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_DtoIntegerProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 5 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:336:1: (temp_DtoDecimalProperty= ruleDtoDecimalProperty )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:336:1: (temp_DtoDecimalProperty= ruleDtoDecimalProperty )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:336:2: temp_DtoDecimalProperty= ruleDtoDecimalProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDtoDecimalProperty_in_ruleDtoProperty771);
                    temp_DtoDecimalProperty=ruleDtoDecimalProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_DtoDecimalProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 6 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:340:1: (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:340:1: (temp_DtoEnumerationProperty= ruleDtoEnumerationProperty )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:340:2: temp_DtoEnumerationProperty= ruleDtoEnumerationProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_ruleDtoProperty786);
                    temp_DtoEnumerationProperty=ruleDtoEnumerationProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_DtoEnumerationProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:345:1: ( ';' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:345:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,19,FOLLOW_19_in_ruleDtoProperty798); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, ruleDtoProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoProperty


    // $ANTLR start ruleDtoBooleanProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:349:1: ruleDtoBooleanProperty returns [EObject result] : ( (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDtoBooleanProperty() throws RecognitionException {
        EObject result = null;
        int ruleDtoBooleanProperty_StartIndex = input.index();
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:350:4: ( ( (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:350:4: ( (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoBooleanProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:354:1: ( (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:354:2: (temp_dataType= 'boolean' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:354:2: (temp_dataType= 'boolean' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:354:3: temp_dataType= 'boolean'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,22,FOLLOW_22_in_ruleDtoBooleanProperty825); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:357:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:357:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoBooleanProperty836); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, ruleDtoBooleanProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoBooleanProperty


    // $ANTLR start ruleDtoStringProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:362:1: ruleDtoStringProperty returns [EObject result] : ( (temp_dataType= 'string' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDtoStringProperty() throws RecognitionException {
        EObject result = null;
        int ruleDtoStringProperty_StartIndex = input.index();
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:363:4: ( ( (temp_dataType= 'string' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:363:4: ( (temp_dataType= 'string' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoStringProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:367:1: ( (temp_dataType= 'string' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:367:2: (temp_dataType= 'string' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:367:2: (temp_dataType= 'string' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:367:3: temp_dataType= 'string'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ruleDtoStringProperty865); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:370:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:370:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoStringProperty876); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, ruleDtoStringProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoStringProperty


    // $ANTLR start ruleDtoDateTimeProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:375:1: ruleDtoDateTimeProperty returns [EObject result] : ( (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDtoDateTimeProperty() throws RecognitionException {
        EObject result = null;
        int ruleDtoDateTimeProperty_StartIndex = input.index();
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:376:4: ( ( (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:376:4: ( (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoDateTimeProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:380:1: ( (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:380:2: (temp_dataType= 'datetime' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:380:2: (temp_dataType= 'datetime' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:380:3: temp_dataType= 'datetime'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleDtoDateTimeProperty905); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:383:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:383:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoDateTimeProperty916); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, ruleDtoDateTimeProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoDateTimeProperty


    // $ANTLR start ruleDtoIntegerProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:388:1: ruleDtoIntegerProperty returns [EObject result] : ( (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDtoIntegerProperty() throws RecognitionException {
        EObject result = null;
        int ruleDtoIntegerProperty_StartIndex = input.index();
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:389:4: ( ( (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:389:4: ( (temp_dataType= 'integer' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoIntegerProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:393:1: ( (temp_dataType= 'integer' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:393:2: (temp_dataType= 'integer' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:393:2: (temp_dataType= 'integer' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:393:3: temp_dataType= 'integer'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleDtoIntegerProperty945); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:396:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:396:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoIntegerProperty956); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, ruleDtoIntegerProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoIntegerProperty


    // $ANTLR start ruleDtoDecimalProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:401:1: ruleDtoDecimalProperty returns [EObject result] : ( (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDtoDecimalProperty() throws RecognitionException {
        EObject result = null;
        int ruleDtoDecimalProperty_StartIndex = input.index();
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:402:4: ( ( (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:402:4: ( (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoDecimalProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:406:1: ( (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:406:2: (temp_dataType= 'decimal' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:406:2: (temp_dataType= 'decimal' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:406:3: temp_dataType= 'decimal'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleDtoDecimalProperty985); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:409:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:409:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoDecimalProperty996); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, ruleDtoDecimalProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoDecimalProperty


    // $ANTLR start ruleDtoEnumerationProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:414:1: ruleDtoEnumerationProperty returns [EObject result] : ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDtoEnumerationProperty() throws RecognitionException {
        EObject result = null;
        int ruleDtoEnumerationProperty_StartIndex = input.index();
        Token temp_type=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:415:4: ( ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:415:4: ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoEnumerationProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:419:1: ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:419:2: (temp_type= RULE_ID ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:419:2: (temp_type= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:419:3: temp_type= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_type=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty1025); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),true); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:423:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/xtext/parser/DataContractDsl.g:423:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty1037); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, ruleDtoEnumerationProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoEnumerationProperty


 

    public static final BitSet FOLLOW_ruleDataContractModel_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataContractModel93 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleDataContractModel103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataContractModel112 = new BitSet(new long[]{0x0000000000342812L});
    public static final BitSet FOLLOW_ruleExternalReference_in_ruleDataContractModel123 = new BitSet(new long[]{0x0000000000342812L});
    public static final BitSet FOLLOW_ruleDto_in_ruleDataContractModel135 = new BitSet(new long[]{0x0000000000342012L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_ruleDataContractModel147 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDto177 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_ruleDto191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListDto_in_ruleDto206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_ruleDto221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExternalReference253 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleExternalReference263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBusinessClassDto317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassDto326 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBusinessClassDto335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassDto344 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleBusinessClassDto355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_ruleBusinessClassDto364 = new BitSet(new long[]{0x0000000000030020L});
    public static final BitSet FOLLOW_16_in_ruleBusinessClassDto375 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBusinessClassDto382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_ruleBusinessClassDto391 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleBusinessClassDto401 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBusinessClassDto411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnumerationDto439 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationDto448 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumerationDto457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationDto466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassPropertyReference496 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClassPropertyReference505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference544 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClassAssociationRoleReference553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleListDto578 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListDto587 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleListDto596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListDto605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCustomDto633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomDto642 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCustomDto651 = new BitSet(new long[]{0x0000000007C20030L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_ruleCustomDto660 = new BitSet(new long[]{0x0000000007C20030L});
    public static final BitSet FOLLOW_17_in_ruleCustomDto670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoProperty697 = new BitSet(new long[]{0x0000000007C00020L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_ruleDtoProperty711 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_ruleDtoProperty726 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_ruleDtoProperty741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_ruleDtoProperty756 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_ruleDtoProperty771 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_ruleDtoProperty786 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDtoProperty798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDtoBooleanProperty825 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoBooleanProperty836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDtoStringProperty865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoStringProperty876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDtoDateTimeProperty905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoDateTimeProperty916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDtoIntegerProperty945 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoIntegerProperty956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDtoDecimalProperty985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoDecimalProperty996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty1025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty1037 = new BitSet(new long[]{0x0000000000000002L});

}