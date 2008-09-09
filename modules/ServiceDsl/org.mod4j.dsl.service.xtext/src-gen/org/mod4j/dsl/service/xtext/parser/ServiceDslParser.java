// $ANTLR 3.0 ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g 2008-09-09 14:39:56

package org.mod4j.dsl.service.xtext.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.dsl.service.xtext.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ServiceDslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'Service'", "'end'", "'import'", "';'", "'method'", "'in'", "'out'", "'for'", "'crud'", "'create'", "'read'", "'update'", "'delete'", "'custom'"
    };
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_ID=5;
    public static final int RULE_WS=7;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;

        public ServiceDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[20+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g"; }



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
    			if (t.getType() == ServiceDslLexer.RULE_ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==ServiceDslLexer.RULE_STRING) {
    				return s.substring(1,s.length()-1);
    			} else if (t.getType()==ServiceDslLexer.RULE_INT) {
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
    			factory.addImport("", "http://www.mod4j.org/service");
    		
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
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:122:1: parse returns [Node r] : result= ruleServiceModel EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:123:3: (result= ruleServiceModel EOF )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:123:3: result= ruleServiceModel EOF
            {
            pushFollow(FOLLOW_ruleServiceModel_in_parse67);
            result=ruleServiceModel();
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


    // $ANTLR start ruleServiceModel
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:126:1: ruleServiceModel returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* (temp_crudServices= ruleCrudService )* (temp_methods= ruleServiceMethod )* ( 'end' ) ) ;
    public EObject ruleServiceModel() throws RecognitionException {
        EObject result = null;
        int ruleServiceModel_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        EObject temp_dtoReferences = null;

        EObject temp_crudServices = null;

        EObject temp_methods = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:127:4: ( ( (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* (temp_crudServices= ruleCrudService )* (temp_methods= ruleServiceMethod )* ( 'end' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:127:4: ( (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* (temp_crudServices= ruleCrudService )* (temp_methods= ruleServiceMethod )* ( 'end' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ServiceModel");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:131:1: ( (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* (temp_crudServices= ruleCrudService )* (temp_methods= ruleServiceMethod )* ( 'end' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:131:2: (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* (temp_crudServices= ruleCrudService )* (temp_methods= ruleServiceMethod )* ( 'end' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:131:2: (temp_description= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:131:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceModel93); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:134:1: ( 'Service' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:134:2: 'Service'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,10,FOLLOW_10_in_ruleServiceModel103); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:136:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:136:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceModel112); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:139:1: (temp_dtoReferences= ruleDtoReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:139:2: temp_dtoReferences= ruleDtoReference
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleDtoReference_in_ruleServiceModel123);
            	    temp_dtoReferences=ruleDtoReference();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"dtoReferences",convert(temp_dtoReferences),false); ptm.ruleFinished(temp_dtoReferences,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:142:1: (temp_crudServices= ruleCrudService )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:142:2: temp_crudServices= ruleCrudService
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleCrudService_in_ruleServiceModel135);
            	    temp_crudServices=ruleCrudService();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"crudServices",convert(temp_crudServices),false); ptm.ruleFinished(temp_crudServices,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:145:1: (temp_methods= ruleServiceMethod )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==14||(LA4_0>=19 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:145:2: temp_methods= ruleServiceMethod
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleServiceMethod_in_ruleServiceModel147);
            	    temp_methods=ruleServiceMethod();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"methods",convert(temp_methods),false); ptm.ruleFinished(temp_methods,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:148:1: ( 'end' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:148:2: 'end'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleServiceModel157); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 2, ruleServiceModel_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleServiceModel


    // $ANTLR start ruleDtoReference
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:152:1: ruleDtoReference returns [EObject result] : ( ( 'import' ) (temp_name= RULE_ID ) ( ';' ) ) ;
    public EObject ruleDtoReference() throws RecognitionException {
        EObject result = null;
        int ruleDtoReference_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:153:4: ( ( ( 'import' ) (temp_name= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:153:4: ( ( 'import' ) (temp_name= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:157:1: ( ( 'import' ) (temp_name= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:157:2: ( 'import' ) (temp_name= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:157:2: ( 'import' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:157:3: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleDtoReference182); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:159:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:159:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference191); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:162:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:162:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleDtoReference200); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 3, ruleDtoReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoReference


    // $ANTLR start ruleServiceMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:166:1: ruleServiceMethod returns [EObject result] : (temp_custommethod= ruleCustomMethod | temp_specialmethod= ruleSpecialMethod );
    public EObject ruleServiceMethod() throws RecognitionException {
        EObject result = null;
        int ruleServiceMethod_StartIndex = input.index();
        EObject temp_custommethod = null;

        EObject temp_specialmethod = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:167:9: (temp_custommethod= ruleCustomMethod | temp_specialmethod= ruleSpecialMethod )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING||LA5_0==14) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=19 && LA5_0<=23)) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("166:1: ruleServiceMethod returns [EObject result] : (temp_custommethod= ruleCustomMethod | temp_specialmethod= ruleSpecialMethod );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:167:9: temp_custommethod= ruleCustomMethod
                    {
                    pushFollow(FOLLOW_ruleCustomMethod_in_ruleServiceMethod227);
                    temp_custommethod=ruleCustomMethod();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_custommethod;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:167:82: temp_specialmethod= ruleSpecialMethod
                    {
                    pushFollow(FOLLOW_ruleSpecialMethod_in_ruleServiceMethod242);
                    temp_specialmethod=ruleSpecialMethod();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_specialmethod;
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
            if ( backtracking>0 ) { memoize(input, 4, ruleServiceMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleServiceMethod


    // $ANTLR start ruleCustomMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:169:1: ruleCustomMethod returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_input= RULE_ID ) )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) ) ;
    public EObject ruleCustomMethod() throws RecognitionException {
        EObject result = null;
        int ruleCustomMethod_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_input=null;
        Token temp_output=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:170:4: ( ( (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_input= RULE_ID ) )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:170:4: ( (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_input= RULE_ID ) )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CustomMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:174:1: ( (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_input= RULE_ID ) )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:174:2: (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_input= RULE_ID ) )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:174:2: (temp_description= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:174:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomMethod267); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:177:1: ( 'method' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:177:2: 'method'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleCustomMethod277); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:179:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:179:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod286); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:182:1: ( ( 'in' ) (temp_input= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:182:2: ( 'in' ) (temp_input= RULE_ID )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:182:2: ( 'in' )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:182:3: 'in'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleCustomMethod296); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:184:1: (temp_input= RULE_ID )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:184:2: temp_input= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_input=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod305); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"input",convert(temp_input),true); ptm.ruleFinished(temp_input,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:189:1: ( ( 'out' ) (temp_output= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:189:2: ( 'out' ) (temp_output= RULE_ID )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:189:2: ( 'out' )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:189:3: 'out'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,16,FOLLOW_16_in_ruleCustomMethod319); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:191:1: (temp_output= RULE_ID )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:191:2: temp_output= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_output=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod328); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"output",convert(temp_output),true); ptm.ruleFinished(temp_output,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:196:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:196:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleCustomMethod341); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 5, ruleCustomMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCustomMethod


    // $ANTLR start ruleSpecialMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:200:1: ruleSpecialMethod returns [EObject result] : ( (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) ;
    public EObject ruleSpecialMethod() throws RecognitionException {
        EObject result = null;
        int ruleSpecialMethod_StartIndex = input.index();
        Token temp_name=null;
        Token temp_dto=null;
        Object temp_type = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:201:4: ( ( (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:201:4: ( (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "SpecialMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:205:1: ( (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:205:2: (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:205:2: (temp_type= ruleMethodType )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:205:3: temp_type= ruleMethodType
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleMethodType_in_ruleSpecialMethod368);
            temp_type=ruleMethodType();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:208:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:208:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialMethod379); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:211:1: ( 'for' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:211:2: 'for'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleSpecialMethod388); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:213:1: (temp_dto= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:213:2: temp_dto= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_dto=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialMethod397); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dto",convert(temp_dto),true); ptm.ruleFinished(temp_dto,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:217:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:217:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleSpecialMethod407); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 6, ruleSpecialMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSpecialMethod


    // $ANTLR start ruleCrudService
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:221:1: ruleCrudService returns [EObject result] : ( ( 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) ;
    public EObject ruleCrudService() throws RecognitionException {
        EObject result = null;
        int ruleCrudService_StartIndex = input.index();
        Token temp_dto=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:222:4: ( ( ( 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:222:4: ( ( 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CrudService");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:226:1: ( ( 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:226:2: ( 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:226:2: ( 'crud' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:226:3: 'crud'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleCrudService432); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:1: ( 'for' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:2: 'for'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleCrudService439); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:230:1: (temp_dto= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:230:2: temp_dto= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_dto=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCrudService448); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dto",convert(temp_dto),true); ptm.ruleFinished(temp_dto,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:234:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:234:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleCrudService458); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 7, ruleCrudService_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCrudService


    // $ANTLR start ruleMethodType
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:238:1: ruleMethodType returns [Object r] : ( 'create' | 'read' | 'update' | 'delete' | 'custom' );
    public Object ruleMethodType() throws RecognitionException {
        Object r = null;
        int ruleMethodType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return r; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:239:4: ( 'create' | 'read' | 'update' | 'delete' | 'custom' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("238:1: ruleMethodType returns [Object r] : ( 'create' | 'read' | 'update' | 'delete' | 'custom' );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:239:4: 'create'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)),line(),start());
                    }
                    match(input,19,FOLLOW_19_in_ruleMethodType483); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","Create"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:242:7: 'read'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(2)),line(),start());
                    }
                    match(input,20,FOLLOW_20_in_ruleMethodType501); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","Read"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:245:7: 'update'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(3)),line(),start());
                    }
                    match(input,21,FOLLOW_21_in_ruleMethodType519); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","Update"),end());
                    }

                    }
                    break;
                case 4 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:248:7: 'delete'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(4)),line(),start());
                    }
                    match(input,22,FOLLOW_22_in_ruleMethodType537); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","Delete"),end());
                    }

                    }
                    break;
                case 5 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:7: 'custom'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(5)),line(),start());
                    }
                    match(input,23,FOLLOW_23_in_ruleMethodType555); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","Custom"),end());
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
            if ( backtracking>0 ) { memoize(input, 8, ruleMethodType_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleMethodType


 

    public static final BitSet FOLLOW_ruleServiceModel_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceModel93 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleServiceModel103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceModel112 = new BitSet(new long[]{0x0000000000FC5810L});
    public static final BitSet FOLLOW_ruleDtoReference_in_ruleServiceModel123 = new BitSet(new long[]{0x0000000000FC5810L});
    public static final BitSet FOLLOW_ruleCrudService_in_ruleServiceModel135 = new BitSet(new long[]{0x0000000000FC4810L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_ruleServiceModel147 = new BitSet(new long[]{0x0000000000F84810L});
    public static final BitSet FOLLOW_11_in_ruleServiceModel157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDtoReference182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference191 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDtoReference200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_ruleServiceMethod227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_ruleServiceMethod242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomMethod267 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCustomMethod277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod286 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_15_in_ruleCustomMethod296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod305 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleCustomMethod319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod328 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCustomMethod341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodType_in_ruleSpecialMethod368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialMethod379 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSpecialMethod388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialMethod397 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSpecialMethod407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCrudService432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCrudService439 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCrudService448 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCrudService458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMethodType483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMethodType501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMethodType519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMethodType537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMethodType555 = new BitSet(new long[]{0x0000000000000002L});

}