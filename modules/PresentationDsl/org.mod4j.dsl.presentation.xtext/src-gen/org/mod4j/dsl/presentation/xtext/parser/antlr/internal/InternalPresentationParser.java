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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'presentation'", "';'", "'from'", "'import'", "'ContentForm'", "'context'", "'['", "'readonly'", "'true'", "'false'", "'processes'", "']'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'AutomatedProcess'", "'steps'", "'InteractiveProcess'", "'element'", "'label'", "'alias'", "'navigate'", "'to'", "'LinkStep'", "'LinkPath'", "'dialogue'", "'process'"
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:80:1: rulePresentationModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* ) ;
    public final EObject rulePresentationModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_elements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:85:6: ( ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:86:2: (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_elements_5= ruleModelElementWithContext )*
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

                    createLeafNode(grammarAccess.getPresentationModelAccess().getPresentationKeyword_1(), null); 
                
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

            match(input,12,FOLLOW_12_in_rulePresentationModel187); 

                    createLeafNode(grammarAccess.getPresentationModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:134:1: (lv_externalReferences_4= ruleExternalReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:137:6: lv_externalReferences_4= ruleExternalReference
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:155:3: (lv_elements_5= ruleModelElementWithContext )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==15||LA3_0==23||(LA3_0>=25 && LA3_0<=26)||LA3_0==29||LA3_0==31||(LA3_0>=37 && LA3_0<=38)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:158:6: lv_elements_5= ruleModelElementWithContext
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:183:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:183:59: (iv_ruleExternalReference= ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:184:2: iv_ruleExternalReference= ruleExternalReference EOF
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:191:1: ruleExternalReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:196:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:197:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:197:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:197:2: 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleExternalReference342); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:201:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:203:6: lv_modelName_1= RULE_ID
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
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:225:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:227:6: lv_name_3= RULE_ID
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:256:1: entryRuleModelElementWithContext returns [EObject current=null] : iv_ruleModelElementWithContext= ruleModelElementWithContext EOF ;
    public final EObject entryRuleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementWithContext = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:256:65: (iv_ruleModelElementWithContext= ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:257:2: iv_ruleModelElementWithContext= ruleModelElementWithContext EOF
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:264:1: ruleModelElementWithContext returns [EObject current=null] : (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink ) ;
    public final EObject ruleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElement_0 = null;

        EObject this_Link_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:269:6: ( (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:270:1: (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:270:1: (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=37 && LA4_1<=38)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==15||LA4_1==23||(LA4_1>=25 && LA4_1<=26)||LA4_1==29||LA4_1==31) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("270:1: (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink )", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
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
                    new NoViableAltException("270:1: (this_UIModelElement_0= ruleUIModelElement | this_Link_1= ruleLink )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:271:5: this_UIModelElement_0= ruleUIModelElement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext510);
                    this_UIModelElement_0=ruleUIModelElement();
                    _fsp--;

                     
                            current = this_UIModelElement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:281:5: this_Link_1= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModelElementWithContextAccess().getLinkParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleModelElementWithContext537);
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
    // $ANTLR end ruleModelElementWithContext


    // $ANTLR start entryRuleUIModelElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:296:1: entryRuleUIModelElement returns [EObject current=null] : iv_ruleUIModelElement= ruleUIModelElement EOF ;
    public final EObject entryRuleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:296:56: (iv_ruleUIModelElement= ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:297:2: iv_ruleUIModelElement= ruleUIModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement569);
            iv_ruleUIModelElement=ruleUIModelElement();
            _fsp--;

             current =iv_ruleUIModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement579); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:304:1: ruleUIModelElement returns [EObject current=null] : (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) ;
    public final EObject ruleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Dialogue_0 = null;

        EObject this_Process_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:309:6: ( (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:310:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:310:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==15||LA5_1==23||(LA5_1>=25 && LA5_1<=26)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==29||LA5_1==31) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("310:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
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
                    new NoViableAltException("310:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:311:5: this_Dialogue_0= ruleDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogue_in_ruleUIModelElement626);
                    this_Dialogue_0=ruleDialogue();
                    _fsp--;

                     
                            current = this_Dialogue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:321:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleUIModelElement653);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:336:1: entryRuleDialogue returns [EObject current=null] : iv_ruleDialogue= ruleDialogue EOF ;
    public final EObject entryRuleDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:336:50: (iv_ruleDialogue= ruleDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:337:2: iv_ruleDialogue= ruleDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogue_in_entryRuleDialogue685);
            iv_ruleDialogue=ruleDialogue();
            _fsp--;

             current =iv_ruleDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogue695); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:344:1: ruleDialogue returns [EObject current=null] : (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) ;
    public final EObject ruleDialogue() throws RecognitionException {
        EObject current = null;

        EObject this_ContentForm_0 = null;

        EObject this_CompoundDialogue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:349:6: ( (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:350:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:350:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==23||(LA6_1>=25 && LA6_1<=26)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==15) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("350:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
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
                    new NoViableAltException("350:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:351:5: this_ContentForm_0= ruleContentForm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentForm_in_ruleDialogue742);
                    this_ContentForm_0=ruleContentForm();
                    _fsp--;

                     
                            current = this_ContentForm_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:361:5: this_CompoundDialogue_1= ruleCompoundDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_ruleDialogue769);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:376:1: entryRuleContentForm returns [EObject current=null] : iv_ruleContentForm= ruleContentForm EOF ;
    public final EObject entryRuleContentForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentForm = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:376:53: (iv_ruleContentForm= ruleContentForm EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:377:2: iv_ruleContentForm= ruleContentForm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentFormRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentForm_in_entryRuleContentForm801);
            iv_ruleContentForm=ruleContentForm();
            _fsp--;

             current =iv_ruleContentForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentForm811); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:384:1: ruleContentForm returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? (lv_formElements_10= ruleFormElement )* ( 'processes' '[' (lv_processes_13= ruleProcessCall )* ']' )? ']' ) ;
    public final EObject ruleContentForm() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_7=null;
        EObject lv_formElements_10 = null;

        EObject lv_processes_13 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:389:6: ( ( (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? (lv_formElements_10= ruleFormElement )* ( 'processes' '[' (lv_processes_13= ruleProcessCall )* ']' )? ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:390:1: ( (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? (lv_formElements_10= ruleFormElement )* ( 'processes' '[' (lv_processes_13= ruleProcessCall )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:390:1: ( (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? (lv_formElements_10= ruleFormElement )* ( 'processes' '[' (lv_processes_13= ruleProcessCall )* ']' )? ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:390:2: (lv_description_0= RULE_STRING )? 'ContentForm' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? (lv_formElements_10= ruleFormElement )* ( 'processes' '[' (lv_processes_13= ruleProcessCall )* ']' )? ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:390:2: (lv_description_0= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:392:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContentForm858); 

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

            match(input,15,FOLLOW_15_in_ruleContentForm876); 

                    createLeafNode(grammarAccess.getContentFormAccess().getContentFormKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:414:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:416:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm898); 

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

            match(input,16,FOLLOW_16_in_ruleContentForm915); 

                    createLeafNode(grammarAccess.getContentFormAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:438:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:441:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm937); 

            		createLeafNode(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            match(input,17,FOLLOW_17_in_ruleContentForm949); 

                    createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:458:1: ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:458:2: 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';'
                    {
                    match(input,18,FOLLOW_18_in_ruleContentForm959); 

                            createLeafNode(grammarAccess.getContentFormAccess().getReadonlyKeyword_6_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:462:1: ( (lv_readonly_7= 'true' ) | 'false' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==20) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("462:1: ( (lv_readonly_7= 'true' ) | 'false' )", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:462:2: (lv_readonly_7= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:462:2: (lv_readonly_7= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:464:6: lv_readonly_7= 'true'
                            {
                            lv_readonly_7=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleContentForm981); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:484:6: 'false'
                            {
                            match(input,20,FOLLOW_20_in_ruleContentForm1009); 

                                    createLeafNode(grammarAccess.getContentFormAccess().getFalseKeyword_6_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleContentForm1019); 

                            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_6_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:492:3: (lv_formElements_10= ruleFormElement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:495:6: lv_formElements_10= ruleFormElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormElement_in_ruleContentForm1055);
            	    lv_formElements_10=ruleFormElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "formElements", lv_formElements_10, "FormElement", currentNode);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:513:3: ( 'processes' '[' (lv_processes_13= ruleProcessCall )* ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:513:4: 'processes' '[' (lv_processes_13= ruleProcessCall )* ']'
                    {
                    match(input,21,FOLLOW_21_in_ruleContentForm1070); 

                            createLeafNode(grammarAccess.getContentFormAccess().getProcessesKeyword_8_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleContentForm1079); 

                            createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_8_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:521:1: (lv_processes_13= ruleProcessCall )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==35) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:524:6: lv_processes_13= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getProcessesProcessCallParserRuleCall_8_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleContentForm1113);
                    	    lv_processes_13=ruleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_13, "ProcessCall", currentNode);
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

                    match(input,22,FOLLOW_22_in_ruleContentForm1127); 

                            createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_8_3(), null); 
                        

                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleContentForm1138); 

                    createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9(), null); 
                

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:557:1: entryRuleCompoundDialogue returns [EObject current=null] : iv_ruleCompoundDialogue= ruleCompoundDialogue EOF ;
    public final EObject entryRuleCompoundDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:557:58: (iv_ruleCompoundDialogue= ruleCompoundDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:558:2: iv_ruleCompoundDialogue= ruleCompoundDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue1171);
            iv_ruleCompoundDialogue=ruleCompoundDialogue();
            _fsp--;

             current =iv_ruleCompoundDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundDialogue1181); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:565:1: ruleCompoundDialogue returns [EObject current=null] : ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail ) ;
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:570:6: ( ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
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
                        new NoViableAltException("571:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail )", 20, 1, input);

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
                    new NoViableAltException("571:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) | this_CollectionDialogue_17= ruleCollectionDialogue | this_MasterDetail_18= ruleMasterDetail )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:3: (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:571:3: (lv_description_0= RULE_STRING )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:573:6: lv_description_0= RULE_STRING
                            {
                            lv_description_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompoundDialogue1229); 

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

                    match(input,23,FOLLOW_23_in_ruleCompoundDialogue1247); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:595:1: (lv_name_2= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:597:6: lv_name_2= RULE_ID
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue1269); 

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

                    match(input,16,FOLLOW_16_in_ruleCompoundDialogue1286); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:619:1: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:622:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue1308); 

                    		createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0(), "contextRef"); 
                    	

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:635:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==18) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:635:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                            {
                            match(input,18,FOLLOW_18_in_ruleCompoundDialogue1321); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:639:1: ( (lv_readonly_6= 'true' ) | 'false' )
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==19) ) {
                                alt14=1;
                            }
                            else if ( (LA14_0==20) ) {
                                alt14=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("639:1: ( (lv_readonly_6= 'true' ) | 'false' )", 14, 0, input);

                                throw nvae;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:639:2: (lv_readonly_6= 'true' )
                                    {
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:639:2: (lv_readonly_6= 'true' )
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:641:6: lv_readonly_6= 'true'
                                    {
                                    lv_readonly_6=(Token)input.LT(1);
                                    match(input,19,FOLLOW_19_in_ruleCompoundDialogue1343); 

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
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:661:6: 'false'
                                    {
                                    match(input,20,FOLLOW_20_in_ruleCompoundDialogue1371); 

                                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1(), null); 
                                        

                                    }
                                    break;

                            }

                            match(input,12,FOLLOW_12_in_ruleCompoundDialogue1381); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:669:3: ( 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:669:4: 'dialogues' '[' (lv_dialogues_11= ruleDialogueCall )* ']'
                            {
                            match(input,24,FOLLOW_24_in_ruleCompoundDialogue1393); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0(), null); 
                                
                            match(input,17,FOLLOW_17_in_ruleCompoundDialogue1402); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:677:1: (lv_dialogues_11= ruleDialogueCall )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==RULE_ID||LA16_0==35) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:680:6: lv_dialogues_11= ruleDialogueCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue1436);
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

                            match(input,22,FOLLOW_22_in_ruleCompoundDialogue1450); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:702:3: ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==21) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:702:4: 'processes' '[' (lv_processes_15= ruleProcessCall )* ']'
                            {
                            match(input,21,FOLLOW_21_in_ruleCompoundDialogue1462); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0(), null); 
                                
                            match(input,17,FOLLOW_17_in_ruleCompoundDialogue1471); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:710:1: (lv_processes_15= ruleProcessCall )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_ID||LA18_0==35) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:713:6: lv_processes_15= ruleProcessCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCompoundDialogue1505);
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

                            match(input,22,FOLLOW_22_in_ruleCompoundDialogue1519); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:737:5: this_CollectionDialogue_17= ruleCollectionDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue1550);
                    this_CollectionDialogue_17=ruleCollectionDialogue();
                    _fsp--;

                     
                            current = this_CollectionDialogue_17; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:747:5: this_MasterDetail_18= ruleMasterDetail
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue1577);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:762:1: entryRuleCollectionDialogue returns [EObject current=null] : iv_ruleCollectionDialogue= ruleCollectionDialogue EOF ;
    public final EObject entryRuleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:762:60: (iv_ruleCollectionDialogue= ruleCollectionDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:763:2: iv_ruleCollectionDialogue= ruleCollectionDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue1609);
            iv_ruleCollectionDialogue=ruleCollectionDialogue();
            _fsp--;

             current =iv_ruleCollectionDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionDialogue1619); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:770:1: ruleCollectionDialogue returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_12= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_16= ruleProcessCall )* ']' )? ']' ) ;
    public final EObject ruleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_7=null;
        EObject lv_dialogues_12 = null;

        EObject lv_processes_16 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:775:6: ( ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_12= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_16= ruleProcessCall )* ']' )? ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:776:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_12= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_16= ruleProcessCall )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:776:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_12= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_16= ruleProcessCall )* ']' )? ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:776:2: (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' (lv_dialogues_12= ruleDialogueCall )* ']' )? ( 'processes' '[' (lv_processes_16= ruleProcessCall )* ']' )? ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:776:2: (lv_description_0= RULE_STRING )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:778:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollectionDialogue1666); 

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

            match(input,25,FOLLOW_25_in_ruleCollectionDialogue1684); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:800:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:802:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue1706); 

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

            match(input,16,FOLLOW_16_in_ruleCollectionDialogue1723); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:824:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:827:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue1745); 

            		createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            match(input,17,FOLLOW_17_in_ruleCollectionDialogue1757); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:844:1: ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:844:2: 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';'
                    {
                    match(input,18,FOLLOW_18_in_ruleCollectionDialogue1767); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:848:1: ( (lv_readonly_7= 'true' ) | 'false' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==19) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==20) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("848:1: ( (lv_readonly_7= 'true' ) | 'false' )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:848:2: (lv_readonly_7= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:848:2: (lv_readonly_7= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:850:6: lv_readonly_7= 'true'
                            {
                            lv_readonly_7=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleCollectionDialogue1789); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:870:6: 'false'
                            {
                            match(input,20,FOLLOW_20_in_ruleCollectionDialogue1817); 

                                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleCollectionDialogue1827); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:878:3: ( 'dialogues' '[' (lv_dialogues_12= ruleDialogueCall )* ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:878:4: 'dialogues' '[' (lv_dialogues_12= ruleDialogueCall )* ']'
                    {
                    match(input,24,FOLLOW_24_in_ruleCollectionDialogue1839); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleCollectionDialogue1848); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:886:1: (lv_dialogues_12= ruleDialogueCall )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==35) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:889:6: lv_dialogues_12= ruleDialogueCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue1882);
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
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleCollectionDialogue1896); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:911:3: ( 'processes' '[' (lv_processes_16= ruleProcessCall )* ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:911:4: 'processes' '[' (lv_processes_16= ruleProcessCall )* ']'
                    {
                    match(input,21,FOLLOW_21_in_ruleCollectionDialogue1908); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleCollectionDialogue1917); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:919:1: (lv_processes_16= ruleProcessCall )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID||LA26_0==35) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:922:6: lv_processes_16= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCollectionDialogue1951);
                    	    lv_processes_16=ruleProcessCall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processes", lv_processes_16, "ProcessCall", currentNode);
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

                    match(input,22,FOLLOW_22_in_ruleCollectionDialogue1965); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3(), null); 
                        

                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleCollectionDialogue1976); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:955:1: entryRuleMasterDetail returns [EObject current=null] : iv_ruleMasterDetail= ruleMasterDetail EOF ;
    public final EObject entryRuleMasterDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMasterDetail = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:955:54: (iv_ruleMasterDetail= ruleMasterDetail EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:956:2: iv_ruleMasterDetail= ruleMasterDetail EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMasterDetailRule(), currentNode); 
            pushFollow(FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail2009);
            iv_ruleMasterDetail=ruleMasterDetail();
            _fsp--;

             current =iv_ruleMasterDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterDetail2019); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:963:1: ruleMasterDetail returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) ;
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:968:6: ( ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:969:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:969:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:969:2: (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) 'detail' (lv_detail_12= ruleDialogueCall ) ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:969:2: (lv_description_0= RULE_STRING )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:971:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMasterDetail2066); 

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

            match(input,26,FOLLOW_26_in_ruleMasterDetail2084); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:993:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:995:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail2106); 

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

            match(input,16,FOLLOW_16_in_ruleMasterDetail2123); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1017:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1020:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail2145); 

            		createLeafNode(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1033:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1033:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                    {
                    match(input,18,FOLLOW_18_in_ruleMasterDetail2158); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1037:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==19) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==20) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1037:1: ( (lv_readonly_6= 'true' ) | 'false' )", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1037:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1037:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1039:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleMasterDetail2180); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1059:6: 'false'
                            {
                            match(input,20,FOLLOW_20_in_ruleMasterDetail2208); 

                                    createLeafNode(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleMasterDetail2218); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2(), null); 
                        

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleMasterDetail2229); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterKeyword_6(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1071:1: (lv_master_10= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1074:6: lv_master_10= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail2263);
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

            match(input,28,FOLLOW_28_in_ruleMasterDetail2276); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getDetailKeyword_8(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1096:1: (lv_detail_12= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1099:6: lv_detail_12= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_9_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail2310);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1117:2: ( 'processes' '[' (lv_processes_15= ruleProcessCall )* ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1117:3: 'processes' '[' (lv_processes_15= ruleProcessCall )* ']'
                    {
                    match(input,21,FOLLOW_21_in_ruleMasterDetail2324); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getProcessesKeyword_10_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleMasterDetail2333); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_10_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1125:1: (lv_processes_15= ruleProcessCall )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID||LA31_0==35) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1128:6: lv_processes_15= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_10_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleMasterDetail2367);
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

                    match(input,22,FOLLOW_22_in_ruleMasterDetail2381); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1157:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1157:49: (iv_ruleProcess= ruleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1158:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess2416);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess2426); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1165:1: ruleProcess returns [EObject current=null] : (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject this_AutomatedProcess_0 = null;

        EObject this_InteractiveProcess_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1170:6: ( (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1171:1: (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1171:1: (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess )
            int alt33=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==29) ) {
                    alt33=1;
                }
                else if ( (LA33_1==31) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1171:1: (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess )", 33, 1, input);

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
                    new NoViableAltException("1171:1: (this_AutomatedProcess_0= ruleAutomatedProcess | this_InteractiveProcess_1= ruleInteractiveProcess )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1172:5: this_AutomatedProcess_0= ruleAutomatedProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getAutomatedProcessParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAutomatedProcess_in_ruleProcess2473);
                    this_AutomatedProcess_0=ruleAutomatedProcess();
                    _fsp--;

                     
                            current = this_AutomatedProcess_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1182:5: this_InteractiveProcess_1= ruleInteractiveProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getInteractiveProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInteractiveProcess_in_ruleProcess2500);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1197:1: entryRuleAutomatedProcess returns [EObject current=null] : iv_ruleAutomatedProcess= ruleAutomatedProcess EOF ;
    public final EObject entryRuleAutomatedProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomatedProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1197:58: (iv_ruleAutomatedProcess= ruleAutomatedProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1198:2: iv_ruleAutomatedProcess= ruleAutomatedProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAutomatedProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleAutomatedProcess_in_entryRuleAutomatedProcess2532);
            iv_ruleAutomatedProcess=ruleAutomatedProcess();
            _fsp--;

             current =iv_ruleAutomatedProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutomatedProcess2542); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1205:1: ruleAutomatedProcess returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? ) ;
    public final EObject ruleAutomatedProcess() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_processElements_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1210:6: ( ( (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1211:1: ( (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1211:1: ( (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1211:2: (lv_description_0= RULE_STRING )? 'AutomatedProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1211:2: (lv_description_0= RULE_STRING )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1213:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAutomatedProcess2589); 

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

            match(input,29,FOLLOW_29_in_ruleAutomatedProcess2607); 

                    createLeafNode(grammarAccess.getAutomatedProcessAccess().getAutomatedProcessKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1235:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1237:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAutomatedProcess2629); 

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

            match(input,16,FOLLOW_16_in_ruleAutomatedProcess2646); 

                    createLeafNode(grammarAccess.getAutomatedProcessAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1259:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1262:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAutomatedProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAutomatedProcess2668); 

            		createLeafNode(grammarAccess.getAutomatedProcessAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1275:2: ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1275:3: 'steps' '[' (lv_processElements_7= ruleUICall )* ']'
                    {
                    match(input,30,FOLLOW_30_in_ruleAutomatedProcess2681); 

                            createLeafNode(grammarAccess.getAutomatedProcessAccess().getStepsKeyword_5_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleAutomatedProcess2690); 

                            createLeafNode(grammarAccess.getAutomatedProcessAccess().getLeftSquareBracketKeyword_5_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1283:1: (lv_processElements_7= ruleUICall )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=39 && LA35_0<=40)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1286:6: lv_processElements_7= ruleUICall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAutomatedProcessAccess().getProcessElementsUICallParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUICall_in_ruleAutomatedProcess2724);
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

                    match(input,22,FOLLOW_22_in_ruleAutomatedProcess2738); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1315:1: entryRuleInteractiveProcess returns [EObject current=null] : iv_ruleInteractiveProcess= ruleInteractiveProcess EOF ;
    public final EObject entryRuleInteractiveProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractiveProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1315:60: (iv_ruleInteractiveProcess= ruleInteractiveProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1316:2: iv_ruleInteractiveProcess= ruleInteractiveProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInteractiveProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleInteractiveProcess_in_entryRuleInteractiveProcess2773);
            iv_ruleInteractiveProcess=ruleInteractiveProcess();
            _fsp--;

             current =iv_ruleInteractiveProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractiveProcess2783); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1323:1: ruleInteractiveProcess returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? ) ;
    public final EObject ruleInteractiveProcess() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_processElements_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1328:6: ( ( (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1329:1: ( (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1329:1: ( (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1329:2: (lv_description_0= RULE_STRING )? 'InteractiveProcess' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1329:2: (lv_description_0= RULE_STRING )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1331:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInteractiveProcess2830); 

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

            match(input,31,FOLLOW_31_in_ruleInteractiveProcess2848); 

                    createLeafNode(grammarAccess.getInteractiveProcessAccess().getInteractiveProcessKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1353:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1355:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractiveProcess2870); 

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

            match(input,16,FOLLOW_16_in_ruleInteractiveProcess2887); 

                    createLeafNode(grammarAccess.getInteractiveProcessAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1377:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1380:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInteractiveProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractiveProcess2909); 

            		createLeafNode(grammarAccess.getInteractiveProcessAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1393:2: ( 'steps' '[' (lv_processElements_7= ruleUICall )* ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1393:3: 'steps' '[' (lv_processElements_7= ruleUICall )* ']'
                    {
                    match(input,30,FOLLOW_30_in_ruleInteractiveProcess2922); 

                            createLeafNode(grammarAccess.getInteractiveProcessAccess().getStepsKeyword_5_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleInteractiveProcess2931); 

                            createLeafNode(grammarAccess.getInteractiveProcessAccess().getLeftSquareBracketKeyword_5_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1401:1: (lv_processElements_7= ruleUICall )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=39 && LA38_0<=40)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1404:6: lv_processElements_7= ruleUICall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getInteractiveProcessAccess().getProcessElementsUICallParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUICall_in_ruleInteractiveProcess2965);
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

                    match(input,22,FOLLOW_22_in_ruleInteractiveProcess2979); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1433:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1433:53: (iv_ruleFormElement= ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1434:2: iv_ruleFormElement= ruleFormElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement3014);
            iv_ruleFormElement=ruleFormElement();
            _fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement3024); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1441:1: ruleFormElement returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_label_4=null;
        Token lv_readonly_6=null;
        EObject lv_references_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1446:6: ( ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1447:1: ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1447:1: ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1447:2: (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) 'label' (lv_label_4= RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1447:2: (lv_description_0= RULE_STRING )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1449:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormElement3071); 

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

            match(input,32,FOLLOW_32_in_ruleFormElement3089); 

                    createLeafNode(grammarAccess.getFormElementAccess().getElementKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1471:1: (lv_references_2= ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1474:6: lv_references_2= ruleDtoPropertyReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3123);
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

            match(input,33,FOLLOW_33_in_ruleFormElement3136); 

                    createLeafNode(grammarAccess.getFormElementAccess().getLabelKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1496:1: (lv_label_4= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1498:6: lv_label_4= RULE_ID
            {
            lv_label_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormElement3158); 

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1516:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==18) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1516:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' )
                    {
                    match(input,18,FOLLOW_18_in_ruleFormElement3176); 

                            createLeafNode(grammarAccess.getFormElementAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1520:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==19) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==20) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1520:1: ( (lv_readonly_6= 'true' ) | 'false' )", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1520:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1520:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1522:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFormElement3198); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1542:6: 'false'
                            {
                            match(input,20,FOLLOW_20_in_ruleFormElement3226); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleFormElement3238); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1557:1: entryRuleDialogueCall returns [EObject current=null] : iv_ruleDialogueCall= ruleDialogueCall EOF ;
    public final EObject entryRuleDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1557:54: (iv_ruleDialogueCall= ruleDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1558:2: iv_ruleDialogueCall= ruleDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall3271);
            iv_ruleDialogueCall=ruleDialogueCall();
            _fsp--;

             current =iv_ruleDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogueCall3281); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1565:1: ruleDialogueCall returns [EObject current=null] : ( (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' ) ;
    public final EObject ruleDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_alias_3=null;
        EObject this_DirectDialogueCall_0 = null;

        EObject this_LinkedDialogueCall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1570:6: ( ( (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1571:1: ( (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1571:1: ( (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1571:2: (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1571:2: (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==35) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1571:2: (this_DirectDialogueCall_0= ruleDirectDialogueCall | this_LinkedDialogueCall_1= ruleLinkedDialogueCall )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1572:5: this_DirectDialogueCall_0= ruleDirectDialogueCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getDirectDialogueCallParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectDialogueCall_in_ruleDialogueCall3329);
                    this_DirectDialogueCall_0=ruleDirectDialogueCall();
                    _fsp--;

                     
                            current = this_DirectDialogueCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1582:5: this_LinkedDialogueCall_1= ruleLinkedDialogueCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getLinkedDialogueCallParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLinkedDialogueCall_in_ruleDialogueCall3356);
                    this_LinkedDialogueCall_1=ruleLinkedDialogueCall();
                    _fsp--;

                     
                            current = this_LinkedDialogueCall_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1590:2: ( 'alias' (lv_alias_3= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1590:3: 'alias' (lv_alias_3= RULE_ID )
                    {
                    match(input,34,FOLLOW_34_in_ruleDialogueCall3366); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getAliasKeyword_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1594:1: (lv_alias_3= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1596:6: lv_alias_3= RULE_ID
                    {
                    lv_alias_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDialogueCall3388); 

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

            match(input,12,FOLLOW_12_in_ruleDialogueCall3407); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1625:1: entryRuleLinkedDialogueCall returns [EObject current=null] : iv_ruleLinkedDialogueCall= ruleLinkedDialogueCall EOF ;
    public final EObject entryRuleLinkedDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1625:60: (iv_ruleLinkedDialogueCall= ruleLinkedDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1626:2: iv_ruleLinkedDialogueCall= ruleLinkedDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkedDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkedDialogueCall_in_entryRuleLinkedDialogueCall3440);
            iv_ruleLinkedDialogueCall=ruleLinkedDialogueCall();
            _fsp--;

             current =iv_ruleLinkedDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedDialogueCall3450); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1633:1: ruleLinkedDialogueCall returns [EObject current=null] : ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) ) ;
    public final EObject ruleLinkedDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_link_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1638:6: ( ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1639:1: ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1639:1: ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1639:2: 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID )
            {
            match(input,35,FOLLOW_35_in_ruleLinkedDialogueCall3484); 

                    createLeafNode(grammarAccess.getLinkedDialogueCallAccess().getNavigateKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1643:1: (lv_link_1= ruleLinkRef )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1646:6: lv_link_1= ruleLinkRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkedDialogueCallAccess().getLinkLinkRefParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkRef_in_ruleLinkedDialogueCall3518);
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

            match(input,36,FOLLOW_36_in_ruleLinkedDialogueCall3531); 

                    createLeafNode(grammarAccess.getLinkedDialogueCallAccess().getToKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1668:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1670:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedDialogueCall3553); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1695:1: entryRuleDirectDialogueCall returns [EObject current=null] : iv_ruleDirectDialogueCall= ruleDirectDialogueCall EOF ;
    public final EObject entryRuleDirectDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1695:60: (iv_ruleDirectDialogueCall= ruleDirectDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1696:2: iv_ruleDirectDialogueCall= ruleDirectDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectDialogueCall_in_entryRuleDirectDialogueCall3594);
            iv_ruleDirectDialogueCall=ruleDirectDialogueCall();
            _fsp--;

             current =iv_ruleDirectDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDialogueCall3604); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1703:1: ruleDirectDialogueCall returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDirectDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1708:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1709:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1709:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1711:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectDialogueCall3650); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1736:1: entryRuleProcessCall returns [EObject current=null] : iv_ruleProcessCall= ruleProcessCall EOF ;
    public final EObject entryRuleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1736:53: (iv_ruleProcessCall= ruleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1737:2: iv_ruleProcessCall= ruleProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcessCall_in_entryRuleProcessCall3690);
            iv_ruleProcessCall=ruleProcessCall();
            _fsp--;

             current =iv_ruleProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessCall3700); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1744:1: ruleProcessCall returns [EObject current=null] : ( (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' ) ;
    public final EObject ruleProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_alias_3=null;
        EObject this_DirectProcessCall_0 = null;

        EObject this_LinkedProcessCall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1749:6: ( ( (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1750:1: ( (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1750:1: ( (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1750:2: (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall ) ( 'alias' (lv_alias_3= RULE_ID ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1750:2: (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==35) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1750:2: (this_DirectProcessCall_0= ruleDirectProcessCall | this_LinkedProcessCall_1= ruleLinkedProcessCall )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1751:5: this_DirectProcessCall_0= ruleDirectProcessCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getDirectProcessCallParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDirectProcessCall_in_ruleProcessCall3748);
                    this_DirectProcessCall_0=ruleDirectProcessCall();
                    _fsp--;

                     
                            current = this_DirectProcessCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1761:5: this_LinkedProcessCall_1= ruleLinkedProcessCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getLinkedProcessCallParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLinkedProcessCall_in_ruleProcessCall3775);
                    this_LinkedProcessCall_1=ruleLinkedProcessCall();
                    _fsp--;

                     
                            current = this_LinkedProcessCall_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1769:2: ( 'alias' (lv_alias_3= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1769:3: 'alias' (lv_alias_3= RULE_ID )
                    {
                    match(input,34,FOLLOW_34_in_ruleProcessCall3785); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getAliasKeyword_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1773:1: (lv_alias_3= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1775:6: lv_alias_3= RULE_ID
                    {
                    lv_alias_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall3807); 

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

            match(input,12,FOLLOW_12_in_ruleProcessCall3826); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1804:1: entryRuleLinkedProcessCall returns [EObject current=null] : iv_ruleLinkedProcessCall= ruleLinkedProcessCall EOF ;
    public final EObject entryRuleLinkedProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1804:59: (iv_ruleLinkedProcessCall= ruleLinkedProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1805:2: iv_ruleLinkedProcessCall= ruleLinkedProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkedProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkedProcessCall_in_entryRuleLinkedProcessCall3859);
            iv_ruleLinkedProcessCall=ruleLinkedProcessCall();
            _fsp--;

             current =iv_ruleLinkedProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkedProcessCall3869); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1812:1: ruleLinkedProcessCall returns [EObject current=null] : ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) ) ;
    public final EObject ruleLinkedProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_3=null;
        EObject lv_link_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1817:6: ( ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1818:1: ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1818:1: ( 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1818:2: 'navigate' (lv_link_1= ruleLinkRef ) 'to' (lv_name_3= RULE_ID )
            {
            match(input,35,FOLLOW_35_in_ruleLinkedProcessCall3903); 

                    createLeafNode(grammarAccess.getLinkedProcessCallAccess().getNavigateKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1822:1: (lv_link_1= ruleLinkRef )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1825:6: lv_link_1= ruleLinkRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkedProcessCallAccess().getLinkLinkRefParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkRef_in_ruleLinkedProcessCall3937);
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

            match(input,36,FOLLOW_36_in_ruleLinkedProcessCall3950); 

                    createLeafNode(grammarAccess.getLinkedProcessCallAccess().getToKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1847:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1849:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkedProcessCall3972); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1874:1: entryRuleDirectProcessCall returns [EObject current=null] : iv_ruleDirectProcessCall= ruleDirectProcessCall EOF ;
    public final EObject entryRuleDirectProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1874:59: (iv_ruleDirectProcessCall= ruleDirectProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1875:2: iv_ruleDirectProcessCall= ruleDirectProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirectProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDirectProcessCall_in_entryRuleDirectProcessCall4013);
            iv_ruleDirectProcessCall=ruleDirectProcessCall();
            _fsp--;

             current =iv_ruleDirectProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectProcessCall4023); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1882:1: ruleDirectProcessCall returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDirectProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1887:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1888:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1888:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1890:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectProcessCall4069); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1915:1: entryRuleLinkRef returns [EObject current=null] : iv_ruleLinkRef= ruleLinkRef EOF ;
    public final EObject entryRuleLinkRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkRef = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1915:49: (iv_ruleLinkRef= ruleLinkRef EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1916:2: iv_ruleLinkRef= ruleLinkRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkRef_in_entryRuleLinkRef4109);
            iv_ruleLinkRef=ruleLinkRef();
            _fsp--;

             current =iv_ruleLinkRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkRef4119); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1923:1: ruleLinkRef returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleLinkRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1928:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1929:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1929:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1931:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkRef4165); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1956:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1956:46: (iv_ruleLink= ruleLink EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1957:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink4205);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink4215); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1964:1: ruleLink returns [EObject current=null] : (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_LinkStep_0 = null;

        EObject this_LinkPath_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1969:6: ( (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1970:1: (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1970:1: (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath )
            int alt47=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==38) ) {
                    alt47=2;
                }
                else if ( (LA47_1==37) ) {
                    alt47=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1970:1: (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath )", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt47=1;
                }
                break;
            case 38:
                {
                alt47=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1970:1: (this_LinkStep_0= ruleLinkStep | this_LinkPath_1= ruleLinkPath )", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1971:5: this_LinkStep_0= ruleLinkStep
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getLinkStepParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLinkStep_in_ruleLink4262);
                    this_LinkStep_0=ruleLinkStep();
                    _fsp--;

                     
                            current = this_LinkStep_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1981:5: this_LinkPath_1= ruleLinkPath
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getLinkPathParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLinkPath_in_ruleLink4289);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1996:1: entryRuleLinkStep returns [EObject current=null] : iv_ruleLinkStep= ruleLinkStep EOF ;
    public final EObject entryRuleLinkStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkStep = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1996:50: (iv_ruleLinkStep= ruleLinkStep EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1997:2: iv_ruleLinkStep= ruleLinkStep EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkStepRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkStep_in_entryRuleLinkStep4321);
            iv_ruleLinkStep=ruleLinkStep();
            _fsp--;

             current =iv_ruleLinkStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkStep4331); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2004:1: ruleLinkStep returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference ) ) ;
    public final EObject ruleLinkStep() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_reference_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2009:6: ( ( (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2010:1: ( (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2010:1: ( (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2010:2: (lv_description_0= RULE_STRING )? 'LinkStep' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) 'navigate' (lv_reference_6= ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2010:2: (lv_description_0= RULE_STRING )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2012:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLinkStep4378); 

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

            match(input,37,FOLLOW_37_in_ruleLinkStep4396); 

                    createLeafNode(grammarAccess.getLinkStepAccess().getLinkStepKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2034:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2036:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkStep4418); 

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

            match(input,16,FOLLOW_16_in_ruleLinkStep4435); 

                    createLeafNode(grammarAccess.getLinkStepAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2058:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2061:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkStepRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkStep4457); 

            		createLeafNode(grammarAccess.getLinkStepAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            match(input,35,FOLLOW_35_in_ruleLinkStep4469); 

                    createLeafNode(grammarAccess.getLinkStepAccess().getNavigateKeyword_5(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2078:1: (lv_reference_6= ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2081:6: lv_reference_6= ruleAssociationRoleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkStepAccess().getReferenceAssociationRoleReferenceParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleLinkStep4503);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2106:1: entryRuleLinkPath returns [EObject current=null] : iv_ruleLinkPath= ruleLinkPath EOF ;
    public final EObject entryRuleLinkPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkPath = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2106:50: (iv_ruleLinkPath= ruleLinkPath EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2107:2: iv_ruleLinkPath= ruleLinkPath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkPathRule(), currentNode); 
            pushFollow(FOLLOW_ruleLinkPath_in_entryRuleLinkPath4540);
            iv_ruleLinkPath=ruleLinkPath();
            _fsp--;

             current =iv_ruleLinkPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkPath4550); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2114:1: ruleLinkPath returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ) ;
    public final EObject ruleLinkPath() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2119:6: ( ( (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2120:1: ( (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2120:1: ( (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2120:2: (lv_description_0= RULE_STRING )? 'LinkPath' (lv_name_2= RULE_ID ) 'context' ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2120:2: (lv_description_0= RULE_STRING )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2122:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLinkPath4597); 

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

            match(input,38,FOLLOW_38_in_ruleLinkPath4615); 

                    createLeafNode(grammarAccess.getLinkPathAccess().getLinkPathKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2144:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2146:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkPath4637); 

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

            match(input,16,FOLLOW_16_in_ruleLinkPath4654); 

                    createLeafNode(grammarAccess.getLinkPathAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2168:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2171:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkPathRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkPath4676); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2191:1: entryRuleDtoPropertyReference returns [EObject current=null] : iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF ;
    public final EObject entryRuleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoPropertyReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2191:62: (iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2192:2: iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference4712);
            iv_ruleDtoPropertyReference=ruleDtoPropertyReference();
            _fsp--;

             current =iv_ruleDtoPropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference4722); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2199:1: ruleDtoPropertyReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2204:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2205:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2205:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2207:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoPropertyReference4768); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2232:1: entryRuleAssociationRoleReference returns [EObject current=null] : iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF ;
    public final EObject entryRuleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationRoleReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2232:66: (iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2233:2: iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRoleReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference4808);
            iv_ruleAssociationRoleReference=ruleAssociationRoleReference();
            _fsp--;

             current =iv_ruleAssociationRoleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference4818); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2240:1: ruleAssociationRoleReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2245:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2246:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2246:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2248:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationRoleReference4864); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2273:1: entryRuleUICall returns [EObject current=null] : iv_ruleUICall= ruleUICall EOF ;
    public final EObject entryRuleUICall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUICall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2273:48: (iv_ruleUICall= ruleUICall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2274:2: iv_ruleUICall= ruleUICall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUICallRule(), currentNode); 
            pushFollow(FOLLOW_ruleUICall_in_entryRuleUICall4904);
            iv_ruleUICall=ruleUICall();
            _fsp--;

             current =iv_ruleUICall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUICall4914); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2281:1: ruleUICall returns [EObject current=null] : this_UIModelElementCall_0= ruleUIModelElementCall ;
    public final EObject ruleUICall() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElementCall_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2286:6: (this_UIModelElementCall_0= ruleUIModelElementCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2288:5: this_UIModelElementCall_0= ruleUIModelElementCall
            {
             
                    currentNode=createCompositeNode(grammarAccess.getUICallAccess().getUIModelElementCallParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleUIModelElementCall_in_ruleUICall4960);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2303:1: entryRuleUIModelElementCall returns [EObject current=null] : iv_ruleUIModelElementCall= ruleUIModelElementCall EOF ;
    public final EObject entryRuleUIModelElementCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElementCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2303:60: (iv_ruleUIModelElementCall= ruleUIModelElementCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2304:2: iv_ruleUIModelElementCall= ruleUIModelElementCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall4991);
            iv_ruleUIModelElementCall=ruleUIModelElementCall();
            _fsp--;

             current =iv_ruleUIModelElementCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElementCall5001); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2311:1: ruleUIModelElementCall returns [EObject current=null] : ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) ) ;
    public final EObject ruleUIModelElementCall() throws RecognitionException {
        EObject current = null;

        EObject this_DialogueCall_1 = null;

        EObject this_ProcessCall_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2316:6: ( ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2317:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2317:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            else if ( (LA50_0==40) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2317:1: ( ( 'dialogue' this_DialogueCall_1= ruleDialogueCall ) | ( 'process' this_ProcessCall_3= ruleProcessCall ) )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2317:2: ( 'dialogue' this_DialogueCall_1= ruleDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2317:2: ( 'dialogue' this_DialogueCall_1= ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2317:3: 'dialogue' this_DialogueCall_1= ruleDialogueCall
                    {
                    match(input,39,FOLLOW_39_in_ruleUIModelElementCall5036); 

                            createLeafNode(grammarAccess.getUIModelElementCallAccess().getDialogueKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementCallAccess().getDialogueCallParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogueCall_in_ruleUIModelElementCall5058);
                    this_DialogueCall_1=ruleDialogueCall();
                    _fsp--;

                     
                            current = this_DialogueCall_1; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2331:6: ( 'process' this_ProcessCall_3= ruleProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2331:6: ( 'process' this_ProcessCall_3= ruleProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2331:7: 'process' this_ProcessCall_3= ruleProcessCall
                    {
                    match(input,40,FOLLOW_40_in_ruleUIModelElementCall5074); 

                            createLeafNode(grammarAccess.getUIModelElementCallAccess().getProcessKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementCallAccess().getProcessCallParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcessCall_in_ruleUIModelElementCall5096);
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
    public static final BitSet FOLLOW_RULE_ID_in_rulePresentationModel170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePresentationModel187 = new BitSet(new long[]{0x00000060A680A012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rulePresentationModel221 = new BitSet(new long[]{0x00000060A680A012L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rulePresentationModel260 = new BitSet(new long[]{0x00000060A6808012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExternalReference342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference364 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExternalReference381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleModelElementWithContext537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_ruleUIModelElement626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleUIModelElement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_entryRuleDialogue685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogue695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_ruleDialogue742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_ruleDialogue769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_entryRuleContentForm801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentForm811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContentForm858 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContentForm876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm898 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleContentForm915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm937 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContentForm949 = new BitSet(new long[]{0x0000000100640010L});
    public static final BitSet FOLLOW_18_in_ruleContentForm959 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleContentForm981 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20_in_ruleContentForm1009 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1019 = new BitSet(new long[]{0x0000000100600010L});
    public static final BitSet FOLLOW_ruleFormElement_in_ruleContentForm1055 = new BitSet(new long[]{0x0000000100600010L});
    public static final BitSet FOLLOW_21_in_ruleContentForm1070 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContentForm1079 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleContentForm1113 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleContentForm1127 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContentForm1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundDialogue1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompoundDialogue1229 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCompoundDialogue1247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue1269 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompoundDialogue1286 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue1308 = new BitSet(new long[]{0x0000000001240002L});
    public static final BitSet FOLLOW_18_in_ruleCompoundDialogue1321 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleCompoundDialogue1343 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20_in_ruleCompoundDialogue1371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue1381 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_24_in_ruleCompoundDialogue1393 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompoundDialogue1402 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue1436 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleCompoundDialogue1450 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleCompoundDialogue1462 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompoundDialogue1471 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCompoundDialogue1505 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleCompoundDialogue1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionDialogue1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollectionDialogue1666 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCollectionDialogue1684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue1706 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionDialogue1723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue1745 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue1757 = new BitSet(new long[]{0x0000000001640000L});
    public static final BitSet FOLLOW_18_in_ruleCollectionDialogue1767 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleCollectionDialogue1789 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20_in_ruleCollectionDialogue1817 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue1827 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_24_in_ruleCollectionDialogue1839 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue1848 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue1882 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleCollectionDialogue1896 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCollectionDialogue1908 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue1917 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCollectionDialogue1951 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleCollectionDialogue1965 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCollectionDialogue1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail2009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterDetail2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMasterDetail2066 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMasterDetail2084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail2106 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMasterDetail2123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail2145 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_ruleMasterDetail2158 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleMasterDetail2180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20_in_ruleMasterDetail2208 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail2218 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMasterDetail2229 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail2263 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMasterDetail2276 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail2310 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleMasterDetail2324 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMasterDetail2333 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleMasterDetail2367 = new BitSet(new long[]{0x0000000800400020L});
    public static final BitSet FOLLOW_22_in_ruleMasterDetail2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess2416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomatedProcess_in_ruleProcess2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiveProcess_in_ruleProcess2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutomatedProcess_in_entryRuleAutomatedProcess2532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutomatedProcess2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAutomatedProcess2589 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAutomatedProcess2607 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomatedProcess2629 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAutomatedProcess2646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAutomatedProcess2668 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAutomatedProcess2681 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAutomatedProcess2690 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_ruleUICall_in_ruleAutomatedProcess2724 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_22_in_ruleAutomatedProcess2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractiveProcess_in_entryRuleInteractiveProcess2773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractiveProcess2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInteractiveProcess2830 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleInteractiveProcess2848 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractiveProcess2870 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInteractiveProcess2887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractiveProcess2909 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleInteractiveProcess2922 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInteractiveProcess2931 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_ruleUICall_in_ruleInteractiveProcess2965 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_22_in_ruleInteractiveProcess2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement3014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormElement3071 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFormElement3089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_ruleFormElement3123 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFormElement3136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormElement3158 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_18_in_ruleFormElement3176 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleFormElement3198 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20_in_ruleFormElement3226 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFormElement3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall3271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogueCall3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDialogueCall_in_ruleDialogueCall3329 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_ruleLinkedDialogueCall_in_ruleDialogueCall3356 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_34_in_ruleDialogueCall3366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDialogueCall3388 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDialogueCall3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedDialogueCall_in_entryRuleLinkedDialogueCall3440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedDialogueCall3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLinkedDialogueCall3484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLinkRef_in_ruleLinkedDialogueCall3518 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleLinkedDialogueCall3531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedDialogueCall3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDialogueCall_in_entryRuleDirectDialogueCall3594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDialogueCall3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDialogueCall3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_entryRuleProcessCall3690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessCall3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectProcessCall_in_ruleProcessCall3748 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_ruleLinkedProcessCall_in_ruleProcessCall3775 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_34_in_ruleProcessCall3785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall3807 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcessCall3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkedProcessCall_in_entryRuleLinkedProcessCall3859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkedProcessCall3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLinkedProcessCall3903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLinkRef_in_ruleLinkedProcessCall3937 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleLinkedProcessCall3950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkedProcessCall3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectProcessCall_in_entryRuleDirectProcessCall4013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectProcessCall4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectProcessCall4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkRef_in_entryRuleLinkRef4109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkRef4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkRef4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink4205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkStep_in_ruleLink4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkPath_in_ruleLink4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkStep_in_entryRuleLinkStep4321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkStep4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkStep4378 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLinkStep4396 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkStep4418 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLinkStep4435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkStep4457 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleLinkStep4469 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleLinkStep4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkPath_in_entryRuleLinkPath4540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkPath4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkPath4597 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLinkPath4615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkPath4637 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLinkPath4654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkPath4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference4712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoPropertyReference4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference4808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationRoleReference4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_entryRuleUICall4904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUICall4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_ruleUICall4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElementCall_in_entryRuleUIModelElementCall4991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElementCall5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUIModelElementCall5036 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleUIModelElementCall5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleUIModelElementCall5074 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleUIModelElementCall5096 = new BitSet(new long[]{0x0000000000000002L});

}