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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'presentation'", "';'", "'from'", "'import'", "'ListForm'", "'ContentForm'", "'context'", "'['", "'readonly'", "'true'", "'false'", "'actions'", "']'", "'processes'", "'use'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'Process'", "'start'", "'step'", "'element'", "'label'", "'to'", "'alias'", "'('", "','", "')'", "':'", "'call'", "'.'", "'navigate'", "'dialogue'", "'process'", "'new'", "'save'", "'edit'", "'remove'", "'Cancel'", "'all'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:81:1: rulePresentationModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* ) ;
    public final EObject rulePresentationModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_elements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:6: ( ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:87:2: (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )*
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

                if ( (LA2_0==13) ) {
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:156:3: (lv_elements_5= ruleModelElementWithContext )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||(LA3_0>=15 && LA3_0<=16)||LA3_0==26||(LA3_0>=28 && LA3_0<=29)||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:159:6: lv_elements_5= ruleModelElementWithContext
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentationModelAccess().getElementsModelElementWithContextParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElementWithContext_in_rulePresentationModel260);
            	    lv_elements_5=ruleModelElementWithContext();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentationModelRule().getType().getClassifier());
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


    // $ANTLR start entryRuleExternalReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:184:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:184:59: (iv_ruleExternalReference= ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:185:2: iv_ruleExternalReference= ruleExternalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference298);
            iv_ruleExternalReference=ruleExternalReference();
            _fsp--;

             current =iv_ruleExternalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference308); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:192:1: ruleExternalReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:197:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:198:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:198:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:198:2: 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleExternalReference342); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:202:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:204:6: lv_modelName_1= RULE_ID
            {
            lv_modelName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference364); 

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

            match(input,14,FOLLOW_14_in_ruleExternalReference381); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getImportKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:226:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:228:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference403); 

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

            match(input,12,FOLLOW_12_in_ruleExternalReference420); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:257:1: entryRuleModelElementWithContext returns [EObject current=null] : iv_ruleModelElementWithContext= ruleModelElementWithContext EOF ;
    public final EObject entryRuleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementWithContext = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:257:65: (iv_ruleModelElementWithContext= ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:258:2: iv_ruleModelElementWithContext= ruleModelElementWithContext EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelElementWithContextRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext453);
            iv_ruleModelElementWithContext=ruleModelElementWithContext();
            _fsp--;

             current =iv_ruleModelElementWithContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElementWithContext463); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:265:1: ruleModelElementWithContext returns [EObject current=null] : this_UIModelElement_0= ruleUIModelElement ;
    public final EObject ruleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElement_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:270:6: (this_UIModelElement_0= ruleUIModelElement )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:272:5: this_UIModelElement_0= ruleUIModelElement
            {
             
                    currentNode=createCompositeNode(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext509);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:287:1: entryRuleUIModelElement returns [EObject current=null] : iv_ruleUIModelElement= ruleUIModelElement EOF ;
    public final EObject entryRuleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:287:56: (iv_ruleUIModelElement= ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:288:2: iv_ruleUIModelElement= ruleUIModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement540);
            iv_ruleUIModelElement=ruleUIModelElement();
            _fsp--;

             current =iv_ruleUIModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement550); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:295:1: ruleUIModelElement returns [EObject current=null] : (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) ;
    public final EObject ruleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Dialogue_0 = null;

        EObject this_Process_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:300:6: ( (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:301:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:301:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=15 && LA4_1<=16)||LA4_1==26||(LA4_1>=28 && LA4_1<=29)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==32) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("301:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
            case 26:
            case 28:
            case 29:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("301:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:302:5: this_Dialogue_0= ruleDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogue_in_ruleUIModelElement597);
                    this_Dialogue_0=ruleDialogue();
                    _fsp--;

                     
                            current = this_Dialogue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:312:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleUIModelElement624);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:327:1: entryRuleDialogue returns [EObject current=null] : iv_ruleDialogue= ruleDialogue EOF ;
    public final EObject entryRuleDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:327:50: (iv_ruleDialogue= ruleDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:328:2: iv_ruleDialogue= ruleDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogue_in_entryRuleDialogue656);
            iv_ruleDialogue=ruleDialogue();
            _fsp--;

             current =iv_ruleDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogue666); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:335:1: ruleDialogue returns [EObject current=null] : (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) ;
    public final EObject ruleDialogue() throws RecognitionException {
        EObject current = null;

        EObject this_ContentForm_0 = null;

        EObject this_CompoundDialogue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:340:6: ( (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:341:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:341:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==26||(LA5_1>=28 && LA5_1<=29)) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=15 && LA5_1<=16)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("341:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
                {
                alt5=1;
                }
                break;
            case 26:
            case 28:
            case 29:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("341:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:342:5: this_ContentForm_0= ruleContentForm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentForm_in_ruleDialogue713);
                    this_ContentForm_0=ruleContentForm();
                    _fsp--;

                     
                            current = this_ContentForm_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:352:5: this_CompoundDialogue_1= ruleCompoundDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_ruleDialogue740);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:367:1: entryRuleContentForm returns [EObject current=null] : iv_ruleContentForm= ruleContentForm EOF ;
    public final EObject entryRuleContentForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentForm = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:367:53: (iv_ruleContentForm= ruleContentForm EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:368:2: iv_ruleContentForm= ruleContentForm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentFormRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentForm_in_entryRuleContentForm772);
            iv_ruleContentForm=ruleContentForm();
            _fsp--;

             current =iv_ruleContentForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentForm782); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:375:1: ruleContentForm returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? ( (lv_isCollection_1= 'ListForm' ) | 'ContentForm' ) (lv_name_3= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleSimpleProcess ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleProcessCall ) ';' )* ']' )? ']' ) ;
    public final EObject ruleContentForm() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_isCollection_1=null;
        Token lv_name_3=null;
        Token lv_readonly_8=null;
        EObject lv_formElements_11 = null;

        EObject lv_actions_14 = null;

        EObject lv_processes_19 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:380:6: ( ( (lv_description_0= RULE_STRING )? ( (lv_isCollection_1= 'ListForm' ) | 'ContentForm' ) (lv_name_3= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleSimpleProcess ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleProcessCall ) ';' )* ']' )? ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:381:1: ( (lv_description_0= RULE_STRING )? ( (lv_isCollection_1= 'ListForm' ) | 'ContentForm' ) (lv_name_3= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleSimpleProcess ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleProcessCall ) ';' )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:381:1: ( (lv_description_0= RULE_STRING )? ( (lv_isCollection_1= 'ListForm' ) | 'ContentForm' ) (lv_name_3= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleSimpleProcess ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleProcessCall ) ';' )* ']' )? ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:381:2: (lv_description_0= RULE_STRING )? ( (lv_isCollection_1= 'ListForm' ) | 'ContentForm' ) (lv_name_3= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleSimpleProcess ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleProcessCall ) ';' )* ']' )? ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:381:2: (lv_description_0= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:383:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContentForm829); 

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:401:3: ( (lv_isCollection_1= 'ListForm' ) | 'ContentForm' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("401:3: ( (lv_isCollection_1= 'ListForm' ) | 'ContentForm' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:401:4: (lv_isCollection_1= 'ListForm' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:401:4: (lv_isCollection_1= 'ListForm' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:403:6: lv_isCollection_1= 'ListForm'
                    {
                    lv_isCollection_1=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleContentForm860); 

                            createLeafNode(grammarAccess.getContentFormAccess().getIsCollectionListFormKeyword_1_0_0(), "isCollection"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isCollection", true, "ListForm", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:423:6: 'ContentForm'
                    {
                    match(input,16,FOLLOW_16_in_ruleContentForm888); 

                            createLeafNode(grammarAccess.getContentFormAccess().getContentFormKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:427:2: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:429:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm911); 

            		createLeafNode(grammarAccess.getContentFormAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleContentForm928); 

                    createLeafNode(grammarAccess.getContentFormAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:451:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:454:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm950); 

            		createLeafNode(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            match(input,18,FOLLOW_18_in_ruleContentForm962); 

                    createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:471:1: ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:471:2: 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';'
                    {
                    match(input,19,FOLLOW_19_in_ruleContentForm972); 

                            createLeafNode(grammarAccess.getContentFormAccess().getReadonlyKeyword_6_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:475:1: ( (lv_readonly_8= 'true' ) | 'false' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==21) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("475:1: ( (lv_readonly_8= 'true' ) | 'false' )", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:475:2: (lv_readonly_8= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:475:2: (lv_readonly_8= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:477:6: lv_readonly_8= 'true'
                            {
                            lv_readonly_8=(Token)input.LT(1);
                            match(input,20,FOLLOW_20_in_ruleContentForm994); 

                                    createLeafNode(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_6_1_0_0(), "readonly"); 
                                

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:497:6: 'false'
                            {
                            match(input,21,FOLLOW_21_in_ruleContentForm1022); 

                                    createLeafNode(grammarAccess.getContentFormAccess().getFalseKeyword_6_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleContentForm1032); 

                            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_6_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:505:3: (lv_formElements_11= ruleFormElement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:508:6: lv_formElements_11= ruleFormElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormElement_in_ruleContentForm1068);
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
            	    break loop10;
                }
            } while (true);

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:526:3: ( 'actions' '[' ( (lv_actions_14= ruleSimpleProcess ) ';' )* ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:526:4: 'actions' '[' ( (lv_actions_14= ruleSimpleProcess ) ';' )* ']'
                    {
                    match(input,22,FOLLOW_22_in_ruleContentForm1083); 

                            createLeafNode(grammarAccess.getContentFormAccess().getActionsKeyword_8_0(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleContentForm1092); 

                            createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_8_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:534:1: ( (lv_actions_14= ruleSimpleProcess ) ';' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:534:2: (lv_actions_14= ruleSimpleProcess ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:534:2: (lv_actions_14= ruleSimpleProcess )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:537:6: lv_actions_14= ruleSimpleProcess
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getActionsSimpleProcessParserRuleCall_8_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleProcess_in_ruleContentForm1127);
                    	    lv_actions_14=ruleSimpleProcess();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "actions", lv_actions_14, "SimpleProcess", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }

                    	    match(input,12,FOLLOW_12_in_ruleContentForm1140); 

                    	            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_8_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleContentForm1151); 

                            createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_8_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:563:3: ( 'processes' '[' ( (lv_processes_19= ruleProcessCall ) ';' )* ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:563:4: 'processes' '[' ( (lv_processes_19= ruleProcessCall ) ';' )* ']'
                    {
                    match(input,24,FOLLOW_24_in_ruleContentForm1163); 

                            createLeafNode(grammarAccess.getContentFormAccess().getProcessesKeyword_9_0(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleContentForm1172); 

                            createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:1: ( (lv_processes_19= ruleProcessCall ) ';' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==43||LA13_0==45||LA13_0==53) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:2: (lv_processes_19= ruleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:2: (lv_processes_19= ruleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:574:6: lv_processes_19= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getProcessesProcessCallParserRuleCall_9_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleContentForm1207);
                    	    lv_processes_19=ruleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_19, "ProcessCall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }

                    	    match(input,12,FOLLOW_12_in_ruleContentForm1220); 

                    	            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleContentForm1231); 

                            createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3(), null); 
                        

                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleContentForm1242); 

                    createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10(), null); 
                

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


    // $ANTLR start entryRuleSimpleProcess
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:611:1: entryRuleSimpleProcess returns [EObject current=null] : iv_ruleSimpleProcess= ruleSimpleProcess EOF ;
    public final EObject entryRuleSimpleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:611:55: (iv_ruleSimpleProcess= ruleSimpleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:612:2: iv_ruleSimpleProcess= ruleSimpleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleProcess_in_entryRuleSimpleProcess1275);
            iv_ruleSimpleProcess=ruleSimpleProcess();
            _fsp--;

             current =iv_ruleSimpleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProcess1285); 

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
    // $ANTLR end entryRuleSimpleProcess


    // $ANTLR start ruleSimpleProcess
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:619:1: ruleSimpleProcess returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) (lv_type_2= ruleProcessType )? ( 'use' (lv_processElements_4= ruleDialogueCall ) )? ) ;
    public final EObject ruleSimpleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_1=null;
        Enumerator lv_type_2 = null;

        EObject lv_processElements_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:624:6: ( ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) (lv_type_2= ruleProcessType )? ( 'use' (lv_processElements_4= ruleDialogueCall ) )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:625:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) (lv_type_2= ruleProcessType )? ( 'use' (lv_processElements_4= ruleDialogueCall ) )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:625:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) (lv_type_2= ruleProcessType )? ( 'use' (lv_processElements_4= ruleDialogueCall ) )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:625:2: (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) (lv_type_2= ruleProcessType )? ( 'use' (lv_processElements_4= ruleDialogueCall ) )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:625:2: (lv_description_0= RULE_STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:627:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleProcess1332); 

                    		createLeafNode(grammarAccess.getSimpleProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleProcessRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:645:3: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:647:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleProcess1363); 

            		createLeafNode(grammarAccess.getSimpleProcessAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:665:2: (lv_type_2= ruleProcessType )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=48 && LA16_0<=52)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:668:6: lv_type_2= ruleProcessType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSimpleProcessAccess().getTypeProcessTypeEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcessType_in_ruleSimpleProcess1405);
                    lv_type_2=ruleProcessType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_2, "ProcessType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:686:3: ( 'use' (lv_processElements_4= ruleDialogueCall ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:686:4: 'use' (lv_processElements_4= ruleDialogueCall )
                    {
                    match(input,25,FOLLOW_25_in_ruleSimpleProcess1420); 

                            createLeafNode(grammarAccess.getSimpleProcessAccess().getUseKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:690:1: (lv_processElements_4= ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:693:6: lv_processElements_4= ruleDialogueCall
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSimpleProcessAccess().getProcessElementsDialogueCallParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDialogueCall_in_ruleSimpleProcess1454);
                    lv_processElements_4=ruleDialogueCall();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "processElements", lv_processElements_4, "DialogueCall", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleSimpleProcess


    // $ANTLR start entryRuleCompoundDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:718:1: entryRuleCompoundDialogue returns [EObject current=null] : iv_ruleCompoundDialogue= ruleCompoundDialogue EOF ;
    public final EObject entryRuleCompoundDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:718:58: (iv_ruleCompoundDialogue= ruleCompoundDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:719:2: iv_ruleCompoundDialogue= ruleCompoundDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue1493);
            iv_ruleCompoundDialogue=ruleCompoundDialogue();
            _fsp--;

             current =iv_ruleCompoundDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundDialogue1503); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:726:1: ruleCompoundDialogue returns [EObject current=null] : ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail ) ;
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:731:6: ( ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:732:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:732:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt25=3;
                    }
                    break;
                case 28:
                    {
                    alt25=2;
                    }
                    break;
                case 26:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("732:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )", 25, 1, input);

                    throw nvae;
                }

                }
                break;
            case 26:
                {
                alt25=1;
                }
                break;
            case 28:
                {
                alt25=2;
                }
                break;
            case 29:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("732:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:732:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:732:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:732:3: (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )?
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:732:3: (lv_description_0= RULE_STRING )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_STRING) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:734:6: lv_description_0= RULE_STRING
                            {
                            lv_description_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompoundDialogue1551); 

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

                    match(input,26,FOLLOW_26_in_ruleCompoundDialogue1569); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:756:1: (lv_name_2= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:758:6: lv_name_2= RULE_ID
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue1591); 

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

                    match(input,17,FOLLOW_17_in_ruleCompoundDialogue1608); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:780:1: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:783:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue1630); 

                    		createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0(), "contextRef"); 
                    	

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:796:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==19) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:796:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                            {
                            match(input,19,FOLLOW_19_in_ruleCompoundDialogue1643); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:800:1: ( (lv_readonly_6= 'true' ) | 'false' )
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==20) ) {
                                alt19=1;
                            }
                            else if ( (LA19_0==21) ) {
                                alt19=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("800:1: ( (lv_readonly_6= 'true' ) | 'false' )", 19, 0, input);

                                throw nvae;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:800:2: (lv_readonly_6= 'true' )
                                    {
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:800:2: (lv_readonly_6= 'true' )
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:802:6: lv_readonly_6= 'true'
                                    {
                                    lv_readonly_6=(Token)input.LT(1);
                                    match(input,20,FOLLOW_20_in_ruleCompoundDialogue1665); 

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
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:822:6: 'false'
                                    {
                                    match(input,21,FOLLOW_21_in_ruleCompoundDialogue1693); 

                                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1(), null); 
                                        

                                    }
                                    break;

                            }

                            match(input,12,FOLLOW_12_in_ruleCompoundDialogue1703); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:3: ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==27) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:4: 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']'
                            {
                            match(input,27,FOLLOW_27_in_ruleCompoundDialogue1715); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0(), null); 
                                
                            match(input,18,FOLLOW_18_in_ruleCompoundDialogue1724); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:838:1: ( (lv_dialogues_11= ruleDialogueCall ) ';' )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==RULE_ID||LA21_0==43||LA21_0==45||LA21_0==53) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:838:2: (lv_dialogues_11= ruleDialogueCall ) ';'
                            	    {
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:838:2: (lv_dialogues_11= ruleDialogueCall )
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:841:6: lv_dialogues_11= ruleDialogueCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue1759);
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

                            	    match(input,12,FOLLOW_12_in_ruleCompoundDialogue1772); 

                            	            createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1(), null); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);

                            match(input,23,FOLLOW_23_in_ruleCompoundDialogue1783); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:867:3: ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==24) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:867:4: 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']'
                            {
                            match(input,24,FOLLOW_24_in_ruleCompoundDialogue1795); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0(), null); 
                                
                            match(input,18,FOLLOW_18_in_ruleCompoundDialogue1804); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:875:1: ( (lv_processes_16= ruleProcessCall ) ';' )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_ID||LA23_0==43||LA23_0==45||LA23_0==53) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:875:2: (lv_processes_16= ruleProcessCall ) ';'
                            	    {
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:875:2: (lv_processes_16= ruleProcessCall )
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:878:6: lv_processes_16= ruleProcessCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCompoundDialogue1839);
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

                            	    match(input,12,FOLLOW_12_in_ruleCompoundDialogue1852); 

                            	            createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1(), null); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);

                            match(input,23,FOLLOW_23_in_ruleCompoundDialogue1863); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:906:5: this_CollectionDialogue_19= ruleCollectionDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue1894);
                    this_CollectionDialogue_19=ruleCollectionDialogue();
                    _fsp--;

                     
                            current = this_CollectionDialogue_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:916:5: this_MasterDetail_20= ruleMasterDetail
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue1921);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:931:1: entryRuleCollectionDialogue returns [EObject current=null] : iv_ruleCollectionDialogue= ruleCollectionDialogue EOF ;
    public final EObject entryRuleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:931:60: (iv_ruleCollectionDialogue= ruleCollectionDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:932:2: iv_ruleCollectionDialogue= ruleCollectionDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue1953);
            iv_ruleCollectionDialogue=ruleCollectionDialogue();
            _fsp--;

             current =iv_ruleCollectionDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionDialogue1963); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:939:1: ruleCollectionDialogue returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' ) ;
    public final EObject ruleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_7=null;
        EObject lv_dialogues_12 = null;

        EObject lv_processes_17 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:944:6: ( ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:945:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:945:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:945:2: (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:945:2: (lv_description_0= RULE_STRING )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:947:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollectionDialogue2010); 

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

            match(input,28,FOLLOW_28_in_ruleCollectionDialogue2028); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:969:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:971:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue2050); 

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

            match(input,17,FOLLOW_17_in_ruleCollectionDialogue2067); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:993:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:996:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue2089); 

            		createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            match(input,18,FOLLOW_18_in_ruleCollectionDialogue2101); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1013:1: ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1013:2: 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';'
                    {
                    match(input,19,FOLLOW_19_in_ruleCollectionDialogue2111); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1017:1: ( (lv_readonly_7= 'true' ) | 'false' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==20) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==21) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1017:1: ( (lv_readonly_7= 'true' ) | 'false' )", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1017:2: (lv_readonly_7= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1017:2: (lv_readonly_7= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1019:6: lv_readonly_7= 'true'
                            {
                            lv_readonly_7=(Token)input.LT(1);
                            match(input,20,FOLLOW_20_in_ruleCollectionDialogue2133); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1039:6: 'false'
                            {
                            match(input,21,FOLLOW_21_in_ruleCollectionDialogue2161); 

                                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleCollectionDialogue2171); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1047:3: ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1047:4: 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']'
                    {
                    match(input,27,FOLLOW_27_in_ruleCollectionDialogue2183); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleCollectionDialogue2192); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1055:1: ( (lv_dialogues_12= ruleDialogueCall ) ';' )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID||LA29_0==43||LA29_0==45||LA29_0==53) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1055:2: (lv_dialogues_12= ruleDialogueCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1055:2: (lv_dialogues_12= ruleDialogueCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1058:6: lv_dialogues_12= ruleDialogueCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue2227);
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

                    	    match(input,12,FOLLOW_12_in_ruleCollectionDialogue2240); 

                    	            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleCollectionDialogue2251); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1084:3: ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1084:4: 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']'
                    {
                    match(input,24,FOLLOW_24_in_ruleCollectionDialogue2263); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleCollectionDialogue2272); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1092:1: ( (lv_processes_17= ruleProcessCall ) ';' )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID||LA31_0==43||LA31_0==45||LA31_0==53) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1092:2: (lv_processes_17= ruleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1092:2: (lv_processes_17= ruleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1095:6: lv_processes_17= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCollectionDialogue2307);
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

                    	    match(input,12,FOLLOW_12_in_ruleCollectionDialogue2320); 

                    	            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleCollectionDialogue2331); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3(), null); 
                        

                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleCollectionDialogue2342); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1132:1: entryRuleMasterDetail returns [EObject current=null] : iv_ruleMasterDetail= ruleMasterDetail EOF ;
    public final EObject entryRuleMasterDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMasterDetail = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1132:54: (iv_ruleMasterDetail= ruleMasterDetail EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1133:2: iv_ruleMasterDetail= ruleMasterDetail EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMasterDetailRule(), currentNode); 
            pushFollow(FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail2375);
            iv_ruleMasterDetail=ruleMasterDetail();
            _fsp--;

             current =iv_ruleMasterDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterDetail2385); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1140:1: ruleMasterDetail returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ) ;
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1145:6: ( ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1146:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1146:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1146:2: (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1146:2: (lv_description_0= RULE_STRING )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1148:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMasterDetail2432); 

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

            match(input,29,FOLLOW_29_in_ruleMasterDetail2450); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1170:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1172:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail2472); 

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

            match(input,17,FOLLOW_17_in_ruleMasterDetail2489); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1194:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1197:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail2511); 

            		createLeafNode(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1210:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1210:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                    {
                    match(input,19,FOLLOW_19_in_ruleMasterDetail2524); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1214:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==20) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==21) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1214:1: ( (lv_readonly_6= 'true' ) | 'false' )", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1214:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1214:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1216:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,20,FOLLOW_20_in_ruleMasterDetail2546); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1236:6: 'false'
                            {
                            match(input,21,FOLLOW_21_in_ruleMasterDetail2574); 

                                    createLeafNode(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleMasterDetail2584); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2(), null); 
                        

                    }
                    break;

            }

            match(input,30,FOLLOW_30_in_ruleMasterDetail2595); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterKeyword_6(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1248:1: (lv_master_10= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1251:6: lv_master_10= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail2629);
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

            match(input,12,FOLLOW_12_in_ruleMasterDetail2642); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8(), null); 
                
            match(input,31,FOLLOW_31_in_ruleMasterDetail2651); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getDetailKeyword_9(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1277:1: (lv_detail_13= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1280:6: lv_detail_13= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail2685);
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

            match(input,12,FOLLOW_12_in_ruleMasterDetail2698); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1302:1: ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1302:2: 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']'
                    {
                    match(input,24,FOLLOW_24_in_ruleMasterDetail2708); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleMasterDetail2717); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1310:1: ( (lv_processes_17= ruleProcessCall ) ';' )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID||LA36_0==43||LA36_0==45||LA36_0==53) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1310:2: (lv_processes_17= ruleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1310:2: (lv_processes_17= ruleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1313:6: lv_processes_17= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleMasterDetail2752);
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

                    	    match(input,12,FOLLOW_12_in_ruleMasterDetail2765); 

                    	            createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleMasterDetail2776); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1346:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1346:49: (iv_ruleProcess= ruleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1347:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess2811);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess2821); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1354:1: ruleProcess returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'Process' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) (lv_root_5= 'start' )? (lv_type_6= ruleProcessType )? ( 'step' '[' ( (lv_processElements_9= ruleDialogueCall ) ';' ) ']' )? ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_root_5=null;
        Enumerator lv_type_6 = null;

        EObject lv_processElements_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1359:6: ( ( (lv_description_0= RULE_STRING )? 'Process' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) (lv_root_5= 'start' )? (lv_type_6= ruleProcessType )? ( 'step' '[' ( (lv_processElements_9= ruleDialogueCall ) ';' ) ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1360:1: ( (lv_description_0= RULE_STRING )? 'Process' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) (lv_root_5= 'start' )? (lv_type_6= ruleProcessType )? ( 'step' '[' ( (lv_processElements_9= ruleDialogueCall ) ';' ) ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1360:1: ( (lv_description_0= RULE_STRING )? 'Process' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) (lv_root_5= 'start' )? (lv_type_6= ruleProcessType )? ( 'step' '[' ( (lv_processElements_9= ruleDialogueCall ) ';' ) ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1360:2: (lv_description_0= RULE_STRING )? 'Process' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) (lv_root_5= 'start' )? (lv_type_6= ruleProcessType )? ( 'step' '[' ( (lv_processElements_9= ruleDialogueCall ) ';' ) ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1360:2: (lv_description_0= RULE_STRING )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1362:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcess2868); 

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

            match(input,32,FOLLOW_32_in_ruleProcess2886); 

                    createLeafNode(grammarAccess.getProcessAccess().getProcessKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1384:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1386:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess2908); 

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

            match(input,17,FOLLOW_17_in_ruleProcess2925); 

                    createLeafNode(grammarAccess.getProcessAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1408:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1411:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess2947); 

            		createLeafNode(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1424:2: (lv_root_5= 'start' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1426:6: lv_root_5= 'start'
                    {
                    lv_root_5=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleProcess2971); 

                            createLeafNode(grammarAccess.getProcessAccess().getRootStartKeyword_5_0(), "root"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "root", true, "start", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1445:3: (lv_type_6= ruleProcessType )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=48 && LA40_0<=52)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1448:6: lv_type_6= ruleProcessType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcessType_in_ruleProcess3019);
                    lv_type_6=ruleProcessType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_6, "ProcessType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1466:3: ( 'step' '[' ( (lv_processElements_9= ruleDialogueCall ) ';' ) ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==34) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1466:4: 'step' '[' ( (lv_processElements_9= ruleDialogueCall ) ';' ) ']'
                    {
                    match(input,34,FOLLOW_34_in_ruleProcess3034); 

                            createLeafNode(grammarAccess.getProcessAccess().getStepKeyword_7_0(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleProcess3043); 

                            createLeafNode(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_7_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1474:1: ( (lv_processElements_9= ruleDialogueCall ) ';' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1474:2: (lv_processElements_9= ruleDialogueCall ) ';'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1474:2: (lv_processElements_9= ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1477:6: lv_processElements_9= ruleDialogueCall
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getProcessElementsDialogueCallParserRuleCall_7_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDialogueCall_in_ruleProcess3078);
                    lv_processElements_9=ruleDialogueCall();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "processElements", lv_processElements_9, "DialogueCall", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,12,FOLLOW_12_in_ruleProcess3091); 

                            createLeafNode(grammarAccess.getProcessAccess().getSemicolonKeyword_7_2_1(), null); 
                        

                    }

                    match(input,23,FOLLOW_23_in_ruleProcess3101); 

                            createLeafNode(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_7_3(), null); 
                        

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
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleFormElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1510:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1510:53: (iv_ruleFormElement= ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1511:2: iv_ruleFormElement= ruleFormElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement3136);
            iv_ruleFormElement=ruleFormElement();
            _fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement3146); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1518:1: ruleFormElement returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_label_4=null;
        Token lv_readonly_6=null;
        EObject lv_references_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1523:6: ( ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1524:1: ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1524:1: ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1524:2: (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1524:2: (lv_description_0= RULE_STRING )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1526:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormElement3193); 

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

            match(input,35,FOLLOW_35_in_ruleFormElement3211); 

                    createLeafNode(grammarAccess.getFormElementAccess().getElementKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1548:1: (lv_references_2= ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1551:6: lv_references_2= ruleDtoPropertyReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3245);
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

            match(input,36,FOLLOW_36_in_ruleFormElement3258); 

                    createLeafNode(grammarAccess.getFormElementAccess().getLabelKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1573:1: (lv_label_4= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1575:6: lv_label_4= RULE_ID
            {
            lv_label_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormElement3280); 

            		createLeafNode(grammarAccess.getFormElementAccess().getLabelIDTerminalRuleCall_4_0(), "label"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "label", lv_label_4, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1593:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==19) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1593:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' )
                    {
                    match(input,19,FOLLOW_19_in_ruleFormElement3298); 

                            createLeafNode(grammarAccess.getFormElementAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1597:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==20) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==21) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1597:1: ( (lv_readonly_6= 'true' ) | 'false' )", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1597:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1597:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1599:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,20,FOLLOW_20_in_ruleFormElement3320); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_5_1_0_0(), "readonly"); 
                                

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1619:6: 'false'
                            {
                            match(input,21,FOLLOW_21_in_ruleFormElement3348); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleFormElement3360); 

                    createLeafNode(grammarAccess.getFormElementAccess().getSemicolonKeyword_6(), null); 
                

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


    // $ANTLR start entryRuleDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1634:1: entryRuleDialogueCall returns [EObject current=null] : iv_ruleDialogueCall= ruleDialogueCall EOF ;
    public final EObject entryRuleDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1634:54: (iv_ruleDialogueCall= ruleDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1635:2: iv_ruleDialogueCall= ruleDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall3393);
            iv_ruleDialogueCall=ruleDialogueCall();
            _fsp--;

             current =iv_ruleDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogueCall3403); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1642:1: ruleDialogueCall returns [EObject current=null] : ( ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )? ) ;
    public final EObject ruleDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_alias_4=null;
        EObject lv_contextExp_0 = null;

        EObject lv_arguments_6 = null;

        EObject lv_arguments_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1647:6: ( ( ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1648:1: ( ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1648:1: ( ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1648:2: ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1648:2: ( (lv_contextExp_0= ruleExpression ) 'to' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==42) ) {
                    alt45=1;
                }
            }
            else if ( (LA45_0==43||LA45_0==45||LA45_0==53) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1648:3: (lv_contextExp_0= ruleExpression ) 'to'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1648:3: (lv_contextExp_0= ruleExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1651:6: lv_contextExp_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getContextExpExpressionParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDialogueCall3463);
                    lv_contextExp_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "contextExp", lv_contextExp_0, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,37,FOLLOW_37_in_ruleDialogueCall3476); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getToKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1673:3: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1675:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDialogueCall3500); 

            		createLeafNode(grammarAccess.getDialogueCallAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1693:2: ( 'alias' (lv_alias_4= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1693:3: 'alias' (lv_alias_4= RULE_ID )
                    {
                    match(input,38,FOLLOW_38_in_ruleDialogueCall3518); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getAliasKeyword_2_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1697:1: (lv_alias_4= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1699:6: lv_alias_4= RULE_ID
                    {
                    lv_alias_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDialogueCall3540); 

                    		createLeafNode(grammarAccess.getDialogueCallAccess().getAliasIDTerminalRuleCall_2_1_0(), "alias"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "alias", lv_alias_4, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1717:4: ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1717:5: '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')'
                    {
                    match(input,39,FOLLOW_39_in_ruleDialogueCall3560); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1721:1: (lv_arguments_6= ruleExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1724:6: lv_arguments_6= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getArgumentsExpressionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDialogueCall3594);
                    lv_arguments_6=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "arguments", lv_arguments_6, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1742:2: ( ',' (lv_arguments_8= ruleExpression ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==40) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1742:3: ',' (lv_arguments_8= ruleExpression )
                    	    {
                    	    match(input,40,FOLLOW_40_in_ruleDialogueCall3608); 

                    	            createLeafNode(grammarAccess.getDialogueCallAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1746:1: (lv_arguments_8= ruleExpression )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1749:6: lv_arguments_8= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getArgumentsExpressionParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleDialogueCall3642);
                    	    lv_arguments_8=ruleExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "arguments", lv_arguments_8, "Expression", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,41,FOLLOW_41_in_ruleDialogueCall3657); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getRightParenthesisKeyword_3_3(), null); 
                        

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
    // $ANTLR end ruleDialogueCall


    // $ANTLR start entryRuleExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1778:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1778:52: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1779:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3692);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3702); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1786:1: ruleExpression returns [EObject current=null] : (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceExpression_0 = null;

        EObject this_NavigationExpression_1 = null;

        EObject this_StandardExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1791:6: ( (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1792:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1792:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==42) ) {
                    int LA49_5 = input.LA(3);

                    if ( (LA49_5==43) ) {
                        alt49=1;
                    }
                    else if ( (LA49_5==45) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1792:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression )", 49, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1792:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression )", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt49=1;
                }
                break;
            case 45:
                {
                alt49=2;
                }
                break;
            case 53:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1792:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression )", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1793:5: this_ServiceExpression_0= ruleServiceExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleServiceExpression_in_ruleExpression3749);
                    this_ServiceExpression_0=ruleServiceExpression();
                    _fsp--;

                     
                            current = this_ServiceExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1803:5: this_NavigationExpression_1= ruleNavigationExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNavigationExpression_in_ruleExpression3776);
                    this_NavigationExpression_1=ruleNavigationExpression();
                    _fsp--;

                     
                            current = this_NavigationExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1813:5: this_StandardExpression_2= ruleStandardExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStandardExpression_in_ruleExpression3803);
                    this_StandardExpression_2=ruleStandardExpression();
                    _fsp--;

                     
                            current = this_StandardExpression_2; 
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1828:1: entryRuleProcessCall returns [EObject current=null] : iv_ruleProcessCall= ruleProcessCall EOF ;
    public final EObject entryRuleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1828:53: (iv_ruleProcessCall= ruleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1829:2: iv_ruleProcessCall= ruleProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcessCall_in_entryRuleProcessCall3835);
            iv_ruleProcessCall=ruleProcessCall();
            _fsp--;

             current =iv_ruleProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessCall3845); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1836:1: ruleProcessCall returns [EObject current=null] : ( ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )? ) ;
    public final EObject ruleProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_alias_4=null;
        EObject lv_contextExp_0 = null;

        EObject lv_arguments_6 = null;

        EObject lv_arguments_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1841:6: ( ( ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1842:1: ( ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1842:1: ( ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1842:2: ( (lv_contextExp_0= ruleExpression ) 'to' )? (lv_name_2= RULE_ID ) ( 'alias' (lv_alias_4= RULE_ID ) )? ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1842:2: ( (lv_contextExp_0= ruleExpression ) 'to' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==42) ) {
                    alt50=1;
                }
            }
            else if ( (LA50_0==43||LA50_0==45||LA50_0==53) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1842:3: (lv_contextExp_0= ruleExpression ) 'to'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1842:3: (lv_contextExp_0= ruleExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1845:6: lv_contextExp_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getContextExpExpressionParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProcessCall3905);
                    lv_contextExp_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "contextExp", lv_contextExp_0, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,37,FOLLOW_37_in_ruleProcessCall3918); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getToKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1867:3: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1869:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall3942); 

            		createLeafNode(grammarAccess.getProcessCallAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1887:2: ( 'alias' (lv_alias_4= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1887:3: 'alias' (lv_alias_4= RULE_ID )
                    {
                    match(input,38,FOLLOW_38_in_ruleProcessCall3960); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getAliasKeyword_2_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1891:1: (lv_alias_4= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1893:6: lv_alias_4= RULE_ID
                    {
                    lv_alias_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall3982); 

                    		createLeafNode(grammarAccess.getProcessCallAccess().getAliasIDTerminalRuleCall_2_1_0(), "alias"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "alias", lv_alias_4, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1911:4: ( '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1911:5: '(' (lv_arguments_6= ruleExpression ) ( ',' (lv_arguments_8= ruleExpression ) )* ')'
                    {
                    match(input,39,FOLLOW_39_in_ruleProcessCall4002); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1915:1: (lv_arguments_6= ruleExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1918:6: lv_arguments_6= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getArgumentsExpressionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProcessCall4036);
                    lv_arguments_6=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "arguments", lv_arguments_6, "Expression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1936:2: ( ',' (lv_arguments_8= ruleExpression ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==40) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1936:3: ',' (lv_arguments_8= ruleExpression )
                    	    {
                    	    match(input,40,FOLLOW_40_in_ruleProcessCall4050); 

                    	            createLeafNode(grammarAccess.getProcessCallAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1940:1: (lv_arguments_8= ruleExpression )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1943:6: lv_arguments_8= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getArgumentsExpressionParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleProcessCall4084);
                    	    lv_arguments_8=ruleExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "arguments", lv_arguments_8, "Expression", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    match(input,41,FOLLOW_41_in_ruleProcessCall4099); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_3_3(), null); 
                        

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


    // $ANTLR start entryRuleStandardExpression
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1972:1: entryRuleStandardExpression returns [EObject current=null] : iv_ruleStandardExpression= ruleStandardExpression EOF ;
    public final EObject entryRuleStandardExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1972:60: (iv_ruleStandardExpression= ruleStandardExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1973:2: iv_ruleStandardExpression= ruleStandardExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStandardExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression4134);
            iv_ruleStandardExpression=ruleStandardExpression();
            _fsp--;

             current =iv_ruleStandardExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardExpression4144); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1980:1: ruleStandardExpression returns [EObject current=null] : (lv_type_0= ruleExpressionType ) ;
    public final EObject ruleStandardExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1985:6: ( (lv_type_0= ruleExpressionType ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1986:1: (lv_type_0= ruleExpressionType )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1986:1: (lv_type_0= ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1989:6: lv_type_0= ruleExpressionType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpressionType_in_ruleStandardExpression4202);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2014:1: entryRuleServiceExpression returns [EObject current=null] : iv_ruleServiceExpression= ruleServiceExpression EOF ;
    public final EObject entryRuleServiceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2014:59: (iv_ruleServiceExpression= ruleServiceExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2015:2: iv_ruleServiceExpression= ruleServiceExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression4238);
            iv_ruleServiceExpression=ruleServiceExpression();
            _fsp--;

             current =iv_ruleServiceExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceExpression4248); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2022:1: ruleServiceExpression returns [EObject current=null] : ( ( (lv_name_0= RULE_ID ) ':' )? 'call' (lv_serviceName_3= RULE_ID ) '.' (lv_serviceMethod_5= RULE_ID ) ) ;
    public final EObject ruleServiceExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_serviceName_3=null;
        Token lv_serviceMethod_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2027:6: ( ( ( (lv_name_0= RULE_ID ) ':' )? 'call' (lv_serviceName_3= RULE_ID ) '.' (lv_serviceMethod_5= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2028:1: ( ( (lv_name_0= RULE_ID ) ':' )? 'call' (lv_serviceName_3= RULE_ID ) '.' (lv_serviceMethod_5= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2028:1: ( ( (lv_name_0= RULE_ID ) ':' )? 'call' (lv_serviceName_3= RULE_ID ) '.' (lv_serviceMethod_5= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2028:2: ( (lv_name_0= RULE_ID ) ':' )? 'call' (lv_serviceName_3= RULE_ID ) '.' (lv_serviceMethod_5= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2028:2: ( (lv_name_0= RULE_ID ) ':' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2028:3: (lv_name_0= RULE_ID ) ':'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2028:3: (lv_name_0= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2030:6: lv_name_0= RULE_ID
                    {
                    lv_name_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceExpression4296); 

                    		createLeafNode(grammarAccess.getServiceExpressionAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,42,FOLLOW_42_in_ruleServiceExpression4313); 

                            createLeafNode(grammarAccess.getServiceExpressionAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_ruleServiceExpression4324); 

                    createLeafNode(grammarAccess.getServiceExpressionAccess().getCallKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2056:1: (lv_serviceName_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2058:6: lv_serviceName_3= RULE_ID
            {
            lv_serviceName_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceExpression4346); 

            		createLeafNode(grammarAccess.getServiceExpressionAccess().getServiceNameIDTerminalRuleCall_2_0(), "serviceName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "serviceName", lv_serviceName_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,44,FOLLOW_44_in_ruleServiceExpression4363); 

                    createLeafNode(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2080:1: (lv_serviceMethod_5= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2082:6: lv_serviceMethod_5= RULE_ID
            {
            lv_serviceMethod_5=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceExpression4385); 

            		createLeafNode(grammarAccess.getServiceExpressionAccess().getServiceMethodIDTerminalRuleCall_4_0(), "serviceMethod"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "serviceMethod", lv_serviceMethod_5, "ID", lastConsumedNode);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2107:1: entryRuleNavigationExpression returns [EObject current=null] : iv_ruleNavigationExpression= ruleNavigationExpression EOF ;
    public final EObject entryRuleNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2107:62: (iv_ruleNavigationExpression= ruleNavigationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2108:2: iv_ruleNavigationExpression= ruleNavigationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNavigationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression4426);
            iv_ruleNavigationExpression=ruleNavigationExpression();
            _fsp--;

             current =iv_ruleNavigationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationExpression4436); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2115:1: ruleNavigationExpression returns [EObject current=null] : ( ( (lv_name_0= RULE_ID ) ':' )? 'navigate' (lv_references_3= ruleAssociationRoleReference ) ( '.' (lv_references_5= ruleAssociationRoleReference ) )* ) ;
    public final EObject ruleNavigationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        EObject lv_references_3 = null;

        EObject lv_references_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2120:6: ( ( ( (lv_name_0= RULE_ID ) ':' )? 'navigate' (lv_references_3= ruleAssociationRoleReference ) ( '.' (lv_references_5= ruleAssociationRoleReference ) )* ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2121:1: ( ( (lv_name_0= RULE_ID ) ':' )? 'navigate' (lv_references_3= ruleAssociationRoleReference ) ( '.' (lv_references_5= ruleAssociationRoleReference ) )* )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2121:1: ( ( (lv_name_0= RULE_ID ) ':' )? 'navigate' (lv_references_3= ruleAssociationRoleReference ) ( '.' (lv_references_5= ruleAssociationRoleReference ) )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2121:2: ( (lv_name_0= RULE_ID ) ':' )? 'navigate' (lv_references_3= ruleAssociationRoleReference ) ( '.' (lv_references_5= ruleAssociationRoleReference ) )*
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2121:2: ( (lv_name_0= RULE_ID ) ':' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2121:3: (lv_name_0= RULE_ID ) ':'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2121:3: (lv_name_0= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2123:6: lv_name_0= RULE_ID
                    {
                    lv_name_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNavigationExpression4484); 

                    		createLeafNode(grammarAccess.getNavigationExpressionAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNavigationExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,42,FOLLOW_42_in_ruleNavigationExpression4501); 

                            createLeafNode(grammarAccess.getNavigationExpressionAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            match(input,45,FOLLOW_45_in_ruleNavigationExpression4512); 

                    createLeafNode(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2149:1: (lv_references_3= ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2152:6: lv_references_3= ruleAssociationRoleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression4546);
            lv_references_3=ruleAssociationRoleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNavigationExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "references", lv_references_3, "AssociationRoleReference", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2170:2: ( '.' (lv_references_5= ruleAssociationRoleReference ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==44) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2170:3: '.' (lv_references_5= ruleAssociationRoleReference )
            	    {
            	    match(input,44,FOLLOW_44_in_ruleNavigationExpression4560); 

            	            createLeafNode(grammarAccess.getNavigationExpressionAccess().getFullStopKeyword_3_0(), null); 
            	        
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2174:1: (lv_references_5= ruleAssociationRoleReference )
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2177:6: lv_references_5= ruleAssociationRoleReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression4594);
            	    lv_references_5=ruleAssociationRoleReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNavigationExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "references", lv_references_5, "AssociationRoleReference", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end ruleNavigationExpression


    // $ANTLR start entryRuleDtoPropertyReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2202:1: entryRuleDtoPropertyReference returns [EObject current=null] : iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF ;
    public final EObject entryRuleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoPropertyReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2202:62: (iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2203:2: iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference4633);
            iv_ruleDtoPropertyReference=ruleDtoPropertyReference();
            _fsp--;

             current =iv_ruleDtoPropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference4643); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2210:1: ruleDtoPropertyReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2215:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2216:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2216:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2218:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoPropertyReference4689); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2243:1: entryRuleAssociationRoleReference returns [EObject current=null] : iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF ;
    public final EObject entryRuleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationRoleReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2243:66: (iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2244:2: iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRoleReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference4729);
            iv_ruleAssociationRoleReference=ruleAssociationRoleReference();
            _fsp--;

             current =iv_ruleAssociationRoleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference4739); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2251:1: ruleAssociationRoleReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2256:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2257:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2257:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2259:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationRoleReference4785); 

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


    // $ANTLR start entryRuleUIModelElementCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2286:1: entryRuleUIModelElementCall returns [EObject current=null] : iv_ruleUIModelElementCall= ruleUIModelElementCall EOF ;
    public final EObject entryRuleUIModelElementCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElementCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2286:60: (iv_ruleUIModelElementCall= ruleUIModelElementCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2287:2: iv_ruleUIModelElementCall= ruleUIModelElementCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall4827);
            iv_ruleUIModelElementCall=ruleUIModelElementCall();
            _fsp--;

             current =iv_ruleUIModelElementCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElementCall4837); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2294:1: ruleUIModelElementCall returns [EObject current=null] : ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) ) ;
    public final EObject ruleUIModelElementCall() throws RecognitionException {
        EObject current = null;

        EObject this_DialogueCall_1 = null;

        EObject this_ProcessCall_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2299:6: ( ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2300:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2300:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            else if ( (LA57_0==47) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2300:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2300:2: ( 'dialogue' this_DialogueCall_1= ruleDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2300:2: ( 'dialogue' this_DialogueCall_1= ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2300:3: 'dialogue' this_DialogueCall_1= ruleDialogueCall
                    {
                    match(input,46,FOLLOW_46_in_ruleUIModelElementCall4872); 

                            createLeafNode(grammarAccess.getUIModelElementCallAccess().getDialogueKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogueCall_in_ruleUIModelElementCall4894);
                    this_DialogueCall_1=ruleDialogueCall();
                    _fsp--;

                     
                            current = this_DialogueCall_1; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2314:6: ( 'process' this_ProcessCall_3= ruleProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2314:6: ( 'process' this_ProcessCall_3= ruleProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2314:7: 'process' this_ProcessCall_3= ruleProcessCall
                    {
                    match(input,47,FOLLOW_47_in_ruleUIModelElementCall4910); 

                            createLeafNode(grammarAccess.getUIModelElementCallAccess().getProcessKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcessCall_in_ruleUIModelElementCall4932);
                    this_ProcessCall_3=ruleProcessCall();
                    _fsp--;

                     
                            current = this_ProcessCall_3; 
                            currentNode = currentNode.getParent();
                        

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
    // $ANTLR end ruleUIModelElementCall


    // $ANTLR start ruleProcessType
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2334:1: ruleProcessType returns [Enumerator current=null] : ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'remove' ) | ( 'Cancel' ) ) ;
    public final Enumerator ruleProcessType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2338:6: ( ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'remove' ) | ( 'Cancel' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2339:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'remove' ) | ( 'Cancel' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2339:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'remove' ) | ( 'Cancel' ) )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt58=1;
                }
                break;
            case 49:
                {
                alt58=2;
                }
                break;
            case 50:
                {
                alt58=3;
                }
                break;
            case 51:
                {
                alt58=4;
                }
                break;
            case 52:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2339:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'remove' ) | ( 'Cancel' ) )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2339:2: ( 'new' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2339:2: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2339:4: 'new'
                    {
                    match(input,48,FOLLOW_48_in_ruleProcessType4979); 

                            current = grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2345:6: ( 'save' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2345:6: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2345:8: 'save'
                    {
                    match(input,49,FOLLOW_49_in_ruleProcessType4994); 

                            current = grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2351:6: ( 'edit' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2351:6: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2351:8: 'edit'
                    {
                    match(input,50,FOLLOW_50_in_ruleProcessType5009); 

                            current = grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2357:6: ( 'remove' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2357:6: ( 'remove' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2357:8: 'remove'
                    {
                    match(input,51,FOLLOW_51_in_ruleProcessType5024); 

                            current = grammarAccess.getProcessTypeAccess().getREMOVEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getREMOVEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2363:6: ( 'Cancel' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2363:6: ( 'Cancel' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2363:8: 'Cancel'
                    {
                    match(input,52,FOLLOW_52_in_ruleProcessType5039); 

                            current = grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4(), null); 
                        

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


    // $ANTLR start ruleExpressionType
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2373:1: ruleExpressionType returns [Enumerator current=null] : ( 'all' ) ;
    public final Enumerator ruleExpressionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2377:6: ( ( 'all' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2378:1: ( 'all' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2378:1: ( 'all' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2378:3: 'all'
            {
            match(input,53,FOLLOW_53_in_ruleExpressionType5081); 

                    current = grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration(), null); 
                

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
    public static final BitSet FOLLOW_12_in_rulePresentationModel187 = new BitSet(new long[]{0x000000013401A012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rulePresentationModel221 = new BitSet(new long[]{0x000000013401A012L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rulePresentationModel260 = new BitSet(new long[]{0x0000000134018012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExternalReference342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference364 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExternalReference381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_ruleUIModelElement597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleUIModelElement624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_entryRuleDialogue656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogue666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_ruleDialogue713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_ruleDialogue740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_entryRuleContentForm772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentForm782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContentForm829 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleContentForm860 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16_in_ruleContentForm888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm911 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContentForm928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm950 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContentForm962 = new BitSet(new long[]{0x0000000801C80010L});
    public static final BitSet FOLLOW_19_in_ruleContentForm972 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleContentForm994 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21_in_ruleContentForm1022 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1032 = new BitSet(new long[]{0x0000000801C00010L});
    public static final BitSet FOLLOW_ruleFormElement_in_ruleContentForm1068 = new BitSet(new long[]{0x0000000801C00010L});
    public static final BitSet FOLLOW_22_in_ruleContentForm1083 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContentForm1092 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_ruleSimpleProcess_in_ruleContentForm1127 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1140 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_23_in_ruleContentForm1151 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleContentForm1163 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContentForm1172 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleContentForm1207 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1220 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_23_in_ruleContentForm1231 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleContentForm1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcess_in_entryRuleSimpleProcess1275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProcess1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleProcess1332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleProcess1363 = new BitSet(new long[]{0x001F000002000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_ruleSimpleProcess1405 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleSimpleProcess1420 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleSimpleProcess1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundDialogue1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompoundDialogue1551 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCompoundDialogue1569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue1591 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompoundDialogue1608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue1630 = new BitSet(new long[]{0x0000000009080002L});
    public static final BitSet FOLLOW_19_in_ruleCompoundDialogue1643 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCompoundDialogue1665 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21_in_ruleCompoundDialogue1693 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue1703 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_27_in_ruleCompoundDialogue1715 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompoundDialogue1724 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue1759 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue1772 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_23_in_ruleCompoundDialogue1783 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCompoundDialogue1795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompoundDialogue1804 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCompoundDialogue1839 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue1852 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_23_in_ruleCompoundDialogue1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionDialogue1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollectionDialogue2010 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCollectionDialogue2028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue2050 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue2067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue2089 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCollectionDialogue2101 = new BitSet(new long[]{0x0000000009880000L});
    public static final BitSet FOLLOW_19_in_ruleCollectionDialogue2111 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCollectionDialogue2133 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21_in_ruleCollectionDialogue2161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue2171 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_27_in_ruleCollectionDialogue2183 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCollectionDialogue2192 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue2227 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue2240 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_23_in_ruleCollectionDialogue2251 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleCollectionDialogue2263 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCollectionDialogue2272 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCollectionDialogue2307 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue2320 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_23_in_ruleCollectionDialogue2331 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCollectionDialogue2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail2375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterDetail2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMasterDetail2432 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMasterDetail2450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail2472 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMasterDetail2489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail2511 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleMasterDetail2524 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleMasterDetail2546 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21_in_ruleMasterDetail2574 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2584 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMasterDetail2595 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail2629 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2642 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMasterDetail2651 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail2685 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2698 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleMasterDetail2708 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMasterDetail2717 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleMasterDetail2752 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2765 = new BitSet(new long[]{0x0020280000800020L});
    public static final BitSet FOLLOW_23_in_ruleMasterDetail2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess2811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcess2868 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleProcess2886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess2908 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProcess2925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess2947 = new BitSet(new long[]{0x001F000600000002L});
    public static final BitSet FOLLOW_33_in_ruleProcess2971 = new BitSet(new long[]{0x001F000400000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_ruleProcess3019 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleProcess3034 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProcess3043 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleProcess3078 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcess3091 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProcess3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement3136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormElement3193 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFormElement3211 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3245 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFormElement3258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormElement3280 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_19_in_ruleFormElement3298 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleFormElement3320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21_in_ruleFormElement3348 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFormElement3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogueCall3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDialogueCall3463 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDialogueCall3476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDialogueCall3500 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleDialogueCall3518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDialogueCall3540 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleDialogueCall3560 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDialogueCall3594 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_ruleDialogueCall3608 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDialogueCall3642 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_41_in_ruleDialogueCall3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_ruleExpression3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_ruleExpression3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_ruleExpression3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_entryRuleProcessCall3835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessCall3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProcessCall3905 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleProcessCall3918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall3942 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_ruleProcessCall3960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall3982 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleProcessCall4002 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProcessCall4036 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_ruleProcessCall4050 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProcessCall4084 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_41_in_ruleProcessCall4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression4134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardExpression4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_ruleStandardExpression4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression4238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceExpression4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceExpression4296 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleServiceExpression4313 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleServiceExpression4324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceExpression4346 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleServiceExpression4363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceExpression4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression4426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationExpression4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNavigationExpression4484 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNavigationExpression4501 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleNavigationExpression4512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression4546 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleNavigationExpression4560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression4594 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference4633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoPropertyReference4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference4729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationRoleReference4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall4827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElementCall4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUIModelElementCall4872 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleUIModelElementCall4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUIModelElementCall4910 = new BitSet(new long[]{0x0020280000000020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleUIModelElementCall4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleProcessType4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleProcessType4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleProcessType5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleProcessType5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleProcessType5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExpressionType5081 = new BitSet(new long[]{0x0000000000000002L});

}