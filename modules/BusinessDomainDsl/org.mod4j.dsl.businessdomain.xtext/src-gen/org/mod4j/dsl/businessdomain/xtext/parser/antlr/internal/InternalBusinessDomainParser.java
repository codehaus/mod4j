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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "';'", "'association'", "'foreign key'", "'references'", "'<->'", "'->'", "'table'", "'ordered'", "'column'", "'class'", "'inherits'", "'['", "'rules'", "']'", "'enumeration'", "'='", "'unique'", "','", "'nullable'", "'derived'", "'writable'", "'boolean'", "'default'", "'true'", "'false'", "'string'", "'minlength'", "'maxlength'", "'regexp'", "'datetime'", "'integer'", "'min'", "'max'", "'decimal'", "'many'", "'one'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:81:1: ruleBusinessDomainModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )* ) ;
    public final EObject ruleBusinessDomainModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_types_4 = null;

        EObject lv_enumerations_5 = null;

        EObject lv_associations_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:86:6: ( ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:1: ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:1: ( (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )* )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:87:2: (lv_description_0= RULE_STRING )? 'domain' (lv_name_2= RULE_ID ) ';' ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )*
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
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:135:1: ( (lv_types_4= ruleBusinessClass ) | (lv_enumerations_5= ruleEnumeration ) | (lv_associations_6= ruleAssociation ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(2) ) {
                    case 21:
                        {
                        alt2=1;
                        }
                        break;
                    case 13:
                        {
                        alt2=3;
                        }
                        break;
                    case 26:
                        {
                        alt2=2;
                        }
                        break;

                    }

                    }
                    break;
                case 21:
                    {
                    alt2=1;
                    }
                    break;
                case 26:
                    {
                    alt2=2;
                    }
                    break;
                case 13:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:135:2: (lv_types_4= ruleBusinessClass )
            	    {
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:135:2: (lv_types_4= ruleBusinessClass )
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:138:6: lv_types_4= ruleBusinessClass
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel222);
            	    lv_types_4=ruleBusinessClass();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "types", lv_types_4, "BusinessClass", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:157:6: (lv_enumerations_5= ruleEnumeration )
            	    {
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:157:6: (lv_enumerations_5= ruleEnumeration )
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:160:6: lv_enumerations_5= ruleEnumeration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel266);
            	    lv_enumerations_5=ruleEnumeration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "enumerations", lv_enumerations_5, "Enumeration", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:179:6: (lv_associations_6= ruleAssociation )
            	    {
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:179:6: (lv_associations_6= ruleAssociation )
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:182:6: lv_associations_6= ruleAssociation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_4_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssociation_in_ruleBusinessDomainModel310);
            	    lv_associations_6=ruleAssociation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "associations", lv_associations_6, "Association", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start entryRuleAssociation
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:207:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:207:53: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:208:2: iv_ruleAssociation= ruleAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation349);
            iv_ruleAssociation=ruleAssociation();
            _fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation359); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:215:1: ruleAssociation returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) ( 'foreign key' (lv_sourceForeignKey_5= RULE_ID ) )? ( 'references' (lv_sourceAlternateKey_7= RULE_ID ) )? (lv_sourceMultiplicity_8= ruleMultiplicity ) ( (lv_bidirectional_9= '<->' ) | '->' ) (lv_targetMultiplicity_11= ruleMultiplicity ) ( 'table' (lv_table_13= RULE_ID ) )? ( RULE_ID ) (lv_targetRoleName_15= RULE_ID ) ( 'foreign key' (lv_targetForeignKey_17= RULE_ID ) )? ( 'references' (lv_targetAlternateKey_19= RULE_ID ) )? ( (lv_ordered_20= 'ordered' ) ( 'column' (lv_orderingColumn_22= RULE_ID ) )? )? ';' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_sourceRoleName_3=null;
        Token lv_sourceForeignKey_5=null;
        Token lv_sourceAlternateKey_7=null;
        Token lv_bidirectional_9=null;
        Token lv_table_13=null;
        Token lv_targetRoleName_15=null;
        Token lv_targetForeignKey_17=null;
        Token lv_targetAlternateKey_19=null;
        Token lv_ordered_20=null;
        Token lv_orderingColumn_22=null;
        Enumerator lv_sourceMultiplicity_8 = null;

        Enumerator lv_targetMultiplicity_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:220:6: ( ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) ( 'foreign key' (lv_sourceForeignKey_5= RULE_ID ) )? ( 'references' (lv_sourceAlternateKey_7= RULE_ID ) )? (lv_sourceMultiplicity_8= ruleMultiplicity ) ( (lv_bidirectional_9= '<->' ) | '->' ) (lv_targetMultiplicity_11= ruleMultiplicity ) ( 'table' (lv_table_13= RULE_ID ) )? ( RULE_ID ) (lv_targetRoleName_15= RULE_ID ) ( 'foreign key' (lv_targetForeignKey_17= RULE_ID ) )? ( 'references' (lv_targetAlternateKey_19= RULE_ID ) )? ( (lv_ordered_20= 'ordered' ) ( 'column' (lv_orderingColumn_22= RULE_ID ) )? )? ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:221:1: ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) ( 'foreign key' (lv_sourceForeignKey_5= RULE_ID ) )? ( 'references' (lv_sourceAlternateKey_7= RULE_ID ) )? (lv_sourceMultiplicity_8= ruleMultiplicity ) ( (lv_bidirectional_9= '<->' ) | '->' ) (lv_targetMultiplicity_11= ruleMultiplicity ) ( 'table' (lv_table_13= RULE_ID ) )? ( RULE_ID ) (lv_targetRoleName_15= RULE_ID ) ( 'foreign key' (lv_targetForeignKey_17= RULE_ID ) )? ( 'references' (lv_targetAlternateKey_19= RULE_ID ) )? ( (lv_ordered_20= 'ordered' ) ( 'column' (lv_orderingColumn_22= RULE_ID ) )? )? ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:221:1: ( (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) ( 'foreign key' (lv_sourceForeignKey_5= RULE_ID ) )? ( 'references' (lv_sourceAlternateKey_7= RULE_ID ) )? (lv_sourceMultiplicity_8= ruleMultiplicity ) ( (lv_bidirectional_9= '<->' ) | '->' ) (lv_targetMultiplicity_11= ruleMultiplicity ) ( 'table' (lv_table_13= RULE_ID ) )? ( RULE_ID ) (lv_targetRoleName_15= RULE_ID ) ( 'foreign key' (lv_targetForeignKey_17= RULE_ID ) )? ( 'references' (lv_targetAlternateKey_19= RULE_ID ) )? ( (lv_ordered_20= 'ordered' ) ( 'column' (lv_orderingColumn_22= RULE_ID ) )? )? ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:221:2: (lv_description_0= RULE_STRING )? 'association' ( RULE_ID ) (lv_sourceRoleName_3= RULE_ID ) ( 'foreign key' (lv_sourceForeignKey_5= RULE_ID ) )? ( 'references' (lv_sourceAlternateKey_7= RULE_ID ) )? (lv_sourceMultiplicity_8= ruleMultiplicity ) ( (lv_bidirectional_9= '<->' ) | '->' ) (lv_targetMultiplicity_11= ruleMultiplicity ) ( 'table' (lv_table_13= RULE_ID ) )? ( RULE_ID ) (lv_targetRoleName_15= RULE_ID ) ( 'foreign key' (lv_targetForeignKey_17= RULE_ID ) )? ( 'references' (lv_targetAlternateKey_19= RULE_ID ) )? ( (lv_ordered_20= 'ordered' ) ( 'column' (lv_orderingColumn_22= RULE_ID ) )? )? ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:221:2: (lv_description_0= RULE_STRING )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:223:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation406); 

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

            match(input,13,FOLLOW_13_in_ruleAssociation424); 

                    createLeafNode(grammarAccess.getAssociationAccess().getAssociationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:245:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:248:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation446); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0(), "source"); 
            	

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:261:2: (lv_sourceRoleName_3= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:263:6: lv_sourceRoleName_3= RULE_ID
            {
            lv_sourceRoleName_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation471); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:281:2: ( 'foreign key' (lv_sourceForeignKey_5= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:281:3: 'foreign key' (lv_sourceForeignKey_5= RULE_ID )
                    {
                    match(input,14,FOLLOW_14_in_ruleAssociation489); 

                            createLeafNode(grammarAccess.getAssociationAccess().getForeignKeyKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:285:1: (lv_sourceForeignKey_5= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:287:6: lv_sourceForeignKey_5= RULE_ID
                    {
                    lv_sourceForeignKey_5=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation511); 

                    		createLeafNode(grammarAccess.getAssociationAccess().getSourceForeignKeyIDTerminalRuleCall_4_1_0(), "sourceForeignKey"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "sourceForeignKey", lv_sourceForeignKey_5, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:305:4: ( 'references' (lv_sourceAlternateKey_7= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:305:5: 'references' (lv_sourceAlternateKey_7= RULE_ID )
                    {
                    match(input,15,FOLLOW_15_in_ruleAssociation531); 

                            createLeafNode(grammarAccess.getAssociationAccess().getReferencesKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:309:1: (lv_sourceAlternateKey_7= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:311:6: lv_sourceAlternateKey_7= RULE_ID
                    {
                    lv_sourceAlternateKey_7=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation553); 

                    		createLeafNode(grammarAccess.getAssociationAccess().getSourceAlternateKeyIDTerminalRuleCall_5_1_0(), "sourceAlternateKey"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "sourceAlternateKey", lv_sourceAlternateKey_7, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:329:4: (lv_sourceMultiplicity_8= ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:332:6: lv_sourceMultiplicity_8= ruleMultiplicity
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation597);
            lv_sourceMultiplicity_8=ruleMultiplicity();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "sourceMultiplicity", lv_sourceMultiplicity_8, "Multiplicity", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:350:2: ( (lv_bidirectional_9= '<->' ) | '->' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("350:2: ( (lv_bidirectional_9= '<->' ) | '->' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:350:3: (lv_bidirectional_9= '<->' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:350:3: (lv_bidirectional_9= '<->' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:352:6: lv_bidirectional_9= '<->'
                    {
                    lv_bidirectional_9=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleAssociation623); 

                            createLeafNode(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_7_0_0(), "bidirectional"); 
                        

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
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:372:6: '->'
                    {
                    match(input,17,FOLLOW_17_in_ruleAssociation651); 

                            createLeafNode(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_7_1(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:376:2: (lv_targetMultiplicity_11= ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:379:6: lv_targetMultiplicity_11= ruleMultiplicity
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation686);
            lv_targetMultiplicity_11=ruleMultiplicity();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "targetMultiplicity", lv_targetMultiplicity_11, "Multiplicity", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:397:2: ( 'table' (lv_table_13= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:397:3: 'table' (lv_table_13= RULE_ID )
                    {
                    match(input,18,FOLLOW_18_in_ruleAssociation700); 

                            createLeafNode(grammarAccess.getAssociationAccess().getTableKeyword_9_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:401:1: (lv_table_13= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:403:6: lv_table_13= RULE_ID
                    {
                    lv_table_13=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation722); 

                    		createLeafNode(grammarAccess.getAssociationAccess().getTableIDTerminalRuleCall_9_1_0(), "table"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "table", lv_table_13, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:421:4: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:424:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation754); 

            		createLeafNode(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_10_0(), "target"); 
            	

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:437:2: (lv_targetRoleName_15= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:439:6: lv_targetRoleName_15= RULE_ID
            {
            lv_targetRoleName_15=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation779); 

            		createLeafNode(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_11_0(), "targetRoleName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "targetRoleName", lv_targetRoleName_15, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:457:2: ( 'foreign key' (lv_targetForeignKey_17= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:457:3: 'foreign key' (lv_targetForeignKey_17= RULE_ID )
                    {
                    match(input,14,FOLLOW_14_in_ruleAssociation797); 

                            createLeafNode(grammarAccess.getAssociationAccess().getForeignKeyKeyword_12_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:461:1: (lv_targetForeignKey_17= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:463:6: lv_targetForeignKey_17= RULE_ID
                    {
                    lv_targetForeignKey_17=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation819); 

                    		createLeafNode(grammarAccess.getAssociationAccess().getTargetForeignKeyIDTerminalRuleCall_12_1_0(), "targetForeignKey"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "targetForeignKey", lv_targetForeignKey_17, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:481:4: ( 'references' (lv_targetAlternateKey_19= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:481:5: 'references' (lv_targetAlternateKey_19= RULE_ID )
                    {
                    match(input,15,FOLLOW_15_in_ruleAssociation839); 

                            createLeafNode(grammarAccess.getAssociationAccess().getReferencesKeyword_13_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:485:1: (lv_targetAlternateKey_19= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:487:6: lv_targetAlternateKey_19= RULE_ID
                    {
                    lv_targetAlternateKey_19=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation861); 

                    		createLeafNode(grammarAccess.getAssociationAccess().getTargetAlternateKeyIDTerminalRuleCall_13_1_0(), "targetAlternateKey"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "targetAlternateKey", lv_targetAlternateKey_19, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:505:4: ( (lv_ordered_20= 'ordered' ) ( 'column' (lv_orderingColumn_22= RULE_ID ) )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:505:5: (lv_ordered_20= 'ordered' ) ( 'column' (lv_orderingColumn_22= RULE_ID ) )?
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:505:5: (lv_ordered_20= 'ordered' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:507:6: lv_ordered_20= 'ordered'
                    {
                    lv_ordered_20=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleAssociation893); 

                            createLeafNode(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_14_0_0(), "ordered"); 
                        

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

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:526:2: ( 'column' (lv_orderingColumn_22= RULE_ID ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:526:3: 'column' (lv_orderingColumn_22= RULE_ID )
                            {
                            match(input,20,FOLLOW_20_in_ruleAssociation916); 

                                    createLeafNode(grammarAccess.getAssociationAccess().getColumnKeyword_14_1_0(), null); 
                                
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:530:1: (lv_orderingColumn_22= RULE_ID )
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:532:6: lv_orderingColumn_22= RULE_ID
                            {
                            lv_orderingColumn_22=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation938); 

                            		createLeafNode(grammarAccess.getAssociationAccess().getOrderingColumnIDTerminalRuleCall_14_1_1_0(), "orderingColumn"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "orderingColumn", lv_orderingColumn_22, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleAssociation959); 

                    createLeafNode(grammarAccess.getAssociationAccess().getSemicolonKeyword_15(), null); 
                

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:561:1: entryRuleBusinessClass returns [EObject current=null] : iv_ruleBusinessClass= ruleBusinessClass EOF ;
    public final EObject entryRuleBusinessClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessClass = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:561:55: (iv_ruleBusinessClass= ruleBusinessClass EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:562:2: iv_ruleBusinessClass= ruleBusinessClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass992);
            iv_ruleBusinessClass=ruleBusinessClass();
            _fsp--;

             current =iv_ruleBusinessClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClass1002); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:569:1: ruleBusinessClass returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? ( 'table' (lv_table_6= RULE_ID ) )? '[' (lv_properties_8= ruleProperty )* ( 'rules' '[' (lv_businessRules_11= ruleAbstractBusinessRule )* ']' )? ']' ) ;
    public final EObject ruleBusinessClass() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_table_6=null;
        EObject lv_properties_8 = null;

        EObject lv_businessRules_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:574:6: ( ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? ( 'table' (lv_table_6= RULE_ID ) )? '[' (lv_properties_8= ruleProperty )* ( 'rules' '[' (lv_businessRules_11= ruleAbstractBusinessRule )* ']' )? ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:575:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? ( 'table' (lv_table_6= RULE_ID ) )? '[' (lv_properties_8= ruleProperty )* ( 'rules' '[' (lv_businessRules_11= ruleAbstractBusinessRule )* ']' )? ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:575:1: ( (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? ( 'table' (lv_table_6= RULE_ID ) )? '[' (lv_properties_8= ruleProperty )* ( 'rules' '[' (lv_businessRules_11= ruleAbstractBusinessRule )* ']' )? ']' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:575:2: (lv_description_0= RULE_STRING )? 'class' (lv_name_2= RULE_ID ) ( 'inherits' ( RULE_ID ) )? ( 'table' (lv_table_6= RULE_ID ) )? '[' (lv_properties_8= ruleProperty )* ( 'rules' '[' (lv_businessRules_11= ruleAbstractBusinessRule )* ']' )? ']'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:575:2: (lv_description_0= RULE_STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:577:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessClass1049); 

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

            match(input,21,FOLLOW_21_in_ruleBusinessClass1067); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getClassKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:599:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:601:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass1089); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:619:2: ( 'inherits' ( RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:619:3: 'inherits' ( RULE_ID )
                    {
                    match(input,22,FOLLOW_22_in_ruleBusinessClass1107); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:623:1: ( RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:626:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass1129); 

                    		createLeafNode(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0(), "superclass"); 
                    	

                    }


                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:639:4: ( 'table' (lv_table_6= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:639:5: 'table' (lv_table_6= RULE_ID )
                    {
                    match(input,18,FOLLOW_18_in_ruleBusinessClass1144); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getTableKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:643:1: (lv_table_6= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:645:6: lv_table_6= RULE_ID
                    {
                    lv_table_6=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessClass1166); 

                    		createLeafNode(grammarAccess.getBusinessClassAccess().getTableIDTerminalRuleCall_4_1_0(), "table"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "table", lv_table_6, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleBusinessClass1185); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_5(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:667:1: (lv_properties_8= ruleProperty )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||LA15_0==33||LA15_0==37||(LA15_0>=41 && LA15_0<=42)||LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:670:6: lv_properties_8= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleBusinessClass1219);
            	    lv_properties_8=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "properties", lv_properties_8, "Property", currentNode);
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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:688:3: ( 'rules' '[' (lv_businessRules_11= ruleAbstractBusinessRule )* ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:688:4: 'rules' '[' (lv_businessRules_11= ruleAbstractBusinessRule )* ']'
                    {
                    match(input,24,FOLLOW_24_in_ruleBusinessClass1234); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getRulesKeyword_7_0(), null); 
                        
                    match(input,23,FOLLOW_23_in_ruleBusinessClass1243); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_7_1(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:696:1: (lv_businessRules_11= ruleAbstractBusinessRule )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==28) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:699:6: lv_businessRules_11= ruleAbstractBusinessRule
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_7_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass1277);
                    	    lv_businessRules_11=ruleAbstractBusinessRule();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getBusinessClassRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "businessRules", lv_businessRules_11, "AbstractBusinessRule", currentNode);
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

                    match(input,25,FOLLOW_25_in_ruleBusinessClass1291); 

                            createLeafNode(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7_3(), null); 
                        

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ruleBusinessClass1302); 

                    createLeafNode(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_8(), null); 
                

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:732:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:732:53: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:733:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1335);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1345); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:740:1: ruleEnumeration returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral ) )+ ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_enumerationLiterals_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:745:6: ( ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral ) )+ ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:746:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral ) )+ ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:746:1: ( (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral ) )+ ']' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:746:2: (lv_description_0= RULE_STRING )? 'enumeration' (lv_name_2= RULE_ID ) '[' (lv_enumerationLiterals_4= ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral ) )+ ']'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:746:2: (lv_description_0= RULE_STRING )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:748:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumeration1392); 

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

            match(input,26,FOLLOW_26_in_ruleEnumeration1410); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:770:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:772:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1432); 

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

            match(input,23,FOLLOW_23_in_ruleEnumeration1449); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:794:1: (lv_enumerationLiterals_4= ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:796:6: lv_enumerationLiterals_4= ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral )
            	    {
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:796:31: ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_ID) ) {
            	        int LA19_1 = input.LA(2);

            	        if ( (LA19_1==27) ) {
            	            int LA19_2 = input.LA(3);

            	            if ( (LA19_2==RULE_STRING) ) {
            	                alt19=2;
            	            }
            	            else if ( (LA19_2==RULE_INT) ) {
            	                alt19=1;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("796:31: ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral )", 19, 2, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("796:31: ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral )", 19, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("796:31: ( ruleIntegerEnumerationLiteral | ruleStringEnumerationLiteral )", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:796:33: ruleIntegerEnumerationLiteral
            	            {
            	             
            	                    currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsIntegerEnumerationLiteralParserRuleCall_4_0_0(), currentNode); 
            	                
            	            pushFollow(FOLLOW_ruleIntegerEnumerationLiteral_in_ruleEnumeration1475);
            	            ruleIntegerEnumerationLiteral();
            	            _fsp--;

            	             
            	                    currentNode = currentNode.getParent();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:803:7: ruleStringEnumerationLiteral
            	            {
            	             
            	                    currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsStringEnumerationLiteralParserRuleCall_4_0_1(), currentNode); 
            	                
            	            pushFollow(FOLLOW_ruleStringEnumerationLiteral_in_ruleEnumeration1489);
            	            ruleStringEnumerationLiteral();
            	            _fsp--;

            	             
            	                    currentNode = currentNode.getParent();
            	                

            	            }
            	            break;

            	    }


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "enumerationLiterals", lv_enumerationLiterals_4, null, lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            match(input,25,FOLLOW_25_in_ruleEnumeration1508); 

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


    // $ANTLR start entryRuleIntegerEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:835:1: entryRuleIntegerEnumerationLiteral returns [EObject current=null] : iv_ruleIntegerEnumerationLiteral= ruleIntegerEnumerationLiteral EOF ;
    public final EObject entryRuleIntegerEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerEnumerationLiteral = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:835:67: (iv_ruleIntegerEnumerationLiteral= ruleIntegerEnumerationLiteral EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:836:2: iv_ruleIntegerEnumerationLiteral= ruleIntegerEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerEnumerationLiteral_in_entryRuleIntegerEnumerationLiteral1541);
            iv_ruleIntegerEnumerationLiteral=ruleIntegerEnumerationLiteral();
            _fsp--;

             current =iv_ruleIntegerEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerEnumerationLiteral1551); 

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
    // $ANTLR end entryRuleIntegerEnumerationLiteral


    // $ANTLR start ruleIntegerEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:843:1: ruleIntegerEnumerationLiteral returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' ) ;
    public final EObject ruleIntegerEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_persistedValue_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:848:6: ( ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:849:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:849:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:849:2: (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_INT ) ) ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:849:2: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:851:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerEnumerationLiteral1598); 

            		createLeafNode(grammarAccess.getIntegerEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:869:2: ( '=' (lv_persistedValue_2= RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:869:3: '=' (lv_persistedValue_2= RULE_INT )
            {
            match(input,27,FOLLOW_27_in_ruleIntegerEnumerationLiteral1616); 

                    createLeafNode(grammarAccess.getIntegerEnumerationLiteralAccess().getEqualsSignKeyword_1_0(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:873:1: (lv_persistedValue_2= RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:875:6: lv_persistedValue_2= RULE_INT
            {
            lv_persistedValue_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerEnumerationLiteral1638); 

            		createLeafNode(grammarAccess.getIntegerEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0(), "persistedValue"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "persistedValue", lv_persistedValue_2, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleIntegerEnumerationLiteral1656); 

                    createLeafNode(grammarAccess.getIntegerEnumerationLiteralAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleIntegerEnumerationLiteral


    // $ANTLR start entryRuleStringEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:904:1: entryRuleStringEnumerationLiteral returns [EObject current=null] : iv_ruleStringEnumerationLiteral= ruleStringEnumerationLiteral EOF ;
    public final EObject entryRuleStringEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringEnumerationLiteral = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:904:66: (iv_ruleStringEnumerationLiteral= ruleStringEnumerationLiteral EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:905:2: iv_ruleStringEnumerationLiteral= ruleStringEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringEnumerationLiteral_in_entryRuleStringEnumerationLiteral1689);
            iv_ruleStringEnumerationLiteral=ruleStringEnumerationLiteral();
            _fsp--;

             current =iv_ruleStringEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringEnumerationLiteral1699); 

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
    // $ANTLR end entryRuleStringEnumerationLiteral


    // $ANTLR start ruleStringEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:912:1: ruleStringEnumerationLiteral returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_STRING ) ) ';' ) ;
    public final EObject ruleStringEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_persistedValue_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:917:6: ( ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_STRING ) ) ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:918:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_STRING ) ) ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:918:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_STRING ) ) ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:918:2: (lv_name_0= RULE_ID ) ( '=' (lv_persistedValue_2= RULE_STRING ) ) ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:918:2: (lv_name_0= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:920:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringEnumerationLiteral1746); 

            		createLeafNode(grammarAccess.getStringEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:938:2: ( '=' (lv_persistedValue_2= RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:938:3: '=' (lv_persistedValue_2= RULE_STRING )
            {
            match(input,27,FOLLOW_27_in_ruleStringEnumerationLiteral1764); 

                    createLeafNode(grammarAccess.getStringEnumerationLiteralAccess().getEqualsSignKeyword_1_0(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:942:1: (lv_persistedValue_2= RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:944:6: lv_persistedValue_2= RULE_STRING
            {
            lv_persistedValue_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringEnumerationLiteral1786); 

            		createLeafNode(grammarAccess.getStringEnumerationLiteralAccess().getPersistedValueSTRINGTerminalRuleCall_1_1_0(), "persistedValue"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "persistedValue", lv_persistedValue_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleStringEnumerationLiteral1804); 

                    createLeafNode(grammarAccess.getStringEnumerationLiteralAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleStringEnumerationLiteral


    // $ANTLR start entryRuleAbstractBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:973:1: entryRuleAbstractBusinessRule returns [EObject current=null] : iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF ;
    public final EObject entryRuleAbstractBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBusinessRule = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:973:62: (iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:974:2: iv_ruleAbstractBusinessRule= ruleAbstractBusinessRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractBusinessRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule1837);
            iv_ruleAbstractBusinessRule=ruleAbstractBusinessRule();
            _fsp--;

             current =iv_ruleAbstractBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBusinessRule1847); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:981:1: ruleAbstractBusinessRule returns [EObject current=null] : (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule ) ;
    public final EObject ruleAbstractBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject this_BusinessRule_0 = null;

        EObject this_UniqueRule_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:986:6: ( (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:987:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:987:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )
            int alt21=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    alt21=1;
                }
                else if ( (LA21_1==28) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("987:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case 28:
                {
                alt21=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("987:1: (this_BusinessRule_0= ruleBusinessRule | this_UniqueRule_1= ruleUniqueRule )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:988:5: this_BusinessRule_0= ruleBusinessRule
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule1894);
                    this_BusinessRule_0=ruleBusinessRule();
                    _fsp--;

                     
                            current = this_BusinessRule_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:998:5: this_UniqueRule_1= ruleUniqueRule
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBusinessRuleAccess().getUniqueRuleParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule1921);
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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1013:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1013:54: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1014:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBusinessRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule1953);
            iv_ruleBusinessRule=ruleBusinessRule();
            _fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule1963); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1021:1: ruleBusinessRule returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1026:6: ( ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1027:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1027:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1027:2: (lv_description_0= RULE_STRING )? (lv_name_1= RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1027:2: (lv_description_0= RULE_STRING )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1029:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBusinessRule2010); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1047:3: (lv_name_1= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1049:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule2041); 

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

            match(input,12,FOLLOW_12_in_ruleBusinessRule2058); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1078:1: entryRuleUniqueRule returns [EObject current=null] : iv_ruleUniqueRule= ruleUniqueRule EOF ;
    public final EObject entryRuleUniqueRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueRule = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1078:52: (iv_ruleUniqueRule= ruleUniqueRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1079:2: iv_ruleUniqueRule= ruleUniqueRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUniqueRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule2091);
            iv_ruleUniqueRule=ruleUniqueRule();
            _fsp--;

             current =iv_ruleUniqueRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueRule2101); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1086:1: ruleUniqueRule returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' ) ;
    public final EObject ruleUniqueRule() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1091:6: ( ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1092:1: ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1092:1: ( (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1092:2: (lv_description_0= RULE_STRING )? 'unique' (lv_name_2= RULE_ID ) '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1092:2: (lv_description_0= RULE_STRING )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1094:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUniqueRule2148); 

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

            match(input,28,FOLLOW_28_in_ruleUniqueRule2166); 

                    createLeafNode(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1116:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1118:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule2188); 

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

            match(input,23,FOLLOW_23_in_ruleUniqueRule2205); 

                    createLeafNode(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3(), null); 
                
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1140:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1143:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule2227); 

            		createLeafNode(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0(), "properties"); 
            	

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1156:2: ( ',' ( RULE_ID ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1156:3: ',' ( RULE_ID )
            	    {
            	    match(input,29,FOLLOW_29_in_ruleUniqueRule2240); 

            	            createLeafNode(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1160:1: ( RULE_ID )
            	    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1163:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getUniqueRuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueRule2262); 

            	    		createLeafNode(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0(), "properties"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleUniqueRule2276); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1187:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1187:50: (iv_ruleProperty= ruleProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1188:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2309);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2319); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1195:1: ruleProperty returns [EObject current=null] : ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ( 'column' (lv_column_10= RULE_ID ) )? ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_6=null;
        Token lv_derived_7=null;
        Token lv_writable_8=null;
        Token lv_column_10=null;
        EObject this_BoolProperty_0 = null;

        EObject this_StringProperty_1 = null;

        EObject this_DateTimeProperty_2 = null;

        EObject this_IntegerProperty_3 = null;

        EObject this_DecimalProperty_4 = null;

        EObject this_EnumerationProperty_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1200:6: ( ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ( 'column' (lv_column_10= RULE_ID ) )? ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1201:1: ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ( 'column' (lv_column_10= RULE_ID ) )? ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1201:1: ( (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ( 'column' (lv_column_10= RULE_ID ) )? ';' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1201:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty ) (lv_nullable_6= 'nullable' )? ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )? ( 'column' (lv_column_10= RULE_ID ) )? ';'
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1201:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )
            int alt25=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt25=1;
                    }
                    break;
                case 45:
                    {
                    alt25=5;
                    }
                    break;
                case 37:
                    {
                    alt25=2;
                    }
                    break;
                case 42:
                    {
                    alt25=4;
                    }
                    break;
                case 41:
                    {
                    alt25=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt25=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1201:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )", 25, 1, input);

                    throw nvae;
                }

                }
                break;
            case 33:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            case 42:
                {
                alt25=4;
                }
                break;
            case 45:
                {
                alt25=5;
                }
                break;
            case RULE_ID:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1201:2: (this_BoolProperty_0= ruleBoolProperty | this_StringProperty_1= ruleStringProperty | this_DateTimeProperty_2= ruleDateTimeProperty | this_IntegerProperty_3= ruleIntegerProperty | this_DecimalProperty_4= ruleDecimalProperty | this_EnumerationProperty_5= ruleEnumerationProperty )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1202:5: this_BoolProperty_0= ruleBoolProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolProperty_in_ruleProperty2367);
                    this_BoolProperty_0=ruleBoolProperty();
                    _fsp--;

                     
                            current = this_BoolProperty_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1212:5: this_StringProperty_1= ruleStringProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringProperty_in_ruleProperty2394);
                    this_StringProperty_1=ruleStringProperty();
                    _fsp--;

                     
                            current = this_StringProperty_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1222:5: this_DateTimeProperty_2= ruleDateTimeProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDateTimeProperty_in_ruleProperty2421);
                    this_DateTimeProperty_2=ruleDateTimeProperty();
                    _fsp--;

                     
                            current = this_DateTimeProperty_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1232:5: this_IntegerProperty_3= ruleIntegerProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerProperty_in_ruleProperty2448);
                    this_IntegerProperty_3=ruleIntegerProperty();
                    _fsp--;

                     
                            current = this_IntegerProperty_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1242:5: this_DecimalProperty_4= ruleDecimalProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecimalProperty_in_ruleProperty2475);
                    this_DecimalProperty_4=ruleDecimalProperty();
                    _fsp--;

                     
                            current = this_DecimalProperty_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1252:5: this_EnumerationProperty_5= ruleEnumerationProperty
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getEnumerationPropertyParserRuleCall_0_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumerationProperty_in_ruleProperty2502);
                    this_EnumerationProperty_5=ruleEnumerationProperty();
                    _fsp--;

                     
                            current = this_EnumerationProperty_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1260:2: (lv_nullable_6= 'nullable' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1262:6: lv_nullable_6= 'nullable'
                    {
                    lv_nullable_6=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleProperty2523); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1281:3: ( (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1281:4: (lv_derived_7= 'derived' ) (lv_writable_8= 'writable' )?
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1281:4: (lv_derived_7= 'derived' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1283:6: lv_derived_7= 'derived'
                    {
                    lv_derived_7=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleProperty2559); 

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

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1302:2: (lv_writable_8= 'writable' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==32) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1304:6: lv_writable_8= 'writable'
                            {
                            lv_writable_8=(Token)input.LT(1);
                            match(input,32,FOLLOW_32_in_ruleProperty2593); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1323:5: ( 'column' (lv_column_10= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1323:6: 'column' (lv_column_10= RULE_ID )
                    {
                    match(input,20,FOLLOW_20_in_ruleProperty2619); 

                            createLeafNode(grammarAccess.getPropertyAccess().getColumnKeyword_3_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1327:1: (lv_column_10= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1329:6: lv_column_10= RULE_ID
                    {
                    lv_column_10=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2641); 

                    		createLeafNode(grammarAccess.getPropertyAccess().getColumnIDTerminalRuleCall_3_1_0(), "column"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "column", lv_column_10, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleProperty2660); 

                    createLeafNode(grammarAccess.getPropertyAccess().getSemicolonKeyword_4(), null); 
                

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1358:1: entryRuleBoolProperty returns [EObject current=null] : iv_ruleBoolProperty= ruleBoolProperty EOF ;
    public final EObject entryRuleBoolProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1358:54: (iv_ruleBoolProperty= ruleBoolProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1359:2: iv_ruleBoolProperty= ruleBoolProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty2693);
            iv_ruleBoolProperty=ruleBoolProperty();
            _fsp--;

             current =iv_ruleBoolProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolProperty2703); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1366:1: ruleBoolProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? ) ;
    public final EObject ruleBoolProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1371:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1372:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1372:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1372:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'boolean' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1372:2: (lv_description_0= RULE_STRING )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1374:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoolProperty2750); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1392:3: (lv_dataType_1= 'boolean' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1394:6: lv_dataType_1= 'boolean'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleBoolProperty2780); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1413:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1415:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBoolProperty2815); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1433:2: ( (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1433:3: (lv_hasDefault_3= 'default' ) ( (lv_defaultValue_4= 'true' ) | 'false' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1433:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1435:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleBoolProperty2845); 

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

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1454:2: ( (lv_defaultValue_4= 'true' ) | 'false' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==35) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==36) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1454:2: ( (lv_defaultValue_4= 'true' ) | 'false' )", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1454:3: (lv_defaultValue_4= 'true' )
                            {
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1454:3: (lv_defaultValue_4= 'true' )
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1456:6: lv_defaultValue_4= 'true'
                            {
                            lv_defaultValue_4=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_ruleBoolProperty2880); 

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
                            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1476:6: 'false'
                            {
                            match(input,36,FOLLOW_36_in_ruleBoolProperty2908); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1487:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1487:56: (iv_ruleStringProperty= ruleStringProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1488:2: iv_ruleStringProperty= ruleStringProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringProperty_in_entryRuleStringProperty2944);
            iv_ruleStringProperty=ruleStringProperty();
            _fsp--;

             current =iv_ruleStringProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringProperty2954); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1495:1: ruleStringProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? ) ;
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1500:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1501:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1501:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1501:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'string' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ( 'minlength' (lv_minLength_6= RULE_INT ) )? ( 'maxlength' (lv_maxLength_8= RULE_INT ) )? ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1501:2: (lv_description_0= RULE_STRING )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1503:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty3001); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1521:3: (lv_dataType_1= 'string' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1523:6: lv_dataType_1= 'string'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_ruleStringProperty3031); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1542:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1544:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringProperty3066); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1562:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1562:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1562:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1564:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleStringProperty3096); 

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

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1583:2: (lv_defaultValue_4= RULE_STRING )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1585:6: lv_defaultValue_4= RULE_STRING
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty3131); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1603:4: ( 'minlength' (lv_minLength_6= RULE_INT ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1603:5: 'minlength' (lv_minLength_6= RULE_INT )
                    {
                    match(input,38,FOLLOW_38_in_ruleStringProperty3151); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1607:1: (lv_minLength_6= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1609:6: lv_minLength_6= RULE_INT
                    {
                    lv_minLength_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty3173); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1627:4: ( 'maxlength' (lv_maxLength_8= RULE_INT ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1627:5: 'maxlength' (lv_maxLength_8= RULE_INT )
                    {
                    match(input,39,FOLLOW_39_in_ruleStringProperty3193); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1631:1: (lv_maxLength_8= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1633:6: lv_maxLength_8= RULE_INT
                    {
                    lv_maxLength_8=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringProperty3215); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1651:4: ( 'regexp' (lv_regularExpression_10= RULE_STRING ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1651:5: 'regexp' (lv_regularExpression_10= RULE_STRING )
                    {
                    match(input,40,FOLLOW_40_in_ruleStringProperty3235); 

                            createLeafNode(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1655:1: (lv_regularExpression_10= RULE_STRING )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1657:6: lv_regularExpression_10= RULE_STRING
                    {
                    lv_regularExpression_10=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringProperty3257); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1682:1: entryRuleDateTimeProperty returns [EObject current=null] : iv_ruleDateTimeProperty= ruleDateTimeProperty EOF ;
    public final EObject entryRuleDateTimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1682:58: (iv_ruleDateTimeProperty= ruleDateTimeProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1683:2: iv_ruleDateTimeProperty= ruleDateTimeProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDateTimePropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty3300);
            iv_ruleDateTimeProperty=ruleDateTimeProperty();
            _fsp--;

             current =iv_ruleDateTimeProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeProperty3310); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1690:1: ruleDateTimeProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ) ;
    public final EObject ruleDateTimeProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValue_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1695:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1696:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1696:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1696:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'datetime' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1696:2: (lv_description_0= RULE_STRING )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1698:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty3357); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1716:3: (lv_dataType_1= 'datetime' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1718:6: lv_dataType_1= 'datetime'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleDateTimeProperty3387); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1737:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1739:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeProperty3422); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1757:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1757:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_STRING )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1757:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1759:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleDateTimeProperty3452); 

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

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1778:2: (lv_defaultValue_4= RULE_STRING )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1780:6: lv_defaultValue_4= RULE_STRING
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeProperty3487); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1805:1: entryRuleIntegerProperty returns [EObject current=null] : iv_ruleIntegerProperty= ruleIntegerProperty EOF ;
    public final EObject entryRuleIntegerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1805:57: (iv_ruleIntegerProperty= ruleIntegerProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1806:2: iv_ruleIntegerProperty= ruleIntegerProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty3530);
            iv_ruleIntegerProperty=ruleIntegerProperty();
            _fsp--;

             current =iv_ruleIntegerProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerProperty3540); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1813:1: ruleIntegerProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? ) ;
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
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1818:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1819:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1819:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1819:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'integer' ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )? ( 'min' (lv_minValue_6= RULE_INT ) )? ( 'max' (lv_maxValue_8= RULE_INT ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1819:2: (lv_description_0= RULE_STRING )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1821:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntegerProperty3587); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1839:3: (lv_dataType_1= 'integer' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1841:6: lv_dataType_1= 'integer'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_ruleIntegerProperty3617); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1860:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1862:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerProperty3652); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1880:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==34) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1880:3: (lv_hasDefault_3= 'default' ) (lv_defaultValue_4= RULE_INT )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1880:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1882:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleIntegerProperty3682); 

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

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1901:2: (lv_defaultValue_4= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1903:6: lv_defaultValue_4= RULE_INT
                    {
                    lv_defaultValue_4=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3717); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1921:4: ( 'min' (lv_minValue_6= RULE_INT ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1921:5: 'min' (lv_minValue_6= RULE_INT )
                    {
                    match(input,43,FOLLOW_43_in_ruleIntegerProperty3737); 

                            createLeafNode(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1925:1: (lv_minValue_6= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1927:6: lv_minValue_6= RULE_INT
                    {
                    lv_minValue_6=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3759); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1945:4: ( 'max' (lv_maxValue_8= RULE_INT ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1945:5: 'max' (lv_maxValue_8= RULE_INT )
                    {
                    match(input,44,FOLLOW_44_in_ruleIntegerProperty3779); 

                            createLeafNode(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0(), null); 
                        
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1949:1: (lv_maxValue_8= RULE_INT )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1951:6: lv_maxValue_8= RULE_INT
                    {
                    lv_maxValue_8=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerProperty3801); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1976:1: entryRuleDecimalProperty returns [EObject current=null] : iv_ruleDecimalProperty= ruleDecimalProperty EOF ;
    public final EObject entryRuleDecimalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1976:57: (iv_ruleDecimalProperty= ruleDecimalProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1977:2: iv_ruleDecimalProperty= ruleDecimalProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecimalPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty3844);
            iv_ruleDecimalProperty=ruleDecimalProperty();
            _fsp--;

             current =iv_ruleDecimalProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalProperty3854); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1984:1: ruleDecimalProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleDecimalProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_dataType_1=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1989:6: ( ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1990:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1990:1: ( (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1990:2: (lv_description_0= RULE_STRING )? (lv_dataType_1= 'decimal' ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1990:2: (lv_description_0= RULE_STRING )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:1992:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalProperty3901); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2010:3: (lv_dataType_1= 'decimal' )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2012:6: lv_dataType_1= 'decimal'
            {
            lv_dataType_1=(Token)input.LT(1);
            match(input,45,FOLLOW_45_in_ruleDecimalProperty3931); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2031:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2033:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecimalProperty3966); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2058:1: entryRuleEnumerationProperty returns [EObject current=null] : iv_ruleEnumerationProperty= ruleEnumerationProperty EOF ;
    public final EObject entryRuleEnumerationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationProperty = null;


        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2058:61: (iv_ruleEnumerationProperty= ruleEnumerationProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2059:2: iv_ruleEnumerationProperty= ruleEnumerationProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty4007);
            iv_ruleEnumerationProperty=ruleEnumerationProperty();
            _fsp--;

             current =iv_ruleEnumerationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationProperty4017); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2066:1: ruleEnumerationProperty returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? ) ;
    public final EObject ruleEnumerationProperty() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Token lv_hasDefault_3=null;
        Token lv_defaultValueAsString_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2071:6: ( ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2072:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2072:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )? )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2072:2: (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )?
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2072:2: (lv_description_0= RULE_STRING )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2074:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationProperty4064); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2092:3: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2095:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty4095); 

            		createLeafNode(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0(), "type"); 
            	

            }

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2108:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2110:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty4120); 

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

            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2128:2: ( (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2128:3: (lv_hasDefault_3= 'default' ) (lv_defaultValueAsString_4= RULE_ID )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2128:3: (lv_hasDefault_3= 'default' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2130:6: lv_hasDefault_3= 'default'
                    {
                    lv_hasDefault_3=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleEnumerationProperty4150); 

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

                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2149:2: (lv_defaultValueAsString_4= RULE_ID )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2151:6: lv_defaultValueAsString_4= RULE_ID
                    {
                    lv_defaultValueAsString_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationProperty4185); 

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
    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2176:1: ruleMultiplicity returns [Enumerator current=null] : ( ( 'many' ) | ( 'one' ) ) ;
    public final Enumerator ruleMultiplicity() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2180:6: ( ( ( 'many' ) | ( 'one' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2181:1: ( ( 'many' ) | ( 'one' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2181:1: ( ( 'many' ) | ( 'one' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            else if ( (LA47_0==47) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2181:1: ( ( 'many' ) | ( 'one' ) )", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2181:2: ( 'many' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2181:2: ( 'many' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2181:4: 'many'
                    {
                    match(input,46,FOLLOW_46_in_ruleMultiplicity4242); 

                            current = grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2187:6: ( 'one' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2187:6: ( 'one' )
                    // ../org.mod4j.dsl.businessdomain.xtext/src-gen/org/mod4j/dsl/businessdomain/xtext/parser/antlr/internal/InternalBusinessDomain.g:2187:8: 'one'
                    {
                    match(input,47,FOLLOW_47_in_ruleMultiplicity4257); 

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
    public static final BitSet FOLLOW_12_in_ruleBusinessDomainModel187 = new BitSet(new long[]{0x0000000004202012L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_ruleBusinessDomainModel222 = new BitSet(new long[]{0x0000000004202012L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleBusinessDomainModel266 = new BitSet(new long[]{0x0000000004202012L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleBusinessDomainModel310 = new BitSet(new long[]{0x0000000004202012L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssociation424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation471 = new BitSet(new long[]{0x0000C0000000C000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation511 = new BitSet(new long[]{0x0000C00000008000L});
    public static final BitSet FOLLOW_15_in_ruleAssociation531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation553 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation597 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAssociation623 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_17_in_ruleAssociation651 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation686 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleAssociation700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation779 = new BitSet(new long[]{0x000000000008D000L});
    public static final BitSet FOLLOW_14_in_ruleAssociation797 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation819 = new BitSet(new long[]{0x0000000000089000L});
    public static final BitSet FOLLOW_15_in_ruleAssociation839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation861 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_19_in_ruleAssociation893 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleAssociation916 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation938 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssociation959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClass1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessClass1049 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBusinessClass1067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass1089 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_22_in_ruleBusinessClass1107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass1129 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18_in_ruleBusinessClass1144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessClass1166 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBusinessClass1185 = new BitSet(new long[]{0x0000262203000030L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleBusinessClass1219 = new BitSet(new long[]{0x0000262203000030L});
    public static final BitSet FOLLOW_24_in_ruleBusinessClass1234 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBusinessClass1243 = new BitSet(new long[]{0x0000000012000030L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_ruleBusinessClass1277 = new BitSet(new long[]{0x0000000012000030L});
    public static final BitSet FOLLOW_25_in_ruleBusinessClass1291 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBusinessClass1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumeration1392 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumeration1410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1432 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumeration1449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIntegerEnumerationLiteral_in_ruleEnumeration1475 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleStringEnumerationLiteral_in_ruleEnumeration1489 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleEnumeration1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerEnumerationLiteral_in_entryRuleIntegerEnumerationLiteral1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerEnumerationLiteral1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerEnumerationLiteral1598 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIntegerEnumerationLiteral1616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerEnumerationLiteral1638 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIntegerEnumerationLiteral1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringEnumerationLiteral_in_entryRuleStringEnumerationLiteral1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringEnumerationLiteral1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringEnumerationLiteral1746 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStringEnumerationLiteral1764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringEnumerationLiteral1786 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStringEnumerationLiteral1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule1837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBusinessRule1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_ruleAbstractBusinessRule1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_ruleAbstractBusinessRule1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBusinessRule2010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule2041 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessRule2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueRule2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUniqueRule2148 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUniqueRule2166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule2188 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUniqueRule2205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule2227 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_29_in_ruleUniqueRule2240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueRule2262 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_25_in_ruleUniqueRule2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_ruleProperty2367 = new BitSet(new long[]{0x00000000C0101000L});
    public static final BitSet FOLLOW_ruleStringProperty_in_ruleProperty2394 = new BitSet(new long[]{0x00000000C0101000L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_ruleProperty2421 = new BitSet(new long[]{0x00000000C0101000L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_ruleProperty2448 = new BitSet(new long[]{0x00000000C0101000L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_ruleProperty2475 = new BitSet(new long[]{0x00000000C0101000L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_ruleProperty2502 = new BitSet(new long[]{0x00000000C0101000L});
    public static final BitSet FOLLOW_30_in_ruleProperty2523 = new BitSet(new long[]{0x0000000080101000L});
    public static final BitSet FOLLOW_31_in_ruleProperty2559 = new BitSet(new long[]{0x0000000100101000L});
    public static final BitSet FOLLOW_32_in_ruleProperty2593 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleProperty2619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2641 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProperty2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty2693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolProperty2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoolProperty2750 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBoolProperty2780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBoolProperty2815 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleBoolProperty2845 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleBoolProperty2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBoolProperty2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_entryRuleStringProperty2944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringProperty2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty3001 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleStringProperty3031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringProperty3066 = new BitSet(new long[]{0x000001C400000002L});
    public static final BitSet FOLLOW_34_in_ruleStringProperty3096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty3131 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleStringProperty3151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty3173 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleStringProperty3193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringProperty3215 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleStringProperty3235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringProperty3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeProperty3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty3357 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDateTimeProperty3387 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeProperty3422 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleDateTimeProperty3452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeProperty3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty3530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerProperty3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntegerProperty3587 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleIntegerProperty3617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerProperty3652 = new BitSet(new long[]{0x0000180400000002L});
    public static final BitSet FOLLOW_34_in_ruleIntegerProperty3682 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3717 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleIntegerProperty3737 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3759 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleIntegerProperty3779 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerProperty3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty3844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalProperty3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalProperty3901 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDecimalProperty3931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecimalProperty3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty4007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationProperty4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationProperty4064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty4095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty4120 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleEnumerationProperty4150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationProperty4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultiplicity4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMultiplicity4257 = new BitSet(new long[]{0x0000000000000002L});

}