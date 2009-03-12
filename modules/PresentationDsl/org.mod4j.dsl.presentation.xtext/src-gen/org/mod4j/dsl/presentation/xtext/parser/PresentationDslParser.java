// $ANTLR 3.0 ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g 2009-03-11 20:36:46

package org.mod4j.dsl.presentation.xtext.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import org.mod4j.dsl.presentation.xtext.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class PresentationDslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'PresentationModel'", "'from'", "'import'", "'ContentForm'", "'using'", "'readonly'", "'true'", "'false'", "';'", "'processes'", "'['", "']'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'AutomatedProcess'", "'InteractiveProcess'", "'formElement'", "'navigate'", "'to'", "'named'", "'LinkStep'", "'LinkPath'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public PresentationDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[67+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g"; }



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
    			if (t.getType() == PresentationDslLexer.RULE_ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==PresentationDslLexer.RULE_STRING) {
    				return s.substring(1,s.length()-1);
    			} else if (t.getType()==PresentationDslLexer.RULE_INT) {
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
    			factory.addImport("", "http://www.mod4j.org/pmfmod");
    		
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
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:122:1: parse returns [Node r] : result= rulePresentationModel EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:123:3: (result= rulePresentationModel EOF )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:123:3: result= rulePresentationModel EOF
            {
            pushFollow(FOLLOW_rulePresentationModel_in_parse67);
            result=rulePresentationModel();
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


    // $ANTLR start rulePresentationModel
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:126:1: rulePresentationModel returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'PresentationModel' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_elements= ruleModelElement )* ) ;
    public EObject rulePresentationModel() throws RecognitionException {
        EObject result = null;
        int rulePresentationModel_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        EObject temp_externalReferences = null;

        EObject temp_elements = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:127:4: ( ( (temp_description= RULE_STRING )? ( 'PresentationModel' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_elements= ruleModelElement )* ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:127:4: ( (temp_description= RULE_STRING )? ( 'PresentationModel' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_elements= ruleModelElement )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "PresentationModel");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:131:1: ( (temp_description= RULE_STRING )? ( 'PresentationModel' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_elements= ruleModelElement )* )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:131:2: (temp_description= RULE_STRING )? ( 'PresentationModel' ) (temp_name= RULE_ID ) (temp_externalReferences= ruleExternalReference )* (temp_elements= ruleModelElement )*
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:131:2: (temp_description= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:131:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePresentationModel93); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:134:1: ( 'PresentationModel' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:134:2: 'PresentationModel'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,10,FOLLOW_10_in_rulePresentationModel103); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:136:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:136:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePresentationModel112); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:139:1: (temp_externalReferences= ruleExternalReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:139:2: temp_externalReferences= ruleExternalReference
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleExternalReference_in_rulePresentationModel123);
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

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:142:1: (temp_elements= ruleModelElement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==13||LA3_0==22||(LA3_0>=24 && LA3_0<=25)||(LA3_0>=28 && LA3_0<=29)||(LA3_0>=34 && LA3_0<=35)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:142:2: temp_elements= ruleModelElement
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleModelElement_in_rulePresentationModel135);
            	    temp_elements=ruleModelElement();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"elements",convert(temp_elements),false); ptm.ruleFinished(temp_elements,end()); 
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
            if ( backtracking>0 ) { memoize(input, 2, rulePresentationModel_StartIndex); }
        }
        return result;
    }
    // $ANTLR end rulePresentationModel


    // $ANTLR start ruleExternalReference
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:147:1: ruleExternalReference returns [EObject result] : ( ( 'from' ) (temp_modelName= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) ;
    public EObject ruleExternalReference() throws RecognitionException {
        EObject result = null;
        int ruleExternalReference_StartIndex = input.index();
        Token temp_modelName=null;
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:148:4: ( ( ( 'from' ) (temp_modelName= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:148:4: ( ( 'from' ) (temp_modelName= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ExternalReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:152:1: ( ( 'from' ) (temp_modelName= RULE_ID ) ( 'import' ) (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:152:2: ( 'from' ) (temp_modelName= RULE_ID ) ( 'import' ) (temp_name= RULE_ID )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:152:2: ( 'from' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:152:3: 'from'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleExternalReference163); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:154:1: (temp_modelName= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:154:2: temp_modelName= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_modelName=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference172); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"modelName",convert(temp_modelName),false); ptm.ruleFinished(temp_modelName,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:157:1: ( 'import' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:157:2: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleExternalReference181); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:159:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:159:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference190); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 3, ruleExternalReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleExternalReference


    // $ANTLR start ruleModelElement
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:164:1: ruleModelElement returns [EObject result] : (temp_uimodelelement= ruleUIModelElement | temp_link= ruleLink );
    public EObject ruleModelElement() throws RecognitionException {
        EObject result = null;
        int ruleModelElement_StartIndex = input.index();
        EObject temp_uimodelelement = null;

        EObject temp_link = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:165:9: (temp_uimodelelement= ruleUIModelElement | temp_link= ruleLink )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13||LA4_1==22||(LA4_1>=24 && LA4_1<=25)||(LA4_1>=28 && LA4_1<=29)) ) {
                    alt4=1;
                }
                else if ( ((LA4_1>=34 && LA4_1<=35)) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("164:1: ruleModelElement returns [EObject result] : (temp_uimodelelement= ruleUIModelElement | temp_link= ruleLink );", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
            case 22:
            case 24:
            case 25:
            case 28:
            case 29:
                {
                alt4=1;
                }
                break;
            case 34:
            case 35:
                {
                alt4=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("164:1: ruleModelElement returns [EObject result] : (temp_uimodelelement= ruleUIModelElement | temp_link= ruleLink );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:165:9: temp_uimodelelement= ruleUIModelElement
                    {
                    pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElement219);
                    temp_uimodelelement=ruleUIModelElement();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_uimodelelement;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:165:88: temp_link= ruleLink
                    {
                    pushFollow(FOLLOW_ruleLink_in_ruleModelElement234);
                    temp_link=ruleLink();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_link;
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
            if ( backtracking>0 ) { memoize(input, 4, ruleModelElement_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleModelElement


    // $ANTLR start ruleUIModelElement
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:167:1: ruleUIModelElement returns [EObject result] : (temp_dialogue= ruleDialogue | temp_process= ruleProcess );
    public EObject ruleUIModelElement() throws RecognitionException {
        EObject result = null;
        int ruleUIModelElement_StartIndex = input.index();
        EObject temp_dialogue = null;

        EObject temp_process = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:168:9: (temp_dialogue= ruleDialogue | temp_process= ruleProcess )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=28 && LA5_1<=29)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==13||LA5_1==22||(LA5_1>=24 && LA5_1<=25)) ) {
                    alt5=1;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("167:1: ruleUIModelElement returns [EObject result] : (temp_dialogue= ruleDialogue | temp_process= ruleProcess );", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
            case 22:
            case 24:
            case 25:
                {
                alt5=1;
                }
                break;
            case 28:
            case 29:
                {
                alt5=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("167:1: ruleUIModelElement returns [EObject result] : (temp_dialogue= ruleDialogue | temp_process= ruleProcess );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:168:9: temp_dialogue= ruleDialogue
                    {
                    pushFollow(FOLLOW_ruleDialogue_in_ruleUIModelElement259);
                    temp_dialogue=ruleDialogue();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_dialogue;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:168:70: temp_process= ruleProcess
                    {
                    pushFollow(FOLLOW_ruleProcess_in_ruleUIModelElement274);
                    temp_process=ruleProcess();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_process;
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
            if ( backtracking>0 ) { memoize(input, 5, ruleUIModelElement_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleUIModelElement


    // $ANTLR start ruleDialogue
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:170:1: ruleDialogue returns [EObject result] : (temp_contentform= ruleContentForm | temp_compounddialogue= ruleCompoundDialogue );
    public EObject ruleDialogue() throws RecognitionException {
        EObject result = null;
        int ruleDialogue_StartIndex = input.index();
        EObject temp_contentform = null;

        EObject temp_compounddialogue = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:171:9: (temp_contentform= ruleContentForm | temp_compounddialogue= ruleCompoundDialogue )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==22||(LA6_1>=24 && LA6_1<=25)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==13) ) {
                    alt6=1;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("170:1: ruleDialogue returns [EObject result] : (temp_contentform= ruleContentForm | temp_compounddialogue= ruleCompoundDialogue );", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt6=1;
                }
                break;
            case 22:
            case 24:
            case 25:
                {
                alt6=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("170:1: ruleDialogue returns [EObject result] : (temp_contentform= ruleContentForm | temp_compounddialogue= ruleCompoundDialogue );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:171:9: temp_contentform= ruleContentForm
                    {
                    pushFollow(FOLLOW_ruleContentForm_in_ruleDialogue299);
                    temp_contentform=ruleContentForm();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_contentform;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:171:79: temp_compounddialogue= ruleCompoundDialogue
                    {
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_ruleDialogue314);
                    temp_compounddialogue=ruleCompoundDialogue();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_compounddialogue;
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
            if ( backtracking>0 ) { memoize(input, 6, ruleDialogue_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDialogue


    // $ANTLR start ruleContentForm
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:173:1: ruleContentForm returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'ContentForm' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? (temp_formElements= ruleFormElement )* ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) ;
    public EObject ruleContentForm() throws RecognitionException {
        EObject result = null;
        int ruleContentForm_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_contextRef=null;
        Token temp_readonly=null;
        EObject temp_formElements = null;

        EObject temp_processes = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:174:4: ( ( (temp_description= RULE_STRING )? ( 'ContentForm' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? (temp_formElements= ruleFormElement )* ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:174:4: ( (temp_description= RULE_STRING )? ( 'ContentForm' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? (temp_formElements= ruleFormElement )* ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ContentForm");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:178:1: ( (temp_description= RULE_STRING )? ( 'ContentForm' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? (temp_formElements= ruleFormElement )* ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:178:2: (temp_description= RULE_STRING )? ( 'ContentForm' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? (temp_formElements= ruleFormElement )* ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )?
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:178:2: (temp_description= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:178:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContentForm339); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:181:1: ( 'ContentForm' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:181:2: 'ContentForm'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleContentForm349); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:183:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:183:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm358); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:186:1: ( 'using' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:186:2: 'using'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleContentForm367); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:188:1: (temp_contextRef= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:188:2: temp_contextRef= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_contextRef=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm376); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:192:1: ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:192:2: ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:192:2: ( 'readonly' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:192:3: 'readonly'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleContentForm387); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:194:1: ( (temp_readonly= 'true' ) | ( 'false' ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==16) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==17) ) {
                        alt8=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("194:1: ( (temp_readonly= 'true' ) | ( 'false' ) )", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:194:2: (temp_readonly= 'true' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:194:2: (temp_readonly= 'true' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:194:3: temp_readonly= 'true'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_readonly=(Token)input.LT(1);
                            match(input,16,FOLLOW_16_in_ruleContentForm397); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:197:1: ( 'false' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:197:1: ( 'false' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:197:2: 'false'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            match(input,17,FOLLOW_17_in_ruleContentForm408); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }


                            }
                            break;

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:200:1: ( ';' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:200:2: ';'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)).eContents().get(2)),line(),start());
                    }
                    match(input,18,FOLLOW_18_in_ruleContentForm417); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:203:1: (temp_formElements= ruleFormElement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:203:2: temp_formElements= ruleFormElement
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(6)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleFormElement_in_ruleContentForm429);
            	    temp_formElements=ruleFormElement();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"formElements",convert(temp_formElements),false); ptm.ruleFinished(temp_formElements,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:206:1: ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:206:2: ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:206:2: ( 'processes' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:206:3: 'processes'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());
                    }
                    match(input,19,FOLLOW_19_in_ruleContentForm440); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:208:1: ( '[' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:208:2: '['
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());
                    }
                    match(input,20,FOLLOW_20_in_ruleContentForm447); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:210:1: (temp_processes= ruleProcessCall )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:210:2: temp_processes= ruleProcessCall
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)).eContents().get(2)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleContentForm456);
                    	    temp_processes=ruleProcessCall();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      factory.add(result,"processes",convert(temp_processes),false); ptm.ruleFinished(temp_processes,end()); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:213:1: ( ']' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:213:2: ']'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)).eContents().get(3)),line(),start());
                    }
                    match(input,21,FOLLOW_21_in_ruleContentForm466); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 7, ruleContentForm_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleContentForm


    // $ANTLR start ruleCompoundDialogue
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:218:1: ruleCompoundDialogue returns [EObject result] : ( ( (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) | (temp_CollectionDialogue= ruleCollectionDialogue ) | (temp_MasterDetail= ruleMasterDetail ) ) ;
    public EObject ruleCompoundDialogue() throws RecognitionException {
        EObject result = null;
        int ruleCompoundDialogue_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_contextRef=null;
        Token temp_readonly=null;
        EObject temp_dialogues = null;

        EObject temp_processes = null;

        EObject temp_CollectionDialogue = null;

        EObject temp_MasterDetail = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:219:4: ( ( ( (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) | (temp_CollectionDialogue= ruleCollectionDialogue ) | (temp_MasterDetail= ruleMasterDetail ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:219:4: ( ( (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) | (temp_CollectionDialogue= ruleCollectionDialogue ) | (temp_MasterDetail= ruleMasterDetail ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CompoundDialogue");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:223:1: ( ( (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) | (temp_CollectionDialogue= ruleCollectionDialogue ) | (temp_MasterDetail= ruleMasterDetail ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt20=1;
                    }
                    break;
                case 24:
                    {
                    alt20=2;
                    }
                    break;
                case 25:
                    {
                    alt20=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("223:1: ( ( (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) | (temp_CollectionDialogue= ruleCollectionDialogue ) | (temp_MasterDetail= ruleMasterDetail ) )", 20, 1, input);

                    throw nvae;
                }

                }
                break;
            case 22:
                {
                alt20=1;
                }
                break;
            case 24:
                {
                alt20=2;
                }
                break;
            case 25:
                {
                alt20=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("223:1: ( ( (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) | (temp_CollectionDialogue= ruleCollectionDialogue ) | (temp_MasterDetail= ruleMasterDetail ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:223:2: ( (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:223:2: ( (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:223:3: (temp_description= RULE_STRING )? ( 'CompoundDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )?
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:223:3: (temp_description= RULE_STRING )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:223:4: temp_description= RULE_STRING
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                            }
                            temp_description=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompoundDialogue497); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                            }

                            }
                            break;

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:226:1: ( 'CompoundDialogue' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:226:2: 'CompoundDialogue'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());
                    }
                    match(input,22,FOLLOW_22_in_ruleCompoundDialogue507); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:228:1: (temp_name= RULE_ID )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:228:2: temp_name= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue516); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:231:1: ( 'using' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:231:2: 'using'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(3)),line(),start());
                    }
                    match(input,14,FOLLOW_14_in_ruleCompoundDialogue525); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:233:1: (temp_contextRef= RULE_ID )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:233:2: temp_contextRef= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(4)),line(),start());
                    }
                    temp_contextRef=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue534); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); 
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:237:1: ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==15) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:237:2: ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:237:2: ( 'readonly' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:237:3: 'readonly'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(5)).eContents().get(0)),line(),start());
                            }
                            match(input,15,FOLLOW_15_in_ruleCompoundDialogue545); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }

                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:239:1: ( (temp_readonly= 'true' ) | ( 'false' ) )
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==16) ) {
                                alt14=1;
                            }
                            else if ( (LA14_0==17) ) {
                                alt14=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return result;}
                                NoViableAltException nvae =
                                    new NoViableAltException("239:1: ( (temp_readonly= 'true' ) | ( 'false' ) )", 14, 0, input);

                                throw nvae;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:239:2: (temp_readonly= 'true' )
                                    {
                                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:239:2: (temp_readonly= 'true' )
                                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:239:3: temp_readonly= 'true'
                                    {
                                    if ( backtracking==0 ) {
                                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
                                    }
                                    temp_readonly=(Token)input.LT(1);
                                    match(input,16,FOLLOW_16_in_ruleCompoundDialogue555); if (failed) return result;
                                    if ( backtracking==0 ) {
                                      factory.set(result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); 
                                    }

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:242:1: ( 'false' )
                                    {
                                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:242:1: ( 'false' )
                                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:242:2: 'false'
                                    {
                                    if ( backtracking==0 ) {
                                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
                                    }
                                    match(input,17,FOLLOW_17_in_ruleCompoundDialogue566); if (failed) return result;
                                    if ( backtracking==0 ) {
                                      ptm.ruleFinished(getLastToken(),end());
                                    }

                                    }


                                    }
                                    break;

                            }

                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:245:1: ( ';' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:245:2: ';'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(5)).eContents().get(2)),line(),start());
                            }
                            match(input,18,FOLLOW_18_in_ruleCompoundDialogue575); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }


                            }
                            break;

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:248:1: ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==23) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:248:2: ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:248:2: ( 'dialogues' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:248:3: 'dialogues'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(6)).eContents().get(0)),line(),start());
                            }
                            match(input,23,FOLLOW_23_in_ruleCompoundDialogue586); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }

                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:250:1: ( '[' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:250:2: '['
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(6)).eContents().get(1)),line(),start());
                            }
                            match(input,20,FOLLOW_20_in_ruleCompoundDialogue593); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }

                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:252:1: (temp_dialogues= ruleDialogueCall )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==RULE_ID||LA16_0==31) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:252:2: temp_dialogues= ruleDialogueCall
                            	    {
                            	    if ( backtracking==0 ) {
                            	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(6)).eContents().get(2)),line(),start());
                            	    }
                            	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue602);
                            	    temp_dialogues=ruleDialogueCall();
                            	    _fsp--;
                            	    if (failed) return result;
                            	    if ( backtracking==0 ) {
                            	      factory.add(result,"dialogues",convert(temp_dialogues),false); ptm.ruleFinished(temp_dialogues,end()); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);

                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:255:1: ( ']' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:255:2: ']'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(6)).eContents().get(3)),line(),start());
                            }
                            match(input,21,FOLLOW_21_in_ruleCompoundDialogue612); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }


                            }
                            break;

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:258:1: ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==19) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:258:2: ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:258:2: ( 'processes' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:258:3: 'processes'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(7)).eContents().get(0)),line(),start());
                            }
                            match(input,19,FOLLOW_19_in_ruleCompoundDialogue623); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }

                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:260:1: ( '[' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:260:2: '['
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(7)).eContents().get(1)),line(),start());
                            }
                            match(input,20,FOLLOW_20_in_ruleCompoundDialogue630); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }

                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:262:1: (temp_processes= ruleProcessCall )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_ID) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:262:2: temp_processes= ruleProcessCall
                            	    {
                            	    if ( backtracking==0 ) {
                            	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(7)).eContents().get(2)),line(),start());
                            	    }
                            	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCompoundDialogue639);
                            	    temp_processes=ruleProcessCall();
                            	    _fsp--;
                            	    if (failed) return result;
                            	    if ( backtracking==0 ) {
                            	      factory.add(result,"processes",convert(temp_processes),false); ptm.ruleFinished(temp_processes,end()); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:265:1: ( ']' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:265:2: ']'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)).eContents().get(7)).eContents().get(3)),line(),start());
                            }
                            match(input,21,FOLLOW_21_in_ruleCompoundDialogue649); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:269:1: (temp_CollectionDialogue= ruleCollectionDialogue )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:269:1: (temp_CollectionDialogue= ruleCollectionDialogue )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:269:2: temp_CollectionDialogue= ruleCollectionDialogue
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue666);
                    temp_CollectionDialogue=ruleCollectionDialogue();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_CollectionDialogue;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;
                case 3 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:273:1: (temp_MasterDetail= ruleMasterDetail )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:273:1: (temp_MasterDetail= ruleMasterDetail )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:273:2: temp_MasterDetail= ruleMasterDetail
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue681);
                    temp_MasterDetail=ruleMasterDetail();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_MasterDetail;
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, ruleCompoundDialogue_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCompoundDialogue


    // $ANTLR start ruleCollectionDialogue
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:279:1: ruleCollectionDialogue returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'CollectionDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) ;
    public EObject ruleCollectionDialogue() throws RecognitionException {
        EObject result = null;
        int ruleCollectionDialogue_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_contextRef=null;
        Token temp_readonly=null;
        EObject temp_dialogues = null;

        EObject temp_processes = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:280:4: ( ( (temp_description= RULE_STRING )? ( 'CollectionDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:280:4: ( (temp_description= RULE_STRING )? ( 'CollectionDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "CollectionDialogue");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:284:1: ( (temp_description= RULE_STRING )? ( 'CollectionDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:284:2: (temp_description= RULE_STRING )? ( 'CollectionDialogue' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )? ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )?
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:284:2: (temp_description= RULE_STRING )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:284:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollectionDialogue711); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:287:1: ( 'CollectionDialogue' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:287:2: 'CollectionDialogue'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,24,FOLLOW_24_in_ruleCollectionDialogue721); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:289:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:289:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue730); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:292:1: ( 'using' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:292:2: 'using'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleCollectionDialogue739); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:294:1: (temp_contextRef= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:294:2: temp_contextRef= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_contextRef=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue748); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:298:1: ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:298:2: ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:298:2: ( 'readonly' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:298:3: 'readonly'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleCollectionDialogue759); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:300:1: ( (temp_readonly= 'true' ) | ( 'false' ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==16) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==17) ) {
                        alt22=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("300:1: ( (temp_readonly= 'true' ) | ( 'false' ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:300:2: (temp_readonly= 'true' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:300:2: (temp_readonly= 'true' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:300:3: temp_readonly= 'true'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_readonly=(Token)input.LT(1);
                            match(input,16,FOLLOW_16_in_ruleCollectionDialogue769); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:303:1: ( 'false' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:303:1: ( 'false' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:303:2: 'false'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            match(input,17,FOLLOW_17_in_ruleCollectionDialogue780); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }


                            }
                            break;

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:306:1: ( ';' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:306:2: ';'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)).eContents().get(2)),line(),start());
                    }
                    match(input,18,FOLLOW_18_in_ruleCollectionDialogue789); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:309:1: ( ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:309:2: ( 'dialogues' ) ( '[' ) (temp_dialogues= ruleDialogueCall )* ( ']' )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:309:2: ( 'dialogues' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:309:3: 'dialogues'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(0)),line(),start());
                    }
                    match(input,23,FOLLOW_23_in_ruleCollectionDialogue800); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:311:1: ( '[' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:311:2: '['
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(1)),line(),start());
                    }
                    match(input,20,FOLLOW_20_in_ruleCollectionDialogue807); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:313:1: (temp_dialogues= ruleDialogueCall )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==31) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:313:2: temp_dialogues= ruleDialogueCall
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(2)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue816);
                    	    temp_dialogues=ruleDialogueCall();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      factory.add(result,"dialogues",convert(temp_dialogues),false); ptm.ruleFinished(temp_dialogues,end()); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:316:1: ( ']' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:316:2: ']'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)).eContents().get(3)),line(),start());
                    }
                    match(input,21,FOLLOW_21_in_ruleCollectionDialogue826); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:319:1: ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:319:2: ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:319:2: ( 'processes' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:319:3: 'processes'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(0)),line(),start());
                    }
                    match(input,19,FOLLOW_19_in_ruleCollectionDialogue837); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:321:1: ( '[' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:321:2: '['
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(1)),line(),start());
                    }
                    match(input,20,FOLLOW_20_in_ruleCollectionDialogue844); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:323:1: (temp_processes= ruleProcessCall )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:323:2: temp_processes= ruleProcessCall
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(2)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCollectionDialogue853);
                    	    temp_processes=ruleProcessCall();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      factory.add(result,"processes",convert(temp_processes),false); ptm.ruleFinished(temp_processes,end()); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:326:1: ( ']' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:326:2: ']'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)).eContents().get(3)),line(),start());
                    }
                    match(input,21,FOLLOW_21_in_ruleCollectionDialogue863); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 9, ruleCollectionDialogue_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCollectionDialogue


    // $ANTLR start ruleMasterDetail
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:331:1: ruleMasterDetail returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'MasterDetail' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( 'master' ) (temp_master= ruleDialogueCall ) ( ';' ) ( 'detail' ) (temp_detail= ruleDialogueCall ) ( ';' ) ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) ;
    public EObject ruleMasterDetail() throws RecognitionException {
        EObject result = null;
        int ruleMasterDetail_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_contextRef=null;
        Token temp_readonly=null;
        EObject temp_master = null;

        EObject temp_detail = null;

        EObject temp_processes = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:332:4: ( ( (temp_description= RULE_STRING )? ( 'MasterDetail' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( 'master' ) (temp_master= ruleDialogueCall ) ( ';' ) ( 'detail' ) (temp_detail= ruleDialogueCall ) ( ';' ) ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:332:4: ( (temp_description= RULE_STRING )? ( 'MasterDetail' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( 'master' ) (temp_master= ruleDialogueCall ) ( ';' ) ( 'detail' ) (temp_detail= ruleDialogueCall ) ( ';' ) ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "MasterDetail");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:336:1: ( (temp_description= RULE_STRING )? ( 'MasterDetail' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( 'master' ) (temp_master= ruleDialogueCall ) ( ';' ) ( 'detail' ) (temp_detail= ruleDialogueCall ) ( ';' ) ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )? )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:336:2: (temp_description= RULE_STRING )? ( 'MasterDetail' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )? ( 'master' ) (temp_master= ruleDialogueCall ) ( ';' ) ( 'detail' ) (temp_detail= ruleDialogueCall ) ( ';' ) ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )?
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:336:2: (temp_description= RULE_STRING )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:336:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMasterDetail893); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:339:1: ( 'MasterDetail' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:339:2: 'MasterDetail'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,25,FOLLOW_25_in_ruleMasterDetail903); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:341:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:341:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail912); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:344:1: ( 'using' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:344:2: 'using'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleMasterDetail921); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:346:1: (temp_contextRef= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:346:2: temp_contextRef= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_contextRef=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail930); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:350:1: ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:350:2: ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) ( ';' )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:350:2: ( 'readonly' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:350:3: 'readonly'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleMasterDetail941); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:352:1: ( (temp_readonly= 'true' ) | ( 'false' ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==16) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==17) ) {
                        alt29=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("352:1: ( (temp_readonly= 'true' ) | ( 'false' ) )", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:352:2: (temp_readonly= 'true' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:352:2: (temp_readonly= 'true' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:352:3: temp_readonly= 'true'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_readonly=(Token)input.LT(1);
                            match(input,16,FOLLOW_16_in_ruleMasterDetail951); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:355:1: ( 'false' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:355:1: ( 'false' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:355:2: 'false'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            match(input,17,FOLLOW_17_in_ruleMasterDetail962); if (failed) return result;
                            if ( backtracking==0 ) {
                              ptm.ruleFinished(getLastToken(),end());
                            }

                            }


                            }
                            break;

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:358:1: ( ';' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:358:2: ';'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)).eContents().get(2)),line(),start());
                    }
                    match(input,18,FOLLOW_18_in_ruleMasterDetail971); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:361:1: ( 'master' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:361:2: 'master'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,26,FOLLOW_26_in_ruleMasterDetail981); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:363:1: (temp_master= ruleDialogueCall )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:363:2: temp_master= ruleDialogueCall
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(7)),line(),start());
            }
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail990);
            temp_master=ruleDialogueCall();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"master",convert(temp_master),false); ptm.ruleFinished(temp_master,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:366:1: ( ';' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:366:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(8)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleMasterDetail999); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:368:1: ( 'detail' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:368:2: 'detail'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(9)),line(),start());
            }
            match(input,27,FOLLOW_27_in_ruleMasterDetail1006); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:370:1: (temp_detail= ruleDialogueCall )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:370:2: temp_detail= ruleDialogueCall
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(10)),line(),start());
            }
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail1015);
            temp_detail=ruleDialogueCall();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"detail",convert(temp_detail),false); ptm.ruleFinished(temp_detail,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:373:1: ( ';' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:373:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(11)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleMasterDetail1024); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:375:1: ( ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:375:2: ( 'processes' ) ( '[' ) (temp_processes= ruleProcessCall )* ( ']' )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:375:2: ( 'processes' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:375:3: 'processes'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(12)).eContents().get(0)),line(),start());
                    }
                    match(input,19,FOLLOW_19_in_ruleMasterDetail1032); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:377:1: ( '[' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:377:2: '['
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(12)).eContents().get(1)),line(),start());
                    }
                    match(input,20,FOLLOW_20_in_ruleMasterDetail1039); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:379:1: (temp_processes= ruleProcessCall )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:379:2: temp_processes= ruleProcessCall
                    	    {
                    	    if ( backtracking==0 ) {
                    	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(12)).eContents().get(2)),line(),start());
                    	    }
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleMasterDetail1048);
                    	    temp_processes=ruleProcessCall();
                    	    _fsp--;
                    	    if (failed) return result;
                    	    if ( backtracking==0 ) {
                    	      factory.add(result,"processes",convert(temp_processes),false); ptm.ruleFinished(temp_processes,end()); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:382:1: ( ']' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:382:2: ']'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(12)).eContents().get(3)),line(),start());
                    }
                    match(input,21,FOLLOW_21_in_ruleMasterDetail1058); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 10, ruleMasterDetail_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleMasterDetail


    // $ANTLR start ruleProcess
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:387:1: ruleProcess returns [EObject result] : (temp_automatedprocess= ruleAutomatedProcess | temp_interactiveprocess= ruleInteractiveProcess );
    public EObject ruleProcess() throws RecognitionException {
        EObject result = null;
        int ruleProcess_StartIndex = input.index();
        EObject temp_automatedprocess = null;

        EObject temp_interactiveprocess = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:388:9: (temp_automatedprocess= ruleAutomatedProcess | temp_interactiveprocess= ruleInteractiveProcess )
            int alt33=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==29) ) {
                    alt33=2;
                }
                else if ( (LA33_1==28) ) {
                    alt33=1;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("387:1: ruleProcess returns [EObject result] : (temp_automatedprocess= ruleAutomatedProcess | temp_interactiveprocess= ruleInteractiveProcess );", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt33=1;
                }
                break;
            case 29:
                {
                alt33=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("387:1: ruleProcess returns [EObject result] : (temp_automatedprocess= ruleAutomatedProcess | temp_interactiveprocess= ruleInteractiveProcess );", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:388:9: temp_automatedprocess= ruleAutomatedProcess
                    {
                    pushFollow(FOLLOW_ruleAutomatedProcess_in_ruleProcess1088);
                    temp_automatedprocess=ruleAutomatedProcess();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_automatedprocess;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:388:94: temp_interactiveprocess= ruleInteractiveProcess
                    {
                    pushFollow(FOLLOW_ruleInteractiveProcess_in_ruleProcess1103);
                    temp_interactiveprocess=ruleInteractiveProcess();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_interactiveprocess;
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
            if ( backtracking>0 ) { memoize(input, 11, ruleProcess_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleProcess


    // $ANTLR start ruleAutomatedProcess
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:390:1: ruleAutomatedProcess returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'AutomatedProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ) ;
    public EObject ruleAutomatedProcess() throws RecognitionException {
        EObject result = null;
        int ruleAutomatedProcess_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_contextRef=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:391:4: ( ( (temp_description= RULE_STRING )? ( 'AutomatedProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:391:4: ( (temp_description= RULE_STRING )? ( 'AutomatedProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AutomatedProcess");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:395:1: ( (temp_description= RULE_STRING )? ( 'AutomatedProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:395:2: (temp_description= RULE_STRING )? ( 'AutomatedProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:395:2: (temp_description= RULE_STRING )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:395:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAutomatedProcess1128); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:398:1: ( 'AutomatedProcess' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:398:2: 'AutomatedProcess'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,28,FOLLOW_28_in_ruleAutomatedProcess1138); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:400:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:400:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAutomatedProcess1147); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:403:1: ( 'using' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:403:2: 'using'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleAutomatedProcess1156); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:405:1: (temp_contextRef= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:405:2: temp_contextRef= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_contextRef=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAutomatedProcess1165); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); 
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
            if ( backtracking>0 ) { memoize(input, 12, ruleAutomatedProcess_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAutomatedProcess


    // $ANTLR start ruleInteractiveProcess
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:411:1: ruleInteractiveProcess returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'InteractiveProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ) ;
    public EObject ruleInteractiveProcess() throws RecognitionException {
        EObject result = null;
        int ruleInteractiveProcess_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_contextRef=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:412:4: ( ( (temp_description= RULE_STRING )? ( 'InteractiveProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:412:4: ( (temp_description= RULE_STRING )? ( 'InteractiveProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "InteractiveProcess");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:416:1: ( (temp_description= RULE_STRING )? ( 'InteractiveProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:416:2: (temp_description= RULE_STRING )? ( 'InteractiveProcess' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:416:2: (temp_description= RULE_STRING )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:416:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInteractiveProcess1195); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:419:1: ( 'InteractiveProcess' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:419:2: 'InteractiveProcess'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,29,FOLLOW_29_in_ruleInteractiveProcess1205); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:421:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:421:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractiveProcess1214); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:424:1: ( 'using' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:424:2: 'using'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleInteractiveProcess1223); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:426:1: (temp_contextRef= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:426:2: temp_contextRef= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_contextRef=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractiveProcess1232); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); 
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
            if ( backtracking>0 ) { memoize(input, 13, ruleInteractiveProcess_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleInteractiveProcess


    // $ANTLR start ruleFormElement
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:432:1: ruleFormElement returns [EObject result] : ( ( 'formElement' ) ( ( 'navigate' ) (temp_LinkRef= ruleLinkRef ) ( 'to' ) )? (temp_references= ruleDtoPropertyReference ) ( 'named' ) (temp_name= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) )? ( ';' ) ) ;
    public EObject ruleFormElement() throws RecognitionException {
        EObject result = null;
        int ruleFormElement_StartIndex = input.index();
        Token temp_name=null;
        Token temp_readonly=null;
        EObject temp_LinkRef = null;

        EObject temp_references = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:433:4: ( ( ( 'formElement' ) ( ( 'navigate' ) (temp_LinkRef= ruleLinkRef ) ( 'to' ) )? (temp_references= ruleDtoPropertyReference ) ( 'named' ) (temp_name= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) )? ( ';' ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:433:4: ( ( 'formElement' ) ( ( 'navigate' ) (temp_LinkRef= ruleLinkRef ) ( 'to' ) )? (temp_references= ruleDtoPropertyReference ) ( 'named' ) (temp_name= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FormElement");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:437:1: ( ( 'formElement' ) ( ( 'navigate' ) (temp_LinkRef= ruleLinkRef ) ( 'to' ) )? (temp_references= ruleDtoPropertyReference ) ( 'named' ) (temp_name= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) )? ( ';' ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:437:2: ( 'formElement' ) ( ( 'navigate' ) (temp_LinkRef= ruleLinkRef ) ( 'to' ) )? (temp_references= ruleDtoPropertyReference ) ( 'named' ) (temp_name= RULE_ID ) ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) )? ( ';' )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:437:2: ( 'formElement' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:437:3: 'formElement'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,30,FOLLOW_30_in_ruleFormElement1260); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:439:1: ( ( 'navigate' ) (temp_LinkRef= ruleLinkRef ) ( 'to' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:439:2: ( 'navigate' ) (temp_LinkRef= ruleLinkRef ) ( 'to' )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:439:2: ( 'navigate' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:439:3: 'navigate'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    match(input,31,FOLLOW_31_in_ruleFormElement1268); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:441:1: (temp_LinkRef= ruleLinkRef )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:441:2: temp_LinkRef= ruleLinkRef
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleLinkRef_in_ruleFormElement1278);
                    temp_LinkRef=ruleLinkRef();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_LinkRef;
                    }
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:445:1: ( 'to' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:445:2: 'to'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    match(input,32,FOLLOW_32_in_ruleFormElement1288); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:448:1: (temp_references= ruleDtoPropertyReference )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:448:2: temp_references= ruleDtoPropertyReference
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_ruleFormElement1300);
            temp_references=ruleDtoPropertyReference();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"references",convert(temp_references),false); ptm.ruleFinished(temp_references,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:451:1: ( 'named' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:451:2: 'named'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,33,FOLLOW_33_in_ruleFormElement1309); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:453:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:453:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormElement1318); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:456:1: ( ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:456:2: ( 'readonly' ) ( (temp_readonly= 'true' ) | ( 'false' ) )
                    {
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:456:2: ( 'readonly' )
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:456:3: 'readonly'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleFormElement1328); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:458:1: ( (temp_readonly= 'true' ) | ( 'false' ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==16) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==17) ) {
                        alt37=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("458:1: ( (temp_readonly= 'true' ) | ( 'false' ) )", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:458:2: (temp_readonly= 'true' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:458:2: (temp_readonly= 'true' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:458:3: temp_readonly= 'true'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_readonly=(Token)input.LT(1);
                            match(input,16,FOLLOW_16_in_ruleFormElement1338); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"readonly",true); ptm.ruleFinished(temp_readonly,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:461:1: ( 'false' )
                            {
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:461:1: ( 'false' )
                            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:461:2: 'false'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            match(input,17,FOLLOW_17_in_ruleFormElement1349); if (failed) return result;
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

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:465:1: ( ';' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:465:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleFormElement1361); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 14, ruleFormElement_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFormElement


    // $ANTLR start ruleDialogueCall
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:469:1: ruleDialogueCall returns [EObject result] : (temp_directdialoguecall= ruleDirectDialogueCall | temp_linkeddialoguecall= ruleLinkedDialogueCall );
    public EObject ruleDialogueCall() throws RecognitionException {
        EObject result = null;
        int ruleDialogueCall_StartIndex = input.index();
        EObject temp_directdialoguecall = null;

        EObject temp_linkeddialoguecall = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:470:9: (temp_directdialoguecall= ruleDirectDialogueCall | temp_linkeddialoguecall= ruleLinkedDialogueCall )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==31) ) {
                alt39=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("469:1: ruleDialogueCall returns [EObject result] : (temp_directdialoguecall= ruleDirectDialogueCall | temp_linkeddialoguecall= ruleLinkedDialogueCall );", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:470:9: temp_directdialoguecall= ruleDirectDialogueCall
                    {
                    pushFollow(FOLLOW_ruleDirectDialogueCall_in_ruleDialogueCall1388);
                    temp_directdialoguecall=ruleDirectDialogueCall();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_directdialoguecall;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:470:100: temp_linkeddialoguecall= ruleLinkedDialogueCall
                    {
                    pushFollow(FOLLOW_ruleLinkedDialogueCall_in_ruleDialogueCall1403);
                    temp_linkeddialoguecall=ruleLinkedDialogueCall();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_linkeddialoguecall;
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
            if ( backtracking>0 ) { memoize(input, 15, ruleDialogueCall_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDialogueCall


    // $ANTLR start ruleLinkedDialogueCall
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:472:1: ruleLinkedDialogueCall returns [EObject result] : ( ( 'navigate' ) (temp_link= ruleLinkRef ) ( 'to' ) (temp_name= RULE_ID ) ( ';' ) ) ;
    public EObject ruleLinkedDialogueCall() throws RecognitionException {
        EObject result = null;
        int ruleLinkedDialogueCall_StartIndex = input.index();
        Token temp_name=null;
        EObject temp_link = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:473:4: ( ( ( 'navigate' ) (temp_link= ruleLinkRef ) ( 'to' ) (temp_name= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:473:4: ( ( 'navigate' ) (temp_link= ruleLinkRef ) ( 'to' ) (temp_name= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "LinkedDialogueCall");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:477:1: ( ( 'navigate' ) (temp_link= ruleLinkRef ) ( 'to' ) (temp_name= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:477:2: ( 'navigate' ) (temp_link= ruleLinkRef ) ( 'to' ) (temp_name= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:477:2: ( 'navigate' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:477:3: 'navigate'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,31,FOLLOW_31_in_ruleLinkedDialogueCall1426); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:479:1: (temp_link= ruleLinkRef )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:479:2: temp_link= ruleLinkRef
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            pushFollow(FOLLOW_ruleLinkRef_in_ruleLinkedDialogueCall1435);
            temp_link=ruleLinkRef();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"link",convert(temp_link),false); ptm.ruleFinished(temp_link,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:482:1: ( 'to' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:482:2: 'to'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,32,FOLLOW_32_in_ruleLinkedDialogueCall1444); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:484:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:484:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedDialogueCall1453); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:487:1: ( ';' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:487:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleLinkedDialogueCall1462); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 16, ruleLinkedDialogueCall_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleLinkedDialogueCall


    // $ANTLR start ruleDirectDialogueCall
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:491:1: ruleDirectDialogueCall returns [EObject result] : ( (temp_name= RULE_ID ) ( ';' ) ) ;
    public EObject ruleDirectDialogueCall() throws RecognitionException {
        EObject result = null;
        int ruleDirectDialogueCall_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:492:4: ( ( (temp_name= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:492:4: ( (temp_name= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DirectDialogueCall");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:496:1: ( (temp_name= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:496:2: (temp_name= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:496:2: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:496:3: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectDialogueCall1489); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:499:1: ( ';' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:499:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleDirectDialogueCall1498); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 17, ruleDirectDialogueCall_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDirectDialogueCall


    // $ANTLR start ruleProcessCall
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:503:1: ruleProcessCall returns [EObject result] : ( (temp_name= RULE_ID ) ( ';' ) ) ;
    public EObject ruleProcessCall() throws RecognitionException {
        EObject result = null;
        int ruleProcessCall_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:504:4: ( ( (temp_name= RULE_ID ) ( ';' ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:504:4: ( (temp_name= RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ProcessCall");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:508:1: ( (temp_name= RULE_ID ) ( ';' ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:508:2: (temp_name= RULE_ID ) ( ';' )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:508:2: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:508:3: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall1525); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:511:1: ( ';' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:511:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleProcessCall1534); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 18, ruleProcessCall_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleProcessCall


    // $ANTLR start ruleLinkRef
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:515:1: ruleLinkRef returns [EObject result] : (temp_name= RULE_ID ) ;
    public EObject ruleLinkRef() throws RecognitionException {
        EObject result = null;
        int ruleLinkRef_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:516:4: ( (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:516:4: (temp_name= RULE_ID )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "LinkRef");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:520:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:520:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkRef1560); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, ruleLinkRef_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleLinkRef


    // $ANTLR start ruleLink
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:524:1: ruleLink returns [EObject result] : (temp_linkstep= ruleLinkStep | temp_linkpath= ruleLinkPath );
    public EObject ruleLink() throws RecognitionException {
        EObject result = null;
        int ruleLink_StartIndex = input.index();
        EObject temp_linkstep = null;

        EObject temp_linkpath = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:525:9: (temp_linkstep= ruleLinkStep | temp_linkpath= ruleLinkPath )
            int alt40=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==35) ) {
                    alt40=2;
                }
                else if ( (LA40_1==34) ) {
                    alt40=1;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("524:1: ruleLink returns [EObject result] : (temp_linkstep= ruleLinkStep | temp_linkpath= ruleLinkPath );", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt40=1;
                }
                break;
            case 35:
                {
                alt40=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("524:1: ruleLink returns [EObject result] : (temp_linkstep= ruleLinkStep | temp_linkpath= ruleLinkPath );", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:525:9: temp_linkstep= ruleLinkStep
                    {
                    pushFollow(FOLLOW_ruleLinkStep_in_ruleLink1587);
                    temp_linkstep=ruleLinkStep();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_linkstep;
                    }

                    }
                    break;
                case 2 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:525:70: temp_linkpath= ruleLinkPath
                    {
                    pushFollow(FOLLOW_ruleLinkPath_in_ruleLink1602);
                    temp_linkpath=ruleLinkPath();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_linkpath;
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
            if ( backtracking>0 ) { memoize(input, 20, ruleLink_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleLink


    // $ANTLR start ruleLinkStep
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:527:1: ruleLinkStep returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'LinkStep' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( 'navigate' ) (temp_reference= ruleAssociationRoleReference ) ) ;
    public EObject ruleLinkStep() throws RecognitionException {
        EObject result = null;
        int ruleLinkStep_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_contextRef=null;
        EObject temp_reference = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:528:4: ( ( (temp_description= RULE_STRING )? ( 'LinkStep' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( 'navigate' ) (temp_reference= ruleAssociationRoleReference ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:528:4: ( (temp_description= RULE_STRING )? ( 'LinkStep' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( 'navigate' ) (temp_reference= ruleAssociationRoleReference ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "LinkStep");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:532:1: ( (temp_description= RULE_STRING )? ( 'LinkStep' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( 'navigate' ) (temp_reference= ruleAssociationRoleReference ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:532:2: (temp_description= RULE_STRING )? ( 'LinkStep' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ( 'navigate' ) (temp_reference= ruleAssociationRoleReference )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:532:2: (temp_description= RULE_STRING )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:532:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLinkStep1627); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:535:1: ( 'LinkStep' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:535:2: 'LinkStep'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,34,FOLLOW_34_in_ruleLinkStep1637); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:537:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:537:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkStep1646); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:540:1: ( 'using' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:540:2: 'using'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleLinkStep1655); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:542:1: (temp_contextRef= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:542:2: temp_contextRef= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_contextRef=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkStep1664); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:546:1: ( 'navigate' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:546:2: 'navigate'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,31,FOLLOW_31_in_ruleLinkStep1674); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:548:1: (temp_reference= ruleAssociationRoleReference )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:548:2: temp_reference= ruleAssociationRoleReference
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleLinkStep1683);
            temp_reference=ruleAssociationRoleReference();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"reference",convert(temp_reference),false); ptm.ruleFinished(temp_reference,end()); 
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
            if ( backtracking>0 ) { memoize(input, 21, ruleLinkStep_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleLinkStep


    // $ANTLR start ruleLinkPath
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:553:1: ruleLinkPath returns [EObject result] : ( (temp_description= RULE_STRING )? ( 'LinkPath' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ) ;
    public EObject ruleLinkPath() throws RecognitionException {
        EObject result = null;
        int ruleLinkPath_StartIndex = input.index();
        Token temp_description=null;
        Token temp_name=null;
        Token temp_contextRef=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:554:4: ( ( (temp_description= RULE_STRING )? ( 'LinkPath' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:554:4: ( (temp_description= RULE_STRING )? ( 'LinkPath' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "LinkPath");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:558:1: ( (temp_description= RULE_STRING )? ( 'LinkPath' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:558:2: (temp_description= RULE_STRING )? ( 'LinkPath' ) (temp_name= RULE_ID ) ( 'using' ) (temp_contextRef= RULE_ID )
            {
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:558:2: (temp_description= RULE_STRING )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:558:3: temp_description= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_description=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLinkPath1712); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"description",convert(temp_description),false); ptm.ruleFinished(temp_description,end()); 
                    }

                    }
                    break;

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:561:1: ( 'LinkPath' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:561:2: 'LinkPath'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,35,FOLLOW_35_in_ruleLinkPath1722); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:563:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:563:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkPath1731); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:566:1: ( 'using' )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:566:2: 'using'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleLinkPath1740); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:568:1: (temp_contextRef= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:568:2: temp_contextRef= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_contextRef=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkPath1749); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"contextRef",convert(temp_contextRef),true); ptm.ruleFinished(temp_contextRef,end()); 
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
            if ( backtracking>0 ) { memoize(input, 22, ruleLinkPath_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleLinkPath


    // $ANTLR start ruleDtoPropertyReference
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:574:1: ruleDtoPropertyReference returns [EObject result] : (temp_name= RULE_ID ) ;
    public EObject ruleDtoPropertyReference() throws RecognitionException {
        EObject result = null;
        int ruleDtoPropertyReference_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:575:4: ( (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:575:4: (temp_name= RULE_ID )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "DtoPropertyReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:579:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:579:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoPropertyReference1778); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, ruleDtoPropertyReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDtoPropertyReference


    // $ANTLR start ruleAssociationRoleReference
    // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:583:1: ruleAssociationRoleReference returns [EObject result] : (temp_name= RULE_ID ) ;
    public EObject ruleAssociationRoleReference() throws RecognitionException {
        EObject result = null;
        int ruleAssociationRoleReference_StartIndex = input.index();
        Token temp_name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return result; }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:584:4: ( (temp_name= RULE_ID ) )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:584:4: (temp_name= RULE_ID )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AssociationRoleReference");
              				ptm.setModelElement(result);
              			 
            }
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:588:1: (temp_name= RULE_ID )
            // ..//org.mod4j.dsl.presentation.xtext/src-gen//org/mod4j/dsl/presentation/xtext/parser/PresentationDsl.g:588:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationRoleReference1804); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, ruleAssociationRoleReference_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAssociationRoleReference


 

    public static final BitSet FOLLOW_rulePresentationModel_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePresentationModel93 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_rulePresentationModel103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePresentationModel112 = new BitSet(new long[]{0x0000000C33402812L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rulePresentationModel123 = new BitSet(new long[]{0x0000000C33402812L});
    public static final BitSet FOLLOW_ruleModelElement_in_rulePresentationModel135 = new BitSet(new long[]{0x0000000C33402012L});
    public static final BitSet FOLLOW_11_in_ruleExternalReference163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference172 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference181 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElement219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleModelElement234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_ruleUIModelElement259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleUIModelElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_ruleDialogue299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_ruleDialogue314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContentForm339 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContentForm349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm358 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentForm367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm376 = new BitSet(new long[]{0x0000000040088002L});
    public static final BitSet FOLLOW_15_in_ruleContentForm387 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleContentForm397 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleContentForm408 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContentForm417 = new BitSet(new long[]{0x0000000040080002L});
    public static final BitSet FOLLOW_ruleFormElement_in_ruleContentForm429 = new BitSet(new long[]{0x0000000040080002L});
    public static final BitSet FOLLOW_19_in_ruleContentForm440 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContentForm447 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleContentForm456 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleContentForm466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompoundDialogue497 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCompoundDialogue507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompoundDialogue525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue534 = new BitSet(new long[]{0x0000000000888002L});
    public static final BitSet FOLLOW_15_in_ruleCompoundDialogue545 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleCompoundDialogue555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleCompoundDialogue566 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompoundDialogue575 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_23_in_ruleCompoundDialogue586 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompoundDialogue593 = new BitSet(new long[]{0x0000000080200020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue602 = new BitSet(new long[]{0x0000000080200020L});
    public static final BitSet FOLLOW_21_in_ruleCompoundDialogue612 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleCompoundDialogue623 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompoundDialogue630 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCompoundDialogue639 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleCompoundDialogue649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollectionDialogue711 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCollectionDialogue721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue730 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionDialogue739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue748 = new BitSet(new long[]{0x0000000000888002L});
    public static final BitSet FOLLOW_15_in_ruleCollectionDialogue759 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionDialogue769 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCollectionDialogue789 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_23_in_ruleCollectionDialogue800 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCollectionDialogue807 = new BitSet(new long[]{0x0000000080200020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue816 = new BitSet(new long[]{0x0000000080200020L});
    public static final BitSet FOLLOW_21_in_ruleCollectionDialogue826 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleCollectionDialogue837 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCollectionDialogue844 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCollectionDialogue853 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleCollectionDialogue863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMasterDetail893 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMasterDetail903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail912 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMasterDetail921 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail930 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_15_in_ruleMasterDetail941 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMasterDetail951 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleMasterDetail962 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMasterDetail971 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMasterDetail981 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail990 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMasterDetail999 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMasterDetail1006 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail1015 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMasterDetail1024 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleMasterDetail1032 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMasterDetail1039 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleMasterDetail1048 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleMasterDetail1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomatedProcess_in_ruleProcess1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiveProcess_in_ruleProcess1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAutomatedProcess1128 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAutomatedProcess1138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomatedProcess1147 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAutomatedProcess1156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomatedProcess1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInteractiveProcess1195 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInteractiveProcess1205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractiveProcess1214 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInteractiveProcess1223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractiveProcess1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFormElement1260 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_31_in_ruleFormElement1268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLinkRef_in_ruleFormElement1278 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFormElement1288 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_ruleFormElement1300 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFormElement1309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormElement1318 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleFormElement1328 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleFormElement1338 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleFormElement1349 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFormElement1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDialogueCall_in_ruleDialogueCall1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedDialogueCall_in_ruleDialogueCall1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLinkedDialogueCall1426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLinkRef_in_ruleLinkedDialogueCall1435 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLinkedDialogueCall1444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedDialogueCall1453 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLinkedDialogueCall1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDialogueCall1489 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDirectDialogueCall1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall1525 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProcessCall1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkRef1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkStep_in_ruleLink1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkPath_in_ruleLink1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkStep1627 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleLinkStep1637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkStep1646 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinkStep1655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkStep1664 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLinkStep1674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleLinkStep1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkPath1712 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleLinkPath1722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkPath1731 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinkPath1740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkPath1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoPropertyReference1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationRoleReference1804 = new BitSet(new long[]{0x0000000000000002L});

}