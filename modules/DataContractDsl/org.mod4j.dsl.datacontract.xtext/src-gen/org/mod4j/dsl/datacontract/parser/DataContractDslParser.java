// $ANTLR 3.0 ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g 2008-09-09 14:56:42

package org.mod4j.dsl.datacontract.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.dsl.datacontract.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DataContractDslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'DataContract'", "'import'", "'DomainDto'", "'base'", "'['", "']'", "'ListDto'", "'CustomDto'", "';'", "'boolean'", "'string'"
    };
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=7;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;

        public DataContractDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[19+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g"; }



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
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:122:1: parse returns [Node r] : result= ruleDataContractModel EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:123:3: (result= ruleDataContractModel EOF )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:123:3: result= ruleDataContractModel EOF
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
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:126:1: ruleDataContractModel returns [EObject result] : ( ( 'DataContract' ) (temp_name= RULE_ID ) (temp_domainClasses= ruleDomainClassReference )* (temp_dtos= ruleDto )* ) ;
    public EObject ruleDataContractModel() throws RecognitionException {
        EObject result = null;
        int ruleDataContractModel_StartIndex = input.index();
        Token temp_name=null;
        EObject temp_domainClasses = null;

        EObject temp_dtos = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:127:4: ( ( ( 'DataContract' ) (temp_name= RULE_ID ) (temp_domainClasses= ruleDomainClassReference )* (temp_dtos= ruleDto )* ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:127:4: ( ( 'DataContract' ) (temp_name= RULE_ID ) (temp_domainClasses= ruleDomainClassReference )* (temp_dtos= ruleDto )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DataContractModel");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:131:1: ( ( 'DataContract' ) (temp_name= RULE_ID ) (temp_domainClasses= ruleDomainClassReference )* (temp_dtos= ruleDto )* )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:131:2: ( 'DataContract' ) (temp_name= RULE_ID ) (temp_domainClasses= ruleDomainClassReference )* (temp_dtos= ruleDto )*
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:131:2: ( 'DataContract' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:131:3: 'DataContract'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,10,FOLLOW_10_in_ruleDataContractModel91); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:133:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:133:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataContractModel100); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:136:1: (temp_domainClasses= ruleDomainClassReference )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:136:2: temp_domainClasses= ruleDomainClassReference
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleDomainClassReference_in_ruleDataContractModel111);
            	    temp_domainClasses=ruleDomainClassReference();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"domainClasses",convert(temp_domainClasses),false); ptm.ruleFinished(temp_domainClasses,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:139:1: (temp_dtos= ruleDto )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||(LA2_0>=16 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:139:2: temp_dtos= ruleDto
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleDto_in_ruleDataContractModel123);
            	    temp_dtos=ruleDto();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"dtos",convert(temp_dtos),false); ptm.ruleFinished(temp_dtos,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:144:1: ruleDto returns [EObject result] : (temp_domainclassdto= ruleDomainClassDto | temp_listdto= ruleListDto | temp_customdto= ruleCustomDto );
    public EObject ruleDto() throws RecognitionException {
        EObject result = null;
        int ruleDto_StartIndex = input.index();
        EObject temp_domainclassdto = null;

        EObject temp_listdto = null;

        EObject temp_customdto = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:145:9: (temp_domainclassdto= ruleDomainClassDto | temp_listdto= ruleListDto | temp_customdto= ruleCustomDto )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("144:1: ruleDto returns [EObject result] : (temp_domainclassdto= ruleDomainClassDto | temp_listdto= ruleListDto | temp_customdto= ruleCustomDto );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:145:9: temp_domainclassdto= ruleDomainClassDto
                    {
                    pushFollow(FOLLOW_ruleDomainClassDto_in_ruleDto153);
                    temp_domainclassdto=ruleDomainClassDto();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_domainclassdto;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:145:88: temp_listdto= ruleListDto
                    {
                    pushFollow(FOLLOW_ruleListDto_in_ruleDto168);
                    temp_listdto=ruleListDto();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_listdto;
                    }

                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:145:146: temp_customdto= ruleCustomDto
                    {
                    pushFollow(FOLLOW_ruleCustomDto_in_ruleDto183);
                    temp_customdto=ruleCustomDto();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_customdto;
                    }

                    }
                    break;

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


    // $ANTLR start ruleDomainClassReference
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:147:1: ruleDomainClassReference returns [EObject result] : ( ( 'import' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDomainClassReference() throws RecognitionException {
        EObject result = null;
        int ruleDomainClassReference_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:148:4: ( ( ( 'import' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:148:4: ( ( 'import' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DomainClassReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:152:1: ( ( 'import' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:152:2: ( 'import' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:152:2: ( 'import' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:152:3: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleDomainClassReference206); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:154:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:154:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainClassReference215); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 4, ruleDomainClassReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDomainClassReference


    // $ANTLR start ruleDomainClassDto
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:159:1: ruleDomainClassDto returns [EObject result] : ( ( 'DomainDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' ) ) ;
    public EObject ruleDomainClassDto() throws RecognitionException {
        EObject result = null;
        int ruleDomainClassDto_StartIndex = input.index();
        Token temp_name=null;
        Token temp_base=null;
        EObject temp_properties = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:160:4: ( ( ( 'DomainDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:160:4: ( ( 'DomainDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DomainClassDto");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:164:1: ( ( 'DomainDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:164:2: ( 'DomainDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_base= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:164:2: ( 'DomainDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:164:3: 'DomainDto'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleDomainClassDto242); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:166:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:166:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainClassDto251); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:169:1: ( 'base' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:169:2: 'base'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleDomainClassDto260); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:171:1: (temp_base= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:171:2: temp_base= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_base=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainClassDto269); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"base",convert(temp_base),true); ptm.ruleFinished(temp_base,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:175:1: ( '[' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:175:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleDomainClassDto279); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:177:1: (temp_properties= ruleProperty )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||(LA4_0>=19 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:177:2: temp_properties= ruleProperty
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(5)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleDomainClassDto288);
            	    temp_properties=ruleProperty();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"properties",convert(temp_properties),false); ptm.ruleFinished(temp_properties,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:180:1: ( ']' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:180:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleDomainClassDto298); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 5, ruleDomainClassDto_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDomainClassDto


    // $ANTLR start ruleListDto
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:184:1: ruleListDto returns [EObject result] : ( ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID ) ) ;
    public EObject ruleListDto() throws RecognitionException {
        EObject result = null;
        int ruleListDto_StartIndex = input.index();
        Token temp_name=null;
        Token temp_baseDto=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:185:4: ( ( ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:185:4: ( ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ListDto");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:189:1: ( ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:189:2: ( 'ListDto' ) (temp_name= RULE_ID ) ( 'base' ) (temp_baseDto= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:189:2: ( 'ListDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:189:3: 'ListDto'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,16,FOLLOW_16_in_ruleListDto323); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:191:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:191:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListDto332); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:194:1: ( 'base' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:194:2: 'base'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleListDto341); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:196:1: (temp_baseDto= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:196:2: temp_baseDto= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_baseDto=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListDto350); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 6, ruleListDto_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleListDto


    // $ANTLR start ruleCustomDto
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:202:1: ruleCustomDto returns [EObject result] : ( ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' ) ) ;
    public EObject ruleCustomDto() throws RecognitionException {
        EObject result = null;
        int ruleCustomDto_StartIndex = input.index();
        Token temp_name=null;
        EObject temp_properties = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:203:4: ( ( ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:203:4: ( ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CustomDto");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:207:1: ( ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:207:2: ( 'CustomDto' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= ruleProperty )* ( ']' )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:207:2: ( 'CustomDto' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:207:3: 'CustomDto'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleCustomDto378); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:209:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:209:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomDto387); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:212:1: ( '[' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:212:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleCustomDto396); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:214:1: (temp_properties= ruleProperty )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||(LA5_0>=19 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:214:2: temp_properties= ruleProperty
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleCustomDto405);
            	    temp_properties=ruleProperty();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"properties",convert(temp_properties),false); ptm.ruleFinished(temp_properties,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:217:1: ( ']' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:217:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleCustomDto415); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 7, ruleCustomDto_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCustomDto


    // $ANTLR start ruleProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:221:1: ruleProperty returns [EObject result] : ( ( (temp_BooleanProperty= ruleBooleanProperty ) | (temp_StringProperty= ruleStringProperty ) ) ( ';' ) ) ;
    public EObject ruleProperty() throws RecognitionException {
        EObject result = null;
        int ruleProperty_StartIndex = input.index();
        EObject temp_BooleanProperty = null;

        EObject temp_StringProperty = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:222:4: ( ( ( (temp_BooleanProperty= ruleBooleanProperty ) | (temp_StringProperty= ruleStringProperty ) ) ( ';' ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:222:4: ( ( (temp_BooleanProperty= ruleBooleanProperty ) | (temp_StringProperty= ruleStringProperty ) ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Property");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:226:1: ( ( (temp_BooleanProperty= ruleBooleanProperty ) | (temp_StringProperty= ruleStringProperty ) ) ( ';' ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:226:2: ( (temp_BooleanProperty= ruleBooleanProperty ) | (temp_StringProperty= ruleStringProperty ) ) ( ';' )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:226:2: ( (temp_BooleanProperty= ruleBooleanProperty ) | (temp_StringProperty= ruleStringProperty ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20) ) {
                    alt6=2;
                }
                else if ( (LA6_1==19) ) {
                    alt6=1;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("226:2: ( (temp_BooleanProperty= ruleBooleanProperty ) | (temp_StringProperty= ruleStringProperty ) )", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("226:2: ( (temp_BooleanProperty= ruleBooleanProperty ) | (temp_StringProperty= ruleStringProperty ) )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:226:3: (temp_BooleanProperty= ruleBooleanProperty )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:226:3: (temp_BooleanProperty= ruleBooleanProperty )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:226:4: temp_BooleanProperty= ruleBooleanProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleBooleanProperty_in_ruleProperty444);
                    temp_BooleanProperty=ruleBooleanProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_BooleanProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:230:1: (temp_StringProperty= ruleStringProperty )
                    {
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:230:1: (temp_StringProperty= ruleStringProperty )
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:230:2: temp_StringProperty= ruleStringProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleStringProperty_in_ruleProperty459);
                    temp_StringProperty=ruleStringProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_StringProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:235:1: ( ';' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:235:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleProperty471); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 8, ruleProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start ruleBooleanProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:239:1: ruleBooleanProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleBooleanProperty() throws RecognitionException {
        EObject result = null;
        int ruleBooleanProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:240:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:240:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BooleanProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:244:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:244:2: (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:244:2: (temp_description= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:244:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBooleanProperty498); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:247:1: (temp_dataType= 'boolean' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:247:2: temp_dataType= 'boolean'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleBooleanProperty510); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:250:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:250:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanProperty521); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 9, ruleBooleanProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBooleanProperty


    // $ANTLR start ruleStringProperty
    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:255:1: ruleStringProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleStringProperty() throws RecognitionException {
        EObject result = null;
        int ruleStringProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:256:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:256:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StringProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:260:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:260:2: (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:260:2: (temp_description= RULE_STRING )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:260:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty550); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:263:1: (temp_dataType= 'string' )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:263:2: temp_dataType= 'string'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_ruleStringProperty562); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:266:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.datacontract.xtext/src-gen//org/mod4j/dsl/datacontract/parser/DataContractDsl.g:266:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringProperty573); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 10, ruleStringProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStringProperty


 

    public static final BitSet FOLLOW_ruleDataContractModel_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDataContractModel91 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataContractModel100 = new BitSet(new long[]{0x0000000000031802L});
    public static final BitSet FOLLOW_ruleDomainClassReference_in_ruleDataContractModel111 = new BitSet(new long[]{0x0000000000031802L});
    public static final BitSet FOLLOW_ruleDto_in_ruleDataContractModel123 = new BitSet(new long[]{0x0000000000031002L});
    public static final BitSet FOLLOW_ruleDomainClassDto_in_ruleDto153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListDto_in_ruleDto168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_ruleDto183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDomainClassReference206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainClassReference215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDomainClassDto242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainClassDto251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDomainClassDto260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainClassDto269 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDomainClassDto279 = new BitSet(new long[]{0x0000000000188020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleDomainClassDto288 = new BitSet(new long[]{0x0000000000188020L});
    public static final BitSet FOLLOW_15_in_ruleDomainClassDto298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleListDto323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListDto332 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleListDto341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListDto350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCustomDto378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomDto387 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomDto396 = new BitSet(new long[]{0x0000000000188020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleCustomDto405 = new BitSet(new long[]{0x0000000000188020L});
    public static final BitSet FOLLOW_15_in_ruleCustomDto415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanProperty_in_ruleProperty444 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleStringProperty_in_ruleProperty459 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProperty471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBooleanProperty498 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanProperty510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanProperty521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty550 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStringProperty562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringProperty573 = new BitSet(new long[]{0x0000000000000002L});

}