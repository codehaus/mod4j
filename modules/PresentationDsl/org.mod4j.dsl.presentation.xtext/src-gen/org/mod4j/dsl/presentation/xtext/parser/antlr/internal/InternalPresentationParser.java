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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'presentation'", "';'", "'application'", "'['", "']'", "'from'", "'import'", "'form'", "'context'", "'list'", "'readonly'", "'true'", "'false'", "'actions'", "'processes'", "'label'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'process'", "'element'", "'dialogue'", "':'", "'if'", "'('", "')'", "'call'", "'service'", "'.'", "'composite'", "'navigate'", "'new'", "'save'", "'edit'", "'delete'", "'cancel'", "'removefrom'", "'addto'", "'link'", "'all'", "'find'"
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:81:1: rulePresentationModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication ) (lv_elements_6= ruleModelElementWithContext )* ) ;
    public final EObject rulePresentationModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_start_5 = null;

        EObject lv_elements_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:6: ( ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication ) (lv_elements_6= ruleModelElementWithContext )* ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication ) (lv_elements_6= ruleModelElementWithContext )* )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication ) (lv_elements_6= ruleModelElementWithContext )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:2: (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication ) (lv_elements_6= ruleModelElementWithContext )*
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:2: (lv_description_0= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:89:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePresentationModel130); 

                    		createLeafNode(grammarAccess.getPresentationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentationModelRule().getType().getClassifier());
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

            match(input,11,FOLLOW_11_in_rulePresentationModel148); 

                    createLeafNode(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:111:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:113:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePresentationModel170); 

            		createLeafNode(grammarAccess.getPresentationModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentationModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_rulePresentationModel187); 

                    createLeafNode(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:135:1: (lv_externalReferences_4= ruleExternalReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:138:6: lv_externalReferences_4= ruleExternalReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalReference_in_rulePresentationModel221);
            	    lv_externalReferences_4=ruleExternalReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentationModelRule().getType().getClassifier());
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
            	    break loop2;
                }
            } while (true);

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:156:3: (lv_start_5= ruleApplication )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:159:6: lv_start_5= ruleApplication
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentationModelAccess().getStartApplicationParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_rulePresentationModel260);
            lv_start_5=ruleApplication();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentationModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "start", lv_start_5, "Application", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:177:2: (lv_elements_6= ruleModelElementWithContext )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==18||LA3_0==27||(LA3_0>=29 && LA3_0<=30)||LA3_0==33) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:180:6: lv_elements_6= ruleModelElementWithContext
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentationModelAccess().getElementsModelElementWithContextParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElementWithContext_in_rulePresentationModel298);
            	    lv_elements_6=ruleModelElementWithContext();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentationModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elements", lv_elements_6, "ModelElementWithContext", currentNode);
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


    // $ANTLR start entryRuleApplication
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:205:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:205:53: (iv_ruleApplication= ruleApplication EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:206:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication336);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication346); 

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
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:213:1: ruleApplication returns [EObject current=null] : ( 'application' '[' ( (lv_startProcesses_2= ruleSimpleProcessCall ) ';' )+ ']' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject lv_startProcesses_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:218:6: ( ( 'application' '[' ( (lv_startProcesses_2= ruleSimpleProcessCall ) ';' )+ ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:219:1: ( 'application' '[' ( (lv_startProcesses_2= ruleSimpleProcessCall ) ';' )+ ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:219:1: ( 'application' '[' ( (lv_startProcesses_2= ruleSimpleProcessCall ) ';' )+ ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:219:2: 'application' '[' ( (lv_startProcesses_2= ruleSimpleProcessCall ) ';' )+ ']'
            {
            match(input,13,FOLLOW_13_in_ruleApplication380); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            match(input,14,FOLLOW_14_in_ruleApplication389); 

                    createLeafNode(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:227:1: ( (lv_startProcesses_2= ruleSimpleProcessCall ) ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:227:2: (lv_startProcesses_2= ruleSimpleProcessCall ) ';'
            	    {
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:227:2: (lv_startProcesses_2= ruleSimpleProcessCall )
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:230:6: lv_startProcesses_2= ruleSimpleProcessCall
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_2_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleProcessCall_in_ruleApplication424);
            	    lv_startProcesses_2=ruleSimpleProcessCall();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "startProcesses", lv_startProcesses_2, "SimpleProcessCall", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    match(input,12,FOLLOW_12_in_ruleApplication437); 

            	            createLeafNode(grammarAccess.getApplicationAccess().getSemicolonKeyword_2_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match(input,15,FOLLOW_15_in_ruleApplication448); 

                    createLeafNode(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleExternalReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:263:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:263:59: (iv_ruleExternalReference= ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:264:2: iv_ruleExternalReference= ruleExternalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference481);
            iv_ruleExternalReference=ruleExternalReference();
            _fsp--;

             current =iv_ruleExternalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference491); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:271:1: ruleExternalReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:276:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:277:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:277:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:277:2: 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';'
            {
            match(input,16,FOLLOW_16_in_ruleExternalReference525); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:281:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:283:6: lv_modelName_1= RULE_ID
            {
            lv_modelName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference547); 

            		createLeafNode(grammarAccess.getExternalReferenceAccess().getModelNameIDTerminalRuleCall_1_0(), "modelName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "modelName", lv_modelName_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleExternalReference564); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getImportKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:305:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:307:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference586); 

            		createLeafNode(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleExternalReference603); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_4(), null); 
                

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


    // $ANTLR start entryRuleModelElementWithContext
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:336:1: entryRuleModelElementWithContext returns [EObject current=null] : iv_ruleModelElementWithContext= ruleModelElementWithContext EOF ;
    public final EObject entryRuleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementWithContext = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:336:65: (iv_ruleModelElementWithContext= ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:337:2: iv_ruleModelElementWithContext= ruleModelElementWithContext EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelElementWithContextRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext636);
            iv_ruleModelElementWithContext=ruleModelElementWithContext();
            _fsp--;

             current =iv_ruleModelElementWithContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElementWithContext646); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:344:1: ruleModelElementWithContext returns [EObject current=null] : this_UIModelElement_0= ruleUIModelElement ;
    public final EObject ruleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElement_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:349:6: (this_UIModelElement_0= ruleUIModelElement )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:351:5: this_UIModelElement_0= ruleUIModelElement
            {
             
                    currentNode=createCompositeNode(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext692);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:366:1: entryRuleUIModelElement returns [EObject current=null] : iv_ruleUIModelElement= ruleUIModelElement EOF ;
    public final EObject entryRuleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:366:56: (iv_ruleUIModelElement= ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:367:2: iv_ruleUIModelElement= ruleUIModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement723);
            iv_ruleUIModelElement=ruleUIModelElement();
            _fsp--;

             current =iv_ruleUIModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement733); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:374:1: ruleUIModelElement returns [EObject current=null] : (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) ;
    public final EObject ruleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Dialogue_0 = null;

        EObject this_Process_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:379:6: ( (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:380:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:380:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==18||LA5_1==27||(LA5_1>=29 && LA5_1<=30)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==33) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("380:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
            case 27:
            case 29:
            case 30:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("380:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:381:5: this_Dialogue_0= ruleDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogue_in_ruleUIModelElement780);
                    this_Dialogue_0=ruleDialogue();
                    _fsp--;

                     
                            current = this_Dialogue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:391:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleUIModelElement807);
                    this_Process_1=ruleProcess();
                    _fsp--;

                     
                            current = this_Process_1; 
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
    // $ANTLR end ruleUIModelElement


    // $ANTLR start entryRuleDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:406:1: entryRuleDialogue returns [EObject current=null] : iv_ruleDialogue= ruleDialogue EOF ;
    public final EObject entryRuleDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:406:50: (iv_ruleDialogue= ruleDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:407:2: iv_ruleDialogue= ruleDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogue_in_entryRuleDialogue839);
            iv_ruleDialogue=ruleDialogue();
            _fsp--;

             current =iv_ruleDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogue849); 

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
    // $ANTLR end entryRuleDialogue


    // $ANTLR start ruleDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:414:1: ruleDialogue returns [EObject current=null] : (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) ;
    public final EObject ruleDialogue() throws RecognitionException {
        EObject current = null;

        EObject this_ContentForm_0 = null;

        EObject this_CompoundDialogue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:419:6: ( (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:420:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:420:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==27||(LA6_1>=29 && LA6_1<=30)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==18) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("420:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt6=1;
                }
                break;
            case 27:
            case 29:
            case 30:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("420:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:421:5: this_ContentForm_0= ruleContentForm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentForm_in_ruleDialogue896);
                    this_ContentForm_0=ruleContentForm();
                    _fsp--;

                     
                            current = this_ContentForm_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:431:5: this_CompoundDialogue_1= ruleCompoundDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_ruleDialogue923);
                    this_CompoundDialogue_1=ruleCompoundDialogue();
                    _fsp--;

                     
                            current = this_CompoundDialogue_1; 
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
    // $ANTLR end ruleDialogue


    // $ANTLR start entryRuleContentForm
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:446:1: entryRuleContentForm returns [EObject current=null] : iv_ruleContentForm= ruleContentForm EOF ;
    public final EObject entryRuleContentForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentForm = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:446:53: (iv_ruleContentForm= ruleContentForm EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:447:2: iv_ruleContentForm= ruleContentForm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentFormRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentForm_in_entryRuleContentForm955);
            iv_ruleContentForm=ruleContentForm();
            _fsp--;

             current =iv_ruleContentForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentForm965); 

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
    // $ANTLR end entryRuleContentForm


    // $ANTLR start ruleContentForm
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:454:1: ruleContentForm returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']' ) ;
    public final EObject ruleContentForm() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_collectionContext_4=null;
        Token lv_readonly_8=null;
        EObject lv_formElements_11 = null;

        EObject lv_actions_14 = null;

        EObject lv_processes_19 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:459:6: ( ( (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:460:1: ( (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:460:1: ( (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:460:2: (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:460:2: (lv_description_0= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:462:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContentForm1012); 

                    		createLeafNode(grammarAccess.getContentFormAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
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

            match(input,18,FOLLOW_18_in_ruleContentForm1030); 

                    createLeafNode(grammarAccess.getContentFormAccess().getFormKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:484:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:486:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm1052); 

            		createLeafNode(grammarAccess.getContentFormAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleContentForm1069); 

                    createLeafNode(grammarAccess.getContentFormAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:508:1: (lv_collectionContext_4= 'list' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:510:6: lv_collectionContext_4= 'list'
                    {
                    lv_collectionContext_4=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleContentForm1090); 

                            createLeafNode(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0(), "collectionContext"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:529:3: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:532:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm1126); 

            		createLeafNode(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_5_0(), "contextRef"); 
            	

            }

            match(input,14,FOLLOW_14_in_ruleContentForm1138); 

                    createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:549:1: ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:549:2: 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';'
                    {
                    match(input,21,FOLLOW_21_in_ruleContentForm1148); 

                            createLeafNode(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:553:1: ( (lv_readonly_8= 'true' ) | 'false' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==23) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("553:1: ( (lv_readonly_8= 'true' ) | 'false' )", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:553:2: (lv_readonly_8= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:553:2: (lv_readonly_8= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:555:6: lv_readonly_8= 'true'
                            {
                            lv_readonly_8=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleContentForm1170); 

                                    createLeafNode(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0(), "readonly"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:575:6: 'false'
                            {
                            match(input,23,FOLLOW_23_in_ruleContentForm1198); 

                                    createLeafNode(grammarAccess.getContentFormAccess().getFalseKeyword_7_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleContentForm1208); 

                            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_7_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:583:3: (lv_formElements_11= ruleFormElement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:586:6: lv_formElements_11= ruleFormElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormElement_in_ruleContentForm1244);
            	    lv_formElements_11=ruleFormElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "formElements", lv_formElements_11, "FormElement", currentNode);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:604:3: ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:604:4: 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']'
                    {
                    match(input,24,FOLLOW_24_in_ruleContentForm1259); 

                            createLeafNode(grammarAccess.getContentFormAccess().getActionsKeyword_9_0(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleContentForm1268); 

                            createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:612:1: ( (lv_actions_14= ruleAction ) ';' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||(LA12_0>=45 && LA12_0<=51)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:612:2: (lv_actions_14= ruleAction ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:612:2: (lv_actions_14= ruleAction )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:615:6: lv_actions_14= ruleAction
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getActionsActionParserRuleCall_9_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleContentForm1303);
                    	    lv_actions_14=ruleAction();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "actions", lv_actions_14, "Action", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }

                    	    match(input,12,FOLLOW_12_in_ruleContentForm1316); 

                    	            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleContentForm1327); 

                            createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:641:3: ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:641:4: 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']'
                    {
                    match(input,25,FOLLOW_25_in_ruleContentForm1339); 

                            createLeafNode(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleContentForm1348); 

                            createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:649:1: ( (lv_processes_19= ruleSimpleProcessCall ) ';' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:649:2: (lv_processes_19= ruleSimpleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:649:2: (lv_processes_19= ruleSimpleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:652:6: lv_processes_19= ruleSimpleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getProcessesSimpleProcessCallParserRuleCall_10_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleProcessCall_in_ruleContentForm1383);
                    	    lv_processes_19=ruleSimpleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_19, "SimpleProcessCall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }

                    	    match(input,12,FOLLOW_12_in_ruleContentForm1396); 

                    	            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_10_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleContentForm1407); 

                            createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10_3(), null); 
                        

                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleContentForm1418); 

                    createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_11(), null); 
                

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
    // $ANTLR end ruleContentForm


    // $ANTLR start entryRuleAction
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:689:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:689:48: (iv_ruleAction= ruleAction EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:690:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1451);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1461); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:697:1: ruleAction returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_label_4=null;
        Enumerator lv_type_1 = null;

        EObject lv_processElements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:702:6: ( ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:703:1: ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:703:1: ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:703:2: (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:703:2: (lv_description_0= RULE_STRING )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:705:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction1508); 

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:723:3: (lv_type_1= ruleProcessType )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=45 && LA17_0<=51)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:726:6: lv_type_1= ruleProcessType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcessType_in_ruleAction1551);
                    lv_type_1=ruleProcessType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_1, "ProcessType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:744:3: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:746:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1578); 

            		createLeafNode(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:764:2: ( 'label' (lv_label_4= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:764:3: 'label' (lv_label_4= RULE_STRING )
                    {
                    match(input,26,FOLLOW_26_in_ruleAction1596); 

                            createLeafNode(grammarAccess.getActionAccess().getLabelKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:768:1: (lv_label_4= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:770:6: lv_label_4= RULE_STRING
                    {
                    lv_label_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction1618); 

                    		createLeafNode(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_3_1_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_4, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:788:4: (lv_processElements_5= ruleActionDialogueCall )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35||(LA19_0>=40 && LA19_0<=41)||(LA19_0>=43 && LA19_0<=44)||(LA19_0>=53 && LA19_0<=54)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:791:6: lv_processElements_5= ruleActionDialogueCall
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getProcessElementsActionDialogueCallParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleActionDialogueCall_in_ruleAction1662);
                    lv_processElements_5=ruleActionDialogueCall();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "processElements", lv_processElements_5, "ActionDialogueCall", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleCompoundDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:816:1: entryRuleCompoundDialogue returns [EObject current=null] : iv_ruleCompoundDialogue= ruleCompoundDialogue EOF ;
    public final EObject entryRuleCompoundDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:816:58: (iv_ruleCompoundDialogue= ruleCompoundDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:817:2: iv_ruleCompoundDialogue= ruleCompoundDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue1700);
            iv_ruleCompoundDialogue=ruleCompoundDialogue();
            _fsp--;

             current =iv_ruleCompoundDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundDialogue1710); 

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
    // $ANTLR end entryRuleCompoundDialogue


    // $ANTLR start ruleCompoundDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:824:1: ruleCompoundDialogue returns [EObject current=null] : ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail ) ;
    public final EObject ruleCompoundDialogue() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_6=null;
        EObject lv_dialogues_11 = null;

        EObject lv_processes_16 = null;

        EObject this_CollectionDialogue_19 = null;

        EObject this_MasterDetail_20 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:829:6: ( ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt27=3;
                    }
                    break;
                case 27:
                    {
                    alt27=1;
                    }
                    break;
                case 29:
                    {
                    alt27=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("830:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )", 27, 1, input);

                    throw nvae;
                }

                }
                break;
            case 27:
                {
                alt27=1;
                }
                break;
            case 29:
                {
                alt27=2;
                }
                break;
            case 30:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("830:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:3: (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )?
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:3: (lv_description_0= RULE_STRING )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_STRING) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:832:6: lv_description_0= RULE_STRING
                            {
                            lv_description_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompoundDialogue1758); 

                            		createLeafNode(grammarAccess.getCompoundDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0(), "description"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
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

                    match(input,27,FOLLOW_27_in_ruleCompoundDialogue1776); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:854:1: (lv_name_2= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:856:6: lv_name_2= RULE_ID
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue1798); 

                    		createLeafNode(grammarAccess.getCompoundDialogueAccess().getNameIDTerminalRuleCall_0_2_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,19,FOLLOW_19_in_ruleCompoundDialogue1815); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:878:1: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:881:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue1837); 

                    		createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0(), "contextRef"); 
                    	

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:894:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==21) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:894:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                            {
                            match(input,21,FOLLOW_21_in_ruleCompoundDialogue1850); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:898:1: ( (lv_readonly_6= 'true' ) | 'false' )
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==22) ) {
                                alt21=1;
                            }
                            else if ( (LA21_0==23) ) {
                                alt21=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("898:1: ( (lv_readonly_6= 'true' ) | 'false' )", 21, 0, input);

                                throw nvae;
                            }
                            switch (alt21) {
                                case 1 :
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:898:2: (lv_readonly_6= 'true' )
                                    {
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:898:2: (lv_readonly_6= 'true' )
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:900:6: lv_readonly_6= 'true'
                                    {
                                    lv_readonly_6=(Token)input.LT(1);
                                    match(input,22,FOLLOW_22_in_ruleCompoundDialogue1872); 

                                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0(), "readonly"); 
                                        

                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
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
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:920:6: 'false'
                                    {
                                    match(input,23,FOLLOW_23_in_ruleCompoundDialogue1900); 

                                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1(), null); 
                                        

                                    }
                                    break;

                            }

                            match(input,12,FOLLOW_12_in_ruleCompoundDialogue1910); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:928:3: ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==28) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:928:4: 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']'
                            {
                            match(input,28,FOLLOW_28_in_ruleCompoundDialogue1922); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0(), null); 
                                
                            match(input,14,FOLLOW_14_in_ruleCompoundDialogue1931); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:936:1: ( (lv_dialogues_11= ruleDialogueCall ) ';' )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_STRING||LA23_0==35||LA23_0==37||(LA23_0>=40 && LA23_0<=41)||(LA23_0>=43 && LA23_0<=44)||(LA23_0>=53 && LA23_0<=54)) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:936:2: (lv_dialogues_11= ruleDialogueCall ) ';'
                            	    {
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:936:2: (lv_dialogues_11= ruleDialogueCall )
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:939:6: lv_dialogues_11= ruleDialogueCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue1966);
                            	    lv_dialogues_11=ruleDialogueCall();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        
                            	    	        try {
                            	    	       		add(current, "dialogues", lv_dialogues_11, "DialogueCall", currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }

                            	    match(input,12,FOLLOW_12_in_ruleCompoundDialogue1979); 

                            	            createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1(), null); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);

                            match(input,15,FOLLOW_15_in_ruleCompoundDialogue1990); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:965:3: ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==25) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:965:4: 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']'
                            {
                            match(input,25,FOLLOW_25_in_ruleCompoundDialogue2002); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0(), null); 
                                
                            match(input,14,FOLLOW_14_in_ruleCompoundDialogue2011); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:973:1: ( (lv_processes_16= ruleProcessCall ) ';' )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==RULE_STRING||LA25_0==33||LA25_0==37||(LA25_0>=40 && LA25_0<=41)||(LA25_0>=43 && LA25_0<=44)||(LA25_0>=53 && LA25_0<=54)) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:973:2: (lv_processes_16= ruleProcessCall ) ';'
                            	    {
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:973:2: (lv_processes_16= ruleProcessCall )
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:976:6: lv_processes_16= ruleProcessCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCompoundDialogue2046);
                            	    lv_processes_16=ruleProcessCall();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        
                            	    	        try {
                            	    	       		add(current, "processes", lv_processes_16, "ProcessCall", currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }

                            	    match(input,12,FOLLOW_12_in_ruleCompoundDialogue2059); 

                            	            createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1(), null); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);

                            match(input,15,FOLLOW_15_in_ruleCompoundDialogue2070); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1004:5: this_CollectionDialogue_19= ruleCollectionDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue2101);
                    this_CollectionDialogue_19=ruleCollectionDialogue();
                    _fsp--;

                     
                            current = this_CollectionDialogue_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1014:5: this_MasterDetail_20= ruleMasterDetail
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue2128);
                    this_MasterDetail_20=ruleMasterDetail();
                    _fsp--;

                     
                            current = this_MasterDetail_20; 
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
    // $ANTLR end ruleCompoundDialogue


    // $ANTLR start entryRuleCollectionDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1029:1: entryRuleCollectionDialogue returns [EObject current=null] : iv_ruleCollectionDialogue= ruleCollectionDialogue EOF ;
    public final EObject entryRuleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1029:60: (iv_ruleCollectionDialogue= ruleCollectionDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1030:2: iv_ruleCollectionDialogue= ruleCollectionDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue2160);
            iv_ruleCollectionDialogue=ruleCollectionDialogue();
            _fsp--;

             current =iv_ruleCollectionDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionDialogue2170); 

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
    // $ANTLR end entryRuleCollectionDialogue


    // $ANTLR start ruleCollectionDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1037:1: ruleCollectionDialogue returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' ) ;
    public final EObject ruleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_7=null;
        EObject lv_dialogues_12 = null;

        EObject lv_processes_17 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1042:6: ( ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1043:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1043:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1043:2: (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1043:2: (lv_description_0= RULE_STRING )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1045:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollectionDialogue2217); 

                    		createLeafNode(grammarAccess.getCollectionDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
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

            match(input,29,FOLLOW_29_in_ruleCollectionDialogue2235); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1067:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1069:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue2257); 

            		createLeafNode(grammarAccess.getCollectionDialogueAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleCollectionDialogue2274); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1091:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1094:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue2296); 

            		createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            match(input,14,FOLLOW_14_in_ruleCollectionDialogue2308); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1111:1: ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1111:2: 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';'
                    {
                    match(input,21,FOLLOW_21_in_ruleCollectionDialogue2318); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1115:1: ( (lv_readonly_7= 'true' ) | 'false' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==22) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==23) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1115:1: ( (lv_readonly_7= 'true' ) | 'false' )", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1115:2: (lv_readonly_7= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1115:2: (lv_readonly_7= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1117:6: lv_readonly_7= 'true'
                            {
                            lv_readonly_7=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleCollectionDialogue2340); 

                                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0(), "readonly"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1137:6: 'false'
                            {
                            match(input,23,FOLLOW_23_in_ruleCollectionDialogue2368); 

                                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleCollectionDialogue2378); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1145:3: ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1145:4: 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']'
                    {
                    match(input,28,FOLLOW_28_in_ruleCollectionDialogue2390); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleCollectionDialogue2399); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1153:1: ( (lv_dialogues_12= ruleDialogueCall ) ';' )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_STRING||LA31_0==35||LA31_0==37||(LA31_0>=40 && LA31_0<=41)||(LA31_0>=43 && LA31_0<=44)||(LA31_0>=53 && LA31_0<=54)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1153:2: (lv_dialogues_12= ruleDialogueCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1153:2: (lv_dialogues_12= ruleDialogueCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1156:6: lv_dialogues_12= ruleDialogueCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue2434);
                    	    lv_dialogues_12=ruleDialogueCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "dialogues", lv_dialogues_12, "DialogueCall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }

                    	    match(input,12,FOLLOW_12_in_ruleCollectionDialogue2447); 

                    	            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleCollectionDialogue2458); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1182:3: ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1182:4: 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']'
                    {
                    match(input,25,FOLLOW_25_in_ruleCollectionDialogue2470); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleCollectionDialogue2479); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1190:1: ( (lv_processes_17= ruleProcessCall ) ';' )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_STRING||LA33_0==33||LA33_0==37||(LA33_0>=40 && LA33_0<=41)||(LA33_0>=43 && LA33_0<=44)||(LA33_0>=53 && LA33_0<=54)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1190:2: (lv_processes_17= ruleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1190:2: (lv_processes_17= ruleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1193:6: lv_processes_17= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCollectionDialogue2514);
                    	    lv_processes_17=ruleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_17, "ProcessCall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }

                    	    match(input,12,FOLLOW_12_in_ruleCollectionDialogue2527); 

                    	            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleCollectionDialogue2538); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3(), null); 
                        

                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleCollectionDialogue2549); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_9(), null); 
                

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
    // $ANTLR end ruleCollectionDialogue


    // $ANTLR start entryRuleMasterDetail
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1230:1: entryRuleMasterDetail returns [EObject current=null] : iv_ruleMasterDetail= ruleMasterDetail EOF ;
    public final EObject entryRuleMasterDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMasterDetail = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1230:54: (iv_ruleMasterDetail= ruleMasterDetail EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1231:2: iv_ruleMasterDetail= ruleMasterDetail EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMasterDetailRule(), currentNode); 
            pushFollow(FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail2582);
            iv_ruleMasterDetail=ruleMasterDetail();
            _fsp--;

             current =iv_ruleMasterDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterDetail2592); 

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
    // $ANTLR end entryRuleMasterDetail


    // $ANTLR start ruleMasterDetail
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1238:1: ruleMasterDetail returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ) ;
    public final EObject ruleMasterDetail() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_6=null;
        EObject lv_master_10 = null;

        EObject lv_detail_13 = null;

        EObject lv_processes_17 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1243:6: ( ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1244:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1244:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1244:2: (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1244:2: (lv_description_0= RULE_STRING )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1246:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMasterDetail2639); 

                    		createLeafNode(grammarAccess.getMasterDetailAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
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

            match(input,30,FOLLOW_30_in_ruleMasterDetail2657); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1268:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1270:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail2679); 

            		createLeafNode(grammarAccess.getMasterDetailAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleMasterDetail2696); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1292:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1295:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail2718); 

            		createLeafNode(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1308:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1308:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                    {
                    match(input,21,FOLLOW_21_in_ruleMasterDetail2731); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1312:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==22) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==23) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1312:1: ( (lv_readonly_6= 'true' ) | 'false' )", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1312:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1312:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1314:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleMasterDetail2753); 

                                    createLeafNode(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0(), "readonly"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1334:6: 'false'
                            {
                            match(input,23,FOLLOW_23_in_ruleMasterDetail2781); 

                                    createLeafNode(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleMasterDetail2791); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2(), null); 
                        

                    }
                    break;

            }

            match(input,31,FOLLOW_31_in_ruleMasterDetail2802); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterKeyword_6(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1346:1: (lv_master_10= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1349:6: lv_master_10= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail2836);
            lv_master_10=ruleDialogueCall();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "master", lv_master_10, "DialogueCall", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,12,FOLLOW_12_in_ruleMasterDetail2849); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8(), null); 
                
            match(input,32,FOLLOW_32_in_ruleMasterDetail2858); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getDetailKeyword_9(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1375:1: (lv_detail_13= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1378:6: lv_detail_13= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail2892);
            lv_detail_13=ruleDialogueCall();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "detail", lv_detail_13, "DialogueCall", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,12,FOLLOW_12_in_ruleMasterDetail2905); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1400:1: ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1400:2: 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']'
                    {
                    match(input,25,FOLLOW_25_in_ruleMasterDetail2915); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleMasterDetail2924); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1408:1: ( (lv_processes_17= ruleProcessCall ) ';' )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_STRING||LA38_0==33||LA38_0==37||(LA38_0>=40 && LA38_0<=41)||(LA38_0>=43 && LA38_0<=44)||(LA38_0>=53 && LA38_0<=54)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1408:2: (lv_processes_17= ruleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1408:2: (lv_processes_17= ruleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1411:6: lv_processes_17= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleMasterDetail2959);
                    	    lv_processes_17=ruleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_17, "ProcessCall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }

                    	    match(input,12,FOLLOW_12_in_ruleMasterDetail2972); 

                    	            createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleMasterDetail2983); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getRightSquareBracketKeyword_12_3(), null); 
                        

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
    // $ANTLR end ruleMasterDetail


    // $ANTLR start entryRuleProcess
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1444:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1444:49: (iv_ruleProcess= ruleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1445:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess3018);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess3028); 

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
    // $ANTLR end entryRuleProcess


    // $ANTLR start ruleProcess
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1452:1: ruleProcess returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'process' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( (lv_type_7= ruleProcessType ) | ( (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference ) ) )? ( (lv_processElements_10= ruleUICall ) ';' )* ']' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_collectionContext_4=null;
        Enumerator lv_type_7 = null;

        Enumerator lv_type_8 = null;

        EObject lv_link_9 = null;

        EObject lv_processElements_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1457:6: ( ( (lv_description_0= RULE_STRING )? 'process' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( (lv_type_7= ruleProcessType ) | ( (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference ) ) )? ( (lv_processElements_10= ruleUICall ) ';' )* ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1458:1: ( (lv_description_0= RULE_STRING )? 'process' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( (lv_type_7= ruleProcessType ) | ( (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference ) ) )? ( (lv_processElements_10= ruleUICall ) ';' )* ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1458:1: ( (lv_description_0= RULE_STRING )? 'process' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( (lv_type_7= ruleProcessType ) | ( (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference ) ) )? ( (lv_processElements_10= ruleUICall ) ';' )* ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1458:2: (lv_description_0= RULE_STRING )? 'process' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( (lv_type_7= ruleProcessType ) | ( (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference ) ) )? ( (lv_processElements_10= ruleUICall ) ';' )* ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1458:2: (lv_description_0= RULE_STRING )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1460:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcess3075); 

                    		createLeafNode(grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
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

            match(input,33,FOLLOW_33_in_ruleProcess3093); 

                    createLeafNode(grammarAccess.getProcessAccess().getProcessKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1482:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1484:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess3115); 

            		createLeafNode(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,19,FOLLOW_19_in_ruleProcess3132); 

                    createLeafNode(grammarAccess.getProcessAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1506:1: (lv_collectionContext_4= 'list' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1508:6: lv_collectionContext_4= 'list'
                    {
                    lv_collectionContext_4=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleProcess3153); 

                            createLeafNode(grammarAccess.getProcessAccess().getCollectionContextListKeyword_4_0(), "collectionContext"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1527:3: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1530:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess3189); 

            		createLeafNode(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_5_0(), "contextRef"); 
            	

            }

            match(input,14,FOLLOW_14_in_ruleProcess3201); 

                    createLeafNode(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_6(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1547:1: ( (lv_type_7= ruleProcessType ) | ( (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference ) ) )?
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=45 && LA42_0<=51)) ) {
                alt42=1;
            }
            else if ( (LA42_0==52) ) {
                alt42=2;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1547:2: (lv_type_7= ruleProcessType )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1547:2: (lv_type_7= ruleProcessType )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1550:6: lv_type_7= ruleProcessType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_7_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcessType_in_ruleProcess3236);
                    lv_type_7=ruleProcessType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_7, "ProcessType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1569:6: ( (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1569:6: ( (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference ) )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1569:7: (lv_type_8= ruleProcessTypeLink ) (lv_link_9= ruleAssociationRoleReference )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1569:7: (lv_type_8= ruleProcessTypeLink )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1572:6: lv_type_8= ruleProcessTypeLink
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getTypeProcessTypeLinkEnumRuleCall_7_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcessTypeLink_in_ruleProcess3281);
                    lv_type_8=ruleProcessTypeLink();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_8, "ProcessTypeLink", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1590:2: (lv_link_9= ruleAssociationRoleReference )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1593:6: lv_link_9= ruleAssociationRoleReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getLinkAssociationRoleReferenceParserRuleCall_7_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleProcess3319);
                    lv_link_9=ruleAssociationRoleReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "link", lv_link_9, "AssociationRoleReference", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1611:5: ( (lv_processElements_10= ruleUICall ) ';' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_STRING||LA43_0==33||LA43_0==35||LA43_0==37||(LA43_0>=40 && LA43_0<=41)||(LA43_0>=43 && LA43_0<=44)||(LA43_0>=53 && LA43_0<=54)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1611:6: (lv_processElements_10= ruleUICall ) ';'
            	    {
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1611:6: (lv_processElements_10= ruleUICall )
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1614:6: lv_processElements_10= ruleUICall
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getProcessElementsUICallParserRuleCall_8_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUICall_in_ruleProcess3361);
            	    lv_processElements_10=ruleUICall();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "processElements", lv_processElements_10, "UICall", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    match(input,12,FOLLOW_12_in_ruleProcess3374); 

            	            createLeafNode(grammarAccess.getProcessAccess().getSemicolonKeyword_8_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleProcess3385); 

                    createLeafNode(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_9(), null); 
                

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
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleFormElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1647:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1647:53: (iv_ruleFormElement= ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1648:2: iv_ruleFormElement= ruleFormElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement3418);
            iv_ruleFormElement=ruleFormElement();
            _fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement3428); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1655:1: ruleFormElement returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_label_4=null;
        Token lv_readonly_6=null;
        EObject lv_references_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1660:6: ( ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1661:1: ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1661:1: ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1661:2: (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1661:2: (lv_description_0= RULE_STRING )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1663:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormElement3475); 

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

            match(input,34,FOLLOW_34_in_ruleFormElement3493); 

                    createLeafNode(grammarAccess.getFormElementAccess().getElementKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1685:1: (lv_references_2= ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1688:6: lv_references_2= ruleDtoPropertyReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3527);
            lv_references_2=ruleDtoPropertyReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "references", lv_references_2, "DtoPropertyReference", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1706:2: ( 'label' (lv_label_4= RULE_STRING ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==26) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1706:3: 'label' (lv_label_4= RULE_STRING )
                    {
                    match(input,26,FOLLOW_26_in_ruleFormElement3541); 

                            createLeafNode(grammarAccess.getFormElementAccess().getLabelKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1710:1: (lv_label_4= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1712:6: lv_label_4= RULE_STRING
                    {
                    lv_label_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormElement3563); 

                    		createLeafNode(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_3_1_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFormElementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_4, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1730:4: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1730:5: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' )
                    {
                    match(input,21,FOLLOW_21_in_ruleFormElement3583); 

                            createLeafNode(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1734:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==22) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==23) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1734:1: ( (lv_readonly_6= 'true' ) | 'false' )", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1734:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1734:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1736:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFormElement3605); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0(), "readonly"); 
                                

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1756:6: 'false'
                            {
                            match(input,23,FOLLOW_23_in_ruleFormElement3633); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getFalseKeyword_4_1_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleFormElement3645); 

                    createLeafNode(grammarAccess.getFormElementAccess().getSemicolonKeyword_5(), null); 
                

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


    // $ANTLR start entryRuleActionDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1771:1: entryRuleActionDialogueCall returns [EObject current=null] : iv_ruleActionDialogueCall= ruleActionDialogueCall EOF ;
    public final EObject entryRuleActionDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1771:60: (iv_ruleActionDialogueCall= ruleActionDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1772:2: iv_ruleActionDialogueCall= ruleActionDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionDialogueCall_in_entryRuleActionDialogueCall3678);
            iv_ruleActionDialogueCall=ruleActionDialogueCall();
            _fsp--;

             current =iv_ruleActionDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDialogueCall3688); 

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
    // $ANTLR end entryRuleActionDialogueCall


    // $ANTLR start ruleActionDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1779:1: ruleActionDialogueCall returns [EObject current=null] : ( (lv_contextExp_0= ruleExpression )? 'dialogue' (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleActionDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        EObject lv_contextExp_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1784:6: ( ( (lv_contextExp_0= ruleExpression )? 'dialogue' (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1785:1: ( (lv_contextExp_0= ruleExpression )? 'dialogue' (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1785:1: ( (lv_contextExp_0= ruleExpression )? 'dialogue' (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1785:2: (lv_contextExp_0= ruleExpression )? 'dialogue' (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1785:2: (lv_contextExp_0= ruleExpression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=40 && LA48_0<=41)||(LA48_0>=43 && LA48_0<=44)||(LA48_0>=53 && LA48_0<=54)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1788:6: lv_contextExp_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionDialogueCallAccess().getContextExpExpressionParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleActionDialogueCall3747);
                    lv_contextExp_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionDialogueCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "contextExp", lv_contextExp_0, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleActionDialogueCall3761); 

                    createLeafNode(grammarAccess.getActionDialogueCallAccess().getDialogueKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1810:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1812:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionDialogueCall3783); 

            		createLeafNode(grammarAccess.getActionDialogueCallAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionDialogueCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
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
    // $ANTLR end ruleActionDialogueCall


    // $ANTLR start entryRuleDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1837:1: entryRuleDialogueCall returns [EObject current=null] : iv_ruleDialogueCall= ruleDialogueCall EOF ;
    public final EObject entryRuleDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1837:54: (iv_ruleDialogueCall= ruleDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1838:2: iv_ruleDialogueCall= ruleDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall3824);
            iv_ruleDialogueCall=ruleDialogueCall();
            _fsp--;

             current =iv_ruleDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogueCall3834); 

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
    // $ANTLR end entryRuleDialogueCall


    // $ANTLR start ruleDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1845:1: ruleDialogueCall returns [EObject current=null] : ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'dialogue' (lv_name_8= RULE_ID ) ) ;
    public final EObject ruleDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_label_0=null;
        Token lv_name_8=null;
        EObject lv_condition_4 = null;

        EObject lv_contextExp_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1850:6: ( ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'dialogue' (lv_name_8= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1851:1: ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'dialogue' (lv_name_8= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1851:1: ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'dialogue' (lv_name_8= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1851:2: ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'dialogue' (lv_name_8= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1851:2: ( (lv_label_0= RULE_STRING ) ':' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1851:3: (lv_label_0= RULE_STRING ) ':'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1851:3: (lv_label_0= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1853:6: lv_label_0= RULE_STRING
                    {
                    lv_label_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDialogueCall3882); 

                    		createLeafNode(grammarAccess.getDialogueCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,36,FOLLOW_36_in_ruleDialogueCall3899); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1875:3: ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==37) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1875:4: 'if' '(' (lv_condition_4= ruleOperationExpression ) ')'
                    {
                    match(input,37,FOLLOW_37_in_ruleDialogueCall3911); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0(), null); 
                        
                    match(input,38,FOLLOW_38_in_ruleDialogueCall3920); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1883:1: (lv_condition_4= ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1886:6: lv_condition_4= ruleOperationExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOperationExpression_in_ruleDialogueCall3954);
                    lv_condition_4=ruleOperationExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "condition", lv_condition_4, "OperationExpression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,39,FOLLOW_39_in_ruleDialogueCall3967); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1908:3: (lv_contextExp_6= ruleExpression )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=40 && LA51_0<=41)||(LA51_0>=43 && LA51_0<=44)||(LA51_0>=53 && LA51_0<=54)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1911:6: lv_contextExp_6= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getContextExpExpressionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDialogueCall4003);
                    lv_contextExp_6=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "contextExp", lv_contextExp_6, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleDialogueCall4017); 

                    createLeafNode(grammarAccess.getDialogueCallAccess().getDialogueKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1933:1: (lv_name_8= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1935:6: lv_name_8= RULE_ID
            {
            lv_name_8=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDialogueCall4039); 

            		createLeafNode(grammarAccess.getDialogueCallAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_8, "ID", lastConsumedNode);
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
    // $ANTLR end ruleDialogueCall


    // $ANTLR start entryRuleExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1960:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1960:52: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1961:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4080);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4090); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1968:1: ruleExpression returns [EObject current=null] : (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceExpression_0 = null;

        EObject this_NavigationExpression_1 = null;

        EObject this_StandardExpression_2 = null;

        EObject this_OperationExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1973:6: ( (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1974:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1974:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt52=1;
                }
                break;
            case 43:
            case 44:
                {
                alt52=2;
                }
                break;
            case 53:
            case 54:
                {
                alt52=3;
                }
                break;
            case 40:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1974:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1975:5: this_ServiceExpression_0= ruleServiceExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleServiceExpression_in_ruleExpression4137);
                    this_ServiceExpression_0=ruleServiceExpression();
                    _fsp--;

                     
                            current = this_ServiceExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1985:5: this_NavigationExpression_1= ruleNavigationExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNavigationExpression_in_ruleExpression4164);
                    this_NavigationExpression_1=ruleNavigationExpression();
                    _fsp--;

                     
                            current = this_NavigationExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1995:5: this_StandardExpression_2= ruleStandardExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStandardExpression_in_ruleExpression4191);
                    this_StandardExpression_2=ruleStandardExpression();
                    _fsp--;

                     
                            current = this_StandardExpression_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2005:5: this_OperationExpression_3= ruleOperationExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOperationExpression_in_ruleExpression4218);
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


    // $ANTLR start entryRuleProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2020:1: entryRuleProcessCall returns [EObject current=null] : iv_ruleProcessCall= ruleProcessCall EOF ;
    public final EObject entryRuleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2020:53: (iv_ruleProcessCall= ruleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2021:2: iv_ruleProcessCall= ruleProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcessCall_in_entryRuleProcessCall4250);
            iv_ruleProcessCall=ruleProcessCall();
            _fsp--;

             current =iv_ruleProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessCall4260); 

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
    // $ANTLR end entryRuleProcessCall


    // $ANTLR start ruleProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2028:1: ruleProcessCall returns [EObject current=null] : ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' (lv_name_8= RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )? ) ;
    public final EObject ruleProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_label_0=null;
        Token lv_name_8=null;
        Token lv_label_10=null;
        EObject lv_condition_4 = null;

        EObject lv_contextExp_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2033:6: ( ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' (lv_name_8= RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:1: ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' (lv_name_8= RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:1: ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' (lv_name_8= RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:2: ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' (lv_name_8= RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:2: ( (lv_label_0= RULE_STRING ) ':' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:3: (lv_label_0= RULE_STRING ) ':'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:3: (lv_label_0= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2036:6: lv_label_0= RULE_STRING
                    {
                    lv_label_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessCall4308); 

                    		createLeafNode(grammarAccess.getProcessCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_0, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,36,FOLLOW_36_in_ruleProcessCall4325); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2058:3: ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==37) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2058:4: 'if' '(' (lv_condition_4= ruleOperationExpression ) ')'
                    {
                    match(input,37,FOLLOW_37_in_ruleProcessCall4337); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getIfKeyword_1_0(), null); 
                        
                    match(input,38,FOLLOW_38_in_ruleProcessCall4346); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2066:1: (lv_condition_4= ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2069:6: lv_condition_4= ruleOperationExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOperationExpression_in_ruleProcessCall4380);
                    lv_condition_4=ruleOperationExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "condition", lv_condition_4, "OperationExpression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,39,FOLLOW_39_in_ruleProcessCall4393); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2091:3: (lv_contextExp_6= ruleExpression )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=40 && LA55_0<=41)||(LA55_0>=43 && LA55_0<=44)||(LA55_0>=53 && LA55_0<=54)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2094:6: lv_contextExp_6= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getContextExpExpressionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProcessCall4429);
                    lv_contextExp_6=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "contextExp", lv_contextExp_6, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_ruleProcessCall4443); 

                    createLeafNode(grammarAccess.getProcessCallAccess().getProcessKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2116:1: (lv_name_8= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2118:6: lv_name_8= RULE_ID
            {
            lv_name_8=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall4465); 

            		createLeafNode(grammarAccess.getProcessCallAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_8, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2136:2: ( 'label' (lv_label_10= RULE_ID ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==26) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2136:3: 'label' (lv_label_10= RULE_ID )
                    {
                    match(input,26,FOLLOW_26_in_ruleProcessCall4483); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2140:1: (lv_label_10= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2142:6: lv_label_10= RULE_ID
                    {
                    lv_label_10=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall4505); 

                    		createLeafNode(grammarAccess.getProcessCallAccess().getLabelIDTerminalRuleCall_5_1_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_10, "ID", lastConsumedNode);
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
    // $ANTLR end ruleProcessCall


    // $ANTLR start entryRuleOperationExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2167:1: entryRuleOperationExpression returns [EObject current=null] : iv_ruleOperationExpression= ruleOperationExpression EOF ;
    public final EObject entryRuleOperationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2167:61: (iv_ruleOperationExpression= ruleOperationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2168:2: iv_ruleOperationExpression= ruleOperationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression4548);
            iv_ruleOperationExpression=ruleOperationExpression();
            _fsp--;

             current =iv_ruleOperationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationExpression4558); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2175:1: ruleOperationExpression returns [EObject current=null] : ( 'call' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleOperationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2180:6: ( ( 'call' (lv_name_1= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2181:1: ( 'call' (lv_name_1= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2181:1: ( 'call' (lv_name_1= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2181:2: 'call' (lv_name_1= RULE_ID )
            {
            match(input,40,FOLLOW_40_in_ruleOperationExpression4592); 

                    createLeafNode(grammarAccess.getOperationExpressionAccess().getCallKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2185:1: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2187:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationExpression4614); 

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


    // $ANTLR start entryRuleSimpleProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2212:1: entryRuleSimpleProcessCall returns [EObject current=null] : iv_ruleSimpleProcessCall= ruleSimpleProcessCall EOF ;
    public final EObject entryRuleSimpleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2212:59: (iv_ruleSimpleProcessCall= ruleSimpleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2213:2: iv_ruleSimpleProcessCall= ruleSimpleProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_entryRuleSimpleProcessCall4655);
            iv_ruleSimpleProcessCall=ruleSimpleProcessCall();
            _fsp--;

             current =iv_ruleSimpleProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProcessCall4665); 

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
    // $ANTLR end entryRuleSimpleProcessCall


    // $ANTLR start ruleSimpleProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2220:1: ruleSimpleProcessCall returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )? ) ;
    public final EObject ruleSimpleProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_label_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2225:6: ( ( (lv_name_0= RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2226:1: ( (lv_name_0= RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2226:1: ( (lv_name_0= RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2226:2: (lv_name_0= RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2226:2: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2228:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleProcessCall4712); 

            		createLeafNode(grammarAccess.getSimpleProcessCallAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleProcessCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2246:2: ( 'label' (lv_label_2= RULE_STRING ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==26) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2246:3: 'label' (lv_label_2= RULE_STRING )
                    {
                    match(input,26,FOLLOW_26_in_ruleSimpleProcessCall4730); 

                            createLeafNode(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2250:1: (lv_label_2= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2252:6: lv_label_2= RULE_STRING
                    {
                    lv_label_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleProcessCall4752); 

                    		createLeafNode(grammarAccess.getSimpleProcessCallAccess().getLabelSTRINGTerminalRuleCall_1_1_0(), "label"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "label", lv_label_2, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleSimpleProcessCall


    // $ANTLR start entryRuleStandardExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2277:1: entryRuleStandardExpression returns [EObject current=null] : iv_ruleStandardExpression= ruleStandardExpression EOF ;
    public final EObject entryRuleStandardExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2277:60: (iv_ruleStandardExpression= ruleStandardExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2278:2: iv_ruleStandardExpression= ruleStandardExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStandardExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression4795);
            iv_ruleStandardExpression=ruleStandardExpression();
            _fsp--;

             current =iv_ruleStandardExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardExpression4805); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2285:1: ruleStandardExpression returns [EObject current=null] : (lv_type_0= ruleExpressionType ) ;
    public final EObject ruleStandardExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2290:6: ( (lv_type_0= ruleExpressionType ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2291:1: (lv_type_0= ruleExpressionType )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2291:1: (lv_type_0= ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2294:6: lv_type_0= ruleExpressionType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpressionType_in_ruleStandardExpression4863);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2319:1: entryRuleServiceExpression returns [EObject current=null] : iv_ruleServiceExpression= ruleServiceExpression EOF ;
    public final EObject entryRuleServiceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2319:59: (iv_ruleServiceExpression= ruleServiceExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2320:2: iv_ruleServiceExpression= ruleServiceExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression4899);
            iv_ruleServiceExpression=ruleServiceExpression();
            _fsp--;

             current =iv_ruleServiceExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceExpression4909); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2327:1: ruleServiceExpression returns [EObject current=null] : ( 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID ) ) ;
    public final EObject ruleServiceExpression() throws RecognitionException {
        EObject current = null;

        Token lv_serviceName_1=null;
        Token lv_serviceMethod_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2332:6: ( ( 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2333:1: ( 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2333:1: ( 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2333:2: 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID )
            {
            match(input,41,FOLLOW_41_in_ruleServiceExpression4943); 

                    createLeafNode(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2337:1: (lv_serviceName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2339:6: lv_serviceName_1= RULE_ID
            {
            lv_serviceName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceExpression4965); 

            		createLeafNode(grammarAccess.getServiceExpressionAccess().getServiceNameIDTerminalRuleCall_1_0(), "serviceName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "serviceName", lv_serviceName_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,42,FOLLOW_42_in_ruleServiceExpression4982); 

                    createLeafNode(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2361:1: (lv_serviceMethod_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2363:6: lv_serviceMethod_3= RULE_ID
            {
            lv_serviceMethod_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceExpression5004); 

            		createLeafNode(grammarAccess.getServiceExpressionAccess().getServiceMethodIDTerminalRuleCall_3_0(), "serviceMethod"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "serviceMethod", lv_serviceMethod_3, "ID", lastConsumedNode);
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
    // $ANTLR end ruleServiceExpression


    // $ANTLR start entryRuleNavigationExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2388:1: entryRuleNavigationExpression returns [EObject current=null] : iv_ruleNavigationExpression= ruleNavigationExpression EOF ;
    public final EObject entryRuleNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2388:62: (iv_ruleNavigationExpression= ruleNavigationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2389:2: iv_ruleNavigationExpression= ruleNavigationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNavigationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression5045);
            iv_ruleNavigationExpression=ruleNavigationExpression();
            _fsp--;

             current =iv_ruleNavigationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationExpression5055); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2396:1: ruleNavigationExpression returns [EObject current=null] : ( (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference ) ) ;
    public final EObject ruleNavigationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_composition_0=null;
        EObject lv_references_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2401:6: ( ( (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2402:1: ( (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2402:1: ( (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2402:2: (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2402:2: (lv_composition_0= 'composite' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==43) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2404:6: lv_composition_0= 'composite'
                    {
                    lv_composition_0=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleNavigationExpression5101); 

                            createLeafNode(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0(), "composition"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNavigationExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "composition", true, "composite", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,44,FOLLOW_44_in_ruleNavigationExpression5124); 

                    createLeafNode(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2427:1: (lv_references_2= ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2430:6: lv_references_2= ruleAssociationRoleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression5158);
            lv_references_2=ruleAssociationRoleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNavigationExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "references", lv_references_2, "AssociationRoleReference", currentNode);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2455:1: entryRuleDtoPropertyReference returns [EObject current=null] : iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF ;
    public final EObject entryRuleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoPropertyReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2455:62: (iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2456:2: iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference5195);
            iv_ruleDtoPropertyReference=ruleDtoPropertyReference();
            _fsp--;

             current =iv_ruleDtoPropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference5205); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2463:1: ruleDtoPropertyReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2468:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2469:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2469:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2471:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoPropertyReference5251); 

            		createLeafNode(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2496:1: entryRuleAssociationRoleReference returns [EObject current=null] : iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF ;
    public final EObject entryRuleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationRoleReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2496:66: (iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2497:2: iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRoleReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference5291);
            iv_ruleAssociationRoleReference=ruleAssociationRoleReference();
            _fsp--;

             current =iv_ruleAssociationRoleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference5301); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2504:1: ruleAssociationRoleReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2509:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2510:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2510:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2512:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationRoleReference5347); 

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


    // $ANTLR start entryRuleUICall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2537:1: entryRuleUICall returns [EObject current=null] : iv_ruleUICall= ruleUICall EOF ;
    public final EObject entryRuleUICall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUICall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2537:48: (iv_ruleUICall= ruleUICall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2538:2: iv_ruleUICall= ruleUICall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUICallRule(), currentNode); 
            pushFollow(FOLLOW_ruleUICall_in_entryRuleUICall5387);
            iv_ruleUICall=ruleUICall();
            _fsp--;

             current =iv_ruleUICall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUICall5397); 

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
    // $ANTLR end entryRuleUICall


    // $ANTLR start ruleUICall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2545:1: ruleUICall returns [EObject current=null] : this_UIModelElementCall_0= ruleUIModelElementCall ;
    public final EObject ruleUICall() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElementCall_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2550:6: (this_UIModelElementCall_0= ruleUIModelElementCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2552:5: this_UIModelElementCall_0= ruleUIModelElementCall
            {
             
                    currentNode=createCompositeNode(grammarAccess.getUICallAccess().getUIModelElementCallParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleUIModelElementCall_in_ruleUICall5443);
            this_UIModelElementCall_0=ruleUIModelElementCall();
            _fsp--;

             
                    current = this_UIModelElementCall_0; 
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
    // $ANTLR end ruleUICall


    // $ANTLR start entryRuleUIModelElementCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2567:1: entryRuleUIModelElementCall returns [EObject current=null] : iv_ruleUIModelElementCall= ruleUIModelElementCall EOF ;
    public final EObject entryRuleUIModelElementCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElementCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2567:60: (iv_ruleUIModelElementCall= ruleUIModelElementCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2568:2: iv_ruleUIModelElementCall= ruleUIModelElementCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall5474);
            iv_ruleUIModelElementCall=ruleUIModelElementCall();
            _fsp--;

             current =iv_ruleUIModelElementCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElementCall5484); 

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
    // $ANTLR end entryRuleUIModelElementCall


    // $ANTLR start ruleUIModelElementCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2575:1: ruleUIModelElementCall returns [EObject current=null] : (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall ) ;
    public final EObject ruleUIModelElementCall() throws RecognitionException {
        EObject current = null;

        EObject this_DialogueCall_0 = null;

        EObject this_ProcessCall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2580:6: ( (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )
            int alt59=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==36) ) {
                    switch ( input.LA(3) ) {
                    case 37:
                        {
                        int LA59_2 = input.LA(4);

                        if ( (LA59_2==38) ) {
                            int LA59_12 = input.LA(5);

                            if ( (LA59_12==40) ) {
                                int LA59_16 = input.LA(6);

                                if ( (LA59_16==RULE_ID) ) {
                                    int LA59_18 = input.LA(7);

                                    if ( (LA59_18==39) ) {
                                        switch ( input.LA(8) ) {
                                        case 41:
                                            {
                                            int LA59_3 = input.LA(9);

                                            if ( (LA59_3==RULE_ID) ) {
                                                int LA59_13 = input.LA(10);

                                                if ( (LA59_13==42) ) {
                                                    int LA59_17 = input.LA(11);

                                                    if ( (LA59_17==RULE_ID) ) {
                                                        int LA59_19 = input.LA(12);

                                                        if ( (LA59_19==33) ) {
                                                            alt59=2;
                                                        }
                                                        else if ( (LA59_19==35) ) {
                                                            alt59=1;
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 19, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 17, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 13, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 3, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 43:
                                            {
                                            int LA59_4 = input.LA(9);

                                            if ( (LA59_4==44) ) {
                                                int LA59_5 = input.LA(10);

                                                if ( (LA59_5==RULE_ID) ) {
                                                    int LA59_14 = input.LA(11);

                                                    if ( (LA59_14==35) ) {
                                                        alt59=1;
                                                    }
                                                    else if ( (LA59_14==33) ) {
                                                        alt59=2;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 14, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 5, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 4, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 44:
                                            {
                                            int LA59_5 = input.LA(9);

                                            if ( (LA59_5==RULE_ID) ) {
                                                int LA59_14 = input.LA(10);

                                                if ( (LA59_14==35) ) {
                                                    alt59=1;
                                                }
                                                else if ( (LA59_14==33) ) {
                                                    alt59=2;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 14, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 5, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 53:
                                            {
                                            int LA59_6 = input.LA(9);

                                            if ( (LA59_6==35) ) {
                                                alt59=1;
                                            }
                                            else if ( (LA59_6==33) ) {
                                                alt59=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 6, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 54:
                                            {
                                            int LA59_7 = input.LA(9);

                                            if ( (LA59_7==33) ) {
                                                alt59=2;
                                            }
                                            else if ( (LA59_7==35) ) {
                                                alt59=1;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 7, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 40:
                                            {
                                            int LA59_8 = input.LA(9);

                                            if ( (LA59_8==RULE_ID) ) {
                                                int LA59_15 = input.LA(10);

                                                if ( (LA59_15==33) ) {
                                                    alt59=2;
                                                }
                                                else if ( (LA59_15==35) ) {
                                                    alt59=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 15, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 8, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 35:
                                            {
                                            alt59=1;
                                            }
                                            break;
                                        case 33:
                                            {
                                            alt59=2;
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 20, input);

                                            throw nvae;
                                        }

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 18, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 12, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 41:
                        {
                        int LA59_3 = input.LA(4);

                        if ( (LA59_3==RULE_ID) ) {
                            int LA59_13 = input.LA(5);

                            if ( (LA59_13==42) ) {
                                int LA59_17 = input.LA(6);

                                if ( (LA59_17==RULE_ID) ) {
                                    int LA59_19 = input.LA(7);

                                    if ( (LA59_19==33) ) {
                                        alt59=2;
                                    }
                                    else if ( (LA59_19==35) ) {
                                        alt59=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 19, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 13, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 43:
                        {
                        int LA59_4 = input.LA(4);

                        if ( (LA59_4==44) ) {
                            int LA59_5 = input.LA(5);

                            if ( (LA59_5==RULE_ID) ) {
                                int LA59_14 = input.LA(6);

                                if ( (LA59_14==35) ) {
                                    alt59=1;
                                }
                                else if ( (LA59_14==33) ) {
                                    alt59=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 14, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 44:
                        {
                        int LA59_5 = input.LA(4);

                        if ( (LA59_5==RULE_ID) ) {
                            int LA59_14 = input.LA(5);

                            if ( (LA59_14==35) ) {
                                alt59=1;
                            }
                            else if ( (LA59_14==33) ) {
                                alt59=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 53:
                        {
                        int LA59_6 = input.LA(4);

                        if ( (LA59_6==35) ) {
                            alt59=1;
                        }
                        else if ( (LA59_6==33) ) {
                            alt59=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 54:
                        {
                        int LA59_7 = input.LA(4);

                        if ( (LA59_7==33) ) {
                            alt59=2;
                        }
                        else if ( (LA59_7==35) ) {
                            alt59=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 40:
                        {
                        int LA59_8 = input.LA(4);

                        if ( (LA59_8==RULE_ID) ) {
                            int LA59_15 = input.LA(5);

                            if ( (LA59_15==33) ) {
                                alt59=2;
                            }
                            else if ( (LA59_15==35) ) {
                                alt59=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 35:
                        {
                        alt59=1;
                        }
                        break;
                    case 33:
                        {
                        alt59=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 11, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA59_2 = input.LA(2);

                if ( (LA59_2==38) ) {
                    int LA59_12 = input.LA(3);

                    if ( (LA59_12==40) ) {
                        int LA59_16 = input.LA(4);

                        if ( (LA59_16==RULE_ID) ) {
                            int LA59_18 = input.LA(5);

                            if ( (LA59_18==39) ) {
                                switch ( input.LA(6) ) {
                                case 41:
                                    {
                                    int LA59_3 = input.LA(7);

                                    if ( (LA59_3==RULE_ID) ) {
                                        int LA59_13 = input.LA(8);

                                        if ( (LA59_13==42) ) {
                                            int LA59_17 = input.LA(9);

                                            if ( (LA59_17==RULE_ID) ) {
                                                int LA59_19 = input.LA(10);

                                                if ( (LA59_19==33) ) {
                                                    alt59=2;
                                                }
                                                else if ( (LA59_19==35) ) {
                                                    alt59=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 19, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 17, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 13, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 3, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 43:
                                    {
                                    int LA59_4 = input.LA(7);

                                    if ( (LA59_4==44) ) {
                                        int LA59_5 = input.LA(8);

                                        if ( (LA59_5==RULE_ID) ) {
                                            int LA59_14 = input.LA(9);

                                            if ( (LA59_14==35) ) {
                                                alt59=1;
                                            }
                                            else if ( (LA59_14==33) ) {
                                                alt59=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 14, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 4, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 44:
                                    {
                                    int LA59_5 = input.LA(7);

                                    if ( (LA59_5==RULE_ID) ) {
                                        int LA59_14 = input.LA(8);

                                        if ( (LA59_14==35) ) {
                                            alt59=1;
                                        }
                                        else if ( (LA59_14==33) ) {
                                            alt59=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 14, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 5, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 53:
                                    {
                                    int LA59_6 = input.LA(7);

                                    if ( (LA59_6==35) ) {
                                        alt59=1;
                                    }
                                    else if ( (LA59_6==33) ) {
                                        alt59=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 6, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 54:
                                    {
                                    int LA59_7 = input.LA(7);

                                    if ( (LA59_7==33) ) {
                                        alt59=2;
                                    }
                                    else if ( (LA59_7==35) ) {
                                        alt59=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 7, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 40:
                                    {
                                    int LA59_8 = input.LA(7);

                                    if ( (LA59_8==RULE_ID) ) {
                                        int LA59_15 = input.LA(8);

                                        if ( (LA59_15==33) ) {
                                            alt59=2;
                                        }
                                        else if ( (LA59_15==35) ) {
                                            alt59=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 15, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 8, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 35:
                                    {
                                    alt59=1;
                                    }
                                    break;
                                case 33:
                                    {
                                    alt59=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 20, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 12, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA59_3 = input.LA(2);

                if ( (LA59_3==RULE_ID) ) {
                    int LA59_13 = input.LA(3);

                    if ( (LA59_13==42) ) {
                        int LA59_17 = input.LA(4);

                        if ( (LA59_17==RULE_ID) ) {
                            int LA59_19 = input.LA(5);

                            if ( (LA59_19==33) ) {
                                alt59=2;
                            }
                            else if ( (LA59_19==35) ) {
                                alt59=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 17, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 13, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 3, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                int LA59_4 = input.LA(2);

                if ( (LA59_4==44) ) {
                    int LA59_5 = input.LA(3);

                    if ( (LA59_5==RULE_ID) ) {
                        int LA59_14 = input.LA(4);

                        if ( (LA59_14==35) ) {
                            alt59=1;
                        }
                        else if ( (LA59_14==33) ) {
                            alt59=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 4, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA59_5 = input.LA(2);

                if ( (LA59_5==RULE_ID) ) {
                    int LA59_14 = input.LA(3);

                    if ( (LA59_14==35) ) {
                        alt59=1;
                    }
                    else if ( (LA59_14==33) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 14, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 5, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA59_6 = input.LA(2);

                if ( (LA59_6==35) ) {
                    alt59=1;
                }
                else if ( (LA59_6==33) ) {
                    alt59=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 6, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA59_7 = input.LA(2);

                if ( (LA59_7==33) ) {
                    alt59=2;
                }
                else if ( (LA59_7==35) ) {
                    alt59=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 7, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA59_8 = input.LA(2);

                if ( (LA59_8==RULE_ID) ) {
                    int LA59_15 = input.LA(3);

                    if ( (LA59_15==33) ) {
                        alt59=2;
                    }
                    else if ( (LA59_15==35) ) {
                        alt59=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 15, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 8, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt59=1;
                }
                break;
            case 33:
                {
                alt59=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2581:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2582:5: this_DialogueCall_0= ruleDialogueCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogueCall_in_ruleUIModelElementCall5531);
                    this_DialogueCall_0=ruleDialogueCall();
                    _fsp--;

                     
                            current = this_DialogueCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2592:5: this_ProcessCall_1= ruleProcessCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcessCall_in_ruleUIModelElementCall5558);
                    this_ProcessCall_1=ruleProcessCall();
                    _fsp--;

                     
                            current = this_ProcessCall_1; 
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
    // $ANTLR end ruleUIModelElementCall


    // $ANTLR start ruleProcessType
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:1: ruleProcessType returns [Enumerator current=null] : ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) ) ;
    public final Enumerator ruleProcessType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2611:6: ( ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2612:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2612:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) )
            int alt60=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt60=1;
                }
                break;
            case 46:
                {
                alt60=2;
                }
                break;
            case 47:
                {
                alt60=3;
                }
                break;
            case 48:
                {
                alt60=4;
                }
                break;
            case 49:
                {
                alt60=5;
                }
                break;
            case 50:
                {
                alt60=6;
                }
                break;
            case 51:
                {
                alt60=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2612:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) )", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2612:2: ( 'new' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2612:2: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2612:4: 'new'
                    {
                    match(input,45,FOLLOW_45_in_ruleProcessType5604); 

                            current = grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2618:6: ( 'save' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2618:6: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2618:8: 'save'
                    {
                    match(input,46,FOLLOW_46_in_ruleProcessType5619); 

                            current = grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2624:6: ( 'edit' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2624:6: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2624:8: 'edit'
                    {
                    match(input,47,FOLLOW_47_in_ruleProcessType5634); 

                            current = grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2630:6: ( 'delete' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2630:6: ( 'delete' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2630:8: 'delete'
                    {
                    match(input,48,FOLLOW_48_in_ruleProcessType5649); 

                            current = grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2636:6: ( 'cancel' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2636:6: ( 'cancel' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2636:8: 'cancel'
                    {
                    match(input,49,FOLLOW_49_in_ruleProcessType5664); 

                            current = grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2642:6: ( 'removefrom' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2642:6: ( 'removefrom' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2642:8: 'removefrom'
                    {
                    match(input,50,FOLLOW_50_in_ruleProcessType5679); 

                            current = grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2648:6: ( 'addto' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2648:6: ( 'addto' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2648:8: 'addto'
                    {
                    match(input,51,FOLLOW_51_in_ruleProcessType5694); 

                            current = grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6(), null); 
                        

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2658:1: ruleProcessTypeLink returns [Enumerator current=null] : ( 'link' ) ;
    public final Enumerator ruleProcessTypeLink() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2662:6: ( ( 'link' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2663:1: ( 'link' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2663:1: ( 'link' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2663:3: 'link'
            {
            match(input,52,FOLLOW_52_in_ruleProcessTypeLink5736); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2673:1: ruleExpressionType returns [Enumerator current=null] : ( ( 'all' ) | ( 'find' ) ) ;
    public final Enumerator ruleExpressionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2677:6: ( ( ( 'all' ) | ( 'find' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2678:1: ( ( 'all' ) | ( 'find' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2678:1: ( ( 'all' ) | ( 'find' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==53) ) {
                alt61=1;
            }
            else if ( (LA61_0==54) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2678:1: ( ( 'all' ) | ( 'find' ) )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2678:2: ( 'all' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2678:2: ( 'all' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2678:4: 'all'
                    {
                    match(input,53,FOLLOW_53_in_ruleExpressionType5778); 

                            current = grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2684:6: ( 'find' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2684:6: ( 'find' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2684:8: 'find'
                    {
                    match(input,54,FOLLOW_54_in_ruleExpressionType5793); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_rulePresentationModel130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePresentationModel148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePresentationModel170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePresentationModel187 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rulePresentationModel221 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleApplication_in_rulePresentationModel260 = new BitSet(new long[]{0x0000000268040012L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rulePresentationModel298 = new BitSet(new long[]{0x0000000268040012L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleApplication380 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_ruleApplication424 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication437 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleApplication448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleExternalReference525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference547 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExternalReference564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference586 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_ruleUIModelElement780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleUIModelElement807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_entryRuleDialogue839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogue849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_ruleDialogue896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_ruleDialogue923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_entryRuleContentForm955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentForm965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContentForm1012 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContentForm1030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm1052 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContentForm1069 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_20_in_ruleContentForm1090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm1126 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentForm1138 = new BitSet(new long[]{0x0000000403208010L});
    public static final BitSet FOLLOW_21_in_ruleContentForm1148 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleContentForm1170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23_in_ruleContentForm1198 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1208 = new BitSet(new long[]{0x0000000403008010L});
    public static final BitSet FOLLOW_ruleFormElement_in_ruleContentForm1244 = new BitSet(new long[]{0x0000000403008010L});
    public static final BitSet FOLLOW_24_in_ruleContentForm1259 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentForm1268 = new BitSet(new long[]{0x000FE00000008030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleContentForm1303 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1316 = new BitSet(new long[]{0x000FE00000008030L});
    public static final BitSet FOLLOW_15_in_ruleContentForm1327 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_25_in_ruleContentForm1339 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentForm1348 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_ruleContentForm1383 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1396 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleContentForm1407 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContentForm1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction1508 = new BitSet(new long[]{0x000FE00000000020L});
    public static final BitSet FOLLOW_ruleProcessType_in_ruleAction1551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1578 = new BitSet(new long[]{0x00601B0804000002L});
    public static final BitSet FOLLOW_26_in_ruleAction1596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction1618 = new BitSet(new long[]{0x00601B0800000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_ruleAction1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundDialogue1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompoundDialogue1758 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCompoundDialogue1776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue1798 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCompoundDialogue1815 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue1837 = new BitSet(new long[]{0x0000000012200002L});
    public static final BitSet FOLLOW_21_in_ruleCompoundDialogue1850 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCompoundDialogue1872 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23_in_ruleCompoundDialogue1900 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue1910 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_28_in_ruleCompoundDialogue1922 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompoundDialogue1931 = new BitSet(new long[]{0x00601B2800008010L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue1966 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue1979 = new BitSet(new long[]{0x00601B2800008010L});
    public static final BitSet FOLLOW_15_in_ruleCompoundDialogue1990 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleCompoundDialogue2002 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompoundDialogue2011 = new BitSet(new long[]{0x00601B2200008010L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCompoundDialogue2046 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue2059 = new BitSet(new long[]{0x00601B2200008010L});
    public static final BitSet FOLLOW_15_in_ruleCompoundDialogue2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionDialogue2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollectionDialogue2217 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCollectionDialogue2235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue2257 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollectionDialogue2274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue2296 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionDialogue2308 = new BitSet(new long[]{0x0000000012208000L});
    public static final BitSet FOLLOW_21_in_ruleCollectionDialogue2318 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCollectionDialogue2340 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23_in_ruleCollectionDialogue2368 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue2378 = new BitSet(new long[]{0x0000000012008000L});
    public static final BitSet FOLLOW_28_in_ruleCollectionDialogue2390 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionDialogue2399 = new BitSet(new long[]{0x00601B2800008010L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue2434 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue2447 = new BitSet(new long[]{0x00601B2800008010L});
    public static final BitSet FOLLOW_15_in_ruleCollectionDialogue2458 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_25_in_ruleCollectionDialogue2470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCollectionDialogue2479 = new BitSet(new long[]{0x00601B2200008010L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCollectionDialogue2514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue2527 = new BitSet(new long[]{0x00601B2200008010L});
    public static final BitSet FOLLOW_15_in_ruleCollectionDialogue2538 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCollectionDialogue2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail2582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterDetail2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMasterDetail2639 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMasterDetail2657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail2679 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMasterDetail2696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail2718 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_21_in_ruleMasterDetail2731 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleMasterDetail2753 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23_in_ruleMasterDetail2781 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2791 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMasterDetail2802 = new BitSet(new long[]{0x00601B2800000010L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail2836 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2849 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMasterDetail2858 = new BitSet(new long[]{0x00601B2800000010L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail2892 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2905 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleMasterDetail2915 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMasterDetail2924 = new BitSet(new long[]{0x00601B2200008010L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleMasterDetail2959 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2972 = new BitSet(new long[]{0x00601B2200008010L});
    public static final BitSet FOLLOW_15_in_ruleMasterDetail2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess3018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcess3075 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleProcess3093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess3115 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleProcess3132 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_20_in_ruleProcess3153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess3189 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcess3201 = new BitSet(new long[]{0x007FFB2A00008010L});
    public static final BitSet FOLLOW_ruleProcessType_in_ruleProcess3236 = new BitSet(new long[]{0x00601B2A00008010L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_ruleProcess3281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleProcess3319 = new BitSet(new long[]{0x00601B2A00008010L});
    public static final BitSet FOLLOW_ruleUICall_in_ruleProcess3361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcess3374 = new BitSet(new long[]{0x00601B2A00008010L});
    public static final BitSet FOLLOW_15_in_ruleProcess3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement3418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormElement3475 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFormElement3493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3527 = new BitSet(new long[]{0x0000000004201000L});
    public static final BitSet FOLLOW_26_in_ruleFormElement3541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormElement3563 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_21_in_ruleFormElement3583 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleFormElement3605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23_in_ruleFormElement3633 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFormElement3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_entryRuleActionDialogueCall3678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDialogueCall3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleActionDialogueCall3747 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleActionDialogueCall3761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionDialogueCall3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall3824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogueCall3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDialogueCall3882 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDialogueCall3899 = new BitSet(new long[]{0x00601B2800000000L});
    public static final BitSet FOLLOW_37_in_ruleDialogueCall3911 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDialogueCall3920 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_ruleDialogueCall3954 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDialogueCall3967 = new BitSet(new long[]{0x00601B0800000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDialogueCall4003 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDialogueCall4017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDialogueCall4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_ruleExpression4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_ruleExpression4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_ruleExpression4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_ruleExpression4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_entryRuleProcessCall4250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessCall4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessCall4308 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleProcessCall4325 = new BitSet(new long[]{0x00601B2200000000L});
    public static final BitSet FOLLOW_37_in_ruleProcessCall4337 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleProcessCall4346 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_ruleProcessCall4380 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleProcessCall4393 = new BitSet(new long[]{0x00601B0200000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProcessCall4429 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleProcessCall4443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall4465 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleProcessCall4483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression4548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationExpression4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOperationExpression4592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationExpression4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_entryRuleSimpleProcessCall4655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProcessCall4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleProcessCall4712 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSimpleProcessCall4730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleProcessCall4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression4795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardExpression4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_ruleStandardExpression4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression4899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceExpression4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleServiceExpression4943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceExpression4965 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleServiceExpression4982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceExpression5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression5045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationExpression5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNavigationExpression5101 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleNavigationExpression5124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference5195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoPropertyReference5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference5291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationRoleReference5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_entryRuleUICall5387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUICall5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_ruleUICall5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall5474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElementCall5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleUIModelElementCall5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleUIModelElementCall5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleProcessType5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleProcessType5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleProcessType5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleProcessType5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleProcessType5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleProcessType5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleProcessType5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleProcessTypeLink5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExpressionType5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExpressionType5793 = new BitSet(new long[]{0x0000000000000002L});

}