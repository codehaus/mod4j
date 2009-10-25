package org.mod4j.dsl.presentation.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PresentationModel'", "'from'", "'import'", "'ContentForm'", "'using'", "'readonly'", "'true'", "'false'", "';'", "'processes'", "'['", "']'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'AutomatedProcess'", "'steps'", "'InteractiveProcess'", "'formElement'", "'named'", "'alias'", "'navigate'", "'to'", "'LinkStep'", "'LinkPath'", "'dialogue'", "'process'"
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:72:1: entryRulePresentationModel returns [EObject current=null] : iv_rulePresentationModel= rulePresentationModel EOF ;
    public final EObject entryRulePresentationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationModel = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:72:59: (iv_rulePresentationModel= rulePresentationModel EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:73:2: iv_rulePresentationModel= rulePresentationModel EOF
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:80:1: rulePresentationModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'PresentationModel' (lv_name_2= RULE_ID ) (lv_externalReferences_3= ruleExternalReference )* (lv_elements_4= ruleModelElement )* ) ;
    public final EObject rulePresentationModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_3 = null;

        EObject lv_elements_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:85:6: ( ( (lv_description_0= RULE_STRING )? 'PresentationModel' (lv_name_2= RULE_ID ) (lv_externalReferences_3= ruleExternalReference )* (lv_elements_4= ruleModelElement )* ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:1: ( (lv_description_0= RULE_STRING )? 'PresentationModel' (lv_name_2= RULE_ID ) (lv_externalReferences_3= ruleExternalReference )* (lv_elements_4= ruleModelElement )* )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:1: ( (lv_description_0= RULE_STRING )? 'PresentationModel' (lv_name_2= RULE_ID ) (lv_externalReferences_3= ruleExternalReference )* (lv_elements_4= ruleModelElement )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:2: (lv_description_0= RULE_STRING )? 'PresentationModel' (lv_name_2= RULE_ID ) (lv_externalReferences_3= ruleExternalReference )* (lv_elements_4= ruleModelElement )*
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:2: (lv_description_0= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:88:6: lv_description_0= RULE_STRING
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

                    createLeafNode(grammarAccess.getPresentationModelAccess().getPresentationModelKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:110:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:112:6: lv_name_2= RULE_ID
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:130:2: (lv_externalReferences_3= ruleExternalReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:133:6: lv_externalReferences_3= ruleExternalReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentationModelAccess().getExternalReferencesExternalReferenceParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalReference_in_rulePresentationModel212);
            	    lv_externalReferences_3=ruleExternalReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentationModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "externalReferences", lv_externalReferences_3, "ExternalReference", currentNode);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:151:3: (lv_elements_4= ruleModelElement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==14||LA3_0==23||(LA3_0>=25 && LA3_0<=26)||LA3_0==29||LA3_0==31||(LA3_0>=37 && LA3_0<=38)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:154:6: lv_elements_4= ruleModelElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentationModelAccess().getElementsModelElementParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElement_in_rulePresentationModel251);
            	    lv_elements_4=ruleModelElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentationModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elements", lv_elements_4, "ModelElement", currentNode);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:179:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:179:59: (iv_ruleExternalReference= ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:180:2: iv_ruleExternalReference= ruleExternalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference289);
            iv_ruleExternalReference=ruleExternalReference();
            _fsp--;

             current =iv_ruleExternalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference299); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:187:1: ruleExternalReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:192:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:193:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:193:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:193:2: 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID )
            {
            match(input,12,FOLLOW_12_in_ruleExternalReference333); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:197:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:199:6: lv_modelName_1= RULE_ID
            {
            lv_modelName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference355); 

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

            match(input,13,FOLLOW_13_in_ruleExternalReference372); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getImportKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:221:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:223:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference394); 

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


    // $ANTLR start entryRuleModelElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:248:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:248:54: (iv_ruleModelElement= ruleModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:249:2: iv_ruleModelElement= ruleModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement435);
            iv_ruleModelElement=ruleModelElement();
            _fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement445); 

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
    // $ANTLR end entryRuleModelElement


    // $ANTLR start ruleModelElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:256:1: ruleModelElement returns [EObject current=null] : (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElement_0 = null;

        EObject this_Link_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:261:6: ( (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:262:1: (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:262:1: (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=37 && LA4_1<=38)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==14||LA4_1==23||(LA4_1>=25 && LA4_1<=26)||LA4_1==29||LA4_1==31) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("262:1: (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink )", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
            case 23:
            case 25:
            case 26:
            case 29:
            case 31:
                {
                alt4=1;
                }
                break;
            case 37:
            case 38:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("262:1: (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:263:5: this_UIModelElement_0= ruleUIModelElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getUIModelElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElement492);
                    this_UIModelElement_0=ruleUIModelElement();
                    _fsp--;

                     
                            current = this_UIModelElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:273:5: this_Link_1= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementAccess().getLinkParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleModelElement519);
                    this_Link_1=ruleLink();
                    _fsp--;

                     
                            current = this_Link_1; 
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
    // $ANTLR end ruleModelElement


    // $ANTLR start entryRuleUIModelElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:288:1: entryRuleUIModelElement returns [EObject current=null] : iv_ruleUIModelElement= ruleUIModelElement EOF ;
    public final EObject entryRuleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:288:56: (iv_ruleUIModelElement= ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:289:2: iv_ruleUIModelElement= ruleUIModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement551);
            iv_ruleUIModelElement=ruleUIModelElement();
            _fsp--;

             current =iv_ruleUIModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement561); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:296:1: ruleUIModelElement returns [EObject current=null] : (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) ;
    public final EObject ruleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Dialogue_0 = null;

        EObject this_Process_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:301:6: ( (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:302:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:302:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==14||LA5_1==23||(LA5_1>=25 && LA5_1<=26)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==29||LA5_1==31) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("302:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
            case 23:
            case 25:
            case 26:
                {
                alt5=1;
                }
                break;
            case 29:
            case 31:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("302:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:303:5: this_Dialogue_0= ruleDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogue_in_ruleUIModelElement608);
                    this_Dialogue_0=ruleDialogue();
                    _fsp--;

                     
                            current = this_Dialogue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:313:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleUIModelElement635);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:328:1: entryRuleDialogue returns [EObject current=null] : iv_ruleDialogue= ruleDialogue EOF ;
    public final EObject entryRuleDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:328:50: (iv_ruleDialogue= ruleDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:329:2: iv_ruleDialogue= ruleDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogue_in_entryRuleDialogue667);
            iv_ruleDialogue=ruleDialogue();
            _fsp--;

             current =iv_ruleDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogue677); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:336:1: ruleDialogue returns [EObject current=null] : (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) ;
    public final EObject ruleDialogue() throws RecognitionException {
        EObject current = null;

        EObject this_ContentForm_0 = null;

        EObject this_CompoundDialogue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:341:6: ( (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:342:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:342:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==14) ) {
                    alt6=1;
                }
                else if ( (LA6_1==23||(LA6_1>=25 && LA6_1<=26)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("342:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt6=1;
                }
                break;
            case 23:
            case 25:
            case 26:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("342:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:343:5: this_ContentForm_0= ruleContentForm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentForm_in_ruleDialogue724);
                    this_ContentForm_0=ruleContentForm();
                    _fsp--;

                     
                            current = this_ContentForm_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:353:5: this_CompoundDialogue_1= ruleCompoundDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_ruleDialogue751);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:368:1: entryRuleContentForm returns [EObject current=null] : iv_ruleContentForm= ruleContentForm EOF ;
    public final EObject entryRuleContentForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentForm = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:368:53: (iv_ruleContentForm= ruleContentForm EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:369:2: iv_ruleContentForm= ruleContentForm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentFormRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentForm_in_entryRuleContentForm783);
            iv_ruleContentForm=ruleContentForm();
            _fsp--;

             current =iv_ruleContentForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentForm793); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:376:1: ruleContentForm returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? (lv_formElements_9= ruleFormElement )* ( 'processes' '[' (lv_processes_12= ruleProcessCall )* ']' )? ) ;
    public final EObject ruleContentForm() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_6=null;
        EObject lv_formElements_9 = null;

        EObject lv_processes_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:381:6: ( ( (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? (lv_formElements_9= ruleFormElement )* ( 'processes' '[' (lv_processes_12= ruleProcessCall )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:382:1: ( (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? (lv_formElements_9= ruleFormElement )* ( 'processes' '[' (lv_processes_12= ruleProcessCall )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:382:1: ( (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? (lv_formElements_9= ruleFormElement )* ( 'processes' '[' (lv_processes_12= ruleProcessCall )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:382:2: (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? (lv_formElements_9= ruleFormElement )* ( 'processes' '[' (lv_processes_12= ruleProcessCall )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:382:2: (lv_description_0= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:384:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContentForm840); 

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

            match(input,14,FOLLOW_14_in_ruleContentForm858); 

                    createLeafNode(grammarAccess.getContentFormAccess().getContentFormKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:406:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:408:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm880); 

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

            match(input,15,FOLLOW_15_in_ruleContentForm897); 

                    createLeafNode(grammarAccess.getContentFormAccess().getUsingKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:430:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:433:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm919); 

            		createLeafNode(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:446:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:446:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                    {
                    match(input,16,FOLLOW_16_in_ruleContentForm932); 

                            createLeafNode(grammarAccess.getContentFormAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:450:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==17) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==18) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("450:1: ( (lv_readonly_6= 'true' ) | 'false' )", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:450:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:450:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:452:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleContentForm954); 

                                    createLeafNode(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_5_1_0_0(), "readonly"); 
                                

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:472:6: 'false'
                            {
                            match(input,18,FOLLOW_18_in_ruleContentForm982); 

                                    createLeafNode(grammarAccess.getContentFormAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleContentForm992); 

                            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_5_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:480:3: (lv_formElements_9= ruleFormElement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:483:6: lv_formElements_9= ruleFormElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormElement_in_ruleContentForm1028);
            	    lv_formElements_9=ruleFormElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "formElements", lv_formElements_9, "FormElement", currentNode);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:501:3: ( 'processes' '[' (lv_processes_12= ruleProcessCall )* ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:501:4: 'processes' '[' (lv_processes_12= ruleProcessCall )* ']'
                    {
                    match(input,20,FOLLOW_20_in_ruleContentForm1043); 

                            createLeafNode(grammarAccess.getContentFormAccess().getProcessesKeyword_7_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleContentForm1052); 

                            createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_7_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:509:1: (lv_processes_12= ruleProcessCall )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==35) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:512:6: lv_processes_12= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getProcessesProcessCallParserRuleCall_7_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleContentForm1086);
                    	    lv_processes_12=ruleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_12, "ProcessCall", currentNode);
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

                    match(input,22,FOLLOW_22_in_ruleContentForm1100); 

                            createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_7_3(), null); 
                        

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
    // $ANTLR end ruleContentForm


    // $ANTLR start entryRuleCompoundDialogue
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:541:1: entryRuleCompoundDialogue returns [EObject current=null] : iv_ruleCompoundDialogue= ruleCompoundDialogue EOF ;
    public final EObject entryRuleCompoundDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:541:58: (iv_ruleCompoundDialogue= ruleCompoundDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:542:2: iv_ruleCompoundDialogue= ruleCompoundDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue1135);
            iv_ruleCompoundDialogue=ruleCompoundDialogue();
            _fsp--;

             current =iv_ruleCompoundDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundDialogue1145); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:549:1: ruleCompoundDialogue returns [EObject current=null] : ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail ) ;
    public final EObject ruleCompoundDialogue() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_6=null;
        EObject lv_dialogues_11 = null;

        EObject lv_processes_15 = null;

        EObject this_CollectionDialogue_17 = null;

        EObject this_MasterDetail_18 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:554:6: ( ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:555:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:555:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt20=2;
                    }
                    break;
                case 26:
                    {
                    alt20=3;
                    }
                    break;
                case 23:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("555:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail )", 20, 1, input);

                    throw nvae;
                }

                }
                break;
            case 23:
                {
                alt20=1;
                }
                break;
            case 25:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("555:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:555:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:555:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:555:3: (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:555:3: (lv_description_0= RULE_STRING )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:557:6: lv_description_0= RULE_STRING
                            {
                            lv_description_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompoundDialogue1193); 

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

                    match(input,23,FOLLOW_23_in_ruleCompoundDialogue1211); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:579:1: (lv_name_2= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:581:6: lv_name_2= RULE_ID
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue1233); 

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

                    match(input,15,FOLLOW_15_in_ruleCompoundDialogue1250); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getUsingKeyword_0_3(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:603:1: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:606:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue1272); 

                    		createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0(), "contextRef"); 
                    	

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:619:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==16) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:619:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                            {
                            match(input,16,FOLLOW_16_in_ruleCompoundDialogue1285); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:623:1: ( (lv_readonly_6= 'true' ) | 'false' )
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==17) ) {
                                alt14=1;
                            }
                            else if ( (LA14_0==18) ) {
                                alt14=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("623:1: ( (lv_readonly_6= 'true' ) | 'false' )", 14, 0, input);

                                throw nvae;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:623:2: (lv_readonly_6= 'true' )
                                    {
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:623:2: (lv_readonly_6= 'true' )
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:625:6: lv_readonly_6= 'true'
                                    {
                                    lv_readonly_6=(Token)input.LT(1);
                                    match(input,17,FOLLOW_17_in_ruleCompoundDialogue1307); 

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
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:645:6: 'false'
                                    {
                                    match(input,18,FOLLOW_18_in_ruleCompoundDialogue1335); 

                                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1(), null); 
                                        

                                    }
                                    break;

                            }

                            match(input,19,FOLLOW_19_in_ruleCompoundDialogue1345); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:653:3: ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:653:4: 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']'
                            {
                            match(input,24,FOLLOW_24_in_ruleCompoundDialogue1357); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0(), null); 
                                
                            match(input,21,FOLLOW_21_in_ruleCompoundDialogue1366); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:661:1: (lv_dialogues_11= ruleDialogueCall )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==RULE_ID||LA16_0==35) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:664:6: lv_dialogues_11= ruleDialogueCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue1400);
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
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);

                            match(input,22,FOLLOW_22_in_ruleCompoundDialogue1414); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:686:3: ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==20) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:686:4: 'processes' '[' (lv_processes_15= ruleProcessCall )* ']'
                            {
                            match(input,20,FOLLOW_20_in_ruleCompoundDialogue1426); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0(), null); 
                                
                            match(input,21,FOLLOW_21_in_ruleCompoundDialogue1435); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:694:1: (lv_processes_15= ruleProcessCall )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_ID||LA18_0==35) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:697:6: lv_processes_15= ruleProcessCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCompoundDialogue1469);
                            	    lv_processes_15=ruleProcessCall();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        
                            	    	        try {
                            	    	       		add(current, "processes", lv_processes_15, "ProcessCall", currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            match(input,22,FOLLOW_22_in_ruleCompoundDialogue1483); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:721:5: this_CollectionDialogue_17= ruleCollectionDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue1514);
                    this_CollectionDialogue_17=ruleCollectionDialogue();
                    _fsp--;

                     
                            current = this_CollectionDialogue_17; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:731:5: this_MasterDetail_18= ruleMasterDetail
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue1541);
                    this_MasterDetail_18=ruleMasterDetail();
                    _fsp--;

                     
                            current = this_MasterDetail_18; 
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:746:1: entryRuleCollectionDialogue returns [EObject current=null] : iv_ruleCollectionDialogue= ruleCollectionDialogue EOF ;
    public final EObject entryRuleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:746:60: (iv_ruleCollectionDialogue= ruleCollectionDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:747:2: iv_ruleCollectionDialogue= ruleCollectionDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue1573);
            iv_ruleCollectionDialogue=ruleCollectionDialogue();
            _fsp--;

             current =iv_ruleCollectionDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionDialogue1583); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:754:1: ruleCollectionDialogue returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) ;
    public final EObject ruleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_6=null;
        EObject lv_dialogues_11 = null;

        EObject lv_processes_15 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:759:6: ( ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:760:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:760:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:760:2: (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:760:2: (lv_description_0= RULE_STRING )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:762:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollectionDialogue1630); 

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

            match(input,25,FOLLOW_25_in_ruleCollectionDialogue1648); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:784:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:786:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue1670); 

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

            match(input,15,FOLLOW_15_in_ruleCollectionDialogue1687); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getUsingKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:808:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:811:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue1709); 

            		createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:824:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:824:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                    {
                    match(input,16,FOLLOW_16_in_ruleCollectionDialogue1722); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:828:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==17) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==18) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("828:1: ( (lv_readonly_6= 'true' ) | 'false' )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:828:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:828:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:830:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleCollectionDialogue1744); 

                                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_5_1_0_0(), "readonly"); 
                                

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:850:6: 'false'
                            {
                            match(input,18,FOLLOW_18_in_ruleCollectionDialogue1772); 

                                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleCollectionDialogue1782); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_5_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:858:3: ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:858:4: 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']'
                    {
                    match(input,24,FOLLOW_24_in_ruleCollectionDialogue1794); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_6_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleCollectionDialogue1803); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_6_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:866:1: (lv_dialogues_11= ruleDialogueCall )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==35) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:869:6: lv_dialogues_11= ruleDialogueCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_6_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue1837);
                    	    lv_dialogues_11=ruleDialogueCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "dialogues", lv_dialogues_11, "DialogueCall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleCollectionDialogue1851); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_6_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:891:3: ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:891:4: 'processes' '[' (lv_processes_15= ruleProcessCall )* ']'
                    {
                    match(input,20,FOLLOW_20_in_ruleCollectionDialogue1863); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_7_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleCollectionDialogue1872); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:899:1: (lv_processes_15= ruleProcessCall )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID||LA26_0==35) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:902:6: lv_processes_15= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_7_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCollectionDialogue1906);
                    	    lv_processes_15=ruleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_15, "ProcessCall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleCollectionDialogue1920); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3(), null); 
                        

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
    // $ANTLR end ruleCollectionDialogue


    // $ANTLR start entryRuleMasterDetail
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:931:1: entryRuleMasterDetail returns [EObject current=null] : iv_ruleMasterDetail= ruleMasterDetail EOF ;
    public final EObject entryRuleMasterDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMasterDetail = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:931:54: (iv_ruleMasterDetail= ruleMasterDetail EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:932:2: iv_ruleMasterDetail= ruleMasterDetail EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMasterDetailRule(), currentNode); 
            pushFollow(FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail1955);
            iv_ruleMasterDetail=ruleMasterDetail();
            _fsp--;

             current =iv_ruleMasterDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterDetail1965); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:939:1: ruleMasterDetail returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) ;
    public final EObject ruleMasterDetail() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_6=null;
        EObject lv_master_10 = null;

        EObject lv_detail_12 = null;

        EObject lv_processes_15 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:944:6: ( ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:945:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:945:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:945:2: (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:945:2: (lv_description_0= RULE_STRING )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:947:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMasterDetail2012); 

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

            match(input,26,FOLLOW_26_in_ruleMasterDetail2030); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:969:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:971:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail2052); 

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

            match(input,15,FOLLOW_15_in_ruleMasterDetail2069); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getUsingKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:993:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:996:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail2091); 

            		createLeafNode(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1009:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1009:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                    {
                    match(input,16,FOLLOW_16_in_ruleMasterDetail2104); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1013:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==17) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==18) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1013:1: ( (lv_readonly_6= 'true' ) | 'false' )", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1013:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1013:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1015:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleMasterDetail2126); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1035:6: 'false'
                            {
                            match(input,18,FOLLOW_18_in_ruleMasterDetail2154); 

                                    createLeafNode(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleMasterDetail2164); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2(), null); 
                        

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleMasterDetail2175); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterKeyword_6(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1047:1: (lv_master_10= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1050:6: lv_master_10= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail2209);
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

            match(input,28,FOLLOW_28_in_ruleMasterDetail2222); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getDetailKeyword_8(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1072:1: (lv_detail_12= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1075:6: lv_detail_12= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail2256);
            lv_detail_12=ruleDialogueCall();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "detail", lv_detail_12, "DialogueCall", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1093:2: ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1093:3: 'processes' '[' (lv_processes_15= ruleProcessCall )* ']'
                    {
                    match(input,20,FOLLOW_20_in_ruleMasterDetail2270); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getProcessesKeyword_10_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleMasterDetail2279); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_10_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1101:1: (lv_processes_15= ruleProcessCall )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID||LA31_0==35) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1104:6: lv_processes_15= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_10_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleMasterDetail2313);
                    	    lv_processes_15=ruleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_15, "ProcessCall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleMasterDetail2327); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getRightSquareBracketKeyword_10_3(), null); 
                        

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1133:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1133:49: (iv_ruleProcess= ruleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1134:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess2362);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess2372); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1141:1: ruleProcess returns [EObject current=null] : (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject this_AutomatedProcess_0 = null;

        EObject this_InteractiveProcess_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1146:6: ( (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1147:1: (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1147:1: (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess )
            int alt33=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==31) ) {
                    alt33=2;
                }
                else if ( (LA33_1==29) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1147:1: (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess )", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt33=1;
                }
                break;
            case 31:
                {
                alt33=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1147:1: (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1148:5: this_AutomatedProcess_0= ruleAutomatedProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getAutomatedProcessParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAutomatedProcess_in_ruleProcess2419);
                    this_AutomatedProcess_0=ruleAutomatedProcess();
                    _fsp--;

                     
                            current = this_AutomatedProcess_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1158:5: this_InteractiveProcess_1= ruleInteractiveProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getInteractiveProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInteractiveProcess_in_ruleProcess2446);
                    this_InteractiveProcess_1=ruleInteractiveProcess();
                    _fsp--;

                     
                            current = this_InteractiveProcess_1; 
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
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleAutomatedProcess
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1173:1: entryRuleAutomatedProcess returns [EObject current=null] : iv_ruleAutomatedProcess= ruleAutomatedProcess EOF ;
    public final EObject entryRuleAutomatedProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomatedProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1173:58: (iv_ruleAutomatedProcess= ruleAutomatedProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1174:2: iv_ruleAutomatedProcess= ruleAutomatedProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAutomatedProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleAutomatedProcess_in_entryRuleAutomatedProcess2478);
            iv_ruleAutomatedProcess=ruleAutomatedProcess();
            _fsp--;

             current =iv_ruleAutomatedProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutomatedProcess2488); 

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
    // $ANTLR end entryRuleAutomatedProcess


    // $ANTLR start ruleAutomatedProcess
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1181:1: ruleAutomatedProcess returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? ) ;
    public final EObject ruleAutomatedProcess() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_processElements_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1186:6: ( ( (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1187:1: ( (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1187:1: ( (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1187:2: (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1187:2: (lv_description_0= RULE_STRING )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1189:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAutomatedProcess2535); 

                    		createLeafNode(grammarAccess.getAutomatedProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAutomatedProcessRule().getType().getClassifier());
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

            match(input,29,FOLLOW_29_in_ruleAutomatedProcess2553); 

                    createLeafNode(grammarAccess.getAutomatedProcessAccess().getAutomatedProcessKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1211:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1213:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAutomatedProcess2575); 

            		createLeafNode(grammarAccess.getAutomatedProcessAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAutomatedProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,15,FOLLOW_15_in_ruleAutomatedProcess2592); 

                    createLeafNode(grammarAccess.getAutomatedProcessAccess().getUsingKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1235:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1238:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAutomatedProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAutomatedProcess2614); 

            		createLeafNode(grammarAccess.getAutomatedProcessAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1251:2: ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1251:3: 'steps' '[' (lv_processElements_7= ruleUICall )* ']'
                    {
                    match(input,30,FOLLOW_30_in_ruleAutomatedProcess2627); 

                            createLeafNode(grammarAccess.getAutomatedProcessAccess().getStepsKeyword_5_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleAutomatedProcess2636); 

                            createLeafNode(grammarAccess.getAutomatedProcessAccess().getLeftSquareBracketKeyword_5_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1259:1: (lv_processElements_7= ruleUICall )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=39 && LA35_0<=40)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1262:6: lv_processElements_7= ruleUICall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAutomatedProcessAccess().getProcessElementsUICallParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUICall_in_ruleAutomatedProcess2670);
                    	    lv_processElements_7=ruleUICall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAutomatedProcessRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processElements", lv_processElements_7, "UICall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleAutomatedProcess2684); 

                            createLeafNode(grammarAccess.getAutomatedProcessAccess().getRightSquareBracketKeyword_5_3(), null); 
                        

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
    // $ANTLR end ruleAutomatedProcess


    // $ANTLR start entryRuleInteractiveProcess
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1291:1: entryRuleInteractiveProcess returns [EObject current=null] : iv_ruleInteractiveProcess= ruleInteractiveProcess EOF ;
    public final EObject entryRuleInteractiveProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractiveProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1291:60: (iv_ruleInteractiveProcess= ruleInteractiveProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1292:2: iv_ruleInteractiveProcess= ruleInteractiveProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInteractiveProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleInteractiveProcess_in_entryRuleInteractiveProcess2719);
            iv_ruleInteractiveProcess=ruleInteractiveProcess();
            _fsp--;

             current =iv_ruleInteractiveProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiveProcess2729); 

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
    // $ANTLR end entryRuleInteractiveProcess


    // $ANTLR start ruleInteractiveProcess
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1299:1: ruleInteractiveProcess returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? ) ;
    public final EObject ruleInteractiveProcess() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_processElements_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1304:6: ( ( (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1305:1: ( (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1305:1: ( (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1305:2: (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1305:2: (lv_description_0= RULE_STRING )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1307:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInteractiveProcess2776); 

                    		createLeafNode(grammarAccess.getInteractiveProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInteractiveProcessRule().getType().getClassifier());
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

            match(input,31,FOLLOW_31_in_ruleInteractiveProcess2794); 

                    createLeafNode(grammarAccess.getInteractiveProcessAccess().getInteractiveProcessKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1329:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1331:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractiveProcess2816); 

            		createLeafNode(grammarAccess.getInteractiveProcessAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInteractiveProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,15,FOLLOW_15_in_ruleInteractiveProcess2833); 

                    createLeafNode(grammarAccess.getInteractiveProcessAccess().getUsingKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1353:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1356:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInteractiveProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractiveProcess2855); 

            		createLeafNode(grammarAccess.getInteractiveProcessAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1369:2: ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1369:3: 'steps' '[' (lv_processElements_7= ruleUICall )* ']'
                    {
                    match(input,30,FOLLOW_30_in_ruleInteractiveProcess2868); 

                            createLeafNode(grammarAccess.getInteractiveProcessAccess().getStepsKeyword_5_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleInteractiveProcess2877); 

                            createLeafNode(grammarAccess.getInteractiveProcessAccess().getLeftSquareBracketKeyword_5_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1377:1: (lv_processElements_7= ruleUICall )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=39 && LA38_0<=40)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1380:6: lv_processElements_7= ruleUICall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getInteractiveProcessAccess().getProcessElementsUICallParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUICall_in_ruleInteractiveProcess2911);
                    	    lv_processElements_7=ruleUICall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInteractiveProcessRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processElements", lv_processElements_7, "UICall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleInteractiveProcess2925); 

                            createLeafNode(grammarAccess.getInteractiveProcessAccess().getRightSquareBracketKeyword_5_3(), null); 
                        

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
    // $ANTLR end ruleInteractiveProcess


    // $ANTLR start entryRuleFormElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1409:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1409:53: (iv_ruleFormElement= ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1410:2: iv_ruleFormElement= ruleFormElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement2960);
            iv_ruleFormElement=ruleFormElement();
            _fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement2970); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1417:1: ruleFormElement returns [EObject current=null] : ( 'formElement' (lv_references_1= ruleDtoPropertyReference ) 'named' (lv_name_3= RULE_ID ) ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';' ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        Token lv_readonly_5=null;
        EObject lv_references_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1422:6: ( ( 'formElement' (lv_references_1= ruleDtoPropertyReference ) 'named' (lv_name_3= RULE_ID ) ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1423:1: ( 'formElement' (lv_references_1= ruleDtoPropertyReference ) 'named' (lv_name_3= RULE_ID ) ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1423:1: ( 'formElement' (lv_references_1= ruleDtoPropertyReference ) 'named' (lv_name_3= RULE_ID ) ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1423:2: 'formElement' (lv_references_1= ruleDtoPropertyReference ) 'named' (lv_name_3= RULE_ID ) ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )? ';'
            {
            match(input,32,FOLLOW_32_in_ruleFormElement3004); 

                    createLeafNode(grammarAccess.getFormElementAccess().getFormElementKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1427:1: (lv_references_1= ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1430:6: lv_references_1= ruleDtoPropertyReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3038);
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

            match(input,33,FOLLOW_33_in_ruleFormElement3051); 

                    createLeafNode(grammarAccess.getFormElementAccess().getNamedKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1452:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1454:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormElement3073); 

            		createLeafNode(grammarAccess.getFormElementAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormElementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1472:2: ( 'readonly' ( (lv_readonly_5= 'true' ) | 'false' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==16) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1472:3: 'readonly' ( (lv_readonly_5= 'true' ) | 'false' )
                    {
                    match(input,16,FOLLOW_16_in_ruleFormElement3091); 

                            createLeafNode(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1476:1: ( (lv_readonly_5= 'true' ) | 'false' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==17) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==18) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1476:1: ( (lv_readonly_5= 'true' ) | 'false' )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1476:2: (lv_readonly_5= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1476:2: (lv_readonly_5= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1478:6: lv_readonly_5= 'true'
                            {
                            lv_readonly_5=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleFormElement3113); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1498:6: 'false'
                            {
                            match(input,18,FOLLOW_18_in_ruleFormElement3141); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getFalseKeyword_4_1_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleFormElement3153); 

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


    // $ANTLR start entryRuleDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1513:1: entryRuleDialogueCall returns [EObject current=null] : iv_ruleDialogueCall= ruleDialogueCall EOF ;
    public final EObject entryRuleDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1513:54: (iv_ruleDialogueCall= ruleDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1514:2: iv_ruleDialogueCall= ruleDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall3186);
            iv_ruleDialogueCall=ruleDialogueCall();
            _fsp--;

             current =iv_ruleDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogueCall3196); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1521:1: ruleDialogueCall returns [EObject current=null] : ( (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' ) ;
    public final EObject ruleDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_alias_3=null;
        EObject this_DirectDialogueCall_0 = null;

        EObject this_LinkedDialogueCall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1526:6: ( ( (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1527:1: ( (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1527:1: ( (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1527:2: (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1527:2: (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==35) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1527:2: (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1528:5: this_DirectDialogueCall_0= ruleDirectDialogueCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getDirectDialogueCallParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectDialogueCall_in_ruleDialogueCall3244);
                    this_DirectDialogueCall_0=ruleDirectDialogueCall();
                    _fsp--;

                     
                            current = this_DirectDialogueCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1538:5: this_LinkedDialogueCall_1= ruleLinkedDialogueCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getLinkedDialogueCallParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLinkedDialogueCall_in_ruleDialogueCall3271);
                    this_LinkedDialogueCall_1=ruleLinkedDialogueCall();
                    _fsp--;

                     
                            current = this_LinkedDialogueCall_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1546:2: ( 'alias' (lv_alias_3= RULE_ID ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1546:3: 'alias' (lv_alias_3= RULE_ID )
                    {
                    match(input,34,FOLLOW_34_in_ruleDialogueCall3281); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getAliasKeyword_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1550:1: (lv_alias_3= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1552:6: lv_alias_3= RULE_ID
                    {
                    lv_alias_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDialogueCall3303); 

                    		createLeafNode(grammarAccess.getDialogueCallAccess().getAliasIDTerminalRuleCall_1_1_0(), "alias"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDialogueCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "alias", lv_alias_3, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleDialogueCall3322); 

                    createLeafNode(grammarAccess.getDialogueCallAccess().getSemicolonKeyword_2(), null); 
                

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


    // $ANTLR start entryRuleLinkedDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1581:1: entryRuleLinkedDialogueCall returns [EObject current=null] : iv_ruleLinkedDialogueCall= ruleLinkedDialogueCall EOF ;
    public final EObject entryRuleLinkedDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1581:60: (iv_ruleLinkedDialogueCall= ruleLinkedDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1582:2: iv_ruleLinkedDialogueCall= ruleLinkedDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkedDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkedDialogueCall_in_entryRuleLinkedDialogueCall3355);
            iv_ruleLinkedDialogueCall=ruleLinkedDialogueCall();
            _fsp--;

             current =iv_ruleLinkedDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedDialogueCall3365); 

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
    // $ANTLR end entryRuleLinkedDialogueCall


    // $ANTLR start ruleLinkedDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1589:1: ruleLinkedDialogueCall returns [EObject current=null] : ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) ) ;
    public final EObject ruleLinkedDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_link_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1594:6: ( ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1595:1: ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1595:1: ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1595:2: 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID )
            {
            match(input,35,FOLLOW_35_in_ruleLinkedDialogueCall3399); 

                    createLeafNode(grammarAccess.getLinkedDialogueCallAccess().getNavigateKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1599:1: (lv_link_1= ruleLinkRef )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1602:6: lv_link_1= ruleLinkRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkedDialogueCallAccess().getLinkLinkRefParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkRef_in_ruleLinkedDialogueCall3433);
            lv_link_1=ruleLinkRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkedDialogueCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "link", lv_link_1, "LinkRef", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,36,FOLLOW_36_in_ruleLinkedDialogueCall3446); 

                    createLeafNode(grammarAccess.getLinkedDialogueCallAccess().getToKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1624:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1626:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedDialogueCall3468); 

            		createLeafNode(grammarAccess.getLinkedDialogueCallAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkedDialogueCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
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
    // $ANTLR end ruleLinkedDialogueCall


    // $ANTLR start entryRuleDirectDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1651:1: entryRuleDirectDialogueCall returns [EObject current=null] : iv_ruleDirectDialogueCall= ruleDirectDialogueCall EOF ;
    public final EObject entryRuleDirectDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1651:60: (iv_ruleDirectDialogueCall= ruleDirectDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1652:2: iv_ruleDirectDialogueCall= ruleDirectDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectDialogueCall_in_entryRuleDirectDialogueCall3509);
            iv_ruleDirectDialogueCall=ruleDirectDialogueCall();
            _fsp--;

             current =iv_ruleDirectDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDialogueCall3519); 

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
    // $ANTLR end entryRuleDirectDialogueCall


    // $ANTLR start ruleDirectDialogueCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1659:1: ruleDirectDialogueCall returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDirectDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1664:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1665:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1665:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1667:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectDialogueCall3565); 

            		createLeafNode(grammarAccess.getDirectDialogueCallAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDirectDialogueCallRule().getType().getClassifier());
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
    // $ANTLR end ruleDirectDialogueCall


    // $ANTLR start entryRuleProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1692:1: entryRuleProcessCall returns [EObject current=null] : iv_ruleProcessCall= ruleProcessCall EOF ;
    public final EObject entryRuleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1692:53: (iv_ruleProcessCall= ruleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1693:2: iv_ruleProcessCall= ruleProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcessCall_in_entryRuleProcessCall3605);
            iv_ruleProcessCall=ruleProcessCall();
            _fsp--;

             current =iv_ruleProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessCall3615); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1700:1: ruleProcessCall returns [EObject current=null] : ( (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' ) ;
    public final EObject ruleProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_alias_3=null;
        EObject this_DirectProcessCall_0 = null;

        EObject this_LinkedProcessCall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1705:6: ( ( (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1706:1: ( (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1706:1: ( (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1706:2: (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1706:2: (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==35) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1706:2: (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1707:5: this_DirectProcessCall_0= ruleDirectProcessCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getDirectProcessCallParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectProcessCall_in_ruleProcessCall3663);
                    this_DirectProcessCall_0=ruleDirectProcessCall();
                    _fsp--;

                     
                            current = this_DirectProcessCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1717:5: this_LinkedProcessCall_1= ruleLinkedProcessCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getLinkedProcessCallParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLinkedProcessCall_in_ruleProcessCall3690);
                    this_LinkedProcessCall_1=ruleLinkedProcessCall();
                    _fsp--;

                     
                            current = this_LinkedProcessCall_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1725:2: ( 'alias' (lv_alias_3= RULE_ID ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1725:3: 'alias' (lv_alias_3= RULE_ID )
                    {
                    match(input,34,FOLLOW_34_in_ruleProcessCall3700); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getAliasKeyword_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1729:1: (lv_alias_3= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1731:6: lv_alias_3= RULE_ID
                    {
                    lv_alias_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall3722); 

                    		createLeafNode(grammarAccess.getProcessCallAccess().getAliasIDTerminalRuleCall_1_1_0(), "alias"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "alias", lv_alias_3, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleProcessCall3741); 

                    createLeafNode(grammarAccess.getProcessCallAccess().getSemicolonKeyword_2(), null); 
                

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


    // $ANTLR start entryRuleLinkedProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1760:1: entryRuleLinkedProcessCall returns [EObject current=null] : iv_ruleLinkedProcessCall= ruleLinkedProcessCall EOF ;
    public final EObject entryRuleLinkedProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1760:59: (iv_ruleLinkedProcessCall= ruleLinkedProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1761:2: iv_ruleLinkedProcessCall= ruleLinkedProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkedProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkedProcessCall_in_entryRuleLinkedProcessCall3774);
            iv_ruleLinkedProcessCall=ruleLinkedProcessCall();
            _fsp--;

             current =iv_ruleLinkedProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedProcessCall3784); 

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
    // $ANTLR end entryRuleLinkedProcessCall


    // $ANTLR start ruleLinkedProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1768:1: ruleLinkedProcessCall returns [EObject current=null] : ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) ) ;
    public final EObject ruleLinkedProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_link_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1773:6: ( ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1774:1: ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1774:1: ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1774:2: 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID )
            {
            match(input,35,FOLLOW_35_in_ruleLinkedProcessCall3818); 

                    createLeafNode(grammarAccess.getLinkedProcessCallAccess().getNavigateKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1778:1: (lv_link_1= ruleLinkRef )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1781:6: lv_link_1= ruleLinkRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkedProcessCallAccess().getLinkLinkRefParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkRef_in_ruleLinkedProcessCall3852);
            lv_link_1=ruleLinkRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkedProcessCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "link", lv_link_1, "LinkRef", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,36,FOLLOW_36_in_ruleLinkedProcessCall3865); 

                    createLeafNode(grammarAccess.getLinkedProcessCallAccess().getToKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1803:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1805:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedProcessCall3887); 

            		createLeafNode(grammarAccess.getLinkedProcessCallAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkedProcessCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
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
    // $ANTLR end ruleLinkedProcessCall


    // $ANTLR start entryRuleDirectProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1830:1: entryRuleDirectProcessCall returns [EObject current=null] : iv_ruleDirectProcessCall= ruleDirectProcessCall EOF ;
    public final EObject entryRuleDirectProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1830:59: (iv_ruleDirectProcessCall= ruleDirectProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1831:2: iv_ruleDirectProcessCall= ruleDirectProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectProcessCall_in_entryRuleDirectProcessCall3928);
            iv_ruleDirectProcessCall=ruleDirectProcessCall();
            _fsp--;

             current =iv_ruleDirectProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectProcessCall3938); 

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
    // $ANTLR end entryRuleDirectProcessCall


    // $ANTLR start ruleDirectProcessCall
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1838:1: ruleDirectProcessCall returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDirectProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1843:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1844:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1844:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1846:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectProcessCall3984); 

            		createLeafNode(grammarAccess.getDirectProcessCallAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDirectProcessCallRule().getType().getClassifier());
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
    // $ANTLR end ruleDirectProcessCall


    // $ANTLR start entryRuleLinkRef
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1871:1: entryRuleLinkRef returns [EObject current=null] : iv_ruleLinkRef= ruleLinkRef EOF ;
    public final EObject entryRuleLinkRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkRef = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1871:49: (iv_ruleLinkRef= ruleLinkRef EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1872:2: iv_ruleLinkRef= ruleLinkRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkRef_in_entryRuleLinkRef4024);
            iv_ruleLinkRef=ruleLinkRef();
            _fsp--;

             current =iv_ruleLinkRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkRef4034); 

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
    // $ANTLR end entryRuleLinkRef


    // $ANTLR start ruleLinkRef
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1879:1: ruleLinkRef returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleLinkRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1884:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1885:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1885:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1887:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkRef4080); 

            		createLeafNode(grammarAccess.getLinkRefAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRefRule().getType().getClassifier());
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
    // $ANTLR end ruleLinkRef


    // $ANTLR start entryRuleLink
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1912:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1912:46: (iv_ruleLink= ruleLink EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1913:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink4120);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink4130); 

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
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1920:1: ruleLink returns [EObject current=null] : (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_LinkStep_0 = null;

        EObject this_LinkPath_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1925:6: ( (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1926:1: (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1926:1: (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath )
            int alt46=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==38) ) {
                    alt46=2;
                }
                else if ( (LA46_1==37) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1926:1: (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath )", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt46=1;
                }
                break;
            case 38:
                {
                alt46=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1926:1: (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1927:5: this_LinkStep_0= ruleLinkStep
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getLinkStepParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLinkStep_in_ruleLink4177);
                    this_LinkStep_0=ruleLinkStep();
                    _fsp--;

                     
                            current = this_LinkStep_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1937:5: this_LinkPath_1= ruleLinkPath
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getLinkPathParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLinkPath_in_ruleLink4204);
                    this_LinkPath_1=ruleLinkPath();
                    _fsp--;

                     
                            current = this_LinkPath_1; 
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
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleLinkStep
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1952:1: entryRuleLinkStep returns [EObject current=null] : iv_ruleLinkStep= ruleLinkStep EOF ;
    public final EObject entryRuleLinkStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkStep = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1952:50: (iv_ruleLinkStep= ruleLinkStep EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1953:2: iv_ruleLinkStep= ruleLinkStep EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkStepRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkStep_in_entryRuleLinkStep4236);
            iv_ruleLinkStep=ruleLinkStep();
            _fsp--;

             current =iv_ruleLinkStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkStep4246); 

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
    // $ANTLR end entryRuleLinkStep


    // $ANTLR start ruleLinkStep
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1960:1: ruleLinkStep returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference ) ) ;
    public final EObject ruleLinkStep() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_reference_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1965:6: ( ( (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1966:1: ( (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1966:1: ( (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1966:2: (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1966:2: (lv_description_0= RULE_STRING )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1968:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLinkStep4293); 

                    		createLeafNode(grammarAccess.getLinkStepAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkStepRule().getType().getClassifier());
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

            match(input,37,FOLLOW_37_in_ruleLinkStep4311); 

                    createLeafNode(grammarAccess.getLinkStepAccess().getLinkStepKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1990:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1992:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkStep4333); 

            		createLeafNode(grammarAccess.getLinkStepAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkStepRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,15,FOLLOW_15_in_ruleLinkStep4350); 

                    createLeafNode(grammarAccess.getLinkStepAccess().getUsingKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2014:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2017:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkStepRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkStep4372); 

            		createLeafNode(grammarAccess.getLinkStepAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            match(input,35,FOLLOW_35_in_ruleLinkStep4384); 

                    createLeafNode(grammarAccess.getLinkStepAccess().getNavigateKeyword_5(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:1: (lv_reference_6= ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2037:6: lv_reference_6= ruleAssociationRoleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkStepAccess().getReferenceAssociationRoleReferenceParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleLinkStep4418);
            lv_reference_6=ruleAssociationRoleReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkStepRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "reference", lv_reference_6, "AssociationRoleReference", currentNode);
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
    // $ANTLR end ruleLinkStep


    // $ANTLR start entryRuleLinkPath
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2062:1: entryRuleLinkPath returns [EObject current=null] : iv_ruleLinkPath= ruleLinkPath EOF ;
    public final EObject entryRuleLinkPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkPath = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2062:50: (iv_ruleLinkPath= ruleLinkPath EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2063:2: iv_ruleLinkPath= ruleLinkPath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkPathRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkPath_in_entryRuleLinkPath4455);
            iv_ruleLinkPath=ruleLinkPath();
            _fsp--;

             current =iv_ruleLinkPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkPath4465); 

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
    // $ANTLR end entryRuleLinkPath


    // $ANTLR start ruleLinkPath
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2070:1: ruleLinkPath returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ) ;
    public final EObject ruleLinkPath() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2075:6: ( ( (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2076:1: ( (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2076:1: ( (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'using' ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2076:2: (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'using' ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2076:2: (lv_description_0= RULE_STRING )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2078:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLinkPath4512); 

                    		createLeafNode(grammarAccess.getLinkPathAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkPathRule().getType().getClassifier());
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

            match(input,38,FOLLOW_38_in_ruleLinkPath4530); 

                    createLeafNode(grammarAccess.getLinkPathAccess().getLinkPathKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2100:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2102:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkPath4552); 

            		createLeafNode(grammarAccess.getLinkPathAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkPathRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,15,FOLLOW_15_in_ruleLinkPath4569); 

                    createLeafNode(grammarAccess.getLinkPathAccess().getUsingKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2124:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2127:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkPathRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkPath4591); 

            		createLeafNode(grammarAccess.getLinkPathAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

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
    // $ANTLR end ruleLinkPath


    // $ANTLR start entryRuleDtoPropertyReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2147:1: entryRuleDtoPropertyReference returns [EObject current=null] : iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF ;
    public final EObject entryRuleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoPropertyReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2147:62: (iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2148:2: iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference4627);
            iv_ruleDtoPropertyReference=ruleDtoPropertyReference();
            _fsp--;

             current =iv_ruleDtoPropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference4637); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2155:1: ruleDtoPropertyReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2160:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2161:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2161:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2163:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoPropertyReference4683); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2188:1: entryRuleAssociationRoleReference returns [EObject current=null] : iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF ;
    public final EObject entryRuleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationRoleReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2188:66: (iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2189:2: iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRoleReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference4723);
            iv_ruleAssociationRoleReference=ruleAssociationRoleReference();
            _fsp--;

             current =iv_ruleAssociationRoleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference4733); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2196:1: ruleAssociationRoleReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2201:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2202:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2202:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2204:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationRoleReference4779); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2229:1: entryRuleUICall returns [EObject current=null] : iv_ruleUICall= ruleUICall EOF ;
    public final EObject entryRuleUICall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUICall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2229:48: (iv_ruleUICall= ruleUICall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2230:2: iv_ruleUICall= ruleUICall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUICallRule(), currentNode); 
            pushFollow(FOLLOW_ruleUICall_in_entryRuleUICall4819);
            iv_ruleUICall=ruleUICall();
            _fsp--;

             current =iv_ruleUICall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUICall4829); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2237:1: ruleUICall returns [EObject current=null] : this_UIModelElementCall_0= ruleUIModelElementCall ;
    public final EObject ruleUICall() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElementCall_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2242:6: (this_UIModelElementCall_0= ruleUIModelElementCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2244:5: this_UIModelElementCall_0= ruleUIModelElementCall
            {
             
                    currentNode=createCompositeNode(grammarAccess.getUICallAccess().getUIModelElementCallParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleUIModelElementCall_in_ruleUICall4875);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2259:1: entryRuleUIModelElementCall returns [EObject current=null] : iv_ruleUIModelElementCall= ruleUIModelElementCall EOF ;
    public final EObject entryRuleUIModelElementCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElementCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2259:60: (iv_ruleUIModelElementCall= ruleUIModelElementCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2260:2: iv_ruleUIModelElementCall= ruleUIModelElementCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall4906);
            iv_ruleUIModelElementCall=ruleUIModelElementCall();
            _fsp--;

             current =iv_ruleUIModelElementCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElementCall4916); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2267:1: ruleUIModelElementCall returns [EObject current=null] : ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) ) ;
    public final EObject ruleUIModelElementCall() throws RecognitionException {
        EObject current = null;

        EObject this_DialogueCall_1 = null;

        EObject this_ProcessCall_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2272:6: ( ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2273:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2273:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            else if ( (LA49_0==40) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2273:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2273:2: ( 'dialogue' this_DialogueCall_1= ruleDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2273:2: ( 'dialogue' this_DialogueCall_1= ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2273:3: 'dialogue' this_DialogueCall_1= ruleDialogueCall
                    {
                    match(input,39,FOLLOW_39_in_ruleUIModelElementCall4951); 

                            createLeafNode(grammarAccess.getUIModelElementCallAccess().getDialogueKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogueCall_in_ruleUIModelElementCall4973);
                    this_DialogueCall_1=ruleDialogueCall();
                    _fsp--;

                     
                            current = this_DialogueCall_1; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2287:6: ( 'process' this_ProcessCall_3= ruleProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2287:6: ( 'process' this_ProcessCall_3= ruleProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2287:7: 'process' this_ProcessCall_3= ruleProcessCall
                    {
                    match(input,40,FOLLOW_40_in_ruleUIModelElementCall4989); 

                            createLeafNode(grammarAccess.getUIModelElementCallAccess().getProcessKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcessCall_in_ruleUIModelElementCall5011);
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


 

    public static final BitSet FOLLOW_rulePresentationModel_in_entryRulePresentationModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentationModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePresentationModel130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePresentationModel148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePresentationModel170 = new BitSet(new long[]{0x00000060A6805012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rulePresentationModel212 = new BitSet(new long[]{0x00000060A6805012L});
    public static final BitSet FOLLOW_ruleModelElement_in_rulePresentationModel251 = new BitSet(new long[]{0x00000060A6804012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference355 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExternalReference372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElement492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleModelElement519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_ruleUIModelElement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleUIModelElement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_entryRuleDialogue667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogue677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_ruleDialogue724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_ruleDialogue751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_entryRuleContentForm783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentForm793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContentForm840 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContentForm858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm880 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContentForm897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm919 = new BitSet(new long[]{0x0000000100110002L});
    public static final BitSet FOLLOW_16_in_ruleContentForm932 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleContentForm954 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleContentForm982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContentForm992 = new BitSet(new long[]{0x0000000100100002L});
    public static final BitSet FOLLOW_ruleFormElement_in_ruleContentForm1028 = new BitSet(new long[]{0x0000000100100002L});
    public static final BitSet FOLLOW_20_in_ruleContentForm1043 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleContentForm1052 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleContentForm1086 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleContentForm1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue1135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundDialogue1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompoundDialogue1193 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCompoundDialogue1211 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue1233 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompoundDialogue1250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue1272 = new BitSet(new long[]{0x0000000001110002L});
    public static final BitSet FOLLOW_16_in_ruleCompoundDialogue1285 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCompoundDialogue1307 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleCompoundDialogue1335 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCompoundDialogue1345 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_ruleCompoundDialogue1357 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCompoundDialogue1366 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue1400 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleCompoundDialogue1414 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleCompoundDialogue1426 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCompoundDialogue1435 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCompoundDialogue1469 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleCompoundDialogue1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionDialogue1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollectionDialogue1630 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCollectionDialogue1648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue1670 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCollectionDialogue1687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue1709 = new BitSet(new long[]{0x0000000001110002L});
    public static final BitSet FOLLOW_16_in_ruleCollectionDialogue1722 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue1744 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleCollectionDialogue1772 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollectionDialogue1782 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_ruleCollectionDialogue1794 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCollectionDialogue1803 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue1837 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleCollectionDialogue1851 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleCollectionDialogue1863 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCollectionDialogue1872 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCollectionDialogue1906 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleCollectionDialogue1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail1955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterDetail1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMasterDetail2012 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMasterDetail2030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail2052 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMasterDetail2069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail2091 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_16_in_ruleMasterDetail2104 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleMasterDetail2126 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleMasterDetail2154 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMasterDetail2164 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMasterDetail2175 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail2209 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMasterDetail2222 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail2256 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleMasterDetail2270 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMasterDetail2279 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleMasterDetail2313 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleMasterDetail2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess2362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomatedProcess_in_ruleProcess2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiveProcess_in_ruleProcess2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomatedProcess_in_entryRuleAutomatedProcess2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutomatedProcess2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAutomatedProcess2535 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAutomatedProcess2553 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomatedProcess2575 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAutomatedProcess2592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomatedProcess2614 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAutomatedProcess2627 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAutomatedProcess2636 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_ruleUICall_in_ruleAutomatedProcess2670 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_22_in_ruleAutomatedProcess2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiveProcess_in_entryRuleInteractiveProcess2719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiveProcess2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInteractiveProcess2776 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInteractiveProcess2794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractiveProcess2816 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInteractiveProcess2833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractiveProcess2855 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleInteractiveProcess2868 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInteractiveProcess2877 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_ruleUICall_in_ruleInteractiveProcess2911 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_22_in_ruleInteractiveProcess2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement2960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFormElement3004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3038 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFormElement3051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormElement3073 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleFormElement3091 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFormElement3113 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleFormElement3141 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFormElement3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall3186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogueCall3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDialogueCall_in_ruleDialogueCall3244 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_ruleLinkedDialogueCall_in_ruleDialogueCall3271 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_34_in_ruleDialogueCall3281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDialogueCall3303 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDialogueCall3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedDialogueCall_in_entryRuleLinkedDialogueCall3355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedDialogueCall3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLinkedDialogueCall3399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLinkRef_in_ruleLinkedDialogueCall3433 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleLinkedDialogueCall3446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedDialogueCall3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDialogueCall_in_entryRuleDirectDialogueCall3509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDialogueCall3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDialogueCall3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_entryRuleProcessCall3605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessCall3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectProcessCall_in_ruleProcessCall3663 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_ruleLinkedProcessCall_in_ruleProcessCall3690 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_34_in_ruleProcessCall3700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall3722 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleProcessCall3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedProcessCall_in_entryRuleLinkedProcessCall3774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedProcessCall3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLinkedProcessCall3818 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLinkRef_in_ruleLinkedProcessCall3852 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleLinkedProcessCall3865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedProcessCall3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectProcessCall_in_entryRuleDirectProcessCall3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectProcessCall3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectProcessCall3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkRef_in_entryRuleLinkRef4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkRef4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkRef4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink4120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkStep_in_ruleLink4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkPath_in_ruleLink4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkStep_in_entryRuleLinkStep4236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkStep4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkStep4293 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLinkStep4311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkStep4333 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLinkStep4350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkStep4372 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleLinkStep4384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleLinkStep4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkPath_in_entryRuleLinkPath4455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkPath4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkPath4512 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLinkPath4530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkPath4552 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLinkPath4569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkPath4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference4627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoPropertyReference4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference4723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationRoleReference4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_entryRuleUICall4819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUICall4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_ruleUICall4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall4906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElementCall4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUIModelElementCall4951 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleUIModelElementCall4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleUIModelElementCall4989 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleUIModelElementCall5011 = new BitSet(new long[]{0x0000000000000002L});

}