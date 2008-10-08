// $ANTLR 3.0 ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g 2008-10-08 08:57:10

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'Service'", "'create'", "'read'", "'update'", "'delete'", "'from'", "'import'", "'method'", "'in'", "'out'", "';'", "'for'", "'crud'"
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
            ruleMemo = new HashMap[23+1];
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

                    if ( (LA2_1==15) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==15) ) {
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

                    if ( ((LA3_2>=11 && LA3_2<=14)||LA3_2==17) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==22) ) {
                        alt3=1;
                    }


                    }
                    break;
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
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


    // $ANTLR start ruleMethodType
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:151:1: ruleMethodType returns [Object r] : ( 'create' | 'read' | 'update' | 'delete' );
    public Object ruleMethodType() throws RecognitionException {
        Object r = null;
        int ruleMethodType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return r; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:152:4: ( 'create' | 'read' | 'update' | 'delete' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("151:1: ruleMethodType returns [Object r] : ( 'create' | 'read' | 'update' | 'delete' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:152:4: 'create'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    match(input,11,FOLLOW_11_in_ruleMethodType179); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","CREATE"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:155:7: 'read'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(2)),line(),start());
                    }
                    match(input,12,FOLLOW_12_in_ruleMethodType197); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","READ"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:158:7: 'update'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(3)),line(),start());
                    }
                    match(input,13,FOLLOW_13_in_ruleMethodType215); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "MethodType","UPDATE"),end());
                    }

                    }
                    break;
                case 4 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:161:7: 'delete'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(4)),line(),start());
                    }
                    match(input,14,FOLLOW_14_in_ruleMethodType233); if (failed) return r;
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
            if ( backtracking>0 ) { memoize(input, 3, ruleMethodType_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleMethodType


    // $ANTLR start ruleDtoReference
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:166:1: ruleDtoReference returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDtoReference() throws RecognitionException {
        EObject result = null;
        int ruleDtoReference_StartIndex = input.index();
        Token temp_description=null;
        Token temp_modelname=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:167:4: ( ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:167:4: ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:171:1: ( (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:171:2: (temp_description= RULE_STRING )? ( 'from' ) (temp_modelname= RULE_ID ) ( 'import' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:171:2: (temp_description= RULE_STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:171:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoReference261); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:174:1: ( 'from' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:174:2: 'from'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleDtoReference271); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:176:1: (temp_modelname= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:176:2: temp_modelname= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_modelname=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference280); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"modelname",convert(temp_modelname),false); ptm.ruleFinished(temp_modelname,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:179:1: ( 'import' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:179:2: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,16,FOLLOW_16_in_ruleDtoReference289); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:181:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:181:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference298); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 4, ruleDtoReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoReference


    // $ANTLR start ruleServiceMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:186:1: ruleServiceMethod returns [EObject result] : ( (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) ) ) ;
    public EObject ruleServiceMethod() throws RecognitionException {
        EObject result = null;
        int ruleServiceMethod_StartIndex = input.index();
        Token temp_description=null;
        EObject temp_CustomMethod = null;

        EObject temp_SpecialMethod = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:187:4: ( ( (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:187:4: ( (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ServiceMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:191:1: ( (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:191:2: (temp_description= RULE_STRING )? ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:191:2: (temp_description= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:191:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceMethod327); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:194:1: ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=11 && LA7_0<=14)) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("194:1: ( (temp_CustomMethod= ruleCustomMethod ) | (temp_SpecialMethod= ruleSpecialMethod ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:194:2: (temp_CustomMethod= ruleCustomMethod )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:194:2: (temp_CustomMethod= ruleCustomMethod )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:194:3: temp_CustomMethod= ruleCustomMethod
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleCustomMethod_in_ruleServiceMethod341);
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
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:198:1: (temp_SpecialMethod= ruleSpecialMethod )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:198:1: (temp_SpecialMethod= ruleSpecialMethod )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:198:2: temp_SpecialMethod= ruleSpecialMethod
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleSpecialMethod_in_ruleServiceMethod356);
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

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, ruleServiceMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleServiceMethod


    // $ANTLR start ruleCustomMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:205:1: ruleCustomMethod returns [EObject result] : ( ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) ) ;
    public EObject ruleCustomMethod() throws RecognitionException {
        EObject result = null;
        int ruleCustomMethod_StartIndex = input.index();
        Token temp_name=null;
        Token temp_output=null;
        EObject temp_inParameters = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:206:4: ( ( ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:206:4: ( ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CustomMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:210:1: ( ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:210:2: ( 'method' ) (temp_name= RULE_ID ) ( ( 'in' ) (temp_inParameters= ruleParameter )* )? ( ( 'out' ) (temp_output= RULE_ID ) )? ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:210:2: ( 'method' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:210:3: 'method'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleCustomMethod386); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:212:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:212:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod395); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:215:1: ( ( 'in' ) (temp_inParameters= ruleParameter )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:215:2: ( 'in' ) (temp_inParameters= ruleParameter )*
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:215:2: ( 'in' )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:215:3: 'in'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    match(input,18,FOLLOW_18_in_ruleCustomMethod405); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:217:1: (temp_inParameters= ruleParameter )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:217:2: temp_inParameters= ruleParameter
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleCustomMethod414);
                    	    temp_inParameters=ruleParameter();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      factory.add(result,"inParameters",convert(temp_inParameters),false); ptm.ruleFinished(temp_inParameters,end()); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:221:1: ( ( 'out' ) (temp_output= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:221:2: ( 'out' ) (temp_output= RULE_ID )
                    {
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:221:2: ( 'out' )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:221:3: 'out'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    match(input,19,FOLLOW_19_in_ruleCustomMethod428); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:223:1: (temp_output= RULE_ID )
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:223:2: temp_output= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_output=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod437); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"output",convert(temp_output),true); ptm.ruleFinished(temp_output,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:228:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,20,FOLLOW_20_in_ruleCustomMethod450); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 6, ruleCustomMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCustomMethod


    // $ANTLR start ruleParameter
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:232:1: ruleParameter returns [EObject result] : ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) ) ;
    public EObject ruleParameter() throws RecognitionException {
        EObject result = null;
        int ruleParameter_StartIndex = input.index();
        Token temp_type=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:233:4: ( ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:233:4: ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Parameter");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:237:1: ( (temp_type= RULE_ID ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:237:2: (temp_type= RULE_ID ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:237:2: (temp_type= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:237:3: temp_type= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_type=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter477); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),true); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:241:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:241:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter489); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 7, ruleParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start ruleSpecialMethod
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:246:1: ruleSpecialMethod returns [EObject result] : ( (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) ;
    public EObject ruleSpecialMethod() throws RecognitionException {
        EObject result = null;
        int ruleSpecialMethod_StartIndex = input.index();
        Token temp_name=null;
        Token temp_dto=null;
        Object temp_type = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:247:4: ( ( (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:247:4: ( (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "SpecialMethod");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:1: ( (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:2: (temp_type= ruleMethodType ) (temp_name= RULE_ID ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:2: (temp_type= ruleMethodType )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:251:3: temp_type= ruleMethodType
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleMethodType_in_ruleSpecialMethod518);
            temp_type=ruleMethodType();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:254:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:254:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialMethod529); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:257:1: ( 'for' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:257:2: 'for'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,21,FOLLOW_21_in_ruleSpecialMethod538); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:259:1: (temp_dto= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:259:2: temp_dto= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_dto=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialMethod547); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dto",convert(temp_dto),true); ptm.ruleFinished(temp_dto,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:263:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:263:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,20,FOLLOW_20_in_ruleSpecialMethod557); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 8, ruleSpecialMethod_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSpecialMethod


    // $ANTLR start ruleCrudService
    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:267:1: ruleCrudService returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) ;
    public EObject ruleCrudService() throws RecognitionException {
        EObject result = null;
        int ruleCrudService_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_dto=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:268:4: ( ( (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:268:4: ( (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CrudService");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:272:1: ( (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:272:2: (temp_description= RULE_STRING )? (temp_name= 'crud' ) ( 'for' ) (temp_dto= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:272:2: (temp_description= RULE_STRING )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:272:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCrudService584); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:275:1: (temp_name= 'crud' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:275:2: temp_name= 'crud'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,22,FOLLOW_22_in_ruleCrudService596); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:278:1: ( 'for' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:278:2: 'for'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,21,FOLLOW_21_in_ruleCrudService605); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:280:1: (temp_dto= RULE_ID )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:280:2: temp_dto= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_dto=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCrudService614); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dto",convert(temp_dto),true); ptm.ruleFinished(temp_dto,end()); 
            }

            }

            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:284:1: ( ';' )
            // ..//org.mod4j.dsl.service.xtext/src-gen//org/mod4j/dsl/service/xtext/parser/ServiceDsl.g:284:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,20,FOLLOW_20_in_ruleCrudService624); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 9, ruleCrudService_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCrudService


 

    public static final BitSet FOLLOW_ruleServiceModel_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceModel93 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleServiceModel103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceModel112 = new BitSet(new long[]{0x000000000042F812L});
    public static final BitSet FOLLOW_ruleDtoReference_in_ruleServiceModel123 = new BitSet(new long[]{0x000000000042F812L});
    public static final BitSet FOLLOW_ruleCrudService_in_ruleServiceModel136 = new BitSet(new long[]{0x0000000000427812L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_ruleServiceModel149 = new BitSet(new long[]{0x0000000000427812L});
    public static final BitSet FOLLOW_11_in_ruleMethodType179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMethodType197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleMethodType215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMethodType233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoReference261 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDtoReference271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference280 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDtoReference289 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceMethod327 = new BitSet(new long[]{0x0000000000027800L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_ruleServiceMethod341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_ruleServiceMethod356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCustomMethod386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod395 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleCustomMethod405 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomMethod414 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_19_in_ruleCustomMethod428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCustomMethod450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodType_in_ruleSpecialMethod518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialMethod529 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSpecialMethod538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialMethod547 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSpecialMethod557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCrudService584 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCrudService596 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCrudService605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCrudService614 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCrudService624 = new BitSet(new long[]{0x0000000000000002L});

}