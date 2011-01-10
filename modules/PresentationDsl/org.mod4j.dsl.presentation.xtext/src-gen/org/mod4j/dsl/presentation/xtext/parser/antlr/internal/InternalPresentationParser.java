package org.mod4j.dsl.presentation.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.mod4j.dsl.presentation.xtext.services.PresentationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalPresentationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "';'", "'presentation'", "'menu'", "'['", "']'", "'from'", "'dto'", "'page'", "'service'", "'panel'", "'extends'", "'actions'", "'context'", "'list'", "'label'", "':'", "'-->'", "'collection'", "'shows'", "'readonly'", "'true'", "'false'", "'call'", "'navigate'", "'.'", "'new'", "'save'", "'edit'", "'delete'", "'cancel'", "'removefrom'", "'addto'", "'custom'", "'link'", "'all'", "'find'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalPresentationParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g"; }


     
     	private PresentationGrammarAccess grammarAccess;
     	
        public InternalPresentationParser(TokenStream input, IAstFactory factory, PresentationGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PresentationModel";	
       	} 



    // $ANTLR start entryRulePresentationModel
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:73:1: entryRulePresentationModel returns [EObject current=null] : iv_rulePresentationModel= rulePresentationModel EOF ;
    public final EObject entryRulePresentationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationModel = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:73:59: (iv_rulePresentationModel= rulePresentationModel EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:74:2: iv_rulePresentationModel= rulePresentationModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentationModelRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentationModel_in_entryRulePresentationModel73);
            iv_rulePresentationModel=rulePresentationModel();
            _fsp--;

             current =iv_rulePresentationModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentationModel83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentationModel


    // $ANTLR start rulePresentationModel
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:81:1: rulePresentationModel returns [EObject current=null] : (this_ApplicationModel_0= ruleApplicationModel | this_FormsAndProcesses_1= ruleFormsAndProcesses ) ;
    public final EObject rulePresentationModel() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicationModel_0 = null;

        EObject this_FormsAndProcesses_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:6: ( (this_ApplicationModel_0= ruleApplicationModel | this_FormsAndProcesses_1= ruleFormsAndProcesses ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:1: (this_ApplicationModel_0= ruleApplicationModel | this_FormsAndProcesses_1= ruleFormsAndProcesses )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:1: (this_ApplicationModel_0= ruleApplicationModel | this_FormsAndProcesses_1= ruleFormsAndProcesses )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==13) ) {
                    alt1=2;
                }
                else if ( (LA1_1==11) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("87:1: (this_ApplicationModel_0= ruleApplicationModel | this_FormsAndProcesses_1= ruleFormsAndProcesses )", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("87:1: (this_ApplicationModel_0= ruleApplicationModel | this_FormsAndProcesses_1= ruleFormsAndProcesses )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:88:5: this_ApplicationModel_0= ruleApplicationModel
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPresentationModelAccess().getApplicationModelParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleApplicationModel_in_rulePresentationModel130);
                    this_ApplicationModel_0=ruleApplicationModel();
                    _fsp--;

                     
                            current = this_ApplicationModel_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:98:5: this_FormsAndProcesses_1= ruleFormsAndProcesses
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPresentationModelAccess().getFormsAndProcessesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFormsAndProcesses_in_rulePresentationModel157);
                    this_FormsAndProcesses_1=ruleFormsAndProcesses();
                    _fsp--;

                     
                            current = this_FormsAndProcesses_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePresentationModel


    // $ANTLR start entryRuleApplicationModel
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:113:1: entryRuleApplicationModel returns [EObject current=null] : iv_ruleApplicationModel= ruleApplicationModel EOF ;
    public final EObject entryRuleApplicationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationModel = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:113:58: (iv_ruleApplicationModel= ruleApplicationModel EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:114:2: iv_ruleApplicationModel= ruleApplicationModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel189);
            iv_ruleApplicationModel=ruleApplicationModel();
            _fsp--;

             current =iv_ruleApplicationModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationModel199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleApplicationModel


    // $ANTLR start ruleApplicationModel
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:121:1: ruleApplicationModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_mainMenu_5= ruleMenu ) ) ;
    public final EObject ruleApplicationModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_mainMenu_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:126:6: ( ( (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_mainMenu_5= ruleMenu ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:127:1: ( (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_mainMenu_5= ruleMenu ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:127:1: ( (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_mainMenu_5= ruleMenu ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:127:2: (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_mainMenu_5= ruleMenu )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:127:2: (lv_description_0= RULE_STRING )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:129:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel246); 

                    		createLeafNode(grammarAccess.getApplicationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getApplicationModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleApplicationModel264); 

                    createLeafNode(grammarAccess.getApplicationModelAccess().getApplicationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:151:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:153:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel286); 

            		createLeafNode(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleApplicationModel303); 

                    createLeafNode(grammarAccess.getApplicationModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:175:1: (lv_externalReferences_4= ruleExternalReference )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:178:6: lv_externalReferences_4= ruleExternalReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalReference_in_ruleApplicationModel337);
            	    lv_externalReferences_4=ruleExternalReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "externalReferences", lv_externalReferences_4, "ExternalReference", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:196:3: (lv_mainMenu_5= ruleMenu )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:199:6: lv_mainMenu_5= ruleMenu
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationModelAccess().getMainMenuMenuParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMenu_in_ruleApplicationModel376);
            lv_mainMenu_5=ruleMenu();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "mainMenu", lv_mainMenu_5, "Menu", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleApplicationModel


    // $ANTLR start entryRuleFormsAndProcesses
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:224:1: entryRuleFormsAndProcesses returns [EObject current=null] : iv_ruleFormsAndProcesses= ruleFormsAndProcesses EOF ;
    public final EObject entryRuleFormsAndProcesses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormsAndProcesses = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:224:59: (iv_ruleFormsAndProcesses= ruleFormsAndProcesses EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:225:2: iv_ruleFormsAndProcesses= ruleFormsAndProcesses EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormsAndProcessesRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormsAndProcesses_in_entryRuleFormsAndProcesses413);
            iv_ruleFormsAndProcesses=ruleFormsAndProcesses();
            _fsp--;

             current =iv_ruleFormsAndProcesses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormsAndProcesses423); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFormsAndProcesses


    // $ANTLR start ruleFormsAndProcesses
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:232:1: ruleFormsAndProcesses returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* ) ;
    public final EObject ruleFormsAndProcesses() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_elements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:237:6: ( ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:238:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:238:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:238:2: (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )*
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:238:2: (lv_description_0= RULE_STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:240:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormsAndProcesses470); 

                    		createLeafNode(grammarAccess.getFormsAndProcessesAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFormsAndProcessesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleFormsAndProcesses488); 

                    createLeafNode(grammarAccess.getFormsAndProcessesAccess().getPresentationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:262:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:264:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormsAndProcesses510); 

            		createLeafNode(grammarAccess.getFormsAndProcessesAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormsAndProcessesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleFormsAndProcesses527); 

                    createLeafNode(grammarAccess.getFormsAndProcessesAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:286:1: (lv_externalReferences_4= ruleExternalReference )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:289:6: lv_externalReferences_4= ruleExternalReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalReference_in_ruleFormsAndProcesses561);
            	    lv_externalReferences_4=ruleExternalReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormsAndProcessesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "externalReferences", lv_externalReferences_4, "ExternalReference", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:307:3: (lv_elements_5= ruleModelElementWithContext )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==19||LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:310:6: lv_elements_5= ruleModelElementWithContext
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFormsAndProcessesAccess().getElementsModelElementWithContextParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElementWithContext_in_ruleFormsAndProcesses600);
            	    lv_elements_5=ruleModelElementWithContext();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormsAndProcessesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elements", lv_elements_5, "ModelElementWithContext", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFormsAndProcesses


    // $ANTLR start entryRuleMenu
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:335:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:335:46: (iv_ruleMenu= ruleMenu EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:336:2: iv_ruleMenu= ruleMenu EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMenuRule(), currentNode); 
            pushFollow(FOLLOW_ruleMenu_in_entryRuleMenu638);
            iv_ruleMenu=ruleMenu();
            _fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenu648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMenu


    // $ANTLR start ruleMenu
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:343:1: ruleMenu returns [EObject current=null] : ( 'menu' '[' (lv_startActions_2= ruleMenuAction )* ']' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        EObject lv_startActions_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:348:6: ( ( 'menu' '[' (lv_startActions_2= ruleMenuAction )* ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:349:1: ( 'menu' '[' (lv_startActions_2= ruleMenuAction )* ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:349:1: ( 'menu' '[' (lv_startActions_2= ruleMenuAction )* ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:349:2: 'menu' '[' (lv_startActions_2= ruleMenuAction )* ']'
            {
            match(input,14,FOLLOW_14_in_ruleMenu682); 

                    createLeafNode(grammarAccess.getMenuAccess().getMenuKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleMenu691); 

                    createLeafNode(grammarAccess.getMenuAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:357:1: (lv_startActions_2= ruleMenuAction )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:360:6: lv_startActions_2= ruleMenuAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMenuAccess().getStartActionsMenuActionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMenuAction_in_ruleMenu725);
            	    lv_startActions_2=ruleMenuAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMenuRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "startActions", lv_startActions_2, "MenuAction", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleMenu739); 

                    createLeafNode(grammarAccess.getMenuAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMenu


    // $ANTLR start entryRuleExternalReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:389:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:389:59: (iv_ruleExternalReference= ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:390:2: iv_ruleExternalReference= ruleExternalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference772);
            iv_ruleExternalReference=ruleExternalReference();
            _fsp--;

             current =iv_ruleExternalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExternalReference


    // $ANTLR start ruleExternalReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:397:1: ruleExternalReference returns [EObject current=null] : (this_DtoReference_0= ruleDtoReference | this_PageReference_1= rulePageReference | this_ServiceReference_2= ruleServiceReference ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject this_DtoReference_0 = null;

        EObject this_PageReference_1 = null;

        EObject this_ServiceReference_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:402:6: ( (this_DtoReference_0= ruleDtoReference | this_PageReference_1= rulePageReference | this_ServiceReference_2= ruleServiceReference ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:403:1: (this_DtoReference_0= ruleDtoReference | this_PageReference_1= rulePageReference | this_ServiceReference_2= ruleServiceReference )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:403:1: (this_DtoReference_0= ruleDtoReference | this_PageReference_1= rulePageReference | this_ServiceReference_2= ruleServiceReference )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
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
                    case 18:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("403:1: (this_DtoReference_0= ruleDtoReference | this_PageReference_1= rulePageReference | this_ServiceReference_2= ruleServiceReference )", 8, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("403:1: (this_DtoReference_0= ruleDtoReference | this_PageReference_1= rulePageReference | this_ServiceReference_2= ruleServiceReference )", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("403:1: (this_DtoReference_0= ruleDtoReference | this_PageReference_1= rulePageReference | this_ServiceReference_2= ruleServiceReference )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:404:5: this_DtoReference_0= ruleDtoReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExternalReferenceAccess().getDtoReferenceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoReference_in_ruleExternalReference829);
                    this_DtoReference_0=ruleDtoReference();
                    _fsp--;

                     
                            current = this_DtoReference_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:414:5: this_PageReference_1= rulePageReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExternalReferenceAccess().getPageReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePageReference_in_ruleExternalReference856);
                    this_PageReference_1=rulePageReference();
                    _fsp--;

                     
                            current = this_PageReference_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:424:5: this_ServiceReference_2= ruleServiceReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExternalReferenceAccess().getServiceReferenceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleServiceReference_in_ruleExternalReference883);
                    this_ServiceReference_2=ruleServiceReference();
                    _fsp--;

                     
                            current = this_ServiceReference_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExternalReference


    // $ANTLR start entryRuleDtoReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:439:1: entryRuleDtoReference returns [EObject current=null] : iv_ruleDtoReference= ruleDtoReference EOF ;
    public final EObject entryRuleDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:439:54: (iv_ruleDtoReference= ruleDtoReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:440:2: iv_ruleDtoReference= ruleDtoReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoReference_in_entryRuleDtoReference915);
            iv_ruleDtoReference=ruleDtoReference();
            _fsp--;

             current =iv_ruleDtoReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoReference925); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoReference


    // $ANTLR start ruleDtoReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:447:1: ruleDtoReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'dto' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleDtoReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:452:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'dto' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:453:1: ( 'from' (lv_modelName_1= RULE_ID ) 'dto' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:453:1: ( 'from' (lv_modelName_1= RULE_ID ) 'dto' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:453:2: 'from' (lv_modelName_1= RULE_ID ) 'dto' (lv_name_3= RULE_ID ) ';'
            {
            match(input,17,FOLLOW_17_in_ruleDtoReference959); 

                    createLeafNode(grammarAccess.getDtoReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:457:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:459:6: lv_modelName_1= RULE_ID
            {
            lv_modelName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference981); 

            		createLeafNode(grammarAccess.getDtoReferenceAccess().getModelNameIDTerminalRuleCall_1_0(), "modelName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "modelName", lv_modelName_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,18,FOLLOW_18_in_ruleDtoReference998); 

                    createLeafNode(grammarAccess.getDtoReferenceAccess().getDtoKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:481:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:483:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference1020); 

            		createLeafNode(grammarAccess.getDtoReferenceAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleDtoReference1037); 

                    createLeafNode(grammarAccess.getDtoReferenceAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoReference


    // $ANTLR start entryRulePageReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:512:1: entryRulePageReference returns [EObject current=null] : iv_rulePageReference= rulePageReference EOF ;
    public final EObject entryRulePageReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:512:55: (iv_rulePageReference= rulePageReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:513:2: iv_rulePageReference= rulePageReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPageReferenceRule(), currentNode); 
            pushFollow(FOLLOW_rulePageReference_in_entryRulePageReference1070);
            iv_rulePageReference=rulePageReference();
            _fsp--;

             current =iv_rulePageReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageReference1080); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePageReference


    // $ANTLR start rulePageReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:520:1: rulePageReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'page' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject rulePageReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:525:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'page' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:526:1: ( 'from' (lv_modelName_1= RULE_ID ) 'page' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:526:1: ( 'from' (lv_modelName_1= RULE_ID ) 'page' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:526:2: 'from' (lv_modelName_1= RULE_ID ) 'page' (lv_name_3= RULE_ID ) ';'
            {
            match(input,17,FOLLOW_17_in_rulePageReference1114); 

                    createLeafNode(grammarAccess.getPageReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:530:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:532:6: lv_modelName_1= RULE_ID
            {
            lv_modelName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePageReference1136); 

            		createLeafNode(grammarAccess.getPageReferenceAccess().getModelNameIDTerminalRuleCall_1_0(), "modelName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPageReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "modelName", lv_modelName_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_rulePageReference1153); 

                    createLeafNode(grammarAccess.getPageReferenceAccess().getPageKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:554:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:556:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePageReference1175); 

            		createLeafNode(grammarAccess.getPageReferenceAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPageReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_rulePageReference1192); 

                    createLeafNode(grammarAccess.getPageReferenceAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePageReference


    // $ANTLR start entryRuleServiceReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:585:1: entryRuleServiceReference returns [EObject current=null] : iv_ruleServiceReference= ruleServiceReference EOF ;
    public final EObject entryRuleServiceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:585:58: (iv_ruleServiceReference= ruleServiceReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:586:2: iv_ruleServiceReference= ruleServiceReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceReference_in_entryRuleServiceReference1225);
            iv_ruleServiceReference=ruleServiceReference();
            _fsp--;

             current =iv_ruleServiceReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceReference1235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleServiceReference


    // $ANTLR start ruleServiceReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:593:1: ruleServiceReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'service' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleServiceReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:598:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'service' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:599:1: ( 'from' (lv_modelName_1= RULE_ID ) 'service' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:599:1: ( 'from' (lv_modelName_1= RULE_ID ) 'service' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:599:2: 'from' (lv_modelName_1= RULE_ID ) 'service' (lv_name_3= RULE_ID ) ';'
            {
            match(input,17,FOLLOW_17_in_ruleServiceReference1269); 

                    createLeafNode(grammarAccess.getServiceReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:603:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:605:6: lv_modelName_1= RULE_ID
            {
            lv_modelName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceReference1291); 

            		createLeafNode(grammarAccess.getServiceReferenceAccess().getModelNameIDTerminalRuleCall_1_0(), "modelName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "modelName", lv_modelName_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,20,FOLLOW_20_in_ruleServiceReference1308); 

                    createLeafNode(grammarAccess.getServiceReferenceAccess().getServiceKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:627:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:629:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceReference1330); 

            		createLeafNode(grammarAccess.getServiceReferenceAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleServiceReference1347); 

                    createLeafNode(grammarAccess.getServiceReferenceAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleServiceReference


    // $ANTLR start entryRuleModelElementWithContext
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:658:1: entryRuleModelElementWithContext returns [EObject current=null] : iv_ruleModelElementWithContext= ruleModelElementWithContext EOF ;
    public final EObject entryRuleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementWithContext = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:658:65: (iv_ruleModelElementWithContext= ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:659:2: iv_ruleModelElementWithContext= ruleModelElementWithContext EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelElementWithContextRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext1380);
            iv_ruleModelElementWithContext=ruleModelElementWithContext();
            _fsp--;

             current =iv_ruleModelElementWithContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElementWithContext1390); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModelElementWithContext


    // $ANTLR start ruleModelElementWithContext
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:666:1: ruleModelElementWithContext returns [EObject current=null] : this_UIModelElement_0= ruleUIModelElement ;
    public final EObject ruleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElement_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:671:6: (this_UIModelElement_0= ruleUIModelElement )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:673:5: this_UIModelElement_0= ruleUIModelElement
            {
             
                    currentNode=createCompositeNode(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext1436);
            this_UIModelElement_0=ruleUIModelElement();
            _fsp--;

             
                    current = this_UIModelElement_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModelElementWithContext


    // $ANTLR start entryRuleUIModelElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:688:1: entryRuleUIModelElement returns [EObject current=null] : iv_ruleUIModelElement= ruleUIModelElement EOF ;
    public final EObject entryRuleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:688:56: (iv_ruleUIModelElement= ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:689:2: iv_ruleUIModelElement= ruleUIModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement1467);
            iv_ruleUIModelElement=ruleUIModelElement();
            _fsp--;

             current =iv_ruleUIModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement1477); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUIModelElement


    // $ANTLR start ruleUIModelElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:696:1: ruleUIModelElement returns [EObject current=null] : this_AbstractDialogue_0= ruleAbstractDialogue ;
    public final EObject ruleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractDialogue_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:701:6: (this_AbstractDialogue_0= ruleAbstractDialogue )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:703:5: this_AbstractDialogue_0= ruleAbstractDialogue
            {
             
                    currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getAbstractDialogueParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleAbstractDialogue_in_ruleUIModelElement1523);
            this_AbstractDialogue_0=ruleAbstractDialogue();
            _fsp--;

             
                    current = this_AbstractDialogue_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUIModelElement


    // $ANTLR start entryRuleAbstractDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:718:1: entryRuleAbstractDialogue returns [EObject current=null] : iv_ruleAbstractDialogue= ruleAbstractDialogue EOF ;
    public final EObject entryRuleAbstractDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:718:58: (iv_ruleAbstractDialogue= ruleAbstractDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:719:2: iv_ruleAbstractDialogue= ruleAbstractDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractDialogue_in_entryRuleAbstractDialogue1554);
            iv_ruleAbstractDialogue=ruleAbstractDialogue();
            _fsp--;

             current =iv_ruleAbstractDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDialogue1564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractDialogue


    // $ANTLR start ruleAbstractDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:726:1: ruleAbstractDialogue returns [EObject current=null] : (this_View_0= ruleView | this_Page_1= rulePage ) ;
    public final EObject ruleAbstractDialogue() throws RecognitionException {
        EObject current = null;

        EObject this_View_0 = null;

        EObject this_Page_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:731:6: ( (this_View_0= ruleView | this_Page_1= rulePage ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:732:1: (this_View_0= ruleView | this_Page_1= rulePage )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:732:1: (this_View_0= ruleView | this_Page_1= rulePage )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("732:1: (this_View_0= ruleView | this_Page_1= rulePage )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:733:5: this_View_0= ruleView
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDialogueAccess().getViewParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleAbstractDialogue1611);
                    this_View_0=ruleView();
                    _fsp--;

                     
                            current = this_View_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:743:5: this_Page_1= rulePage
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDialogueAccess().getPageParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePage_in_ruleAbstractDialogue1638);
                    this_Page_1=rulePage();
                    _fsp--;

                     
                            current = this_Page_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractDialogue


    // $ANTLR start entryRuleView
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:758:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:758:46: (iv_ruleView= ruleView EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:759:2: iv_ruleView= ruleView EOF
            {
             currentNode = createCompositeNode(grammarAccess.getViewRule(), currentNode); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView1670);
            iv_ruleView=ruleView();
            _fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1680); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleView


    // $ANTLR start ruleView
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:766:1: ruleView returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'panel' (lv_name_2= RULE_ID ) ( ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' ) | ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' ) ) ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_collectionContext_12=null;
        EObject lv_actions_8 = null;

        EObject lv_formElements_15 = null;

        EObject lv_actions_18 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:771:6: ( ( (lv_description_0= RULE_STRING )? 'panel' (lv_name_2= RULE_ID ) ( ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' ) | ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' ) ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:772:1: ( (lv_description_0= RULE_STRING )? 'panel' (lv_name_2= RULE_ID ) ( ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' ) | ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' ) ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:772:1: ( (lv_description_0= RULE_STRING )? 'panel' (lv_name_2= RULE_ID ) ( ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' ) | ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:772:2: (lv_description_0= RULE_STRING )? 'panel' (lv_name_2= RULE_ID ) ( ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' ) | ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:772:2: (lv_description_0= RULE_STRING )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:774:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleView1727); 

                    		createLeafNode(grammarAccess.getViewAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleView1745); 

                    createLeafNode(grammarAccess.getViewAccess().getPanelKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:796:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:798:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1767); 

            		createLeafNode(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getViewRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:816:2: ( ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' ) | ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            else if ( (LA17_0==24) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("816:2: ( ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' ) | ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' ) )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:816:3: ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:816:3: ( 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:816:4: 'extends' ( RULE_ID ) '[' ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )? ']'
                    {
                    match(input,22,FOLLOW_22_in_ruleView1786); 

                            createLeafNode(grammarAccess.getViewAccess().getExtendsKeyword_3_0_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:820:1: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:823:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1808); 

                    		createLeafNode(grammarAccess.getViewAccess().getBaseViewViewCrossReference_3_0_1_0(), "baseView"); 
                    	

                    }

                    match(input,15,FOLLOW_15_in_ruleView1820); 

                            createLeafNode(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_0_2(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:840:1: ( 'actions' '[' (lv_actions_8= ruleAction )* ']' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:840:2: 'actions' '[' (lv_actions_8= ruleAction )* ']'
                            {
                            match(input,23,FOLLOW_23_in_ruleView1830); 

                                    createLeafNode(grammarAccess.getViewAccess().getActionsKeyword_3_0_3_0(), null); 
                                
                            match(input,15,FOLLOW_15_in_ruleView1839); 

                                    createLeafNode(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_0_3_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:848:1: (lv_actions_8= ruleAction )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:851:6: lv_actions_8= ruleAction
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_3_0_3_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleAction_in_ruleView1873);
                            	    lv_actions_8=ruleAction();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getViewRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        
                            	    	        try {
                            	    	       		add(current, "actions", lv_actions_8, "Action", currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);

                            match(input,16,FOLLOW_16_in_ruleView1887); 

                                    createLeafNode(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_0_3_3(), null); 
                                

                            }
                            break;

                    }

                    match(input,16,FOLLOW_16_in_ruleView1898); 

                            createLeafNode(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:878:6: ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:878:6: ( 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:878:7: 'context' (lv_collectionContext_12= 'list' )? ( RULE_ID ) '[' (lv_formElements_15= ruleFormElement )* ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )? ']'
                    {
                    match(input,24,FOLLOW_24_in_ruleView1915); 

                            createLeafNode(grammarAccess.getViewAccess().getContextKeyword_3_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:882:1: (lv_collectionContext_12= 'list' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==25) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:884:6: lv_collectionContext_12= 'list'
                            {
                            lv_collectionContext_12=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleView1936); 

                                    createLeafNode(grammarAccess.getViewAccess().getCollectionContextListKeyword_3_1_1_0(), "collectionContext"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getViewRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "collectionContext", true, "list", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:903:3: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:906:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getViewRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1972); 

                    		createLeafNode(grammarAccess.getViewAccess().getContextRefDtoReferenceCrossReference_3_1_2_0(), "contextRef"); 
                    	

                    }

                    match(input,15,FOLLOW_15_in_ruleView1984); 

                            createLeafNode(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_1_3(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:923:1: (lv_formElements_15= ruleFormElement )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:926:6: lv_formElements_15= ruleFormElement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getViewAccess().getFormElementsFormElementParserRuleCall_3_1_4_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFormElement_in_ruleView2018);
                    	    lv_formElements_15=ruleFormElement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getViewRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "formElements", lv_formElements_15, "FormElement", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:944:3: ( 'actions' '[' (lv_actions_18= ruleAction )* ']' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==23) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:944:4: 'actions' '[' (lv_actions_18= ruleAction )* ']'
                            {
                            match(input,23,FOLLOW_23_in_ruleView2033); 

                                    createLeafNode(grammarAccess.getViewAccess().getActionsKeyword_3_1_5_0(), null); 
                                
                            match(input,15,FOLLOW_15_in_ruleView2042); 

                                    createLeafNode(grammarAccess.getViewAccess().getLeftSquareBracketKeyword_3_1_5_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:952:1: (lv_actions_18= ruleAction )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:955:6: lv_actions_18= ruleAction
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getViewAccess().getActionsActionParserRuleCall_3_1_5_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleAction_in_ruleView2076);
                            	    lv_actions_18=ruleAction();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getViewRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        
                            	    	        try {
                            	    	       		add(current, "actions", lv_actions_18, "Action", currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);

                            match(input,16,FOLLOW_16_in_ruleView2090); 

                                    createLeafNode(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_1_5_3(), null); 
                                

                            }
                            break;

                    }

                    match(input,16,FOLLOW_16_in_ruleView2101); 

                            createLeafNode(grammarAccess.getViewAccess().getRightSquareBracketKeyword_3_1_6(), null); 
                        

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleView


    // $ANTLR start entryRuleMenuAction
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:988:1: entryRuleMenuAction returns [EObject current=null] : iv_ruleMenuAction= ruleMenuAction EOF ;
    public final EObject entryRuleMenuAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenuAction = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:988:52: (iv_ruleMenuAction= ruleMenuAction EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:989:2: iv_ruleMenuAction= ruleMenuAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMenuActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMenuAction_in_entryRuleMenuAction2136);
            iv_ruleMenuAction=ruleMenuAction();
            _fsp--;

             current =iv_ruleMenuAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMenuAction2146); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMenuAction


    // $ANTLR start ruleMenuAction
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:996:1: ruleMenuAction returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? ';' ) ;
    public final EObject ruleMenuAction() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_1=null;
        Token lv_label_3=null;
        Enumerator lv_type_5 = null;

        Enumerator lv_type_6 = null;

        EObject lv_contextExp_7 = null;

        EObject lv_contextExp_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1001:6: ( ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1002:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1002:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1002:2: (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1002:2: (lv_description_0= RULE_STRING )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1004:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMenuAction2193); 

                    		createLeafNode(grammarAccess.getMenuActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMenuActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1022:3: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1024:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMenuAction2224); 

            		createLeafNode(grammarAccess.getMenuActionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMenuActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1042:2: ( 'label' (lv_label_3= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1042:3: 'label' (lv_label_3= RULE_STRING )
                    {
                    match(input,26,FOLLOW_26_in_ruleMenuAction2242); 

                            createLeafNode(grammarAccess.getMenuActionAccess().getLabelKeyword_2_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1046:1: (lv_label_3= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1048:6: lv_label_3= RULE_STRING
                    {
                    lv_label_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMenuAction2264); 

                    		createLeafNode(grammarAccess.getMenuActionAccess().getLabelSTRINGTerminalRuleCall_2_1_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMenuActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_3, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleMenuAction2283); 

                    createLeafNode(grammarAccess.getMenuActionAccess().getColonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1070:1: ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=37 && LA21_0<=45)) ) {
                alt21=1;
            }
            else if ( (LA21_0==20||(LA21_0>=34 && LA21_0<=35)||(LA21_0>=46 && LA21_0<=47)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1070:1: ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1070:2: ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1070:2: ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=37 && LA20_0<=44)) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==45) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1070:2: ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1070:3: (lv_type_5= ruleProcessType )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1070:3: (lv_type_5= ruleProcessType )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1073:6: lv_type_5= ruleProcessType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getMenuActionAccess().getTypeProcessTypeEnumRuleCall_4_0_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleProcessType_in_ruleMenuAction2319);
                            lv_type_5=ruleProcessType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getMenuActionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "ProcessType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1092:6: ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1092:6: ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1092:7: (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1092:7: (lv_type_6= ruleProcessTypeLink )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1095:6: lv_type_6= ruleProcessTypeLink
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getMenuActionAccess().getTypeProcessTypeLinkEnumRuleCall_4_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleProcessTypeLink_in_ruleMenuAction2364);
                            lv_type_6=ruleProcessTypeLink();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getMenuActionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_6, "ProcessTypeLink", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1113:2: (lv_contextExp_7= ruleNavigationExpression )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1116:6: lv_contextExp_7= ruleNavigationExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getMenuActionAccess().getContextExpNavigationExpressionParserRuleCall_4_0_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleNavigationExpression_in_ruleMenuAction2402);
                            lv_contextExp_7=ruleNavigationExpression();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getMenuActionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "contextExp", lv_contextExp_7, "NavigationExpression", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1135:6: (lv_contextExp_8= ruleExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1135:6: (lv_contextExp_8= ruleExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1138:6: lv_contextExp_8= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMenuActionAccess().getContextExpExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleMenuAction2448);
                    lv_contextExp_8=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMenuActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "contextExp", lv_contextExp_8, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1156:3: ( '-->' 'page' ( RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1156:4: '-->' 'page' ( RULE_ID )
                    {
                    match(input,28,FOLLOW_28_in_ruleMenuAction2463); 

                            createLeafNode(grammarAccess.getMenuActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_5_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleMenuAction2472); 

                            createLeafNode(grammarAccess.getMenuActionAccess().getPageKeyword_5_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1164:1: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1167:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getMenuActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMenuAction2494); 

                    		createLeafNode(grammarAccess.getMenuActionAccess().getNextPagePageCrossReference_5_2_0(), "nextPage"); 
                    	

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleMenuAction2508); 

                    createLeafNode(grammarAccess.getMenuActionAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMenuAction


    // $ANTLR start entryRuleAction
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1191:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1191:48: (iv_ruleAction= ruleAction EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1192:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2541);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2551); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1199:1: ruleAction returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? (lv_collectionContext_12= 'collection' )? ';' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_1=null;
        Token lv_label_3=null;
        Token lv_collectionContext_12=null;
        Enumerator lv_type_5 = null;

        Enumerator lv_type_6 = null;

        EObject lv_contextExp_7 = null;

        EObject lv_contextExp_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1204:6: ( ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? (lv_collectionContext_12= 'collection' )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1205:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? (lv_collectionContext_12= 'collection' )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1205:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? (lv_collectionContext_12= 'collection' )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1205:2: (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ( 'label' (lv_label_3= RULE_STRING ) )? ':' ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) ) ( '-->' 'page' ( RULE_ID ) )? (lv_collectionContext_12= 'collection' )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1205:2: (lv_description_0= RULE_STRING )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1207:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction2598); 

                    		createLeafNode(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1225:3: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1227:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2629); 

            		createLeafNode(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1245:2: ( 'label' (lv_label_3= RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1245:3: 'label' (lv_label_3= RULE_STRING )
                    {
                    match(input,26,FOLLOW_26_in_ruleAction2647); 

                            createLeafNode(grammarAccess.getActionAccess().getLabelKeyword_2_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1249:1: (lv_label_3= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1251:6: lv_label_3= RULE_STRING
                    {
                    lv_label_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction2669); 

                    		createLeafNode(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_2_1_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_3, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleAction2688); 

                    createLeafNode(grammarAccess.getActionAccess().getColonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1273:1: ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=37 && LA26_0<=45)) ) {
                alt26=1;
            }
            else if ( (LA26_0==20||(LA26_0>=34 && LA26_0<=35)||(LA26_0>=46 && LA26_0<=47)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1273:1: ( ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) ) | (lv_contextExp_8= ruleExpression ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1273:2: ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1273:2: ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=37 && LA25_0<=44)) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==45) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1273:2: ( (lv_type_5= ruleProcessType ) | ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) ) )", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1273:3: (lv_type_5= ruleProcessType )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1273:3: (lv_type_5= ruleProcessType )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1276:6: lv_type_5= ruleProcessType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_4_0_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleProcessType_in_ruleAction2724);
                            lv_type_5=ruleProcessType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "ProcessType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1295:6: ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1295:6: ( (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression ) )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1295:7: (lv_type_6= ruleProcessTypeLink ) (lv_contextExp_7= ruleNavigationExpression )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1295:7: (lv_type_6= ruleProcessTypeLink )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1298:6: lv_type_6= ruleProcessTypeLink
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTypeProcessTypeLinkEnumRuleCall_4_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleProcessTypeLink_in_ruleAction2769);
                            lv_type_6=ruleProcessTypeLink();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_6, "ProcessTypeLink", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1316:2: (lv_contextExp_7= ruleNavigationExpression )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1319:6: lv_contextExp_7= ruleNavigationExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getContextExpNavigationExpressionParserRuleCall_4_0_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleNavigationExpression_in_ruleAction2807);
                            lv_contextExp_7=ruleNavigationExpression();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "contextExp", lv_contextExp_7, "NavigationExpression", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1338:6: (lv_contextExp_8= ruleExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1338:6: (lv_contextExp_8= ruleExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1341:6: lv_contextExp_8= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getContextExpExpressionParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleAction2853);
                    lv_contextExp_8=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "contextExp", lv_contextExp_8, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1359:3: ( '-->' 'page' ( RULE_ID ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1359:4: '-->' 'page' ( RULE_ID )
                    {
                    match(input,28,FOLLOW_28_in_ruleAction2868); 

                            createLeafNode(grammarAccess.getActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_5_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleAction2877); 

                            createLeafNode(grammarAccess.getActionAccess().getPageKeyword_5_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1367:1: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1370:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2899); 

                    		createLeafNode(grammarAccess.getActionAccess().getNextPagePageCrossReference_5_2_0(), "nextPage"); 
                    	

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1383:4: (lv_collectionContext_12= 'collection' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1385:6: lv_collectionContext_12= 'collection'
                    {
                    lv_collectionContext_12=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleAction2925); 

                            createLeafNode(grammarAccess.getActionAccess().getCollectionContextCollectionKeyword_6_0(), "collectionContext"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "collectionContext", true, "collection", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleAction2948); 

                    createLeafNode(grammarAccess.getActionAccess().getSemicolonKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRulePage
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1415:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1415:46: (iv_rulePage= rulePage EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1416:2: iv_rulePage= rulePage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPageRule(), currentNode); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage2981);
            iv_rulePage=rulePage();
            _fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage2991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePage


    // $ANTLR start rulePage
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1423:1: rulePage returns [EObject current=null] : ( 'page' (lv_name_1= RULE_ID ) 'shows' ( RULE_ID ) ';' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1428:6: ( ( 'page' (lv_name_1= RULE_ID ) 'shows' ( RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1429:1: ( 'page' (lv_name_1= RULE_ID ) 'shows' ( RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1429:1: ( 'page' (lv_name_1= RULE_ID ) 'shows' ( RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1429:2: 'page' (lv_name_1= RULE_ID ) 'shows' ( RULE_ID ) ';'
            {
            match(input,19,FOLLOW_19_in_rulePage3025); 

                    createLeafNode(grammarAccess.getPageAccess().getPageKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1433:1: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1435:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage3047); 

            		createLeafNode(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,30,FOLLOW_30_in_rulePage3064); 

                    createLeafNode(grammarAccess.getPageAccess().getShowsKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1457:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1460:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage3086); 

            		createLeafNode(grammarAccess.getPageAccess().getDialogueViewCrossReference_3_0(), "dialogue"); 
            	

            }

            match(input,12,FOLLOW_12_in_rulePage3098); 

                    createLeafNode(grammarAccess.getPageAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePage


    // $ANTLR start entryRuleFormElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1484:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1484:53: (iv_ruleFormElement= ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1485:2: iv_ruleFormElement= ruleFormElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement3131);
            iv_ruleFormElement=ruleFormElement();
            _fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement3141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFormElement


    // $ANTLR start ruleFormElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1492:1: ruleFormElement returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_references_1= ruleDtoPropertyReference ) ( 'label' (lv_label_3= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';' ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_label_3=null;
        Token lv_readonly_5=null;
        EObject lv_references_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1497:6: ( ( (lv_description_0= RULE_STRING )? (lv_references_1= ruleDtoPropertyReference ) ( 'label' (lv_label_3= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1498:1: ( (lv_description_0= RULE_STRING )? (lv_references_1= ruleDtoPropertyReference ) ( 'label' (lv_label_3= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1498:1: ( (lv_description_0= RULE_STRING )? (lv_references_1= ruleDtoPropertyReference ) ( 'label' (lv_label_3= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1498:2: (lv_description_0= RULE_STRING )? (lv_references_1= ruleDtoPropertyReference ) ( 'label' (lv_label_3= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1498:2: (lv_description_0= RULE_STRING )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1500:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormElement3188); 

                    		createLeafNode(grammarAccess.getFormElementAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFormElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1518:3: (lv_references_1= ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1521:6: lv_references_1= ruleDtoPropertyReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3231);
            lv_references_1=ruleDtoPropertyReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "references", lv_references_1, "DtoPropertyReference", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1539:2: ( 'label' (lv_label_3= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1539:3: 'label' (lv_label_3= RULE_STRING )
                    {
                    match(input,26,FOLLOW_26_in_ruleFormElement3245); 

                            createLeafNode(grammarAccess.getFormElementAccess().getLabelKeyword_2_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1543:1: (lv_label_3= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1545:6: lv_label_3= RULE_STRING
                    {
                    lv_label_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormElement3267); 

                    		createLeafNode(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_2_1_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFormElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_3, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1563:4: ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1563:5: 'readonly' ( (lv_readonly_5= 'true' ) | 'false' )
                    {
                    match(input,31,FOLLOW_31_in_ruleFormElement3287); 

                            createLeafNode(grammarAccess.getFormElementAccess().getReadonlyKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1567:1: ( (lv_readonly_5= 'true' ) | 'false' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==32) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==33) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1567:1: ( (lv_readonly_5= 'true' ) | 'false' )", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1567:2: (lv_readonly_5= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1567:2: (lv_readonly_5= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1569:6: lv_readonly_5= 'true'
                            {
                            lv_readonly_5=(Token)input.LT(1);
                            match(input,32,FOLLOW_32_in_ruleFormElement3309); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_3_1_0_0(), "readonly"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFormElementRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "readonly", true, "true", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1589:6: 'false'
                            {
                            match(input,33,FOLLOW_33_in_ruleFormElement3337); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getFalseKeyword_3_1_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleFormElement3349); 

                    createLeafNode(grammarAccess.getFormElementAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFormElement


    // $ANTLR start entryRuleExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1606:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1606:52: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1607:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3384);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3394); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1614:1: ruleExpression returns [EObject current=null] : (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceExpression_0 = null;

        EObject this_NavigationExpression_1 = null;

        EObject this_StandardExpression_2 = null;

        EObject this_OperationExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1619:6: ( (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1620:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1620:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt33=1;
                }
                break;
            case 35:
                {
                alt33=2;
                }
                break;
            case 46:
            case 47:
                {
                alt33=3;
                }
                break;
            case 34:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1620:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1621:5: this_ServiceExpression_0= ruleServiceExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleServiceExpression_in_ruleExpression3441);
                    this_ServiceExpression_0=ruleServiceExpression();
                    _fsp--;

                     
                            current = this_ServiceExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1631:5: this_NavigationExpression_1= ruleNavigationExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNavigationExpression_in_ruleExpression3468);
                    this_NavigationExpression_1=ruleNavigationExpression();
                    _fsp--;

                     
                            current = this_NavigationExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1641:5: this_StandardExpression_2= ruleStandardExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStandardExpression_in_ruleExpression3495);
                    this_StandardExpression_2=ruleStandardExpression();
                    _fsp--;

                     
                            current = this_StandardExpression_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1651:5: this_OperationExpression_3= ruleOperationExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOperationExpression_in_ruleExpression3522);
                    this_OperationExpression_3=ruleOperationExpression();
                    _fsp--;

                     
                            current = this_OperationExpression_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleOperationExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1666:1: entryRuleOperationExpression returns [EObject current=null] : iv_ruleOperationExpression= ruleOperationExpression EOF ;
    public final EObject entryRuleOperationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1666:61: (iv_ruleOperationExpression= ruleOperationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1667:2: iv_ruleOperationExpression= ruleOperationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression3554);
            iv_ruleOperationExpression=ruleOperationExpression();
            _fsp--;

             current =iv_ruleOperationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationExpression3564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOperationExpression


    // $ANTLR start ruleOperationExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1674:1: ruleOperationExpression returns [EObject current=null] : ( 'call' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleOperationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1679:6: ( ( 'call' (lv_name_1= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1680:1: ( 'call' (lv_name_1= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1680:1: ( 'call' (lv_name_1= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1680:2: 'call' (lv_name_1= RULE_ID )
            {
            match(input,34,FOLLOW_34_in_ruleOperationExpression3598); 

                    createLeafNode(grammarAccess.getOperationExpressionAccess().getCallKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1684:1: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1686:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationExpression3620); 

            		createLeafNode(grammarAccess.getOperationExpressionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOperationExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOperationExpression


    // $ANTLR start entryRuleStandardExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1711:1: entryRuleStandardExpression returns [EObject current=null] : iv_ruleStandardExpression= ruleStandardExpression EOF ;
    public final EObject entryRuleStandardExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1711:60: (iv_ruleStandardExpression= ruleStandardExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1712:2: iv_ruleStandardExpression= ruleStandardExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStandardExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression3661);
            iv_ruleStandardExpression=ruleStandardExpression();
            _fsp--;

             current =iv_ruleStandardExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardExpression3671); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStandardExpression


    // $ANTLR start ruleStandardExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1719:1: ruleStandardExpression returns [EObject current=null] : ( (lv_type_0= ruleExpressionType ) ( RULE_ID ) ) ;
    public final EObject ruleStandardExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1724:6: ( ( (lv_type_0= ruleExpressionType ) ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1725:1: ( (lv_type_0= ruleExpressionType ) ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1725:1: ( (lv_type_0= ruleExpressionType ) ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1725:2: (lv_type_0= ruleExpressionType ) ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1725:2: (lv_type_0= ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1728:6: lv_type_0= ruleExpressionType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpressionType_in_ruleStandardExpression3730);
            lv_type_0=ruleExpressionType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStandardExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0, "ExpressionType", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1746:2: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1749:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getStandardExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStandardExpression3756); 

            		createLeafNode(grammarAccess.getStandardExpressionAccess().getContextRefDtoReferenceCrossReference_1_0(), "contextRef"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStandardExpression


    // $ANTLR start entryRuleServiceExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1769:1: entryRuleServiceExpression returns [EObject current=null] : iv_ruleServiceExpression= ruleServiceExpression EOF ;
    public final EObject entryRuleServiceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1769:59: (iv_ruleServiceExpression= ruleServiceExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1770:2: iv_ruleServiceExpression= ruleServiceExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression3792);
            iv_ruleServiceExpression=ruleServiceExpression();
            _fsp--;

             current =iv_ruleServiceExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceExpression3802); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleServiceExpression


    // $ANTLR start ruleServiceExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1777:1: ruleServiceExpression returns [EObject current=null] : ( 'service' ( RULE_ID ) ) ;
    public final EObject ruleServiceExpression() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1782:6: ( ( 'service' ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1783:1: ( 'service' ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1783:1: ( 'service' ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1783:2: 'service' ( RULE_ID )
            {
            match(input,20,FOLLOW_20_in_ruleServiceExpression3836); 

                    createLeafNode(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1787:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1790:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getServiceExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceExpression3858); 

            		createLeafNode(grammarAccess.getServiceExpressionAccess().getServiceServiceReferenceCrossReference_1_0(), "service"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleServiceExpression


    // $ANTLR start entryRuleNavigationExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1810:1: entryRuleNavigationExpression returns [EObject current=null] : iv_ruleNavigationExpression= ruleNavigationExpression EOF ;
    public final EObject entryRuleNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1810:62: (iv_ruleNavigationExpression= ruleNavigationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1811:2: iv_ruleNavigationExpression= ruleNavigationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNavigationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression3894);
            iv_ruleNavigationExpression=ruleNavigationExpression();
            _fsp--;

             current =iv_ruleNavigationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationExpression3904); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNavigationExpression


    // $ANTLR start ruleNavigationExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1818:1: ruleNavigationExpression returns [EObject current=null] : ( 'navigate' (lv_references_1= ruleAssociationRoleReference ) ) ;
    public final EObject ruleNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_references_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1823:6: ( ( 'navigate' (lv_references_1= ruleAssociationRoleReference ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1824:1: ( 'navigate' (lv_references_1= ruleAssociationRoleReference ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1824:1: ( 'navigate' (lv_references_1= ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1824:2: 'navigate' (lv_references_1= ruleAssociationRoleReference )
            {
            match(input,35,FOLLOW_35_in_ruleNavigationExpression3938); 

                    createLeafNode(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1828:1: (lv_references_1= ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1831:6: lv_references_1= ruleAssociationRoleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression3972);
            lv_references_1=ruleAssociationRoleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNavigationExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "references", lv_references_1, "AssociationRoleReference", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNavigationExpression


    // $ANTLR start entryRuleDtoPropertyReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1856:1: entryRuleDtoPropertyReference returns [EObject current=null] : iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF ;
    public final EObject entryRuleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoPropertyReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1856:62: (iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1857:2: iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference4009);
            iv_ruleDtoPropertyReference=ruleDtoPropertyReference();
            _fsp--;

             current =iv_ruleDtoPropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference4019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDtoPropertyReference


    // $ANTLR start ruleDtoPropertyReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1864:1: ruleDtoPropertyReference returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '.' (lv_subname_2= RULE_ID ) )? ) ;
    public final EObject ruleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_subname_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1869:6: ( ( (lv_name_0= RULE_ID ) ( '.' (lv_subname_2= RULE_ID ) )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1870:1: ( (lv_name_0= RULE_ID ) ( '.' (lv_subname_2= RULE_ID ) )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1870:1: ( (lv_name_0= RULE_ID ) ( '.' (lv_subname_2= RULE_ID ) )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1870:2: (lv_name_0= RULE_ID ) ( '.' (lv_subname_2= RULE_ID ) )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1870:2: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1872:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoPropertyReference4066); 

            		createLeafNode(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoPropertyReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1890:2: ( '.' (lv_subname_2= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1890:3: '.' (lv_subname_2= RULE_ID )
                    {
                    match(input,36,FOLLOW_36_in_ruleDtoPropertyReference4084); 

                            createLeafNode(grammarAccess.getDtoPropertyReferenceAccess().getFullStopKeyword_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1894:1: (lv_subname_2= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1896:6: lv_subname_2= RULE_ID
                    {
                    lv_subname_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoPropertyReference4106); 

                    		createLeafNode(grammarAccess.getDtoPropertyReferenceAccess().getSubnameIDTerminalRuleCall_1_1_0(), "subname"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoPropertyReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "subname", lv_subname_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDtoPropertyReference


    // $ANTLR start entryRuleAssociationRoleReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1921:1: entryRuleAssociationRoleReference returns [EObject current=null] : iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF ;
    public final EObject entryRuleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationRoleReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1921:66: (iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1922:2: iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRoleReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference4149);
            iv_ruleAssociationRoleReference=ruleAssociationRoleReference();
            _fsp--;

             current =iv_ruleAssociationRoleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference4159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssociationRoleReference


    // $ANTLR start ruleAssociationRoleReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1929:1: ruleAssociationRoleReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1934:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1935:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1935:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1937:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationRoleReference4205); 

            		createLeafNode(grammarAccess.getAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRoleReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssociationRoleReference


    // $ANTLR start ruleProcessType
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1962:1: ruleProcessType returns [Enumerator current=null] : ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) | ( 'custom' ) ) ;
    public final Enumerator ruleProcessType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1966:6: ( ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) | ( 'custom' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1967:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) | ( 'custom' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1967:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) | ( 'custom' ) )
            int alt35=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt35=1;
                }
                break;
            case 38:
                {
                alt35=2;
                }
                break;
            case 39:
                {
                alt35=3;
                }
                break;
            case 40:
                {
                alt35=4;
                }
                break;
            case 41:
                {
                alt35=5;
                }
                break;
            case 42:
                {
                alt35=6;
                }
                break;
            case 43:
                {
                alt35=7;
                }
                break;
            case 44:
                {
                alt35=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1967:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) | ( 'custom' ) )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1967:2: ( 'new' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1967:2: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1967:4: 'new'
                    {
                    match(input,37,FOLLOW_37_in_ruleProcessType4259); 

                            current = grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1973:6: ( 'save' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1973:6: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1973:8: 'save'
                    {
                    match(input,38,FOLLOW_38_in_ruleProcessType4274); 

                            current = grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1979:6: ( 'edit' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1979:6: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1979:8: 'edit'
                    {
                    match(input,39,FOLLOW_39_in_ruleProcessType4289); 

                            current = grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1985:6: ( 'delete' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1985:6: ( 'delete' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1985:8: 'delete'
                    {
                    match(input,40,FOLLOW_40_in_ruleProcessType4304); 

                            current = grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1991:6: ( 'cancel' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1991:6: ( 'cancel' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1991:8: 'cancel'
                    {
                    match(input,41,FOLLOW_41_in_ruleProcessType4319); 

                            current = grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1997:6: ( 'removefrom' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1997:6: ( 'removefrom' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1997:8: 'removefrom'
                    {
                    match(input,42,FOLLOW_42_in_ruleProcessType4334); 

                            current = grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2003:6: ( 'addto' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2003:6: ( 'addto' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2003:8: 'addto'
                    {
                    match(input,43,FOLLOW_43_in_ruleProcessType4349); 

                            current = grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2009:6: ( 'custom' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2009:6: ( 'custom' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2009:8: 'custom'
                    {
                    match(input,44,FOLLOW_44_in_ruleProcessType4364); 

                            current = grammarAccess.getProcessTypeAccess().getCUSTOMEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getCUSTOMEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcessType


    // $ANTLR start ruleProcessTypeLink
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2019:1: ruleProcessTypeLink returns [Enumerator current=null] : ( 'link' ) ;
    public final Enumerator ruleProcessTypeLink() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2023:6: ( ( 'link' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2024:1: ( 'link' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2024:1: ( 'link' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2024:3: 'link'
            {
            match(input,45,FOLLOW_45_in_ruleProcessTypeLink4406); 

                    current = grammarAccess.getProcessTypeLinkAccess().getLINKEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getProcessTypeLinkAccess().getLINKEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProcessTypeLink


    // $ANTLR start ruleExpressionType
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:1: ruleExpressionType returns [Enumerator current=null] : ( ( 'all' ) | ( 'find' ) ) ;
    public final Enumerator ruleExpressionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2038:6: ( ( ( 'all' ) | ( 'find' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:1: ( ( 'all' ) | ( 'find' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:1: ( ( 'all' ) | ( 'find' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            else if ( (LA36_0==47) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2039:1: ( ( 'all' ) | ( 'find' ) )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:2: ( 'all' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:2: ( 'all' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:4: 'all'
                    {
                    match(input,46,FOLLOW_46_in_ruleExpressionType4448); 

                            current = grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2045:6: ( 'find' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2045:6: ( 'find' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2045:8: 'find'
                    {
                    match(input,47,FOLLOW_47_in_ruleExpressionType4463); 

                            current = grammarAccess.getExpressionTypeAccess().getFINDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getExpressionTypeAccess().getFINDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpressionType


 

    public static final BitSet FOLLOW_rulePresentationModel_in_entryRulePresentationModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentationModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_rulePresentationModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormsAndProcesses_in_rulePresentationModel157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationModel199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel246 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleApplicationModel264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel286 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationModel303 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleExternalReference_in_ruleApplicationModel337 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleMenu_in_ruleApplicationModel376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormsAndProcesses_in_entryRuleFormsAndProcesses413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormsAndProcesses423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormsAndProcesses470 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFormsAndProcesses488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormsAndProcesses510 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFormsAndProcesses527 = new BitSet(new long[]{0x00000000002A0012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_ruleFormsAndProcesses561 = new BitSet(new long[]{0x00000000002A0012L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_ruleFormsAndProcesses600 = new BitSet(new long[]{0x0000000000280012L});
    public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenu648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMenu682 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMenu691 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_ruleMenuAction_in_ruleMenu725 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_16_in_ruleMenu739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoReference_in_ruleExternalReference829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageReference_in_ruleExternalReference856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceReference_in_ruleExternalReference883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoReference_in_entryRuleDtoReference915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoReference925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDtoReference959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference981 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDtoReference998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference1020 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDtoReference1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageReference_in_entryRulePageReference1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageReference1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePageReference1114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePageReference1136 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePageReference1153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePageReference1175 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePageReference1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceReference_in_entryRuleServiceReference1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceReference1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleServiceReference1269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceReference1291 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleServiceReference1308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceReference1330 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServiceReference1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDialogue_in_ruleUIModelElement1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDialogue_in_entryRuleAbstractDialogue1554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDialogue1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleAbstractDialogue1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_ruleAbstractDialogue1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleView1727 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleView1745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1767 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_22_in_ruleView1786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1808 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleView1820 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleView1830 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleView1839 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleView1873 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_16_in_ruleView1887 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleView1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleView1915 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleView1936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1972 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleView1984 = new BitSet(new long[]{0x0000000000810030L});
    public static final BitSet FOLLOW_ruleFormElement_in_ruleView2018 = new BitSet(new long[]{0x0000000000810030L});
    public static final BitSet FOLLOW_23_in_ruleView2033 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleView2042 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleView2076 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_16_in_ruleView2090 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleView2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMenuAction_in_entryRuleMenuAction2136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMenuAction2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMenuAction2193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMenuAction2224 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleMenuAction2242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMenuAction2264 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMenuAction2283 = new BitSet(new long[]{0x0000FFEC00100000L});
    public static final BitSet FOLLOW_ruleProcessType_in_ruleMenuAction2319 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_ruleMenuAction2364 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_ruleMenuAction2402 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMenuAction2448 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_28_in_ruleMenuAction2463 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMenuAction2472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMenuAction2494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMenuAction2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction2598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2629 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleAction2647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction2669 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAction2688 = new BitSet(new long[]{0x0000FFEC00100000L});
    public static final BitSet FOLLOW_ruleProcessType_in_ruleAction2724 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_ruleAction2769 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_ruleAction2807 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAction2853 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_28_in_ruleAction2868 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAction2877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2899 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleAction2925 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage2981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePage3025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage3047 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePage3064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage3086 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePage3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement3131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormElement3188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3231 = new BitSet(new long[]{0x0000000084001000L});
    public static final BitSet FOLLOW_26_in_ruleFormElement3245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormElement3267 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleFormElement3287 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleFormElement3309 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33_in_ruleFormElement3337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFormElement3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_ruleExpression3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_ruleExpression3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_ruleExpression3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_ruleExpression3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression3554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationExpression3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperationExpression3598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationExpression3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression3661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardExpression3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_ruleStandardExpression3730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStandardExpression3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression3792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceExpression3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleServiceExpression3836 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceExpression3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression3894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationExpression3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNavigationExpression3938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference4009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoPropertyReference4066 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleDtoPropertyReference4084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoPropertyReference4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference4149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationRoleReference4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleProcessType4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleProcessType4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleProcessType4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleProcessType4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleProcessType4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleProcessType4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleProcessType4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleProcessType4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleProcessTypeLink4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExpressionType4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleExpressionType4463 = new BitSet(new long[]{0x0000000000000002L});

}