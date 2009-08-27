package org.mod4j.dsl.businessdomain.xtext.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.mod4j.dsl.businessdomain.xtext.services.BusinessDomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBusinessDomainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'false'", "'many'", "'one'", "'domain'", "';'", "'from'", "'import'", "'association'", "'class'", "'['", "']'", "'inherits'", "'rules'", "'enumeration'", "'='", "'unique'", "','", "'minlength'", "'maxlength'", "'regexp'", "'min'", "'max'", "'<->'", "'ordered'", "'nullable'", "'derived'", "'writable'", "'boolean'", "'default'", "'true'", "'string'", "'datetime'", "'integer'", "'decimal'"
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
    public String getGrammarFileName() { return "../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g"; }


     
     	private BusinessDomainGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BusinessDomainGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleBusinessDomainModel
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:60:1: entryRuleBusinessDomainModel : ruleBusinessDomainModel EOF ;
    public final void entryRuleBusinessDomainModel() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:60:30: ( ruleBusinessDomainModel EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:61:1: ruleBusinessDomainModel EOF
            {
             before(grammarAccess.getBusinessDomainModelRule()); 
            pushFollow(FOLLOW_ruleBusinessDomainModel_in_entryRuleBusinessDomainModel60);
            ruleBusinessDomainModel();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessDomainModel67); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBusinessDomainModel


    // $ANTLR start ruleBusinessDomainModel
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:68:1: ruleBusinessDomainModel : ( ( rule__BusinessDomainModel__Group__0 ) ) ;
    public final void ruleBusinessDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:72:2: ( ( ( rule__BusinessDomainModel__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:73:1: ( ( rule__BusinessDomainModel__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:73:1: ( ( rule__BusinessDomainModel__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:74:1: ( rule__BusinessDomainModel__Group__0 )
            {
             before(grammarAccess.getBusinessDomainModelAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:75:1: ( rule__BusinessDomainModel__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:75:2: rule__BusinessDomainModel__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__0_in_ruleBusinessDomainModel94);
            rule__BusinessDomainModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessDomainModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessDomainModel


    // $ANTLR start entryRuleBusinessClassReference
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:87:1: entryRuleBusinessClassReference : ruleBusinessClassReference EOF ;
    public final void entryRuleBusinessClassReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:87:33: ( ruleBusinessClassReference EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:88:1: ruleBusinessClassReference EOF
            {
             before(grammarAccess.getBusinessClassReferenceRule()); 
            pushFollow(FOLLOW_ruleBusinessClassReference_in_entryRuleBusinessClassReference120);
            ruleBusinessClassReference();
            _fsp--;

             after(grammarAccess.getBusinessClassReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClassReference127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBusinessClassReference


    // $ANTLR start ruleBusinessClassReference
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:95:1: ruleBusinessClassReference : ( ( rule__BusinessClassReference__Group__0 ) ) ;
    public final void ruleBusinessClassReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:99:2: ( ( ( rule__BusinessClassReference__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:100:1: ( ( rule__BusinessClassReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:100:1: ( ( rule__BusinessClassReference__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:101:1: ( rule__BusinessClassReference__Group__0 )
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:102:1: ( rule__BusinessClassReference__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:102:2: rule__BusinessClassReference__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClassReference__Group__0_in_ruleBusinessClassReference154);
            rule__BusinessClassReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessClassReference


    // $ANTLR start entryRuleAssociation
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:114:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:114:22: ( ruleAssociation EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:115:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation180);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAssociation


    // $ANTLR start ruleAssociation
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:122:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:126:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:127:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:127:1: ( ( rule__Association__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:128:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:129:1: ( rule__Association__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:129:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation214);
            rule__Association__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRuleBusinessClass
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:141:1: entryRuleBusinessClass : ruleBusinessClass EOF ;
    public final void entryRuleBusinessClass() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:141:24: ( ruleBusinessClass EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:142:1: ruleBusinessClass EOF
            {
             before(grammarAccess.getBusinessClassRule()); 
            pushFollow(FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass240);
            ruleBusinessClass();
            _fsp--;

             after(grammarAccess.getBusinessClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClass247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBusinessClass


    // $ANTLR start ruleBusinessClass
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:149:1: ruleBusinessClass : ( ( rule__BusinessClass__Group__0 ) ) ;
    public final void ruleBusinessClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:153:2: ( ( ( rule__BusinessClass__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:154:1: ( ( rule__BusinessClass__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:154:1: ( ( rule__BusinessClass__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:155:1: ( rule__BusinessClass__Group__0 )
            {
             before(grammarAccess.getBusinessClassAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:156:1: ( rule__BusinessClass__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:156:2: rule__BusinessClass__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClass__Group__0_in_ruleBusinessClass274);
            rule__BusinessClass__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessClass


    // $ANTLR start entryRuleEnumeration
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:168:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:168:22: ( ruleEnumeration EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:169:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration300);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:176:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:180:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:181:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:181:1: ( ( rule__Enumeration__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:182:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:183:1: ( rule__Enumeration__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:183:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration334);
            rule__Enumeration__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:195:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:195:29: ( ruleEnumerationLiteral EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:196:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral360);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:203:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:207:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:208:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:208:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:209:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:210:1: ( rule__EnumerationLiteral__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:210:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral394);
            rule__EnumerationLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleAbstractBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:222:1: entryRuleAbstractBusinessRule : ruleAbstractBusinessRule EOF ;
    public final void entryRuleAbstractBusinessRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:222:31: ( ruleAbstractBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:223:1: ruleAbstractBusinessRule EOF
            {
             before(grammarAccess.getAbstractBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule420);
            ruleAbstractBusinessRule();
            _fsp--;

             after(grammarAccess.getAbstractBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBusinessRule427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAbstractBusinessRule


    // $ANTLR start ruleAbstractBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:230:1: ruleAbstractBusinessRule : ( ( rule__AbstractBusinessRule__Alternatives ) ) ;
    public final void ruleAbstractBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:234:2: ( ( ( rule__AbstractBusinessRule__Alternatives ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:235:1: ( ( rule__AbstractBusinessRule__Alternatives ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:235:1: ( ( rule__AbstractBusinessRule__Alternatives ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:236:1: ( rule__AbstractBusinessRule__Alternatives )
            {
             before(grammarAccess.getAbstractBusinessRuleAccess().getAlternatives()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:237:1: ( rule__AbstractBusinessRule__Alternatives )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:237:2: rule__AbstractBusinessRule__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractBusinessRule__Alternatives_in_ruleAbstractBusinessRule454);
            rule__AbstractBusinessRule__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAbstractBusinessRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAbstractBusinessRule


    // $ANTLR start entryRuleBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:249:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:249:23: ( ruleBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:250:1: ruleBusinessRule EOF
            {
             before(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule480);
            ruleBusinessRule();
            _fsp--;

             after(grammarAccess.getBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBusinessRule


    // $ANTLR start ruleBusinessRule
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:257:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:261:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:262:1: ( ( rule__BusinessRule__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:262:1: ( ( rule__BusinessRule__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:263:1: ( rule__BusinessRule__Group__0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:264:1: ( rule__BusinessRule__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:264:2: rule__BusinessRule__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule514);
            rule__BusinessRule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBusinessRule


    // $ANTLR start entryRuleUniqueRule
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:276:1: entryRuleUniqueRule : ruleUniqueRule EOF ;
    public final void entryRuleUniqueRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:276:21: ( ruleUniqueRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:277:1: ruleUniqueRule EOF
            {
             before(grammarAccess.getUniqueRuleRule()); 
            pushFollow(FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule540);
            ruleUniqueRule();
            _fsp--;

             after(grammarAccess.getUniqueRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueRule547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUniqueRule


    // $ANTLR start ruleUniqueRule
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:284:1: ruleUniqueRule : ( ( rule__UniqueRule__Group__0 ) ) ;
    public final void ruleUniqueRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:288:2: ( ( ( rule__UniqueRule__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:289:1: ( ( rule__UniqueRule__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:289:1: ( ( rule__UniqueRule__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:290:1: ( rule__UniqueRule__Group__0 )
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:291:1: ( rule__UniqueRule__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:291:2: rule__UniqueRule__Group__0
            {
            pushFollow(FOLLOW_rule__UniqueRule__Group__0_in_ruleUniqueRule574);
            rule__UniqueRule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUniqueRule


    // $ANTLR start entryRuleProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:303:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:303:19: ( ruleProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:304:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty600);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:311:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:315:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:316:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:316:1: ( ( rule__Property__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:317:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:318:1: ( rule__Property__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:318:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty634);
            rule__Property__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleBoolProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:330:1: entryRuleBoolProperty : ruleBoolProperty EOF ;
    public final void entryRuleBoolProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:330:23: ( ruleBoolProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:331:1: ruleBoolProperty EOF
            {
             before(grammarAccess.getBoolPropertyRule()); 
            pushFollow(FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty660);
            ruleBoolProperty();
            _fsp--;

             after(grammarAccess.getBoolPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolProperty667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBoolProperty


    // $ANTLR start ruleBoolProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:338:1: ruleBoolProperty : ( ( rule__BoolProperty__Group__0 ) ) ;
    public final void ruleBoolProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:342:2: ( ( ( rule__BoolProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:343:1: ( ( rule__BoolProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:343:1: ( ( rule__BoolProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:344:1: ( rule__BoolProperty__Group__0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:345:1: ( rule__BoolProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:345:2: rule__BoolProperty__Group__0
            {
            pushFollow(FOLLOW_rule__BoolProperty__Group__0_in_ruleBoolProperty694);
            rule__BoolProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBoolProperty


    // $ANTLR start entryRuleStringProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:357:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:357:25: ( ruleStringProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:358:1: ruleStringProperty EOF
            {
             before(grammarAccess.getStringPropertyRule()); 
            pushFollow(FOLLOW_ruleStringProperty_in_entryRuleStringProperty720);
            ruleStringProperty();
            _fsp--;

             after(grammarAccess.getStringPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringProperty727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStringProperty


    // $ANTLR start ruleStringProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:365:1: ruleStringProperty : ( ( rule__StringProperty__Group__0 ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:369:2: ( ( ( rule__StringProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:370:1: ( ( rule__StringProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:370:1: ( ( rule__StringProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:371:1: ( rule__StringProperty__Group__0 )
            {
             before(grammarAccess.getStringPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:372:1: ( rule__StringProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:372:2: rule__StringProperty__Group__0
            {
            pushFollow(FOLLOW_rule__StringProperty__Group__0_in_ruleStringProperty754);
            rule__StringProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringProperty


    // $ANTLR start entryRuleDateTimeProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:384:1: entryRuleDateTimeProperty : ruleDateTimeProperty EOF ;
    public final void entryRuleDateTimeProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:384:27: ( ruleDateTimeProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:385:1: ruleDateTimeProperty EOF
            {
             before(grammarAccess.getDateTimePropertyRule()); 
            pushFollow(FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty780);
            ruleDateTimeProperty();
            _fsp--;

             after(grammarAccess.getDateTimePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeProperty787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDateTimeProperty


    // $ANTLR start ruleDateTimeProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:392:1: ruleDateTimeProperty : ( ( rule__DateTimeProperty__Group__0 ) ) ;
    public final void ruleDateTimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:396:2: ( ( ( rule__DateTimeProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:397:1: ( ( rule__DateTimeProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:397:1: ( ( rule__DateTimeProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:398:1: ( rule__DateTimeProperty__Group__0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:399:1: ( rule__DateTimeProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:399:2: rule__DateTimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__Group__0_in_ruleDateTimeProperty814);
            rule__DateTimeProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDateTimeProperty


    // $ANTLR start entryRuleIntegerProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:411:1: entryRuleIntegerProperty : ruleIntegerProperty EOF ;
    public final void entryRuleIntegerProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:411:26: ( ruleIntegerProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:412:1: ruleIntegerProperty EOF
            {
             before(grammarAccess.getIntegerPropertyRule()); 
            pushFollow(FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty840);
            ruleIntegerProperty();
            _fsp--;

             after(grammarAccess.getIntegerPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerProperty847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIntegerProperty


    // $ANTLR start ruleIntegerProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:419:1: ruleIntegerProperty : ( ( rule__IntegerProperty__Group__0 ) ) ;
    public final void ruleIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:423:2: ( ( ( rule__IntegerProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:424:1: ( ( rule__IntegerProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:424:1: ( ( rule__IntegerProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:425:1: ( rule__IntegerProperty__Group__0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:426:1: ( rule__IntegerProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:426:2: rule__IntegerProperty__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerProperty__Group__0_in_ruleIntegerProperty874);
            rule__IntegerProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntegerProperty


    // $ANTLR start entryRuleDecimalProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:438:1: entryRuleDecimalProperty : ruleDecimalProperty EOF ;
    public final void entryRuleDecimalProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:438:26: ( ruleDecimalProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:439:1: ruleDecimalProperty EOF
            {
             before(grammarAccess.getDecimalPropertyRule()); 
            pushFollow(FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty900);
            ruleDecimalProperty();
            _fsp--;

             after(grammarAccess.getDecimalPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalProperty907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDecimalProperty


    // $ANTLR start ruleDecimalProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:446:1: ruleDecimalProperty : ( ( rule__DecimalProperty__Group__0 ) ) ;
    public final void ruleDecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:450:2: ( ( ( rule__DecimalProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:451:1: ( ( rule__DecimalProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:451:1: ( ( rule__DecimalProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:452:1: ( rule__DecimalProperty__Group__0 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:453:1: ( rule__DecimalProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:453:2: rule__DecimalProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalProperty__Group__0_in_ruleDecimalProperty934);
            rule__DecimalProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDecimalPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDecimalProperty


    // $ANTLR start entryRuleEnumerationProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:465:1: entryRuleEnumerationProperty : ruleEnumerationProperty EOF ;
    public final void entryRuleEnumerationProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:465:30: ( ruleEnumerationProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:466:1: ruleEnumerationProperty EOF
            {
             before(grammarAccess.getEnumerationPropertyRule()); 
            pushFollow(FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty960);
            ruleEnumerationProperty();
            _fsp--;

             after(grammarAccess.getEnumerationPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationProperty967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumerationProperty


    // $ANTLR start ruleEnumerationProperty
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:473:1: ruleEnumerationProperty : ( ( rule__EnumerationProperty__Group__0 ) ) ;
    public final void ruleEnumerationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:477:2: ( ( ( rule__EnumerationProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:478:1: ( ( rule__EnumerationProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:478:1: ( ( rule__EnumerationProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:479:1: ( rule__EnumerationProperty__Group__0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:480:1: ( rule__EnumerationProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:480:2: rule__EnumerationProperty__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__Group__0_in_ruleEnumerationProperty994);
            rule__EnumerationProperty__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumerationProperty


    // $ANTLR start ruleMultiplicity
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:493:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:497:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:498:1: ( ( rule__Multiplicity__Alternatives ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:498:1: ( ( rule__Multiplicity__Alternatives ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:499:1: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:500:1: ( rule__Multiplicity__Alternatives )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:500:2: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicity__Alternatives_in_ruleMultiplicity1031);
            rule__Multiplicity__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultiplicity


    // $ANTLR start rule__BusinessDomainModel__Alternatives_5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:515:1: rule__BusinessDomainModel__Alternatives_5 : ( ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) ) );
    public final void rule__BusinessDomainModel__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:519:1: ( ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt1=3;
                    }
                    break;
                case 25:
                    {
                    alt1=2;
                    }
                    break;
                case 20:
                    {
                    alt1=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("515:1: rule__BusinessDomainModel__Alternatives_5 : ( ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) ) );", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 20:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("515:1: rule__BusinessDomainModel__Alternatives_5 : ( ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:520:1: ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:520:1: ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:1: ( rule__BusinessDomainModel__TypesAssignment_5_0 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_5_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:522:1: ( rule__BusinessDomainModel__TypesAssignment_5_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:522:2: rule__BusinessDomainModel__TypesAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__TypesAssignment_5_0_in_rule__BusinessDomainModel__Alternatives_51070);
                    rule__BusinessDomainModel__TypesAssignment_5_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:526:6: ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:526:6: ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:1: ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getEnumerationsAssignment_5_1()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:528:1: ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:528:2: rule__BusinessDomainModel__EnumerationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__EnumerationsAssignment_5_1_in_rule__BusinessDomainModel__Alternatives_51088);
                    rule__BusinessDomainModel__EnumerationsAssignment_5_1();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getEnumerationsAssignment_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:532:6: ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:532:6: ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:533:1: ( rule__BusinessDomainModel__AssociationsAssignment_5_2 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssignment_5_2()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:534:1: ( rule__BusinessDomainModel__AssociationsAssignment_5_2 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:534:2: rule__BusinessDomainModel__AssociationsAssignment_5_2
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__AssociationsAssignment_5_2_in_rule__BusinessDomainModel__Alternatives_51106);
                    rule__BusinessDomainModel__AssociationsAssignment_5_2();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssignment_5_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Alternatives_5


    // $ANTLR start rule__Association__Alternatives_5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:543:1: rule__Association__Alternatives_5 : ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) );
    public final void rule__Association__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:547:1: ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("543:1: rule__Association__Alternatives_5 : ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:548:1: ( ( rule__Association__BidirectionalAssignment_5_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:548:1: ( ( rule__Association__BidirectionalAssignment_5_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:549:1: ( rule__Association__BidirectionalAssignment_5_0 )
                    {
                     before(grammarAccess.getAssociationAccess().getBidirectionalAssignment_5_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:550:1: ( rule__Association__BidirectionalAssignment_5_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:550:2: rule__Association__BidirectionalAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Association__BidirectionalAssignment_5_0_in_rule__Association__Alternatives_51139);
                    rule__Association__BidirectionalAssignment_5_0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getBidirectionalAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:554:6: ( '->' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:554:6: ( '->' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:555:1: '->'
                    {
                     before(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_5_1()); 
                    match(input,11,FOLLOW_11_in_rule__Association__Alternatives_51158); 
                     after(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Alternatives_5


    // $ANTLR start rule__AbstractBusinessRule__Alternatives
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:567:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );
    public final void rule__AbstractBusinessRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:571:1: ( ( ruleBusinessRule ) | ( ruleUniqueRule ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==27) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("567:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("567:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:572:1: ( ruleBusinessRule )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:572:1: ( ruleBusinessRule )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:573:1: ruleBusinessRule
                    {
                     before(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBusinessRule_in_rule__AbstractBusinessRule__Alternatives1192);
                    ruleBusinessRule();
                    _fsp--;

                     after(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:578:6: ( ruleUniqueRule )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:578:6: ( ruleUniqueRule )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:579:1: ruleUniqueRule
                    {
                     before(grammarAccess.getAbstractBusinessRuleAccess().getUniqueRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUniqueRule_in_rule__AbstractBusinessRule__Alternatives1209);
                    ruleUniqueRule();
                    _fsp--;

                     after(grammarAccess.getAbstractBusinessRuleAccess().getUniqueRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractBusinessRule__Alternatives


    // $ANTLR start rule__Property__Alternatives_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:589:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );
    public final void rule__Property__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:593:1: ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt4=6;
                    }
                    break;
                case 45:
                    {
                    alt4=5;
                    }
                    break;
                case 39:
                    {
                    alt4=1;
                    }
                    break;
                case 42:
                    {
                    alt4=2;
                    }
                    break;
                case 44:
                    {
                    alt4=4;
                    }
                    break;
                case 43:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("589:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            case 44:
                {
                alt4=4;
                }
                break;
            case 45:
                {
                alt4=5;
                }
                break;
            case RULE_ID:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("589:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:594:1: ( ruleBoolProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:594:1: ( ruleBoolProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:595:1: ruleBoolProperty
                    {
                     before(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleBoolProperty_in_rule__Property__Alternatives_01241);
                    ruleBoolProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:600:6: ( ruleStringProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:600:6: ( ruleStringProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:601:1: ruleStringProperty
                    {
                     before(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleStringProperty_in_rule__Property__Alternatives_01258);
                    ruleStringProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:606:6: ( ruleDateTimeProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:606:6: ( ruleDateTimeProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:607:1: ruleDateTimeProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleDateTimeProperty_in_rule__Property__Alternatives_01275);
                    ruleDateTimeProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:612:6: ( ruleIntegerProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:612:6: ( ruleIntegerProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:613:1: ruleIntegerProperty
                    {
                     before(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleIntegerProperty_in_rule__Property__Alternatives_01292);
                    ruleIntegerProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:618:6: ( ruleDecimalProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:618:6: ( ruleDecimalProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:619:1: ruleDecimalProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleDecimalProperty_in_rule__Property__Alternatives_01309);
                    ruleDecimalProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:624:6: ( ruleEnumerationProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:624:6: ( ruleEnumerationProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:625:1: ruleEnumerationProperty
                    {
                     before(grammarAccess.getPropertyAccess().getEnumerationPropertyParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleEnumerationProperty_in_rule__Property__Alternatives_01326);
                    ruleEnumerationProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getEnumerationPropertyParserRuleCall_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Alternatives_0


    // $ANTLR start rule__BoolProperty__Alternatives_3_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:635:1: rule__BoolProperty__Alternatives_3_1 : ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) );
    public final void rule__BoolProperty__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:639:1: ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("635:1: rule__BoolProperty__Alternatives_3_1 : ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:640:1: ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:640:1: ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:641:1: ( rule__BoolProperty__DefaultValueAssignment_3_1_0 )
                    {
                     before(grammarAccess.getBoolPropertyAccess().getDefaultValueAssignment_3_1_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:642:1: ( rule__BoolProperty__DefaultValueAssignment_3_1_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:642:2: rule__BoolProperty__DefaultValueAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__DefaultValueAssignment_3_1_0_in_rule__BoolProperty__Alternatives_3_11358);
                    rule__BoolProperty__DefaultValueAssignment_3_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBoolPropertyAccess().getDefaultValueAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:646:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:646:6: ( 'false' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:647:1: 'false'
                    {
                     before(grammarAccess.getBoolPropertyAccess().getFalseKeyword_3_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__BoolProperty__Alternatives_3_11377); 
                     after(grammarAccess.getBoolPropertyAccess().getFalseKeyword_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Alternatives_3_1


    // $ANTLR start rule__Multiplicity__Alternatives
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:659:1: rule__Multiplicity__Alternatives : ( ( ( 'many' ) ) | ( ( 'one' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:663:1: ( ( ( 'many' ) ) | ( ( 'one' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("659:1: rule__Multiplicity__Alternatives : ( ( ( 'many' ) ) | ( ( 'one' ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:664:1: ( ( 'many' ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:664:1: ( ( 'many' ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:665:1: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:666:1: ( 'many' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:666:3: 'many'
                    {
                    match(input,13,FOLLOW_13_in_rule__Multiplicity__Alternatives1412); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:671:6: ( ( 'one' ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:671:6: ( ( 'one' ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:672:1: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:673:1: ( 'one' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:673:3: 'one'
                    {
                    match(input,14,FOLLOW_14_in_rule__Multiplicity__Alternatives1433); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplicity__Alternatives


    // $ANTLR start rule__BusinessDomainModel__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:687:1: rule__BusinessDomainModel__Group__0 : ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1 ;
    public final void rule__BusinessDomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:691:1: ( ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:692:1: ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:692:1: ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:693:1: ( rule__BusinessDomainModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:694:1: ( rule__BusinessDomainModel__DescriptionAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:694:2: rule__BusinessDomainModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__DescriptionAssignment_0_in_rule__BusinessDomainModel__Group__01472);
                    rule__BusinessDomainModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessDomainModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__1_in_rule__BusinessDomainModel__Group__01482);
            rule__BusinessDomainModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__0


    // $ANTLR start rule__BusinessDomainModel__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:705:1: rule__BusinessDomainModel__Group__1 : ( 'domain' ) rule__BusinessDomainModel__Group__2 ;
    public final void rule__BusinessDomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:709:1: ( ( 'domain' ) rule__BusinessDomainModel__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:710:1: ( 'domain' ) rule__BusinessDomainModel__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:710:1: ( 'domain' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:711:1: 'domain'
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDomainKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__BusinessDomainModel__Group__11511); 
             after(grammarAccess.getBusinessDomainModelAccess().getDomainKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__2_in_rule__BusinessDomainModel__Group__11521);
            rule__BusinessDomainModel__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__1


    // $ANTLR start rule__BusinessDomainModel__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:725:1: rule__BusinessDomainModel__Group__2 : ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3 ;
    public final void rule__BusinessDomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:729:1: ( ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:730:1: ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:730:1: ( ( rule__BusinessDomainModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:731:1: ( rule__BusinessDomainModel__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessDomainModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:732:1: ( rule__BusinessDomainModel__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:732:2: rule__BusinessDomainModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessDomainModel__NameAssignment_2_in_rule__BusinessDomainModel__Group__21549);
            rule__BusinessDomainModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessDomainModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__3_in_rule__BusinessDomainModel__Group__21558);
            rule__BusinessDomainModel__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__2


    // $ANTLR start rule__BusinessDomainModel__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:743:1: rule__BusinessDomainModel__Group__3 : ( ';' ) rule__BusinessDomainModel__Group__4 ;
    public final void rule__BusinessDomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:747:1: ( ( ';' ) rule__BusinessDomainModel__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:748:1: ( ';' ) rule__BusinessDomainModel__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:748:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:749:1: ';'
            {
             before(grammarAccess.getBusinessDomainModelAccess().getSemicolonKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BusinessDomainModel__Group__31587); 
             after(grammarAccess.getBusinessDomainModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__4_in_rule__BusinessDomainModel__Group__31597);
            rule__BusinessDomainModel__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__3


    // $ANTLR start rule__BusinessDomainModel__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:763:1: rule__BusinessDomainModel__Group__4 : ( ( rule__BusinessDomainModel__TypesAssignment_4 )* ) rule__BusinessDomainModel__Group__5 ;
    public final void rule__BusinessDomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:767:1: ( ( ( rule__BusinessDomainModel__TypesAssignment_4 )* ) rule__BusinessDomainModel__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:768:1: ( ( rule__BusinessDomainModel__TypesAssignment_4 )* ) rule__BusinessDomainModel__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:768:1: ( ( rule__BusinessDomainModel__TypesAssignment_4 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:769:1: ( rule__BusinessDomainModel__TypesAssignment_4 )*
            {
             before(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:770:1: ( rule__BusinessDomainModel__TypesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:770:2: rule__BusinessDomainModel__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__BusinessDomainModel__TypesAssignment_4_in_rule__BusinessDomainModel__Group__41625);
            	    rule__BusinessDomainModel__TypesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__5_in_rule__BusinessDomainModel__Group__41635);
            rule__BusinessDomainModel__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__4


    // $ANTLR start rule__BusinessDomainModel__Group__5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:781:1: rule__BusinessDomainModel__Group__5 : ( ( rule__BusinessDomainModel__Alternatives_5 )* ) ;
    public final void rule__BusinessDomainModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:785:1: ( ( ( rule__BusinessDomainModel__Alternatives_5 )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:786:1: ( ( rule__BusinessDomainModel__Alternatives_5 )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:786:1: ( ( rule__BusinessDomainModel__Alternatives_5 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:787:1: ( rule__BusinessDomainModel__Alternatives_5 )*
            {
             before(grammarAccess.getBusinessDomainModelAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:788:1: ( rule__BusinessDomainModel__Alternatives_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||(LA9_0>=19 && LA9_0<=20)||LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:788:2: rule__BusinessDomainModel__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__BusinessDomainModel__Alternatives_5_in_rule__BusinessDomainModel__Group__51663);
            	    rule__BusinessDomainModel__Alternatives_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBusinessDomainModelAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__Group__5


    // $ANTLR start rule__BusinessClassReference__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:810:1: rule__BusinessClassReference__Group__0 : ( 'from' ) rule__BusinessClassReference__Group__1 ;
    public final void rule__BusinessClassReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:814:1: ( ( 'from' ) rule__BusinessClassReference__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:815:1: ( 'from' ) rule__BusinessClassReference__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:815:1: ( 'from' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:816:1: 'from'
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getFromKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__BusinessClassReference__Group__01711); 
             after(grammarAccess.getBusinessClassReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassReference__Group__1_in_rule__BusinessClassReference__Group__01721);
            rule__BusinessClassReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassReference__Group__0


    // $ANTLR start rule__BusinessClassReference__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:830:1: rule__BusinessClassReference__Group__1 : ( ( rule__BusinessClassReference__ReferredModelAssignment_1 ) ) rule__BusinessClassReference__Group__2 ;
    public final void rule__BusinessClassReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:834:1: ( ( ( rule__BusinessClassReference__ReferredModelAssignment_1 ) ) rule__BusinessClassReference__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:835:1: ( ( rule__BusinessClassReference__ReferredModelAssignment_1 ) ) rule__BusinessClassReference__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:835:1: ( ( rule__BusinessClassReference__ReferredModelAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:836:1: ( rule__BusinessClassReference__ReferredModelAssignment_1 )
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getReferredModelAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:837:1: ( rule__BusinessClassReference__ReferredModelAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:837:2: rule__BusinessClassReference__ReferredModelAssignment_1
            {
            pushFollow(FOLLOW_rule__BusinessClassReference__ReferredModelAssignment_1_in_rule__BusinessClassReference__Group__11749);
            rule__BusinessClassReference__ReferredModelAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassReferenceAccess().getReferredModelAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassReference__Group__2_in_rule__BusinessClassReference__Group__11758);
            rule__BusinessClassReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassReference__Group__1


    // $ANTLR start rule__BusinessClassReference__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:848:1: rule__BusinessClassReference__Group__2 : ( 'import' ) rule__BusinessClassReference__Group__3 ;
    public final void rule__BusinessClassReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:852:1: ( ( 'import' ) rule__BusinessClassReference__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:853:1: ( 'import' ) rule__BusinessClassReference__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:853:1: ( 'import' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:854:1: 'import'
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getImportKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__BusinessClassReference__Group__21787); 
             after(grammarAccess.getBusinessClassReferenceAccess().getImportKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassReference__Group__3_in_rule__BusinessClassReference__Group__21797);
            rule__BusinessClassReference__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassReference__Group__2


    // $ANTLR start rule__BusinessClassReference__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:868:1: rule__BusinessClassReference__Group__3 : ( ( rule__BusinessClassReference__NameAssignment_3 ) ) rule__BusinessClassReference__Group__4 ;
    public final void rule__BusinessClassReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:872:1: ( ( ( rule__BusinessClassReference__NameAssignment_3 ) ) rule__BusinessClassReference__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:873:1: ( ( rule__BusinessClassReference__NameAssignment_3 ) ) rule__BusinessClassReference__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:873:1: ( ( rule__BusinessClassReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:874:1: ( rule__BusinessClassReference__NameAssignment_3 )
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:875:1: ( rule__BusinessClassReference__NameAssignment_3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:875:2: rule__BusinessClassReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__BusinessClassReference__NameAssignment_3_in_rule__BusinessClassReference__Group__31825);
            rule__BusinessClassReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClassReference__Group__4_in_rule__BusinessClassReference__Group__31834);
            rule__BusinessClassReference__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassReference__Group__3


    // $ANTLR start rule__BusinessClassReference__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:886:1: rule__BusinessClassReference__Group__4 : ( ';' ) ;
    public final void rule__BusinessClassReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:890:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:891:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:891:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:892:1: ';'
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__BusinessClassReference__Group__41863); 
             after(grammarAccess.getBusinessClassReferenceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassReference__Group__4


    // $ANTLR start rule__Association__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:915:1: rule__Association__Group__0 : ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:919:1: ( ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:920:1: ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:920:1: ( ( rule__Association__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:921:1: ( rule__Association__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getAssociationAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:922:1: ( rule__Association__DescriptionAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:922:2: rule__Association__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Association__DescriptionAssignment_0_in_rule__Association__Group__01908);
                    rule__Association__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01918);
            rule__Association__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__0


    // $ANTLR start rule__Association__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:933:1: rule__Association__Group__1 : ( 'association' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:937:1: ( ( 'association' ) rule__Association__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:938:1: ( 'association' ) rule__Association__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:938:1: ( 'association' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:939:1: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Association__Group__11947); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__11957);
            rule__Association__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__1


    // $ANTLR start rule__Association__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:953:1: rule__Association__Group__2 : ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:957:1: ( ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:958:1: ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:958:1: ( ( rule__Association__SourceAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:959:1: ( rule__Association__SourceAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:960:1: ( rule__Association__SourceAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:960:2: rule__Association__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__SourceAssignment_2_in_rule__Association__Group__21985);
            rule__Association__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__21994);
            rule__Association__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__2


    // $ANTLR start rule__Association__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:971:1: rule__Association__Group__3 : ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:975:1: ( ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:976:1: ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:976:1: ( ( rule__Association__SourceRoleNameAssignment_3 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:977:1: ( rule__Association__SourceRoleNameAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getSourceRoleNameAssignment_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:978:1: ( rule__Association__SourceRoleNameAssignment_3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:978:2: rule__Association__SourceRoleNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__SourceRoleNameAssignment_3_in_rule__Association__Group__32022);
            rule__Association__SourceRoleNameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceRoleNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__32031);
            rule__Association__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__3


    // $ANTLR start rule__Association__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:989:1: rule__Association__Group__4 : ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:993:1: ( ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:994:1: ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:994:1: ( ( rule__Association__SourceMultiplicityAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:995:1: ( rule__Association__SourceMultiplicityAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:996:1: ( rule__Association__SourceMultiplicityAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:996:2: rule__Association__SourceMultiplicityAssignment_4
            {
            pushFollow(FOLLOW_rule__Association__SourceMultiplicityAssignment_4_in_rule__Association__Group__42059);
            rule__Association__SourceMultiplicityAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__5_in_rule__Association__Group__42068);
            rule__Association__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__4


    // $ANTLR start rule__Association__Group__5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1007:1: rule__Association__Group__5 : ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1011:1: ( ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1012:1: ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1012:1: ( ( rule__Association__Alternatives_5 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1013:1: ( rule__Association__Alternatives_5 )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1014:1: ( rule__Association__Alternatives_5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1014:2: rule__Association__Alternatives_5
            {
            pushFollow(FOLLOW_rule__Association__Alternatives_5_in_rule__Association__Group__52096);
            rule__Association__Alternatives_5();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAlternatives_5()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__6_in_rule__Association__Group__52105);
            rule__Association__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__5


    // $ANTLR start rule__Association__Group__6
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1025:1: rule__Association__Group__6 : ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1029:1: ( ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1030:1: ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1030:1: ( ( rule__Association__TargetMultiplicityAssignment_6 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1031:1: ( rule__Association__TargetMultiplicityAssignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1032:1: ( rule__Association__TargetMultiplicityAssignment_6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1032:2: rule__Association__TargetMultiplicityAssignment_6
            {
            pushFollow(FOLLOW_rule__Association__TargetMultiplicityAssignment_6_in_rule__Association__Group__62133);
            rule__Association__TargetMultiplicityAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__7_in_rule__Association__Group__62142);
            rule__Association__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__6


    // $ANTLR start rule__Association__Group__7
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1043:1: rule__Association__Group__7 : ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1047:1: ( ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1048:1: ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1048:1: ( ( rule__Association__TargetAssignment_7 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1049:1: ( rule__Association__TargetAssignment_7 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_7()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1050:1: ( rule__Association__TargetAssignment_7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1050:2: rule__Association__TargetAssignment_7
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_7_in_rule__Association__Group__72170);
            rule__Association__TargetAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__8_in_rule__Association__Group__72179);
            rule__Association__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__7


    // $ANTLR start rule__Association__Group__8
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1061:1: rule__Association__Group__8 : ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1065:1: ( ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1066:1: ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1066:1: ( ( rule__Association__TargetRoleNameAssignment_8 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1067:1: ( rule__Association__TargetRoleNameAssignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_8()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1068:1: ( rule__Association__TargetRoleNameAssignment_8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1068:2: rule__Association__TargetRoleNameAssignment_8
            {
            pushFollow(FOLLOW_rule__Association__TargetRoleNameAssignment_8_in_rule__Association__Group__82207);
            rule__Association__TargetRoleNameAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__9_in_rule__Association__Group__82216);
            rule__Association__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__8


    // $ANTLR start rule__Association__Group__9
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1079:1: rule__Association__Group__9 : ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1083:1: ( ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1084:1: ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1084:1: ( ( rule__Association__OrderedAssignment_9 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1085:1: ( rule__Association__OrderedAssignment_9 )?
            {
             before(grammarAccess.getAssociationAccess().getOrderedAssignment_9()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1086:1: ( rule__Association__OrderedAssignment_9 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1086:2: rule__Association__OrderedAssignment_9
                    {
                    pushFollow(FOLLOW_rule__Association__OrderedAssignment_9_in_rule__Association__Group__92244);
                    rule__Association__OrderedAssignment_9();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getOrderedAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__10_in_rule__Association__Group__92254);
            rule__Association__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__9


    // $ANTLR start rule__Association__Group__10
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1097:1: rule__Association__Group__10 : ( ';' ) ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1101:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1102:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1102:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1103:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_10()); 
            match(input,16,FOLLOW_16_in_rule__Association__Group__102283); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__10


    // $ANTLR start rule__BusinessClass__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1138:1: rule__BusinessClass__Group__0 : ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 ;
    public final void rule__BusinessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1142:1: ( ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1143:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1143:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1144:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1145:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1145:2: rule__BusinessClass__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__DescriptionAssignment_0_in_rule__BusinessClass__Group__02340);
                    rule__BusinessClass__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__1_in_rule__BusinessClass__Group__02350);
            rule__BusinessClass__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__0


    // $ANTLR start rule__BusinessClass__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1156:1: rule__BusinessClass__Group__1 : ( 'class' ) rule__BusinessClass__Group__2 ;
    public final void rule__BusinessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1160:1: ( ( 'class' ) rule__BusinessClass__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1161:1: ( 'class' ) rule__BusinessClass__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1161:1: ( 'class' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1162:1: 'class'
            {
             before(grammarAccess.getBusinessClassAccess().getClassKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__BusinessClass__Group__12379); 
             after(grammarAccess.getBusinessClassAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__2_in_rule__BusinessClass__Group__12389);
            rule__BusinessClass__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__1


    // $ANTLR start rule__BusinessClass__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1176:1: rule__BusinessClass__Group__2 : ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 ;
    public final void rule__BusinessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1180:1: ( ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1181:1: ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1181:1: ( ( rule__BusinessClass__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1182:1: ( rule__BusinessClass__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1183:1: ( rule__BusinessClass__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1183:2: rule__BusinessClass__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClass__NameAssignment_2_in_rule__BusinessClass__Group__22417);
            rule__BusinessClass__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__3_in_rule__BusinessClass__Group__22426);
            rule__BusinessClass__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__2


    // $ANTLR start rule__BusinessClass__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1194:1: rule__BusinessClass__Group__3 : ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 ;
    public final void rule__BusinessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1198:1: ( ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1199:1: ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1199:1: ( ( rule__BusinessClass__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1200:1: ( rule__BusinessClass__Group_3__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1201:1: ( rule__BusinessClass__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1201:2: rule__BusinessClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_3__0_in_rule__BusinessClass__Group__32454);
                    rule__BusinessClass__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__4_in_rule__BusinessClass__Group__32464);
            rule__BusinessClass__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__3


    // $ANTLR start rule__BusinessClass__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1212:1: rule__BusinessClass__Group__4 : ( '[' ) rule__BusinessClass__Group__5 ;
    public final void rule__BusinessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1216:1: ( ( '[' ) rule__BusinessClass__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1217:1: ( '[' ) rule__BusinessClass__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1217:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1218:1: '['
            {
             before(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__BusinessClass__Group__42493); 
             after(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__5_in_rule__BusinessClass__Group__42503);
            rule__BusinessClass__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__4


    // $ANTLR start rule__BusinessClass__Group__5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1232:1: rule__BusinessClass__Group__5 : ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6 ;
    public final void rule__BusinessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1236:1: ( ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1237:1: ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1237:1: ( ( rule__BusinessClass__PropertiesAssignment_5 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1238:1: ( rule__BusinessClass__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1239:1: ( rule__BusinessClass__PropertiesAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==39||(LA14_0>=42 && LA14_0<=45)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1239:2: rule__BusinessClass__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClass__PropertiesAssignment_5_in_rule__BusinessClass__Group__52531);
            	    rule__BusinessClass__PropertiesAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__6_in_rule__BusinessClass__Group__52541);
            rule__BusinessClass__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__5


    // $ANTLR start rule__BusinessClass__Group__6
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1250:1: rule__BusinessClass__Group__6 : ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7 ;
    public final void rule__BusinessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1254:1: ( ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1255:1: ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1255:1: ( ( rule__BusinessClass__Group_6__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1256:1: ( rule__BusinessClass__Group_6__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1257:1: ( rule__BusinessClass__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1257:2: rule__BusinessClass__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_6__0_in_rule__BusinessClass__Group__62569);
                    rule__BusinessClass__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_6()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__7_in_rule__BusinessClass__Group__62579);
            rule__BusinessClass__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__6


    // $ANTLR start rule__BusinessClass__Group__7
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1268:1: rule__BusinessClass__Group__7 : ( ']' ) ;
    public final void rule__BusinessClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1272:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1273:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1273:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1274:1: ']'
            {
             before(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__BusinessClass__Group__72608); 
             after(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group__7


    // $ANTLR start rule__BusinessClass__Group_3__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1303:1: rule__BusinessClass__Group_3__0 : ( 'inherits' ) rule__BusinessClass__Group_3__1 ;
    public final void rule__BusinessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1307:1: ( ( 'inherits' ) rule__BusinessClass__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1308:1: ( 'inherits' ) rule__BusinessClass__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1308:1: ( 'inherits' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1309:1: 'inherits'
            {
             before(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__BusinessClass__Group_3__02660); 
             after(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_3__1_in_rule__BusinessClass__Group_3__02670);
            rule__BusinessClass__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_3__0


    // $ANTLR start rule__BusinessClass__Group_3__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1323:1: rule__BusinessClass__Group_3__1 : ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) ;
    public final void rule__BusinessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1327:1: ( ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1328:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1328:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1329:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1330:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1330:2: rule__BusinessClass__SuperclassAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BusinessClass__SuperclassAssignment_3_1_in_rule__BusinessClass__Group_3__12698);
            rule__BusinessClass__SuperclassAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getSuperclassAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_3__1


    // $ANTLR start rule__BusinessClass__Group_6__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1344:1: rule__BusinessClass__Group_6__0 : ( 'rules' ) rule__BusinessClass__Group_6__1 ;
    public final void rule__BusinessClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1348:1: ( ( 'rules' ) rule__BusinessClass__Group_6__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1349:1: ( 'rules' ) rule__BusinessClass__Group_6__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1349:1: ( 'rules' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1350:1: 'rules'
            {
             before(grammarAccess.getBusinessClassAccess().getRulesKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__BusinessClass__Group_6__02737); 
             after(grammarAccess.getBusinessClassAccess().getRulesKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_6__1_in_rule__BusinessClass__Group_6__02747);
            rule__BusinessClass__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_6__0


    // $ANTLR start rule__BusinessClass__Group_6__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1364:1: rule__BusinessClass__Group_6__1 : ( '[' ) rule__BusinessClass__Group_6__2 ;
    public final void rule__BusinessClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1368:1: ( ( '[' ) rule__BusinessClass__Group_6__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1369:1: ( '[' ) rule__BusinessClass__Group_6__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1369:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1370:1: '['
            {
             before(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,21,FOLLOW_21_in_rule__BusinessClass__Group_6__12776); 
             after(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_6_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_6__2_in_rule__BusinessClass__Group_6__12786);
            rule__BusinessClass__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_6__1


    // $ANTLR start rule__BusinessClass__Group_6__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1384:1: rule__BusinessClass__Group_6__2 : ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3 ;
    public final void rule__BusinessClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1388:1: ( ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1389:1: ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1389:1: ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1390:1: ( rule__BusinessClass__BusinessRulesAssignment_6_2 )*
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_6_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1391:1: ( rule__BusinessClass__BusinessRulesAssignment_6_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1391:2: rule__BusinessClass__BusinessRulesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClass__BusinessRulesAssignment_6_2_in_rule__BusinessClass__Group_6__22814);
            	    rule__BusinessClass__BusinessRulesAssignment_6_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_6_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_6__3_in_rule__BusinessClass__Group_6__22824);
            rule__BusinessClass__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_6__2


    // $ANTLR start rule__BusinessClass__Group_6__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1402:1: rule__BusinessClass__Group_6__3 : ( ']' ) ;
    public final void rule__BusinessClass__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1406:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1407:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1407:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1408:1: ']'
            {
             before(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_6_3()); 
            match(input,22,FOLLOW_22_in_rule__BusinessClass__Group_6__32853); 
             after(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__Group_6__3


    // $ANTLR start rule__Enumeration__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1429:1: rule__Enumeration__Group__0 : ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1433:1: ( ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1434:1: ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1434:1: ( ( rule__Enumeration__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1435:1: ( rule__Enumeration__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1436:1: ( rule__Enumeration__DescriptionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1436:2: rule__Enumeration__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Enumeration__DescriptionAssignment_0_in_rule__Enumeration__Group__02896);
                    rule__Enumeration__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02906);
            rule__Enumeration__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__0


    // $ANTLR start rule__Enumeration__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1447:1: rule__Enumeration__Group__1 : ( 'enumeration' ) rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1451:1: ( ( 'enumeration' ) rule__Enumeration__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1452:1: ( 'enumeration' ) rule__Enumeration__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1452:1: ( 'enumeration' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1453:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Enumeration__Group__12935); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12945);
            rule__Enumeration__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__1


    // $ANTLR start rule__Enumeration__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1467:1: rule__Enumeration__Group__2 : ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1471:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1472:1: ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1472:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1473:1: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1474:1: ( rule__Enumeration__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1474:2: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__22973);
            rule__Enumeration__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22982);
            rule__Enumeration__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__2


    // $ANTLR start rule__Enumeration__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1485:1: rule__Enumeration__Group__3 : ( '[' ) rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1489:1: ( ( '[' ) rule__Enumeration__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1490:1: ( '[' ) rule__Enumeration__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1490:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1491:1: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Enumeration__Group__33011); 
             after(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33021);
            rule__Enumeration__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__3


    // $ANTLR start rule__Enumeration__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1505:1: rule__Enumeration__Group__4 : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1509:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1510:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1510:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1511:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1511:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1512:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1513:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1513:2: rule__Enumeration__EnumerationLiteralsAssignment_4
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43051);
            rule__Enumeration__EnumerationLiteralsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }

            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1516:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1517:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1518:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1518:2: rule__Enumeration__EnumerationLiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43063);
            	    rule__Enumeration__EnumerationLiteralsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }


            }

            pushFollow(FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43075);
            rule__Enumeration__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__4


    // $ANTLR start rule__Enumeration__Group__5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1530:1: rule__Enumeration__Group__5 : ( ']' ) ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1534:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1535:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1535:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1536:1: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Enumeration__Group__53104); 
             after(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__Group__5


    // $ANTLR start rule__EnumerationLiteral__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1561:1: rule__EnumerationLiteral__Group__0 : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1565:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1566:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1566:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1567:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1568:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1568:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__03151);
            rule__EnumerationLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__03160);
            rule__EnumerationLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group__0


    // $ANTLR start rule__EnumerationLiteral__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1579:1: rule__EnumerationLiteral__Group__1 : ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1583:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1584:1: ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1584:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1585:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1586:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1586:2: rule__EnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__13188);
            rule__EnumerationLiteral__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__13197);
            rule__EnumerationLiteral__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group__1


    // $ANTLR start rule__EnumerationLiteral__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1597:1: rule__EnumerationLiteral__Group__2 : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1601:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1602:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1602:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1603:1: ';'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__EnumerationLiteral__Group__23226); 
             after(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group__2


    // $ANTLR start rule__EnumerationLiteral__Group_1__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1622:1: rule__EnumerationLiteral__Group_1__0 : ( '=' ) rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1626:1: ( ( '=' ) rule__EnumerationLiteral__Group_1__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1627:1: ( '=' ) rule__EnumerationLiteral__Group_1__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1627:1: ( '=' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1628:1: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__EnumerationLiteral__Group_1__03268); 
             after(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__03278);
            rule__EnumerationLiteral__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group_1__0


    // $ANTLR start rule__EnumerationLiteral__Group_1__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1642:1: rule__EnumerationLiteral__Group_1__1 : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1646:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1647:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1647:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1648:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1649:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1649:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__13306);
            rule__EnumerationLiteral__PersistedValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__Group_1__1


    // $ANTLR start rule__BusinessRule__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1663:1: rule__BusinessRule__Group__0 : ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1667:1: ( ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1668:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1668:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1669:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1670:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1670:2: rule__BusinessRule__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessRule__DescriptionAssignment_0_in_rule__BusinessRule__Group__03344);
                    rule__BusinessRule__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03354);
            rule__BusinessRule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__Group__0


    // $ANTLR start rule__BusinessRule__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1681:1: rule__BusinessRule__Group__1 : ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1685:1: ( ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1686:1: ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1686:1: ( ( rule__BusinessRule__NameAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1687:1: ( rule__BusinessRule__NameAssignment_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1688:1: ( rule__BusinessRule__NameAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1688:2: rule__BusinessRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__13382);
            rule__BusinessRule__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13391);
            rule__BusinessRule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__Group__1


    // $ANTLR start rule__BusinessRule__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1699:1: rule__BusinessRule__Group__2 : ( ';' ) ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1703:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1704:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1704:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1705:1: ';'
            {
             before(grammarAccess.getBusinessRuleAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__BusinessRule__Group__23420); 
             after(grammarAccess.getBusinessRuleAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__Group__2


    // $ANTLR start rule__UniqueRule__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1724:1: rule__UniqueRule__Group__0 : ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 ;
    public final void rule__UniqueRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1728:1: ( ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1729:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1729:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1730:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1731:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1731:2: rule__UniqueRule__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UniqueRule__DescriptionAssignment_0_in_rule__UniqueRule__Group__03461);
                    rule__UniqueRule__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__1_in_rule__UniqueRule__Group__03471);
            rule__UniqueRule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__0


    // $ANTLR start rule__UniqueRule__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1742:1: rule__UniqueRule__Group__1 : ( 'unique' ) rule__UniqueRule__Group__2 ;
    public final void rule__UniqueRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1746:1: ( ( 'unique' ) rule__UniqueRule__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1747:1: ( 'unique' ) rule__UniqueRule__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1747:1: ( 'unique' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1748:1: 'unique'
            {
             before(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__UniqueRule__Group__13500); 
             after(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__2_in_rule__UniqueRule__Group__13510);
            rule__UniqueRule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__1


    // $ANTLR start rule__UniqueRule__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1762:1: rule__UniqueRule__Group__2 : ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 ;
    public final void rule__UniqueRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1766:1: ( ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1767:1: ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1767:1: ( ( rule__UniqueRule__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1768:1: ( rule__UniqueRule__NameAssignment_2 )
            {
             before(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1769:1: ( rule__UniqueRule__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1769:2: rule__UniqueRule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UniqueRule__NameAssignment_2_in_rule__UniqueRule__Group__23538);
            rule__UniqueRule__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__3_in_rule__UniqueRule__Group__23547);
            rule__UniqueRule__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__2


    // $ANTLR start rule__UniqueRule__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1780:1: rule__UniqueRule__Group__3 : ( '[' ) rule__UniqueRule__Group__4 ;
    public final void rule__UniqueRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1784:1: ( ( '[' ) rule__UniqueRule__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1785:1: ( '[' ) rule__UniqueRule__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1785:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1786:1: '['
            {
             before(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__UniqueRule__Group__33576); 
             after(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__4_in_rule__UniqueRule__Group__33586);
            rule__UniqueRule__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__3


    // $ANTLR start rule__UniqueRule__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1800:1: rule__UniqueRule__Group__4 : ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 ;
    public final void rule__UniqueRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1804:1: ( ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1805:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1805:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1806:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1807:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1807:2: rule__UniqueRule__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__UniqueRule__PropertiesAssignment_4_in_rule__UniqueRule__Group__43614);
            rule__UniqueRule__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__5_in_rule__UniqueRule__Group__43623);
            rule__UniqueRule__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__4


    // $ANTLR start rule__UniqueRule__Group__5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1818:1: rule__UniqueRule__Group__5 : ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 ;
    public final void rule__UniqueRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1822:1: ( ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1823:1: ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1823:1: ( ( rule__UniqueRule__Group_5__0 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1824:1: ( rule__UniqueRule__Group_5__0 )*
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1825:1: ( rule__UniqueRule__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1825:2: rule__UniqueRule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__UniqueRule__Group_5__0_in_rule__UniqueRule__Group__53651);
            	    rule__UniqueRule__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getUniqueRuleAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__6_in_rule__UniqueRule__Group__53661);
            rule__UniqueRule__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__5


    // $ANTLR start rule__UniqueRule__Group__6
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1836:1: rule__UniqueRule__Group__6 : ( ']' ) ;
    public final void rule__UniqueRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1840:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1841:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1841:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1842:1: ']'
            {
             before(grammarAccess.getUniqueRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__UniqueRule__Group__63690); 
             after(grammarAccess.getUniqueRuleAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group__6


    // $ANTLR start rule__UniqueRule__Group_5__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1869:1: rule__UniqueRule__Group_5__0 : ( ',' ) rule__UniqueRule__Group_5__1 ;
    public final void rule__UniqueRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1873:1: ( ( ',' ) rule__UniqueRule__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1874:1: ( ',' ) rule__UniqueRule__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1874:1: ( ',' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1875:1: ','
            {
             before(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__UniqueRule__Group_5__03740); 
             after(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group_5__1_in_rule__UniqueRule__Group_5__03750);
            rule__UniqueRule__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group_5__0


    // $ANTLR start rule__UniqueRule__Group_5__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1889:1: rule__UniqueRule__Group_5__1 : ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) ;
    public final void rule__UniqueRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1893:1: ( ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1894:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1894:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1895:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1896:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1896:2: rule__UniqueRule__PropertiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__UniqueRule__PropertiesAssignment_5_1_in_rule__UniqueRule__Group_5__13778);
            rule__UniqueRule__PropertiesAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__Group_5__1


    // $ANTLR start rule__Property__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1910:1: rule__Property__Group__0 : ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1914:1: ( ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1915:1: ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1915:1: ( ( rule__Property__Alternatives_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1916:1: ( rule__Property__Alternatives_0 )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1917:1: ( rule__Property__Alternatives_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1917:2: rule__Property__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__03816);
            rule__Property__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03825);
            rule__Property__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1928:1: rule__Property__Group__1 : ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1932:1: ( ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1933:1: ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1933:1: ( ( rule__Property__NullableAssignment_1 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1934:1: ( rule__Property__NullableAssignment_1 )?
            {
             before(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1935:1: ( rule__Property__NullableAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1935:2: rule__Property__NullableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Property__NullableAssignment_1_in_rule__Property__Group__13853);
                    rule__Property__NullableAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13863);
            rule__Property__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1946:1: rule__Property__Group__2 : ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1950:1: ( ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1951:1: ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1951:1: ( ( rule__Property__Group_2__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1952:1: ( rule__Property__Group_2__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1953:1: ( rule__Property__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1953:2: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__23891);
                    rule__Property__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23901);
            rule__Property__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1964:1: rule__Property__Group__3 : ( ';' ) ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1968:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1969:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1969:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1970:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Property__Group__33930); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__3


    // $ANTLR start rule__Property__Group_2__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1991:1: rule__Property__Group_2__0 : ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1995:1: ( ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1996:1: ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1996:1: ( ( rule__Property__DerivedAssignment_2_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1997:1: ( rule__Property__DerivedAssignment_2_0 )
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1998:1: ( rule__Property__DerivedAssignment_2_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1998:2: rule__Property__DerivedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Property__DerivedAssignment_2_0_in_rule__Property__Group_2__03973);
            rule__Property__DerivedAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__03982);
            rule__Property__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_2__0


    // $ANTLR start rule__Property__Group_2__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2009:1: rule__Property__Group_2__1 : ( ( rule__Property__WritableAssignment_2_1 )? ) ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2013:1: ( ( ( rule__Property__WritableAssignment_2_1 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2014:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2014:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2015:1: ( rule__Property__WritableAssignment_2_1 )?
            {
             before(grammarAccess.getPropertyAccess().getWritableAssignment_2_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2016:1: ( rule__Property__WritableAssignment_2_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2016:2: rule__Property__WritableAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Property__WritableAssignment_2_1_in_rule__Property__Group_2__14010);
                    rule__Property__WritableAssignment_2_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getWritableAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_2__1


    // $ANTLR start rule__BoolProperty__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2030:1: rule__BoolProperty__Group__0 : ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2034:1: ( ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2035:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2035:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2036:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2037:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2037:2: rule__BoolProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__DescriptionAssignment_0_in_rule__BoolProperty__Group__04049);
                    rule__BoolProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__1_in_rule__BoolProperty__Group__04059);
            rule__BoolProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group__0


    // $ANTLR start rule__BoolProperty__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2048:1: rule__BoolProperty__Group__1 : ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2052:1: ( ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2053:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2053:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2054:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2055:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2055:2: rule__BoolProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolProperty__DataTypeAssignment_1_in_rule__BoolProperty__Group__14087);
            rule__BoolProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__2_in_rule__BoolProperty__Group__14096);
            rule__BoolProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group__1


    // $ANTLR start rule__BoolProperty__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2066:1: rule__BoolProperty__Group__2 : ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2070:1: ( ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2071:1: ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2071:1: ( ( rule__BoolProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2072:1: ( rule__BoolProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2073:1: ( rule__BoolProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2073:2: rule__BoolProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BoolProperty__NameAssignment_2_in_rule__BoolProperty__Group__24124);
            rule__BoolProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__3_in_rule__BoolProperty__Group__24133);
            rule__BoolProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group__2


    // $ANTLR start rule__BoolProperty__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2084:1: rule__BoolProperty__Group__3 : ( ( rule__BoolProperty__Group_3__0 )? ) ;
    public final void rule__BoolProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2088:1: ( ( ( rule__BoolProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2089:1: ( ( rule__BoolProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2089:1: ( ( rule__BoolProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2090:1: ( rule__BoolProperty__Group_3__0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2091:1: ( rule__BoolProperty__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2091:2: rule__BoolProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__Group_3__0_in_rule__BoolProperty__Group__34161);
                    rule__BoolProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group__3


    // $ANTLR start rule__BoolProperty__Group_3__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2109:1: rule__BoolProperty__Group_3__0 : ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 ;
    public final void rule__BoolProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2113:1: ( ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2114:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2114:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2115:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2116:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2116:2: rule__BoolProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__BoolProperty__HasDefaultAssignment_3_0_in_rule__BoolProperty__Group_3__04204);
            rule__BoolProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group_3__1_in_rule__BoolProperty__Group_3__04213);
            rule__BoolProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group_3__0


    // $ANTLR start rule__BoolProperty__Group_3__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2127:1: rule__BoolProperty__Group_3__1 : ( ( rule__BoolProperty__Alternatives_3_1 ) ) ;
    public final void rule__BoolProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2131:1: ( ( ( rule__BoolProperty__Alternatives_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2132:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2132:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2133:1: ( rule__BoolProperty__Alternatives_3_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getAlternatives_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2134:1: ( rule__BoolProperty__Alternatives_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2134:2: rule__BoolProperty__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__BoolProperty__Alternatives_3_1_in_rule__BoolProperty__Group_3__14241);
            rule__BoolProperty__Alternatives_3_1();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__Group_3__1


    // $ANTLR start rule__StringProperty__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2148:1: rule__StringProperty__Group__0 : ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2152:1: ( ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2153:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2153:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2154:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2155:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2155:2: rule__StringProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__DescriptionAssignment_0_in_rule__StringProperty__Group__04279);
                    rule__StringProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__1_in_rule__StringProperty__Group__04289);
            rule__StringProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__0


    // $ANTLR start rule__StringProperty__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2166:1: rule__StringProperty__Group__1 : ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2170:1: ( ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2171:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2171:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2172:1: ( rule__StringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2173:1: ( rule__StringProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2173:2: rule__StringProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__StringProperty__DataTypeAssignment_1_in_rule__StringProperty__Group__14317);
            rule__StringProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__2_in_rule__StringProperty__Group__14326);
            rule__StringProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__1


    // $ANTLR start rule__StringProperty__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2184:1: rule__StringProperty__Group__2 : ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2188:1: ( ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2189:1: ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2189:1: ( ( rule__StringProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2190:1: ( rule__StringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2191:1: ( rule__StringProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2191:2: rule__StringProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__StringProperty__NameAssignment_2_in_rule__StringProperty__Group__24354);
            rule__StringProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__3_in_rule__StringProperty__Group__24363);
            rule__StringProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__2


    // $ANTLR start rule__StringProperty__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2202:1: rule__StringProperty__Group__3 : ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 ;
    public final void rule__StringProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2206:1: ( ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2207:1: ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2207:1: ( ( rule__StringProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2208:1: ( rule__StringProperty__Group_3__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2209:1: ( rule__StringProperty__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2209:2: rule__StringProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_3__0_in_rule__StringProperty__Group__34391);
                    rule__StringProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__4_in_rule__StringProperty__Group__34401);
            rule__StringProperty__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__3


    // $ANTLR start rule__StringProperty__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2220:1: rule__StringProperty__Group__4 : ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 ;
    public final void rule__StringProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2224:1: ( ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2225:1: ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2225:1: ( ( rule__StringProperty__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2226:1: ( rule__StringProperty__Group_4__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2227:1: ( rule__StringProperty__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2227:2: rule__StringProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_4__0_in_rule__StringProperty__Group__44429);
                    rule__StringProperty__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__5_in_rule__StringProperty__Group__44439);
            rule__StringProperty__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__4


    // $ANTLR start rule__StringProperty__Group__5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2238:1: rule__StringProperty__Group__5 : ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 ;
    public final void rule__StringProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2242:1: ( ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2243:1: ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2243:1: ( ( rule__StringProperty__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2244:1: ( rule__StringProperty__Group_5__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2245:1: ( rule__StringProperty__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2245:2: rule__StringProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_5__0_in_rule__StringProperty__Group__54467);
                    rule__StringProperty__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__6_in_rule__StringProperty__Group__54477);
            rule__StringProperty__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__5


    // $ANTLR start rule__StringProperty__Group__6
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2256:1: rule__StringProperty__Group__6 : ( ( rule__StringProperty__Group_6__0 )? ) ;
    public final void rule__StringProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2260:1: ( ( ( rule__StringProperty__Group_6__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2261:1: ( ( rule__StringProperty__Group_6__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2261:1: ( ( rule__StringProperty__Group_6__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2262:1: ( rule__StringProperty__Group_6__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2263:1: ( rule__StringProperty__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2263:2: rule__StringProperty__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_6__0_in_rule__StringProperty__Group__64505);
                    rule__StringProperty__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group__6


    // $ANTLR start rule__StringProperty__Group_3__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2287:1: rule__StringProperty__Group_3__0 : ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 ;
    public final void rule__StringProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2291:1: ( ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2292:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2292:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2293:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2294:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2294:2: rule__StringProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__StringProperty__HasDefaultAssignment_3_0_in_rule__StringProperty__Group_3__04554);
            rule__StringProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_3__1_in_rule__StringProperty__Group_3__04563);
            rule__StringProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_3__0


    // $ANTLR start rule__StringProperty__Group_3__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2305:1: rule__StringProperty__Group_3__1 : ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__StringProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2309:1: ( ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2310:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2310:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2311:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2312:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2312:2: rule__StringProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StringProperty__DefaultValueAssignment_3_1_in_rule__StringProperty__Group_3__14591);
            rule__StringProperty__DefaultValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_3__1


    // $ANTLR start rule__StringProperty__Group_4__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2326:1: rule__StringProperty__Group_4__0 : ( 'minlength' ) rule__StringProperty__Group_4__1 ;
    public final void rule__StringProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2330:1: ( ( 'minlength' ) rule__StringProperty__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2331:1: ( 'minlength' ) rule__StringProperty__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2331:1: ( 'minlength' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2332:1: 'minlength'
            {
             before(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__StringProperty__Group_4__04630); 
             after(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_4__1_in_rule__StringProperty__Group_4__04640);
            rule__StringProperty__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_4__0


    // $ANTLR start rule__StringProperty__Group_4__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2346:1: rule__StringProperty__Group_4__1 : ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) ;
    public final void rule__StringProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2350:1: ( ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2351:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2351:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2352:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2353:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2353:2: rule__StringProperty__MinLengthAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StringProperty__MinLengthAssignment_4_1_in_rule__StringProperty__Group_4__14668);
            rule__StringProperty__MinLengthAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getMinLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_4__1


    // $ANTLR start rule__StringProperty__Group_5__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2367:1: rule__StringProperty__Group_5__0 : ( 'maxlength' ) rule__StringProperty__Group_5__1 ;
    public final void rule__StringProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2371:1: ( ( 'maxlength' ) rule__StringProperty__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2372:1: ( 'maxlength' ) rule__StringProperty__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2372:1: ( 'maxlength' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2373:1: 'maxlength'
            {
             before(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__StringProperty__Group_5__04707); 
             after(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_5__1_in_rule__StringProperty__Group_5__04717);
            rule__StringProperty__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_5__0


    // $ANTLR start rule__StringProperty__Group_5__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2387:1: rule__StringProperty__Group_5__1 : ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) ;
    public final void rule__StringProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2391:1: ( ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2392:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2392:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2393:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2394:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2394:2: rule__StringProperty__MaxLengthAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StringProperty__MaxLengthAssignment_5_1_in_rule__StringProperty__Group_5__14745);
            rule__StringProperty__MaxLengthAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getMaxLengthAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_5__1


    // $ANTLR start rule__StringProperty__Group_6__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2408:1: rule__StringProperty__Group_6__0 : ( 'regexp' ) rule__StringProperty__Group_6__1 ;
    public final void rule__StringProperty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2412:1: ( ( 'regexp' ) rule__StringProperty__Group_6__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2413:1: ( 'regexp' ) rule__StringProperty__Group_6__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2413:1: ( 'regexp' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2414:1: 'regexp'
            {
             before(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__StringProperty__Group_6__04784); 
             after(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_6__1_in_rule__StringProperty__Group_6__04794);
            rule__StringProperty__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_6__0


    // $ANTLR start rule__StringProperty__Group_6__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2428:1: rule__StringProperty__Group_6__1 : ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) ;
    public final void rule__StringProperty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2432:1: ( ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2433:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2433:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2434:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionAssignment_6_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2435:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2435:2: rule__StringProperty__RegularExpressionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__StringProperty__RegularExpressionAssignment_6_1_in_rule__StringProperty__Group_6__14822);
            rule__StringProperty__RegularExpressionAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getRegularExpressionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__Group_6__1


    // $ANTLR start rule__DateTimeProperty__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2449:1: rule__DateTimeProperty__Group__0 : ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 ;
    public final void rule__DateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2453:1: ( ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2454:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2454:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2455:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2456:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2456:2: rule__DateTimeProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DateTimeProperty__DescriptionAssignment_0_in_rule__DateTimeProperty__Group__04860);
                    rule__DateTimeProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__1_in_rule__DateTimeProperty__Group__04870);
            rule__DateTimeProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group__0


    // $ANTLR start rule__DateTimeProperty__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2467:1: rule__DateTimeProperty__Group__1 : ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 ;
    public final void rule__DateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2471:1: ( ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2472:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2472:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2473:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2474:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2474:2: rule__DateTimeProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__DataTypeAssignment_1_in_rule__DateTimeProperty__Group__14898);
            rule__DateTimeProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__2_in_rule__DateTimeProperty__Group__14907);
            rule__DateTimeProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group__1


    // $ANTLR start rule__DateTimeProperty__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2485:1: rule__DateTimeProperty__Group__2 : ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 ;
    public final void rule__DateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2489:1: ( ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2490:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2490:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2491:1: ( rule__DateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2492:1: ( rule__DateTimeProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2492:2: rule__DateTimeProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__NameAssignment_2_in_rule__DateTimeProperty__Group__24935);
            rule__DateTimeProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__3_in_rule__DateTimeProperty__Group__24944);
            rule__DateTimeProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group__2


    // $ANTLR start rule__DateTimeProperty__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2503:1: rule__DateTimeProperty__Group__3 : ( ( rule__DateTimeProperty__Group_3__0 )? ) ;
    public final void rule__DateTimeProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2507:1: ( ( ( rule__DateTimeProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2508:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2508:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2509:1: ( rule__DateTimeProperty__Group_3__0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2510:1: ( rule__DateTimeProperty__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2510:2: rule__DateTimeProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeProperty__Group_3__0_in_rule__DateTimeProperty__Group__34972);
                    rule__DateTimeProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimePropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group__3


    // $ANTLR start rule__DateTimeProperty__Group_3__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2528:1: rule__DateTimeProperty__Group_3__0 : ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 ;
    public final void rule__DateTimeProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2532:1: ( ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2533:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2533:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2534:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2535:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2535:2: rule__DateTimeProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__HasDefaultAssignment_3_0_in_rule__DateTimeProperty__Group_3__05015);
            rule__DateTimeProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group_3__1_in_rule__DateTimeProperty__Group_3__05024);
            rule__DateTimeProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group_3__0


    // $ANTLR start rule__DateTimeProperty__Group_3__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2546:1: rule__DateTimeProperty__Group_3__1 : ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__DateTimeProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2550:1: ( ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2551:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2551:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2552:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2553:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2553:2: rule__DateTimeProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__DefaultValueAssignment_3_1_in_rule__DateTimeProperty__Group_3__15052);
            rule__DateTimeProperty__DefaultValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__Group_3__1


    // $ANTLR start rule__IntegerProperty__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2567:1: rule__IntegerProperty__Group__0 : ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 ;
    public final void rule__IntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2571:1: ( ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2572:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2572:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2573:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2574:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2574:2: rule__IntegerProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__DescriptionAssignment_0_in_rule__IntegerProperty__Group__05090);
                    rule__IntegerProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__1_in_rule__IntegerProperty__Group__05100);
            rule__IntegerProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__0


    // $ANTLR start rule__IntegerProperty__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2585:1: rule__IntegerProperty__Group__1 : ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 ;
    public final void rule__IntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2589:1: ( ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2590:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2590:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2591:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2592:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2592:2: rule__IntegerProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__DataTypeAssignment_1_in_rule__IntegerProperty__Group__15128);
            rule__IntegerProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__2_in_rule__IntegerProperty__Group__15137);
            rule__IntegerProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__1


    // $ANTLR start rule__IntegerProperty__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2603:1: rule__IntegerProperty__Group__2 : ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 ;
    public final void rule__IntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2607:1: ( ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2608:1: ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2608:1: ( ( rule__IntegerProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2609:1: ( rule__IntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2610:1: ( rule__IntegerProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2610:2: rule__IntegerProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerProperty__NameAssignment_2_in_rule__IntegerProperty__Group__25165);
            rule__IntegerProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__3_in_rule__IntegerProperty__Group__25174);
            rule__IntegerProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__2


    // $ANTLR start rule__IntegerProperty__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2621:1: rule__IntegerProperty__Group__3 : ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 ;
    public final void rule__IntegerProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2625:1: ( ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2626:1: ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2626:1: ( ( rule__IntegerProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2627:1: ( rule__IntegerProperty__Group_3__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2628:1: ( rule__IntegerProperty__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2628:2: rule__IntegerProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_3__0_in_rule__IntegerProperty__Group__35202);
                    rule__IntegerProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__4_in_rule__IntegerProperty__Group__35212);
            rule__IntegerProperty__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__3


    // $ANTLR start rule__IntegerProperty__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2639:1: rule__IntegerProperty__Group__4 : ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 ;
    public final void rule__IntegerProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2643:1: ( ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2644:1: ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2644:1: ( ( rule__IntegerProperty__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2645:1: ( rule__IntegerProperty__Group_4__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2646:1: ( rule__IntegerProperty__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2646:2: rule__IntegerProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_4__0_in_rule__IntegerProperty__Group__45240);
                    rule__IntegerProperty__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__5_in_rule__IntegerProperty__Group__45250);
            rule__IntegerProperty__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__4


    // $ANTLR start rule__IntegerProperty__Group__5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2657:1: rule__IntegerProperty__Group__5 : ( ( rule__IntegerProperty__Group_5__0 )? ) ;
    public final void rule__IntegerProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2661:1: ( ( ( rule__IntegerProperty__Group_5__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2662:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2662:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2663:1: ( rule__IntegerProperty__Group_5__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2664:1: ( rule__IntegerProperty__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2664:2: rule__IntegerProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_5__0_in_rule__IntegerProperty__Group__55278);
                    rule__IntegerProperty__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group__5


    // $ANTLR start rule__IntegerProperty__Group_3__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2686:1: rule__IntegerProperty__Group_3__0 : ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 ;
    public final void rule__IntegerProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2690:1: ( ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2691:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2691:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2692:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2693:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2693:2: rule__IntegerProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__IntegerProperty__HasDefaultAssignment_3_0_in_rule__IntegerProperty__Group_3__05325);
            rule__IntegerProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_3__1_in_rule__IntegerProperty__Group_3__05334);
            rule__IntegerProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_3__0


    // $ANTLR start rule__IntegerProperty__Group_3__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2704:1: rule__IntegerProperty__Group_3__1 : ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__IntegerProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2708:1: ( ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2709:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2709:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2710:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2711:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2711:2: rule__IntegerProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__DefaultValueAssignment_3_1_in_rule__IntegerProperty__Group_3__15362);
            rule__IntegerProperty__DefaultValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_3__1


    // $ANTLR start rule__IntegerProperty__Group_4__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2725:1: rule__IntegerProperty__Group_4__0 : ( 'min' ) rule__IntegerProperty__Group_4__1 ;
    public final void rule__IntegerProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2729:1: ( ( 'min' ) rule__IntegerProperty__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2730:1: ( 'min' ) rule__IntegerProperty__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2730:1: ( 'min' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2731:1: 'min'
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__IntegerProperty__Group_4__05401); 
             after(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_4__1_in_rule__IntegerProperty__Group_4__05411);
            rule__IntegerProperty__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_4__0


    // $ANTLR start rule__IntegerProperty__Group_4__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2745:1: rule__IntegerProperty__Group_4__1 : ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) ;
    public final void rule__IntegerProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2749:1: ( ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2750:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2750:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2751:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2752:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2752:2: rule__IntegerProperty__MinValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__MinValueAssignment_4_1_in_rule__IntegerProperty__Group_4__15439);
            rule__IntegerProperty__MinValueAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getMinValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_4__1


    // $ANTLR start rule__IntegerProperty__Group_5__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2766:1: rule__IntegerProperty__Group_5__0 : ( 'max' ) rule__IntegerProperty__Group_5__1 ;
    public final void rule__IntegerProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2770:1: ( ( 'max' ) rule__IntegerProperty__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2771:1: ( 'max' ) rule__IntegerProperty__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2771:1: ( 'max' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2772:1: 'max'
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__IntegerProperty__Group_5__05478); 
             after(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_5__1_in_rule__IntegerProperty__Group_5__05488);
            rule__IntegerProperty__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_5__0


    // $ANTLR start rule__IntegerProperty__Group_5__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2786:1: rule__IntegerProperty__Group_5__1 : ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) ;
    public final void rule__IntegerProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2790:1: ( ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2791:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2791:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2792:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2793:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2793:2: rule__IntegerProperty__MaxValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__MaxValueAssignment_5_1_in_rule__IntegerProperty__Group_5__15516);
            rule__IntegerProperty__MaxValueAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getMaxValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__Group_5__1


    // $ANTLR start rule__DecimalProperty__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2807:1: rule__DecimalProperty__Group__0 : ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 ;
    public final void rule__DecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2811:1: ( ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2812:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2812:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2813:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2814:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2814:2: rule__DecimalProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DecimalProperty__DescriptionAssignment_0_in_rule__DecimalProperty__Group__05554);
                    rule__DecimalProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DecimalProperty__Group__1_in_rule__DecimalProperty__Group__05564);
            rule__DecimalProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__Group__0


    // $ANTLR start rule__DecimalProperty__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2825:1: rule__DecimalProperty__Group__1 : ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 ;
    public final void rule__DecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2829:1: ( ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2830:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2830:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2831:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2832:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2832:2: rule__DecimalProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DecimalProperty__DataTypeAssignment_1_in_rule__DecimalProperty__Group__15592);
            rule__DecimalProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DecimalProperty__Group__2_in_rule__DecimalProperty__Group__15601);
            rule__DecimalProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__Group__1


    // $ANTLR start rule__DecimalProperty__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2843:1: rule__DecimalProperty__Group__2 : ( ( rule__DecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2847:1: ( ( ( rule__DecimalProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2848:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2848:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2849:1: ( rule__DecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2850:1: ( rule__DecimalProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2850:2: rule__DecimalProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DecimalProperty__NameAssignment_2_in_rule__DecimalProperty__Group__25629);
            rule__DecimalProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDecimalPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__Group__2


    // $ANTLR start rule__EnumerationProperty__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2866:1: rule__EnumerationProperty__Group__0 : ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 ;
    public final void rule__EnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2870:1: ( ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2871:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2871:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2872:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2873:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2873:2: rule__EnumerationProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumerationProperty__DescriptionAssignment_0_in_rule__EnumerationProperty__Group__05669);
                    rule__EnumerationProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__1_in_rule__EnumerationProperty__Group__05679);
            rule__EnumerationProperty__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group__0


    // $ANTLR start rule__EnumerationProperty__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2884:1: rule__EnumerationProperty__Group__1 : ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 ;
    public final void rule__EnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2888:1: ( ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2889:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2889:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2890:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2891:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2891:2: rule__EnumerationProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__TypeAssignment_1_in_rule__EnumerationProperty__Group__15707);
            rule__EnumerationProperty__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__2_in_rule__EnumerationProperty__Group__15716);
            rule__EnumerationProperty__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group__1


    // $ANTLR start rule__EnumerationProperty__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2902:1: rule__EnumerationProperty__Group__2 : ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 ;
    public final void rule__EnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2906:1: ( ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2907:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2907:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2908:1: ( rule__EnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2909:1: ( rule__EnumerationProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2909:2: rule__EnumerationProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__NameAssignment_2_in_rule__EnumerationProperty__Group__25744);
            rule__EnumerationProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__3_in_rule__EnumerationProperty__Group__25753);
            rule__EnumerationProperty__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group__2


    // $ANTLR start rule__EnumerationProperty__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2920:1: rule__EnumerationProperty__Group__3 : ( ( rule__EnumerationProperty__Group_3__0 )? ) ;
    public final void rule__EnumerationProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2924:1: ( ( ( rule__EnumerationProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2925:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2925:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2926:1: ( rule__EnumerationProperty__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2927:1: ( rule__EnumerationProperty__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2927:2: rule__EnumerationProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationProperty__Group_3__0_in_rule__EnumerationProperty__Group__35781);
                    rule__EnumerationProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group__3


    // $ANTLR start rule__EnumerationProperty__Group_3__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2945:1: rule__EnumerationProperty__Group_3__0 : ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 ;
    public final void rule__EnumerationProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2949:1: ( ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2950:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2950:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2951:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2952:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2952:2: rule__EnumerationProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__HasDefaultAssignment_3_0_in_rule__EnumerationProperty__Group_3__05824);
            rule__EnumerationProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group_3__1_in_rule__EnumerationProperty__Group_3__05833);
            rule__EnumerationProperty__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group_3__0


    // $ANTLR start rule__EnumerationProperty__Group_3__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2963:1: rule__EnumerationProperty__Group_3__1 : ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2967:1: ( ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2968:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2968:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2969:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2970:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2970:2: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationProperty__Group_3__15861);
            rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__Group_3__1


    // $ANTLR start rule__BusinessDomainModel__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2984:1: rule__BusinessDomainModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessDomainModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2988:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2989:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2989:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2990:1: RULE_STRING
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessDomainModel__DescriptionAssignment_05899); 
             after(grammarAccess.getBusinessDomainModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__DescriptionAssignment_0


    // $ANTLR start rule__BusinessDomainModel__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2999:1: rule__BusinessDomainModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessDomainModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3003:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3004:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3004:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3005:1: RULE_ID
            {
             before(grammarAccess.getBusinessDomainModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessDomainModel__NameAssignment_25930); 
             after(grammarAccess.getBusinessDomainModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__NameAssignment_2


    // $ANTLR start rule__BusinessDomainModel__TypesAssignment_4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3014:1: rule__BusinessDomainModel__TypesAssignment_4 : ( ruleBusinessClassReference ) ;
    public final void rule__BusinessDomainModel__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3018:1: ( ( ruleBusinessClassReference ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3019:1: ( ruleBusinessClassReference )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3019:1: ( ruleBusinessClassReference )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3020:1: ruleBusinessClassReference
            {
             before(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBusinessClassReference_in_rule__BusinessDomainModel__TypesAssignment_45961);
            ruleBusinessClassReference();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__TypesAssignment_4


    // $ANTLR start rule__BusinessDomainModel__TypesAssignment_5_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3029:1: rule__BusinessDomainModel__TypesAssignment_5_0 : ( ruleBusinessClass ) ;
    public final void rule__BusinessDomainModel__TypesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3033:1: ( ( ruleBusinessClass ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3034:1: ( ruleBusinessClass )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3034:1: ( ruleBusinessClass )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3035:1: ruleBusinessClass
            {
             before(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleBusinessClass_in_rule__BusinessDomainModel__TypesAssignment_5_05992);
            ruleBusinessClass();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__TypesAssignment_5_0


    // $ANTLR start rule__BusinessDomainModel__EnumerationsAssignment_5_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3044:1: rule__BusinessDomainModel__EnumerationsAssignment_5_1 : ( ruleEnumeration ) ;
    public final void rule__BusinessDomainModel__EnumerationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3048:1: ( ( ruleEnumeration ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3049:1: ( ruleEnumeration )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3049:1: ( ruleEnumeration )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3050:1: ruleEnumeration
            {
             before(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEnumeration_in_rule__BusinessDomainModel__EnumerationsAssignment_5_16023);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__EnumerationsAssignment_5_1


    // $ANTLR start rule__BusinessDomainModel__AssociationsAssignment_5_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3059:1: rule__BusinessDomainModel__AssociationsAssignment_5_2 : ( ruleAssociation ) ;
    public final void rule__BusinessDomainModel__AssociationsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3063:1: ( ( ruleAssociation ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3064:1: ( ruleAssociation )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3064:1: ( ruleAssociation )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3065:1: ruleAssociation
            {
             before(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__BusinessDomainModel__AssociationsAssignment_5_26054);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessDomainModel__AssociationsAssignment_5_2


    // $ANTLR start rule__BusinessClassReference__ReferredModelAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3074:1: rule__BusinessClassReference__ReferredModelAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessClassReference__ReferredModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3078:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3079:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3079:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3080:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getReferredModelIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassReference__ReferredModelAssignment_16085); 
             after(grammarAccess.getBusinessClassReferenceAccess().getReferredModelIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassReference__ReferredModelAssignment_1


    // $ANTLR start rule__BusinessClassReference__NameAssignment_3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3089:1: rule__BusinessClassReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__BusinessClassReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3093:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3094:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3094:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3095:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClassReference__NameAssignment_36116); 
             after(grammarAccess.getBusinessClassReferenceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClassReference__NameAssignment_3


    // $ANTLR start rule__Association__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3104:1: rule__Association__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Association__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3108:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3109:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3109:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3110:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__DescriptionAssignment_06147); 
             after(grammarAccess.getAssociationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__DescriptionAssignment_0


    // $ANTLR start rule__Association__SourceAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3119:1: rule__Association__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3123:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3124:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3124:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3125:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3126:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3127:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_26182); 
             after(grammarAccess.getAssociationAccess().getSourceBusinessClassIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__SourceAssignment_2


    // $ANTLR start rule__Association__SourceRoleNameAssignment_3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3138:1: rule__Association__SourceRoleNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Association__SourceRoleNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3142:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3143:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3143:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3144:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceRoleNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceRoleNameAssignment_36217); 
             after(grammarAccess.getAssociationAccess().getSourceRoleNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__SourceRoleNameAssignment_3


    // $ANTLR start rule__Association__SourceMultiplicityAssignment_4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3153:1: rule__Association__SourceMultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Association__SourceMultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3157:1: ( ( ruleMultiplicity ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3158:1: ( ruleMultiplicity )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3158:1: ( ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3159:1: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Association__SourceMultiplicityAssignment_46248);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__SourceMultiplicityAssignment_4


    // $ANTLR start rule__Association__BidirectionalAssignment_5_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3168:1: rule__Association__BidirectionalAssignment_5_0 : ( ( '<->' ) ) ;
    public final void rule__Association__BidirectionalAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3172:1: ( ( ( '<->' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3173:1: ( ( '<->' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3173:1: ( ( '<->' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3174:1: ( '<->' )
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3175:1: ( '<->' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3176:1: '<->'
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Association__BidirectionalAssignment_5_06284); 
             after(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 

            }

             after(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__BidirectionalAssignment_5_0


    // $ANTLR start rule__Association__TargetMultiplicityAssignment_6
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3191:1: rule__Association__TargetMultiplicityAssignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Association__TargetMultiplicityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3195:1: ( ( ruleMultiplicity ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3196:1: ( ruleMultiplicity )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3196:1: ( ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3197:1: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Association__TargetMultiplicityAssignment_66323);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__TargetMultiplicityAssignment_6


    // $ANTLR start rule__Association__TargetAssignment_7
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3206:1: rule__Association__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3210:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3211:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3211:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3212:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_7_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3213:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3214:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_76358); 
             after(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__TargetAssignment_7


    // $ANTLR start rule__Association__TargetRoleNameAssignment_8
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3225:1: rule__Association__TargetRoleNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__Association__TargetRoleNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3229:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3230:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3230:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3231:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetRoleNameAssignment_86393); 
             after(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__TargetRoleNameAssignment_8


    // $ANTLR start rule__Association__OrderedAssignment_9
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3240:1: rule__Association__OrderedAssignment_9 : ( ( 'ordered' ) ) ;
    public final void rule__Association__OrderedAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3244:1: ( ( ( 'ordered' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3245:1: ( ( 'ordered' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3245:1: ( ( 'ordered' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3246:1: ( 'ordered' )
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3247:1: ( 'ordered' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3248:1: 'ordered'
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 
            match(input,35,FOLLOW_35_in_rule__Association__OrderedAssignment_96429); 
             after(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 

            }

             after(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__OrderedAssignment_9


    // $ANTLR start rule__BusinessClass__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3263:1: rule__BusinessClass__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClass__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3267:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3268:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3268:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3269:1: RULE_STRING
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessClass__DescriptionAssignment_06468); 
             after(grammarAccess.getBusinessClassAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__DescriptionAssignment_0


    // $ANTLR start rule__BusinessClass__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3278:1: rule__BusinessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3282:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3283:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3283:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3284:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__NameAssignment_26499); 
             after(grammarAccess.getBusinessClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__NameAssignment_2


    // $ANTLR start rule__BusinessClass__SuperclassAssignment_3_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3293:1: rule__BusinessClass__SuperclassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClass__SuperclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3297:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3298:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3298:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3299:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3300:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3301:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__SuperclassAssignment_3_16534); 
             after(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__SuperclassAssignment_3_1


    // $ANTLR start rule__BusinessClass__PropertiesAssignment_5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3312:1: rule__BusinessClass__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__BusinessClass__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3316:1: ( ( ruleProperty ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3317:1: ( ruleProperty )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3317:1: ( ruleProperty )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3318:1: ruleProperty
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__BusinessClass__PropertiesAssignment_56569);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__PropertiesAssignment_5


    // $ANTLR start rule__BusinessClass__BusinessRulesAssignment_6_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3327:1: rule__BusinessClass__BusinessRulesAssignment_6_2 : ( ruleAbstractBusinessRule ) ;
    public final void rule__BusinessClass__BusinessRulesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3331:1: ( ( ruleAbstractBusinessRule ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3332:1: ( ruleAbstractBusinessRule )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3332:1: ( ruleAbstractBusinessRule )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3333:1: ruleAbstractBusinessRule
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_rule__BusinessClass__BusinessRulesAssignment_6_26600);
            ruleAbstractBusinessRule();
            _fsp--;

             after(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessClass__BusinessRulesAssignment_6_2


    // $ANTLR start rule__Enumeration__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3342:1: rule__Enumeration__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Enumeration__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3346:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3347:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3347:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3348:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enumeration__DescriptionAssignment_06631); 
             after(grammarAccess.getEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__DescriptionAssignment_0


    // $ANTLR start rule__Enumeration__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3357:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3361:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3362:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3362:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3363:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_26662); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__NameAssignment_2


    // $ANTLR start rule__Enumeration__EnumerationLiteralsAssignment_4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3372:1: rule__Enumeration__EnumerationLiteralsAssignment_4 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3376:1: ( ( ruleEnumerationLiteral ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3377:1: ( ruleEnumerationLiteral )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3377:1: ( ruleEnumerationLiteral )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3378:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_46693);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Enumeration__EnumerationLiteralsAssignment_4


    // $ANTLR start rule__EnumerationLiteral__NameAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3387:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3391:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3392:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3392:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3393:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_06724); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__NameAssignment_0


    // $ANTLR start rule__EnumerationLiteral__PersistedValueAssignment_1_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3402:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3406:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3407:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3407:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3408:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_16755); 
             after(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationLiteral__PersistedValueAssignment_1_1


    // $ANTLR start rule__BusinessRule__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3417:1: rule__BusinessRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3421:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3422:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3422:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3423:1: RULE_STRING
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessRule__DescriptionAssignment_06786); 
             after(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__DescriptionAssignment_0


    // $ANTLR start rule__BusinessRule__NameAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3432:1: rule__BusinessRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3436:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3437:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3437:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3438:1: RULE_ID
            {
             before(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_16817); 
             after(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BusinessRule__NameAssignment_1


    // $ANTLR start rule__UniqueRule__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3447:1: rule__UniqueRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__UniqueRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3451:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3452:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3452:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3453:1: RULE_STRING
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UniqueRule__DescriptionAssignment_06848); 
             after(grammarAccess.getUniqueRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__DescriptionAssignment_0


    // $ANTLR start rule__UniqueRule__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3462:1: rule__UniqueRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UniqueRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3466:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3467:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3467:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3468:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__NameAssignment_26879); 
             after(grammarAccess.getUniqueRuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__NameAssignment_2


    // $ANTLR start rule__UniqueRule__PropertiesAssignment_4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3477:1: rule__UniqueRule__PropertiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3481:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3482:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3482:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3483:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3484:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3485:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_46914); 
             after(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__PropertiesAssignment_4


    // $ANTLR start rule__UniqueRule__PropertiesAssignment_5_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3496:1: rule__UniqueRule__PropertiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3500:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3501:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3501:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3502:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3503:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3504:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_5_16953); 
             after(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UniqueRule__PropertiesAssignment_5_1


    // $ANTLR start rule__Property__NullableAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3515:1: rule__Property__NullableAssignment_1 : ( ( 'nullable' ) ) ;
    public final void rule__Property__NullableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3519:1: ( ( ( 'nullable' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3520:1: ( ( 'nullable' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3520:1: ( ( 'nullable' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3521:1: ( 'nullable' )
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3522:1: ( 'nullable' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3523:1: 'nullable'
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Property__NullableAssignment_16993); 
             after(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 

            }

             after(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NullableAssignment_1


    // $ANTLR start rule__Property__DerivedAssignment_2_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3538:1: rule__Property__DerivedAssignment_2_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3542:1: ( ( ( 'derived' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3543:1: ( ( 'derived' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3543:1: ( ( 'derived' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3544:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3545:1: ( 'derived' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3546:1: 'derived'
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Property__DerivedAssignment_2_07037); 
             after(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 

            }

             after(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DerivedAssignment_2_0


    // $ANTLR start rule__Property__WritableAssignment_2_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3561:1: rule__Property__WritableAssignment_2_1 : ( ( 'writable' ) ) ;
    public final void rule__Property__WritableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3565:1: ( ( ( 'writable' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3566:1: ( ( 'writable' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3566:1: ( ( 'writable' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3567:1: ( 'writable' )
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3568:1: ( 'writable' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3569:1: 'writable'
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Property__WritableAssignment_2_17081); 
             after(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 

            }

             after(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__WritableAssignment_2_1


    // $ANTLR start rule__BoolProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3584:1: rule__BoolProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BoolProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3588:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3589:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3589:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3590:1: RULE_STRING
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BoolProperty__DescriptionAssignment_07120); 
             after(grammarAccess.getBoolPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__DescriptionAssignment_0


    // $ANTLR start rule__BoolProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3599:1: rule__BoolProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__BoolProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3603:1: ( ( ( 'boolean' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3604:1: ( ( 'boolean' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3604:1: ( ( 'boolean' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3605:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3606:1: ( 'boolean' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3607:1: 'boolean'
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__BoolProperty__DataTypeAssignment_17156); 
             after(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 

            }

             after(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__DataTypeAssignment_1


    // $ANTLR start rule__BoolProperty__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3622:1: rule__BoolProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BoolProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3626:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3627:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3627:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3628:1: RULE_ID
            {
             before(grammarAccess.getBoolPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolProperty__NameAssignment_27195); 
             after(grammarAccess.getBoolPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__NameAssignment_2


    // $ANTLR start rule__BoolProperty__HasDefaultAssignment_3_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3637:1: rule__BoolProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__BoolProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3641:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3642:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3642:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3643:1: ( 'default' )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3644:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3645:1: 'default'
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,40,FOLLOW_40_in_rule__BoolProperty__HasDefaultAssignment_3_07231); 
             after(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__BoolProperty__DefaultValueAssignment_3_1_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3660:1: rule__BoolProperty__DefaultValueAssignment_3_1_0 : ( ( 'true' ) ) ;
    public final void rule__BoolProperty__DefaultValueAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3664:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3665:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3665:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3666:1: ( 'true' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3667:1: ( 'true' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3668:1: 'true'
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            match(input,41,FOLLOW_41_in_rule__BoolProperty__DefaultValueAssignment_3_1_07275); 
             after(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolProperty__DefaultValueAssignment_3_1_0


    // $ANTLR start rule__StringProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3683:1: rule__StringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3687:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3688:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3688:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3689:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__DescriptionAssignment_07314); 
             after(grammarAccess.getStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__DescriptionAssignment_0


    // $ANTLR start rule__StringProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3698:1: rule__StringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__StringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3702:1: ( ( ( 'string' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3703:1: ( ( 'string' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3703:1: ( ( 'string' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3704:1: ( 'string' )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3705:1: ( 'string' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3706:1: 'string'
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__StringProperty__DataTypeAssignment_17350); 
             after(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 

            }

             after(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__DataTypeAssignment_1


    // $ANTLR start rule__StringProperty__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3721:1: rule__StringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3725:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3726:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3726:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3727:1: RULE_ID
            {
             before(grammarAccess.getStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringProperty__NameAssignment_27389); 
             after(grammarAccess.getStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__NameAssignment_2


    // $ANTLR start rule__StringProperty__HasDefaultAssignment_3_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3736:1: rule__StringProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__StringProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3740:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3741:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3741:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3742:1: ( 'default' )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3743:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3744:1: 'default'
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,40,FOLLOW_40_in_rule__StringProperty__HasDefaultAssignment_3_07425); 
             after(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__StringProperty__DefaultValueAssignment_3_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3759:1: rule__StringProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3763:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3764:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3764:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3765:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__DefaultValueAssignment_3_17464); 
             after(grammarAccess.getStringPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__DefaultValueAssignment_3_1


    // $ANTLR start rule__StringProperty__MinLengthAssignment_4_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3774:1: rule__StringProperty__MinLengthAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MinLengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3778:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3779:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3779:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3780:1: RULE_INT
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringProperty__MinLengthAssignment_4_17495); 
             after(grammarAccess.getStringPropertyAccess().getMinLengthINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__MinLengthAssignment_4_1


    // $ANTLR start rule__StringProperty__MaxLengthAssignment_5_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3789:1: rule__StringProperty__MaxLengthAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MaxLengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3793:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3794:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3794:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3795:1: RULE_INT
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringProperty__MaxLengthAssignment_5_17526); 
             after(grammarAccess.getStringPropertyAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__MaxLengthAssignment_5_1


    // $ANTLR start rule__StringProperty__RegularExpressionAssignment_6_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3804:1: rule__StringProperty__RegularExpressionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__RegularExpressionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3808:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3809:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3809:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3810:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__RegularExpressionAssignment_6_17557); 
             after(grammarAccess.getStringPropertyAccess().getRegularExpressionSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringProperty__RegularExpressionAssignment_6_1


    // $ANTLR start rule__DateTimeProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3819:1: rule__DateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3823:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3824:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3824:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3825:1: RULE_STRING
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DescriptionAssignment_07588); 
             after(grammarAccess.getDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__DescriptionAssignment_0


    // $ANTLR start rule__DateTimeProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3834:1: rule__DateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3838:1: ( ( ( 'datetime' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3839:1: ( ( 'datetime' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3839:1: ( ( 'datetime' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3840:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3841:1: ( 'datetime' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3842:1: 'datetime'
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__DateTimeProperty__DataTypeAssignment_17624); 
             after(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 

            }

             after(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__DataTypeAssignment_1


    // $ANTLR start rule__DateTimeProperty__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3857:1: rule__DateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3861:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3862:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3862:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3863:1: RULE_ID
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateTimeProperty__NameAssignment_27663); 
             after(grammarAccess.getDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__NameAssignment_2


    // $ANTLR start rule__DateTimeProperty__HasDefaultAssignment_3_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3872:1: rule__DateTimeProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3876:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3877:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3877:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3878:1: ( 'default' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3879:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3880:1: 'default'
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,40,FOLLOW_40_in_rule__DateTimeProperty__HasDefaultAssignment_3_07699); 
             after(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__DateTimeProperty__DefaultValueAssignment_3_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3895:1: rule__DateTimeProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3899:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3900:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3900:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3901:1: RULE_STRING
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DefaultValueAssignment_3_17738); 
             after(grammarAccess.getDateTimePropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DateTimeProperty__DefaultValueAssignment_3_1


    // $ANTLR start rule__IntegerProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3910:1: rule__IntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__IntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3914:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3915:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3915:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3916:1: RULE_STRING
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IntegerProperty__DescriptionAssignment_07769); 
             after(grammarAccess.getIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__DescriptionAssignment_0


    // $ANTLR start rule__IntegerProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3925:1: rule__IntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__IntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3929:1: ( ( ( 'integer' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3930:1: ( ( 'integer' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3930:1: ( ( 'integer' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3931:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3932:1: ( 'integer' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3933:1: 'integer'
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__IntegerProperty__DataTypeAssignment_17805); 
             after(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 

            }

             after(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__DataTypeAssignment_1


    // $ANTLR start rule__IntegerProperty__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3948:1: rule__IntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3952:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3953:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3953:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3954:1: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerProperty__NameAssignment_27844); 
             after(grammarAccess.getIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__NameAssignment_2


    // $ANTLR start rule__IntegerProperty__HasDefaultAssignment_3_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3963:1: rule__IntegerProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__IntegerProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3967:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3968:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3968:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3969:1: ( 'default' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3970:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3971:1: 'default'
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,40,FOLLOW_40_in_rule__IntegerProperty__HasDefaultAssignment_3_07880); 
             after(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__IntegerProperty__DefaultValueAssignment_3_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3986:1: rule__IntegerProperty__DefaultValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3990:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3991:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3991:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3992:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__DefaultValueAssignment_3_17919); 
             after(grammarAccess.getIntegerPropertyAccess().getDefaultValueINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__DefaultValueAssignment_3_1


    // $ANTLR start rule__IntegerProperty__MinValueAssignment_4_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4001:1: rule__IntegerProperty__MinValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MinValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4005:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4006:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4006:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4007:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__MinValueAssignment_4_17950); 
             after(grammarAccess.getIntegerPropertyAccess().getMinValueINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__MinValueAssignment_4_1


    // $ANTLR start rule__IntegerProperty__MaxValueAssignment_5_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4016:1: rule__IntegerProperty__MaxValueAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MaxValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4020:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4021:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4021:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4022:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__MaxValueAssignment_5_17981); 
             after(grammarAccess.getIntegerPropertyAccess().getMaxValueINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerProperty__MaxValueAssignment_5_1


    // $ANTLR start rule__DecimalProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4031:1: rule__DecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4035:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4036:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4036:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4037:1: RULE_STRING
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecimalProperty__DescriptionAssignment_08012); 
             after(grammarAccess.getDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__DescriptionAssignment_0


    // $ANTLR start rule__DecimalProperty__DataTypeAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4046:1: rule__DecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4050:1: ( ( ( 'decimal' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4051:1: ( ( 'decimal' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4051:1: ( ( 'decimal' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4052:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4053:1: ( 'decimal' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4054:1: 'decimal'
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__DecimalProperty__DataTypeAssignment_18048); 
             after(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 

            }

             after(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__DataTypeAssignment_1


    // $ANTLR start rule__DecimalProperty__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4069:1: rule__DecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4073:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4074:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4074:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4075:1: RULE_ID
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecimalProperty__NameAssignment_28087); 
             after(grammarAccess.getDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalProperty__NameAssignment_2


    // $ANTLR start rule__EnumerationProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4084:1: rule__EnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4088:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4089:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4089:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4090:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationProperty__DescriptionAssignment_08118); 
             after(grammarAccess.getEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__DescriptionAssignment_0


    // $ANTLR start rule__EnumerationProperty__TypeAssignment_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4099:1: rule__EnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4103:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4104:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4104:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4105:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4106:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4107:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__TypeAssignment_18153); 
             after(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__TypeAssignment_1


    // $ANTLR start rule__EnumerationProperty__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4118:1: rule__EnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4122:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4123:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4123:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4124:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__NameAssignment_28188); 
             after(grammarAccess.getEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__NameAssignment_2


    // $ANTLR start rule__EnumerationProperty__HasDefaultAssignment_3_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4133:1: rule__EnumerationProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4137:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4138:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4138:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4139:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4140:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4141:1: 'default'
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,40,FOLLOW_40_in_rule__EnumerationProperty__HasDefaultAssignment_3_08224); 
             after(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__HasDefaultAssignment_3_0


    // $ANTLR start rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4156:1: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4160:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4161:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4161:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4162:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_18263); 
             after(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1


 

    public static final BitSet FOLLOW_ruleBusinessDomainModel_in_entryRuleBusinessDomainModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessDomainModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__0_in_ruleBusinessDomainModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassReference_in_entryRuleBusinessClassReference120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClassReference127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassReference__Group__0_in_ruleBusinessClassReference154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClass247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__0_in_ruleBusinessClass274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBusinessRule427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractBusinessRule__Alternatives_in_ruleAbstractBusinessRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueRule547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__0_in_ruleUniqueRule574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolProperty667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__0_in_ruleBoolProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_entryRuleStringProperty720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringProperty727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__0_in_ruleStringProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeProperty787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__0_in_ruleDateTimeProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerProperty847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__0_in_ruleIntegerProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalProperty907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__0_in_ruleDecimalProperty934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationProperty967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__0_in_ruleEnumerationProperty994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Alternatives_in_ruleMultiplicity1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__TypesAssignment_5_0_in_rule__BusinessDomainModel__Alternatives_51070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__EnumerationsAssignment_5_1_in_rule__BusinessDomainModel__Alternatives_51088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__AssociationsAssignment_5_2_in_rule__BusinessDomainModel__Alternatives_51106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__BidirectionalAssignment_5_0_in_rule__Association__Alternatives_51139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Association__Alternatives_51158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_rule__AbstractBusinessRule__Alternatives1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_rule__AbstractBusinessRule__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_rule__Property__Alternatives_01241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_rule__Property__Alternatives_01258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_rule__Property__Alternatives_01275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_rule__Property__Alternatives_01292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_rule__Property__Alternatives_01309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_rule__Property__Alternatives_01326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DefaultValueAssignment_3_1_0_in_rule__BoolProperty__Alternatives_3_11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BoolProperty__Alternatives_3_11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Multiplicity__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Multiplicity__Alternatives1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__DescriptionAssignment_0_in_rule__BusinessDomainModel__Group__01472 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__1_in_rule__BusinessDomainModel__Group__01482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessDomainModel__Group__11511 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__2_in_rule__BusinessDomainModel__Group__11521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__NameAssignment_2_in_rule__BusinessDomainModel__Group__21549 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__3_in_rule__BusinessDomainModel__Group__21558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessDomainModel__Group__31587 = new BitSet(new long[]{0x00000000021A0012L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__4_in_rule__BusinessDomainModel__Group__31597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__TypesAssignment_4_in_rule__BusinessDomainModel__Group__41625 = new BitSet(new long[]{0x00000000021A0012L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__5_in_rule__BusinessDomainModel__Group__41635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Alternatives_5_in_rule__BusinessDomainModel__Group__51663 = new BitSet(new long[]{0x0000000002180012L});
    public static final BitSet FOLLOW_17_in_rule__BusinessClassReference__Group__01711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassReference__Group__1_in_rule__BusinessClassReference__Group__01721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassReference__ReferredModelAssignment_1_in_rule__BusinessClassReference__Group__11749 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BusinessClassReference__Group__2_in_rule__BusinessClassReference__Group__11758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BusinessClassReference__Group__21787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClassReference__Group__3_in_rule__BusinessClassReference__Group__21797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClassReference__NameAssignment_3_in_rule__BusinessClassReference__Group__31825 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessClassReference__Group__4_in_rule__BusinessClassReference__Group__31834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessClassReference__Group__41863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__DescriptionAssignment_0_in_rule__Association__Group__01908 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Association__Group__11947 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_2_in_rule__Association__Group__21985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__21994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceRoleNameAssignment_3_in_rule__Association__Group__32022 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__32031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceMultiplicityAssignment_4_in_rule__Association__Group__42059 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_rule__Association__Group__5_in_rule__Association__Group__42068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Alternatives_5_in_rule__Association__Group__52096 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Association__Group__6_in_rule__Association__Group__52105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetMultiplicityAssignment_6_in_rule__Association__Group__62133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__7_in_rule__Association__Group__62142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_7_in_rule__Association__Group__72170 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__8_in_rule__Association__Group__72179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetRoleNameAssignment_8_in_rule__Association__Group__82207 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__Association__Group__9_in_rule__Association__Group__82216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__OrderedAssignment_9_in_rule__Association__Group__92244 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Association__Group__10_in_rule__Association__Group__92254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Association__Group__102283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__DescriptionAssignment_0_in_rule__BusinessClass__Group__02340 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__1_in_rule__BusinessClass__Group__02350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BusinessClass__Group__12379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__2_in_rule__BusinessClass__Group__12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__NameAssignment_2_in_rule__BusinessClass__Group__22417 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__3_in_rule__BusinessClass__Group__22426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_3__0_in_rule__BusinessClass__Group__32454 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__4_in_rule__BusinessClass__Group__32464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessClass__Group__42493 = new BitSet(new long[]{0x00003C8001400030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__5_in_rule__BusinessClass__Group__42503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__PropertiesAssignment_5_in_rule__BusinessClass__Group__52531 = new BitSet(new long[]{0x00003C8001400030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__6_in_rule__BusinessClass__Group__52541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_6__0_in_rule__BusinessClass__Group__62569 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__7_in_rule__BusinessClass__Group__62579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessClass__Group__72608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BusinessClass__Group_3__02660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_3__1_in_rule__BusinessClass__Group_3__02670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__SuperclassAssignment_3_1_in_rule__BusinessClass__Group_3__12698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BusinessClass__Group_6__02737 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_6__1_in_rule__BusinessClass__Group_6__02747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessClass__Group_6__12776 = new BitSet(new long[]{0x0000000008400030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_6__2_in_rule__BusinessClass__Group_6__12786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__BusinessRulesAssignment_6_2_in_rule__BusinessClass__Group_6__22814 = new BitSet(new long[]{0x0000000008400030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_6__3_in_rule__BusinessClass__Group_6__22824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessClass__Group_6__32853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__DescriptionAssignment_0_in_rule__Enumeration__Group__02896 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__02906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Enumeration__Group__12935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__12945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__22973 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__22982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Enumeration__Group__33011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43051 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43063 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Enumeration__Group__53104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__03151 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__03160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__13188 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__13197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumerationLiteral__Group__23226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumerationLiteral__Group_1__03268 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__03278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__13306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__DescriptionAssignment_0_in_rule__BusinessRule__Group__03344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__13382 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessRule__Group__23420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__DescriptionAssignment_0_in_rule__UniqueRule__Group__03461 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__1_in_rule__UniqueRule__Group__03471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UniqueRule__Group__13500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__2_in_rule__UniqueRule__Group__13510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__NameAssignment_2_in_rule__UniqueRule__Group__23538 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__3_in_rule__UniqueRule__Group__23547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UniqueRule__Group__33576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__4_in_rule__UniqueRule__Group__33586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__PropertiesAssignment_4_in_rule__UniqueRule__Group__43614 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__5_in_rule__UniqueRule__Group__43623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group_5__0_in_rule__UniqueRule__Group__53651 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__6_in_rule__UniqueRule__Group__53661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UniqueRule__Group__63690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UniqueRule__Group_5__03740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group_5__1_in_rule__UniqueRule__Group_5__03750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__PropertiesAssignment_5_1_in_rule__UniqueRule__Group_5__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__03816 = new BitSet(new long[]{0x0000003000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NullableAssignment_1_in_rule__Property__Group__13853 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__23891 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__23901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Property__Group__33930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DerivedAssignment_2_0_in_rule__Property__Group_2__03973 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__03982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__WritableAssignment_2_1_in_rule__Property__Group_2__14010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DescriptionAssignment_0_in_rule__BoolProperty__Group__04049 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__1_in_rule__BoolProperty__Group__04059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DataTypeAssignment_1_in_rule__BoolProperty__Group__14087 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__2_in_rule__BoolProperty__Group__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__NameAssignment_2_in_rule__BoolProperty__Group__24124 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__3_in_rule__BoolProperty__Group__24133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group_3__0_in_rule__BoolProperty__Group__34161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__HasDefaultAssignment_3_0_in_rule__BoolProperty__Group_3__04204 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group_3__1_in_rule__BoolProperty__Group_3__04213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Alternatives_3_1_in_rule__BoolProperty__Group_3__14241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DescriptionAssignment_0_in_rule__StringProperty__Group__04279 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__1_in_rule__StringProperty__Group__04289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DataTypeAssignment_1_in_rule__StringProperty__Group__14317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__2_in_rule__StringProperty__Group__14326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__NameAssignment_2_in_rule__StringProperty__Group__24354 = new BitSet(new long[]{0x00000100E0000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__3_in_rule__StringProperty__Group__24363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_3__0_in_rule__StringProperty__Group__34391 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__4_in_rule__StringProperty__Group__34401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_4__0_in_rule__StringProperty__Group__44429 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__5_in_rule__StringProperty__Group__44439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_5__0_in_rule__StringProperty__Group__54467 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__6_in_rule__StringProperty__Group__54477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_6__0_in_rule__StringProperty__Group__64505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__HasDefaultAssignment_3_0_in_rule__StringProperty__Group_3__04554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_3__1_in_rule__StringProperty__Group_3__04563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DefaultValueAssignment_3_1_in_rule__StringProperty__Group_3__14591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StringProperty__Group_4__04630 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_4__1_in_rule__StringProperty__Group_4__04640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__MinLengthAssignment_4_1_in_rule__StringProperty__Group_4__14668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StringProperty__Group_5__04707 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_5__1_in_rule__StringProperty__Group_5__04717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__MaxLengthAssignment_5_1_in_rule__StringProperty__Group_5__14745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StringProperty__Group_6__04784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_6__1_in_rule__StringProperty__Group_6__04794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__RegularExpressionAssignment_6_1_in_rule__StringProperty__Group_6__14822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DescriptionAssignment_0_in_rule__DateTimeProperty__Group__04860 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__1_in_rule__DateTimeProperty__Group__04870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DataTypeAssignment_1_in_rule__DateTimeProperty__Group__14898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__2_in_rule__DateTimeProperty__Group__14907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__NameAssignment_2_in_rule__DateTimeProperty__Group__24935 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__3_in_rule__DateTimeProperty__Group__24944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group_3__0_in_rule__DateTimeProperty__Group__34972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__HasDefaultAssignment_3_0_in_rule__DateTimeProperty__Group_3__05015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group_3__1_in_rule__DateTimeProperty__Group_3__05024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DefaultValueAssignment_3_1_in_rule__DateTimeProperty__Group_3__15052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DescriptionAssignment_0_in_rule__IntegerProperty__Group__05090 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__1_in_rule__IntegerProperty__Group__05100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DataTypeAssignment_1_in_rule__IntegerProperty__Group__15128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__2_in_rule__IntegerProperty__Group__15137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__NameAssignment_2_in_rule__IntegerProperty__Group__25165 = new BitSet(new long[]{0x0000010300000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__3_in_rule__IntegerProperty__Group__25174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_3__0_in_rule__IntegerProperty__Group__35202 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__4_in_rule__IntegerProperty__Group__35212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_4__0_in_rule__IntegerProperty__Group__45240 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__5_in_rule__IntegerProperty__Group__45250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_5__0_in_rule__IntegerProperty__Group__55278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__HasDefaultAssignment_3_0_in_rule__IntegerProperty__Group_3__05325 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_3__1_in_rule__IntegerProperty__Group_3__05334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DefaultValueAssignment_3_1_in_rule__IntegerProperty__Group_3__15362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__IntegerProperty__Group_4__05401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_4__1_in_rule__IntegerProperty__Group_4__05411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__MinValueAssignment_4_1_in_rule__IntegerProperty__Group_4__15439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntegerProperty__Group_5__05478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_5__1_in_rule__IntegerProperty__Group_5__05488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__MaxValueAssignment_5_1_in_rule__IntegerProperty__Group_5__15516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__DescriptionAssignment_0_in_rule__DecimalProperty__Group__05554 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__1_in_rule__DecimalProperty__Group__05564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__DataTypeAssignment_1_in_rule__DecimalProperty__Group__15592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__2_in_rule__DecimalProperty__Group__15601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__NameAssignment_2_in_rule__DecimalProperty__Group__25629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__DescriptionAssignment_0_in_rule__EnumerationProperty__Group__05669 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__1_in_rule__EnumerationProperty__Group__05679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__TypeAssignment_1_in_rule__EnumerationProperty__Group__15707 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__2_in_rule__EnumerationProperty__Group__15716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__NameAssignment_2_in_rule__EnumerationProperty__Group__25744 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__3_in_rule__EnumerationProperty__Group__25753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group_3__0_in_rule__EnumerationProperty__Group__35781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__HasDefaultAssignment_3_0_in_rule__EnumerationProperty__Group_3__05824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group_3__1_in_rule__EnumerationProperty__Group_3__05833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationProperty__Group_3__15861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessDomainModel__DescriptionAssignment_05899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessDomainModel__NameAssignment_25930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClassReference_in_rule__BusinessDomainModel__TypesAssignment_45961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_rule__BusinessDomainModel__TypesAssignment_5_05992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__BusinessDomainModel__EnumerationsAssignment_5_16023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__BusinessDomainModel__AssociationsAssignment_5_26054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassReference__ReferredModelAssignment_16085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClassReference__NameAssignment_36116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__DescriptionAssignment_06147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_26182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceRoleNameAssignment_36217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Association__SourceMultiplicityAssignment_46248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Association__BidirectionalAssignment_5_06284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Association__TargetMultiplicityAssignment_66323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_76358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetRoleNameAssignment_86393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Association__OrderedAssignment_96429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessClass__DescriptionAssignment_06468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__NameAssignment_26499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__SuperclassAssignment_3_16534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__BusinessClass__PropertiesAssignment_56569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_rule__BusinessClass__BusinessRulesAssignment_6_26600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enumeration__DescriptionAssignment_06631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_26662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_46693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_06724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_16755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessRule__DescriptionAssignment_06786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_16817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UniqueRule__DescriptionAssignment_06848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__NameAssignment_26879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_46914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_5_16953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Property__NullableAssignment_16993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Property__DerivedAssignment_2_07037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Property__WritableAssignment_2_17081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BoolProperty__DescriptionAssignment_07120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__BoolProperty__DataTypeAssignment_17156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolProperty__NameAssignment_27195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__BoolProperty__HasDefaultAssignment_3_07231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BoolProperty__DefaultValueAssignment_3_1_07275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__DescriptionAssignment_07314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StringProperty__DataTypeAssignment_17350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringProperty__NameAssignment_27389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__StringProperty__HasDefaultAssignment_3_07425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__DefaultValueAssignment_3_17464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringProperty__MinLengthAssignment_4_17495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringProperty__MaxLengthAssignment_5_17526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__RegularExpressionAssignment_6_17557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DescriptionAssignment_07588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DateTimeProperty__DataTypeAssignment_17624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateTimeProperty__NameAssignment_27663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DateTimeProperty__HasDefaultAssignment_3_07699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DefaultValueAssignment_3_17738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IntegerProperty__DescriptionAssignment_07769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__IntegerProperty__DataTypeAssignment_17805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerProperty__NameAssignment_27844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__IntegerProperty__HasDefaultAssignment_3_07880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__DefaultValueAssignment_3_17919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__MinValueAssignment_4_17950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__MaxValueAssignment_5_17981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecimalProperty__DescriptionAssignment_08012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__DecimalProperty__DataTypeAssignment_18048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecimalProperty__NameAssignment_28087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationProperty__DescriptionAssignment_08118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__TypeAssignment_18153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__NameAssignment_28188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EnumerationProperty__HasDefaultAssignment_3_08224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_18263 = new BitSet(new long[]{0x0000000000000002L});

}