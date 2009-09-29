package org.mod4j.dsl.service.xtext.parser.antlr.internal; 

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
import org.mod4j.dsl.service.xtext.services.ServiceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalServiceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'service'", "';'", "'for'", "'reference'", "'from'", "'import'", "'method'", "'in'", "'('", "','", "')'", "'out'", "'crud'", "'create'", "'read'", "'update'", "'delete'", "'listall'", "'find'", "'add'", "'remove'", "'get'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalServiceParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g"; }


     
     	private ServiceGrammarAccess grammarAccess;
     	
        public InternalServiceParser(TokenStream input, IAstFactory factory, ServiceGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ServiceModel";	
       	} 



    // $ANTLR start entryRuleServiceModel
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:73:1: entryRuleServiceModel returns [EObject current=null] : iv_ruleServiceModel= ruleServiceModel EOF ;
    public final EObject entryRuleServiceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceModel = null;


        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:73:54: (iv_ruleServiceModel= ruleServiceModel EOF )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:74:2: iv_ruleServiceModel= ruleServiceModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceModel_in_entryRuleServiceModel73);
            iv_ruleServiceModel=ruleServiceModel();
            _fsp--;

             current =iv_ruleServiceModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceModel83); 

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
    // $ANTLR end entryRuleServiceModel


    // $ANTLR start ruleServiceModel
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:81:1: ruleServiceModel returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'service' (lv_name_2= RULE_ID ) ';' (lv_dtoReferences_4= ruleDtoReference )* ( (lv_crudServices_5= ruleCrudService ) | (lv_methods_6= ruleServiceMethod ) )* ) ;
    public final EObject ruleServiceModel() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_dtoReferences_4 = null;

        EObject lv_crudServices_5 = null;

        EObject lv_methods_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:86:6: ( ( (lv_description_0= RULE_STRING )? 'service' (lv_name_2= RULE_ID ) ';' (lv_dtoReferences_4= ruleDtoReference )* ( (lv_crudServices_5= ruleCrudService ) | (lv_methods_6= ruleServiceMethod ) )* ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:87:1: ( (lv_description_0= RULE_STRING )? 'service' (lv_name_2= RULE_ID ) ';' (lv_dtoReferences_4= ruleDtoReference )* ( (lv_crudServices_5= ruleCrudService ) | (lv_methods_6= ruleServiceMethod ) )* )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:87:1: ( (lv_description_0= RULE_STRING )? 'service' (lv_name_2= RULE_ID ) ';' (lv_dtoReferences_4= ruleDtoReference )* ( (lv_crudServices_5= ruleCrudService ) | (lv_methods_6= ruleServiceMethod ) )* )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:87:2: (lv_description_0= RULE_STRING )? 'service' (lv_name_2= RULE_ID ) ';' (lv_dtoReferences_4= ruleDtoReference )* ( (lv_crudServices_5= ruleCrudService ) | (lv_methods_6= ruleServiceMethod ) )*
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:87:2: (lv_description_0= RULE_STRING )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:89:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceModel130); 

                    		createLeafNode(grammarAccess.getServiceModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceModelRule().getType().getClassifier());
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

            match(input,11,FOLLOW_11_in_ruleServiceModel148); 

                    createLeafNode(grammarAccess.getServiceModelAccess().getServiceKeyword_1(), null); 
                
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:111:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:113:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceModel170); 

            		createLeafNode(grammarAccess.getServiceModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,12,FOLLOW_12_in_ruleServiceModel187); 

                    createLeafNode(grammarAccess.getServiceModelAccess().getSemicolonKeyword_3(), null); 
                
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:135:1: (lv_dtoReferences_4= ruleDtoReference )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:138:6: lv_dtoReferences_4= ruleDtoReference
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceModelAccess().getDtoReferencesDtoReferenceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDtoReference_in_ruleServiceModel221);
            	    lv_dtoReferences_4=ruleDtoReference();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getServiceModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "dtoReferences", lv_dtoReferences_4, "DtoReference", currentNode);
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

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:156:3: ( (lv_crudServices_5= ruleCrudService ) | (lv_methods_6= ruleServiceMethod ) )*
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==13||LA3_2==17||(LA3_2>=24 && LA3_2<=29)) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==23) ) {
                        alt3=1;
                    }


                    }
                    break;
                case 23:
                    {
                    alt3=1;
                    }
                    break;
                case 13:
                case 17:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:156:4: (lv_crudServices_5= ruleCrudService )
            	    {
            	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:156:4: (lv_crudServices_5= ruleCrudService )
            	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:159:6: lv_crudServices_5= ruleCrudService
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceModelAccess().getCrudServicesCrudServiceParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCrudService_in_ruleServiceModel261);
            	    lv_crudServices_5=ruleCrudService();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getServiceModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "crudServices", lv_crudServices_5, "CrudService", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:178:6: (lv_methods_6= ruleServiceMethod )
            	    {
            	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:178:6: (lv_methods_6= ruleServiceMethod )
            	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:181:6: lv_methods_6= ruleServiceMethod
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceModelAccess().getMethodsServiceMethodParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceMethod_in_ruleServiceModel305);
            	    lv_methods_6=ruleServiceMethod();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getServiceModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "methods", lv_methods_6, "ServiceMethod", currentNode);
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
    // $ANTLR end ruleServiceModel


    // $ANTLR start entryRuleAssociationMethod
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:206:1: entryRuleAssociationMethod returns [EObject current=null] : iv_ruleAssociationMethod= ruleAssociationMethod EOF ;
    public final EObject entryRuleAssociationMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMethod = null;


        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:206:59: (iv_ruleAssociationMethod= ruleAssociationMethod EOF )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:207:2: iv_ruleAssociationMethod= ruleAssociationMethod EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationMethodRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociationMethod_in_entryRuleAssociationMethod344);
            iv_ruleAssociationMethod=ruleAssociationMethod();
            _fsp--;

             current =iv_ruleAssociationMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationMethod354); 

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
    // $ANTLR end entryRuleAssociationMethod


    // $ANTLR start ruleAssociationMethod
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:214:1: ruleAssociationMethod returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_name_1= 'for' ) ( RULE_ID ) 'reference' (lv_rolename_4= RULE_ID ) (lv_type_5= ruleAssociationMethodType ) ( RULE_ID ) ';' ) ;
    public final EObject ruleAssociationMethod() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_1=null;
        Token lv_rolename_4=null;
        Enumerator lv_type_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:219:6: ( ( (lv_description_0= RULE_STRING )? (lv_name_1= 'for' ) ( RULE_ID ) 'reference' (lv_rolename_4= RULE_ID ) (lv_type_5= ruleAssociationMethodType ) ( RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:220:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= 'for' ) ( RULE_ID ) 'reference' (lv_rolename_4= RULE_ID ) (lv_type_5= ruleAssociationMethodType ) ( RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:220:1: ( (lv_description_0= RULE_STRING )? (lv_name_1= 'for' ) ( RULE_ID ) 'reference' (lv_rolename_4= RULE_ID ) (lv_type_5= ruleAssociationMethodType ) ( RULE_ID ) ';' )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:220:2: (lv_description_0= RULE_STRING )? (lv_name_1= 'for' ) ( RULE_ID ) 'reference' (lv_rolename_4= RULE_ID ) (lv_type_5= ruleAssociationMethodType ) ( RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:220:2: (lv_description_0= RULE_STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:222:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociationMethod401); 

                    		createLeafNode(grammarAccess.getAssociationMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssociationMethodRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:240:3: (lv_name_1= 'for' )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:242:6: lv_name_1= 'for'
            {
            lv_name_1=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_ruleAssociationMethod431); 

                    createLeafNode(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0(), "name"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", /* lv_name_1 */ input.LT(-1), "for", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:261:2: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:264:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationMethod466); 

            		createLeafNode(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceCrossReference_2_0(), "main"); 
            	

            }

            match(input,14,FOLLOW_14_in_ruleAssociationMethod478); 

                    createLeafNode(grammarAccess.getAssociationMethodAccess().getReferenceKeyword_3(), null); 
                
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:281:1: (lv_rolename_4= RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:283:6: lv_rolename_4= RULE_ID
            {
            lv_rolename_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationMethod500); 

            		createLeafNode(grammarAccess.getAssociationMethodAccess().getRolenameIDTerminalRuleCall_4_0(), "rolename"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "rolename", lv_rolename_4, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:301:2: (lv_type_5= ruleAssociationMethodType )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:304:6: lv_type_5= ruleAssociationMethodType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssociationMethodAccess().getTypeAssociationMethodTypeEnumRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssociationMethodType_in_ruleAssociationMethod542);
            lv_type_5=ruleAssociationMethodType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_5, "AssociationMethodType", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:322:2: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:325:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationMethod568); 

            		createLeafNode(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceCrossReference_6_0(), "part"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleAssociationMethod580); 

                    createLeafNode(grammarAccess.getAssociationMethodAccess().getSemicolonKeyword_7(), null); 
                

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
    // $ANTLR end ruleAssociationMethod


    // $ANTLR start entryRuleDtoReference
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:349:1: entryRuleDtoReference returns [EObject current=null] : iv_ruleDtoReference= ruleDtoReference EOF ;
    public final EObject entryRuleDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtoReference = null;


        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:349:54: (iv_ruleDtoReference= ruleDtoReference EOF )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:350:2: iv_ruleDtoReference= ruleDtoReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDtoReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleDtoReference_in_entryRuleDtoReference613);
            iv_ruleDtoReference=ruleDtoReference();
            _fsp--;

             current =iv_ruleDtoReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoReference623); 

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
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:357:1: ruleDtoReference returns [EObject current=null] : ( 'from' (lv_modelname_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) ;
    public final EObject ruleDtoReference() throws RecognitionException {
        EObject current = null;

        Token lv_modelname_1=null;
        Token lv_name_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:362:6: ( ( 'from' (lv_modelname_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:363:1: ( 'from' (lv_modelname_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:363:1: ( 'from' (lv_modelname_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';' )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:363:2: 'from' (lv_modelname_1= RULE_ID ) 'import' (lv_name_3= RULE_ID ) ';'
            {
            match(input,15,FOLLOW_15_in_ruleDtoReference657); 

                    createLeafNode(grammarAccess.getDtoReferenceAccess().getFromKeyword_0(), null); 
                
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:367:1: (lv_modelname_1= RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:369:6: lv_modelname_1= RULE_ID
            {
            lv_modelname_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference679); 

            		createLeafNode(grammarAccess.getDtoReferenceAccess().getModelnameIDTerminalRuleCall_1_0(), "modelname"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDtoReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "modelname", lv_modelname_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,16,FOLLOW_16_in_ruleDtoReference696); 

                    createLeafNode(grammarAccess.getDtoReferenceAccess().getImportKeyword_2(), null); 
                
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:391:1: (lv_name_3= RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:393:6: lv_name_3= RULE_ID
            {
            lv_name_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDtoReference718); 

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

            match(input,12,FOLLOW_12_in_ruleDtoReference735); 

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


    // $ANTLR start entryRuleServiceMethod
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:422:1: entryRuleServiceMethod returns [EObject current=null] : iv_ruleServiceMethod= ruleServiceMethod EOF ;
    public final EObject entryRuleServiceMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMethod = null;


        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:422:55: (iv_ruleServiceMethod= ruleServiceMethod EOF )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:423:2: iv_ruleServiceMethod= ruleServiceMethod EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceMethodRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod768);
            iv_ruleServiceMethod=ruleServiceMethod();
            _fsp--;

             current =iv_ruleServiceMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethod778); 

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
    // $ANTLR end entryRuleServiceMethod


    // $ANTLR start ruleServiceMethod
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:430:1: ruleServiceMethod returns [EObject current=null] : (this_CustomMethod_0= ruleCustomMethod | this_SpecialMethod_1= ruleSpecialMethod | this_AssociationMethod_2= ruleAssociationMethod ) ;
    public final EObject ruleServiceMethod() throws RecognitionException {
        EObject current = null;

        EObject this_CustomMethod_0 = null;

        EObject this_SpecialMethod_1 = null;

        EObject this_AssociationMethod_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:435:6: ( (this_CustomMethod_0= ruleCustomMethod | this_SpecialMethod_1= ruleSpecialMethod | this_AssociationMethod_2= ruleAssociationMethod ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:436:1: (this_CustomMethod_0= ruleCustomMethod | this_SpecialMethod_1= ruleSpecialMethod | this_AssociationMethod_2= ruleAssociationMethod )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:436:1: (this_CustomMethod_0= ruleCustomMethod | this_SpecialMethod_1= ruleSpecialMethod | this_AssociationMethod_2= ruleAssociationMethod )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt5=1;
                    }
                    break;
                case 13:
                    {
                    alt5=3;
                    }
                    break;
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("436:1: (this_CustomMethod_0= ruleCustomMethod | this_SpecialMethod_1= ruleSpecialMethod | this_AssociationMethod_2= ruleAssociationMethod )", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 17:
                {
                alt5=1;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("436:1: (this_CustomMethod_0= ruleCustomMethod | this_SpecialMethod_1= ruleSpecialMethod | this_AssociationMethod_2= ruleAssociationMethod )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:437:5: this_CustomMethod_0= ruleCustomMethod
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getServiceMethodAccess().getCustomMethodParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomMethod_in_ruleServiceMethod825);
                    this_CustomMethod_0=ruleCustomMethod();
                    _fsp--;

                     
                            current = this_CustomMethod_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:447:5: this_SpecialMethod_1= ruleSpecialMethod
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getServiceMethodAccess().getSpecialMethodParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSpecialMethod_in_ruleServiceMethod852);
                    this_SpecialMethod_1=ruleSpecialMethod();
                    _fsp--;

                     
                            current = this_SpecialMethod_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:457:5: this_AssociationMethod_2= ruleAssociationMethod
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getServiceMethodAccess().getAssociationMethodParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssociationMethod_in_ruleServiceMethod879);
                    this_AssociationMethod_2=ruleAssociationMethod();
                    _fsp--;

                     
                            current = this_AssociationMethod_2; 
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
    // $ANTLR end ruleServiceMethod


    // $ANTLR start entryRuleCustomMethod
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:472:1: entryRuleCustomMethod returns [EObject current=null] : iv_ruleCustomMethod= ruleCustomMethod EOF ;
    public final EObject entryRuleCustomMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomMethod = null;


        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:472:54: (iv_ruleCustomMethod= ruleCustomMethod EOF )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:473:2: iv_ruleCustomMethod= ruleCustomMethod EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomMethodRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomMethod_in_entryRuleCustomMethod911);
            iv_ruleCustomMethod=ruleCustomMethod();
            _fsp--;

             current =iv_ruleCustomMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomMethod921); 

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
    // $ANTLR end entryRuleCustomMethod


    // $ANTLR start ruleCustomMethod
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:480:1: ruleCustomMethod returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'method' (lv_name_2= RULE_ID ) ( 'in' '(' (lv_inParameters_5= ruleParameter ) ( ',' (lv_inParameters_7= ruleParameter ) )* ')' )? ( 'out' ( RULE_ID ) )? ';' ) ;
    public final EObject ruleCustomMethod() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        EObject lv_inParameters_5 = null;

        EObject lv_inParameters_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:485:6: ( ( (lv_description_0= RULE_STRING )? 'method' (lv_name_2= RULE_ID ) ( 'in' '(' (lv_inParameters_5= ruleParameter ) ( ',' (lv_inParameters_7= ruleParameter ) )* ')' )? ( 'out' ( RULE_ID ) )? ';' ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:486:1: ( (lv_description_0= RULE_STRING )? 'method' (lv_name_2= RULE_ID ) ( 'in' '(' (lv_inParameters_5= ruleParameter ) ( ',' (lv_inParameters_7= ruleParameter ) )* ')' )? ( 'out' ( RULE_ID ) )? ';' )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:486:1: ( (lv_description_0= RULE_STRING )? 'method' (lv_name_2= RULE_ID ) ( 'in' '(' (lv_inParameters_5= ruleParameter ) ( ',' (lv_inParameters_7= ruleParameter ) )* ')' )? ( 'out' ( RULE_ID ) )? ';' )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:486:2: (lv_description_0= RULE_STRING )? 'method' (lv_name_2= RULE_ID ) ( 'in' '(' (lv_inParameters_5= ruleParameter ) ( ',' (lv_inParameters_7= ruleParameter ) )* ')' )? ( 'out' ( RULE_ID ) )? ';'
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:486:2: (lv_description_0= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:488:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomMethod968); 

                    		createLeafNode(grammarAccess.getCustomMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCustomMethodRule().getType().getClassifier());
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

            match(input,17,FOLLOW_17_in_ruleCustomMethod986); 

                    createLeafNode(grammarAccess.getCustomMethodAccess().getMethodKeyword_1(), null); 
                
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:510:1: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:512:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod1008); 

            		createLeafNode(grammarAccess.getCustomMethodAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:530:2: ( 'in' '(' (lv_inParameters_5= ruleParameter ) ( ',' (lv_inParameters_7= ruleParameter ) )* ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:530:3: 'in' '(' (lv_inParameters_5= ruleParameter ) ( ',' (lv_inParameters_7= ruleParameter ) )* ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleCustomMethod1026); 

                            createLeafNode(grammarAccess.getCustomMethodAccess().getInKeyword_3_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleCustomMethod1035); 

                            createLeafNode(grammarAccess.getCustomMethodAccess().getLeftParenthesisKeyword_3_1(), null); 
                        
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:538:1: (lv_inParameters_5= ruleParameter )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:541:6: lv_inParameters_5= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCustomMethodAccess().getInParametersParameterParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleCustomMethod1069);
                    lv_inParameters_5=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCustomMethodRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "inParameters", lv_inParameters_5, "Parameter", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:559:2: ( ',' (lv_inParameters_7= ruleParameter ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:559:3: ',' (lv_inParameters_7= ruleParameter )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleCustomMethod1083); 

                    	            createLeafNode(grammarAccess.getCustomMethodAccess().getCommaKeyword_3_3_0(), null); 
                    	        
                    	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:563:1: (lv_inParameters_7= ruleParameter )
                    	    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:566:6: lv_inParameters_7= ruleParameter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCustomMethodAccess().getInParametersParameterParserRuleCall_3_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleCustomMethod1117);
                    	    lv_inParameters_7=ruleParameter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCustomMethodRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "inParameters", lv_inParameters_7, "Parameter", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_ruleCustomMethod1132); 

                            createLeafNode(grammarAccess.getCustomMethodAccess().getRightParenthesisKeyword_3_4(), null); 
                        

                    }
                    break;

            }

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:588:3: ( 'out' ( RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:588:4: 'out' ( RULE_ID )
                    {
                    match(input,22,FOLLOW_22_in_ruleCustomMethod1144); 

                            createLeafNode(grammarAccess.getCustomMethodAccess().getOutKeyword_4_0(), null); 
                        
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:592:1: ( RULE_ID )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:595:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCustomMethodRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomMethod1166); 

                    		createLeafNode(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceCrossReference_4_1_0(), "output"); 
                    	

                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleCustomMethod1180); 

                    createLeafNode(grammarAccess.getCustomMethodAccess().getSemicolonKeyword_5(), null); 
                

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
    // $ANTLR end ruleCustomMethod


    // $ANTLR start entryRuleParameter
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:619:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:619:51: (iv_ruleParameter= ruleParameter EOF )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:620:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1213);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1223); 

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:627:1: ruleParameter returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:632:6: ( ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:633:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:633:1: ( (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:633:2: (lv_description_0= RULE_STRING )? ( RULE_ID ) (lv_name_2= RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:633:2: (lv_description_0= RULE_STRING )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:635:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter1270); 

                    		createLeafNode(grammarAccess.getParameterAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:653:3: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:656:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1301); 

            		createLeafNode(grammarAccess.getParameterAccess().getTypeDtoReferenceCrossReference_1_0(), "type"); 
            	

            }

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:669:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:671:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1326); 

            		createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleSpecialMethod
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:696:1: entryRuleSpecialMethod returns [EObject current=null] : iv_ruleSpecialMethod= ruleSpecialMethod EOF ;
    public final EObject entryRuleSpecialMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialMethod = null;


        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:696:55: (iv_ruleSpecialMethod= ruleSpecialMethod EOF )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:697:2: iv_ruleSpecialMethod= ruleSpecialMethod EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpecialMethodRule(), currentNode); 
            pushFollow(FOLLOW_ruleSpecialMethod_in_entryRuleSpecialMethod1367);
            iv_ruleSpecialMethod=ruleSpecialMethod();
            _fsp--;

             current =iv_ruleSpecialMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialMethod1377); 

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
    // $ANTLR end entryRuleSpecialMethod


    // $ANTLR start ruleSpecialMethod
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:704:1: ruleSpecialMethod returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleSpecialMethodType ) (lv_name_2= RULE_ID ) 'for' ( RULE_ID ) ';' ) ;
    public final EObject ruleSpecialMethod() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;
        Token lv_name_2=null;
        Enumerator lv_type_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:709:6: ( ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleSpecialMethodType ) (lv_name_2= RULE_ID ) 'for' ( RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:710:1: ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleSpecialMethodType ) (lv_name_2= RULE_ID ) 'for' ( RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:710:1: ( (lv_description_0= RULE_STRING )? (lv_type_1= ruleSpecialMethodType ) (lv_name_2= RULE_ID ) 'for' ( RULE_ID ) ';' )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:710:2: (lv_description_0= RULE_STRING )? (lv_type_1= ruleSpecialMethodType ) (lv_name_2= RULE_ID ) 'for' ( RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:710:2: (lv_description_0= RULE_STRING )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:712:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecialMethod1424); 

                    		createLeafNode(grammarAccess.getSpecialMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSpecialMethodRule().getType().getClassifier());
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

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:730:3: (lv_type_1= ruleSpecialMethodType )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:733:6: lv_type_1= ruleSpecialMethodType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSpecialMethodAccess().getTypeSpecialMethodTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSpecialMethodType_in_ruleSpecialMethod1467);
            lv_type_1=ruleSpecialMethodType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpecialMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1, "SpecialMethodType", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:751:2: (lv_name_2= RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:753:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialMethod1493); 

            		createLeafNode(grammarAccess.getSpecialMethodAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpecialMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleSpecialMethod1510); 

                    createLeafNode(grammarAccess.getSpecialMethodAccess().getForKeyword_3(), null); 
                
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:775:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:778:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSpecialMethodRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialMethod1532); 

            		createLeafNode(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceCrossReference_4_0(), "dto"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleSpecialMethod1544); 

                    createLeafNode(grammarAccess.getSpecialMethodAccess().getSemicolonKeyword_5(), null); 
                

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
    // $ANTLR end ruleSpecialMethod


    // $ANTLR start entryRuleCrudService
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:802:1: entryRuleCrudService returns [EObject current=null] : iv_ruleCrudService= ruleCrudService EOF ;
    public final EObject entryRuleCrudService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrudService = null;


        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:802:53: (iv_ruleCrudService= ruleCrudService EOF )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:803:2: iv_ruleCrudService= ruleCrudService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCrudServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleCrudService_in_entryRuleCrudService1577);
            iv_ruleCrudService=ruleCrudService();
            _fsp--;

             current =iv_ruleCrudService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrudService1587); 

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
    // $ANTLR end entryRuleCrudService


    // $ANTLR start ruleCrudService
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:810:1: ruleCrudService returns [EObject current=null] : ( (lv_description_0= RULE_STRING )? 'crud' ( RULE_ID ) ';' ) ;
    public final EObject ruleCrudService() throws RecognitionException {
        EObject current = null;

        Token lv_description_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:815:6: ( ( (lv_description_0= RULE_STRING )? 'crud' ( RULE_ID ) ';' ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:816:1: ( (lv_description_0= RULE_STRING )? 'crud' ( RULE_ID ) ';' )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:816:1: ( (lv_description_0= RULE_STRING )? 'crud' ( RULE_ID ) ';' )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:816:2: (lv_description_0= RULE_STRING )? 'crud' ( RULE_ID ) ';'
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:816:2: (lv_description_0= RULE_STRING )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:818:6: lv_description_0= RULE_STRING
                    {
                    lv_description_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCrudService1634); 

                    		createLeafNode(grammarAccess.getCrudServiceAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCrudServiceRule().getType().getClassifier());
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

            match(input,23,FOLLOW_23_in_ruleCrudService1652); 

                    createLeafNode(grammarAccess.getCrudServiceAccess().getCrudKeyword_1(), null); 
                
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:840:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:843:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCrudServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCrudService1674); 

            		createLeafNode(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceCrossReference_2_0(), "dto"); 
            	

            }

            match(input,12,FOLLOW_12_in_ruleCrudService1686); 

                    createLeafNode(grammarAccess.getCrudServiceAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleCrudService


    // $ANTLR start ruleSpecialMethodType
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:867:1: ruleSpecialMethodType returns [Enumerator current=null] : ( ( 'create' ) | ( 'read' ) | ( 'update' ) | ( 'delete' ) | ( 'listall' ) | ( 'find' ) ) ;
    public final Enumerator ruleSpecialMethodType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:871:6: ( ( ( 'create' ) | ( 'read' ) | ( 'update' ) | ( 'delete' ) | ( 'listall' ) | ( 'find' ) ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:872:1: ( ( 'create' ) | ( 'read' ) | ( 'update' ) | ( 'delete' ) | ( 'listall' ) | ( 'find' ) )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:872:1: ( ( 'create' ) | ( 'read' ) | ( 'update' ) | ( 'delete' ) | ( 'listall' ) | ( 'find' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            case 29:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("872:1: ( ( 'create' ) | ( 'read' ) | ( 'update' ) | ( 'delete' ) | ( 'listall' ) | ( 'find' ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:872:2: ( 'create' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:872:2: ( 'create' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:872:4: 'create'
                    {
                    match(input,24,FOLLOW_24_in_ruleSpecialMethodType1733); 

                            current = grammarAccess.getSpecialMethodTypeAccess().getCREATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSpecialMethodTypeAccess().getCREATEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:878:6: ( 'read' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:878:6: ( 'read' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:878:8: 'read'
                    {
                    match(input,25,FOLLOW_25_in_ruleSpecialMethodType1748); 

                            current = grammarAccess.getSpecialMethodTypeAccess().getREADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSpecialMethodTypeAccess().getREADEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:884:6: ( 'update' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:884:6: ( 'update' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:884:8: 'update'
                    {
                    match(input,26,FOLLOW_26_in_ruleSpecialMethodType1763); 

                            current = grammarAccess.getSpecialMethodTypeAccess().getUPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSpecialMethodTypeAccess().getUPDATEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:890:6: ( 'delete' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:890:6: ( 'delete' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:890:8: 'delete'
                    {
                    match(input,27,FOLLOW_27_in_ruleSpecialMethodType1778); 

                            current = grammarAccess.getSpecialMethodTypeAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSpecialMethodTypeAccess().getDELETEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:896:6: ( 'listall' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:896:6: ( 'listall' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:896:8: 'listall'
                    {
                    match(input,28,FOLLOW_28_in_ruleSpecialMethodType1793); 

                            current = grammarAccess.getSpecialMethodTypeAccess().getLISTALLEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSpecialMethodTypeAccess().getLISTALLEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:902:6: ( 'find' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:902:6: ( 'find' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:902:8: 'find'
                    {
                    match(input,29,FOLLOW_29_in_ruleSpecialMethodType1808); 

                            current = grammarAccess.getSpecialMethodTypeAccess().getFINDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getSpecialMethodTypeAccess().getFINDEnumLiteralDeclaration_5(), null); 
                        

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
    // $ANTLR end ruleSpecialMethodType


    // $ANTLR start ruleAssociationMethodType
    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:912:1: ruleAssociationMethodType returns [Enumerator current=null] : ( ( 'add' ) | ( 'remove' ) | ( 'get' ) ) ;
    public final Enumerator ruleAssociationMethodType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:916:6: ( ( ( 'add' ) | ( 'remove' ) | ( 'get' ) ) )
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:917:1: ( ( 'add' ) | ( 'remove' ) | ( 'get' ) )
            {
            // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:917:1: ( ( 'add' ) | ( 'remove' ) | ( 'get' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("917:1: ( ( 'add' ) | ( 'remove' ) | ( 'get' ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:917:2: ( 'add' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:917:2: ( 'add' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:917:4: 'add'
                    {
                    match(input,30,FOLLOW_30_in_ruleAssociationMethodType1851); 

                            current = grammarAccess.getAssociationMethodTypeAccess().getADDTOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssociationMethodTypeAccess().getADDTOEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:923:6: ( 'remove' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:923:6: ( 'remove' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:923:8: 'remove'
                    {
                    match(input,31,FOLLOW_31_in_ruleAssociationMethodType1866); 

                            current = grammarAccess.getAssociationMethodTypeAccess().getREMOVEFROMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssociationMethodTypeAccess().getREMOVEFROMEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:929:6: ( 'get' )
                    {
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:929:6: ( 'get' )
                    // ../org.mod4j.dsl.service.xtext/src-gen/org/mod4j/dsl/service/xtext/parser/antlr/internal/InternalService.g:929:8: 'get'
                    {
                    match(input,32,FOLLOW_32_in_ruleAssociationMethodType1881); 

                            current = grammarAccess.getAssociationMethodTypeAccess().getGETFROMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssociationMethodTypeAccess().getGETFROMEnumLiteralDeclaration_2(), null); 
                        

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
    // $ANTLR end ruleAssociationMethodType


 

    public static final BitSet FOLLOW_ruleServiceModel_in_entryRuleServiceModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceModel130 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleServiceModel148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceModel170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServiceModel187 = new BitSet(new long[]{0x000000003F82A012L});
    public static final BitSet FOLLOW_ruleDtoReference_in_ruleServiceModel221 = new BitSet(new long[]{0x000000003F82A012L});
    public static final BitSet FOLLOW_ruleCrudService_in_ruleServiceModel261 = new BitSet(new long[]{0x000000003F822012L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_ruleServiceModel305 = new BitSet(new long[]{0x000000003F822012L});
    public static final BitSet FOLLOW_ruleAssociationMethod_in_entryRuleAssociationMethod344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationMethod354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociationMethod401 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssociationMethod431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationMethod466 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssociationMethod478 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationMethod500 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleAssociationMethodType_in_ruleAssociationMethod542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationMethod568 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssociationMethod580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoReference_in_entryRuleDtoReference613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoReference623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDtoReference657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference679 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDtoReference696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDtoReference718 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDtoReference735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethod778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_ruleServiceMethod825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_ruleServiceMethod852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationMethod_in_ruleServiceMethod879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_entryRuleCustomMethod911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomMethod921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomMethod968 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCustomMethod986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod1008 = new BitSet(new long[]{0x0000000000441000L});
    public static final BitSet FOLLOW_18_in_ruleCustomMethod1026 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCustomMethod1035 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomMethod1069 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCustomMethod1083 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCustomMethod1117 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleCustomMethod1132 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22_in_ruleCustomMethod1144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomMethod1166 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCustomMethod1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter1270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_entryRuleSpecialMethod1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialMethod1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecialMethod1424 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_ruleSpecialMethodType_in_ruleSpecialMethod1467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialMethod1493 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSpecialMethod1510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialMethod1532 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpecialMethod1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_entryRuleCrudService1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrudService1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCrudService1634 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCrudService1652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCrudService1674 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCrudService1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSpecialMethodType1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSpecialMethodType1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSpecialMethodType1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSpecialMethodType1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSpecialMethodType1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSpecialMethodType1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAssociationMethodType1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAssociationMethodType1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAssociationMethodType1881 = new BitSet(new long[]{0x0000000000000002L});

}