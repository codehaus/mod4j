// $ANTLR 3.0 ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g 2008-08-13 22:34:19

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'Model'", "'import'", "'Association'", "'['", "']'", "'<->'", "'->'", "';'", "'0..*'", "'1'", "'1..*'", "'0..1'", "'Class'", "'inherits'", "'Rules'", "'Enumeration'", "'='", "'unique'", "'abstract'", "'final'", "'nullable'", "'persistency'", "'boolean'", "'default'", "'true'", "'false'", "'string'", "'minlength'", "'maxlength'", "'regexp'", "'datetime'", "'month'", "'year'", "'day'", "'hour'", "'minute'", "'second'", "'millisecond'", "'integer'", "'min'", "'max'", "'decimal'", "'ReadWrite'", "'Read'", "'NONE'"
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
            ruleMemo = new HashMap[77+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g"; }



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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:122:1: parse returns [Node r] : result= ruleBusinessDomainModel EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:123:3: (result= ruleBusinessDomainModel EOF )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:123:3: result= ruleBusinessDomainModel EOF
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:126:1: ruleBusinessDomainModel returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )* ) ;
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:127:4: ( ( (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )* ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:127:4: ( (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessDomainModel");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:131:1: ( (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )* )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:131:2: (temp_description= RULE_STRING )? ( 'Model' ) (temp_name= RULE_ID ) (temp_types= ruleBusinessClassReference )* (temp_types= ruleBusinessClass )* (temp_enumerations= ruleEnumeration )* (temp_associations= ruleAssociation )*
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:131:2: (temp_description= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:131:3: temp_description= RULE_STRING
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:134:1: ( 'Model' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:134:2: 'Model'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,10,FOLLOW_10_in_ruleBusinessDomainModel103); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:136:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:136:2: temp_name= RULE_ID
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:139:1: (temp_types= ruleBusinessClassReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:139:2: temp_types= ruleBusinessClassReference
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:142:1: (temp_types= ruleBusinessClass )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==22) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:142:2: temp_types= ruleBusinessClass
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:145:1: (temp_enumerations= ruleEnumeration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==25) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:145:2: temp_enumerations= ruleEnumeration
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:148:1: (temp_associations= ruleAssociation )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:148:2: temp_associations= ruleAssociation
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:153:1: ruleBusinessClassReference returns [EObject result] : ( ( 'import' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleBusinessClassReference() throws RecognitionException {
        EObject result = null;
        int ruleBusinessClassReference_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:154:4: ( ( ( 'import' ) (temp_name= RULE_ID ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:154:4: ( ( 'import' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessClassReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:158:1: ( ( 'import' ) (temp_name= RULE_ID ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:158:2: ( 'import' ) (temp_name= RULE_ID )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:158:2: ( 'import' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:158:3: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleBusinessClassReference187); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:160:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:160:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassReference196); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:165:1: ruleAssociation returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' ) ) ;
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:166:4: ( ( (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:166:4: ( (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Association");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:170:1: ( (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:170:2: (temp_description= RULE_STRING )? ( 'Association' ) (temp_sourceRoleName= RULE_ID ) (temp_source= RULE_ID ) ( '[' ) (temp_sourceMultiplicity= ruleMultiplicity ) ( ']' ) ( (temp_bidirectional= '<->' ) | ( '->' ) ) ( '[' ) (temp_targetMultiplicity= ruleMultiplicity ) ( ']' ) (temp_targetRoleName= RULE_ID ) (temp_target= RULE_ID ) ( ';' )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:170:2: (temp_description= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:170:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation225); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:173:1: ( 'Association' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:173:2: 'Association'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleAssociation235); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:175:1: (temp_sourceRoleName= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:175:2: temp_sourceRoleName= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_sourceRoleName=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation244); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"sourceRoleName",convert(temp_sourceRoleName),false); ptm.ruleFinished(temp_sourceRoleName,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:178:1: (temp_source= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:178:2: temp_source= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_source=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation255); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"source",convert(temp_source),true); ptm.ruleFinished(temp_source,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:182:1: ( '[' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:182:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleAssociation265); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:184:1: (temp_sourceMultiplicity= ruleMultiplicity )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:184:2: temp_sourceMultiplicity= ruleMultiplicity
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation274);
            temp_sourceMultiplicity=ruleMultiplicity();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"sourceMultiplicity",convert(temp_sourceMultiplicity),false); ptm.ruleFinished(temp_sourceMultiplicity,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:187:1: ( ']' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:187:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleAssociation283); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:189:1: ( (temp_bidirectional= '<->' ) | ( '->' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("189:1: ( (temp_bidirectional= '<->' ) | ( '->' ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:189:2: (temp_bidirectional= '<->' )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:189:2: (temp_bidirectional= '<->' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:189:3: temp_bidirectional= '<->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());
                    }
                    temp_bidirectional=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleAssociation293); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"bidirectional",true); ptm.ruleFinished(temp_bidirectional,end()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:192:1: ( '->' )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:192:1: ( '->' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:192:2: '->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());
                    }
                    match(input,16,FOLLOW_16_in_ruleAssociation304); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:195:1: ( '[' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:195:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(8)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleAssociation313); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:197:1: (temp_targetMultiplicity= ruleMultiplicity )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:197:2: temp_targetMultiplicity= ruleMultiplicity
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(9)),line(),start());
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation322);
            temp_targetMultiplicity=ruleMultiplicity();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"targetMultiplicity",convert(temp_targetMultiplicity),false); ptm.ruleFinished(temp_targetMultiplicity,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:200:1: ( ']' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:200:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(10)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleAssociation331); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:202:1: (temp_targetRoleName= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:202:2: temp_targetRoleName= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(11)),line(),start());
            }
            temp_targetRoleName=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation340); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"targetRoleName",convert(temp_targetRoleName),false); ptm.ruleFinished(temp_targetRoleName,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:205:1: (temp_target= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:205:2: temp_target= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(12)),line(),start());
            }
            temp_target=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation351); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"target",convert(temp_target),true); ptm.ruleFinished(temp_target,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:209:1: ( ';' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:209:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(13)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleAssociation361); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:213:1: ruleMultiplicity returns [Object r] : ( '0..*' | '1' | '1..*' | '0..1' );
    public Object ruleMultiplicity() throws RecognitionException {
        Object r = null;
        int ruleMultiplicity_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return r; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:214:4: ( '0..*' | '1' | '1..*' | '0..1' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("213:1: ruleMultiplicity returns [Object r] : ( '0..*' | '1' | '1..*' | '0..1' );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:214:4: '0..*'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    match(input,18,FOLLOW_18_in_ruleMultiplicity386); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Multiplicity","ZeroMany"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:217:7: '1'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(2)),line(),start());
                    }
                    match(input,19,FOLLOW_19_in_ruleMultiplicity404); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Multiplicity","One"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:220:7: '1..*'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(3)),line(),start());
                    }
                    match(input,20,FOLLOW_20_in_ruleMultiplicity422); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Multiplicity","OneMany"),end());
                    }

                    }
                    break;
                case 4 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:223:7: '0..1'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(4)),line(),start());
                    }
                    match(input,21,FOLLOW_21_in_ruleMultiplicity440); if (failed) return r;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:228:1: ruleBusinessClass returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' ) ) ;
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:229:4: ( ( (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:229:4: ( (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessClass");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:233:1: ( (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:233:2: (temp_description= RULE_STRING )? ( 'Class' ) (temp_name= RULE_ID ) (temp_inheritanceModifier= ruleInheritanceModifier )? ( ( 'inherits' ) (temp_superclass= RULE_ID ) )? ( '[' ) (temp_properties= ruleProperty )* ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )? ( ']' )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:233:2: (temp_description= RULE_STRING )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:233:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessClass468); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:236:1: ( 'Class' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:236:2: 'Class'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,22,FOLLOW_22_in_ruleBusinessClass478); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:238:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:238:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass487); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:241:1: (temp_inheritanceModifier= ruleInheritanceModifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=28 && LA10_0<=29)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:241:2: temp_inheritanceModifier= ruleInheritanceModifier
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleInheritanceModifier_in_ruleBusinessClass498);
                    temp_inheritanceModifier=ruleInheritanceModifier();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"inheritanceModifier",convert(temp_inheritanceModifier),false); ptm.ruleFinished(temp_inheritanceModifier,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:244:1: ( ( 'inherits' ) (temp_superclass= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:244:2: ( 'inherits' ) (temp_superclass= RULE_ID )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:244:2: ( 'inherits' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:244:3: 'inherits'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,23,FOLLOW_23_in_ruleBusinessClass509); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:246:1: (temp_superclass= RULE_ID )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:246:2: temp_superclass= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_superclass=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass518); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"superclass",convert(temp_superclass),true); ptm.ruleFinished(temp_superclass,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:251:1: ( '[' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:251:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleBusinessClass531); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:253:1: (temp_properties= ruleProperty )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==32||LA12_0==36||LA12_0==40||LA12_0==48||LA12_0==51) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:253:2: temp_properties= ruleProperty
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(6)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleBusinessClass540);
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:256:1: ( ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:256:2: ( 'Rules' ) ( '[' ) (temp_businessRules= ruleAbstractBusinessRule )* ( ']' )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:256:2: ( 'Rules' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:256:3: 'Rules'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());
                    }
                    match(input,24,FOLLOW_24_in_ruleBusinessClass551); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:258:1: ( '[' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:258:2: '['
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());
                    }
                    match(input,13,FOLLOW_13_in_ruleBusinessClass558); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:260:1: (temp_businessRules= ruleAbstractBusinessRule )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==27) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:260:2: temp_businessRules= ruleAbstractBusinessRule
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)).eContents().get(2)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass567);
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

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:263:1: ( ']' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:263:2: ']'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(7)).eContents().get(3)),line(),start());
                    }
                    match(input,14,FOLLOW_14_in_ruleBusinessClass577); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:266:1: ( ']' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:266:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(8)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleBusinessClass587); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:270:1: ruleEnumeration returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' ) ) ;
    public EObject ruleEnumeration() throws RecognitionException {
        EObject result = null;
        int ruleEnumeration_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        EObject temp_enumerationLiterals = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:271:4: ( ( (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:271:4: ( (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Enumeration");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:275:1: ( (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:275:2: (temp_description= RULE_STRING )? ( 'Enumeration' ) (temp_name= RULE_ID ) ( '[' ) (temp_enumerationLiterals= ruleEnumerationLiteral )+ ( ']' )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:275:2: (temp_description= RULE_STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:275:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumeration614); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:278:1: ( 'Enumeration' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:278:2: 'Enumeration'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,25,FOLLOW_25_in_ruleEnumeration624); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:280:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:280:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration633); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:283:1: ( '[' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:283:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleEnumeration642); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:285:1: (temp_enumerationLiterals= ruleEnumerationLiteral )+
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
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:285:2: temp_enumerationLiterals= ruleEnumerationLiteral
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration651);
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:288:1: ( ']' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:288:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleEnumeration661); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:292:1: ruleEnumerationLiteral returns [EObject result] : ( (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' ) ) ;
    public EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject result = null;
        int ruleEnumerationLiteral_StartIndex = input.index();
        Token temp_name=null;
        Token temp_persistedValue=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:293:4: ( ( (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:293:4: ( (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "EnumerationLiteral");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:297:1: ( (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:297:2: (temp_name= RULE_ID ) ( ( '=' ) (temp_persistedValue= RULE_INT ) )? ( ';' )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:297:2: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:297:3: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral688); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:300:1: ( ( '=' ) (temp_persistedValue= RULE_INT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:300:2: ( '=' ) (temp_persistedValue= RULE_INT )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:300:2: ( '=' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:300:3: '='
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    match(input,26,FOLLOW_26_in_ruleEnumerationLiteral698); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:302:1: (temp_persistedValue= RULE_INT )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:302:2: temp_persistedValue= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_persistedValue=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral707); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"persistedValue",convert(temp_persistedValue),false); ptm.ruleFinished(temp_persistedValue,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:306:1: ( ';' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:306:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleEnumerationLiteral719); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:310:1: ruleAbstractBusinessRule returns [EObject result] : (temp_businessrule= ruleBusinessRule | temp_uniquerule= ruleUniqueRule );
    public EObject ruleAbstractBusinessRule() throws RecognitionException {
        EObject result = null;
        int ruleAbstractBusinessRule_StartIndex = input.index();
        EObject temp_businessrule = null;

        EObject temp_uniquerule = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:311:9: (temp_businessrule= ruleBusinessRule | temp_uniquerule= ruleUniqueRule )
            int alt18=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==27) ) {
                    alt18=2;
                }
                else if ( (LA18_1==RULE_ID) ) {
                    alt18=1;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("310:1: ruleAbstractBusinessRule returns [EObject result] : (temp_businessrule= ruleBusinessRule | temp_uniquerule= ruleUniqueRule );", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 27:
                {
                alt18=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("310:1: ruleAbstractBusinessRule returns [EObject result] : (temp_businessrule= ruleBusinessRule | temp_uniquerule= ruleUniqueRule );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:311:9: temp_businessrule= ruleBusinessRule
                    {
                    pushFollow(FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule746);
                    temp_businessrule=ruleBusinessRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_businessrule;
                    }

                    }
                    break;
                case 2 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:311:82: temp_uniquerule= ruleUniqueRule
                    {
                    pushFollow(FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule761);
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:313:1: ruleBusinessRule returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' ) ) ;
    public EObject ruleBusinessRule() throws RecognitionException {
        EObject result = null;
        int ruleBusinessRule_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:314:4: ( ( (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:314:4: ( (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:318:1: ( (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:318:2: (temp_description= RULE_STRING )? (temp_name= RULE_ID ) ( ';' )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:318:2: (temp_description= RULE_STRING )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:318:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessRule786); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:321:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:321:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule798); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:324:1: ( ';' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:324:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleBusinessRule807); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:328:1: ruleUniqueRule returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' ) ) ;
    public EObject ruleUniqueRule() throws RecognitionException {
        EObject result = null;
        int ruleUniqueRule_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_properties=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:329:4: ( ( (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:329:4: ( (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "UniqueRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:333:1: ( (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:333:2: (temp_description= RULE_STRING )? ( 'unique' ) (temp_name= RULE_ID ) ( '[' ) (temp_properties= RULE_ID )+ ( ']' ) ( ';' )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:333:2: (temp_description= RULE_STRING )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:333:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUniqueRule834); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:336:1: ( 'unique' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:336:2: 'unique'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,27,FOLLOW_27_in_ruleUniqueRule844); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:338:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:338:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule853); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:341:1: ( '[' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:341:2: '['
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleUniqueRule862); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:343:1: (temp_properties= RULE_ID )+
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
            	    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:343:2: temp_properties= RULE_ID
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    temp_properties=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule871); if (failed) return result;
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:347:1: ( ']' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:347:2: ']'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleUniqueRule882); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:349:1: ( ';' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:349:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleUniqueRule889); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:353:1: ruleInheritanceModifier returns [Object r] : ( 'abstract' | 'final' );
    public Object ruleInheritanceModifier() throws RecognitionException {
        Object r = null;
        int ruleInheritanceModifier_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return r; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:354:4: ( 'abstract' | 'final' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==29) ) {
                alt22=2;
            }
            else {
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("353:1: ruleInheritanceModifier returns [Object r] : ( 'abstract' | 'final' );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:354:4: 'abstract'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)),line(),start());
                    }
                    match(input,28,FOLLOW_28_in_ruleInheritanceModifier914); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "InheritanceModifier","ABSTRACT"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:357:7: 'final'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(2)),line(),start());
                    }
                    match(input,29,FOLLOW_29_in_ruleInheritanceModifier932); if (failed) return r;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:362:1: ruleProperty returns [EObject result] : ( ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' ) ) ;
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:363:4: ( ( ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:363:4: ( ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Property");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:367:1: ( ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:367:2: ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) ) (temp_nullable= 'nullable' )? ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )? ( ';' )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:367:2: ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt23=1;
                    }
                    break;
                case 48:
                    {
                    alt23=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt23=6;
                    }
                    break;
                case 40:
                    {
                    alt23=3;
                    }
                    break;
                case 51:
                    {
                    alt23=5;
                    }
                    break;
                case 36:
                    {
                    alt23=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("367:2: ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) )", 23, 1, input);

                    throw nvae;
                }

                }
                break;
            case 32:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 40:
                {
                alt23=3;
                }
                break;
            case 48:
                {
                alt23=4;
                }
                break;
            case 51:
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
                    new NoViableAltException("367:2: ( (temp_BoolProperty= ruleBoolProperty ) | (temp_StringProperty= ruleStringProperty ) | (temp_DateTimeProperty= ruleDateTimeProperty ) | (temp_IntegerProperty= ruleIntegerProperty ) | (temp_DecimalProperty= ruleDecimalProperty ) | (temp_EnumerationProperty= ruleEnumerationProperty ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:367:3: (temp_BoolProperty= ruleBoolProperty )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:367:3: (temp_BoolProperty= ruleBoolProperty )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:367:4: temp_BoolProperty= ruleBoolProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleBoolProperty_in_ruleProperty962);
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
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:371:1: (temp_StringProperty= ruleStringProperty )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:371:1: (temp_StringProperty= ruleStringProperty )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:371:2: temp_StringProperty= ruleStringProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleStringProperty_in_ruleProperty977);
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
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:375:1: (temp_DateTimeProperty= ruleDateTimeProperty )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:375:1: (temp_DateTimeProperty= ruleDateTimeProperty )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:375:2: temp_DateTimeProperty= ruleDateTimeProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDateTimeProperty_in_ruleProperty992);
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
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:379:1: (temp_IntegerProperty= ruleIntegerProperty )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:379:1: (temp_IntegerProperty= ruleIntegerProperty )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:379:2: temp_IntegerProperty= ruleIntegerProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(3)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleIntegerProperty_in_ruleProperty1007);
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
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:383:1: (temp_DecimalProperty= ruleDecimalProperty )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:383:1: (temp_DecimalProperty= ruleDecimalProperty )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:383:2: temp_DecimalProperty= ruleDecimalProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(4)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleDecimalProperty_in_ruleProperty1022);
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
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:387:1: (temp_EnumerationProperty= ruleEnumerationProperty )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:387:1: (temp_EnumerationProperty= ruleEnumerationProperty )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:387:2: temp_EnumerationProperty= ruleEnumerationProperty
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)).eContents().get(5)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleEnumerationProperty_in_ruleProperty1037);
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:392:1: (temp_nullable= 'nullable' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:392:2: temp_nullable= 'nullable'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_nullable=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleProperty1051); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"nullable",true); ptm.ruleFinished(temp_nullable,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:395:1: ( ( 'persistency' ) (temp_persistency= rulePersistencyMode ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:395:2: ( 'persistency' ) (temp_persistency= rulePersistencyMode )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:395:2: ( 'persistency' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:395:3: 'persistency'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    match(input,31,FOLLOW_31_in_ruleProperty1062); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:397:1: (temp_persistency= rulePersistencyMode )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:397:2: temp_persistency= rulePersistencyMode
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_rulePersistencyMode_in_ruleProperty1071);
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

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:401:1: ( ';' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:401:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,17,FOLLOW_17_in_ruleProperty1083); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:405:1: ruleBoolProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )? ) ;
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:406:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )? ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:406:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BoolProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:410:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )? )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:410:2: (temp_description= RULE_STRING )? (temp_dataType= 'boolean' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )?
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:410:2: (temp_description= RULE_STRING )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:410:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoolProperty1110); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:413:1: (temp_dataType= 'boolean' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:413:2: temp_dataType= 'boolean'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,32,FOLLOW_32_in_ruleBoolProperty1122); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:416:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:416:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolProperty1133); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:419:1: ( (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:419:2: (temp_hasDefault= 'default' ) ( (temp_defaultValue= 'true' ) | ( 'false' ) )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:419:2: (temp_hasDefault= 'default' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:419:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleBoolProperty1145); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:422:1: ( (temp_defaultValue= 'true' ) | ( 'false' ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==34) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==35) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("422:1: ( (temp_defaultValue= 'true' ) | ( 'false' ) )", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:422:2: (temp_defaultValue= 'true' )
                            {
                            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:422:2: (temp_defaultValue= 'true' )
                            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:422:3: temp_defaultValue= 'true'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_defaultValue=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_ruleBoolProperty1157); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"defaultValue",true); ptm.ruleFinished(temp_defaultValue,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:425:1: ( 'false' )
                            {
                            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:425:1: ( 'false' )
                            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:425:2: 'false'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            match(input,35,FOLLOW_35_in_ruleBoolProperty1168); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:431:1: ruleStringProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )? ) ;
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
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:432:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )? ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:432:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StringProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:436:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )? )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:436:2: (temp_description= RULE_STRING )? (temp_dataType= 'string' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ( ( 'minlength' ) (temp_minLength= RULE_INT ) )? ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )? ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )?
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:436:2: (temp_description= RULE_STRING )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:436:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty1200); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:439:1: (temp_dataType= 'string' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:439:2: temp_dataType= 'string'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,36,FOLLOW_36_in_ruleStringProperty1212); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:442:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:442:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringProperty1223); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:445:1: ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:445:2: (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:445:2: (temp_hasDefault= 'default' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:445:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleStringProperty1235); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:448:1: (temp_defaultValue= RULE_STRING )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:448:2: temp_defaultValue= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_defaultValue=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty1246); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"defaultValue",convert(temp_defaultValue),false); ptm.ruleFinished(temp_defaultValue,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:452:1: ( ( 'minlength' ) (temp_minLength= RULE_INT ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:452:2: ( 'minlength' ) (temp_minLength= RULE_INT )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:452:2: ( 'minlength' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:452:3: 'minlength'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,37,FOLLOW_37_in_ruleStringProperty1259); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:454:1: (temp_minLength= RULE_INT )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:454:2: temp_minLength= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_minLength=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty1268); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"minLength",convert(temp_minLength),false); ptm.ruleFinished(temp_minLength,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:458:1: ( ( 'maxlength' ) (temp_maxLength= RULE_INT ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:458:2: ( 'maxlength' ) (temp_maxLength= RULE_INT )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:458:2: ( 'maxlength' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:458:3: 'maxlength'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,38,FOLLOW_38_in_ruleStringProperty1281); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:460:1: (temp_maxLength= RULE_INT )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:460:2: temp_maxLength= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(5)).eContents().get(1)),line(),start());
                    }
                    temp_maxLength=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty1290); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"maxLength",convert(temp_maxLength),false); ptm.ruleFinished(temp_maxLength,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:464:1: ( ( 'regexp' ) (temp_regularExpression= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:464:2: ( 'regexp' ) (temp_regularExpression= RULE_STRING )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:464:2: ( 'regexp' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:464:3: 'regexp'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(6)).eContents().get(0)),line(),start());
                    }
                    match(input,39,FOLLOW_39_in_ruleStringProperty1303); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:466:1: (temp_regularExpression= RULE_STRING )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:466:2: temp_regularExpression= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(6)).eContents().get(1)),line(),start());
                    }
                    temp_regularExpression=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty1312); if (failed) return result;
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
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:472:1: ruleDateTimeProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_accuracy= ruleDateTimeAccuracy ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ) ;
    public EObject ruleDateTimeProperty() throws RecognitionException {
        EObject result = null;
        int ruleDateTimeProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;
        Token temp_hasDefault=null;
        Token temp_defaultValue=null;
        Object temp_accuracy = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:473:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_accuracy= ruleDateTimeAccuracy ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:473:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_accuracy= ruleDateTimeAccuracy ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DateTimeProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:477:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_accuracy= ruleDateTimeAccuracy ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )? )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:477:2: (temp_description= RULE_STRING )? (temp_dataType= 'datetime' ) (temp_accuracy= ruleDateTimeAccuracy ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )?
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:477:2: (temp_description= RULE_STRING )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:477:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty1344); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:480:1: (temp_dataType= 'datetime' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:480:2: temp_dataType= 'datetime'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_ruleDateTimeProperty1356); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:483:1: (temp_accuracy= ruleDateTimeAccuracy )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:483:2: temp_accuracy= ruleDateTimeAccuracy
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            pushFollow(FOLLOW_ruleDateTimeAccuracy_in_ruleDateTimeProperty1367);
            temp_accuracy=ruleDateTimeAccuracy();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"accuracy",convert(temp_accuracy),false); ptm.ruleFinished(temp_accuracy,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:486:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:486:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeProperty1378); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:489:1: ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:489:2: (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_STRING )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:489:2: (temp_hasDefault= 'default' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:489:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleDateTimeProperty1390); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:492:1: (temp_defaultValue= RULE_STRING )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:492:2: temp_defaultValue= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_defaultValue=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty1401); if (failed) return result;
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


    // $ANTLR start ruleDateTimeAccuracy
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:498:1: ruleDateTimeAccuracy returns [Object r] : ( 'month' | 'year' | 'day' | 'hour' | 'minute' | 'second' | 'millisecond' );
    public Object ruleDateTimeAccuracy() throws RecognitionException {
        Object r = null;
        int ruleDateTimeAccuracy_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return r; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:499:4: ( 'month' | 'year' | 'day' | 'hour' | 'minute' | 'second' | 'millisecond' )
            int alt36=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt36=1;
                }
                break;
            case 42:
                {
                alt36=2;
                }
                break;
            case 43:
                {
                alt36=3;
                }
                break;
            case 44:
                {
                alt36=4;
                }
                break;
            case 45:
                {
                alt36=5;
                }
                break;
            case 46:
                {
                alt36=6;
                }
                break;
            case 47:
                {
                alt36=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("498:1: ruleDateTimeAccuracy returns [Object r] : ( 'month' | 'year' | 'day' | 'hour' | 'minute' | 'second' | 'millisecond' );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:499:4: 'month'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)),line(),start());
                    }
                    match(input,41,FOLLOW_41_in_ruleDateTimeAccuracy1431); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "DateTimeAccuracy","Month"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:502:7: 'year'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(2)),line(),start());
                    }
                    match(input,42,FOLLOW_42_in_ruleDateTimeAccuracy1449); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "DateTimeAccuracy","Year"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:505:7: 'day'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(3)),line(),start());
                    }
                    match(input,43,FOLLOW_43_in_ruleDateTimeAccuracy1467); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "DateTimeAccuracy","Day"),end());
                    }

                    }
                    break;
                case 4 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:508:7: 'hour'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(4)),line(),start());
                    }
                    match(input,44,FOLLOW_44_in_ruleDateTimeAccuracy1485); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "DateTimeAccuracy","Hour"),end());
                    }

                    }
                    break;
                case 5 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:511:7: 'minute'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(5)),line(),start());
                    }
                    match(input,45,FOLLOW_45_in_ruleDateTimeAccuracy1503); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "DateTimeAccuracy","Minute"),end());
                    }

                    }
                    break;
                case 6 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:514:7: 'second'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(6)),line(),start());
                    }
                    match(input,46,FOLLOW_46_in_ruleDateTimeAccuracy1521); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "DateTimeAccuracy","Second"),end());
                    }

                    }
                    break;
                case 7 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:517:7: 'millisecond'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(7)),line(),start());
                    }
                    match(input,47,FOLLOW_47_in_ruleDateTimeAccuracy1539); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "DateTimeAccuracy","Millisecond"),end());
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
            if ( backtracking>0 ) { memoize(input, 17, ruleDateTimeAccuracy_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleDateTimeAccuracy


    // $ANTLR start ruleIntegerProperty
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:522:1: ruleIntegerProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )? ) ;
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
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:523:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )? ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:523:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "IntegerProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:527:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )? )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:527:2: (temp_description= RULE_STRING )? (temp_dataType= 'integer' ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )? ( ( 'min' ) (temp_minValue= RULE_INT ) )? ( ( 'max' ) (temp_maxValue= RULE_INT ) )?
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:527:2: (temp_description= RULE_STRING )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:527:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntegerProperty1567); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:530:1: (temp_dataType= 'integer' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:530:2: temp_dataType= 'integer'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,48,FOLLOW_48_in_ruleIntegerProperty1579); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:533:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:533:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerProperty1590); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:536:1: ( (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:536:2: (temp_hasDefault= 'default' ) (temp_defaultValue= RULE_INT )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:536:2: (temp_hasDefault= 'default' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:536:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleIntegerProperty1602); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:539:1: (temp_defaultValue= RULE_INT )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:539:2: temp_defaultValue= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_defaultValue=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty1613); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"defaultValue",convert(temp_defaultValue),false); ptm.ruleFinished(temp_defaultValue,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:543:1: ( ( 'min' ) (temp_minValue= RULE_INT ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:543:2: ( 'min' ) (temp_minValue= RULE_INT )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:543:2: ( 'min' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:543:3: 'min'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,49,FOLLOW_49_in_ruleIntegerProperty1626); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:545:1: (temp_minValue= RULE_INT )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:545:2: temp_minValue= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_minValue=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty1635); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"minValue",convert(temp_minValue),false); ptm.ruleFinished(temp_minValue,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:549:1: ( ( 'max' ) (temp_maxValue= RULE_INT ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:549:2: ( 'max' ) (temp_maxValue= RULE_INT )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:549:2: ( 'max' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:549:3: 'max'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,50,FOLLOW_50_in_ruleIntegerProperty1648); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:551:1: (temp_maxValue= RULE_INT )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:551:2: temp_maxValue= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(5)).eContents().get(1)),line(),start());
                    }
                    temp_maxValue=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty1657); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 18, ruleIntegerProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleIntegerProperty


    // $ANTLR start ruleDecimalProperty
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:557:1: ruleDecimalProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleDecimalProperty() throws RecognitionException {
        EObject result = null;
        int ruleDecimalProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_dataType=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:558:4: ( ( (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:558:4: ( (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DecimalProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:562:1: ( (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:562:2: (temp_description= RULE_STRING )? (temp_dataType= 'decimal' ) (temp_name= RULE_ID )
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:562:2: (temp_description= RULE_STRING )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:562:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalProperty1689); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:565:1: (temp_dataType= 'decimal' )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:565:2: temp_dataType= 'decimal'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_dataType=(Token)input.LT(1);
            match(input,51,FOLLOW_51_in_ruleDecimalProperty1701); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"dataType",convert(temp_dataType),false); ptm.ruleFinished(temp_dataType,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:568:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:568:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecimalProperty1712); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 19, ruleDecimalProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDecimalProperty


    // $ANTLR start ruleEnumerationProperty
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:573:1: ruleEnumerationProperty returns [EObject result] : ( (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )? ) ;
    public EObject ruleEnumerationProperty() throws RecognitionException {
        EObject result = null;
        int ruleEnumerationProperty_StartIndex = input.index();
        Token temp_description=null;
        Token temp_type=null;
        Token temp_name=null;
        Token temp_hasDefault=null;
        Token temp_defaultValueAsString=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return result; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:574:4: ( ( (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )? ) )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:574:4: ( (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "EnumerationProperty");
              				ptm.setModelElement(result);
              			 
            }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:1: ( (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )? )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:2: (temp_description= RULE_STRING )? (temp_type= RULE_ID ) (temp_name= RULE_ID ) ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )?
            {
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:2: (temp_description= RULE_STRING )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:578:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationProperty1741); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:581:1: (temp_type= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:581:2: temp_type= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_type=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty1753); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),true); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:1: (temp_name= RULE_ID )
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:585:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty1765); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:588:1: ( (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:588:2: (temp_hasDefault= 'default' ) (temp_defaultValueAsString= RULE_ID )
                    {
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:588:2: (temp_hasDefault= 'default' )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:588:3: temp_hasDefault= 'default'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_hasDefault=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleEnumerationProperty1777); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"hasDefault",true); ptm.ruleFinished(temp_hasDefault,end()); 
                    }

                    }

                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:1: (temp_defaultValueAsString= RULE_ID )
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:591:2: temp_defaultValueAsString= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(3)).eContents().get(1)),line(),start());
                    }
                    temp_defaultValueAsString=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty1788); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 20, ruleEnumerationProperty_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleEnumerationProperty


    // $ANTLR start rulePersistencyMode
    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:597:1: rulePersistencyMode returns [Object r] : ( 'ReadWrite' | 'Read' | 'NONE' );
    public Object rulePersistencyMode() throws RecognitionException {
        Object r = null;
        int rulePersistencyMode_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return r; }
            // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:598:4: ( 'ReadWrite' | 'Read' | 'NONE' )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt44=1;
                }
                break;
            case 53:
                {
                alt44=2;
                }
                break;
            case 54:
                {
                alt44=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("597:1: rulePersistencyMode returns [Object r] : ( 'ReadWrite' | 'Read' | 'NONE' );", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:598:4: 'ReadWrite'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)),line(),start());
                    }
                    match(input,52,FOLLOW_52_in_rulePersistencyMode1818); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "PersistencyMode","ReadWrite"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:601:7: 'Read'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(2)),line(),start());
                    }
                    match(input,53,FOLLOW_53_in_rulePersistencyMode1836); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "PersistencyMode","Read"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//BusinessDomain.xtext/src-gen//org/mod4j/businessdomain/xtext/parser/BusinessDomainDsl.g:604:7: 'NONE'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(3)),line(),start());
                    }
                    match(input,54,FOLLOW_54_in_rulePersistencyMode1854); if (failed) return r;
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
            if ( backtracking>0 ) { memoize(input, 21, rulePersistencyMode_StartIndex); }
        }
        return r;
    }
    // $ANTLR end rulePersistencyMode


 

    public static final BitSet FOLLOW_ruleBusinessDomainModel_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessDomainModel93 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleBusinessDomainModel103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessDomainModel112 = new BitSet(new long[]{0x0000000002401812L});
    public static final BitSet FOLLOW_ruleBusinessClassReference_in_ruleBusinessDomainModel123 = new BitSet(new long[]{0x0000000002401812L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel135 = new BitSet(new long[]{0x0000000002401012L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel147 = new BitSet(new long[]{0x0000000002001012L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleBusinessDomainModel159 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_11_in_ruleBusinessClassReference187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassReference196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation225 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssociation235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation244 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation255 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssociation265 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation274 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation283 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleAssociation293 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16_in_ruleAssociation304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssociation313 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation322 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssociation361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMultiplicity386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicity404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMultiplicity422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMultiplicity440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessClass468 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBusinessClass478 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass487 = new BitSet(new long[]{0x0000000030802000L});
    public static final BitSet FOLLOW_ruleInheritanceModifier_in_ruleBusinessClass498 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_23_in_ruleBusinessClass509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass518 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBusinessClass531 = new BitSet(new long[]{0x0009011101004030L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleBusinessClass540 = new BitSet(new long[]{0x0009011101004030L});
    public static final BitSet FOLLOW_24_in_ruleBusinessClass551 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBusinessClass558 = new BitSet(new long[]{0x0000000008004030L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass567 = new BitSet(new long[]{0x0000000008004030L});
    public static final BitSet FOLLOW_14_in_ruleBusinessClass577 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBusinessClass587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumeration614 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEnumeration624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration633 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumeration642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration651 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleEnumeration661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral688 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleEnumerationLiteral698 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral707 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnumerationLiteral719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessRule786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule798 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBusinessRule807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUniqueRule834 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUniqueRule844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule853 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUniqueRule862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule871 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleUniqueRule882 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUniqueRule889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInheritanceModifier914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInheritanceModifier932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_ruleProperty962 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_ruleStringProperty_in_ruleProperty977 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_ruleProperty992 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_ruleProperty1007 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_ruleProperty1022 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_ruleProperty1037 = new BitSet(new long[]{0x00000000C0020000L});
    public static final BitSet FOLLOW_30_in_ruleProperty1051 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31_in_ruleProperty1062 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_rulePersistencyMode_in_ruleProperty1071 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProperty1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoolProperty1110 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBoolProperty1122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolProperty1133 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleBoolProperty1145 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleBoolProperty1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBoolProperty1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty1200 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleStringProperty1212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringProperty1223 = new BitSet(new long[]{0x000000E200000002L});
    public static final BitSet FOLLOW_33_in_ruleStringProperty1235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty1246 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringProperty1259 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty1268 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleStringProperty1281 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty1290 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleStringProperty1303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty1344 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleDateTimeProperty1356 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_ruleDateTimeAccuracy_in_ruleDateTimeProperty1367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeProperty1378 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleDateTimeProperty1390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDateTimeAccuracy1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDateTimeAccuracy1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDateTimeAccuracy1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDateTimeAccuracy1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDateTimeAccuracy1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDateTimeAccuracy1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDateTimeAccuracy1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntegerProperty1567 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleIntegerProperty1579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerProperty1590 = new BitSet(new long[]{0x0006000200000002L});
    public static final BitSet FOLLOW_33_in_ruleIntegerProperty1602 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty1613 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIntegerProperty1626 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty1635 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleIntegerProperty1648 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalProperty1689 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDecimalProperty1701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecimalProperty1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationProperty1741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty1753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty1765 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleEnumerationProperty1777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePersistencyMode1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePersistencyMode1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePersistencyMode1854 = new BitSet(new long[]{0x0000000000000002L});

}