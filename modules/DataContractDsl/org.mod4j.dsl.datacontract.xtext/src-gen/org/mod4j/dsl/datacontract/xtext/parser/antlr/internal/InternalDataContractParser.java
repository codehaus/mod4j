package org.mod4j.dsl.datacontract.xtext.parser.antlr.internal; 

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
import org.mod4j.dsl.datacontract.xtext.services.DataContractGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalDataContractParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datacontract'", "';'", "'from'", "'import'", "'class'", "'represents'", "'['", "'references'", "']'", "'enumeration'", "'as'", "'custom'", "'boolean'", "'string'", "'datetime'", "'integer'", "'decimal'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalDataContractParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g"; }


     
     	private DataContractGrammarAccess grammarAccess;
     	
        public InternalDataContractParser(TokenStream input, IAstFactory factory, DataContractGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DataContractModel";	
       	} 



    // $ANTLR start entryRuleDataContractModel
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:72:1: entryRuleDataContractModel returns [EObject current=null] : iv_ruleDataContractModel= ruleDataContractModel EOF ;
    public final EObject entryRuleDataContractModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataContractModel = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:72:59: (iv_ruleDataContractModel= ruleDataContractModel EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:73:2: iv_ruleDataContractModel= ruleDataContractModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataContractModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataContractModel_in_entryRuleDataContractModel73);
            iv_ruleDataContractModel=ruleDataContractModel();
            _fsp--;

             current =iv_ruleDataContractModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataContractModel83); 

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
    // $ANTLR end entryRuleDataContractModel


    // $ANTLR start ruleDataContractModel
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:80:1: ruleDataContractModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )* ) ;
    public final EObject ruleDataContractModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_externalReferences_4 = null;

        EObject lv_dtos_5 = null;

        EObject lv_enumerations_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:85:6: ( ( (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )* ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:86:1: ( (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )* )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:86:1: ( (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )* )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:86:2: (lv_description_0= RULE_STRING )? 'datacontract' (lv_name_2= RULE_ID ) ';' (lv_externalReferences_4= ruleExternalReference )* ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )*
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:86:2: (lv_description_0= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:88:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataContractModel130); 

                    		createLeafNode(grammarAccess.getDataContractModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
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

            match(input,11,FOLLOW_11_in_ruleDataContractModel148); 

                    createLeafNode(grammarAccess.getDataContractModelAccess().getDatacontractKeyword_1(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:110:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:112:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataContractModel170); 

            		createLeafNode(grammarAccess.getDataContractModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleDataContractModel187); 

                    createLeafNode(grammarAccess.getDataContractModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:134:1: (lv_externalReferences_4= ruleExternalReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==13) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:137:6: lv_externalReferences_4= ruleExternalReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataContractModelAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalReference_in_ruleDataContractModel221);
            	    lv_externalReferences_4=ruleExternalReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:155:3: ( (lv_dtos_5= ruleDto ) | (lv_enumerations_6= ruleEnumerationDto ) )*
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==15||LA3_2==22) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==20) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 15:
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 20:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:155:4: (lv_dtos_5= ruleDto )
            	    {
            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:155:4: (lv_dtos_5= ruleDto )
            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:158:6: lv_dtos_5= ruleDto
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataContractModelAccess().getDtosDtoParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDto_in_ruleDataContractModel261);
            	    lv_dtos_5=ruleDto();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "dtos", lv_dtos_5, "Dto", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:177:6: (lv_enumerations_6= ruleEnumerationDto )
            	    {
            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:177:6: (lv_enumerations_6= ruleEnumerationDto )
            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:180:6: lv_enumerations_6= ruleEnumerationDto
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDataContractModelAccess().getEnumerationsEnumerationDtoParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationDto_in_ruleDataContractModel305);
            	    lv_enumerations_6=ruleEnumerationDto();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDataContractModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "enumerations", lv_enumerations_6, "EnumerationDto", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


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
    // $ANTLR end ruleDataContractModel


    // $ANTLR start entryRuleDto
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:205:1: entryRuleDto returns [EObject current=null] : iv_ruleDto= ruleDto EOF ;
    public final EObject entryRuleDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDto = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:205:45: (iv_ruleDto= ruleDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:206:2: iv_ruleDto= ruleDto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoRule(), currentNode); 
            pushFollow(FOLLOW_ruleDto_in_entryRuleDto344);
            iv_ruleDto=ruleDto();
            _fsp--;

             current =iv_ruleDto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDto354); 

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
    // $ANTLR end entryRuleDto


    // $ANTLR start ruleDto
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:213:1: ruleDto returns [EObject current=null] : (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto ) ;
    public final EObject ruleDto() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessClassDto_0 = null;

        EObject this_CustomDto_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:218:6: ( (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:219:1: (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:219:1: (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=2;
                }
                else if ( (LA4_1==15) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("219:1: (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto )", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("219:1: (this_BusinessClassDto_0= ruleBusinessClassDto | this_CustomDto_1= ruleCustomDto )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:220:5: this_BusinessClassDto_0= ruleBusinessClassDto
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoAccess().getBusinessClassDtoParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBusinessClassDto_in_ruleDto401);
                    this_BusinessClassDto_0=ruleBusinessClassDto();
                    _fsp--;

                     
                            current = this_BusinessClassDto_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:230:5: this_CustomDto_1= ruleCustomDto
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoAccess().getCustomDtoParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomDto_in_ruleDto428);
                    this_CustomDto_1=ruleCustomDto();
                    _fsp--;

                     
                            current = this_CustomDto_1; 
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
    // $ANTLR end ruleDto


    // $ANTLR start entryRuleExternalReference
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:245:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:245:59: (iv_ruleExternalReference= ruleExternalReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:246:2: iv_ruleExternalReference= ruleExternalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference460);
            iv_ruleExternalReference=ruleExternalReference();
            _fsp--;

             current =iv_ruleExternalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference470); 

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
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:253:1: ruleExternalReference returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) 'import' (lv_name_4= RULE_ID ) ';' ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_modelname_2=null;
        Token lv_name_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:258:6: ( ( (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) 'import' (lv_name_4= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:259:1: ( (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) 'import' (lv_name_4= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:259:1: ( (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) 'import' (lv_name_4= RULE_ID ) ';' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:259:2: (lv_description_0= RULE_STRING )? 'from' (lv_modelname_2= RULE_ID ) 'import' (lv_name_4= RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:259:2: (lv_description_0= RULE_STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:261:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExternalReference517); 

                    		createLeafNode(grammarAccess.getExternalReferenceAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
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

            match(input,13,FOLLOW_13_in_ruleExternalReference535); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getFromKeyword_1(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:283:1: (lv_modelname_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:285:6: lv_modelname_2= RULE_ID
            {
            lv_modelname_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference557); 

            		createLeafNode(grammarAccess.getExternalReferenceAccess().getModelnameIDTerminalRuleCall_2_0(), "modelname"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "modelname", lv_modelname_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,14,FOLLOW_14_in_ruleExternalReference574); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getImportKeyword_3(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:307:1: (lv_name_4= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:309:6: lv_name_4= RULE_ID
            {
            lv_name_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalReference596); 

            		createLeafNode(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_4, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleExternalReference613); 

                    createLeafNode(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_5(), null); 
                

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


    // $ANTLR start entryRuleBusinessClassDto
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:338:1: entryRuleBusinessClassDto returns [EObject current=null] : iv_ruleBusinessClassDto= ruleBusinessClassDto EOF ;
    public final EObject entryRuleBusinessClassDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClassDto = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:338:58: (iv_ruleBusinessClassDto= ruleBusinessClassDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:339:2: iv_ruleBusinessClassDto= ruleBusinessClassDto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassDtoRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClassDto_in_entryRuleBusinessClassDto646);
            iv_ruleBusinessClassDto=ruleBusinessClassDto();
            _fsp--;

             current =iv_ruleBusinessClassDto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassDto656); 

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
    // $ANTLR end entryRuleBusinessClassDto


    // $ANTLR start ruleBusinessClassDto
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:346:1: ruleBusinessClassDto returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) ) ) ;
    public final EObject ruleBusinessClassDto() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_propertyReferences_7 = null;

        EObject lv_associationReferences_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:351:6: ( ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) ) ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:352:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:352:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:352:2: (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:352:2: (lv_description_0= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:354:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessClassDto703); 

                    		createLeafNode(grammarAccess.getBusinessClassDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
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

            match(input,15,FOLLOW_15_in_ruleBusinessClassDto721); 

                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getClassKeyword_1(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:376:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:378:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassDto743); 

            		createLeafNode(grammarAccess.getBusinessClassDtoAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,16,FOLLOW_16_in_ruleBusinessClassDto760); 

                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getRepresentsKeyword_3(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:400:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:403:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassDto782); 

            		createLeafNode(grammarAccess.getBusinessClassDtoAccess().getBaseExternalReferenceCrossReference_4_0(), "base"); 
            	

            }

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:416:2: ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("416:2: ( ';' | ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:416:3: ';'
                    {
                    match(input,12,FOLLOW_12_in_ruleBusinessClassDto795); 

                            createLeafNode(grammarAccess.getBusinessClassDtoAccess().getSemicolonKeyword_5_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:421:6: ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' )
                    {
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:421:6: ( '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']' )
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:421:7: '[' (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+ ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )? ']'
                    {
                    match(input,17,FOLLOW_17_in_ruleBusinessClassDto811); 

                            createLeafNode(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_0(), null); 
                        
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:425:1: (lv_propertyReferences_7= ruleBusinessClassPropertyReference )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:428:6: lv_propertyReferences_7= ruleBusinessClassPropertyReference
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassDtoAccess().getPropertyReferencesBusinessClassPropertyReferenceParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_ruleBusinessClassDto845);
                    	    lv_propertyReferences_7=ruleBusinessClassPropertyReference();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "propertyReferences", lv_propertyReferences_7, "BusinessClassPropertyReference", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:446:3: ( 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:446:4: 'references' '[' (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+ ']'
                            {
                            match(input,18,FOLLOW_18_in_ruleBusinessClassDto860); 

                                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getReferencesKeyword_5_1_2_0(), null); 
                                
                            match(input,17,FOLLOW_17_in_ruleBusinessClassDto869); 

                                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getLeftSquareBracketKeyword_5_1_2_1(), null); 
                                
                            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:454:1: (lv_associationReferences_10= ruleBusinessClassAssociationRoleReference )+
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==RULE_ID) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:457:6: lv_associationReferences_10= ruleBusinessClassAssociationRoleReference
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassDtoAccess().getAssociationReferencesBusinessClassAssociationRoleReferenceParserRuleCall_5_1_2_2_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_ruleBusinessClassDto903);
                            	    lv_associationReferences_10=ruleBusinessClassAssociationRoleReference();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getBusinessClassDtoRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        
                            	    	        try {
                            	    	       		add(current, "associationReferences", lv_associationReferences_10, "BusinessClassAssociationRoleReference", currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt8 >= 1 ) break loop8;
                                        EarlyExitException eee =
                                            new EarlyExitException(8, input);
                                        throw eee;
                                }
                                cnt8++;
                            } while (true);

                            match(input,19,FOLLOW_19_in_ruleBusinessClassDto917); 

                                    createLeafNode(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_2_3(), null); 
                                

                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleBusinessClassDto928); 

                            createLeafNode(grammarAccess.getBusinessClassDtoAccess().getRightSquareBracketKeyword_5_1_3(), null); 
                        

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
    // $ANTLR end ruleBusinessClassDto


    // $ANTLR start entryRuleEnumerationDto
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:490:1: entryRuleEnumerationDto returns [EObject current=null] : iv_ruleEnumerationDto= ruleEnumerationDto EOF ;
    public final EObject entryRuleEnumerationDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDto = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:490:56: (iv_ruleEnumerationDto= ruleEnumerationDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:491:2: iv_ruleEnumerationDto= ruleEnumerationDto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationDtoRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationDto_in_entryRuleEnumerationDto963);
            iv_ruleEnumerationDto=ruleEnumerationDto();
            _fsp--;

             current =iv_ruleEnumerationDto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDto973); 

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
    // $ANTLR end entryRuleEnumerationDto


    // $ANTLR start ruleEnumerationDto
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:498:1: ruleEnumerationDto returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';' ) ;
    public final EObject ruleEnumerationDto() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:503:6: ( ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:504:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:504:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:504:2: (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) 'represents' ( RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:504:2: (lv_description_0= RULE_STRING )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:506:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationDto1020); 

                    		createLeafNode(grammarAccess.getEnumerationDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationDtoRule().getType().getClassifier());
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

            match(input,20,FOLLOW_20_in_ruleEnumerationDto1038); 

                    createLeafNode(grammarAccess.getEnumerationDtoAccess().getEnumerationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:528:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:530:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationDto1060); 

            		createLeafNode(grammarAccess.getEnumerationDtoAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,16,FOLLOW_16_in_ruleEnumerationDto1077); 

                    createLeafNode(grammarAccess.getEnumerationDtoAccess().getRepresentsKeyword_3(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:552:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:555:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationDto1099); 

            		createLeafNode(grammarAccess.getEnumerationDtoAccess().getBaseExternalReferenceCrossReference_4_0(), "base"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleEnumerationDto1111); 

                    createLeafNode(grammarAccess.getEnumerationDtoAccess().getSemicolonKeyword_5(), null); 
                

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
    // $ANTLR end ruleEnumerationDto


    // $ANTLR start entryRuleBusinessClassPropertyReference
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:579:1: entryRuleBusinessClassPropertyReference returns [EObject current=null] : iv_ruleBusinessClassPropertyReference= ruleBusinessClassPropertyReference EOF ;
    public final EObject entryRuleBusinessClassPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClassPropertyReference = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:579:72: (iv_ruleBusinessClassPropertyReference= ruleBusinessClassPropertyReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:580:2: iv_ruleBusinessClassPropertyReference= ruleBusinessClassPropertyReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassPropertyReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClassPropertyReference_in_entryRuleBusinessClassPropertyReference1144);
            iv_ruleBusinessClassPropertyReference=ruleBusinessClassPropertyReference();
            _fsp--;

             current =iv_ruleBusinessClassPropertyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassPropertyReference1154); 

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
    // $ANTLR end entryRuleBusinessClassPropertyReference


    // $ANTLR start ruleBusinessClassPropertyReference
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:587:1: ruleBusinessClassPropertyReference returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ';' ) ;
    public final EObject ruleBusinessClassPropertyReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:592:6: ( ( (lv_name_0= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:593:1: ( (lv_name_0= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:593:1: ( (lv_name_0= RULE_ID ) ';' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:593:2: (lv_name_0= RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:593:2: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:595:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassPropertyReference1201); 

            		createLeafNode(grammarAccess.getBusinessClassPropertyReferenceAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassPropertyReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleBusinessClassPropertyReference1218); 

                    createLeafNode(grammarAccess.getBusinessClassPropertyReferenceAccess().getSemicolonKeyword_1(), null); 
                

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
    // $ANTLR end ruleBusinessClassPropertyReference


    // $ANTLR start entryRuleBusinessClassAssociationRoleReference
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:624:1: entryRuleBusinessClassAssociationRoleReference returns [EObject current=null] : iv_ruleBusinessClassAssociationRoleReference= ruleBusinessClassAssociationRoleReference EOF ;
    public final EObject entryRuleBusinessClassAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClassAssociationRoleReference = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:624:79: (iv_ruleBusinessClassAssociationRoleReference= ruleBusinessClassAssociationRoleReference EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:625:2: iv_ruleBusinessClassAssociationRoleReference= ruleBusinessClassAssociationRoleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassAssociationRoleReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClassAssociationRoleReference_in_entryRuleBusinessClassAssociationRoleReference1251);
            iv_ruleBusinessClassAssociationRoleReference=ruleBusinessClassAssociationRoleReference();
            _fsp--;

             current =iv_ruleBusinessClassAssociationRoleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassAssociationRoleReference1261); 

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
    // $ANTLR end entryRuleBusinessClassAssociationRoleReference


    // $ANTLR start ruleBusinessClassAssociationRoleReference
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:632:1: ruleBusinessClassAssociationRoleReference returns [EObject current=null] : ( (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';' ) ;
    public final EObject ruleBusinessClassAssociationRoleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:637:6: ( ( (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:638:1: ( (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:638:1: ( (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:638:2: (lv_name_0= RULE_ID ) 'as' ( RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:638:2: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:640:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference1308); 

            		createLeafNode(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassAssociationRoleReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,21,FOLLOW_21_in_ruleBusinessClassAssociationRoleReference1325); 

                    createLeafNode(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getAsKeyword_1(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:662:1: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:665:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassAssociationRoleReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference1347); 

            		createLeafNode(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getDtoTypeDtoCrossReference_2_0(), "dtoType"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleBusinessClassAssociationRoleReference1359); 

                    createLeafNode(grammarAccess.getBusinessClassAssociationRoleReferenceAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleBusinessClassAssociationRoleReference


    // $ANTLR start entryRuleCustomDto
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:689:1: entryRuleCustomDto returns [EObject current=null] : iv_ruleCustomDto= ruleCustomDto EOF ;
    public final EObject entryRuleCustomDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDto = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:689:51: (iv_ruleCustomDto= ruleCustomDto EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:690:2: iv_ruleCustomDto= ruleCustomDto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomDtoRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomDto_in_entryRuleCustomDto1392);
            iv_ruleCustomDto=ruleCustomDto();
            _fsp--;

             current =iv_ruleCustomDto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomDto1402); 

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
    // $ANTLR end entryRuleCustomDto


    // $ANTLR start ruleCustomDto
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:697:1: ruleCustomDto returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']' ) ;
    public final EObject ruleCustomDto() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_properties_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:702:6: ( ( (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']' ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:703:1: ( (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']' )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:703:1: ( (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:703:2: (lv_description_0= RULE_STRING )? 'custom' (lv_name_2= RULE_ID ) '[' (lv_properties_4= ruleDtoProperty )+ ']'
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:703:2: (lv_description_0= RULE_STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:705:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomDto1449); 

                    		createLeafNode(grammarAccess.getCustomDtoAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCustomDtoRule().getType().getClassifier());
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

            match(input,22,FOLLOW_22_in_ruleCustomDto1467); 

                    createLeafNode(grammarAccess.getCustomDtoAccess().getCustomKeyword_1(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:727:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:729:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomDto1489); 

            		createLeafNode(grammarAccess.getCustomDtoAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomDtoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,17,FOLLOW_17_in_ruleCustomDto1506); 

                    createLeafNode(grammarAccess.getCustomDtoAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:751:1: (lv_properties_4= ruleDtoProperty )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||(LA13_0>=23 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:754:6: lv_properties_4= ruleDtoProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCustomDtoAccess().getPropertiesDtoPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDtoProperty_in_ruleCustomDto1540);
            	    lv_properties_4=ruleDtoProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCustomDtoRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "properties", lv_properties_4, "DtoProperty", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match(input,19,FOLLOW_19_in_ruleCustomDto1554); 

                    createLeafNode(grammarAccess.getCustomDtoAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleCustomDto


    // $ANTLR start entryRuleDtoProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:783:1: entryRuleDtoProperty returns [EObject current=null] : iv_ruleDtoProperty= ruleDtoProperty EOF ;
    public final EObject entryRuleDtoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoProperty = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:783:53: (iv_ruleDtoProperty= ruleDtoProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:784:2: iv_ruleDtoProperty= ruleDtoProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty1587);
            iv_ruleDtoProperty=ruleDtoProperty();
            _fsp--;

             current =iv_ruleDtoProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoProperty1597); 

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
    // $ANTLR end entryRuleDtoProperty


    // $ANTLR start ruleDtoProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:791:1: ruleDtoProperty returns [EObject current=null] : ( (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';' ) ;
    public final EObject ruleDtoProperty() throws RecognitionException {
        EObject current = null;

        EObject this_DtoBooleanProperty_0 = null;

        EObject this_DtoStringProperty_1 = null;

        EObject this_DtoDateTimeProperty_2 = null;

        EObject this_DtoIntegerProperty_3 = null;

        EObject this_DtoDecimalProperty_4 = null;

        EObject this_DtoEnumerationProperty_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:796:6: ( ( (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';' ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:797:1: ( (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';' )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:797:1: ( (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:797:2: (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty ) ';'
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:797:2: (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty )
            int alt14=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt14=2;
                    }
                    break;
                case 27:
                    {
                    alt14=5;
                    }
                    break;
                case 23:
                    {
                    alt14=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt14=6;
                    }
                    break;
                case 26:
                    {
                    alt14=4;
                    }
                    break;
                case 25:
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("797:2: (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty )", 14, 1, input);

                    throw nvae;
                }

                }
                break;
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            case 27:
                {
                alt14=5;
                }
                break;
            case RULE_ID:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("797:2: (this_DtoBooleanProperty_0= ruleDtoBooleanProperty | this_DtoStringProperty_1= ruleDtoStringProperty | this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty | this_DtoIntegerProperty_3= ruleDtoIntegerProperty | this_DtoDecimalProperty_4= ruleDtoDecimalProperty | this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:798:5: this_DtoBooleanProperty_0= ruleDtoBooleanProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoBooleanPropertyParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoBooleanProperty_in_ruleDtoProperty1645);
                    this_DtoBooleanProperty_0=ruleDtoBooleanProperty();
                    _fsp--;

                     
                            current = this_DtoBooleanProperty_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:808:5: this_DtoStringProperty_1= ruleDtoStringProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoStringPropertyParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoStringProperty_in_ruleDtoProperty1672);
                    this_DtoStringProperty_1=ruleDtoStringProperty();
                    _fsp--;

                     
                            current = this_DtoStringProperty_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:818:5: this_DtoDateTimeProperty_2= ruleDtoDateTimeProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoDateTimePropertyParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_ruleDtoProperty1699);
                    this_DtoDateTimeProperty_2=ruleDtoDateTimeProperty();
                    _fsp--;

                     
                            current = this_DtoDateTimeProperty_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:828:5: this_DtoIntegerProperty_3= ruleDtoIntegerProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoIntegerPropertyParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoIntegerProperty_in_ruleDtoProperty1726);
                    this_DtoIntegerProperty_3=ruleDtoIntegerProperty();
                    _fsp--;

                     
                            current = this_DtoIntegerProperty_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:838:5: this_DtoDecimalProperty_4= ruleDtoDecimalProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoDecimalPropertyParserRuleCall_0_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoDecimalProperty_in_ruleDtoProperty1753);
                    this_DtoDecimalProperty_4=ruleDtoDecimalProperty();
                    _fsp--;

                     
                            current = this_DtoDecimalProperty_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:848:5: this_DtoEnumerationProperty_5= ruleDtoEnumerationProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDtoPropertyAccess().getDtoEnumerationPropertyParserRuleCall_0_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_ruleDtoProperty1780);
                    this_DtoEnumerationProperty_5=ruleDtoEnumerationProperty();
                    _fsp--;

                     
                            current = this_DtoEnumerationProperty_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleDtoProperty1789); 

                    createLeafNode(grammarAccess.getDtoPropertyAccess().getSemicolonKeyword_1(), null); 
                

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
    // $ANTLR end ruleDtoProperty


    // $ANTLR start entryRuleDtoBooleanProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:867:1: entryRuleDtoBooleanProperty returns [EObject current=null] : iv_ruleDtoBooleanProperty= ruleDtoBooleanProperty EOF ;
    public final EObject entryRuleDtoBooleanProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoBooleanProperty = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:867:60: (iv_ruleDtoBooleanProperty= ruleDtoBooleanProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:868:2: iv_ruleDtoBooleanProperty= ruleDtoBooleanProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoBooleanPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty1822);
            iv_ruleDtoBooleanProperty=ruleDtoBooleanProperty();
            _fsp--;

             current =iv_ruleDtoBooleanProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoBooleanProperty1832); 

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
    // $ANTLR end entryRuleDtoBooleanProperty


    // $ANTLR start ruleDtoBooleanProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:875:1: ruleDtoBooleanProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoBooleanProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:880:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:881:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:881:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:881:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:881:2: (lv_description_0= RULE_STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:883:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoBooleanProperty1879); 

                    		createLeafNode(grammarAccess.getDtoBooleanPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoBooleanPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:901:3: (lv_dataType_1= 'boolean' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:903:6: lv_dataType_1= 'boolean'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_ruleDtoBooleanProperty1909); 

                    createLeafNode(grammarAccess.getDtoBooleanPropertyAccess().getDataTypeBooleanKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoBooleanPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "boolean", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:922:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:924:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoBooleanProperty1944); 

            		createLeafNode(grammarAccess.getDtoBooleanPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoBooleanPropertyRule().getType().getClassifier());
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
    // $ANTLR end ruleDtoBooleanProperty


    // $ANTLR start entryRuleDtoStringProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:949:1: entryRuleDtoStringProperty returns [EObject current=null] : iv_ruleDtoStringProperty= ruleDtoStringProperty EOF ;
    public final EObject entryRuleDtoStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoStringProperty = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:949:59: (iv_ruleDtoStringProperty= ruleDtoStringProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:950:2: iv_ruleDtoStringProperty= ruleDtoStringProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoStringPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty1985);
            iv_ruleDtoStringProperty=ruleDtoStringProperty();
            _fsp--;

             current =iv_ruleDtoStringProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoStringProperty1995); 

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
    // $ANTLR end entryRuleDtoStringProperty


    // $ANTLR start ruleDtoStringProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:957:1: ruleDtoStringProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoStringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:962:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:963:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:963:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:963:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:963:2: (lv_description_0= RULE_STRING )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:965:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoStringProperty2042); 

                    		createLeafNode(grammarAccess.getDtoStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoStringPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:983:3: (lv_dataType_1= 'string' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:985:6: lv_dataType_1= 'string'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleDtoStringProperty2072); 

                    createLeafNode(grammarAccess.getDtoStringPropertyAccess().getDataTypeStringKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoStringPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "string", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1004:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1006:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoStringProperty2107); 

            		createLeafNode(grammarAccess.getDtoStringPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoStringPropertyRule().getType().getClassifier());
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
    // $ANTLR end ruleDtoStringProperty


    // $ANTLR start entryRuleDtoDateTimeProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1031:1: entryRuleDtoDateTimeProperty returns [EObject current=null] : iv_ruleDtoDateTimeProperty= ruleDtoDateTimeProperty EOF ;
    public final EObject entryRuleDtoDateTimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoDateTimeProperty = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1031:61: (iv_ruleDtoDateTimeProperty= ruleDtoDateTimeProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1032:2: iv_ruleDtoDateTimeProperty= ruleDtoDateTimeProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoDateTimePropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty2148);
            iv_ruleDtoDateTimeProperty=ruleDtoDateTimeProperty();
            _fsp--;

             current =iv_ruleDtoDateTimeProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDateTimeProperty2158); 

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
    // $ANTLR end entryRuleDtoDateTimeProperty


    // $ANTLR start ruleDtoDateTimeProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1039:1: ruleDtoDateTimeProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoDateTimeProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1044:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1045:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1045:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1045:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1045:2: (lv_description_0= RULE_STRING )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1047:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoDateTimeProperty2205); 

                    		createLeafNode(grammarAccess.getDtoDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoDateTimePropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1065:3: (lv_dataType_1= 'datetime' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1067:6: lv_dataType_1= 'datetime'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleDtoDateTimeProperty2235); 

                    createLeafNode(grammarAccess.getDtoDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoDateTimePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "datetime", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1086:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1088:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoDateTimeProperty2270); 

            		createLeafNode(grammarAccess.getDtoDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoDateTimePropertyRule().getType().getClassifier());
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
    // $ANTLR end ruleDtoDateTimeProperty


    // $ANTLR start entryRuleDtoIntegerProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1113:1: entryRuleDtoIntegerProperty returns [EObject current=null] : iv_ruleDtoIntegerProperty= ruleDtoIntegerProperty EOF ;
    public final EObject entryRuleDtoIntegerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoIntegerProperty = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1113:60: (iv_ruleDtoIntegerProperty= ruleDtoIntegerProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1114:2: iv_ruleDtoIntegerProperty= ruleDtoIntegerProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoIntegerPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty2311);
            iv_ruleDtoIntegerProperty=ruleDtoIntegerProperty();
            _fsp--;

             current =iv_ruleDtoIntegerProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoIntegerProperty2321); 

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
    // $ANTLR end entryRuleDtoIntegerProperty


    // $ANTLR start ruleDtoIntegerProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1121:1: ruleDtoIntegerProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoIntegerProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1126:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1127:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1127:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1127:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1127:2: (lv_description_0= RULE_STRING )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1129:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoIntegerProperty2368); 

                    		createLeafNode(grammarAccess.getDtoIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoIntegerPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1147:3: (lv_dataType_1= 'integer' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1149:6: lv_dataType_1= 'integer'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleDtoIntegerProperty2398); 

                    createLeafNode(grammarAccess.getDtoIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoIntegerPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "integer", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1168:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1170:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoIntegerProperty2433); 

            		createLeafNode(grammarAccess.getDtoIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoIntegerPropertyRule().getType().getClassifier());
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
    // $ANTLR end ruleDtoIntegerProperty


    // $ANTLR start entryRuleDtoDecimalProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1195:1: entryRuleDtoDecimalProperty returns [EObject current=null] : iv_ruleDtoDecimalProperty= ruleDtoDecimalProperty EOF ;
    public final EObject entryRuleDtoDecimalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoDecimalProperty = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1195:60: (iv_ruleDtoDecimalProperty= ruleDtoDecimalProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1196:2: iv_ruleDtoDecimalProperty= ruleDtoDecimalProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoDecimalPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty2474);
            iv_ruleDtoDecimalProperty=ruleDtoDecimalProperty();
            _fsp--;

             current =iv_ruleDtoDecimalProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoDecimalProperty2484); 

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
    // $ANTLR end entryRuleDtoDecimalProperty


    // $ANTLR start ruleDtoDecimalProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1203:1: ruleDtoDecimalProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoDecimalProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1208:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1209:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1209:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1209:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1209:2: (lv_description_0= RULE_STRING )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1211:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoDecimalProperty2531); 

                    		createLeafNode(grammarAccess.getDtoDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoDecimalPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1229:3: (lv_dataType_1= 'decimal' )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1231:6: lv_dataType_1= 'decimal'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleDtoDecimalProperty2561); 

                    createLeafNode(grammarAccess.getDtoDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoDecimalPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "decimal", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1250:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1252:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoDecimalProperty2596); 

            		createLeafNode(grammarAccess.getDtoDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoDecimalPropertyRule().getType().getClassifier());
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
    // $ANTLR end ruleDtoDecimalProperty


    // $ANTLR start entryRuleDtoEnumerationProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1277:1: entryRuleDtoEnumerationProperty returns [EObject current=null] : iv_ruleDtoEnumerationProperty= ruleDtoEnumerationProperty EOF ;
    public final EObject entryRuleDtoEnumerationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoEnumerationProperty = null;


        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1277:64: (iv_ruleDtoEnumerationProperty= ruleDtoEnumerationProperty EOF )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1278:2: iv_ruleDtoEnumerationProperty= ruleDtoEnumerationProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoEnumerationPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty2637);
            iv_ruleDtoEnumerationProperty=ruleDtoEnumerationProperty();
            _fsp--;

             current =iv_ruleDtoEnumerationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoEnumerationProperty2647); 

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
    // $ANTLR end entryRuleDtoEnumerationProperty


    // $ANTLR start ruleDtoEnumerationProperty
    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1285:1: ruleDtoEnumerationProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDtoEnumerationProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1290:6: ( ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1291:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1291:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1291:2: (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1291:2: (lv_description_0= RULE_STRING )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1293:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDtoEnumerationProperty2694); 

                    		createLeafNode(grammarAccess.getDtoEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDtoEnumerationPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1311:3: ( RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1314:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDtoEnumerationPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty2725); 

            		createLeafNode(grammarAccess.getDtoEnumerationPropertyAccess().getTypeEnumerationDtoCrossReference_1_0(), "type"); 
            	

            }

            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1327:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.datacontract.xtext/src-gen/org/mod4j/dsl/datacontract/xtext/parser/antlr/internal/InternalDataContract.g:1329:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty2750); 

            		createLeafNode(grammarAccess.getDtoEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoEnumerationPropertyRule().getType().getClassifier());
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
    // $ANTLR end ruleDtoEnumerationProperty


 

    public static final BitSet FOLLOW_ruleDataContractModel_in_entryRuleDataContractModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataContractModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataContractModel130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDataContractModel148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataContractModel170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataContractModel187 = new BitSet(new long[]{0x000000000050A012L});
    public static final BitSet FOLLOW_ruleExternalReference_in_ruleDataContractModel221 = new BitSet(new long[]{0x000000000050A012L});
    public static final BitSet FOLLOW_ruleDto_in_ruleDataContractModel261 = new BitSet(new long[]{0x0000000000508012L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_ruleDataContractModel305 = new BitSet(new long[]{0x0000000000508012L});
    public static final BitSet FOLLOW_ruleDto_in_entryRuleDto344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDto354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_ruleDto401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_ruleDto428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExternalReference517 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExternalReference535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExternalReference574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalReference596 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExternalReference613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassDto_in_entryRuleBusinessClassDto646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassDto656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessClassDto703 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBusinessClassDto721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassDto743 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBusinessClassDto760 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassDto782 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessClassDto795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBusinessClassDto811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_ruleBusinessClassDto845 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_18_in_ruleBusinessClassDto860 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBusinessClassDto869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_ruleBusinessClassDto903 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClassDto917 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClassDto928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDto_in_entryRuleEnumerationDto963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDto973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationDto1020 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumerationDto1038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationDto1060 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumerationDto1077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationDto1099 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumerationDto1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassPropertyReference_in_entryRuleBusinessClassPropertyReference1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassPropertyReference1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassPropertyReference1201 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessClassPropertyReference1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassAssociationRoleReference_in_entryRuleBusinessClassAssociationRoleReference1251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassAssociationRoleReference1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference1308 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBusinessClassAssociationRoleReference1325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassAssociationRoleReference1347 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessClassAssociationRoleReference1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomDto_in_entryRuleCustomDto1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomDto1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomDto1449 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCustomDto1467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomDto1489 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCustomDto1506 = new BitSet(new long[]{0x000000000F800030L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_ruleCustomDto1540 = new BitSet(new long[]{0x000000000F880030L});
    public static final BitSet FOLLOW_19_in_ruleCustomDto1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoProperty_in_entryRuleDtoProperty1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoProperty1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_ruleDtoProperty1645 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_ruleDtoProperty1672 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_ruleDtoProperty1699 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_ruleDtoProperty1726 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_ruleDtoProperty1753 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_ruleDtoProperty1780 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDtoProperty1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoBooleanProperty_in_entryRuleDtoBooleanProperty1822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoBooleanProperty1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoBooleanProperty1879 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDtoBooleanProperty1909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoBooleanProperty1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoStringProperty_in_entryRuleDtoStringProperty1985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoStringProperty1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoStringProperty2042 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDtoStringProperty2072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoStringProperty2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDateTimeProperty_in_entryRuleDtoDateTimeProperty2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDateTimeProperty2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoDateTimeProperty2205 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDtoDateTimeProperty2235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoDateTimeProperty2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoIntegerProperty_in_entryRuleDtoIntegerProperty2311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoIntegerProperty2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoIntegerProperty2368 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDtoIntegerProperty2398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoIntegerProperty2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoDecimalProperty_in_entryRuleDtoDecimalProperty2474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoDecimalProperty2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoDecimalProperty2531 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDtoDecimalProperty2561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoDecimalProperty2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoEnumerationProperty_in_entryRuleDtoEnumerationProperty2637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoEnumerationProperty2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDtoEnumerationProperty2694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty2725 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoEnumerationProperty2750 = new BitSet(new long[]{0x0000000000000002L});

}