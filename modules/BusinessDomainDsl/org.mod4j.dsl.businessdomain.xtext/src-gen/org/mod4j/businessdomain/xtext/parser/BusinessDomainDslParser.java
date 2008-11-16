// $ANTLR 3.0 ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g 2008-11-16 21:57:45

package org.mod4j.businessdomain.xtext.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.businessdomain.xtext.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class BusinessDomainDslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'Model'", "'from'", "'import'", "'Association'", "'['", "']'", "'<->'", "'->'", "';'", "'0..*'", "'1'", "'1..*'", "'0..1'", "'Class'", "'inherits'", "'Rules'", "'Enumeration'", "'='", "'unique'", "'abstract'", "'final'", "'nullable'", "'persistency'", "'boolean'", "'default'", "'true'", "'false'", "'string'", "'minlength'", "'maxlength'", "'regexp'", "'datetime'", "'integer'", "'min'", "'max'", "'decimal'", "'ReadWrite'", "'Read'", "'NONE'"
    };
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_ID=5;
    public static final int RULE_WS=7;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;

        public BusinessDomainDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[70+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g"; }



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
    			if (t.getType() == BusinessDomainDslLexer.RULE_ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==BusinessDomainDslLexer.RULE_STRING) {
    				return s.substring(1,s.length()-1);
    			} else if (t.getType()==BusinessDomainDslLexer.RULE_INT) {
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
    			factory.addImport("", "http://www.mod4j.org/busmod");
    		
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
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:122:1: parse returns [Node r] : result= ruleBusinessDomainModel EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:123:3: (result= ruleBusinessDomainModel EOF )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:123:3: result= ruleBusinessDomainModel EOF
            {
            pushFollow(FOLLOW_ruleBusinessDomainModel_in_parse67);
            result=ruleBusinessDomainModel();
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


    // $ANTLR start ruleBusinessDomainModel
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:126:1: ruleBusinessDomainModel returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )* ) ;
    public EObject ruleBusinessDomainModel() throws RecognitionException {
        EObject result = null;
        int ruleBusinessDomainModel_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        EObject temp_types = null;

        EObject temp_enumerations = null;

        EObject temp_associations = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:127:4: ( ( (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )* ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:127:4: ( (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessDomainModel");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:131:1: ( (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )* )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:131:2: (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )*
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:131:2: (temp_description= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:131:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessDomainModel93); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:134:1: ( 'Model' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:134:2: 'Model'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,10,FOLLOW_10_in_ruleBusinessDomainModel103); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:136:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:136:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessDomainModel112); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:139:1: (temp_types= ruleBusinessClassReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:139:2: temp_types= ruleBusinessClassReference
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleBusinessClassReference_in_ruleBusinessDomainModel123);
            	    temp_types=ruleBusinessClassReference();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"types",convert(temp_types),false); ptm.ruleFinished(temp_types,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:142:1: (temp_types= ruleBusinessClass )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==23) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:142:2: temp_types= ruleBusinessClass
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel135);
            	    temp_types=ruleBusinessClass();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"types",convert(temp_types),false); ptm.ruleFinished(temp_types,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:145:1: (temp_enumerations= ruleEnumeration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==26) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:145:2: temp_enumerations= ruleEnumeration
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel147);
            	    temp_enumerations=ruleEnumeration();
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

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:148:1: (temp_associations= ruleAssociation )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:148:2: temp_associations= ruleAssociation
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(6)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleAssociation_in_ruleBusinessDomainModel159);
            	    temp_associations=ruleAssociation();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"associations",convert(temp_associations),false); ptm.ruleFinished(temp_associations,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
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
            if ( backtracking>0 ) { memoize(input, 2, ruleBusinessDomainModel_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessDomainModel


    // $ANTLR start ruleBusinessClassReference
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:153:1: ruleBusinessClassReference returns [EObject result] : ( ( 'from' ) (temp_model= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleBusinessClassReference() throws RecognitionException {
        EObject result = null;
        int ruleBusinessClassReference_StartIndex = input.index();
        Token temp_model=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:154:4: ( ( ( 'from' ) (temp_model= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:154:4: ( ( 'from' ) (temp_model= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessClassReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:158:1: ( ( 'from' ) (temp_model= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:158:2: ( 'from' ) (temp_model= RULE_ID ) ( 'import' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:158:2: ( 'from' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:158:3: 'from'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleBusinessClassReference187); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:160:1: (temp_model= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:160:2: temp_model= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_model=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassReference196); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"model",convert(temp_model),false); ptm.ruleFinished(temp_model,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:163:1: ( 'import' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:163:2: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleBusinessClassReference205); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:165:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:165:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassReference214); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 3, ruleBusinessClassReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessClassReference


    // $ANTLR start ruleAssociation
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:170:1: ruleAssociation returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' ) ) ;
    public EObject ruleAssociation() throws RecognitionException {
        EObject result = null;
        int ruleAssociation_StartIndex = input.index();
        Token temp_description=null;
        Token temp_sourceRoleName=null;
        Token temp_source=null;
        Token temp_bidirectional=null;
        Token temp_targetRoleName=null;
        Token temp_target=null;
        Object temp_sourceMultiplicity = null;

        Object temp_targetMultiplicity = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:171:4: ( ( (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:171:4: ( (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Association");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:175:1: ( (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:175:2: (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:175:2: (temp_description= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:175:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation243); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:178:1: ( 'Association' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:178:2: 'Association'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleAssociation253); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:180:1: (temp_sourceRoleName= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:180:2: temp_sourceRoleName= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_sourceRoleName=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation262); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"sourceRoleName",convert(temp_sourceRoleName),false); ptm.ruleFinished(temp_sourceRoleName,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:183:1: (temp_source= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:183:2: temp_source= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_source=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation273); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"source",convert(temp_source),true); ptm.ruleFinished(temp_source,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:187:1: ( '[' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:187:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleAssociation283); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:189:1: (temp_sourceMultiplicity= ruleMultiplicity )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:189:2: temp_sourceMultiplicity= ruleMultiplicity
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation292);
            temp_sourceMultiplicity=ruleMultiplicity();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"sourceMultiplicity",convert(temp_sourceMultiplicity),false); ptm.ruleFinished(temp_sourceMultiplicity,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:192:1: ( ']' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:192:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleAssociation301); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:194:1: ( (temp_bidirectional= '<->' ) | ( '->' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("194:1: ( (temp_bidirectional= '<->' ) | ( '->' ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:194:2: (temp_bidirectional= '<->' )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:194:2: (temp_bidirectional= '<->' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:194:3: temp_bidirectional= '<->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());
                    }
                    temp_bidirectional=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleAssociation311); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"bidirectional",true); ptm.ruleFinished(temp_bidirectional,end()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:197:1: ( '->' )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:197:1: ( '->' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:197:2: '->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleAssociation322); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:200:1: ( '[' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:200:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(8)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleAssociation331); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:202:1: (temp_targetMultiplicity= ruleMultiplicity )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:202:2: temp_targetMultiplicity= ruleMultiplicity
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(9)),line(),start());
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation340);
            temp_targetMultiplicity=ruleMultiplicity();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"targetMultiplicity",convert(temp_targetMultiplicity),false); ptm.ruleFinished(temp_targetMultiplicity,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:205:1: ( ']' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:205:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(10)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleAssociation349); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:207:1: (temp_targetRoleName= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:207:2: temp_targetRoleName= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(11)),line(),start());
            }
            temp_targetRoleName=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation358); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"targetRoleName",convert(temp_targetRoleName),false); ptm.ruleFinished(temp_targetRoleName,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:210:1: (temp_target= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:210:2: temp_target= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(12)),line(),start());
            }
            temp_target=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation369); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"target",convert(temp_target),true); ptm.ruleFinished(temp_target,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:214:1: ( ';' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:214:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(13)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleAssociation379); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 4, ruleAssociation_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAssociation


    // $ANTLR start ruleMultiplicity
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:218:1: ruleMultiplicity returns [Object r] : ( '0..*' | '1' | '1..*' | '0..1' );
    public Object ruleMultiplicity() throws RecognitionException {
        Object r = null;
        int ruleMultiplicity_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return r; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:219:4: ( '0..*' | '1' | '1..*' | '0..1' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("218:1: ruleMultiplicity returns [Object r] : ( '0..*' | '1' | '1..*' | '0..1' );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:219:4: '0..*'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    match(input,19,FOLLOW_19_in_ruleMultiplicity404); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Multiplicity","ZeroMany"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:222:7: '1'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(2)),line(),start());
                    }
                    match(input,20,FOLLOW_20_in_ruleMultiplicity422); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Multiplicity","One"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:225:7: '1..*'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(3)),line(),start());
                    }
                    match(input,21,FOLLOW_21_in_ruleMultiplicity440); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Multiplicity","OneMany"),end());
                    }

                    }
                    break;
                case 4 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:228:7: '0..1'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(4)),line(),start());
                    }
                    match(input,22,FOLLOW_22_in_ruleMultiplicity458); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Multiplicity","ZeroOne"),end());
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
            if ( backtracking>0 ) { memoize(input, 5, ruleMultiplicity_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleMultiplicity


    // $ANTLR start ruleBusinessClass
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:233:1: ruleBusinessClass returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' ) ) ;
    public EObject ruleBusinessClass() throws RecognitionException {
        EObject result = null;
        int ruleBusinessClass_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_superclass=null;
        Object temp_inheritanceModifier = null;

        EObject temp_properties = null;

        EObject temp_businessRules = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:234:4: ( ( (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:234:4: ( (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessClass");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:238:1: ( (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:238:2: (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:238:2: (temp_description= RULE_STRING )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:238:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessClass486); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:241:1: ( 'Class' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:241:2: 'Class'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,23,FOLLOW_23_in_ruleBusinessClass496); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:243:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:243:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass505); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:246:1: (temp_inheritanceModifier= ruleInheritanceModifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=29 && LA10_0<=30)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:246:2: temp_inheritanceModifier= ruleInheritanceModifier
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleInheritanceModifier_in_ruleBusinessClass516);
                    temp_inheritanceModifier=ruleInheritanceModifier();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"inheritanceModifier",convert(temp_inheritanceModifier),false); ptm.ruleFinished(temp_inheritanceModifier,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:249:1: ( ( 'inherits' ) (temp_superclass= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:249:2: ( 'inherits' ) (temp_superclass= RULE_ID )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:249:2: ( 'inherits' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:249:3: 'inherits'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,24,FOLLOW_24_in_ruleBusinessClass527); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:251:1: (temp_superclass= RULE_ID )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:251:2: temp_superclass= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_superclass=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass536); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"superclass",convert(temp_superclass),true); ptm.ruleFinished(temp_superclass,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:256:1: ( '[' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:256:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleBusinessClass549); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:258:1: (temp_properties= ruleProperty )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==33||LA12_0==37||(LA12_0>=41 && LA12_0<=42)||LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:258:2: temp_properties= ruleProperty
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(6)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleBusinessClass558);
            	    temp_properties=ruleProperty();
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

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:261:1: ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:261:2: ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:261:2: ( 'Rules' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:261:3: 'Rules'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());
                    }
                    match(input,25,FOLLOW_25_in_ruleBusinessClass569); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:263:1: ( '[' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:263:2: '['
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());
                    }
                    match(input,14,FOLLOW_14_in_ruleBusinessClass576); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:265:1: (temp_businessRules= ruleAbstractBusinessRule )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==28) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:265:2: temp_businessRules= ruleAbstractBusinessRule
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)).eContents().get(2)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass585);
                    	    temp_businessRules=ruleAbstractBusinessRule();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      factory.add(result,"businessRules",convert(temp_businessRules),false); ptm.ruleFinished(temp_businessRules,end()); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:268:1: ( ']' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:268:2: ']'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)).eContents().get(3)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleBusinessClass595); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:271:1: ( ']' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:271:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(8)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleBusinessClass605); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 6, ruleBusinessClass_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessClass


    // $ANTLR start ruleEnumeration
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:275:1: ruleEnumeration returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' ) ) ;
    public EObject ruleEnumeration() throws RecognitionException {
        EObject result = null;
        int ruleEnumeration_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        EObject temp_enumerationLiterals = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:276:4: ( ( (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:276:4: ( (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Enumeration");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:280:1: ( (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:280:2: (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:280:2: (temp_description= RULE_STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:280:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumeration632); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:283:1: ( 'Enumeration' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:283:2: 'Enumeration'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,26,FOLLOW_26_in_ruleEnumeration642); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:285:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:285:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration651); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:288:1: ( '[' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:288:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleEnumeration660); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:290:1: (temp_enumerationLiterals= ruleEnumerationLiteral )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:290:2: temp_enumerationLiterals= ruleEnumerationLiteral
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration669);
            	    temp_enumerationLiterals=ruleEnumerationLiteral();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"enumerationLiterals",convert(temp_enumerationLiterals),false); ptm.ruleFinished(temp_enumerationLiterals,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:293:1: ( ']' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:293:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleEnumeration679); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 7, ruleEnumeration_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleEnumeration


    // $ANTLR start ruleEnumerationLiteral
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:297:1: ruleEnumerationLiteral returns [EObject result] : ( (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' ) ) ;
    public EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject result = null;
        int ruleEnumerationLiteral_StartIndex = input.index();
        Token temp_name=null;
        Token temp_persistedValue=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:298:4: ( ( (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:298:4: ( (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "EnumerationLiteral");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:302:1: ( (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:302:2: (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:302:2: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:302:3: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral706); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:305:1: ( ( '=' ) (temp_persistedValue= RULE_INT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:305:2: ( '=' ) (temp_persistedValue= RULE_INT )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:305:2: ( '=' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:305:3: '='
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    match(input,27,FOLLOW_27_in_ruleEnumerationLiteral716); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:307:1: (temp_persistedValue= RULE_INT )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:307:2: temp_persistedValue= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_persistedValue=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral725); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"persistedValue",convert(temp_persistedValue),false); ptm.ruleFinished(temp_persistedValue,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:311:1: ( ';' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:311:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleEnumerationLiteral737); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 8, ruleEnumerationLiteral_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start ruleAbstractBusinessRule
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:315:1: ruleAbstractBusinessRule returns [EObject result] : (temp_businessrule= ruleBusinessRule | temp_uniquerule= ruleUniqueRule );
    public EObject ruleAbstractBusinessRule() throws RecognitionException {
        EObject result = null;
        int ruleAbstractBusinessRule_StartIndex = input.index();
        EObject temp_businessrule = null;

        EObject temp_uniquerule = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:316:9: (temp_businessrule= ruleBusinessRule | temp_uniquerule= ruleUniqueRule )
            int alt18=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID) ) {
                    alt18=1;
                }
                else if ( (LA18_1==28) ) {
                    alt18=2;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("315:1: ruleAbstractBusinessRule returns [EObject result] : (temp_businessrule= ruleBusinessRule | temp_uniquerule= ruleUniqueRule );", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 28:
                {
                alt18=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("315:1: ruleAbstractBusinessRule returns [EObject result] : (temp_businessrule= ruleBusinessRule | temp_uniquerule= ruleUniqueRule );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:316:9: temp_businessrule= ruleBusinessRule
                    {
                    pushFollow(FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule764);
                    temp_businessrule=ruleBusinessRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_businessrule;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:316:82: temp_uniquerule= ruleUniqueRule
                    {
                    pushFollow(FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule779);
                    temp_uniquerule=ruleUniqueRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_uniquerule;
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
            if ( backtracking>0 ) { memoize(input, 9, ruleAbstractBusinessRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAbstractBusinessRule


    // $ANTLR start ruleBusinessRule
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:318:1: ruleBusinessRule returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' ) ) ;
    public EObject ruleBusinessRule() throws RecognitionException {
        EObject result = null;
        int ruleBusinessRule_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:319:4: ( ( (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:319:4: ( (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:323:1: ( (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:323:2: (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:323:2: (temp_description= RULE_STRING )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:323:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessRule804); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:326:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:326:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule816); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:329:1: ( ';' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:329:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleBusinessRule825); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 10, ruleBusinessRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessRule


    // $ANTLR start ruleUniqueRule
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:333:1: ruleUniqueRule returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' ) ) ;
    public EObject ruleUniqueRule() throws RecognitionException {
        EObject result = null;
        int ruleUniqueRule_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_properties=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:334:4: ( ( (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:334:4: ( (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "UniqueRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:338:1: ( (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:338:2: (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:338:2: (temp_description= RULE_STRING )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:338:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUniqueRule852); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:341:1: ( 'unique' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:341:2: 'unique'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,28,FOLLOW_28_in_ruleUniqueRule862); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:343:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:343:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule871); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:346:1: ( '[' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:346:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleUniqueRule880); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:348:1: (temp_properties= RULE_ID )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:348:2: temp_properties= RULE_ID
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    temp_properties=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule889); if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"properties",convert(temp_properties),true); ptm.ruleFinished(temp_properties,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:352:1: ( ']' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:352:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleUniqueRule900); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:354:1: ( ';' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:354:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleUniqueRule907); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 11, ruleUniqueRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleUniqueRule


    // $ANTLR start ruleInheritanceModifier
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:358:1: ruleInheritanceModifier returns [Object r] : ( 'abstract' | 'final' );
    public Object ruleInheritanceModifier() throws RecognitionException {
        Object r = null;
        int ruleInheritanceModifier_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return r; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:359:4: ( 'abstract' | 'final' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            else {
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("358:1: ruleInheritanceModifier returns [Object r] : ( 'abstract' | 'final' );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:359:4: 'abstract'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)),line(),start());
                    }
                    match(input,29,FOLLOW_29_in_ruleInheritanceModifier932); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "InheritanceModifier","ABSTRACT"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:362:7: 'final'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(2)),line(),start());
                    }
                    match(input,30,FOLLOW_30_in_ruleInheritanceModifier950); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "InheritanceModifier","FINAL"),end());
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
            if ( backtracking>0 ) { memoize(input, 12, ruleInheritanceModifier_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleInheritanceModifier


    // $ANTLR start ruleProperty
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:367:1: ruleProperty returns [EObject result] : ( ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' ) ) ;
    public EObject ruleProperty() throws RecognitionException {
        EObject result = null;
        int ruleProperty_StartIndex = input.index();
        Token temp_nullable=null;
        EObject temp_BoolProperty = null;

        EObject temp_StringProperty = null;

        EObject temp_DateTimeProperty = null;

        EObject temp_IntegerProperty = null;

        EObject temp_DecimalProperty = null;

        EObject temp_EnumerationProperty = null;

        Object temp_persistency = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:368:4: ( ( ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:368:4: ( ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Property");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:372:1: ( ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:372:2: ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:372:2: ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt23=3;
                    }
                    break;
                case 37:
                    {
                    alt23=2;
                    }
                    break;
                case 33:
                    {
                    alt23=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt23=6;
                    }
                    break;
                case 45:
                    {
                    alt23=5;
                    }
                    break;
                case 42:
                    {
                    alt23=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("372:2: ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) )", 23, 1, input);

                    throw nvae;
                }

                }
                break;
            case 33:
                {
                alt23=1;
                }
                break;
            case 37:
                {
                alt23=2;
                }
                break;
            case 41:
                {
                alt23=3;
                }
                break;
            case 42:
                {
                alt23=4;
                }
                break;
            case 45:
                {
                alt23=5;
                }
                break;
            case RULE_ID:
                {
                alt23=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("372:2: ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:372:3: (temp_BoolProperty= ruleBoolProperty )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:372:3: (temp_BoolProperty= ruleBoolProperty )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:372:4: temp_BoolProperty= ruleBoolProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleBoolProperty_in_ruleProperty980);
                    temp_BoolProperty=ruleBoolProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_BoolProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:376:1: (temp_StringProperty= ruleStringProperty )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:376:1: (temp_StringProperty= ruleStringProperty )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:376:2: temp_StringProperty= ruleStringProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleStringProperty_in_ruleProperty995);
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
                case 3 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:380:1: (temp_DateTimeProperty= ruleDateTimeProperty )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:380:1: (temp_DateTimeProperty= ruleDateTimeProperty )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:380:2: temp_DateTimeProperty= ruleDateTimeProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDateTimeProperty_in_ruleProperty1010);
                    temp_DateTimeProperty=ruleDateTimeProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_DateTimeProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 4 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:384:1: (temp_IntegerProperty= ruleIntegerProperty )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:384:1: (temp_IntegerProperty= ruleIntegerProperty )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:384:2: temp_IntegerProperty= ruleIntegerProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(3)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleIntegerProperty_in_ruleProperty1025);
                    temp_IntegerProperty=ruleIntegerProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_IntegerProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 5 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:388:1: (temp_DecimalProperty= ruleDecimalProperty )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:388:1: (temp_DecimalProperty= ruleDecimalProperty )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:388:2: temp_DecimalProperty= ruleDecimalProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(4)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDecimalProperty_in_ruleProperty1040);
                    temp_DecimalProperty=ruleDecimalProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_DecimalProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 6 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:392:1: (temp_EnumerationProperty= ruleEnumerationProperty )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:392:1: (temp_EnumerationProperty= ruleEnumerationProperty )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:392:2: temp_EnumerationProperty= ruleEnumerationProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(5)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleEnumerationProperty_in_ruleProperty1055);
                    temp_EnumerationProperty=ruleEnumerationProperty();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_EnumerationProperty;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:397:1: (temp_nullable= 'nullable' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:397:2: temp_nullable= 'nullable'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_nullable=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleProperty1069); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"nullable",true); ptm.ruleFinished(temp_nullable,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:400:1: ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:400:2: ( 'persistency' ) (temp_persistency= rulePersistencyMode )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:400:2: ( 'persistency' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:400:3: 'persistency'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    match(input,32,FOLLOW_32_in_ruleProperty1080); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:402:1: (temp_persistency= rulePersistencyMode )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:402:2: temp_persistency= rulePersistencyMode
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_rulePersistencyMode_in_ruleProperty1089);
                    temp_persistency=rulePersistencyMode();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"persistency",convert(temp_persistency),false); ptm.ruleFinished(temp_persistency,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:406:1: ( ';' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:406:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleProperty1101); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 13, ruleProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start ruleBoolProperty
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:410:1: ruleBoolProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )? ) ;
    public EObject ruleBoolProperty() throws RecognitionException {
        EObject result = null;
        int ruleBoolProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;
        Token temp_hasDefault=null;
        Token temp_defaultValue=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:411:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )? ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:411:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BoolProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:415:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )? )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:415:2: (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )?
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:415:2: (temp_description= RULE_STRING )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:415:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoolProperty1128); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:418:1: (temp_dataType= 'boolean' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:418:2: temp_dataType= 'boolean'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleBoolProperty1140); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:421:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:421:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolProperty1151); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:424:1: ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:424:2: (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:424:2: (temp_hasDefault= 'default' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:424:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleBoolProperty1163); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:427:1: ( (temp_defaultValue= 'true' ) | ( 'false' ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==35) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==36) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("427:1: ( (temp_defaultValue= 'true' ) | ( 'false' ) )", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:427:2: (temp_defaultValue= 'true' )
                            {
                            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:427:2: (temp_defaultValue= 'true' )
                            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:427:3: temp_defaultValue= 'true'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_defaultValue=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_ruleBoolProperty1175); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"defaultValue",true); ptm.ruleFinished(temp_defaultValue,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:430:1: ( 'false' )
                            {
                            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:430:1: ( 'false' )
                            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:430:2: 'false'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            match(input,36,FOLLOW_36_in_ruleBoolProperty1186); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }


                            }
                            break;

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
            if ( backtracking>0 ) { memoize(input, 14, ruleBoolProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBoolProperty


    // $ANTLR start ruleStringProperty
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:436:1: ruleStringProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )? ) ;
    public EObject ruleStringProperty() throws RecognitionException {
        EObject result = null;
        int ruleStringProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;
        Token temp_hasDefault=null;
        Token temp_defaultValue=null;
        Token temp_minLength=null;
        Token temp_maxLength=null;
        Token temp_regularExpression=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:437:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )? ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:437:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StringProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:441:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )? )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:441:2: (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )?
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:441:2: (temp_description= RULE_STRING )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:441:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty1218); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:444:1: (temp_dataType= 'string' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:444:2: temp_dataType= 'string'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_ruleStringProperty1230); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:447:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:447:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringProperty1241); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:450:1: ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:450:2: (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:450:2: (temp_hasDefault= 'default' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:450:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleStringProperty1253); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:453:1: (temp_defaultValue= RULE_STRING )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:453:2: temp_defaultValue= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_defaultValue=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty1264); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"defaultValue",convert(temp_defaultValue),false); ptm.ruleFinished(temp_defaultValue,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:457:1: ( ( 'minlength' ) (temp_minLength= RULE_INT ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:457:2: ( 'minlength' ) (temp_minLength= RULE_INT )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:457:2: ( 'minlength' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:457:3: 'minlength'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,38,FOLLOW_38_in_ruleStringProperty1277); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:459:1: (temp_minLength= RULE_INT )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:459:2: temp_minLength= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_minLength=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty1286); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"minLength",convert(temp_minLength),false); ptm.ruleFinished(temp_minLength,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:463:1: ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:463:2: ( 'maxlength' ) (temp_maxLength= RULE_INT )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:463:2: ( 'maxlength' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:463:3: 'maxlength'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,39,FOLLOW_39_in_ruleStringProperty1299); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:465:1: (temp_maxLength= RULE_INT )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:465:2: temp_maxLength= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(5)).eContents().get(1)),line(),start());
                    }
                    temp_maxLength=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty1308); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"maxLength",convert(temp_maxLength),false); ptm.ruleFinished(temp_maxLength,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:469:1: ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:469:2: ( 'regexp' ) (temp_regularExpression= RULE_STRING )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:469:2: ( 'regexp' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:469:3: 'regexp'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(6)).eContents().get(0)),line(),start());
                    }
                    match(input,40,FOLLOW_40_in_ruleStringProperty1321); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:471:1: (temp_regularExpression= RULE_STRING )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:471:2: temp_regularExpression= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(6)).eContents().get(1)),line(),start());
                    }
                    temp_regularExpression=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty1330); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"regularExpression",convert(temp_regularExpression),false); ptm.ruleFinished(temp_regularExpression,end()); 
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
            if ( backtracking>0 ) { memoize(input, 15, ruleStringProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStringProperty


    // $ANTLR start ruleDateTimeProperty
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:477:1: ruleDateTimeProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ) ;
    public EObject ruleDateTimeProperty() throws RecognitionException {
        EObject result = null;
        int ruleDateTimeProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;
        Token temp_hasDefault=null;
        Token temp_defaultValue=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:478:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:478:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DateTimeProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:482:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:482:2: (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )?
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:482:2: (temp_description= RULE_STRING )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:482:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty1362); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:485:1: (temp_dataType= 'datetime' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:485:2: temp_dataType= 'datetime'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleDateTimeProperty1374); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:488:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:488:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeProperty1385); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:491:1: ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:491:2: (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:491:2: (temp_hasDefault= 'default' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:491:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleDateTimeProperty1397); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:494:1: (temp_defaultValue= RULE_STRING )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:494:2: temp_defaultValue= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_defaultValue=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty1408); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"defaultValue",convert(temp_defaultValue),false); ptm.ruleFinished(temp_defaultValue,end()); 
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
            if ( backtracking>0 ) { memoize(input, 16, ruleDateTimeProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDateTimeProperty


    // $ANTLR start ruleIntegerProperty
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:500:1: ruleIntegerProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )? ) ;
    public EObject ruleIntegerProperty() throws RecognitionException {
        EObject result = null;
        int ruleIntegerProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;
        Token temp_hasDefault=null;
        Token temp_defaultValue=null;
        Token temp_minValue=null;
        Token temp_maxValue=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:501:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )? ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:501:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "IntegerProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:505:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )? )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:505:2: (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )?
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:505:2: (temp_description= RULE_STRING )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:505:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntegerProperty1440); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:508:1: (temp_dataType= 'integer' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:508:2: temp_dataType= 'integer'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_ruleIntegerProperty1452); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:511:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:511:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerProperty1463); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:514:1: ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:514:2: (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:514:2: (temp_hasDefault= 'default' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:514:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleIntegerProperty1475); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:517:1: (temp_defaultValue= RULE_INT )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:517:2: temp_defaultValue= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_defaultValue=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty1486); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"defaultValue",convert(temp_defaultValue),false); ptm.ruleFinished(temp_defaultValue,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:521:1: ( ( 'min' ) (temp_minValue= RULE_INT ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:521:2: ( 'min' ) (temp_minValue= RULE_INT )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:521:2: ( 'min' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:521:3: 'min'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,43,FOLLOW_43_in_ruleIntegerProperty1499); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:523:1: (temp_minValue= RULE_INT )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:523:2: temp_minValue= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_minValue=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty1508); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"minValue",convert(temp_minValue),false); ptm.ruleFinished(temp_minValue,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:527:1: ( ( 'max' ) (temp_maxValue= RULE_INT ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:527:2: ( 'max' ) (temp_maxValue= RULE_INT )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:527:2: ( 'max' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:527:3: 'max'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,44,FOLLOW_44_in_ruleIntegerProperty1521); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:529:1: (temp_maxValue= RULE_INT )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:529:2: temp_maxValue= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(5)).eContents().get(1)),line(),start());
                    }
                    temp_maxValue=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty1530); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"maxValue",convert(temp_maxValue),false); ptm.ruleFinished(temp_maxValue,end()); 
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
            if ( backtracking>0 ) { memoize(input, 17, ruleIntegerProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleIntegerProperty


    // $ANTLR start ruleDecimalProperty
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:535:1: ruleDecimalProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDecimalProperty() throws RecognitionException {
        EObject result = null;
        int ruleDecimalProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:536:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:536:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DecimalProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:540:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:540:2: (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:540:2: (temp_description= RULE_STRING )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:540:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalProperty1562); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:543:1: (temp_dataType= 'decimal' )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:543:2: temp_dataType= 'decimal'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,45,FOLLOW_45_in_ruleDecimalProperty1574); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:546:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:546:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecimalProperty1585); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 18, ruleDecimalProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDecimalProperty


    // $ANTLR start ruleEnumerationProperty
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:551:1: ruleEnumerationProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )? ) ;
    public EObject ruleEnumerationProperty() throws RecognitionException {
        EObject result = null;
        int ruleEnumerationProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_type=null;
        Token temp_name=null;
        Token temp_hasDefault=null;
        Token temp_defaultValueAsString=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:552:4: ( ( (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )? ) )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:552:4: ( (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "EnumerationProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:556:1: ( (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )? )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:556:2: (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )?
            {
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:556:2: (temp_description= RULE_STRING )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:556:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationProperty1614); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:559:1: (temp_type= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:559:2: temp_type= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_type=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty1626); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),true); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:563:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:563:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty1638); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:1: ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:2: (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID )
                    {
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:2: (temp_hasDefault= 'default' )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:566:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleEnumerationProperty1650); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:569:1: (temp_defaultValueAsString= RULE_ID )
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:569:2: temp_defaultValueAsString= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_defaultValueAsString=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty1661); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"defaultValueAsString",convert(temp_defaultValueAsString),false); ptm.ruleFinished(temp_defaultValueAsString,end()); 
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
            if ( backtracking>0 ) { memoize(input, 19, ruleEnumerationProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleEnumerationProperty


    // $ANTLR start rulePersistencyMode
    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:575:1: rulePersistencyMode returns [Object r] : ( 'ReadWrite' | 'Read' | 'NONE' );
    public Object rulePersistencyMode() throws RecognitionException {
        Object r = null;
        int rulePersistencyMode_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return r; }
            // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:576:4: ( 'ReadWrite' | 'Read' | 'NONE' )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt43=1;
                }
                break;
            case 47:
                {
                alt43=2;
                }
                break;
            case 48:
                {
                alt43=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("575:1: rulePersistencyMode returns [Object r] : ( 'ReadWrite' | 'Read' | 'NONE' );", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:576:4: 'ReadWrite'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)),line(),start());
                    }
                    match(input,46,FOLLOW_46_in_rulePersistencyMode1691); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "PersistencyMode","ReadWrite"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:579:7: 'Read'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(2)),line(),start());
                    }
                    match(input,47,FOLLOW_47_in_rulePersistencyMode1709); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "PersistencyMode","Read"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.businessdomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:582:7: 'NONE'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(3)),line(),start());
                    }
                    match(input,48,FOLLOW_48_in_rulePersistencyMode1727); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "PersistencyMode","None"),end());
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
            if ( backtracking>0 ) { memoize(input, 20, rulePersistencyMode_StartIndex); }
        }
        return r;
    }
    // $ANTLR end rulePersistencyMode


 

    public static final BitSet FOLLOW_ruleBusinessDomainModel_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessDomainModel93 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleBusinessDomainModel103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessDomainModel112 = new BitSet(new long[]{0x0000000004802812L});
    public static final BitSet FOLLOW_ruleBusinessClassReference_in_ruleBusinessDomainModel123 = new BitSet(new long[]{0x0000000004802812L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel135 = new BitSet(new long[]{0x0000000004802012L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel147 = new BitSet(new long[]{0x0000000004002012L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleBusinessDomainModel159 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_11_in_ruleBusinessClassReference187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassReference196 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessClassReference205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassReference214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssociation253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation273 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation283 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAssociation301 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAssociation311 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17_in_ruleAssociation322 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation331 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAssociation349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation369 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssociation379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicity404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMultiplicity422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMultiplicity440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicity458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessClass486 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBusinessClass496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass505 = new BitSet(new long[]{0x0000000061004000L});
    public static final BitSet FOLLOW_ruleInheritanceModifier_in_ruleBusinessClass516 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleBusinessClass527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass536 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBusinessClass549 = new BitSet(new long[]{0x0000262202008030L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleBusinessClass558 = new BitSet(new long[]{0x0000262202008030L});
    public static final BitSet FOLLOW_25_in_ruleBusinessClass569 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBusinessClass576 = new BitSet(new long[]{0x0000000010008030L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass585 = new BitSet(new long[]{0x0000000010008030L});
    public static final BitSet FOLLOW_15_in_ruleBusinessClass595 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBusinessClass605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumeration632 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumeration642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration651 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumeration660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration669 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleEnumeration679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral706 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_ruleEnumerationLiteral716 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral725 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnumerationLiteral737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessRule804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule816 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBusinessRule825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUniqueRule852 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUniqueRule862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule871 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUniqueRule880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule889 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleUniqueRule900 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUniqueRule907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInheritanceModifier932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInheritanceModifier950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_ruleProperty980 = new BitSet(new long[]{0x0000000180040000L});
    public static final BitSet FOLLOW_ruleStringProperty_in_ruleProperty995 = new BitSet(new long[]{0x0000000180040000L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_ruleProperty1010 = new BitSet(new long[]{0x0000000180040000L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_ruleProperty1025 = new BitSet(new long[]{0x0000000180040000L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_ruleProperty1040 = new BitSet(new long[]{0x0000000180040000L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_ruleProperty1055 = new BitSet(new long[]{0x0000000180040000L});
    public static final BitSet FOLLOW_31_in_ruleProperty1069 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_32_in_ruleProperty1080 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_rulePersistencyMode_in_ruleProperty1089 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProperty1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoolProperty1128 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBoolProperty1140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolProperty1151 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleBoolProperty1163 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleBoolProperty1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBoolProperty1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty1218 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleStringProperty1230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringProperty1241 = new BitSet(new long[]{0x000001C400000002L});
    public static final BitSet FOLLOW_34_in_ruleStringProperty1253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty1264 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleStringProperty1277 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty1286 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleStringProperty1299 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty1308 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleStringProperty1321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty1362 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDateTimeProperty1374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeProperty1385 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleDateTimeProperty1397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntegerProperty1440 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleIntegerProperty1452 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerProperty1463 = new BitSet(new long[]{0x0000180400000002L});
    public static final BitSet FOLLOW_34_in_ruleIntegerProperty1475 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty1486 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleIntegerProperty1499 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty1508 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleIntegerProperty1521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalProperty1562 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDecimalProperty1574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecimalProperty1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationProperty1614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty1626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty1638 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleEnumerationProperty1650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePersistencyMode1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePersistencyMode1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePersistencyMode1727 = new BitSet(new long[]{0x0000000000000002L});

}