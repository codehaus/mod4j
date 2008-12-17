// $ANTLR 3.0 ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g 2008-12-16 12:59:15

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'Service'", "'for'", "'reference'", "'create'", "'read'", "'update'", "'delete'", "'add'", "'remove'", "'from'", "'import'", "'method'", "'in'", "'out'", "';'", "'crud'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public ServiceDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[30+1];
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
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:126:1: ruleServiceModel returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* ( (temp_crudServices= ruleCrudService ) | (temp_methods= ruleServiceMethod ) )* ) ;
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
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:127:4: ( ( (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* ( (temp_crudServices= ruleCrudService ) | (temp_methods= ruleServiceMethod ) )* ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:127:4: ( (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* ( (temp_crudServices= ruleCrudService ) | (temp_methods= ruleServiceMethod ) )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ServiceModel");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:131:1: ( (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* ( (temp_crudServices= ruleCrudService ) | (temp_methods= ruleServiceMethod ) )* )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:131:2: (temp_description= RULE_STRING )? ( 'Service' ) (temp_name= RULE_ID ) (temp_dtoReferences= ruleDtoReference )* ( (temp_crudServices= ruleCrudService ) | (temp_methods= ruleServiceMethod ) )*
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

                if ( (LA2_0==RULE_STRING) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==19) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==19) ) {
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

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:142:1: ( (temp_crudServices= ruleCrudService ) | (temp_methods= ruleServiceMethod ) )*
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_STRING||LA3_2==11||(LA3_2>=13 && LA3_2<=16)||LA3_2==21) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==25) ) {
                        alt3=1;
                    }


                    }
                    break;
                case 25:
                    {
                    alt3=1;
                    }
                    break;
                case 11:
                case 13:
                case 14:
                case 15:
                case 16:
                case 21:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:142:2: (temp_crudServices= ruleCrudService )
            	    {
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:142:2: (temp_crudServices= ruleCrudService )
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:142:3: temp_crudServices= ruleCrudService
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleCrudService_in_ruleServiceModel136);
            	    temp_crudServices=ruleCrudService();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"crudServices",convert(temp_crudServices),false); ptm.ruleFinished(temp_crudServices,end()); 
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:145:1: (temp_methods= ruleServiceMethod )
            	    {
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:145:1: (temp_methods= ruleServiceMethod )
            	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:145:2: temp_methods= ruleServiceMethod
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleServiceMethod_in_ruleServiceModel149);
            	    temp_methods=ruleServiceMethod();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"methods",convert(temp_methods),false); ptm.ruleFinished(temp_methods,end()); 
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
            if ( backtracking>0 ) { memoize(input, 2, ruleServiceModel_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleServiceModel


    // $ANTLR start ruleAssociationMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:151:1: ruleAssociationMethod returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'for' ) (temp_main= RULE_ID ) ( 'reference' ) (temp_rolename= RULE_ID ) (temp_type= ruleAssociationMethodType ) (temp_part= RULE_ID ) ) ;
    public EObject ruleAssociationMethod() throws RecognitionException {
        EObject result = null;
        int ruleAssociationMethod_StartIndex = input.index();
        Token temp_description=null;
        Token temp_main=null;
        Token temp_rolename=null;
        Token temp_part=null;
        Object temp_type = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:152:4: ( ( (temp_description= RULE_STRING )? ( 'for' ) (temp_main= RULE_ID ) ( 'reference' ) (temp_rolename= RULE_ID ) (temp_type= ruleAssociationMethodType ) (temp_part= RULE_ID ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:152:4: ( (temp_description= RULE_STRING )? ( 'for' ) (temp_main= RULE_ID ) ( 'reference' ) (temp_rolename= RULE_ID ) (temp_type= ruleAssociationMethodType ) (temp_part= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AssociationMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:156:1: ( (temp_description= RULE_STRING )? ( 'for' ) (temp_main= RULE_ID ) ( 'reference' ) (temp_rolename= RULE_ID ) (temp_type= ruleAssociationMethodType ) (temp_part= RULE_ID ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:156:2: (temp_description= RULE_STRING )? ( 'for' ) (temp_main= RULE_ID ) ( 'reference' ) (temp_rolename= RULE_ID ) (temp_type= ruleAssociationMethodType ) (temp_part= RULE_ID )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:156:2: (temp_description= RULE_STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:156:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociationMethod181); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:159:1: ( 'for' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:159:2: 'for'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleAssociationMethod191); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:161:1: (temp_main= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:161:2: temp_main= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_main=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationMethod200); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"main",convert(temp_main),true); ptm.ruleFinished(temp_main,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:165:1: ( 'reference' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:165:2: 'reference'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleAssociationMethod210); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:167:1: (temp_rolename= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:167:2: temp_rolename= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_rolename=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationMethod219); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"rolename",convert(temp_rolename),false); ptm.ruleFinished(temp_rolename,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:170:1: (temp_type= ruleAssociationMethodType )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:170:2: temp_type= ruleAssociationMethodType
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            pushFollow(FOLLOW_ruleAssociationMethodType_in_ruleAssociationMethod230);
            temp_type=ruleAssociationMethodType();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:173:1: (temp_part= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:173:2: temp_part= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            temp_part=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationMethod241); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"part",convert(temp_part),true); ptm.ruleFinished(temp_part,end()); 
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
            if ( backtracking>0 ) { memoize(input, 3, ruleAssociationMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAssociationMethod


    // $ANTLR start ruleSpecialMethodType
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:179:1: ruleSpecialMethodType returns [Object r] : ( 'create' | 'read' | 'update' | 'delete' );
    public Object ruleSpecialMethodType() throws RecognitionException {
        Object r = null;
        int ruleSpecialMethodType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return r; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:180:4: ( 'create' | 'read' | 'update' | 'delete' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("179:1: ruleSpecialMethodType returns [Object r] : ( 'create' | 'read' | 'update' | 'delete' );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:180:4: 'create'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    match(input,13,FOLLOW_13_in_ruleSpecialMethodType269); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","CREATE"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:183:7: 'read'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(2)),line(),start());
                    }
                    match(input,14,FOLLOW_14_in_ruleSpecialMethodType287); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","READ"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:186:7: 'update'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(3)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleSpecialMethodType305); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","UPDATE"),end());
                    }

                    }
                    break;
                case 4 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:189:7: 'delete'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(4)),line(),start());
                    }
                    match(input,16,FOLLOW_16_in_ruleSpecialMethodType323); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","DELETE"),end());
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
            if ( backtracking>0 ) { memoize(input, 4, ruleSpecialMethodType_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleSpecialMethodType


    // $ANTLR start ruleAssociationMethodType
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:194:1: ruleAssociationMethodType returns [Object r] : ( 'add' | 'remove' );
    public Object ruleAssociationMethodType() throws RecognitionException {
        Object r = null;
        int ruleAssociationMethodType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return r; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:195:4: ( 'add' | 'remove' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("194:1: ruleAssociationMethodType returns [Object r] : ( 'add' | 'remove' );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:195:4: 'add'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleAssociationMethodType349); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","ADDTO"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:198:7: 'remove'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(2)),line(),start());
                    }
                    match(input,18,FOLLOW_18_in_ruleAssociationMethodType367); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","REMOVEFROM"),end());
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
            if ( backtracking>0 ) { memoize(input, 5, ruleAssociationMethodType_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleAssociationMethodType


    // $ANTLR start ruleDtoReference
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:203:1: ruleDtoReference returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDtoReference() throws RecognitionException {
        EObject result = null;
        int ruleDtoReference_StartIndex = input.index();
        Token temp_description=null;
        Token temp_modelname=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:204:4: ( ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:204:4: ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:208:1: ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:208:2: (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:208:2: (temp_description= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:208:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoReference395); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:211:1: ( 'from' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:211:2: 'from'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,19,FOLLOW_19_in_ruleDtoReference405); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:213:1: (temp_modelname= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:213:2: temp_modelname= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_modelname=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference414); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"modelname",convert(temp_modelname),false); ptm.ruleFinished(temp_modelname,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:216:1: ( 'import' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:216:2: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,20,FOLLOW_20_in_ruleDtoReference423); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:218:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:218:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference432); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 6, ruleDtoReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoReference


    // $ANTLR start ruleServiceMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:223:1: ruleServiceMethod returns [EObject result] : ( (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) | (temp_AssociationMethod= ruleAssociationMethod ) ) ) ;
    public EObject ruleServiceMethod() throws RecognitionException {
        EObject result = null;
        int ruleServiceMethod_StartIndex = input.index();
        Token temp_description=null;
        EObject temp_CustomMethod = null;

        EObject temp_SpecialMethod = null;

        EObject temp_AssociationMethod = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:224:4: ( ( (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) | (temp_AssociationMethod= ruleAssociationMethod ) ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:224:4: ( (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) | (temp_AssociationMethod= ruleAssociationMethod ) ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ServiceMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:1: ( (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) | (temp_AssociationMethod= ruleAssociationMethod ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:2: (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) | (temp_AssociationMethod= ruleAssociationMethod ) )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:2: (temp_description= RULE_STRING )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred11()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceMethod461); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:231:1: ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) | (temp_AssociationMethod= ruleAssociationMethod ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt9=1;
                    }
                    break;
                case 11:
                    {
                    alt9=3;
                    }
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("231:1: ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) | (temp_AssociationMethod= ruleAssociationMethod ) )", 9, 1, input);

                    throw nvae;
                }

                }
                break;
            case 21:
                {
                alt9=1;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt9=2;
                }
                break;
            case 11:
                {
                alt9=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("231:1: ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) | (temp_AssociationMethod= ruleAssociationMethod ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:231:2: (temp_CustomMethod= ruleCustomMethod )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:231:2: (temp_CustomMethod= ruleCustomMethod )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:231:3: temp_CustomMethod= ruleCustomMethod
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleCustomMethod_in_ruleServiceMethod475);
                    temp_CustomMethod=ruleCustomMethod();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_CustomMethod;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:235:1: (temp_SpecialMethod= ruleSpecialMethod )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:235:1: (temp_SpecialMethod= ruleSpecialMethod )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:235:2: temp_SpecialMethod= ruleSpecialMethod
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleSpecialMethod_in_ruleServiceMethod490);
                    temp_SpecialMethod=ruleSpecialMethod();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_SpecialMethod;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:239:1: (temp_AssociationMethod= ruleAssociationMethod )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:239:1: (temp_AssociationMethod= ruleAssociationMethod )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:239:2: temp_AssociationMethod= ruleAssociationMethod
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleAssociationMethod_in_ruleServiceMethod505);
                    temp_AssociationMethod=ruleAssociationMethod();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_AssociationMethod;
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
            if ( backtracking>0 ) { memoize(input, 7, ruleServiceMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleServiceMethod


    // $ANTLR start ruleCustomMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:246:1: ruleCustomMethod returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) ) ;
    public EObject ruleCustomMethod() throws RecognitionException {
        EObject result = null;
        int ruleCustomMethod_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_output=null;
        EObject temp_inParameters = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:247:4: ( ( (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:247:4: ( (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CustomMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:1: ( (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:2: (temp_description= RULE_STRING )? ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:2: (temp_description= RULE_STRING )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomMethod537); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:254:1: ( 'method' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:254:2: 'method'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,21,FOLLOW_21_in_ruleCustomMethod547); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:256:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:256:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod556); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:259:1: ( ( 'in' ) (temp_inParameters= ruleParameter )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:259:2: ( 'in' ) (temp_inParameters= ruleParameter )*
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:259:2: ( 'in' )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:259:3: 'in'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    match(input,22,FOLLOW_22_in_ruleCustomMethod566); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:261:1: (temp_inParameters= ruleParameter )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:261:2: temp_inParameters= ruleParameter
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleCustomMethod575);
                    	    temp_inParameters=ruleParameter();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      factory.add(result,"inParameters",convert(temp_inParameters),false); ptm.ruleFinished(temp_inParameters,end()); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:265:1: ( ( 'out' ) (temp_output= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:265:2: ( 'out' ) (temp_output= RULE_ID )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:265:2: ( 'out' )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:265:3: 'out'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,23,FOLLOW_23_in_ruleCustomMethod589); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:267:1: (temp_output= RULE_ID )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:267:2: temp_output= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_output=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod598); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"output",convert(temp_output),true); ptm.ruleFinished(temp_output,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:272:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:272:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,24,FOLLOW_24_in_ruleCustomMethod611); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 8, ruleCustomMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCustomMethod


    // $ANTLR start ruleParameter
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:276:1: ruleParameter returns [EObject result] : ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) ) ;
    public EObject ruleParameter() throws RecognitionException {
        EObject result = null;
        int ruleParameter_StartIndex = input.index();
        Token temp_type=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:277:4: ( ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:277:4: ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Parameter");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:281:1: ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:281:2: (temp_type= RULE_ID ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:281:2: (temp_type= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:281:3: temp_type= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_type=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter638); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),true); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:285:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:285:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter650); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 9, ruleParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start ruleSpecialMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:290:1: ruleSpecialMethod returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_type= ruleSpecialMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) ;
    public EObject ruleSpecialMethod() throws RecognitionException {
        EObject result = null;
        int ruleSpecialMethod_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_dto=null;
        Object temp_type = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:291:4: ( ( (temp_description= RULE_STRING )? (temp_type= ruleSpecialMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:291:4: ( (temp_description= RULE_STRING )? (temp_type= ruleSpecialMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "SpecialMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:295:1: ( (temp_description= RULE_STRING )? (temp_type= ruleSpecialMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:295:2: (temp_description= RULE_STRING )? (temp_type= ruleSpecialMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:295:2: (temp_description= RULE_STRING )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:295:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialMethod679); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:298:1: (temp_type= ruleSpecialMethodType )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:298:2: temp_type= ruleSpecialMethodType
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            pushFollow(FOLLOW_ruleSpecialMethodType_in_ruleSpecialMethod691);
            temp_type=ruleSpecialMethodType();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:301:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:301:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialMethod702); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:304:1: ( 'for' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:304:2: 'for'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleSpecialMethod711); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:306:1: (temp_dto= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:306:2: temp_dto= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_dto=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialMethod720); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dto",convert(temp_dto),true); ptm.ruleFinished(temp_dto,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:310:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:310:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,24,FOLLOW_24_in_ruleSpecialMethod730); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 10, ruleSpecialMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSpecialMethod


    // $ANTLR start ruleCrudService
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:314:1: ruleCrudService returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) ;
    public EObject ruleCrudService() throws RecognitionException {
        EObject result = null;
        int ruleCrudService_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_dto=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:315:4: ( ( (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:315:4: ( (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CrudService");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:319:1: ( (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:319:2: (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:319:2: (temp_description= RULE_STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:319:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCrudService757); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:322:1: (temp_name= 'crud' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:322:2: temp_name= 'crud'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleCrudService769); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:325:1: ( 'for' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:325:2: 'for'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleCrudService778); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:327:1: (temp_dto= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:327:2: temp_dto= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_dto=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCrudService787); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dto",convert(temp_dto),true); ptm.ruleFinished(temp_dto,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:331:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:331:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,24,FOLLOW_24_in_ruleCrudService797); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 11, ruleCrudService_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCrudService

    // $ANTLR start synpred11
    public void synpred11_fragment() throws RecognitionException {   
        // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:3: ( RULE_STRING )
        // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:3: RULE_STRING
        {
        if ( backtracking==0 ) {
          ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
        }
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred11461); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleServiceModel_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceModel93 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleServiceModel103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceModel112 = new BitSet(new long[]{0x000000000229E812L});
    public static final BitSet FOLLOW_ruleDtoReference_in_ruleServiceModel123 = new BitSet(new long[]{0x000000000229E812L});
    public static final BitSet FOLLOW_ruleCrudService_in_ruleServiceModel136 = new BitSet(new long[]{0x000000000221E812L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_ruleServiceModel149 = new BitSet(new long[]{0x000000000221E812L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociationMethod181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleAssociationMethod191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationMethod200 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssociationMethod210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationMethod219 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleAssociationMethodType_in_ruleAssociationMethod230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationMethod241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSpecialMethodType269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSpecialMethodType287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSpecialMethodType305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSpecialMethodType323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAssociationMethodType349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssociationMethodType367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoReference395 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDtoReference405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference414 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDtoReference423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceMethod461 = new BitSet(new long[]{0x000000000021E810L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_ruleServiceMethod475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_ruleServiceMethod490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationMethod_in_ruleServiceMethod505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomMethod537 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCustomMethod547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod556 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_22_in_ruleCustomMethod566 = new BitSet(new long[]{0x0000000001800020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomMethod575 = new BitSet(new long[]{0x0000000001800020L});
    public static final BitSet FOLLOW_23_in_ruleCustomMethod589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod598 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCustomMethod611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialMethod679 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_ruleSpecialMethodType_in_ruleSpecialMethod691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialMethod702 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSpecialMethod711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialMethod720 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSpecialMethod730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCrudService757 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCrudService769 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCrudService778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCrudService787 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCrudService797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred11461 = new BitSet(new long[]{0x0000000000000002L});

}