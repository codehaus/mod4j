package org.mod4j.dsl.businessdomain.xtext.parser.antlr.internal; 

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
import org.mod4j.dsl.businessdomain.xtext.services.BusinessDomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBusinessDomainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "';'", "'from'", "'import'", "'association'", "'<->'", "'->'", "'ordered'", "'class'", "'inherits'", "'['", "'rules'", "']'", "'enumeration'", "'='", "'unique'", "','", "'nullable'", "'derived'", "'writable'", "'boolean'", "'default'", "'true'", "'false'", "'string'", "'minlength'", "'maxlength'", "'regexp'", "'datetime'", "'integer'", "'min'", "'max'", "'decimal'", "'many'", "'one'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalBusinessDomainParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g"; }


     
     	private BusinessDomainGrammarAccess grammarAccess;
     	
        public InternalBusinessDomainParser(TokenStream input, IAstFactory factory, BusinessDomainGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BusinessDomainModel";	
       	} 



    // $ANTLR start entryRuleBusinessDomainModel
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:73:1: entryRuleBusinessDomainModel returns [EObject current=null] : iv_ruleBusinessDomainModel= ruleBusinessDomainModel EOF ;
    public final EObject entryRuleBusinessDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessDomainModel = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:73:61: (iv_ruleBusinessDomainModel= ruleBusinessDomainModel EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:74:2: iv_ruleBusinessDomainModel= ruleBusinessDomainModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessDomainModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessDomainModel_in_entryRuleBusinessDomainModel73);
            iv_ruleBusinessDomainModel=ruleBusinessDomainModel();
            _fsp--;

             current =iv_ruleBusinessDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessDomainModel83); 

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
    // $ANTLR end entryRuleBusinessDomainModel


    // $ANTLR start ruleBusinessDomainModel
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:81:1: ruleBusinessDomainModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' (lv_types_4= ruleBusinessClassReference )* ( (lv_types_5= ruleBusinessClass ) | (lv_enumerations_6= ruleEnumeration ) | (lv_associations_7= ruleAssociation ) )* ) ;
    public final EObject ruleBusinessDomainModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_types_4 = null;

        EObject lv_types_5 = null;

        EObject lv_enumerations_6 = null;

        EObject lv_associations_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:86:6: ( ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' (lv_types_4= ruleBusinessClassReference )* ( (lv_types_5= ruleBusinessClass ) | (lv_enumerations_6= ruleEnumeration ) | (lv_associations_7= ruleAssociation ) )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:1: ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' (lv_types_4= ruleBusinessClassReference )* ( (lv_types_5= ruleBusinessClass ) | (lv_enumerations_6= ruleEnumeration ) | (lv_associations_7= ruleAssociation ) )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:1: ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' (lv_types_4= ruleBusinessClassReference )* ( (lv_types_5= ruleBusinessClass ) | (lv_enumerations_6= ruleEnumeration ) | (lv_associations_7= ruleAssociation ) )* )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:2: (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' (lv_types_4= ruleBusinessClassReference )* ( (lv_types_5= ruleBusinessClass ) | (lv_enumerations_6= ruleEnumeration ) | (lv_associations_7= ruleAssociation ) )*
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:2: (lv_description_0= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:89:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessDomainModel130); 

                    		createLeafNode(grammarAccess.getBusinessDomainModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
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

            match(input,11,FOLLOW_11_in_ruleBusinessDomainModel148); 

                    createLeafNode(grammarAccess.getBusinessDomainModelAccess().getDomainKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:111:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:113:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessDomainModel170); 

            		createLeafNode(grammarAccess.getBusinessDomainModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleBusinessDomainModel187); 

                    createLeafNode(grammarAccess.getBusinessDomainModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:135:1: (lv_types_4= ruleBusinessClassReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:138:6: lv_types_4= ruleBusinessClassReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBusinessClassReference_in_ruleBusinessDomainModel221);
            	    lv_types_4=ruleBusinessClassReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "types", lv_types_4, "BusinessClassReference", currentNode);
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:156:3: ( (lv_types_5= ruleBusinessClass ) | (lv_enumerations_6= ruleEnumeration ) | (lv_associations_7= ruleAssociation ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(2) ) {
                    case 19:
                        {
                        alt3=1;
                        }
                        break;
                    case 24:
                        {
                        alt3=2;
                        }
                        break;
                    case 15:
                        {
                        alt3=3;
                        }
                        break;

                    }

                    }
                    break;
                case 19:
                    {
                    alt3=1;
                    }
                    break;
                case 24:
                    {
                    alt3=2;
                    }
                    break;
                case 15:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:156:4: (lv_types_5= ruleBusinessClass )
            	    {
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:156:4: (lv_types_5= ruleBusinessClass )
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:159:6: lv_types_5= ruleBusinessClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel261);
            	    lv_types_5=ruleBusinessClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "types", lv_types_5, "BusinessClass", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:178:6: (lv_enumerations_6= ruleEnumeration )
            	    {
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:178:6: (lv_enumerations_6= ruleEnumeration )
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:181:6: lv_enumerations_6= ruleEnumeration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel305);
            	    lv_enumerations_6=ruleEnumeration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "enumerations", lv_enumerations_6, "Enumeration", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:200:6: (lv_associations_7= ruleAssociation )
            	    {
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:200:6: (lv_associations_7= ruleAssociation )
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:203:6: lv_associations_7= ruleAssociation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_5_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssociation_in_ruleBusinessDomainModel349);
            	    lv_associations_7=ruleAssociation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "associations", lv_associations_7, "Association", currentNode);
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
    // $ANTLR end ruleBusinessDomainModel


    // $ANTLR start entryRuleBusinessClassReference
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:228:1: entryRuleBusinessClassReference returns [EObject current=null] : iv_ruleBusinessClassReference= ruleBusinessClassReference EOF ;
    public final EObject entryRuleBusinessClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClassReference = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:228:64: (iv_ruleBusinessClassReference= ruleBusinessClassReference EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:229:2: iv_ruleBusinessClassReference= ruleBusinessClassReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClassReference_in_entryRuleBusinessClassReference388);
            iv_ruleBusinessClassReference=ruleBusinessClassReference();
            _fsp--;

             current =iv_ruleBusinessClassReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassReference398); 

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
    // $ANTLR end entryRuleBusinessClassReference


    // $ANTLR start ruleBusinessClassReference
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:236:1: ruleBusinessClassReference returns [EObject current=null] : ( 'from' (lv_referredModel_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleBusinessClassReference() throws RecognitionException {
        EObject current = null;

        Token lv_referredModel_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:241:6: ( ( 'from' (lv_referredModel_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:242:1: ( 'from' (lv_referredModel_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:242:1: ( 'from' (lv_referredModel_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:242:2: 'from' (lv_referredModel_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleBusinessClassReference432); 

                    createLeafNode(grammarAccess.getBusinessClassReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:246:1: (lv_referredModel_1= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:248:6: lv_referredModel_1= RULE_ID
            {
            lv_referredModel_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassReference454); 

            		createLeafNode(grammarAccess.getBusinessClassReferenceAccess().getReferredModelIDTerminalRuleCall_1_0(), "referredModel"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "referredModel", lv_referredModel_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,14,FOLLOW_14_in_ruleBusinessClassReference471); 

                    createLeafNode(grammarAccess.getBusinessClassReferenceAccess().getImportKeyword_2(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:270:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:272:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClassReference493); 

            		createLeafNode(grammarAccess.getBusinessClassReferenceAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleBusinessClassReference510); 

                    createLeafNode(grammarAccess.getBusinessClassReferenceAccess().getSemicolonKeyword_4(), null); 
                

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
    // $ANTLR end ruleBusinessClassReference


    // $ANTLR start entryRuleAssociation
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:301:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:301:53: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:302:2: iv_ruleAssociation= ruleAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation543);
            iv_ruleAssociation=ruleAssociation();
            _fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation553); 

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
    // $ANTLR end entryRuleAssociation


    // $ANTLR start ruleAssociation
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:309:1: ruleAssociation returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_sourceRoleName_3=null;
        Token lv_bidirectional_5=null;
        Token lv_targetRoleName_9=null;
        Token lv_ordered_10=null;
        Enumerator lv_sourceMultiplicity_4 = null;

        Enumerator lv_targetMultiplicity_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:314:6: ( ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:315:1: ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:315:1: ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:315:2: (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) (lv_sourceMultiplicity_4= ruleMultiplicity ) ( (lv_bidirectional_5= '<->' ) | '->' ) (lv_targetMultiplicity_7= ruleMultiplicity ) ( RULE_ID ) (lv_targetRoleName_9= RULE_ID ) (lv_ordered_10= 'ordered' )? ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:315:2: (lv_description_0= RULE_STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:317:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation600); 

                    		createLeafNode(grammarAccess.getAssociationAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
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

            match(input,15,FOLLOW_15_in_ruleAssociation618); 

                    createLeafNode(grammarAccess.getAssociationAccess().getAssociationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:339:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:342:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation640); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0(), "source"); 
            	

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:355:2: (lv_sourceRoleName_3= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:357:6: lv_sourceRoleName_3= RULE_ID
            {
            lv_sourceRoleName_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation665); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceRoleNameIDTerminalRuleCall_3_0(), "sourceRoleName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "sourceRoleName", lv_sourceRoleName_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:375:2: (lv_sourceMultiplicity_4= ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:378:6: lv_sourceMultiplicity_4= ruleMultiplicity
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation707);
            lv_sourceMultiplicity_4=ruleMultiplicity();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "sourceMultiplicity", lv_sourceMultiplicity_4, "Multiplicity", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:396:2: ( (lv_bidirectional_5= '<->' ) | '->' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("396:2: ( (lv_bidirectional_5= '<->' ) | '->' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:396:3: (lv_bidirectional_5= '<->' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:396:3: (lv_bidirectional_5= '<->' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:398:6: lv_bidirectional_5= '<->'
                    {
                    lv_bidirectional_5=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleAssociation733); 

                            createLeafNode(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0(), "bidirectional"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "bidirectional", true, "<->", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:418:6: '->'
                    {
                    match(input,17,FOLLOW_17_in_ruleAssociation761); 

                            createLeafNode(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_5_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:422:2: (lv_targetMultiplicity_7= ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:425:6: lv_targetMultiplicity_7= ruleMultiplicity
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation796);
            lv_targetMultiplicity_7=ruleMultiplicity();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "targetMultiplicity", lv_targetMultiplicity_7, "Multiplicity", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:443:2: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:446:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation822); 

            		createLeafNode(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_7_0(), "target"); 
            	

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:459:2: (lv_targetRoleName_9= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:461:6: lv_targetRoleName_9= RULE_ID
            {
            lv_targetRoleName_9=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation847); 

            		createLeafNode(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_8_0(), "targetRoleName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "targetRoleName", lv_targetRoleName_9, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:479:2: (lv_ordered_10= 'ordered' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:481:6: lv_ordered_10= 'ordered'
                    {
                    lv_ordered_10=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleAssociation876); 

                            createLeafNode(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0(), "ordered"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "ordered", true, "ordered", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleAssociation899); 

                    createLeafNode(grammarAccess.getAssociationAccess().getSemicolonKeyword_10(), null); 
                

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
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRuleBusinessClass
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:511:1: entryRuleBusinessClass returns [EObject current=null] : iv_ruleBusinessClass= ruleBusinessClass EOF ;
    public final EObject entryRuleBusinessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClass = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:511:55: (iv_ruleBusinessClass= ruleBusinessClass EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:512:2: iv_ruleBusinessClass= ruleBusinessClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass932);
            iv_ruleBusinessClass=ruleBusinessClass();
            _fsp--;

             current =iv_ruleBusinessClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClass942); 

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
    // $ANTLR end entryRuleBusinessClass


    // $ANTLR start ruleBusinessClass
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:519:1: ruleBusinessClass returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']' ) ;
    public final EObject ruleBusinessClass() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_properties_6 = null;

        EObject lv_businessRules_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:524:6: ( ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:525:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:525:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:525:2: (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? '[' (lv_properties_6= ruleProperty )* ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )? ']'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:525:2: (lv_description_0= RULE_STRING )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:527:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessClass989); 

                    		createLeafNode(grammarAccess.getBusinessClassAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleBusinessClass1007); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getClassKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:549:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:551:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass1029); 

            		createLeafNode(grammarAccess.getBusinessClassAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:569:2: ( 'inherits' ( RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:569:3: 'inherits' ( RULE_ID )
                    {
                    match(input,20,FOLLOW_20_in_ruleBusinessClass1047); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:573:1: ( RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:576:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass1069); 

                    		createLeafNode(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0(), "superclass"); 
                    	

                    }


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleBusinessClass1083); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_4(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:593:1: (lv_properties_6= ruleProperty )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==31||LA9_0==35||(LA9_0>=39 && LA9_0<=40)||LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:596:6: lv_properties_6= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleBusinessClass1117);
            	    lv_properties_6=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "properties", lv_properties_6, "Property", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:614:3: ( 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:614:4: 'rules' '[' (lv_businessRules_9= ruleAbstractBusinessRule )* ']'
                    {
                    match(input,22,FOLLOW_22_in_ruleBusinessClass1132); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getRulesKeyword_6_0(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleBusinessClass1141); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_6_1(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:622:1: (lv_businessRules_9= ruleAbstractBusinessRule )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==26) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:625:6: lv_businessRules_9= ruleAbstractBusinessRule
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_6_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass1175);
                    	    lv_businessRules_9=ruleAbstractBusinessRule();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "businessRules", lv_businessRules_9, "AbstractBusinessRule", currentNode);
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

                    match(input,23,FOLLOW_23_in_ruleBusinessClass1189); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_6_3(), null); 
                        

                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleBusinessClass1200); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7(), null); 
                

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
    // $ANTLR end ruleBusinessClass


    // $ANTLR start entryRuleEnumeration
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:658:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:658:53: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:659:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1233);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1243); 

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
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:666:1: ruleEnumeration returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_enumerationLiterals_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:671:6: ( ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:672:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:672:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:672:2: (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ruleEnumerationLiteral )+ ']'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:672:2: (lv_description_0= RULE_STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:674:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumeration1290); 

                    		createLeafNode(grammarAccess.getEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
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

            match(input,24,FOLLOW_24_in_ruleEnumeration1308); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:696:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:698:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1330); 

            		createLeafNode(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,21,FOLLOW_21_in_ruleEnumeration1347); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:720:1: (lv_enumerationLiterals_4= ruleEnumerationLiteral )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:723:6: lv_enumerationLiterals_4= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1381);
            	    lv_enumerationLiterals_4=ruleEnumerationLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "enumerationLiterals", lv_enumerationLiterals_4, "EnumerationLiteral", currentNode);
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

            match(input,23,FOLLOW_23_in_ruleEnumeration1395); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:752:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:752:60: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:753:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1428);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1438); 

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
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:760:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_persistedValue_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:765:6: ( ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:766:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:766:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:766:2: (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:766:2: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:768:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral1485); 

            		createLeafNode(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:786:2: ( '=' (lv_persistedValue_2= RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:786:3: '=' (lv_persistedValue_2= RULE_INT )
            {
            match(input,25,FOLLOW_25_in_ruleEnumerationLiteral1503); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:790:1: (lv_persistedValue_2= RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:792:6: lv_persistedValue_2= RULE_INT
            {
            lv_persistedValue_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral1525); 

            		createLeafNode(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0(), "persistedValue"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "persistedValue", lv_persistedValue_2, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleEnumerationLiteral1543); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleAbstractBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:821:1: entryRuleAbstractBusinessRule returns [EObject current=null] : iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF ;
    public final EObject entryRuleAbstractBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBusinessRule = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:821:62: (iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:822:2: iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractBusinessRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule1576);
            iv_ruleAbstractBusinessRule=ruleAbstractBusinessRule();
            _fsp--;

             current =iv_ruleAbstractBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBusinessRule1586); 

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
    // $ANTLR end entryRuleAbstractBusinessRule


    // $ANTLR start ruleAbstractBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:829:1: ruleAbstractBusinessRule returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule ) ;
    public final EObject ruleAbstractBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_UniqueRule_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:834:6: ( (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:835:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:835:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )
            int alt14=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==26) ) {
                    alt14=2;
                }
                else if ( (LA14_1==RULE_ID) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("835:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("835:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:836:5: this_BusinessRule_0= ruleBusinessRule
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule1633);
                    this_BusinessRule_0=ruleBusinessRule();
                    _fsp--;

                     
                            current = this_BusinessRule_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:846:5: this_UniqueRule_1= ruleUniqueRule
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBusinessRuleAccess().getUniqueRuleParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule1660);
                    this_UniqueRule_1=ruleUniqueRule();
                    _fsp--;

                     
                            current = this_UniqueRule_1; 
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
    // $ANTLR end ruleAbstractBusinessRule


    // $ANTLR start entryRuleBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:861:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:861:54: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:862:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule1692);
            iv_ruleBusinessRule=ruleBusinessRule();
            _fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule1702); 

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
    // $ANTLR end entryRuleBusinessRule


    // $ANTLR start ruleBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:869:1: ruleBusinessRule returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:874:6: ( ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:875:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:875:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:875:2: (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:875:2: (lv_description_0= RULE_STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:877:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessRule1749); 

                    		createLeafNode(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessRuleRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:895:3: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:897:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule1780); 

            		createLeafNode(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBusinessRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleBusinessRule1797); 

                    createLeafNode(grammarAccess.getBusinessRuleAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleBusinessRule


    // $ANTLR start entryRuleUniqueRule
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:926:1: entryRuleUniqueRule returns [EObject current=null] : iv_ruleUniqueRule= ruleUniqueRule EOF ;
    public final EObject entryRuleUniqueRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueRule = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:926:52: (iv_ruleUniqueRule= ruleUniqueRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:927:2: iv_ruleUniqueRule= ruleUniqueRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUniqueRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule1830);
            iv_ruleUniqueRule=ruleUniqueRule();
            _fsp--;

             current =iv_ruleUniqueRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueRule1840); 

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
    // $ANTLR end entryRuleUniqueRule


    // $ANTLR start ruleUniqueRule
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:934:1: ruleUniqueRule returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' ) ;
    public final EObject ruleUniqueRule() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:939:6: ( ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:940:1: ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:940:1: ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:940:2: (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:940:2: (lv_description_0= RULE_STRING )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:942:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUniqueRule1887); 

                    		createLeafNode(grammarAccess.getUniqueRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
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

            match(input,26,FOLLOW_26_in_ruleUniqueRule1905); 

                    createLeafNode(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:964:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:966:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule1927); 

            		createLeafNode(grammarAccess.getUniqueRuleAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,21,FOLLOW_21_in_ruleUniqueRule1944); 

                    createLeafNode(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:988:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:991:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule1966); 

            		createLeafNode(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0(), "properties"); 
            	

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1004:2: ( ',' ( RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1004:3: ',' ( RULE_ID )
            	    {
            	    match(input,27,FOLLOW_27_in_ruleUniqueRule1979); 

            	            createLeafNode(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1008:1: ( RULE_ID )
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1011:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule2001); 

            	    		createLeafNode(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0(), "properties"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleUniqueRule2015); 

                    createLeafNode(grammarAccess.getUniqueRuleAccess().getRightSquareBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruleUniqueRule


    // $ANTLR start entryRuleProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1035:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1035:50: (iv_ruleProperty= ruleProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1036:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2048);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2058); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1043:1: ruleProperty returns [EObject current=null] : ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_6=null;
        Token lv_derived_7=null;
        Token lv_writable_8=null;
        EObject this_BoolProperty_0 = null;

        EObject this_StringProperty_1 = null;

        EObject this_DateTimeProperty_2 = null;

        EObject this_IntegerProperty_3 = null;

        EObject this_DecimalProperty_4 = null;

        EObject this_EnumerationProperty_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1048:6: ( ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1049:1: ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1049:1: ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1049:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1049:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )
            int alt18=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt18=5;
                    }
                    break;
                case 35:
                    {
                    alt18=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt18=6;
                    }
                    break;
                case 39:
                    {
                    alt18=3;
                    }
                    break;
                case 40:
                    {
                    alt18=4;
                    }
                    break;
                case 31:
                    {
                    alt18=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1049:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )", 18, 1, input);

                    throw nvae;
                }

                }
                break;
            case 31:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            case 43:
                {
                alt18=5;
                }
                break;
            case RULE_ID:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1049:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1050:5: this_BoolProperty_0= ruleBoolProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolProperty_in_ruleProperty2106);
                    this_BoolProperty_0=ruleBoolProperty();
                    _fsp--;

                     
                            current = this_BoolProperty_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1060:5: this_StringProperty_1= ruleStringProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringProperty_in_ruleProperty2133);
                    this_StringProperty_1=ruleStringProperty();
                    _fsp--;

                     
                            current = this_StringProperty_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1070:5: this_DateTimeProperty_2= ruleDateTimeProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDateTimeProperty_in_ruleProperty2160);
                    this_DateTimeProperty_2=ruleDateTimeProperty();
                    _fsp--;

                     
                            current = this_DateTimeProperty_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1080:5: this_IntegerProperty_3= ruleIntegerProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerProperty_in_ruleProperty2187);
                    this_IntegerProperty_3=ruleIntegerProperty();
                    _fsp--;

                     
                            current = this_IntegerProperty_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1090:5: this_DecimalProperty_4= ruleDecimalProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecimalProperty_in_ruleProperty2214);
                    this_DecimalProperty_4=ruleDecimalProperty();
                    _fsp--;

                     
                            current = this_DecimalProperty_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1100:5: this_EnumerationProperty_5= ruleEnumerationProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getEnumerationPropertyParserRuleCall_0_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumerationProperty_in_ruleProperty2241);
                    this_EnumerationProperty_5=ruleEnumerationProperty();
                    _fsp--;

                     
                            current = this_EnumerationProperty_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1108:2: (lv_nullable_6= 'nullable' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1110:6: lv_nullable_6= 'nullable'
                    {
                    lv_nullable_6=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleProperty2262); 

                            createLeafNode(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0(), "nullable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "nullable", true, "nullable", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1129:3: ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1129:4: (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )?
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1129:4: (lv_derived_7= 'derived' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1131:6: lv_derived_7= 'derived'
                    {
                    lv_derived_7=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleProperty2298); 

                            createLeafNode(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0(), "derived"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "derived", true, "derived", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1150:2: (lv_writable_8= 'writable' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==30) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1152:6: lv_writable_8= 'writable'
                            {
                            lv_writable_8=(Token)input.LT(1);
                            match(input,30,FOLLOW_30_in_ruleProperty2332); 

                                    createLeafNode(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0(), "writable"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "writable", true, "writable", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleProperty2357); 

                    createLeafNode(grammarAccess.getPropertyAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleBoolProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1182:1: entryRuleBoolProperty returns [EObject current=null] : iv_ruleBoolProperty= ruleBoolProperty EOF ;
    public final EObject entryRuleBoolProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1182:54: (iv_ruleBoolProperty= ruleBoolProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1183:2: iv_ruleBoolProperty= ruleBoolProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty2390);
            iv_ruleBoolProperty=ruleBoolProperty();
            _fsp--;

             current =iv_ruleBoolProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolProperty2400); 

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
    // $ANTLR end entryRuleBoolProperty


    // $ANTLR start ruleBoolProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1190:1: ruleBoolProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? ) ;
    public final EObject ruleBoolProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1195:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1196:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1196:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1196:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1196:2: (lv_description_0= RULE_STRING )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1198:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoolProperty2447); 

                    		createLeafNode(grammarAccess.getBoolPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1216:3: (lv_dataType_1= 'boolean' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1218:6: lv_dataType_1= 'boolean'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_ruleBoolProperty2477); 

                    createLeafNode(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "boolean", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1237:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1239:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolProperty2512); 

            		createLeafNode(grammarAccess.getBoolPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1257:2: ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1257:3: (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1257:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1259:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleBoolProperty2542); 

                            createLeafNode(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1278:2: ( (lv_defaultValue_4= 'true' ) | 'false' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==33) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==34) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1278:2: ( (lv_defaultValue_4= 'true' ) | 'false' )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1278:3: (lv_defaultValue_4= 'true' )
                            {
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1278:3: (lv_defaultValue_4= 'true' )
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1280:6: lv_defaultValue_4= 'true'
                            {
                            lv_defaultValue_4=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_ruleBoolProperty2577); 

                                    createLeafNode(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0(), "defaultValue"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBoolPropertyRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "defaultValue", true, "true", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1300:6: 'false'
                            {
                            match(input,34,FOLLOW_34_in_ruleBoolProperty2605); 

                                    createLeafNode(grammarAccess.getBoolPropertyAccess().getFalseKeyword_3_1_1(), null); 
                                

                            }
                            break;

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
    // $ANTLR end ruleBoolProperty


    // $ANTLR start entryRuleStringProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1311:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1311:56: (iv_ruleStringProperty= ruleStringProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1312:2: iv_ruleStringProperty= ruleStringProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringProperty_in_entryRuleStringProperty2641);
            iv_ruleStringProperty=ruleStringProperty();
            _fsp--;

             current =iv_ruleStringProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringProperty2651); 

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
    // $ANTLR end entryRuleStringProperty


    // $ANTLR start ruleStringProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1319:1: ruleStringProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;
        Token lv_minLength_6=null;
        Token lv_maxLength_8=null;
        Token lv_regularExpression_10=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1324:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1325:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1325:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1325:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1325:2: (lv_description_0= RULE_STRING )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1327:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty2698); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1345:3: (lv_dataType_1= 'string' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1347:6: lv_dataType_1= 'string'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_ruleStringProperty2728); 

                    createLeafNode(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "string", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1366:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1368:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringProperty2763); 

            		createLeafNode(grammarAccess.getStringPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1386:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1386:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1386:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1388:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleStringProperty2793); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1407:2: (lv_defaultValue_4= RULE_STRING )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1409:6: lv_defaultValue_4= RULE_STRING
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty2828); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0(), "defaultValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defaultValue", lv_defaultValue_4, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1427:4: ( 'minlength' (lv_minLength_6= RULE_INT ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1427:5: 'minlength' (lv_minLength_6= RULE_INT )
                    {
                    match(input,36,FOLLOW_36_in_ruleStringProperty2848); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1431:1: (lv_minLength_6= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1433:6: lv_minLength_6= RULE_INT
                    {
                    lv_minLength_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty2870); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getMinLengthINTTerminalRuleCall_4_1_0(), "minLength"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "minLength", lv_minLength_6, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1451:4: ( 'maxlength' (lv_maxLength_8= RULE_INT ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1451:5: 'maxlength' (lv_maxLength_8= RULE_INT )
                    {
                    match(input,37,FOLLOW_37_in_ruleStringProperty2890); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1455:1: (lv_maxLength_8= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1457:6: lv_maxLength_8= RULE_INT
                    {
                    lv_maxLength_8=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty2912); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getMaxLengthINTTerminalRuleCall_5_1_0(), "maxLength"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "maxLength", lv_maxLength_8, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1475:4: ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1475:5: 'regexp' (lv_regularExpression_10= RULE_STRING )
                    {
                    match(input,38,FOLLOW_38_in_ruleStringProperty2932); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1479:1: (lv_regularExpression_10= RULE_STRING )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1481:6: lv_regularExpression_10= RULE_STRING
                    {
                    lv_regularExpression_10=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty2954); 

                    		createLeafNode(grammarAccess.getStringPropertyAccess().getRegularExpressionSTRINGTerminalRuleCall_6_1_0(), "regularExpression"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "regularExpression", lv_regularExpression_10, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleStringProperty


    // $ANTLR start entryRuleDateTimeProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1506:1: entryRuleDateTimeProperty returns [EObject current=null] : iv_ruleDateTimeProperty= ruleDateTimeProperty EOF ;
    public final EObject entryRuleDateTimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1506:58: (iv_ruleDateTimeProperty= ruleDateTimeProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1507:2: iv_ruleDateTimeProperty= ruleDateTimeProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDateTimePropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty2997);
            iv_ruleDateTimeProperty=ruleDateTimeProperty();
            _fsp--;

             current =iv_ruleDateTimeProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeProperty3007); 

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
    // $ANTLR end entryRuleDateTimeProperty


    // $ANTLR start ruleDateTimeProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1514:1: ruleDateTimeProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ) ;
    public final EObject ruleDateTimeProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1519:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1520:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1520:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1520:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1520:2: (lv_description_0= RULE_STRING )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1522:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty3054); 

                    		createLeafNode(grammarAccess.getDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1540:3: (lv_dataType_1= 'datetime' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1542:6: lv_dataType_1= 'datetime'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_ruleDateTimeProperty3084); 

                    createLeafNode(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "datetime", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1561:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1563:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeProperty3119); 

            		createLeafNode(grammarAccess.getDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1581:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1581:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1581:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1583:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleDateTimeProperty3149); 

                            createLeafNode(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1602:2: (lv_defaultValue_4= RULE_STRING )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1604:6: lv_defaultValue_4= RULE_STRING
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty3184); 

                    		createLeafNode(grammarAccess.getDateTimePropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0(), "defaultValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDateTimePropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defaultValue", lv_defaultValue_4, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleDateTimeProperty


    // $ANTLR start entryRuleIntegerProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1629:1: entryRuleIntegerProperty returns [EObject current=null] : iv_ruleIntegerProperty= ruleIntegerProperty EOF ;
    public final EObject entryRuleIntegerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1629:57: (iv_ruleIntegerProperty= ruleIntegerProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1630:2: iv_ruleIntegerProperty= ruleIntegerProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty3227);
            iv_ruleIntegerProperty=ruleIntegerProperty();
            _fsp--;

             current =iv_ruleIntegerProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerProperty3237); 

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
    // $ANTLR end entryRuleIntegerProperty


    // $ANTLR start ruleIntegerProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1637:1: ruleIntegerProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? ) ;
    public final EObject ruleIntegerProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;
        Token lv_minValue_6=null;
        Token lv_maxValue_8=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1642:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1643:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1643:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1643:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1643:2: (lv_description_0= RULE_STRING )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1645:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntegerProperty3284); 

                    		createLeafNode(grammarAccess.getIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1663:3: (lv_dataType_1= 'integer' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1665:6: lv_dataType_1= 'integer'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_ruleIntegerProperty3314); 

                    createLeafNode(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "integer", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1684:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1686:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerProperty3349); 

            		createLeafNode(grammarAccess.getIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1704:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1704:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1704:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1706:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleIntegerProperty3379); 

                            createLeafNode(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1725:2: (lv_defaultValue_4= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1727:6: lv_defaultValue_4= RULE_INT
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3414); 

                    		createLeafNode(grammarAccess.getIntegerPropertyAccess().getDefaultValueINTTerminalRuleCall_3_1_0(), "defaultValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defaultValue", lv_defaultValue_4, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1745:4: ( 'min' (lv_minValue_6= RULE_INT ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1745:5: 'min' (lv_minValue_6= RULE_INT )
                    {
                    match(input,41,FOLLOW_41_in_ruleIntegerProperty3434); 

                            createLeafNode(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1749:1: (lv_minValue_6= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1751:6: lv_minValue_6= RULE_INT
                    {
                    lv_minValue_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3456); 

                    		createLeafNode(grammarAccess.getIntegerPropertyAccess().getMinValueINTTerminalRuleCall_4_1_0(), "minValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "minValue", lv_minValue_6, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1769:4: ( 'max' (lv_maxValue_8= RULE_INT ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1769:5: 'max' (lv_maxValue_8= RULE_INT )
                    {
                    match(input,42,FOLLOW_42_in_ruleIntegerProperty3476); 

                            createLeafNode(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1773:1: (lv_maxValue_8= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1775:6: lv_maxValue_8= RULE_INT
                    {
                    lv_maxValue_8=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3498); 

                    		createLeafNode(grammarAccess.getIntegerPropertyAccess().getMaxValueINTTerminalRuleCall_5_1_0(), "maxValue"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "maxValue", lv_maxValue_8, "INT", lastConsumedNode);
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
    // $ANTLR end ruleIntegerProperty


    // $ANTLR start entryRuleDecimalProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1800:1: entryRuleDecimalProperty returns [EObject current=null] : iv_ruleDecimalProperty= ruleDecimalProperty EOF ;
    public final EObject entryRuleDecimalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1800:57: (iv_ruleDecimalProperty= ruleDecimalProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1801:2: iv_ruleDecimalProperty= ruleDecimalProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecimalPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty3541);
            iv_ruleDecimalProperty=ruleDecimalProperty();
            _fsp--;

             current =iv_ruleDecimalProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalProperty3551); 

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
    // $ANTLR end entryRuleDecimalProperty


    // $ANTLR start ruleDecimalProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1808:1: ruleDecimalProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDecimalProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1813:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1814:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1814:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1814:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1814:2: (lv_description_0= RULE_STRING )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1816:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalProperty3598); 

                    		createLeafNode(grammarAccess.getDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1834:3: (lv_dataType_1= 'decimal' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1836:6: lv_dataType_1= 'decimal'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_ruleDecimalProperty3628); 

                    createLeafNode(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0(), "dataType"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecimalPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "dataType", /* lv_dataType_1 */ input.LT(-1), "decimal", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1855:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1857:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecimalProperty3663); 

            		createLeafNode(grammarAccess.getDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecimalPropertyRule().getType().getClassifier());
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
    // $ANTLR end ruleDecimalProperty


    // $ANTLR start entryRuleEnumerationProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1882:1: entryRuleEnumerationProperty returns [EObject current=null] : iv_ruleEnumerationProperty= ruleEnumerationProperty EOF ;
    public final EObject entryRuleEnumerationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1882:61: (iv_ruleEnumerationProperty= ruleEnumerationProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1883:2: iv_ruleEnumerationProperty= ruleEnumerationProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty3704);
            iv_ruleEnumerationProperty=ruleEnumerationProperty();
            _fsp--;

             current =iv_ruleEnumerationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationProperty3714); 

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
    // $ANTLR end entryRuleEnumerationProperty


    // $ANTLR start ruleEnumerationProperty
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1890:1: ruleEnumerationProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? ) ;
    public final EObject ruleEnumerationProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValueAsString_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1895:6: ( ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1896:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1896:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1896:2: (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1896:2: (lv_description_0= RULE_STRING )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1898:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationProperty3761); 

                    		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1916:3: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1919:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty3792); 

            		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0(), "type"); 
            	

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1932:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1934:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty3817); 

            		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1952:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1952:3: (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1952:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1954:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleEnumerationProperty3847); 

                            createLeafNode(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1973:2: (lv_defaultValueAsString_4= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1975:6: lv_defaultValueAsString_4= RULE_ID
                    {
                    lv_defaultValueAsString_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty3882); 

                    		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0(), "defaultValueAsString"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "defaultValueAsString", lv_defaultValueAsString_4, "ID", lastConsumedNode);
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
    // $ANTLR end ruleEnumerationProperty


    // $ANTLR start ruleMultiplicity
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2000:1: ruleMultiplicity returns [Enumerator current=null] : ( ( 'many' ) | ( 'one' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2004:6: ( ( ( 'many' ) | ( 'one' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2005:1: ( ( 'many' ) | ( 'one' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2005:1: ( ( 'many' ) | ( 'one' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            else if ( (LA39_0==45) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2005:1: ( ( 'many' ) | ( 'one' ) )", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2005:2: ( 'many' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2005:2: ( 'many' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2005:4: 'many'
                    {
                    match(input,44,FOLLOW_44_in_ruleMultiplicity3939); 

                            current = grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2011:6: ( 'one' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2011:6: ( 'one' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2011:8: 'one'
                    {
                    match(input,45,FOLLOW_45_in_ruleMultiplicity3954); 

                            current = grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleMultiplicity


 

    public static final BitSet FOLLOW_ruleBusinessDomainModel_in_entryRuleBusinessDomainModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessDomainModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessDomainModel130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBusinessDomainModel148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessDomainModel170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessDomainModel187 = new BitSet(new long[]{0x000000000108A012L});
    public static final BitSet FOLLOW_ruleBusinessClassReference_in_ruleBusinessDomainModel221 = new BitSet(new long[]{0x000000000108A012L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel261 = new BitSet(new long[]{0x0000000001088012L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel305 = new BitSet(new long[]{0x0000000001088012L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleBusinessDomainModel349 = new BitSet(new long[]{0x0000000001088012L});
    public static final BitSet FOLLOW_ruleBusinessClassReference_in_entryRuleBusinessClassReference388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassReference398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBusinessClassReference432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassReference454 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBusinessClassReference471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClassReference493 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessClassReference510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation600 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAssociation618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation665 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation707 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAssociation733 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_17_in_ruleAssociation761 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation847 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_18_in_ruleAssociation876 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssociation899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClass942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessClass989 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBusinessClass1007 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass1029 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleBusinessClass1047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass1069 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBusinessClass1083 = new BitSet(new long[]{0x0000098880C00030L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleBusinessClass1117 = new BitSet(new long[]{0x0000098880C00030L});
    public static final BitSet FOLLOW_22_in_ruleBusinessClass1132 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBusinessClass1141 = new BitSet(new long[]{0x0000000004800030L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass1175 = new BitSet(new long[]{0x0000000004800030L});
    public static final BitSet FOLLOW_23_in_ruleBusinessClass1189 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBusinessClass1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumeration1290 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEnumeration1308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1330 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEnumeration1347 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1381 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleEnumeration1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral1485 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEnumerationLiteral1503 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral1525 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumerationLiteral1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule1576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBusinessRule1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessRule1749 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule1780 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessRule1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueRule1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUniqueRule1887 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUniqueRule1905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule1927 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUniqueRule1944 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule1966 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_27_in_ruleUniqueRule1979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule2001 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_23_in_ruleUniqueRule2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_ruleProperty2106 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_ruleStringProperty_in_ruleProperty2133 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_ruleProperty2160 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_ruleProperty2187 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_ruleProperty2214 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_ruleProperty2241 = new BitSet(new long[]{0x0000000030001000L});
    public static final BitSet FOLLOW_28_in_ruleProperty2262 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_29_in_ruleProperty2298 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_30_in_ruleProperty2332 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProperty2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty2390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolProperty2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoolProperty2447 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBoolProperty2477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolProperty2512 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleBoolProperty2542 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleBoolProperty2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBoolProperty2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_entryRuleStringProperty2641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringProperty2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty2698 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringProperty2728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringProperty2763 = new BitSet(new long[]{0x0000007100000002L});
    public static final BitSet FOLLOW_32_in_ruleStringProperty2793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty2828 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_36_in_ruleStringProperty2848 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty2870 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringProperty2890 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty2912 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleStringProperty2932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeProperty3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty3054 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDateTimeProperty3084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeProperty3119 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleDateTimeProperty3149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty3227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerProperty3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntegerProperty3284 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleIntegerProperty3314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerProperty3349 = new BitSet(new long[]{0x0000060100000002L});
    public static final BitSet FOLLOW_32_in_ruleIntegerProperty3379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3414 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleIntegerProperty3434 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3456 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleIntegerProperty3476 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty3541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalProperty3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalProperty3598 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDecimalProperty3628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecimalProperty3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty3704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationProperty3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationProperty3761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty3792 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty3817 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleEnumerationProperty3847 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultiplicity3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMultiplicity3954 = new BitSet(new long[]{0x0000000000000002L});

}