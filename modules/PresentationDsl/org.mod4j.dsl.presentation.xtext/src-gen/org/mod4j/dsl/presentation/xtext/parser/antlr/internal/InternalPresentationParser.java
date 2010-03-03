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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "';'", "'from'", "'process'", "'presentation'", "'['", "']'", "'import'", "'form'", "'context'", "'list'", "'readonly'", "'true'", "'false'", "'actions'", "'processes'", "'label'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'element'", "':'", "'if'", "'('", "')'", "'call'", "'service'", "'.'", "'composite'", "'navigate'", "'new'", "'save'", "'edit'", "'delete'", "'cancel'", "'removefrom'", "'addto'", "'link'", "'all'", "'find'"
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

                if ( (LA1_1==11) ) {
                    alt1=1;
                }
                else if ( (LA1_1==15) ) {
                    alt1=2;
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
            case 15:
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:121:1: ruleApplicationModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleProcessReference )* (lv_start_5= ruleApplication ) ) ;
    public final EObject ruleApplicationModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_start_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:126:6: ( ( (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleProcessReference )* (lv_start_5= ruleApplication ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:127:1: ( (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleProcessReference )* (lv_start_5= ruleApplication ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:127:1: ( (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleProcessReference )* (lv_start_5= ruleApplication ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:127:2: (lv_description_0= RULE_STRING )? 'application' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleProcessReference )* (lv_start_5= ruleApplication )
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
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:175:1: (lv_externalReferences_4= ruleProcessReference )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:178:6: lv_externalReferences_4= ruleProcessReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationModelAccess().getExternalReferencesProcessReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessReference_in_ruleApplicationModel337);
            	    lv_externalReferences_4=ruleProcessReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "externalReferences", lv_externalReferences_4, "ProcessReference", currentNode);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:196:3: (lv_start_5= ruleApplication )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:199:6: lv_start_5= ruleApplication
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationModelAccess().getStartApplicationParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleApplicationModel376);
            lv_start_5=ruleApplication();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "start", lv_start_5, "Application", currentNode);
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


    // $ANTLR start entryRuleProcessReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:224:1: entryRuleProcessReference returns [EObject current=null] : iv_ruleProcessReference= ruleProcessReference EOF ;
    public final EObject entryRuleProcessReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:224:58: (iv_ruleProcessReference= ruleProcessReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:225:2: iv_ruleProcessReference= ruleProcessReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcessReference_in_entryRuleProcessReference413);
            iv_ruleProcessReference=ruleProcessReference();
            _fsp--;

             current =iv_ruleProcessReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessReference423); 

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
    // $ANTLR end entryRuleProcessReference


    // $ANTLR start ruleProcessReference
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:232:1: ruleProcessReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'process' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleProcessReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:237:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'process' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:238:1: ( 'from' (lv_modelName_1= RULE_ID ) 'process' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:238:1: ( 'from' (lv_modelName_1= RULE_ID ) 'process' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:238:2: 'from' (lv_modelName_1= RULE_ID ) 'process' (lv_name_3= RULE_ID ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleProcessReference457); 

                    createLeafNode(grammarAccess.getProcessReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:242:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:244:6: lv_modelName_1= RULE_ID
            {
            lv_modelName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessReference479); 

            		createLeafNode(grammarAccess.getProcessReferenceAccess().getModelNameIDTerminalRuleCall_1_0(), "modelName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcessReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "modelName", lv_modelName_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,14,FOLLOW_14_in_ruleProcessReference496); 

                    createLeafNode(grammarAccess.getProcessReferenceAccess().getProcessKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:266:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:268:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessReference518); 

            		createLeafNode(grammarAccess.getProcessReferenceAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcessReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleProcessReference535); 

                    createLeafNode(grammarAccess.getProcessReferenceAccess().getSemicolonKeyword_4(), null); 
                

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
    // $ANTLR end ruleProcessReference


    // $ANTLR start entryRuleFormsAndProcesses
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:297:1: entryRuleFormsAndProcesses returns [EObject current=null] : iv_ruleFormsAndProcesses= ruleFormsAndProcesses EOF ;
    public final EObject entryRuleFormsAndProcesses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormsAndProcesses = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:297:59: (iv_ruleFormsAndProcesses= ruleFormsAndProcesses EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:298:2: iv_ruleFormsAndProcesses= ruleFormsAndProcesses EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormsAndProcessesRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormsAndProcesses_in_entryRuleFormsAndProcesses568);
            iv_ruleFormsAndProcesses=ruleFormsAndProcesses();
            _fsp--;

             current =iv_ruleFormsAndProcesses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormsAndProcesses578); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:305:1: ruleFormsAndProcesses returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication )? (lv_elements_6= ruleModelElementWithContext )* ) ;
    public final EObject ruleFormsAndProcesses() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_start_5 = null;

        EObject lv_elements_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:310:6: ( ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication )? (lv_elements_6= ruleModelElementWithContext )* ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:311:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication )? (lv_elements_6= ruleModelElementWithContext )* )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:311:1: ( (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication )? (lv_elements_6= ruleModelElementWithContext )* )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:311:2: (lv_description_0= RULE_STRING )? 'presentation' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* (lv_start_5= ruleApplication )? (lv_elements_6= ruleModelElementWithContext )*
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:311:2: (lv_description_0= RULE_STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:313:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormsAndProcesses625); 

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

            match(input,15,FOLLOW_15_in_ruleFormsAndProcesses643); 

                    createLeafNode(grammarAccess.getFormsAndProcessesAccess().getPresentationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:335:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:337:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormsAndProcesses665); 

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

            match(input,12,FOLLOW_12_in_ruleFormsAndProcesses682); 

                    createLeafNode(grammarAccess.getFormsAndProcessesAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:359:1: (lv_externalReferences_4= ruleExternalReference )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:362:6: lv_externalReferences_4= ruleExternalReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalReference_in_ruleFormsAndProcesses716);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:380:3: (lv_start_5= ruleApplication )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:383:6: lv_start_5= ruleApplication
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFormsAndProcessesAccess().getStartApplicationParserRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleApplication_in_ruleFormsAndProcesses755);
                    lv_start_5=ruleApplication();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFormsAndProcessesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "start", lv_start_5, "Application", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:401:3: (lv_elements_6= ruleModelElementWithContext )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||LA7_0==14||LA7_0==19||LA7_0==28||(LA7_0>=30 && LA7_0<=31)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:404:6: lv_elements_6= ruleModelElementWithContext
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFormsAndProcessesAccess().getElementsModelElementWithContextParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElementWithContext_in_ruleFormsAndProcesses794);
            	    lv_elements_6=ruleModelElementWithContext();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFormsAndProcessesRule().getType().getClassifier());
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
            	    break loop7;
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


    // $ANTLR start entryRuleApplication
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:429:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:429:53: (iv_ruleApplication= ruleApplication EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:430:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication832);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication842); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:437:1: ruleApplication returns [EObject current=null] : ( 'application' '[' (lv_startProcesses_2= ruleSimpleProcessCall ) ';' ( (lv_startProcesses_4= ruleSimpleProcessCall ) ';' )* ']' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        EObject lv_startProcesses_2 = null;

        EObject lv_startProcesses_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:442:6: ( ( 'application' '[' (lv_startProcesses_2= ruleSimpleProcessCall ) ';' ( (lv_startProcesses_4= ruleSimpleProcessCall ) ';' )* ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:443:1: ( 'application' '[' (lv_startProcesses_2= ruleSimpleProcessCall ) ';' ( (lv_startProcesses_4= ruleSimpleProcessCall ) ';' )* ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:443:1: ( 'application' '[' (lv_startProcesses_2= ruleSimpleProcessCall ) ';' ( (lv_startProcesses_4= ruleSimpleProcessCall ) ';' )* ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:443:2: 'application' '[' (lv_startProcesses_2= ruleSimpleProcessCall ) ';' ( (lv_startProcesses_4= ruleSimpleProcessCall ) ';' )* ']'
            {
            match(input,11,FOLLOW_11_in_ruleApplication876); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            match(input,16,FOLLOW_16_in_ruleApplication885); 

                    createLeafNode(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:451:1: (lv_startProcesses_2= ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:454:6: lv_startProcesses_2= ruleSimpleProcessCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_ruleApplication919);
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

            match(input,12,FOLLOW_12_in_ruleApplication932); 

                    createLeafNode(grammarAccess.getApplicationAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:476:1: ( (lv_startProcesses_4= ruleSimpleProcessCall ) ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:476:2: (lv_startProcesses_4= ruleSimpleProcessCall ) ';'
            	    {
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:476:2: (lv_startProcesses_4= ruleSimpleProcessCall )
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:479:6: lv_startProcesses_4= ruleSimpleProcessCall
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleProcessCall_in_ruleApplication967);
            	    lv_startProcesses_4=ruleSimpleProcessCall();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "startProcesses", lv_startProcesses_4, "SimpleProcessCall", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    match(input,12,FOLLOW_12_in_ruleApplication980); 

            	            createLeafNode(grammarAccess.getApplicationAccess().getSemicolonKeyword_4_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleApplication991); 

                    createLeafNode(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:512:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:512:59: (iv_ruleExternalReference= ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:513:2: iv_ruleExternalReference= ruleExternalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference1024);
            iv_ruleExternalReference=ruleExternalReference();
            _fsp--;

             current =iv_ruleExternalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference1034); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:520:1: ruleExternalReference returns [EObject current=null] : ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelName_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:525:6: ( ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:526:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:526:1: ( 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:526:2: 'from' (lv_modelName_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleExternalReference1068); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:530:1: (lv_modelName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:532:6: lv_modelName_1= RULE_ID
            {
            lv_modelName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference1090); 

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

            match(input,18,FOLLOW_18_in_ruleExternalReference1107); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getImportKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:554:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:556:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference1129); 

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

            match(input,12,FOLLOW_12_in_ruleExternalReference1146); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:585:1: entryRuleModelElementWithContext returns [EObject current=null] : iv_ruleModelElementWithContext= ruleModelElementWithContext EOF ;
    public final EObject entryRuleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElementWithContext = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:585:65: (iv_ruleModelElementWithContext= ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:586:2: iv_ruleModelElementWithContext= ruleModelElementWithContext EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelElementWithContextRule(), currentNode); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext1179);
            iv_ruleModelElementWithContext=ruleModelElementWithContext();
            _fsp--;

             current =iv_ruleModelElementWithContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElementWithContext1189); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:593:1: ruleModelElementWithContext returns [EObject current=null] : this_UIModelElement_0= ruleUIModelElement ;
    public final EObject ruleModelElementWithContext() throws RecognitionException {
        EObject current = null;

        EObject this_UIModelElement_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:598:6: (this_UIModelElement_0= ruleUIModelElement )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:600:5: this_UIModelElement_0= ruleUIModelElement
            {
             
                    currentNode=createCompositeNode(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext1235);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:615:1: entryRuleUIModelElement returns [EObject current=null] : iv_ruleUIModelElement= ruleUIModelElement EOF ;
    public final EObject entryRuleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModelElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:615:56: (iv_ruleUIModelElement= ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:616:2: iv_ruleUIModelElement= ruleUIModelElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUIModelElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement1266);
            iv_ruleUIModelElement=ruleUIModelElement();
            _fsp--;

             current =iv_ruleUIModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement1276); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:623:1: ruleUIModelElement returns [EObject current=null] : (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) ;
    public final EObject ruleUIModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Dialogue_0 = null;

        EObject this_Process_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:628:6: ( (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:629:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:629:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==14) ) {
                    alt9=2;
                }
                else if ( (LA9_1==19||LA9_1==28||(LA9_1>=30 && LA9_1<=31)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("629:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
            case 28:
            case 30:
            case 31:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("629:1: (this_Dialogue_0= ruleDialogue | this_Process_1= ruleProcess )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:630:5: this_Dialogue_0= ruleDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogue_in_ruleUIModelElement1323);
                    this_Dialogue_0=ruleDialogue();
                    _fsp--;

                     
                            current = this_Dialogue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:640:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleUIModelElement1350);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:655:1: entryRuleDialogue returns [EObject current=null] : iv_ruleDialogue= ruleDialogue EOF ;
    public final EObject entryRuleDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:655:50: (iv_ruleDialogue= ruleDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:656:2: iv_ruleDialogue= ruleDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogue_in_entryRuleDialogue1382);
            iv_ruleDialogue=ruleDialogue();
            _fsp--;

             current =iv_ruleDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogue1392); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:663:1: ruleDialogue returns [EObject current=null] : (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) ;
    public final EObject ruleDialogue() throws RecognitionException {
        EObject current = null;

        EObject this_ContentForm_0 = null;

        EObject this_CompoundDialogue_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:668:6: ( (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:669:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:669:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )
            int alt10=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==19) ) {
                    alt10=1;
                }
                else if ( (LA10_1==28||(LA10_1>=30 && LA10_1<=31)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("669:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt10=1;
                }
                break;
            case 28:
            case 30:
            case 31:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("669:1: (this_ContentForm_0= ruleContentForm | this_CompoundDialogue_1= ruleCompoundDialogue )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:670:5: this_ContentForm_0= ruleContentForm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContentForm_in_ruleDialogue1439);
                    this_ContentForm_0=ruleContentForm();
                    _fsp--;

                     
                            current = this_ContentForm_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:680:5: this_CompoundDialogue_1= ruleCompoundDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_ruleDialogue1466);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:695:1: entryRuleContentForm returns [EObject current=null] : iv_ruleContentForm= ruleContentForm EOF ;
    public final EObject entryRuleContentForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentForm = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:695:53: (iv_ruleContentForm= ruleContentForm EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:696:2: iv_ruleContentForm= ruleContentForm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentFormRule(), currentNode); 
            pushFollow(FOLLOW_ruleContentForm_in_entryRuleContentForm1498);
            iv_ruleContentForm=ruleContentForm();
            _fsp--;

             current =iv_ruleContentForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentForm1508); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:703:1: ruleContentForm returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']' ) ;
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:708:6: ( ( (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:709:1: ( (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:709:1: ( (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:709:2: (lv_description_0= RULE_STRING )? 'form' (lv_name_2= RULE_ID ) 'context' (lv_collectionContext_4= 'list' )? ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )? (lv_formElements_11= ruleFormElement )* ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )? ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:709:2: (lv_description_0= RULE_STRING )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:711:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContentForm1555); 

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

            match(input,19,FOLLOW_19_in_ruleContentForm1573); 

                    createLeafNode(grammarAccess.getContentFormAccess().getFormKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:733:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:735:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm1595); 

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

            match(input,20,FOLLOW_20_in_ruleContentForm1612); 

                    createLeafNode(grammarAccess.getContentFormAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:757:1: (lv_collectionContext_4= 'list' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:759:6: lv_collectionContext_4= 'list'
                    {
                    lv_collectionContext_4=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleContentForm1633); 

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:778:3: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:781:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContentFormRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentForm1669); 

            		createLeafNode(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_5_0(), "contextRef"); 
            	

            }

            match(input,16,FOLLOW_16_in_ruleContentForm1681); 

                    createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:798:1: ( 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:798:2: 'readonly' ( (lv_readonly_8= 'true' ) | 'false' ) ';'
                    {
                    match(input,22,FOLLOW_22_in_ruleContentForm1691); 

                            createLeafNode(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:802:1: ( (lv_readonly_8= 'true' ) | 'false' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==23) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==24) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("802:1: ( (lv_readonly_8= 'true' ) | 'false' )", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:802:2: (lv_readonly_8= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:802:2: (lv_readonly_8= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:804:6: lv_readonly_8= 'true'
                            {
                            lv_readonly_8=(Token)input.LT(1);
                            match(input,23,FOLLOW_23_in_ruleContentForm1713); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:824:6: 'false'
                            {
                            match(input,24,FOLLOW_24_in_ruleContentForm1741); 

                                    createLeafNode(grammarAccess.getContentFormAccess().getFalseKeyword_7_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleContentForm1751); 

                            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_7_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:832:3: (lv_formElements_11= ruleFormElement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING||LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:835:6: lv_formElements_11= ruleFormElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormElement_in_ruleContentForm1787);
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
            	    break loop15;
                }
            } while (true);

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:853:3: ( 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:853:4: 'actions' '[' ( (lv_actions_14= ruleAction ) ';' )* ']'
                    {
                    match(input,25,FOLLOW_25_in_ruleContentForm1802); 

                            createLeafNode(grammarAccess.getContentFormAccess().getActionsKeyword_9_0(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleContentForm1811); 

                            createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:861:1: ( (lv_actions_14= ruleAction ) ';' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=44 && LA16_0<=50)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:861:2: (lv_actions_14= ruleAction ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:861:2: (lv_actions_14= ruleAction )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:864:6: lv_actions_14= ruleAction
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getActionsActionParserRuleCall_9_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleContentForm1846);
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

                    	    match(input,12,FOLLOW_12_in_ruleContentForm1859); 

                    	            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleContentForm1870); 

                            createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:890:3: ( 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:890:4: 'processes' '[' ( (lv_processes_19= ruleSimpleProcessCall ) ';' )* ']'
                    {
                    match(input,26,FOLLOW_26_in_ruleContentForm1882); 

                            createLeafNode(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleContentForm1891); 

                            createLeafNode(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:898:1: ( (lv_processes_19= ruleSimpleProcessCall ) ';' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:898:2: (lv_processes_19= ruleSimpleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:898:2: (lv_processes_19= ruleSimpleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:901:6: lv_processes_19= ruleSimpleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getContentFormAccess().getProcessesSimpleProcessCallParserRuleCall_10_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleProcessCall_in_ruleContentForm1926);
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

                    	    match(input,12,FOLLOW_12_in_ruleContentForm1939); 

                    	            createLeafNode(grammarAccess.getContentFormAccess().getSemicolonKeyword_10_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleContentForm1950); 

                            createLeafNode(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10_3(), null); 
                        

                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleContentForm1961); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:938:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:938:48: (iv_ruleAction= ruleAction EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:939:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1994);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2004); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:946:1: ruleAction returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_label_4=null;
        Enumerator lv_type_1 = null;

        EObject lv_processElements_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:951:6: ( ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:952:1: ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:952:1: ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:952:2: (lv_description_0= RULE_STRING )? (lv_type_1= ruleProcessType )? (lv_name_2= RULE_ID ) ( 'label' (lv_label_4= RULE_STRING ) )? (lv_processElements_5= ruleActionDialogueCall )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:952:2: (lv_description_0= RULE_STRING )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:954:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction2051); 

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:972:3: (lv_type_1= ruleProcessType )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=44 && LA21_0<=50)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:975:6: lv_type_1= ruleProcessType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcessType_in_ruleAction2094);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:993:3: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:995:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2121); 

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1013:2: ( 'label' (lv_label_4= RULE_STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1013:3: 'label' (lv_label_4= RULE_STRING )
                    {
                    match(input,27,FOLLOW_27_in_ruleAction2139); 

                            createLeafNode(grammarAccess.getActionAccess().getLabelKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1017:1: (lv_label_4= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1019:6: lv_label_4= RULE_STRING
                    {
                    lv_label_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction2161); 

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1037:4: (lv_processElements_5= ruleActionDialogueCall )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19||(LA23_0>=39 && LA23_0<=40)||(LA23_0>=42 && LA23_0<=43)||(LA23_0>=52 && LA23_0<=53)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1040:6: lv_processElements_5= ruleActionDialogueCall
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getProcessElementsActionDialogueCallParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleActionDialogueCall_in_ruleAction2205);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1065:1: entryRuleCompoundDialogue returns [EObject current=null] : iv_ruleCompoundDialogue= ruleCompoundDialogue EOF ;
    public final EObject entryRuleCompoundDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1065:58: (iv_ruleCompoundDialogue= ruleCompoundDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1066:2: iv_ruleCompoundDialogue= ruleCompoundDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue2243);
            iv_ruleCompoundDialogue=ruleCompoundDialogue();
            _fsp--;

             current =iv_ruleCompoundDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundDialogue2253); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1073:1: ruleCompoundDialogue returns [EObject current=null] : ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail ) ;
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1078:6: ( ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1079:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1079:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    alt31=3;
                    }
                    break;
                case 30:
                    {
                    alt31=2;
                    }
                    break;
                case 28:
                    {
                    alt31=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1079:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )", 31, 1, input);

                    throw nvae;
                }

                }
                break;
            case 28:
                {
                alt31=1;
                }
                break;
            case 30:
                {
                alt31=2;
                }
                break;
            case 31:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1079:1: ( ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? ) | this_CollectionDialogue_19= ruleCollectionDialogue | this_MasterDetail_20= ruleMasterDetail )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1079:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1079:2: ( (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )? )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1079:3: (lv_description_0= RULE_STRING )? 'CompoundDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )?
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1079:3: (lv_description_0= RULE_STRING )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_STRING) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1081:6: lv_description_0= RULE_STRING
                            {
                            lv_description_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompoundDialogue2301); 

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

                    match(input,28,FOLLOW_28_in_ruleCompoundDialogue2319); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1103:1: (lv_name_2= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1105:6: lv_name_2= RULE_ID
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue2341); 

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

                    match(input,20,FOLLOW_20_in_ruleCompoundDialogue2358); 

                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1127:1: ( RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1130:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCompoundDialogueRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundDialogue2380); 

                    		createLeafNode(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0(), "contextRef"); 
                    	

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1143:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==22) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1143:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                            {
                            match(input,22,FOLLOW_22_in_ruleCompoundDialogue2393); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1147:1: ( (lv_readonly_6= 'true' ) | 'false' )
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==23) ) {
                                alt25=1;
                            }
                            else if ( (LA25_0==24) ) {
                                alt25=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1147:1: ( (lv_readonly_6= 'true' ) | 'false' )", 25, 0, input);

                                throw nvae;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1147:2: (lv_readonly_6= 'true' )
                                    {
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1147:2: (lv_readonly_6= 'true' )
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1149:6: lv_readonly_6= 'true'
                                    {
                                    lv_readonly_6=(Token)input.LT(1);
                                    match(input,23,FOLLOW_23_in_ruleCompoundDialogue2415); 

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
                                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1169:6: 'false'
                                    {
                                    match(input,24,FOLLOW_24_in_ruleCompoundDialogue2443); 

                                            createLeafNode(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1(), null); 
                                        

                                    }
                                    break;

                            }

                            match(input,12,FOLLOW_12_in_ruleCompoundDialogue2453); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1177:3: ( 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==29) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1177:4: 'dialogues' '[' ( (lv_dialogues_11= ruleDialogueCall ) ';' )* ']'
                            {
                            match(input,29,FOLLOW_29_in_ruleCompoundDialogue2465); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0(), null); 
                                
                            match(input,16,FOLLOW_16_in_ruleCompoundDialogue2474); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1185:1: ( (lv_dialogues_11= ruleDialogueCall ) ';' )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==RULE_STRING||LA27_0==19||LA27_0==36||(LA27_0>=39 && LA27_0<=40)||(LA27_0>=42 && LA27_0<=43)||(LA27_0>=52 && LA27_0<=53)) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1185:2: (lv_dialogues_11= ruleDialogueCall ) ';'
                            	    {
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1185:2: (lv_dialogues_11= ruleDialogueCall )
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1188:6: lv_dialogues_11= ruleDialogueCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue2509);
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

                            	    match(input,12,FOLLOW_12_in_ruleCompoundDialogue2522); 

                            	            createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1(), null); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);

                            match(input,17,FOLLOW_17_in_ruleCompoundDialogue2533); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3(), null); 
                                

                            }
                            break;

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1214:3: ( 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==26) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1214:4: 'processes' '[' ( (lv_processes_16= ruleProcessCall ) ';' )* ']'
                            {
                            match(input,26,FOLLOW_26_in_ruleCompoundDialogue2545); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0(), null); 
                                
                            match(input,16,FOLLOW_16_in_ruleCompoundDialogue2554); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1(), null); 
                                
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1222:1: ( (lv_processes_16= ruleProcessCall ) ';' )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==RULE_STRING||LA29_0==14||LA29_0==36||(LA29_0>=39 && LA29_0<=40)||(LA29_0>=42 && LA29_0<=43)||(LA29_0>=52 && LA29_0<=53)) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1222:2: (lv_processes_16= ruleProcessCall ) ';'
                            	    {
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1222:2: (lv_processes_16= ruleProcessCall )
                            	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1225:6: lv_processes_16= ruleProcessCall
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCompoundDialogue2589);
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

                            	    match(input,12,FOLLOW_12_in_ruleCompoundDialogue2602); 

                            	            createLeafNode(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1(), null); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);

                            match(input,17,FOLLOW_17_in_ruleCompoundDialogue2613); 

                                    createLeafNode(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1253:5: this_CollectionDialogue_19= ruleCollectionDialogue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue2644);
                    this_CollectionDialogue_19=ruleCollectionDialogue();
                    _fsp--;

                     
                            current = this_CollectionDialogue_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1263:5: this_MasterDetail_20= ruleMasterDetail
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue2671);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1278:1: entryRuleCollectionDialogue returns [EObject current=null] : iv_ruleCollectionDialogue= ruleCollectionDialogue EOF ;
    public final EObject entryRuleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionDialogue = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1278:60: (iv_ruleCollectionDialogue= ruleCollectionDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1279:2: iv_ruleCollectionDialogue= ruleCollectionDialogue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCollectionDialogueRule(), currentNode); 
            pushFollow(FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue2703);
            iv_ruleCollectionDialogue=ruleCollectionDialogue();
            _fsp--;

             current =iv_ruleCollectionDialogue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionDialogue2713); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1286:1: ruleCollectionDialogue returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' ) ;
    public final EObject ruleCollectionDialogue() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_readonly_7=null;
        EObject lv_dialogues_12 = null;

        EObject lv_processes_17 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1291:6: ( ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1292:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1292:1: ( (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1292:2: (lv_description_0= RULE_STRING )? 'CollectionDialogue' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) '[' ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )? ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )? ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ']'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1292:2: (lv_description_0= RULE_STRING )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1294:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollectionDialogue2760); 

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

            match(input,30,FOLLOW_30_in_ruleCollectionDialogue2778); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1316:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1318:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue2800); 

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

            match(input,20,FOLLOW_20_in_ruleCollectionDialogue2817); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1340:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1343:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCollectionDialogueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectionDialogue2839); 

            		createLeafNode(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            match(input,16,FOLLOW_16_in_ruleCollectionDialogue2851); 

                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1360:1: ( 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1360:2: 'readonly' ( (lv_readonly_7= 'true' ) | 'false' ) ';'
                    {
                    match(input,22,FOLLOW_22_in_ruleCollectionDialogue2861); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1364:1: ( (lv_readonly_7= 'true' ) | 'false' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==23) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==24) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1364:1: ( (lv_readonly_7= 'true' ) | 'false' )", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1364:2: (lv_readonly_7= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1364:2: (lv_readonly_7= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1366:6: lv_readonly_7= 'true'
                            {
                            lv_readonly_7=(Token)input.LT(1);
                            match(input,23,FOLLOW_23_in_ruleCollectionDialogue2883); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1386:6: 'false'
                            {
                            match(input,24,FOLLOW_24_in_ruleCollectionDialogue2911); 

                                    createLeafNode(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleCollectionDialogue2921); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1394:3: ( 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1394:4: 'dialogues' '[' ( (lv_dialogues_12= ruleDialogueCall ) ';' )* ']'
                    {
                    match(input,29,FOLLOW_29_in_ruleCollectionDialogue2933); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleCollectionDialogue2942); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1402:1: ( (lv_dialogues_12= ruleDialogueCall ) ';' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_STRING||LA35_0==19||LA35_0==36||(LA35_0>=39 && LA35_0<=40)||(LA35_0>=42 && LA35_0<=43)||(LA35_0>=52 && LA35_0<=53)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1402:2: (lv_dialogues_12= ruleDialogueCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1402:2: (lv_dialogues_12= ruleDialogueCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1405:6: lv_dialogues_12= ruleDialogueCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue2977);
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

                    	    match(input,12,FOLLOW_12_in_ruleCollectionDialogue2990); 

                    	            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleCollectionDialogue3001); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1431:3: ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1431:4: 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']'
                    {
                    match(input,26,FOLLOW_26_in_ruleCollectionDialogue3013); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleCollectionDialogue3022); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1439:1: ( (lv_processes_17= ruleProcessCall ) ';' )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_STRING||LA37_0==14||LA37_0==36||(LA37_0>=39 && LA37_0<=40)||(LA37_0>=42 && LA37_0<=43)||(LA37_0>=52 && LA37_0<=53)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1439:2: (lv_processes_17= ruleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1439:2: (lv_processes_17= ruleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1442:6: lv_processes_17= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleCollectionDialogue3057);
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

                    	    match(input,12,FOLLOW_12_in_ruleCollectionDialogue3070); 

                    	            createLeafNode(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleCollectionDialogue3081); 

                            createLeafNode(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3(), null); 
                        

                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleCollectionDialogue3092); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1479:1: entryRuleMasterDetail returns [EObject current=null] : iv_ruleMasterDetail= ruleMasterDetail EOF ;
    public final EObject entryRuleMasterDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMasterDetail = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1479:54: (iv_ruleMasterDetail= ruleMasterDetail EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1480:2: iv_ruleMasterDetail= ruleMasterDetail EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMasterDetailRule(), currentNode); 
            pushFollow(FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail3125);
            iv_ruleMasterDetail=ruleMasterDetail();
            _fsp--;

             current =iv_ruleMasterDetail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterDetail3135); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1487:1: ruleMasterDetail returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ) ;
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
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1492:6: ( ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1493:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1493:1: ( (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1493:2: (lv_description_0= RULE_STRING )? 'MasterDetail' (lv_name_2= RULE_ID ) 'context' ( RULE_ID ) ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )? 'master' (lv_master_10= ruleDialogueCall ) ';' 'detail' (lv_detail_13= ruleDialogueCall ) ';' ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1493:2: (lv_description_0= RULE_STRING )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1495:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMasterDetail3182); 

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

            match(input,31,FOLLOW_31_in_ruleMasterDetail3200); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1517:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1519:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail3222); 

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

            match(input,20,FOLLOW_20_in_ruleMasterDetail3239); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getContextKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1541:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1544:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMasterDetailRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterDetail3261); 

            		createLeafNode(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1557:2: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1557:3: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) ';'
                    {
                    match(input,22,FOLLOW_22_in_ruleMasterDetail3274); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1561:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==23) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==24) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1561:1: ( (lv_readonly_6= 'true' ) | 'false' )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1561:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1561:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1563:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,23,FOLLOW_23_in_ruleMasterDetail3296); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1583:6: 'false'
                            {
                            match(input,24,FOLLOW_24_in_ruleMasterDetail3324); 

                                    createLeafNode(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_ruleMasterDetail3334); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2(), null); 
                        

                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_ruleMasterDetail3345); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getMasterKeyword_6(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1595:1: (lv_master_10= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1598:6: lv_master_10= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail3379);
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

            match(input,12,FOLLOW_12_in_ruleMasterDetail3392); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8(), null); 
                
            match(input,33,FOLLOW_33_in_ruleMasterDetail3401); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getDetailKeyword_9(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1624:1: (lv_detail_13= ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1627:6: lv_detail_13= ruleDialogueCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDialogueCall_in_ruleMasterDetail3435);
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

            match(input,12,FOLLOW_12_in_ruleMasterDetail3448); 

                    createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1649:1: ( 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1649:2: 'processes' '[' ( (lv_processes_17= ruleProcessCall ) ';' )* ']'
                    {
                    match(input,26,FOLLOW_26_in_ruleMasterDetail3458); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleMasterDetail3467); 

                            createLeafNode(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1657:1: ( (lv_processes_17= ruleProcessCall ) ';' )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_STRING||LA42_0==14||LA42_0==36||(LA42_0>=39 && LA42_0<=40)||(LA42_0>=42 && LA42_0<=43)||(LA42_0>=52 && LA42_0<=53)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1657:2: (lv_processes_17= ruleProcessCall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1657:2: (lv_processes_17= ruleProcessCall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1660:6: lv_processes_17= ruleProcessCall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProcessCall_in_ruleMasterDetail3502);
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

                    	    match(input,12,FOLLOW_12_in_ruleMasterDetail3515); 

                    	            createLeafNode(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleMasterDetail3526); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1693:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1693:49: (iv_ruleProcess= ruleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1694:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess3561);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess3571); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1701:1: ruleProcess returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'process' ( (lv_type_2= ruleProcessType ) | ( (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference ) ) )? (lv_name_5= RULE_ID ) 'context' (lv_collectionContext_7= 'list' )? ( RULE_ID ) ( ';' | ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' ) ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_5=null;
        Token lv_collectionContext_7=null;
        Enumerator lv_type_2 = null;

        Enumerator lv_type_3 = null;

        EObject lv_link_4 = null;

        EObject lv_processElements_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1706:6: ( ( (lv_description_0= RULE_STRING )? 'process' ( (lv_type_2= ruleProcessType ) | ( (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference ) ) )? (lv_name_5= RULE_ID ) 'context' (lv_collectionContext_7= 'list' )? ( RULE_ID ) ( ';' | ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' ) ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1707:1: ( (lv_description_0= RULE_STRING )? 'process' ( (lv_type_2= ruleProcessType ) | ( (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference ) ) )? (lv_name_5= RULE_ID ) 'context' (lv_collectionContext_7= 'list' )? ( RULE_ID ) ( ';' | ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' ) ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1707:1: ( (lv_description_0= RULE_STRING )? 'process' ( (lv_type_2= ruleProcessType ) | ( (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference ) ) )? (lv_name_5= RULE_ID ) 'context' (lv_collectionContext_7= 'list' )? ( RULE_ID ) ( ';' | ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1707:2: (lv_description_0= RULE_STRING )? 'process' ( (lv_type_2= ruleProcessType ) | ( (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference ) ) )? (lv_name_5= RULE_ID ) 'context' (lv_collectionContext_7= 'list' )? ( RULE_ID ) ( ';' | ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1707:2: (lv_description_0= RULE_STRING )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1709:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcess3618); 

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

            match(input,14,FOLLOW_14_in_ruleProcess3636); 

                    createLeafNode(grammarAccess.getProcessAccess().getProcessKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1731:1: ( (lv_type_2= ruleProcessType ) | ( (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference ) ) )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=44 && LA45_0<=50)) ) {
                alt45=1;
            }
            else if ( (LA45_0==51) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1731:2: (lv_type_2= ruleProcessType )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1731:2: (lv_type_2= ruleProcessType )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1734:6: lv_type_2= ruleProcessType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcessType_in_ruleProcess3671);
                    lv_type_2=ruleProcessType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_2, "ProcessType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1753:6: ( (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1753:6: ( (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference ) )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1753:7: (lv_type_3= ruleProcessTypeLink ) (lv_link_4= ruleAssociationRoleReference )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1753:7: (lv_type_3= ruleProcessTypeLink )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1756:6: lv_type_3= ruleProcessTypeLink
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getTypeProcessTypeLinkEnumRuleCall_2_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProcessTypeLink_in_ruleProcess3716);
                    lv_type_3=ruleProcessTypeLink();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_3, "ProcessTypeLink", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1774:2: (lv_link_4= ruleAssociationRoleReference )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1777:6: lv_link_4= ruleAssociationRoleReference
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getLinkAssociationRoleReferenceParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleProcess3754);
                    lv_link_4=ruleAssociationRoleReference();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "link", lv_link_4, "AssociationRoleReference", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1795:5: (lv_name_5= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1797:6: lv_name_5= RULE_ID
            {
            lv_name_5=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess3783); 

            		createLeafNode(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_5, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,20,FOLLOW_20_in_ruleProcess3800); 

                    createLeafNode(grammarAccess.getProcessAccess().getContextKeyword_4(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1819:1: (lv_collectionContext_7= 'list' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==21) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1821:6: lv_collectionContext_7= 'list'
                    {
                    lv_collectionContext_7=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleProcess3821); 

                            createLeafNode(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0(), "collectionContext"); 
                        

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1840:3: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1843:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess3857); 

            		createLeafNode(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_6_0(), "contextRef"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1856:2: ( ';' | ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==12) ) {
                alt48=1;
            }
            else if ( (LA48_0==16) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1856:2: ( ';' | ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' ) )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1856:3: ';'
                    {
                    match(input,12,FOLLOW_12_in_ruleProcess3870); 

                            createLeafNode(grammarAccess.getProcessAccess().getSemicolonKeyword_7_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1861:6: ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1861:6: ( '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1861:7: '[' ( (lv_processElements_11= ruleUICall ) ';' )* ']'
                    {
                    match(input,16,FOLLOW_16_in_ruleProcess3886); 

                            createLeafNode(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_7_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1865:1: ( (lv_processElements_11= ruleUICall ) ';' )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_STRING||LA47_0==14||LA47_0==19||LA47_0==36||(LA47_0>=39 && LA47_0<=40)||(LA47_0>=42 && LA47_0<=43)||(LA47_0>=52 && LA47_0<=53)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1865:2: (lv_processElements_11= ruleUICall ) ';'
                    	    {
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1865:2: (lv_processElements_11= ruleUICall )
                    	    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1868:6: lv_processElements_11= ruleUICall
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProcessAccess().getProcessElementsUICallParserRuleCall_7_1_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleUICall_in_ruleProcess3921);
                    	    lv_processElements_11=ruleUICall();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProcessRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "processElements", lv_processElements_11, "UICall", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }

                    	    match(input,12,FOLLOW_12_in_ruleProcess3934); 

                    	            createLeafNode(grammarAccess.getProcessAccess().getSemicolonKeyword_7_1_1_1(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleProcess3945); 

                            createLeafNode(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_7_1_2(), null); 
                        

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
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleFormElement
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1901:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1901:53: (iv_ruleFormElement= ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1902:2: iv_ruleFormElement= ruleFormElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement3980);
            iv_ruleFormElement=ruleFormElement();
            _fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement3990); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1909:1: ruleFormElement returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_label_4=null;
        Token lv_readonly_6=null;
        EObject lv_references_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1914:6: ( ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1915:1: ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1915:1: ( (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1915:2: (lv_description_0= RULE_STRING )? 'element' (lv_references_2= ruleDtoPropertyReference ) ( 'label' (lv_label_4= RULE_STRING ) )? ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )? ';'
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1915:2: (lv_description_0= RULE_STRING )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1917:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormElement4037); 

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

            match(input,34,FOLLOW_34_in_ruleFormElement4055); 

                    createLeafNode(grammarAccess.getFormElementAccess().getElementKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1939:1: (lv_references_2= ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1942:6: lv_references_2= ruleDtoPropertyReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_ruleFormElement4089);
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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1960:2: ( 'label' (lv_label_4= RULE_STRING ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==27) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1960:3: 'label' (lv_label_4= RULE_STRING )
                    {
                    match(input,27,FOLLOW_27_in_ruleFormElement4103); 

                            createLeafNode(grammarAccess.getFormElementAccess().getLabelKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1964:1: (lv_label_4= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1966:6: lv_label_4= RULE_STRING
                    {
                    lv_label_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormElement4125); 

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

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1984:4: ( 'readonly' ( (lv_readonly_6= 'true' ) | 'false' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==22) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1984:5: 'readonly' ( (lv_readonly_6= 'true' ) | 'false' )
                    {
                    match(input,22,FOLLOW_22_in_ruleFormElement4145); 

                            createLeafNode(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1988:1: ( (lv_readonly_6= 'true' ) | 'false' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==23) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==24) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1988:1: ( (lv_readonly_6= 'true' ) | 'false' )", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1988:2: (lv_readonly_6= 'true' )
                            {
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1988:2: (lv_readonly_6= 'true' )
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:1990:6: lv_readonly_6= 'true'
                            {
                            lv_readonly_6=(Token)input.LT(1);
                            match(input,23,FOLLOW_23_in_ruleFormElement4167); 

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
                            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2010:6: 'false'
                            {
                            match(input,24,FOLLOW_24_in_ruleFormElement4195); 

                                    createLeafNode(grammarAccess.getFormElementAccess().getFalseKeyword_4_1_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleFormElement4207); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2025:1: entryRuleActionDialogueCall returns [EObject current=null] : iv_ruleActionDialogueCall= ruleActionDialogueCall EOF ;
    public final EObject entryRuleActionDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2025:60: (iv_ruleActionDialogueCall= ruleActionDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2026:2: iv_ruleActionDialogueCall= ruleActionDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionDialogueCall_in_entryRuleActionDialogueCall4240);
            iv_ruleActionDialogueCall=ruleActionDialogueCall();
            _fsp--;

             current =iv_ruleActionDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDialogueCall4250); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2033:1: ruleActionDialogueCall returns [EObject current=null] : ( (lv_contextExp_0= ruleExpression )? 'form' (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleActionDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        EObject lv_contextExp_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2038:6: ( ( (lv_contextExp_0= ruleExpression )? 'form' (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:1: ( (lv_contextExp_0= ruleExpression )? 'form' (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:1: ( (lv_contextExp_0= ruleExpression )? 'form' (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:2: (lv_contextExp_0= ruleExpression )? 'form' (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2039:2: (lv_contextExp_0= ruleExpression )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=39 && LA53_0<=40)||(LA53_0>=42 && LA53_0<=43)||(LA53_0>=52 && LA53_0<=53)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2042:6: lv_contextExp_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionDialogueCallAccess().getContextExpExpressionParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleActionDialogueCall4309);
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

            match(input,19,FOLLOW_19_in_ruleActionDialogueCall4323); 

                    createLeafNode(grammarAccess.getActionDialogueCallAccess().getFormKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2064:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2066:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionDialogueCall4345); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2091:1: entryRuleDialogueCall returns [EObject current=null] : iv_ruleDialogueCall= ruleDialogueCall EOF ;
    public final EObject entryRuleDialogueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogueCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2091:54: (iv_ruleDialogueCall= ruleDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2092:2: iv_ruleDialogueCall= ruleDialogueCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDialogueCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall4386);
            iv_ruleDialogueCall=ruleDialogueCall();
            _fsp--;

             current =iv_ruleDialogueCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogueCall4396); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2099:1: ruleDialogueCall returns [EObject current=null] : ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'form' (lv_name_8= RULE_ID ) ) ;
    public final EObject ruleDialogueCall() throws RecognitionException {
        EObject current = null;

        Token lv_label_0=null;
        Token lv_name_8=null;
        EObject lv_condition_4 = null;

        EObject lv_contextExp_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2104:6: ( ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'form' (lv_name_8= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2105:1: ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'form' (lv_name_8= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2105:1: ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'form' (lv_name_8= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2105:2: ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'form' (lv_name_8= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2105:2: ( (lv_label_0= RULE_STRING ) ':' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2105:3: (lv_label_0= RULE_STRING ) ':'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2105:3: (lv_label_0= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2107:6: lv_label_0= RULE_STRING
                    {
                    lv_label_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDialogueCall4444); 

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

                    match(input,35,FOLLOW_35_in_ruleDialogueCall4461); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2129:3: ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2129:4: 'if' '(' (lv_condition_4= ruleOperationExpression ) ')'
                    {
                    match(input,36,FOLLOW_36_in_ruleDialogueCall4473); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0(), null); 
                        
                    match(input,37,FOLLOW_37_in_ruleDialogueCall4482); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2137:1: (lv_condition_4= ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2140:6: lv_condition_4= ruleOperationExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOperationExpression_in_ruleDialogueCall4516);
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

                    match(input,38,FOLLOW_38_in_ruleDialogueCall4529); 

                            createLeafNode(grammarAccess.getDialogueCallAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2162:3: (lv_contextExp_6= ruleExpression )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=39 && LA56_0<=40)||(LA56_0>=42 && LA56_0<=43)||(LA56_0>=52 && LA56_0<=53)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2165:6: lv_contextExp_6= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDialogueCallAccess().getContextExpExpressionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDialogueCall4565);
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

            match(input,19,FOLLOW_19_in_ruleDialogueCall4579); 

                    createLeafNode(grammarAccess.getDialogueCallAccess().getFormKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2187:1: (lv_name_8= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2189:6: lv_name_8= RULE_ID
            {
            lv_name_8=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDialogueCall4601); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2214:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2214:52: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2215:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4642);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4652); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2222:1: ruleExpression returns [EObject current=null] : (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceExpression_0 = null;

        EObject this_NavigationExpression_1 = null;

        EObject this_StandardExpression_2 = null;

        EObject this_OperationExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2227:6: ( (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2228:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2228:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt57=1;
                }
                break;
            case 42:
            case 43:
                {
                alt57=2;
                }
                break;
            case 52:
            case 53:
                {
                alt57=3;
                }
                break;
            case 39:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2228:1: (this_ServiceExpression_0= ruleServiceExpression | this_NavigationExpression_1= ruleNavigationExpression | this_StandardExpression_2= ruleStandardExpression | this_OperationExpression_3= ruleOperationExpression )", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2229:5: this_ServiceExpression_0= ruleServiceExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleServiceExpression_in_ruleExpression4699);
                    this_ServiceExpression_0=ruleServiceExpression();
                    _fsp--;

                     
                            current = this_ServiceExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2239:5: this_NavigationExpression_1= ruleNavigationExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNavigationExpression_in_ruleExpression4726);
                    this_NavigationExpression_1=ruleNavigationExpression();
                    _fsp--;

                     
                            current = this_NavigationExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2249:5: this_StandardExpression_2= ruleStandardExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStandardExpression_in_ruleExpression4753);
                    this_StandardExpression_2=ruleStandardExpression();
                    _fsp--;

                     
                            current = this_StandardExpression_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2259:5: this_OperationExpression_3= ruleOperationExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOperationExpression_in_ruleExpression4780);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2274:1: entryRuleProcessCall returns [EObject current=null] : iv_ruleProcessCall= ruleProcessCall EOF ;
    public final EObject entryRuleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2274:53: (iv_ruleProcessCall= ruleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2275:2: iv_ruleProcessCall= ruleProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcessCall_in_entryRuleProcessCall4812);
            iv_ruleProcessCall=ruleProcessCall();
            _fsp--;

             current =iv_ruleProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessCall4822); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2282:1: ruleProcessCall returns [EObject current=null] : ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' ( RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )? ) ;
    public final EObject ruleProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_label_0=null;
        Token lv_label_10=null;
        EObject lv_condition_4 = null;

        EObject lv_contextExp_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2287:6: ( ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' ( RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2288:1: ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' ( RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2288:1: ( ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' ( RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2288:2: ( (lv_label_0= RULE_STRING ) ':' )? ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )? (lv_contextExp_6= ruleExpression )? 'process' ( RULE_ID ) ( 'label' (lv_label_10= RULE_ID ) )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2288:2: ( (lv_label_0= RULE_STRING ) ':' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2288:3: (lv_label_0= RULE_STRING ) ':'
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2288:3: (lv_label_0= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2290:6: lv_label_0= RULE_STRING
                    {
                    lv_label_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcessCall4870); 

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

                    match(input,35,FOLLOW_35_in_ruleProcessCall4887); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2312:3: ( 'if' '(' (lv_condition_4= ruleOperationExpression ) ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==36) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2312:4: 'if' '(' (lv_condition_4= ruleOperationExpression ) ')'
                    {
                    match(input,36,FOLLOW_36_in_ruleProcessCall4899); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getIfKeyword_1_0(), null); 
                        
                    match(input,37,FOLLOW_37_in_ruleProcessCall4908); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2320:1: (lv_condition_4= ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2323:6: lv_condition_4= ruleOperationExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOperationExpression_in_ruleProcessCall4942);
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

                    match(input,38,FOLLOW_38_in_ruleProcessCall4955); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2345:3: (lv_contextExp_6= ruleExpression )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=39 && LA60_0<=40)||(LA60_0>=42 && LA60_0<=43)||(LA60_0>=52 && LA60_0<=53)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2348:6: lv_contextExp_6= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProcessCallAccess().getContextExpExpressionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProcessCall4991);
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

            match(input,14,FOLLOW_14_in_ruleProcessCall5005); 

                    createLeafNode(grammarAccess.getProcessCallAccess().getProcessKeyword_3(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2370:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2373:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProcessCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall5027); 

            		createLeafNode(grammarAccess.getProcessCallAccess().getReferredProcessAbstractProcessCrossReference_4_0(), "referredProcess"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2386:2: ( 'label' (lv_label_10= RULE_ID ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==27) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2386:3: 'label' (lv_label_10= RULE_ID )
                    {
                    match(input,27,FOLLOW_27_in_ruleProcessCall5040); 

                            createLeafNode(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2390:1: (lv_label_10= RULE_ID )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2392:6: lv_label_10= RULE_ID
                    {
                    lv_label_10=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessCall5062); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2417:1: entryRuleOperationExpression returns [EObject current=null] : iv_ruleOperationExpression= ruleOperationExpression EOF ;
    public final EObject entryRuleOperationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2417:61: (iv_ruleOperationExpression= ruleOperationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2418:2: iv_ruleOperationExpression= ruleOperationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression5105);
            iv_ruleOperationExpression=ruleOperationExpression();
            _fsp--;

             current =iv_ruleOperationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationExpression5115); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2425:1: ruleOperationExpression returns [EObject current=null] : ( 'call' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleOperationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2430:6: ( ( 'call' (lv_name_1= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2431:1: ( 'call' (lv_name_1= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2431:1: ( 'call' (lv_name_1= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2431:2: 'call' (lv_name_1= RULE_ID )
            {
            match(input,39,FOLLOW_39_in_ruleOperationExpression5149); 

                    createLeafNode(grammarAccess.getOperationExpressionAccess().getCallKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2435:1: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2437:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationExpression5171); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2462:1: entryRuleSimpleProcessCall returns [EObject current=null] : iv_ruleSimpleProcessCall= ruleSimpleProcessCall EOF ;
    public final EObject entryRuleSimpleProcessCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleProcessCall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2462:59: (iv_ruleSimpleProcessCall= ruleSimpleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2463:2: iv_ruleSimpleProcessCall= ruleSimpleProcessCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleProcessCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_entryRuleSimpleProcessCall5212);
            iv_ruleSimpleProcessCall=ruleSimpleProcessCall();
            _fsp--;

             current =iv_ruleSimpleProcessCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProcessCall5222); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2470:1: ruleSimpleProcessCall returns [EObject current=null] : ( ( RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )? ) ;
    public final EObject ruleSimpleProcessCall() throws RecognitionException {
        EObject current = null;

        Token lv_label_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2475:6: ( ( ( RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )? ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2476:1: ( ( RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )? )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2476:1: ( ( RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )? )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2476:2: ( RULE_ID ) ( 'label' (lv_label_2= RULE_STRING ) )?
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2476:2: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2479:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleProcessCallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleProcessCall5269); 

            		createLeafNode(grammarAccess.getSimpleProcessCallAccess().getReferredProcessAbstractProcessCrossReference_0_0(), "referredProcess"); 
            	

            }

            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2492:2: ( 'label' (lv_label_2= RULE_STRING ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==27) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2492:3: 'label' (lv_label_2= RULE_STRING )
                    {
                    match(input,27,FOLLOW_27_in_ruleSimpleProcessCall5282); 

                            createLeafNode(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0(), null); 
                        
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2496:1: (lv_label_2= RULE_STRING )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2498:6: lv_label_2= RULE_STRING
                    {
                    lv_label_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleProcessCall5304); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2523:1: entryRuleStandardExpression returns [EObject current=null] : iv_ruleStandardExpression= ruleStandardExpression EOF ;
    public final EObject entryRuleStandardExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2523:60: (iv_ruleStandardExpression= ruleStandardExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2524:2: iv_ruleStandardExpression= ruleStandardExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStandardExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression5347);
            iv_ruleStandardExpression=ruleStandardExpression();
            _fsp--;

             current =iv_ruleStandardExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardExpression5357); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2531:1: ruleStandardExpression returns [EObject current=null] : (lv_type_0= ruleExpressionType ) ;
    public final EObject ruleStandardExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2536:6: ( (lv_type_0= ruleExpressionType ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2537:1: (lv_type_0= ruleExpressionType )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2537:1: (lv_type_0= ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2540:6: lv_type_0= ruleExpressionType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpressionType_in_ruleStandardExpression5415);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2565:1: entryRuleServiceExpression returns [EObject current=null] : iv_ruleServiceExpression= ruleServiceExpression EOF ;
    public final EObject entryRuleServiceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2565:59: (iv_ruleServiceExpression= ruleServiceExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2566:2: iv_ruleServiceExpression= ruleServiceExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression5451);
            iv_ruleServiceExpression=ruleServiceExpression();
            _fsp--;

             current =iv_ruleServiceExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceExpression5461); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2573:1: ruleServiceExpression returns [EObject current=null] : ( 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID ) ) ;
    public final EObject ruleServiceExpression() throws RecognitionException {
        EObject current = null;

        Token lv_serviceName_1=null;
        Token lv_serviceMethod_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2578:6: ( ( 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2579:1: ( 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2579:1: ( 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2579:2: 'service' (lv_serviceName_1= RULE_ID ) '.' (lv_serviceMethod_3= RULE_ID )
            {
            match(input,40,FOLLOW_40_in_ruleServiceExpression5495); 

                    createLeafNode(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2583:1: (lv_serviceName_1= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2585:6: lv_serviceName_1= RULE_ID
            {
            lv_serviceName_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceExpression5517); 

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

            match(input,41,FOLLOW_41_in_ruleServiceExpression5534); 

                    createLeafNode(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2607:1: (lv_serviceMethod_3= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2609:6: lv_serviceMethod_3= RULE_ID
            {
            lv_serviceMethod_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceExpression5556); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2634:1: entryRuleNavigationExpression returns [EObject current=null] : iv_ruleNavigationExpression= ruleNavigationExpression EOF ;
    public final EObject entryRuleNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationExpression = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2634:62: (iv_ruleNavigationExpression= ruleNavigationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2635:2: iv_ruleNavigationExpression= ruleNavigationExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNavigationExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression5597);
            iv_ruleNavigationExpression=ruleNavigationExpression();
            _fsp--;

             current =iv_ruleNavigationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationExpression5607); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2642:1: ruleNavigationExpression returns [EObject current=null] : ( (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference ) ) ;
    public final EObject ruleNavigationExpression() throws RecognitionException {
        EObject current = null;

        Token lv_composition_0=null;
        EObject lv_references_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2647:6: ( ( (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2648:1: ( (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2648:1: ( (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2648:2: (lv_composition_0= 'composite' )? 'navigate' (lv_references_2= ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2648:2: (lv_composition_0= 'composite' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==42) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2650:6: lv_composition_0= 'composite'
                    {
                    lv_composition_0=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleNavigationExpression5653); 

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

            match(input,43,FOLLOW_43_in_ruleNavigationExpression5676); 

                    createLeafNode(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1(), null); 
                
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2673:1: (lv_references_2= ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2676:6: lv_references_2= ruleAssociationRoleReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression5710);
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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2701:1: entryRuleDtoPropertyReference returns [EObject current=null] : iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF ;
    public final EObject entryRuleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoPropertyReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2701:62: (iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2702:2: iv_ruleDtoPropertyReference= ruleDtoPropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference5747);
            iv_ruleDtoPropertyReference=ruleDtoPropertyReference();
            _fsp--;

             current =iv_ruleDtoPropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference5757); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2709:1: ruleDtoPropertyReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleDtoPropertyReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2714:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2715:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2715:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2717:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoPropertyReference5803); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2742:1: entryRuleAssociationRoleReference returns [EObject current=null] : iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF ;
    public final EObject entryRuleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationRoleReference = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2742:66: (iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2743:2: iv_ruleAssociationRoleReference= ruleAssociationRoleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRoleReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference5843);
            iv_ruleAssociationRoleReference=ruleAssociationRoleReference();
            _fsp--;

             current =iv_ruleAssociationRoleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference5853); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2750:1: ruleAssociationRoleReference returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2755:6: ( (lv_name_0= RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2756:1: (lv_name_0= RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2756:1: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2758:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationRoleReference5899); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2783:1: entryRuleUICall returns [EObject current=null] : iv_ruleUICall= ruleUICall EOF ;
    public final EObject entryRuleUICall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUICall = null;


        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2783:48: (iv_ruleUICall= ruleUICall EOF )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2784:2: iv_ruleUICall= ruleUICall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUICallRule(), currentNode); 
            pushFollow(FOLLOW_ruleUICall_in_entryRuleUICall5939);
            iv_ruleUICall=ruleUICall();
            _fsp--;

             current =iv_ruleUICall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUICall5949); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2791:1: ruleUICall returns [EObject current=null] : (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall ) ;
    public final EObject ruleUICall() throws RecognitionException {
        EObject current = null;

        EObject this_DialogueCall_0 = null;

        EObject this_ProcessCall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2796:6: ( (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )
            int alt64=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==35) ) {
                    switch ( input.LA(3) ) {
                    case 36:
                        {
                        int LA64_2 = input.LA(4);

                        if ( (LA64_2==37) ) {
                            int LA64_12 = input.LA(5);

                            if ( (LA64_12==39) ) {
                                int LA64_16 = input.LA(6);

                                if ( (LA64_16==RULE_ID) ) {
                                    int LA64_18 = input.LA(7);

                                    if ( (LA64_18==38) ) {
                                        switch ( input.LA(8) ) {
                                        case 40:
                                            {
                                            int LA64_3 = input.LA(9);

                                            if ( (LA64_3==RULE_ID) ) {
                                                int LA64_13 = input.LA(10);

                                                if ( (LA64_13==41) ) {
                                                    int LA64_17 = input.LA(11);

                                                    if ( (LA64_17==RULE_ID) ) {
                                                        int LA64_19 = input.LA(12);

                                                        if ( (LA64_19==14) ) {
                                                            alt64=2;
                                                        }
                                                        else if ( (LA64_19==19) ) {
                                                            alt64=1;
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 19, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 17, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 13, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 3, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 42:
                                            {
                                            int LA64_4 = input.LA(9);

                                            if ( (LA64_4==43) ) {
                                                int LA64_5 = input.LA(10);

                                                if ( (LA64_5==RULE_ID) ) {
                                                    int LA64_14 = input.LA(11);

                                                    if ( (LA64_14==19) ) {
                                                        alt64=1;
                                                    }
                                                    else if ( (LA64_14==14) ) {
                                                        alt64=2;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 14, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 5, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 4, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 43:
                                            {
                                            int LA64_5 = input.LA(9);

                                            if ( (LA64_5==RULE_ID) ) {
                                                int LA64_14 = input.LA(10);

                                                if ( (LA64_14==19) ) {
                                                    alt64=1;
                                                }
                                                else if ( (LA64_14==14) ) {
                                                    alt64=2;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 14, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 5, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 52:
                                            {
                                            int LA64_6 = input.LA(9);

                                            if ( (LA64_6==19) ) {
                                                alt64=1;
                                            }
                                            else if ( (LA64_6==14) ) {
                                                alt64=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 6, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 53:
                                            {
                                            int LA64_7 = input.LA(9);

                                            if ( (LA64_7==14) ) {
                                                alt64=2;
                                            }
                                            else if ( (LA64_7==19) ) {
                                                alt64=1;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 7, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 39:
                                            {
                                            int LA64_8 = input.LA(9);

                                            if ( (LA64_8==RULE_ID) ) {
                                                int LA64_15 = input.LA(10);

                                                if ( (LA64_15==14) ) {
                                                    alt64=2;
                                                }
                                                else if ( (LA64_15==19) ) {
                                                    alt64=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 15, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 8, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 19:
                                            {
                                            alt64=1;
                                            }
                                            break;
                                        case 14:
                                            {
                                            alt64=2;
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 20, input);

                                            throw nvae;
                                        }

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 18, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 12, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 40:
                        {
                        int LA64_3 = input.LA(4);

                        if ( (LA64_3==RULE_ID) ) {
                            int LA64_13 = input.LA(5);

                            if ( (LA64_13==41) ) {
                                int LA64_17 = input.LA(6);

                                if ( (LA64_17==RULE_ID) ) {
                                    int LA64_19 = input.LA(7);

                                    if ( (LA64_19==14) ) {
                                        alt64=2;
                                    }
                                    else if ( (LA64_19==19) ) {
                                        alt64=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 19, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 13, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                        {
                        int LA64_4 = input.LA(4);

                        if ( (LA64_4==43) ) {
                            int LA64_5 = input.LA(5);

                            if ( (LA64_5==RULE_ID) ) {
                                int LA64_14 = input.LA(6);

                                if ( (LA64_14==19) ) {
                                    alt64=1;
                                }
                                else if ( (LA64_14==14) ) {
                                    alt64=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 14, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 43:
                        {
                        int LA64_5 = input.LA(4);

                        if ( (LA64_5==RULE_ID) ) {
                            int LA64_14 = input.LA(5);

                            if ( (LA64_14==19) ) {
                                alt64=1;
                            }
                            else if ( (LA64_14==14) ) {
                                alt64=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                        {
                        int LA64_6 = input.LA(4);

                        if ( (LA64_6==19) ) {
                            alt64=1;
                        }
                        else if ( (LA64_6==14) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 53:
                        {
                        int LA64_7 = input.LA(4);

                        if ( (LA64_7==14) ) {
                            alt64=2;
                        }
                        else if ( (LA64_7==19) ) {
                            alt64=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 39:
                        {
                        int LA64_8 = input.LA(4);

                        if ( (LA64_8==RULE_ID) ) {
                            int LA64_15 = input.LA(5);

                            if ( (LA64_15==14) ) {
                                alt64=2;
                            }
                            else if ( (LA64_15==19) ) {
                                alt64=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                        {
                        alt64=2;
                        }
                        break;
                    case 19:
                        {
                        alt64=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 11, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 1, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==37) ) {
                    int LA64_12 = input.LA(3);

                    if ( (LA64_12==39) ) {
                        int LA64_16 = input.LA(4);

                        if ( (LA64_16==RULE_ID) ) {
                            int LA64_18 = input.LA(5);

                            if ( (LA64_18==38) ) {
                                switch ( input.LA(6) ) {
                                case 40:
                                    {
                                    int LA64_3 = input.LA(7);

                                    if ( (LA64_3==RULE_ID) ) {
                                        int LA64_13 = input.LA(8);

                                        if ( (LA64_13==41) ) {
                                            int LA64_17 = input.LA(9);

                                            if ( (LA64_17==RULE_ID) ) {
                                                int LA64_19 = input.LA(10);

                                                if ( (LA64_19==14) ) {
                                                    alt64=2;
                                                }
                                                else if ( (LA64_19==19) ) {
                                                    alt64=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 19, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 17, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 13, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 3, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 42:
                                    {
                                    int LA64_4 = input.LA(7);

                                    if ( (LA64_4==43) ) {
                                        int LA64_5 = input.LA(8);

                                        if ( (LA64_5==RULE_ID) ) {
                                            int LA64_14 = input.LA(9);

                                            if ( (LA64_14==19) ) {
                                                alt64=1;
                                            }
                                            else if ( (LA64_14==14) ) {
                                                alt64=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 14, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 4, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 43:
                                    {
                                    int LA64_5 = input.LA(7);

                                    if ( (LA64_5==RULE_ID) ) {
                                        int LA64_14 = input.LA(8);

                                        if ( (LA64_14==19) ) {
                                            alt64=1;
                                        }
                                        else if ( (LA64_14==14) ) {
                                            alt64=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 14, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 5, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 52:
                                    {
                                    int LA64_6 = input.LA(7);

                                    if ( (LA64_6==19) ) {
                                        alt64=1;
                                    }
                                    else if ( (LA64_6==14) ) {
                                        alt64=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 6, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 53:
                                    {
                                    int LA64_7 = input.LA(7);

                                    if ( (LA64_7==14) ) {
                                        alt64=2;
                                    }
                                    else if ( (LA64_7==19) ) {
                                        alt64=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 7, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 39:
                                    {
                                    int LA64_8 = input.LA(7);

                                    if ( (LA64_8==RULE_ID) ) {
                                        int LA64_15 = input.LA(8);

                                        if ( (LA64_15==14) ) {
                                            alt64=2;
                                        }
                                        else if ( (LA64_15==19) ) {
                                            alt64=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 15, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 8, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 19:
                                    {
                                    alt64=1;
                                    }
                                    break;
                                case 14:
                                    {
                                    alt64=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 20, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 12, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                int LA64_3 = input.LA(2);

                if ( (LA64_3==RULE_ID) ) {
                    int LA64_13 = input.LA(3);

                    if ( (LA64_13==41) ) {
                        int LA64_17 = input.LA(4);

                        if ( (LA64_17==RULE_ID) ) {
                            int LA64_19 = input.LA(5);

                            if ( (LA64_19==14) ) {
                                alt64=2;
                            }
                            else if ( (LA64_19==19) ) {
                                alt64=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 17, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 13, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 3, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA64_4 = input.LA(2);

                if ( (LA64_4==43) ) {
                    int LA64_5 = input.LA(3);

                    if ( (LA64_5==RULE_ID) ) {
                        int LA64_14 = input.LA(4);

                        if ( (LA64_14==19) ) {
                            alt64=1;
                        }
                        else if ( (LA64_14==14) ) {
                            alt64=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 4, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                int LA64_5 = input.LA(2);

                if ( (LA64_5==RULE_ID) ) {
                    int LA64_14 = input.LA(3);

                    if ( (LA64_14==19) ) {
                        alt64=1;
                    }
                    else if ( (LA64_14==14) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 14, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 5, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA64_6 = input.LA(2);

                if ( (LA64_6==19) ) {
                    alt64=1;
                }
                else if ( (LA64_6==14) ) {
                    alt64=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 6, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA64_7 = input.LA(2);

                if ( (LA64_7==14) ) {
                    alt64=2;
                }
                else if ( (LA64_7==19) ) {
                    alt64=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 7, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA64_8 = input.LA(2);

                if ( (LA64_8==RULE_ID) ) {
                    int LA64_15 = input.LA(3);

                    if ( (LA64_15==14) ) {
                        alt64=2;
                    }
                    else if ( (LA64_15==19) ) {
                        alt64=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 15, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 8, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt64=1;
                }
                break;
            case 14:
                {
                alt64=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2797:1: (this_DialogueCall_0= ruleDialogueCall | this_ProcessCall_1= ruleProcessCall )", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2798:5: this_DialogueCall_0= ruleDialogueCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUICallAccess().getDialogueCallParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDialogueCall_in_ruleUICall5996);
                    this_DialogueCall_0=ruleDialogueCall();
                    _fsp--;

                     
                            current = this_DialogueCall_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2808:5: this_ProcessCall_1= ruleProcessCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUICallAccess().getProcessCallParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcessCall_in_ruleUICall6023);
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
    // $ANTLR end ruleUICall


    // $ANTLR start ruleProcessType
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2823:1: ruleProcessType returns [Enumerator current=null] : ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) ) ;
    public final Enumerator ruleProcessType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2827:6: ( ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2828:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2828:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) )
            int alt65=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt65=1;
                }
                break;
            case 45:
                {
                alt65=2;
                }
                break;
            case 46:
                {
                alt65=3;
                }
                break;
            case 47:
                {
                alt65=4;
                }
                break;
            case 48:
                {
                alt65=5;
                }
                break;
            case 49:
                {
                alt65=6;
                }
                break;
            case 50:
                {
                alt65=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2828:1: ( ( 'new' ) | ( 'save' ) | ( 'edit' ) | ( 'delete' ) | ( 'cancel' ) | ( 'removefrom' ) | ( 'addto' ) )", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2828:2: ( 'new' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2828:2: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2828:4: 'new'
                    {
                    match(input,44,FOLLOW_44_in_ruleProcessType6069); 

                            current = grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2834:6: ( 'save' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2834:6: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2834:8: 'save'
                    {
                    match(input,45,FOLLOW_45_in_ruleProcessType6084); 

                            current = grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2840:6: ( 'edit' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2840:6: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2840:8: 'edit'
                    {
                    match(input,46,FOLLOW_46_in_ruleProcessType6099); 

                            current = grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2846:6: ( 'delete' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2846:6: ( 'delete' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2846:8: 'delete'
                    {
                    match(input,47,FOLLOW_47_in_ruleProcessType6114); 

                            current = grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2852:6: ( 'cancel' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2852:6: ( 'cancel' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2852:8: 'cancel'
                    {
                    match(input,48,FOLLOW_48_in_ruleProcessType6129); 

                            current = grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2858:6: ( 'removefrom' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2858:6: ( 'removefrom' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2858:8: 'removefrom'
                    {
                    match(input,49,FOLLOW_49_in_ruleProcessType6144); 

                            current = grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2864:6: ( 'addto' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2864:6: ( 'addto' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2864:8: 'addto'
                    {
                    match(input,50,FOLLOW_50_in_ruleProcessType6159); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2874:1: ruleProcessTypeLink returns [Enumerator current=null] : ( 'link' ) ;
    public final Enumerator ruleProcessTypeLink() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2878:6: ( ( 'link' ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2879:1: ( 'link' )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2879:1: ( 'link' )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2879:3: 'link'
            {
            match(input,51,FOLLOW_51_in_ruleProcessTypeLink6201); 

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
    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2889:1: ruleExpressionType returns [Enumerator current=null] : ( ( 'all' ) | ( 'find' ) ) ;
    public final Enumerator ruleExpressionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2893:6: ( ( ( 'all' ) | ( 'find' ) ) )
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2894:1: ( ( 'all' ) | ( 'find' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2894:1: ( ( 'all' ) | ( 'find' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==52) ) {
                alt66=1;
            }
            else if ( (LA66_0==53) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2894:1: ( ( 'all' ) | ( 'find' ) )", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2894:2: ( 'all' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2894:2: ( 'all' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2894:4: 'all'
                    {
                    match(input,52,FOLLOW_52_in_ruleExpressionType6243); 

                            current = grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2900:6: ( 'find' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2900:6: ( 'find' )
                    // ../org.mod4j.dsl.presentation.xtext/src-gen/org/mod4j/dsl/presentation/xtext/parser/antlr/internal/InternalPresentation.g:2900:8: 'find'
                    {
                    match(input,53,FOLLOW_53_in_ruleExpressionType6258); 

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
    public static final BitSet FOLLOW_12_in_ruleApplicationModel303 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleProcessReference_in_ruleApplicationModel337 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleApplicationModel376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessReference_in_entryRuleProcessReference413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessReference423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleProcessReference457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessReference479 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcessReference496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessReference518 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcessReference535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormsAndProcesses_in_entryRuleFormsAndProcesses568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormsAndProcesses578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormsAndProcesses625 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFormsAndProcesses643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormsAndProcesses665 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFormsAndProcesses682 = new BitSet(new long[]{0x00000000D0086812L});
    public static final BitSet FOLLOW_ruleExternalReference_in_ruleFormsAndProcesses716 = new BitSet(new long[]{0x00000000D0086812L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleFormsAndProcesses755 = new BitSet(new long[]{0x00000000D0084012L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_ruleFormsAndProcesses794 = new BitSet(new long[]{0x00000000D0084012L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleApplication876 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleApplication885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_ruleApplication919 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication932 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_ruleApplication967 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplication980 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleApplication991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExternalReference1068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference1090 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExternalReference1107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference1129 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_ruleUIModelElement1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleUIModelElement1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_entryRuleDialogue1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogue1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_ruleDialogue1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_ruleDialogue1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_entryRuleContentForm1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentForm1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContentForm1555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContentForm1573 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm1595 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContentForm1612 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleContentForm1633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentForm1669 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleContentForm1681 = new BitSet(new long[]{0x0000000406420010L});
    public static final BitSet FOLLOW_22_in_ruleContentForm1691 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleContentForm1713 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24_in_ruleContentForm1741 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1751 = new BitSet(new long[]{0x0000000406020010L});
    public static final BitSet FOLLOW_ruleFormElement_in_ruleContentForm1787 = new BitSet(new long[]{0x0000000406020010L});
    public static final BitSet FOLLOW_25_in_ruleContentForm1802 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleContentForm1811 = new BitSet(new long[]{0x0007F00000020030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleContentForm1846 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1859 = new BitSet(new long[]{0x0007F00000020030L});
    public static final BitSet FOLLOW_17_in_ruleContentForm1870 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleContentForm1882 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleContentForm1891 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_ruleContentForm1926 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContentForm1939 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleContentForm1950 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContentForm1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction2051 = new BitSet(new long[]{0x0007F00000000020L});
    public static final BitSet FOLLOW_ruleProcessType_in_ruleAction2094 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2121 = new BitSet(new long[]{0x00300D8008080002L});
    public static final BitSet FOLLOW_27_in_ruleAction2139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction2161 = new BitSet(new long[]{0x00300D8000080002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_ruleAction2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue2243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundDialogue2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompoundDialogue2301 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCompoundDialogue2319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue2341 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompoundDialogue2358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundDialogue2380 = new BitSet(new long[]{0x0000000024400002L});
    public static final BitSet FOLLOW_22_in_ruleCompoundDialogue2393 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleCompoundDialogue2415 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24_in_ruleCompoundDialogue2443 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue2453 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_ruleCompoundDialogue2465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompoundDialogue2474 = new BitSet(new long[]{0x00300D90000A0010L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCompoundDialogue2509 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue2522 = new BitSet(new long[]{0x00300D90000A0010L});
    public static final BitSet FOLLOW_17_in_ruleCompoundDialogue2533 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleCompoundDialogue2545 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompoundDialogue2554 = new BitSet(new long[]{0x00300D9000024010L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCompoundDialogue2589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCompoundDialogue2602 = new BitSet(new long[]{0x00300D9000024010L});
    public static final BitSet FOLLOW_17_in_ruleCompoundDialogue2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_ruleCompoundDialogue2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_ruleCompoundDialogue2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionDialogue2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollectionDialogue2760 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCollectionDialogue2778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue2800 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCollectionDialogue2817 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectionDialogue2839 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionDialogue2851 = new BitSet(new long[]{0x0000000024420000L});
    public static final BitSet FOLLOW_22_in_ruleCollectionDialogue2861 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleCollectionDialogue2883 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24_in_ruleCollectionDialogue2911 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue2921 = new BitSet(new long[]{0x0000000024020000L});
    public static final BitSet FOLLOW_29_in_ruleCollectionDialogue2933 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionDialogue2942 = new BitSet(new long[]{0x00300D90000A0010L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleCollectionDialogue2977 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue2990 = new BitSet(new long[]{0x00300D90000A0010L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue3001 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleCollectionDialogue3013 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectionDialogue3022 = new BitSet(new long[]{0x00300D9000024010L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleCollectionDialogue3057 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollectionDialogue3070 = new BitSet(new long[]{0x00300D9000024010L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue3081 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCollectionDialogue3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail3125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterDetail3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMasterDetail3182 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMasterDetail3200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail3222 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMasterDetail3239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterDetail3261 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_22_in_ruleMasterDetail3274 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleMasterDetail3296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24_in_ruleMasterDetail3324 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail3334 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMasterDetail3345 = new BitSet(new long[]{0x00300D9000080010L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail3379 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail3392 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMasterDetail3401 = new BitSet(new long[]{0x00300D9000080010L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleMasterDetail3435 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail3448 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleMasterDetail3458 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMasterDetail3467 = new BitSet(new long[]{0x00300D9000024010L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleMasterDetail3502 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMasterDetail3515 = new BitSet(new long[]{0x00300D9000024010L});
    public static final BitSet FOLLOW_17_in_ruleMasterDetail3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess3561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcess3618 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcess3636 = new BitSet(new long[]{0x000FF00000000020L});
    public static final BitSet FOLLOW_ruleProcessType_in_ruleProcess3671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_ruleProcess3716 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleProcess3754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess3783 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleProcess3800 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleProcess3821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess3857 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleProcess3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProcess3886 = new BitSet(new long[]{0x00300D90000A4010L});
    public static final BitSet FOLLOW_ruleUICall_in_ruleProcess3921 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcess3934 = new BitSet(new long[]{0x00300D90000A4010L});
    public static final BitSet FOLLOW_17_in_ruleProcess3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement3980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormElement4037 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFormElement4055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_ruleFormElement4089 = new BitSet(new long[]{0x0000000008401000L});
    public static final BitSet FOLLOW_27_in_ruleFormElement4103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormElement4125 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleFormElement4145 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleFormElement4167 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24_in_ruleFormElement4195 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFormElement4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_entryRuleActionDialogueCall4240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDialogueCall4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleActionDialogueCall4309 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActionDialogueCall4323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionDialogueCall4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall4386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogueCall4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDialogueCall4444 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDialogueCall4461 = new BitSet(new long[]{0x00300D9000080000L});
    public static final BitSet FOLLOW_36_in_ruleDialogueCall4473 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDialogueCall4482 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_ruleDialogueCall4516 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDialogueCall4529 = new BitSet(new long[]{0x00300D8000080000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDialogueCall4565 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDialogueCall4579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDialogueCall4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_ruleExpression4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_ruleExpression4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_ruleExpression4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_ruleExpression4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_entryRuleProcessCall4812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessCall4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcessCall4870 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleProcessCall4887 = new BitSet(new long[]{0x00300D9000004000L});
    public static final BitSet FOLLOW_36_in_ruleProcessCall4899 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleProcessCall4908 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_ruleProcessCall4942 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleProcessCall4955 = new BitSet(new long[]{0x00300D8000004000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProcessCall4991 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcessCall5005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall5027 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleProcessCall5040 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessCall5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression5105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationExpression5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperationExpression5149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationExpression5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_entryRuleSimpleProcessCall5212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProcessCall5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleProcessCall5269 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleSimpleProcessCall5282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleProcessCall5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression5347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardExpression5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_ruleStandardExpression5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceExpression5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleServiceExpression5495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceExpression5517 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleServiceExpression5534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceExpression5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression5597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationExpression5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNavigationExpression5653 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleNavigationExpression5676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_ruleNavigationExpression5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference5747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoPropertyReference5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference5843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationRoleReference5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_entryRuleUICall5939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUICall5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_ruleUICall5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_ruleUICall6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleProcessType6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleProcessType6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleProcessType6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleProcessType6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleProcessType6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleProcessType6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleProcessType6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleProcessTypeLink6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExpressionType6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExpressionType6258 = new BitSet(new long[]{0x0000000000000002L});

}