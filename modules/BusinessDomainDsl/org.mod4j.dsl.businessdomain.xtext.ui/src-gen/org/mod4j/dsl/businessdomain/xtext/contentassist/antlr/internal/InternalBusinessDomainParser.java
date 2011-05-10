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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'false'", "'many'", "'one'", "'domain'", "';'", "'association'", "'foreign key'", "'table'", "'column'", "'class'", "'['", "']'", "'inherits'", "'rules'", "'enumeration'", "'='", "'unique'", "','", "'minlength'", "'maxlength'", "'regexp'", "'min'", "'max'", "'<->'", "'ordered'", "'nullable'", "'derived'", "'writable'", "'boolean'", "'default'", "'true'", "'string'", "'datetime'", "'integer'", "'decimal'"
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


    // $ANTLR start entryRuleAssociation
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:87:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:87:22: ( ruleAssociation EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:88:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation120);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation127); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:95:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:99:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:100:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:100:1: ( ( rule__Association__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:101:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:102:1: ( rule__Association__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:102:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation154);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:114:1: entryRuleBusinessClass : ruleBusinessClass EOF ;
    public final void entryRuleBusinessClass() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:114:24: ( ruleBusinessClass EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:115:1: ruleBusinessClass EOF
            {
             before(grammarAccess.getBusinessClassRule()); 
            pushFollow(FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass180);
            ruleBusinessClass();
            _fsp--;

             after(grammarAccess.getBusinessClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessClass187); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:122:1: ruleBusinessClass : ( ( rule__BusinessClass__Group__0 ) ) ;
    public final void ruleBusinessClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:126:2: ( ( ( rule__BusinessClass__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:127:1: ( ( rule__BusinessClass__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:127:1: ( ( rule__BusinessClass__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:128:1: ( rule__BusinessClass__Group__0 )
            {
             before(grammarAccess.getBusinessClassAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:129:1: ( rule__BusinessClass__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:129:2: rule__BusinessClass__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessClass__Group__0_in_ruleBusinessClass214);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:141:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:141:22: ( ruleEnumeration EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:142:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration240);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration247); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:149:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:153:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:154:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:154:1: ( ( rule__Enumeration__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:155:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:156:1: ( rule__Enumeration__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:156:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration274);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:168:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:168:29: ( ruleEnumerationLiteral EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:169:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral300);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral307); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:176:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:180:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:181:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:181:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:182:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:183:1: ( rule__EnumerationLiteral__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:183:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral334);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:195:1: entryRuleAbstractBusinessRule : ruleAbstractBusinessRule EOF ;
    public final void entryRuleAbstractBusinessRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:195:31: ( ruleAbstractBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:196:1: ruleAbstractBusinessRule EOF
            {
             before(grammarAccess.getAbstractBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule360);
            ruleAbstractBusinessRule();
            _fsp--;

             after(grammarAccess.getAbstractBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBusinessRule367); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:203:1: ruleAbstractBusinessRule : ( ( rule__AbstractBusinessRule__Alternatives ) ) ;
    public final void ruleAbstractBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:207:2: ( ( ( rule__AbstractBusinessRule__Alternatives ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:208:1: ( ( rule__AbstractBusinessRule__Alternatives ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:208:1: ( ( rule__AbstractBusinessRule__Alternatives ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:209:1: ( rule__AbstractBusinessRule__Alternatives )
            {
             before(grammarAccess.getAbstractBusinessRuleAccess().getAlternatives()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:210:1: ( rule__AbstractBusinessRule__Alternatives )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:210:2: rule__AbstractBusinessRule__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractBusinessRule__Alternatives_in_ruleAbstractBusinessRule394);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:222:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:222:23: ( ruleBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:223:1: ruleBusinessRule EOF
            {
             before(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule420);
            ruleBusinessRule();
            _fsp--;

             after(grammarAccess.getBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule427); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:230:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:234:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:235:1: ( ( rule__BusinessRule__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:235:1: ( ( rule__BusinessRule__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:236:1: ( rule__BusinessRule__Group__0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:237:1: ( rule__BusinessRule__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:237:2: rule__BusinessRule__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule454);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:249:1: entryRuleUniqueRule : ruleUniqueRule EOF ;
    public final void entryRuleUniqueRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:249:21: ( ruleUniqueRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:250:1: ruleUniqueRule EOF
            {
             before(grammarAccess.getUniqueRuleRule()); 
            pushFollow(FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule480);
            ruleUniqueRule();
            _fsp--;

             after(grammarAccess.getUniqueRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueRule487); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:257:1: ruleUniqueRule : ( ( rule__UniqueRule__Group__0 ) ) ;
    public final void ruleUniqueRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:261:2: ( ( ( rule__UniqueRule__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:262:1: ( ( rule__UniqueRule__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:262:1: ( ( rule__UniqueRule__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:263:1: ( rule__UniqueRule__Group__0 )
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:264:1: ( rule__UniqueRule__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:264:2: rule__UniqueRule__Group__0
            {
            pushFollow(FOLLOW_rule__UniqueRule__Group__0_in_ruleUniqueRule514);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:276:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:276:19: ( ruleProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:277:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty540);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty547); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:284:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:288:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:289:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:289:1: ( ( rule__Property__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:290:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:291:1: ( rule__Property__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:291:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty574);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:303:1: entryRuleBoolProperty : ruleBoolProperty EOF ;
    public final void entryRuleBoolProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:303:23: ( ruleBoolProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:304:1: ruleBoolProperty EOF
            {
             before(grammarAccess.getBoolPropertyRule()); 
            pushFollow(FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty600);
            ruleBoolProperty();
            _fsp--;

             after(grammarAccess.getBoolPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolProperty607); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:311:1: ruleBoolProperty : ( ( rule__BoolProperty__Group__0 ) ) ;
    public final void ruleBoolProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:315:2: ( ( ( rule__BoolProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:316:1: ( ( rule__BoolProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:316:1: ( ( rule__BoolProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:317:1: ( rule__BoolProperty__Group__0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:318:1: ( rule__BoolProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:318:2: rule__BoolProperty__Group__0
            {
            pushFollow(FOLLOW_rule__BoolProperty__Group__0_in_ruleBoolProperty634);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:330:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:330:25: ( ruleStringProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:331:1: ruleStringProperty EOF
            {
             before(grammarAccess.getStringPropertyRule()); 
            pushFollow(FOLLOW_ruleStringProperty_in_entryRuleStringProperty660);
            ruleStringProperty();
            _fsp--;

             after(grammarAccess.getStringPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringProperty667); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:338:1: ruleStringProperty : ( ( rule__StringProperty__Group__0 ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:342:2: ( ( ( rule__StringProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:343:1: ( ( rule__StringProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:343:1: ( ( rule__StringProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:344:1: ( rule__StringProperty__Group__0 )
            {
             before(grammarAccess.getStringPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:345:1: ( rule__StringProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:345:2: rule__StringProperty__Group__0
            {
            pushFollow(FOLLOW_rule__StringProperty__Group__0_in_ruleStringProperty694);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:357:1: entryRuleDateTimeProperty : ruleDateTimeProperty EOF ;
    public final void entryRuleDateTimeProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:357:27: ( ruleDateTimeProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:358:1: ruleDateTimeProperty EOF
            {
             before(grammarAccess.getDateTimePropertyRule()); 
            pushFollow(FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty720);
            ruleDateTimeProperty();
            _fsp--;

             after(grammarAccess.getDateTimePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeProperty727); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:365:1: ruleDateTimeProperty : ( ( rule__DateTimeProperty__Group__0 ) ) ;
    public final void ruleDateTimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:369:2: ( ( ( rule__DateTimeProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:370:1: ( ( rule__DateTimeProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:370:1: ( ( rule__DateTimeProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:371:1: ( rule__DateTimeProperty__Group__0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:372:1: ( rule__DateTimeProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:372:2: rule__DateTimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__Group__0_in_ruleDateTimeProperty754);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:384:1: entryRuleIntegerProperty : ruleIntegerProperty EOF ;
    public final void entryRuleIntegerProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:384:26: ( ruleIntegerProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:385:1: ruleIntegerProperty EOF
            {
             before(grammarAccess.getIntegerPropertyRule()); 
            pushFollow(FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty780);
            ruleIntegerProperty();
            _fsp--;

             after(grammarAccess.getIntegerPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerProperty787); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:392:1: ruleIntegerProperty : ( ( rule__IntegerProperty__Group__0 ) ) ;
    public final void ruleIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:396:2: ( ( ( rule__IntegerProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:397:1: ( ( rule__IntegerProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:397:1: ( ( rule__IntegerProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:398:1: ( rule__IntegerProperty__Group__0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:399:1: ( rule__IntegerProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:399:2: rule__IntegerProperty__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerProperty__Group__0_in_ruleIntegerProperty814);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:411:1: entryRuleDecimalProperty : ruleDecimalProperty EOF ;
    public final void entryRuleDecimalProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:411:26: ( ruleDecimalProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:412:1: ruleDecimalProperty EOF
            {
             before(grammarAccess.getDecimalPropertyRule()); 
            pushFollow(FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty840);
            ruleDecimalProperty();
            _fsp--;

             after(grammarAccess.getDecimalPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalProperty847); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:419:1: ruleDecimalProperty : ( ( rule__DecimalProperty__Group__0 ) ) ;
    public final void ruleDecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:423:2: ( ( ( rule__DecimalProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:424:1: ( ( rule__DecimalProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:424:1: ( ( rule__DecimalProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:425:1: ( rule__DecimalProperty__Group__0 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:426:1: ( rule__DecimalProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:426:2: rule__DecimalProperty__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalProperty__Group__0_in_ruleDecimalProperty874);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:438:1: entryRuleEnumerationProperty : ruleEnumerationProperty EOF ;
    public final void entryRuleEnumerationProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:438:30: ( ruleEnumerationProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:439:1: ruleEnumerationProperty EOF
            {
             before(grammarAccess.getEnumerationPropertyRule()); 
            pushFollow(FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty900);
            ruleEnumerationProperty();
            _fsp--;

             after(grammarAccess.getEnumerationPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationProperty907); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:446:1: ruleEnumerationProperty : ( ( rule__EnumerationProperty__Group__0 ) ) ;
    public final void ruleEnumerationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:450:2: ( ( ( rule__EnumerationProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:451:1: ( ( rule__EnumerationProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:451:1: ( ( rule__EnumerationProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:452:1: ( rule__EnumerationProperty__Group__0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:453:1: ( rule__EnumerationProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:453:2: rule__EnumerationProperty__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__Group__0_in_ruleEnumerationProperty934);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:466:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:470:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:471:1: ( ( rule__Multiplicity__Alternatives ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:471:1: ( ( rule__Multiplicity__Alternatives ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:472:1: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:473:1: ( rule__Multiplicity__Alternatives )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:473:2: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicity__Alternatives_in_ruleMultiplicity971);
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


    // $ANTLR start rule__BusinessDomainModel__Alternatives_4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:488:1: rule__BusinessDomainModel__Alternatives_4 : ( ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) ) );
    public final void rule__BusinessDomainModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:492:1: ( ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 17:
                    {
                    alt1=3;
                    }
                    break;
                case 21:
                    {
                    alt1=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("488:1: rule__BusinessDomainModel__Alternatives_4 : ( ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) ) );", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 21:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("488:1: rule__BusinessDomainModel__Alternatives_4 : ( ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:493:1: ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:493:1: ( ( rule__BusinessDomainModel__TypesAssignment_4_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:494:1: ( rule__BusinessDomainModel__TypesAssignment_4_0 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_4_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:495:1: ( rule__BusinessDomainModel__TypesAssignment_4_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:495:2: rule__BusinessDomainModel__TypesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__TypesAssignment_4_0_in_rule__BusinessDomainModel__Alternatives_41010);
                    rule__BusinessDomainModel__TypesAssignment_4_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:499:6: ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:499:6: ( ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:500:1: ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getEnumerationsAssignment_4_1()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:501:1: ( rule__BusinessDomainModel__EnumerationsAssignment_4_1 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:501:2: rule__BusinessDomainModel__EnumerationsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__EnumerationsAssignment_4_1_in_rule__BusinessDomainModel__Alternatives_41028);
                    rule__BusinessDomainModel__EnumerationsAssignment_4_1();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getEnumerationsAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:505:6: ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:505:6: ( ( rule__BusinessDomainModel__AssociationsAssignment_4_2 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:506:1: ( rule__BusinessDomainModel__AssociationsAssignment_4_2 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssignment_4_2()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:507:1: ( rule__BusinessDomainModel__AssociationsAssignment_4_2 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:507:2: rule__BusinessDomainModel__AssociationsAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__AssociationsAssignment_4_2_in_rule__BusinessDomainModel__Alternatives_41046);
                    rule__BusinessDomainModel__AssociationsAssignment_4_2();
                    _fsp--;


                    }

                     after(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssignment_4_2()); 

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
    // $ANTLR end rule__BusinessDomainModel__Alternatives_4


    // $ANTLR start rule__Association__Alternatives_6
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:516:1: rule__Association__Alternatives_6 : ( ( ( rule__Association__BidirectionalAssignment_6_0 ) ) | ( '->' ) );
    public final void rule__Association__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:520:1: ( ( ( rule__Association__BidirectionalAssignment_6_0 ) ) | ( '->' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("516:1: rule__Association__Alternatives_6 : ( ( ( rule__Association__BidirectionalAssignment_6_0 ) ) | ( '->' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:1: ( ( rule__Association__BidirectionalAssignment_6_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:1: ( ( rule__Association__BidirectionalAssignment_6_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:522:1: ( rule__Association__BidirectionalAssignment_6_0 )
                    {
                     before(grammarAccess.getAssociationAccess().getBidirectionalAssignment_6_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:523:1: ( rule__Association__BidirectionalAssignment_6_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:523:2: rule__Association__BidirectionalAssignment_6_0
                    {
                    pushFollow(FOLLOW_rule__Association__BidirectionalAssignment_6_0_in_rule__Association__Alternatives_61079);
                    rule__Association__BidirectionalAssignment_6_0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getBidirectionalAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:6: ( '->' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:6: ( '->' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:528:1: '->'
                    {
                     before(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_6_1()); 
                    match(input,11,FOLLOW_11_in_rule__Association__Alternatives_61098); 
                     after(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_6_1()); 

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
    // $ANTLR end rule__Association__Alternatives_6


    // $ANTLR start rule__AbstractBusinessRule__Alternatives
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:540:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );
    public final void rule__AbstractBusinessRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:544:1: ( ( ruleBusinessRule ) | ( ruleUniqueRule ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==28) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("540:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("540:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:545:1: ( ruleBusinessRule )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:545:1: ( ruleBusinessRule )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:546:1: ruleBusinessRule
                    {
                     before(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBusinessRule_in_rule__AbstractBusinessRule__Alternatives1132);
                    ruleBusinessRule();
                    _fsp--;

                     after(grammarAccess.getAbstractBusinessRuleAccess().getBusinessRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:551:6: ( ruleUniqueRule )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:551:6: ( ruleUniqueRule )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:552:1: ruleUniqueRule
                    {
                     before(grammarAccess.getAbstractBusinessRuleAccess().getUniqueRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUniqueRule_in_rule__AbstractBusinessRule__Alternatives1149);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:562:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );
    public final void rule__Property__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:566:1: ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 44:
                    {
                    alt4=3;
                    }
                    break;
                case 43:
                    {
                    alt4=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt4=6;
                    }
                    break;
                case 46:
                    {
                    alt4=5;
                    }
                    break;
                case 40:
                    {
                    alt4=1;
                    }
                    break;
                case 45:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("562:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
            case 45:
                {
                alt4=4;
                }
                break;
            case 46:
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
                    new NoViableAltException("562:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:567:1: ( ruleBoolProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:567:1: ( ruleBoolProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:568:1: ruleBoolProperty
                    {
                     before(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleBoolProperty_in_rule__Property__Alternatives_01181);
                    ruleBoolProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:573:6: ( ruleStringProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:573:6: ( ruleStringProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:574:1: ruleStringProperty
                    {
                     before(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleStringProperty_in_rule__Property__Alternatives_01198);
                    ruleStringProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:579:6: ( ruleDateTimeProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:579:6: ( ruleDateTimeProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:580:1: ruleDateTimeProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleDateTimeProperty_in_rule__Property__Alternatives_01215);
                    ruleDateTimeProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getDateTimePropertyParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:585:6: ( ruleIntegerProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:585:6: ( ruleIntegerProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:586:1: ruleIntegerProperty
                    {
                     before(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleIntegerProperty_in_rule__Property__Alternatives_01232);
                    ruleIntegerProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:591:6: ( ruleDecimalProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:591:6: ( ruleDecimalProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:592:1: ruleDecimalProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleDecimalProperty_in_rule__Property__Alternatives_01249);
                    ruleDecimalProperty();
                    _fsp--;

                     after(grammarAccess.getPropertyAccess().getDecimalPropertyParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:597:6: ( ruleEnumerationProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:597:6: ( ruleEnumerationProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:598:1: ruleEnumerationProperty
                    {
                     before(grammarAccess.getPropertyAccess().getEnumerationPropertyParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleEnumerationProperty_in_rule__Property__Alternatives_01266);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:608:1: rule__BoolProperty__Alternatives_3_1 : ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) );
    public final void rule__BoolProperty__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:612:1: ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("608:1: rule__BoolProperty__Alternatives_3_1 : ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:613:1: ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:613:1: ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:614:1: ( rule__BoolProperty__DefaultValueAssignment_3_1_0 )
                    {
                     before(grammarAccess.getBoolPropertyAccess().getDefaultValueAssignment_3_1_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:615:1: ( rule__BoolProperty__DefaultValueAssignment_3_1_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:615:2: rule__BoolProperty__DefaultValueAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__DefaultValueAssignment_3_1_0_in_rule__BoolProperty__Alternatives_3_11298);
                    rule__BoolProperty__DefaultValueAssignment_3_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBoolPropertyAccess().getDefaultValueAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:619:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:619:6: ( 'false' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:620:1: 'false'
                    {
                     before(grammarAccess.getBoolPropertyAccess().getFalseKeyword_3_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__BoolProperty__Alternatives_3_11317); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:632:1: rule__Multiplicity__Alternatives : ( ( ( 'many' ) ) | ( ( 'one' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:636:1: ( ( ( 'many' ) ) | ( ( 'one' ) ) )
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
                    new NoViableAltException("632:1: rule__Multiplicity__Alternatives : ( ( ( 'many' ) ) | ( ( 'one' ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:637:1: ( ( 'many' ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:637:1: ( ( 'many' ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:638:1: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:639:1: ( 'many' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:639:3: 'many'
                    {
                    match(input,13,FOLLOW_13_in_rule__Multiplicity__Alternatives1352); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:644:6: ( ( 'one' ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:644:6: ( ( 'one' ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:645:1: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:646:1: ( 'one' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:646:3: 'one'
                    {
                    match(input,14,FOLLOW_14_in_rule__Multiplicity__Alternatives1373); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:660:1: rule__BusinessDomainModel__Group__0 : ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1 ;
    public final void rule__BusinessDomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:664:1: ( ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:665:1: ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:665:1: ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:666:1: ( rule__BusinessDomainModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:667:1: ( rule__BusinessDomainModel__DescriptionAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:667:2: rule__BusinessDomainModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessDomainModel__DescriptionAssignment_0_in_rule__BusinessDomainModel__Group__01412);
                    rule__BusinessDomainModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessDomainModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__1_in_rule__BusinessDomainModel__Group__01422);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:678:1: rule__BusinessDomainModel__Group__1 : ( 'domain' ) rule__BusinessDomainModel__Group__2 ;
    public final void rule__BusinessDomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:682:1: ( ( 'domain' ) rule__BusinessDomainModel__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:683:1: ( 'domain' ) rule__BusinessDomainModel__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:683:1: ( 'domain' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:684:1: 'domain'
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDomainKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__BusinessDomainModel__Group__11451); 
             after(grammarAccess.getBusinessDomainModelAccess().getDomainKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__2_in_rule__BusinessDomainModel__Group__11461);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:698:1: rule__BusinessDomainModel__Group__2 : ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3 ;
    public final void rule__BusinessDomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:702:1: ( ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:703:1: ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:703:1: ( ( rule__BusinessDomainModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:704:1: ( rule__BusinessDomainModel__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessDomainModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:705:1: ( rule__BusinessDomainModel__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:705:2: rule__BusinessDomainModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessDomainModel__NameAssignment_2_in_rule__BusinessDomainModel__Group__21489);
            rule__BusinessDomainModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessDomainModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__3_in_rule__BusinessDomainModel__Group__21498);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:716:1: rule__BusinessDomainModel__Group__3 : ( ';' ) rule__BusinessDomainModel__Group__4 ;
    public final void rule__BusinessDomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:720:1: ( ( ';' ) rule__BusinessDomainModel__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:721:1: ( ';' ) rule__BusinessDomainModel__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:721:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:722:1: ';'
            {
             before(grammarAccess.getBusinessDomainModelAccess().getSemicolonKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BusinessDomainModel__Group__31527); 
             after(grammarAccess.getBusinessDomainModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessDomainModel__Group__4_in_rule__BusinessDomainModel__Group__31537);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:736:1: rule__BusinessDomainModel__Group__4 : ( ( rule__BusinessDomainModel__Alternatives_4 )* ) ;
    public final void rule__BusinessDomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:740:1: ( ( ( rule__BusinessDomainModel__Alternatives_4 )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:741:1: ( ( rule__BusinessDomainModel__Alternatives_4 )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:741:1: ( ( rule__BusinessDomainModel__Alternatives_4 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:742:1: ( rule__BusinessDomainModel__Alternatives_4 )*
            {
             before(grammarAccess.getBusinessDomainModelAccess().getAlternatives_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:743:1: ( rule__BusinessDomainModel__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING||LA8_0==17||LA8_0==21||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:743:2: rule__BusinessDomainModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__BusinessDomainModel__Alternatives_4_in_rule__BusinessDomainModel__Group__41565);
            	    rule__BusinessDomainModel__Alternatives_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBusinessDomainModelAccess().getAlternatives_4()); 

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
    // $ANTLR end rule__BusinessDomainModel__Group__4


    // $ANTLR start rule__Association__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:763:1: rule__Association__Group__0 : ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:767:1: ( ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:768:1: ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:768:1: ( ( rule__Association__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:769:1: ( rule__Association__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getAssociationAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:770:1: ( rule__Association__DescriptionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:770:2: rule__Association__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Association__DescriptionAssignment_0_in_rule__Association__Group__01610);
                    rule__Association__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01620);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:781:1: rule__Association__Group__1 : ( 'association' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:785:1: ( ( 'association' ) rule__Association__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:786:1: ( 'association' ) rule__Association__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:786:1: ( 'association' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:787:1: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Association__Group__11649); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__11659);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:801:1: rule__Association__Group__2 : ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:805:1: ( ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:806:1: ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:806:1: ( ( rule__Association__SourceAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:807:1: ( rule__Association__SourceAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:808:1: ( rule__Association__SourceAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:808:2: rule__Association__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__SourceAssignment_2_in_rule__Association__Group__21687);
            rule__Association__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__21696);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:819:1: rule__Association__Group__3 : ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:823:1: ( ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:824:1: ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:824:1: ( ( rule__Association__SourceRoleNameAssignment_3 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:825:1: ( rule__Association__SourceRoleNameAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getSourceRoleNameAssignment_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:826:1: ( rule__Association__SourceRoleNameAssignment_3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:826:2: rule__Association__SourceRoleNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__SourceRoleNameAssignment_3_in_rule__Association__Group__31724);
            rule__Association__SourceRoleNameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceRoleNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__31733);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:837:1: rule__Association__Group__4 : ( ( rule__Association__Group_4__0 )? ) rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:841:1: ( ( ( rule__Association__Group_4__0 )? ) rule__Association__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:842:1: ( ( rule__Association__Group_4__0 )? ) rule__Association__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:842:1: ( ( rule__Association__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:843:1: ( rule__Association__Group_4__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:844:1: ( rule__Association__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:844:2: rule__Association__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_4__0_in_rule__Association__Group__41761);
                    rule__Association__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__5_in_rule__Association__Group__41771);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:855:1: rule__Association__Group__5 : ( ( rule__Association__SourceMultiplicityAssignment_5 ) ) rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:859:1: ( ( ( rule__Association__SourceMultiplicityAssignment_5 ) ) rule__Association__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:860:1: ( ( rule__Association__SourceMultiplicityAssignment_5 ) ) rule__Association__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:860:1: ( ( rule__Association__SourceMultiplicityAssignment_5 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:861:1: ( rule__Association__SourceMultiplicityAssignment_5 )
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:862:1: ( rule__Association__SourceMultiplicityAssignment_5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:862:2: rule__Association__SourceMultiplicityAssignment_5
            {
            pushFollow(FOLLOW_rule__Association__SourceMultiplicityAssignment_5_in_rule__Association__Group__51799);
            rule__Association__SourceMultiplicityAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__6_in_rule__Association__Group__51808);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:873:1: rule__Association__Group__6 : ( ( rule__Association__Alternatives_6 ) ) rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:877:1: ( ( ( rule__Association__Alternatives_6 ) ) rule__Association__Group__7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:878:1: ( ( rule__Association__Alternatives_6 ) ) rule__Association__Group__7
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:878:1: ( ( rule__Association__Alternatives_6 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:879:1: ( rule__Association__Alternatives_6 )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:880:1: ( rule__Association__Alternatives_6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:880:2: rule__Association__Alternatives_6
            {
            pushFollow(FOLLOW_rule__Association__Alternatives_6_in_rule__Association__Group__61836);
            rule__Association__Alternatives_6();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAlternatives_6()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__7_in_rule__Association__Group__61845);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:891:1: rule__Association__Group__7 : ( ( rule__Association__TargetMultiplicityAssignment_7 ) ) rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:895:1: ( ( ( rule__Association__TargetMultiplicityAssignment_7 ) ) rule__Association__Group__8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:896:1: ( ( rule__Association__TargetMultiplicityAssignment_7 ) ) rule__Association__Group__8
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:896:1: ( ( rule__Association__TargetMultiplicityAssignment_7 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:897:1: ( rule__Association__TargetMultiplicityAssignment_7 )
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_7()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:898:1: ( rule__Association__TargetMultiplicityAssignment_7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:898:2: rule__Association__TargetMultiplicityAssignment_7
            {
            pushFollow(FOLLOW_rule__Association__TargetMultiplicityAssignment_7_in_rule__Association__Group__71873);
            rule__Association__TargetMultiplicityAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__8_in_rule__Association__Group__71882);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:909:1: rule__Association__Group__8 : ( ( rule__Association__Group_8__0 )? ) rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:913:1: ( ( ( rule__Association__Group_8__0 )? ) rule__Association__Group__9 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:914:1: ( ( rule__Association__Group_8__0 )? ) rule__Association__Group__9
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:914:1: ( ( rule__Association__Group_8__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:915:1: ( rule__Association__Group_8__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_8()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:916:1: ( rule__Association__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:916:2: rule__Association__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_8__0_in_rule__Association__Group__81910);
                    rule__Association__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_8()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__9_in_rule__Association__Group__81920);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:927:1: rule__Association__Group__9 : ( ( rule__Association__TargetAssignment_9 ) ) rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:931:1: ( ( ( rule__Association__TargetAssignment_9 ) ) rule__Association__Group__10 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:932:1: ( ( rule__Association__TargetAssignment_9 ) ) rule__Association__Group__10
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:932:1: ( ( rule__Association__TargetAssignment_9 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:933:1: ( rule__Association__TargetAssignment_9 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_9()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:934:1: ( rule__Association__TargetAssignment_9 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:934:2: rule__Association__TargetAssignment_9
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_9_in_rule__Association__Group__91948);
            rule__Association__TargetAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__10_in_rule__Association__Group__91957);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:945:1: rule__Association__Group__10 : ( ( rule__Association__TargetRoleNameAssignment_10 ) ) rule__Association__Group__11 ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:949:1: ( ( ( rule__Association__TargetRoleNameAssignment_10 ) ) rule__Association__Group__11 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:950:1: ( ( rule__Association__TargetRoleNameAssignment_10 ) ) rule__Association__Group__11
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:950:1: ( ( rule__Association__TargetRoleNameAssignment_10 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:951:1: ( rule__Association__TargetRoleNameAssignment_10 )
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_10()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:952:1: ( rule__Association__TargetRoleNameAssignment_10 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:952:2: rule__Association__TargetRoleNameAssignment_10
            {
            pushFollow(FOLLOW_rule__Association__TargetRoleNameAssignment_10_in_rule__Association__Group__101985);
            rule__Association__TargetRoleNameAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__11_in_rule__Association__Group__101994);
            rule__Association__Group__11();
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
    // $ANTLR end rule__Association__Group__10


    // $ANTLR start rule__Association__Group__11
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:963:1: rule__Association__Group__11 : ( ( rule__Association__Group_11__0 )? ) rule__Association__Group__12 ;
    public final void rule__Association__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:967:1: ( ( ( rule__Association__Group_11__0 )? ) rule__Association__Group__12 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:968:1: ( ( rule__Association__Group_11__0 )? ) rule__Association__Group__12
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:968:1: ( ( rule__Association__Group_11__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:969:1: ( rule__Association__Group_11__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_11()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:970:1: ( rule__Association__Group_11__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:970:2: rule__Association__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_11__0_in_rule__Association__Group__112022);
                    rule__Association__Group_11__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_11()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__12_in_rule__Association__Group__112032);
            rule__Association__Group__12();
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
    // $ANTLR end rule__Association__Group__11


    // $ANTLR start rule__Association__Group__12
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:981:1: rule__Association__Group__12 : ( ( rule__Association__Group_12__0 )? ) rule__Association__Group__13 ;
    public final void rule__Association__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:985:1: ( ( ( rule__Association__Group_12__0 )? ) rule__Association__Group__13 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:986:1: ( ( rule__Association__Group_12__0 )? ) rule__Association__Group__13
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:986:1: ( ( rule__Association__Group_12__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:987:1: ( rule__Association__Group_12__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_12()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:988:1: ( rule__Association__Group_12__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:988:2: rule__Association__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_12__0_in_rule__Association__Group__122060);
                    rule__Association__Group_12__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_12()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__13_in_rule__Association__Group__122070);
            rule__Association__Group__13();
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
    // $ANTLR end rule__Association__Group__12


    // $ANTLR start rule__Association__Group__13
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:999:1: rule__Association__Group__13 : ( ';' ) ;
    public final void rule__Association__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1003:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1004:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1004:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1005:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_13()); 
            match(input,16,FOLLOW_16_in_rule__Association__Group__132099); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_13()); 

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
    // $ANTLR end rule__Association__Group__13


    // $ANTLR start rule__Association__Group_4__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1046:1: rule__Association__Group_4__0 : ( 'foreign key' ) rule__Association__Group_4__1 ;
    public final void rule__Association__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1050:1: ( ( 'foreign key' ) rule__Association__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1051:1: ( 'foreign key' ) rule__Association__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1051:1: ( 'foreign key' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1052:1: 'foreign key'
            {
             before(grammarAccess.getAssociationAccess().getForeignKeyKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Association__Group_4__02163); 
             after(grammarAccess.getAssociationAccess().getForeignKeyKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_4__1_in_rule__Association__Group_4__02173);
            rule__Association__Group_4__1();
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
    // $ANTLR end rule__Association__Group_4__0


    // $ANTLR start rule__Association__Group_4__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1066:1: rule__Association__Group_4__1 : ( ( rule__Association__SourceForeignKeyAssignment_4_1 ) ) ;
    public final void rule__Association__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1070:1: ( ( ( rule__Association__SourceForeignKeyAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1071:1: ( ( rule__Association__SourceForeignKeyAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1071:1: ( ( rule__Association__SourceForeignKeyAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1072:1: ( rule__Association__SourceForeignKeyAssignment_4_1 )
            {
             before(grammarAccess.getAssociationAccess().getSourceForeignKeyAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1073:1: ( rule__Association__SourceForeignKeyAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1073:2: rule__Association__SourceForeignKeyAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Association__SourceForeignKeyAssignment_4_1_in_rule__Association__Group_4__12201);
            rule__Association__SourceForeignKeyAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceForeignKeyAssignment_4_1()); 

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
    // $ANTLR end rule__Association__Group_4__1


    // $ANTLR start rule__Association__Group_8__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1087:1: rule__Association__Group_8__0 : ( 'table' ) rule__Association__Group_8__1 ;
    public final void rule__Association__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1091:1: ( ( 'table' ) rule__Association__Group_8__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1092:1: ( 'table' ) rule__Association__Group_8__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1092:1: ( 'table' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1093:1: 'table'
            {
             before(grammarAccess.getAssociationAccess().getTableKeyword_8_0()); 
            match(input,19,FOLLOW_19_in_rule__Association__Group_8__02240); 
             after(grammarAccess.getAssociationAccess().getTableKeyword_8_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_8__1_in_rule__Association__Group_8__02250);
            rule__Association__Group_8__1();
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
    // $ANTLR end rule__Association__Group_8__0


    // $ANTLR start rule__Association__Group_8__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1107:1: rule__Association__Group_8__1 : ( ( rule__Association__TableAssignment_8_1 ) ) ;
    public final void rule__Association__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1111:1: ( ( ( rule__Association__TableAssignment_8_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1112:1: ( ( rule__Association__TableAssignment_8_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1112:1: ( ( rule__Association__TableAssignment_8_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1113:1: ( rule__Association__TableAssignment_8_1 )
            {
             before(grammarAccess.getAssociationAccess().getTableAssignment_8_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1114:1: ( rule__Association__TableAssignment_8_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1114:2: rule__Association__TableAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Association__TableAssignment_8_1_in_rule__Association__Group_8__12278);
            rule__Association__TableAssignment_8_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTableAssignment_8_1()); 

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
    // $ANTLR end rule__Association__Group_8__1


    // $ANTLR start rule__Association__Group_11__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1128:1: rule__Association__Group_11__0 : ( 'foreign key' ) rule__Association__Group_11__1 ;
    public final void rule__Association__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1132:1: ( ( 'foreign key' ) rule__Association__Group_11__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1133:1: ( 'foreign key' ) rule__Association__Group_11__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1133:1: ( 'foreign key' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1134:1: 'foreign key'
            {
             before(grammarAccess.getAssociationAccess().getForeignKeyKeyword_11_0()); 
            match(input,18,FOLLOW_18_in_rule__Association__Group_11__02317); 
             after(grammarAccess.getAssociationAccess().getForeignKeyKeyword_11_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_11__1_in_rule__Association__Group_11__02327);
            rule__Association__Group_11__1();
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
    // $ANTLR end rule__Association__Group_11__0


    // $ANTLR start rule__Association__Group_11__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1148:1: rule__Association__Group_11__1 : ( ( rule__Association__TargetForeignKeyAssignment_11_1 ) ) ;
    public final void rule__Association__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1152:1: ( ( ( rule__Association__TargetForeignKeyAssignment_11_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1153:1: ( ( rule__Association__TargetForeignKeyAssignment_11_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1153:1: ( ( rule__Association__TargetForeignKeyAssignment_11_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1154:1: ( rule__Association__TargetForeignKeyAssignment_11_1 )
            {
             before(grammarAccess.getAssociationAccess().getTargetForeignKeyAssignment_11_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1155:1: ( rule__Association__TargetForeignKeyAssignment_11_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1155:2: rule__Association__TargetForeignKeyAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Association__TargetForeignKeyAssignment_11_1_in_rule__Association__Group_11__12355);
            rule__Association__TargetForeignKeyAssignment_11_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetForeignKeyAssignment_11_1()); 

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
    // $ANTLR end rule__Association__Group_11__1


    // $ANTLR start rule__Association__Group_12__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1169:1: rule__Association__Group_12__0 : ( ( rule__Association__OrderedAssignment_12_0 ) ) rule__Association__Group_12__1 ;
    public final void rule__Association__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1173:1: ( ( ( rule__Association__OrderedAssignment_12_0 ) ) rule__Association__Group_12__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1174:1: ( ( rule__Association__OrderedAssignment_12_0 ) ) rule__Association__Group_12__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1174:1: ( ( rule__Association__OrderedAssignment_12_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1175:1: ( rule__Association__OrderedAssignment_12_0 )
            {
             before(grammarAccess.getAssociationAccess().getOrderedAssignment_12_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1176:1: ( rule__Association__OrderedAssignment_12_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1176:2: rule__Association__OrderedAssignment_12_0
            {
            pushFollow(FOLLOW_rule__Association__OrderedAssignment_12_0_in_rule__Association__Group_12__02393);
            rule__Association__OrderedAssignment_12_0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getOrderedAssignment_12_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_12__1_in_rule__Association__Group_12__02402);
            rule__Association__Group_12__1();
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
    // $ANTLR end rule__Association__Group_12__0


    // $ANTLR start rule__Association__Group_12__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1187:1: rule__Association__Group_12__1 : ( ( rule__Association__Group_12_1__0 )? ) ;
    public final void rule__Association__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1191:1: ( ( ( rule__Association__Group_12_1__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1192:1: ( ( rule__Association__Group_12_1__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1192:1: ( ( rule__Association__Group_12_1__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1193:1: ( rule__Association__Group_12_1__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_12_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1194:1: ( rule__Association__Group_12_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1194:2: rule__Association__Group_12_1__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_12_1__0_in_rule__Association__Group_12__12430);
                    rule__Association__Group_12_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_12_1()); 

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
    // $ANTLR end rule__Association__Group_12__1


    // $ANTLR start rule__Association__Group_12_1__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1208:1: rule__Association__Group_12_1__0 : ( 'column' ) rule__Association__Group_12_1__1 ;
    public final void rule__Association__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1212:1: ( ( 'column' ) rule__Association__Group_12_1__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1213:1: ( 'column' ) rule__Association__Group_12_1__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1213:1: ( 'column' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1214:1: 'column'
            {
             before(grammarAccess.getAssociationAccess().getColumnKeyword_12_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Association__Group_12_1__02470); 
             after(grammarAccess.getAssociationAccess().getColumnKeyword_12_1_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_12_1__1_in_rule__Association__Group_12_1__02480);
            rule__Association__Group_12_1__1();
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
    // $ANTLR end rule__Association__Group_12_1__0


    // $ANTLR start rule__Association__Group_12_1__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1228:1: rule__Association__Group_12_1__1 : ( ( rule__Association__OrderingColumnAssignment_12_1_1 ) ) ;
    public final void rule__Association__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1232:1: ( ( ( rule__Association__OrderingColumnAssignment_12_1_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1233:1: ( ( rule__Association__OrderingColumnAssignment_12_1_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1233:1: ( ( rule__Association__OrderingColumnAssignment_12_1_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1234:1: ( rule__Association__OrderingColumnAssignment_12_1_1 )
            {
             before(grammarAccess.getAssociationAccess().getOrderingColumnAssignment_12_1_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1235:1: ( rule__Association__OrderingColumnAssignment_12_1_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1235:2: rule__Association__OrderingColumnAssignment_12_1_1
            {
            pushFollow(FOLLOW_rule__Association__OrderingColumnAssignment_12_1_1_in_rule__Association__Group_12_1__12508);
            rule__Association__OrderingColumnAssignment_12_1_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getOrderingColumnAssignment_12_1_1()); 

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
    // $ANTLR end rule__Association__Group_12_1__1


    // $ANTLR start rule__BusinessClass__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1249:1: rule__BusinessClass__Group__0 : ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 ;
    public final void rule__BusinessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1253:1: ( ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1254:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1254:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1255:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1256:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1256:2: rule__BusinessClass__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__DescriptionAssignment_0_in_rule__BusinessClass__Group__02546);
                    rule__BusinessClass__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__1_in_rule__BusinessClass__Group__02556);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1267:1: rule__BusinessClass__Group__1 : ( 'class' ) rule__BusinessClass__Group__2 ;
    public final void rule__BusinessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1271:1: ( ( 'class' ) rule__BusinessClass__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1272:1: ( 'class' ) rule__BusinessClass__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1272:1: ( 'class' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1273:1: 'class'
            {
             before(grammarAccess.getBusinessClassAccess().getClassKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BusinessClass__Group__12585); 
             after(grammarAccess.getBusinessClassAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__2_in_rule__BusinessClass__Group__12595);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1287:1: rule__BusinessClass__Group__2 : ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 ;
    public final void rule__BusinessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1291:1: ( ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1292:1: ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1292:1: ( ( rule__BusinessClass__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1293:1: ( rule__BusinessClass__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1294:1: ( rule__BusinessClass__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1294:2: rule__BusinessClass__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClass__NameAssignment_2_in_rule__BusinessClass__Group__22623);
            rule__BusinessClass__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__3_in_rule__BusinessClass__Group__22632);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1305:1: rule__BusinessClass__Group__3 : ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 ;
    public final void rule__BusinessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1309:1: ( ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1310:1: ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1310:1: ( ( rule__BusinessClass__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1311:1: ( rule__BusinessClass__Group_3__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1312:1: ( rule__BusinessClass__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1312:2: rule__BusinessClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_3__0_in_rule__BusinessClass__Group__32660);
                    rule__BusinessClass__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__4_in_rule__BusinessClass__Group__32670);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1323:1: rule__BusinessClass__Group__4 : ( ( rule__BusinessClass__Group_4__0 )? ) rule__BusinessClass__Group__5 ;
    public final void rule__BusinessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1327:1: ( ( ( rule__BusinessClass__Group_4__0 )? ) rule__BusinessClass__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1328:1: ( ( rule__BusinessClass__Group_4__0 )? ) rule__BusinessClass__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1328:1: ( ( rule__BusinessClass__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1329:1: ( rule__BusinessClass__Group_4__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1330:1: ( rule__BusinessClass__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1330:2: rule__BusinessClass__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_4__0_in_rule__BusinessClass__Group__42698);
                    rule__BusinessClass__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__5_in_rule__BusinessClass__Group__42708);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1341:1: rule__BusinessClass__Group__5 : ( '[' ) rule__BusinessClass__Group__6 ;
    public final void rule__BusinessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1345:1: ( ( '[' ) rule__BusinessClass__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1346:1: ( '[' ) rule__BusinessClass__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1346:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1347:1: '['
            {
             before(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__BusinessClass__Group__52737); 
             after(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__6_in_rule__BusinessClass__Group__52747);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1361:1: rule__BusinessClass__Group__6 : ( ( rule__BusinessClass__PropertiesAssignment_6 )* ) rule__BusinessClass__Group__7 ;
    public final void rule__BusinessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1365:1: ( ( ( rule__BusinessClass__PropertiesAssignment_6 )* ) rule__BusinessClass__Group__7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1366:1: ( ( rule__BusinessClass__PropertiesAssignment_6 )* ) rule__BusinessClass__Group__7
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1366:1: ( ( rule__BusinessClass__PropertiesAssignment_6 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1367:1: ( rule__BusinessClass__PropertiesAssignment_6 )*
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1368:1: ( rule__BusinessClass__PropertiesAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)||LA18_0==40||(LA18_0>=43 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1368:2: rule__BusinessClass__PropertiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClass__PropertiesAssignment_6_in_rule__BusinessClass__Group__62775);
            	    rule__BusinessClass__PropertiesAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__7_in_rule__BusinessClass__Group__62785);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1379:1: rule__BusinessClass__Group__7 : ( ( rule__BusinessClass__Group_7__0 )? ) rule__BusinessClass__Group__8 ;
    public final void rule__BusinessClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1383:1: ( ( ( rule__BusinessClass__Group_7__0 )? ) rule__BusinessClass__Group__8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1384:1: ( ( rule__BusinessClass__Group_7__0 )? ) rule__BusinessClass__Group__8
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1384:1: ( ( rule__BusinessClass__Group_7__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1385:1: ( rule__BusinessClass__Group_7__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_7()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1386:1: ( rule__BusinessClass__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1386:2: rule__BusinessClass__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_7__0_in_rule__BusinessClass__Group__72813);
                    rule__BusinessClass__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__8_in_rule__BusinessClass__Group__72823);
            rule__BusinessClass__Group__8();
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
    // $ANTLR end rule__BusinessClass__Group__7


    // $ANTLR start rule__BusinessClass__Group__8
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1397:1: rule__BusinessClass__Group__8 : ( ']' ) ;
    public final void rule__BusinessClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1401:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1402:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1402:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1403:1: ']'
            {
             before(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_8()); 
            match(input,23,FOLLOW_23_in_rule__BusinessClass__Group__82852); 
             after(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end rule__BusinessClass__Group__8


    // $ANTLR start rule__BusinessClass__Group_3__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1434:1: rule__BusinessClass__Group_3__0 : ( 'inherits' ) rule__BusinessClass__Group_3__1 ;
    public final void rule__BusinessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1438:1: ( ( 'inherits' ) rule__BusinessClass__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1439:1: ( 'inherits' ) rule__BusinessClass__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1439:1: ( 'inherits' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1440:1: 'inherits'
            {
             before(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__BusinessClass__Group_3__02906); 
             after(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_3__1_in_rule__BusinessClass__Group_3__02916);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1454:1: rule__BusinessClass__Group_3__1 : ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) ;
    public final void rule__BusinessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1458:1: ( ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1459:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1459:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1460:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1461:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1461:2: rule__BusinessClass__SuperclassAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BusinessClass__SuperclassAssignment_3_1_in_rule__BusinessClass__Group_3__12944);
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


    // $ANTLR start rule__BusinessClass__Group_4__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1475:1: rule__BusinessClass__Group_4__0 : ( 'table' ) rule__BusinessClass__Group_4__1 ;
    public final void rule__BusinessClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1479:1: ( ( 'table' ) rule__BusinessClass__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1480:1: ( 'table' ) rule__BusinessClass__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1480:1: ( 'table' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1481:1: 'table'
            {
             before(grammarAccess.getBusinessClassAccess().getTableKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__BusinessClass__Group_4__02983); 
             after(grammarAccess.getBusinessClassAccess().getTableKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_4__1_in_rule__BusinessClass__Group_4__02993);
            rule__BusinessClass__Group_4__1();
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
    // $ANTLR end rule__BusinessClass__Group_4__0


    // $ANTLR start rule__BusinessClass__Group_4__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1495:1: rule__BusinessClass__Group_4__1 : ( ( rule__BusinessClass__TableAssignment_4_1 ) ) ;
    public final void rule__BusinessClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1499:1: ( ( ( rule__BusinessClass__TableAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1500:1: ( ( rule__BusinessClass__TableAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1500:1: ( ( rule__BusinessClass__TableAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1501:1: ( rule__BusinessClass__TableAssignment_4_1 )
            {
             before(grammarAccess.getBusinessClassAccess().getTableAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1502:1: ( rule__BusinessClass__TableAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1502:2: rule__BusinessClass__TableAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BusinessClass__TableAssignment_4_1_in_rule__BusinessClass__Group_4__13021);
            rule__BusinessClass__TableAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getTableAssignment_4_1()); 

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
    // $ANTLR end rule__BusinessClass__Group_4__1


    // $ANTLR start rule__BusinessClass__Group_7__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1516:1: rule__BusinessClass__Group_7__0 : ( 'rules' ) rule__BusinessClass__Group_7__1 ;
    public final void rule__BusinessClass__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1520:1: ( ( 'rules' ) rule__BusinessClass__Group_7__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1521:1: ( 'rules' ) rule__BusinessClass__Group_7__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1521:1: ( 'rules' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1522:1: 'rules'
            {
             before(grammarAccess.getBusinessClassAccess().getRulesKeyword_7_0()); 
            match(input,25,FOLLOW_25_in_rule__BusinessClass__Group_7__03060); 
             after(grammarAccess.getBusinessClassAccess().getRulesKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_7__1_in_rule__BusinessClass__Group_7__03070);
            rule__BusinessClass__Group_7__1();
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
    // $ANTLR end rule__BusinessClass__Group_7__0


    // $ANTLR start rule__BusinessClass__Group_7__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1536:1: rule__BusinessClass__Group_7__1 : ( '[' ) rule__BusinessClass__Group_7__2 ;
    public final void rule__BusinessClass__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1540:1: ( ( '[' ) rule__BusinessClass__Group_7__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1541:1: ( '[' ) rule__BusinessClass__Group_7__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1541:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1542:1: '['
            {
             before(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,22,FOLLOW_22_in_rule__BusinessClass__Group_7__13099); 
             after(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_7__2_in_rule__BusinessClass__Group_7__13109);
            rule__BusinessClass__Group_7__2();
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
    // $ANTLR end rule__BusinessClass__Group_7__1


    // $ANTLR start rule__BusinessClass__Group_7__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1556:1: rule__BusinessClass__Group_7__2 : ( ( rule__BusinessClass__BusinessRulesAssignment_7_2 )* ) rule__BusinessClass__Group_7__3 ;
    public final void rule__BusinessClass__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1560:1: ( ( ( rule__BusinessClass__BusinessRulesAssignment_7_2 )* ) rule__BusinessClass__Group_7__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1561:1: ( ( rule__BusinessClass__BusinessRulesAssignment_7_2 )* ) rule__BusinessClass__Group_7__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1561:1: ( ( rule__BusinessClass__BusinessRulesAssignment_7_2 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1562:1: ( rule__BusinessClass__BusinessRulesAssignment_7_2 )*
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_7_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1563:1: ( rule__BusinessClass__BusinessRulesAssignment_7_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1563:2: rule__BusinessClass__BusinessRulesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClass__BusinessRulesAssignment_7_2_in_rule__BusinessClass__Group_7__23137);
            	    rule__BusinessClass__BusinessRulesAssignment_7_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_7__3_in_rule__BusinessClass__Group_7__23147);
            rule__BusinessClass__Group_7__3();
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
    // $ANTLR end rule__BusinessClass__Group_7__2


    // $ANTLR start rule__BusinessClass__Group_7__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1574:1: rule__BusinessClass__Group_7__3 : ( ']' ) ;
    public final void rule__BusinessClass__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1578:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1579:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1579:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1580:1: ']'
            {
             before(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7_3()); 
            match(input,23,FOLLOW_23_in_rule__BusinessClass__Group_7__33176); 
             after(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7_3()); 

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
    // $ANTLR end rule__BusinessClass__Group_7__3


    // $ANTLR start rule__Enumeration__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1601:1: rule__Enumeration__Group__0 : ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1605:1: ( ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1606:1: ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1606:1: ( ( rule__Enumeration__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1607:1: ( rule__Enumeration__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1608:1: ( rule__Enumeration__DescriptionAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1608:2: rule__Enumeration__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Enumeration__DescriptionAssignment_0_in_rule__Enumeration__Group__03219);
                    rule__Enumeration__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__03229);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1619:1: rule__Enumeration__Group__1 : ( 'enumeration' ) rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1623:1: ( ( 'enumeration' ) rule__Enumeration__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1624:1: ( 'enumeration' ) rule__Enumeration__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1624:1: ( 'enumeration' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1625:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Enumeration__Group__13258); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__13268);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1639:1: rule__Enumeration__Group__2 : ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1643:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1644:1: ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1644:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1645:1: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1646:1: ( rule__Enumeration__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1646:2: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__23296);
            rule__Enumeration__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__23305);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1657:1: rule__Enumeration__Group__3 : ( '[' ) rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1661:1: ( ( '[' ) rule__Enumeration__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1662:1: ( '[' ) rule__Enumeration__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1662:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1663:1: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Enumeration__Group__33334); 
             after(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33344);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1677:1: rule__Enumeration__Group__4 : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1681:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1682:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1682:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1683:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1683:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1684:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1685:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1685:2: rule__Enumeration__EnumerationLiteralsAssignment_4
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43374);
            rule__Enumeration__EnumerationLiteralsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }

            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1688:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1689:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1690:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1690:2: rule__Enumeration__EnumerationLiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43386);
            	    rule__Enumeration__EnumerationLiteralsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }


            }

            pushFollow(FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43398);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1702:1: rule__Enumeration__Group__5 : ( ']' ) ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1706:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1707:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1707:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1708:1: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Enumeration__Group__53427); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1733:1: rule__EnumerationLiteral__Group__0 : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1737:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1738:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1738:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1739:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1740:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1740:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__03474);
            rule__EnumerationLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__03483);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1751:1: rule__EnumerationLiteral__Group__1 : ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1755:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1756:1: ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1756:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1757:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1758:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1758:2: rule__EnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__13511);
            rule__EnumerationLiteral__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__13520);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1769:1: rule__EnumerationLiteral__Group__2 : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1773:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1774:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1774:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1775:1: ';'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__EnumerationLiteral__Group__23549); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1794:1: rule__EnumerationLiteral__Group_1__0 : ( '=' ) rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1798:1: ( ( '=' ) rule__EnumerationLiteral__Group_1__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1799:1: ( '=' ) rule__EnumerationLiteral__Group_1__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1799:1: ( '=' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1800:1: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__EnumerationLiteral__Group_1__03591); 
             after(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__03601);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1814:1: rule__EnumerationLiteral__Group_1__1 : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1818:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1819:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1819:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1820:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1821:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1821:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__13629);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1835:1: rule__BusinessRule__Group__0 : ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1839:1: ( ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1840:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1840:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1841:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1842:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1842:2: rule__BusinessRule__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessRule__DescriptionAssignment_0_in_rule__BusinessRule__Group__03667);
                    rule__BusinessRule__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03677);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1853:1: rule__BusinessRule__Group__1 : ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1857:1: ( ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1858:1: ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1858:1: ( ( rule__BusinessRule__NameAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1859:1: ( rule__BusinessRule__NameAssignment_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1860:1: ( rule__BusinessRule__NameAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1860:2: rule__BusinessRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__13705);
            rule__BusinessRule__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13714);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1871:1: rule__BusinessRule__Group__2 : ( ';' ) ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1875:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1876:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1876:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1877:1: ';'
            {
             before(grammarAccess.getBusinessRuleAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__BusinessRule__Group__23743); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1896:1: rule__UniqueRule__Group__0 : ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 ;
    public final void rule__UniqueRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1900:1: ( ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1901:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1901:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1902:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1903:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1903:2: rule__UniqueRule__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UniqueRule__DescriptionAssignment_0_in_rule__UniqueRule__Group__03784);
                    rule__UniqueRule__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__1_in_rule__UniqueRule__Group__03794);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1914:1: rule__UniqueRule__Group__1 : ( 'unique' ) rule__UniqueRule__Group__2 ;
    public final void rule__UniqueRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1918:1: ( ( 'unique' ) rule__UniqueRule__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1919:1: ( 'unique' ) rule__UniqueRule__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1919:1: ( 'unique' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1920:1: 'unique'
            {
             before(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__UniqueRule__Group__13823); 
             after(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__2_in_rule__UniqueRule__Group__13833);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1934:1: rule__UniqueRule__Group__2 : ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 ;
    public final void rule__UniqueRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1938:1: ( ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1939:1: ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1939:1: ( ( rule__UniqueRule__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1940:1: ( rule__UniqueRule__NameAssignment_2 )
            {
             before(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1941:1: ( rule__UniqueRule__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1941:2: rule__UniqueRule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UniqueRule__NameAssignment_2_in_rule__UniqueRule__Group__23861);
            rule__UniqueRule__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__3_in_rule__UniqueRule__Group__23870);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1952:1: rule__UniqueRule__Group__3 : ( '[' ) rule__UniqueRule__Group__4 ;
    public final void rule__UniqueRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1956:1: ( ( '[' ) rule__UniqueRule__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1957:1: ( '[' ) rule__UniqueRule__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1957:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1958:1: '['
            {
             before(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__UniqueRule__Group__33899); 
             after(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__4_in_rule__UniqueRule__Group__33909);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1972:1: rule__UniqueRule__Group__4 : ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 ;
    public final void rule__UniqueRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1976:1: ( ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1977:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1977:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1978:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1979:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1979:2: rule__UniqueRule__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__UniqueRule__PropertiesAssignment_4_in_rule__UniqueRule__Group__43937);
            rule__UniqueRule__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__5_in_rule__UniqueRule__Group__43946);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1990:1: rule__UniqueRule__Group__5 : ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 ;
    public final void rule__UniqueRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1994:1: ( ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1995:1: ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1995:1: ( ( rule__UniqueRule__Group_5__0 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1996:1: ( rule__UniqueRule__Group_5__0 )*
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1997:1: ( rule__UniqueRule__Group_5__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1997:2: rule__UniqueRule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__UniqueRule__Group_5__0_in_rule__UniqueRule__Group__53974);
            	    rule__UniqueRule__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getUniqueRuleAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__6_in_rule__UniqueRule__Group__53984);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2008:1: rule__UniqueRule__Group__6 : ( ']' ) ;
    public final void rule__UniqueRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2012:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2013:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2013:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2014:1: ']'
            {
             before(grammarAccess.getUniqueRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__UniqueRule__Group__64013); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2041:1: rule__UniqueRule__Group_5__0 : ( ',' ) rule__UniqueRule__Group_5__1 ;
    public final void rule__UniqueRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2045:1: ( ( ',' ) rule__UniqueRule__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2046:1: ( ',' ) rule__UniqueRule__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2046:1: ( ',' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2047:1: ','
            {
             before(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0()); 
            match(input,29,FOLLOW_29_in_rule__UniqueRule__Group_5__04063); 
             after(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group_5__1_in_rule__UniqueRule__Group_5__04073);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2061:1: rule__UniqueRule__Group_5__1 : ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) ;
    public final void rule__UniqueRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2065:1: ( ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2066:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2066:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2067:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2068:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2068:2: rule__UniqueRule__PropertiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__UniqueRule__PropertiesAssignment_5_1_in_rule__UniqueRule__Group_5__14101);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2082:1: rule__Property__Group__0 : ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2086:1: ( ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2087:1: ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2087:1: ( ( rule__Property__Alternatives_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2088:1: ( rule__Property__Alternatives_0 )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2089:1: ( rule__Property__Alternatives_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2089:2: rule__Property__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__04139);
            rule__Property__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04148);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2100:1: rule__Property__Group__1 : ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2104:1: ( ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2105:1: ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2105:1: ( ( rule__Property__NullableAssignment_1 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2106:1: ( rule__Property__NullableAssignment_1 )?
            {
             before(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2107:1: ( rule__Property__NullableAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2107:2: rule__Property__NullableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Property__NullableAssignment_1_in_rule__Property__Group__14176);
                    rule__Property__NullableAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14186);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2118:1: rule__Property__Group__2 : ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2122:1: ( ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2123:1: ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2123:1: ( ( rule__Property__Group_2__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2124:1: ( rule__Property__Group_2__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2125:1: ( rule__Property__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2125:2: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__24214);
                    rule__Property__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24224);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2136:1: rule__Property__Group__3 : ( ( rule__Property__Group_3__0 )? ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2140:1: ( ( ( rule__Property__Group_3__0 )? ) rule__Property__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2141:1: ( ( rule__Property__Group_3__0 )? ) rule__Property__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2141:1: ( ( rule__Property__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2142:1: ( rule__Property__Group_3__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2143:1: ( rule__Property__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2143:2: rule__Property__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__34252);
                    rule__Property__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34262);
            rule__Property__Group__4();
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
    // $ANTLR end rule__Property__Group__3


    // $ANTLR start rule__Property__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2154:1: rule__Property__Group__4 : ( ';' ) ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2158:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2159:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2159:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2160:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Property__Group__44291); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end rule__Property__Group__4


    // $ANTLR start rule__Property__Group_2__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2183:1: rule__Property__Group_2__0 : ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2187:1: ( ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2188:1: ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2188:1: ( ( rule__Property__DerivedAssignment_2_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2189:1: ( rule__Property__DerivedAssignment_2_0 )
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2190:1: ( rule__Property__DerivedAssignment_2_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2190:2: rule__Property__DerivedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Property__DerivedAssignment_2_0_in_rule__Property__Group_2__04336);
            rule__Property__DerivedAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__04345);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2201:1: rule__Property__Group_2__1 : ( ( rule__Property__WritableAssignment_2_1 )? ) ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2205:1: ( ( ( rule__Property__WritableAssignment_2_1 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2206:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2206:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2207:1: ( rule__Property__WritableAssignment_2_1 )?
            {
             before(grammarAccess.getPropertyAccess().getWritableAssignment_2_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2208:1: ( rule__Property__WritableAssignment_2_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2208:2: rule__Property__WritableAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Property__WritableAssignment_2_1_in_rule__Property__Group_2__14373);
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


    // $ANTLR start rule__Property__Group_3__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2222:1: rule__Property__Group_3__0 : ( 'column' ) rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2226:1: ( ( 'column' ) rule__Property__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2227:1: ( 'column' ) rule__Property__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2227:1: ( 'column' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2228:1: 'column'
            {
             before(grammarAccess.getPropertyAccess().getColumnKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Property__Group_3__04413); 
             after(grammarAccess.getPropertyAccess().getColumnKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__04423);
            rule__Property__Group_3__1();
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
    // $ANTLR end rule__Property__Group_3__0


    // $ANTLR start rule__Property__Group_3__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2242:1: rule__Property__Group_3__1 : ( ( rule__Property__ColumnAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2246:1: ( ( ( rule__Property__ColumnAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2247:1: ( ( rule__Property__ColumnAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2247:1: ( ( rule__Property__ColumnAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2248:1: ( rule__Property__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getPropertyAccess().getColumnAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2249:1: ( rule__Property__ColumnAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2249:2: rule__Property__ColumnAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Property__ColumnAssignment_3_1_in_rule__Property__Group_3__14451);
            rule__Property__ColumnAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getColumnAssignment_3_1()); 

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
    // $ANTLR end rule__Property__Group_3__1


    // $ANTLR start rule__BoolProperty__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2263:1: rule__BoolProperty__Group__0 : ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2267:1: ( ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2268:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2268:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2269:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2270:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2270:2: rule__BoolProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__DescriptionAssignment_0_in_rule__BoolProperty__Group__04489);
                    rule__BoolProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__1_in_rule__BoolProperty__Group__04499);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2281:1: rule__BoolProperty__Group__1 : ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2285:1: ( ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2286:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2286:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2287:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2288:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2288:2: rule__BoolProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolProperty__DataTypeAssignment_1_in_rule__BoolProperty__Group__14527);
            rule__BoolProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__2_in_rule__BoolProperty__Group__14536);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2299:1: rule__BoolProperty__Group__2 : ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2303:1: ( ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2304:1: ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2304:1: ( ( rule__BoolProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2305:1: ( rule__BoolProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2306:1: ( rule__BoolProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2306:2: rule__BoolProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BoolProperty__NameAssignment_2_in_rule__BoolProperty__Group__24564);
            rule__BoolProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__3_in_rule__BoolProperty__Group__24573);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2317:1: rule__BoolProperty__Group__3 : ( ( rule__BoolProperty__Group_3__0 )? ) ;
    public final void rule__BoolProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2321:1: ( ( ( rule__BoolProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2322:1: ( ( rule__BoolProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2322:1: ( ( rule__BoolProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2323:1: ( rule__BoolProperty__Group_3__0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2324:1: ( rule__BoolProperty__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2324:2: rule__BoolProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__Group_3__0_in_rule__BoolProperty__Group__34601);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2342:1: rule__BoolProperty__Group_3__0 : ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 ;
    public final void rule__BoolProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2346:1: ( ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2347:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2347:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2348:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2349:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2349:2: rule__BoolProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__BoolProperty__HasDefaultAssignment_3_0_in_rule__BoolProperty__Group_3__04644);
            rule__BoolProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group_3__1_in_rule__BoolProperty__Group_3__04653);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2360:1: rule__BoolProperty__Group_3__1 : ( ( rule__BoolProperty__Alternatives_3_1 ) ) ;
    public final void rule__BoolProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2364:1: ( ( ( rule__BoolProperty__Alternatives_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2365:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2365:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2366:1: ( rule__BoolProperty__Alternatives_3_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getAlternatives_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2367:1: ( rule__BoolProperty__Alternatives_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2367:2: rule__BoolProperty__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__BoolProperty__Alternatives_3_1_in_rule__BoolProperty__Group_3__14681);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2381:1: rule__StringProperty__Group__0 : ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2385:1: ( ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2386:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2386:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2387:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2388:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2388:2: rule__StringProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__DescriptionAssignment_0_in_rule__StringProperty__Group__04719);
                    rule__StringProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__1_in_rule__StringProperty__Group__04729);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2399:1: rule__StringProperty__Group__1 : ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2403:1: ( ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2404:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2404:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2405:1: ( rule__StringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2406:1: ( rule__StringProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2406:2: rule__StringProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__StringProperty__DataTypeAssignment_1_in_rule__StringProperty__Group__14757);
            rule__StringProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__2_in_rule__StringProperty__Group__14766);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2417:1: rule__StringProperty__Group__2 : ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2421:1: ( ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2422:1: ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2422:1: ( ( rule__StringProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2423:1: ( rule__StringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2424:1: ( rule__StringProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2424:2: rule__StringProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__StringProperty__NameAssignment_2_in_rule__StringProperty__Group__24794);
            rule__StringProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__3_in_rule__StringProperty__Group__24803);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2435:1: rule__StringProperty__Group__3 : ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 ;
    public final void rule__StringProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2439:1: ( ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2440:1: ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2440:1: ( ( rule__StringProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2441:1: ( rule__StringProperty__Group_3__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2442:1: ( rule__StringProperty__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2442:2: rule__StringProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_3__0_in_rule__StringProperty__Group__34831);
                    rule__StringProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__4_in_rule__StringProperty__Group__34841);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2453:1: rule__StringProperty__Group__4 : ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 ;
    public final void rule__StringProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2457:1: ( ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2458:1: ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2458:1: ( ( rule__StringProperty__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2459:1: ( rule__StringProperty__Group_4__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2460:1: ( rule__StringProperty__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2460:2: rule__StringProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_4__0_in_rule__StringProperty__Group__44869);
                    rule__StringProperty__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__5_in_rule__StringProperty__Group__44879);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2471:1: rule__StringProperty__Group__5 : ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 ;
    public final void rule__StringProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2475:1: ( ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2476:1: ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2476:1: ( ( rule__StringProperty__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2477:1: ( rule__StringProperty__Group_5__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2478:1: ( rule__StringProperty__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2478:2: rule__StringProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_5__0_in_rule__StringProperty__Group__54907);
                    rule__StringProperty__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__6_in_rule__StringProperty__Group__54917);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2489:1: rule__StringProperty__Group__6 : ( ( rule__StringProperty__Group_6__0 )? ) ;
    public final void rule__StringProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2493:1: ( ( ( rule__StringProperty__Group_6__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2494:1: ( ( rule__StringProperty__Group_6__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2494:1: ( ( rule__StringProperty__Group_6__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2495:1: ( rule__StringProperty__Group_6__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2496:1: ( rule__StringProperty__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2496:2: rule__StringProperty__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_6__0_in_rule__StringProperty__Group__64945);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2520:1: rule__StringProperty__Group_3__0 : ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 ;
    public final void rule__StringProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2524:1: ( ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2525:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2525:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2526:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2527:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2527:2: rule__StringProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__StringProperty__HasDefaultAssignment_3_0_in_rule__StringProperty__Group_3__04994);
            rule__StringProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_3__1_in_rule__StringProperty__Group_3__05003);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2538:1: rule__StringProperty__Group_3__1 : ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__StringProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2542:1: ( ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2543:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2543:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2544:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2545:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2545:2: rule__StringProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StringProperty__DefaultValueAssignment_3_1_in_rule__StringProperty__Group_3__15031);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2559:1: rule__StringProperty__Group_4__0 : ( 'minlength' ) rule__StringProperty__Group_4__1 ;
    public final void rule__StringProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2563:1: ( ( 'minlength' ) rule__StringProperty__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2564:1: ( 'minlength' ) rule__StringProperty__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2564:1: ( 'minlength' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2565:1: 'minlength'
            {
             before(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__StringProperty__Group_4__05070); 
             after(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_4__1_in_rule__StringProperty__Group_4__05080);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2579:1: rule__StringProperty__Group_4__1 : ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) ;
    public final void rule__StringProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2583:1: ( ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2584:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2584:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2585:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2586:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2586:2: rule__StringProperty__MinLengthAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StringProperty__MinLengthAssignment_4_1_in_rule__StringProperty__Group_4__15108);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2600:1: rule__StringProperty__Group_5__0 : ( 'maxlength' ) rule__StringProperty__Group_5__1 ;
    public final void rule__StringProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2604:1: ( ( 'maxlength' ) rule__StringProperty__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2605:1: ( 'maxlength' ) rule__StringProperty__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2605:1: ( 'maxlength' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2606:1: 'maxlength'
            {
             before(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__StringProperty__Group_5__05147); 
             after(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_5__1_in_rule__StringProperty__Group_5__05157);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2620:1: rule__StringProperty__Group_5__1 : ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) ;
    public final void rule__StringProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2624:1: ( ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2625:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2625:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2626:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2627:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2627:2: rule__StringProperty__MaxLengthAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StringProperty__MaxLengthAssignment_5_1_in_rule__StringProperty__Group_5__15185);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2641:1: rule__StringProperty__Group_6__0 : ( 'regexp' ) rule__StringProperty__Group_6__1 ;
    public final void rule__StringProperty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2645:1: ( ( 'regexp' ) rule__StringProperty__Group_6__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2646:1: ( 'regexp' ) rule__StringProperty__Group_6__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2646:1: ( 'regexp' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2647:1: 'regexp'
            {
             before(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0()); 
            match(input,32,FOLLOW_32_in_rule__StringProperty__Group_6__05224); 
             after(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_6__1_in_rule__StringProperty__Group_6__05234);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2661:1: rule__StringProperty__Group_6__1 : ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) ;
    public final void rule__StringProperty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2665:1: ( ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2666:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2666:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2667:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionAssignment_6_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2668:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2668:2: rule__StringProperty__RegularExpressionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__StringProperty__RegularExpressionAssignment_6_1_in_rule__StringProperty__Group_6__15262);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2682:1: rule__DateTimeProperty__Group__0 : ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 ;
    public final void rule__DateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2686:1: ( ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2687:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2687:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2688:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2689:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2689:2: rule__DateTimeProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DateTimeProperty__DescriptionAssignment_0_in_rule__DateTimeProperty__Group__05300);
                    rule__DateTimeProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__1_in_rule__DateTimeProperty__Group__05310);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2700:1: rule__DateTimeProperty__Group__1 : ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 ;
    public final void rule__DateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2704:1: ( ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2705:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2705:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2706:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2707:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2707:2: rule__DateTimeProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__DataTypeAssignment_1_in_rule__DateTimeProperty__Group__15338);
            rule__DateTimeProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__2_in_rule__DateTimeProperty__Group__15347);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2718:1: rule__DateTimeProperty__Group__2 : ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 ;
    public final void rule__DateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2722:1: ( ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2723:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2723:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2724:1: ( rule__DateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2725:1: ( rule__DateTimeProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2725:2: rule__DateTimeProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__NameAssignment_2_in_rule__DateTimeProperty__Group__25375);
            rule__DateTimeProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__3_in_rule__DateTimeProperty__Group__25384);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2736:1: rule__DateTimeProperty__Group__3 : ( ( rule__DateTimeProperty__Group_3__0 )? ) ;
    public final void rule__DateTimeProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2740:1: ( ( ( rule__DateTimeProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2741:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2741:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2742:1: ( rule__DateTimeProperty__Group_3__0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2743:1: ( rule__DateTimeProperty__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2743:2: rule__DateTimeProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeProperty__Group_3__0_in_rule__DateTimeProperty__Group__35412);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2761:1: rule__DateTimeProperty__Group_3__0 : ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 ;
    public final void rule__DateTimeProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2765:1: ( ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2766:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2766:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2767:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2768:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2768:2: rule__DateTimeProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__HasDefaultAssignment_3_0_in_rule__DateTimeProperty__Group_3__05455);
            rule__DateTimeProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group_3__1_in_rule__DateTimeProperty__Group_3__05464);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2779:1: rule__DateTimeProperty__Group_3__1 : ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__DateTimeProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2783:1: ( ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2784:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2784:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2785:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2786:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2786:2: rule__DateTimeProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__DefaultValueAssignment_3_1_in_rule__DateTimeProperty__Group_3__15492);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2800:1: rule__IntegerProperty__Group__0 : ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 ;
    public final void rule__IntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2804:1: ( ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2805:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2805:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2806:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2807:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2807:2: rule__IntegerProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__DescriptionAssignment_0_in_rule__IntegerProperty__Group__05530);
                    rule__IntegerProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__1_in_rule__IntegerProperty__Group__05540);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2818:1: rule__IntegerProperty__Group__1 : ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 ;
    public final void rule__IntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2822:1: ( ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2823:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2823:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2824:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2825:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2825:2: rule__IntegerProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__DataTypeAssignment_1_in_rule__IntegerProperty__Group__15568);
            rule__IntegerProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__2_in_rule__IntegerProperty__Group__15577);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2836:1: rule__IntegerProperty__Group__2 : ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 ;
    public final void rule__IntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2840:1: ( ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2841:1: ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2841:1: ( ( rule__IntegerProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2842:1: ( rule__IntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2843:1: ( rule__IntegerProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2843:2: rule__IntegerProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerProperty__NameAssignment_2_in_rule__IntegerProperty__Group__25605);
            rule__IntegerProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__3_in_rule__IntegerProperty__Group__25614);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2854:1: rule__IntegerProperty__Group__3 : ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 ;
    public final void rule__IntegerProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2858:1: ( ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2859:1: ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2859:1: ( ( rule__IntegerProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2860:1: ( rule__IntegerProperty__Group_3__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2861:1: ( rule__IntegerProperty__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2861:2: rule__IntegerProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_3__0_in_rule__IntegerProperty__Group__35642);
                    rule__IntegerProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__4_in_rule__IntegerProperty__Group__35652);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2872:1: rule__IntegerProperty__Group__4 : ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 ;
    public final void rule__IntegerProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2876:1: ( ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2877:1: ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2877:1: ( ( rule__IntegerProperty__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2878:1: ( rule__IntegerProperty__Group_4__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2879:1: ( rule__IntegerProperty__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2879:2: rule__IntegerProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_4__0_in_rule__IntegerProperty__Group__45680);
                    rule__IntegerProperty__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__5_in_rule__IntegerProperty__Group__45690);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2890:1: rule__IntegerProperty__Group__5 : ( ( rule__IntegerProperty__Group_5__0 )? ) ;
    public final void rule__IntegerProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2894:1: ( ( ( rule__IntegerProperty__Group_5__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2895:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2895:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2896:1: ( rule__IntegerProperty__Group_5__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2897:1: ( rule__IntegerProperty__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2897:2: rule__IntegerProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_5__0_in_rule__IntegerProperty__Group__55718);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2919:1: rule__IntegerProperty__Group_3__0 : ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 ;
    public final void rule__IntegerProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2923:1: ( ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2924:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2924:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2925:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2926:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2926:2: rule__IntegerProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__IntegerProperty__HasDefaultAssignment_3_0_in_rule__IntegerProperty__Group_3__05765);
            rule__IntegerProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_3__1_in_rule__IntegerProperty__Group_3__05774);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2937:1: rule__IntegerProperty__Group_3__1 : ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__IntegerProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2941:1: ( ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2942:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2942:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2943:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2944:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2944:2: rule__IntegerProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__DefaultValueAssignment_3_1_in_rule__IntegerProperty__Group_3__15802);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2958:1: rule__IntegerProperty__Group_4__0 : ( 'min' ) rule__IntegerProperty__Group_4__1 ;
    public final void rule__IntegerProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2962:1: ( ( 'min' ) rule__IntegerProperty__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2963:1: ( 'min' ) rule__IntegerProperty__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2963:1: ( 'min' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2964:1: 'min'
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__IntegerProperty__Group_4__05841); 
             after(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_4__1_in_rule__IntegerProperty__Group_4__05851);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2978:1: rule__IntegerProperty__Group_4__1 : ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) ;
    public final void rule__IntegerProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2982:1: ( ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2983:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2983:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2984:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2985:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2985:2: rule__IntegerProperty__MinValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__MinValueAssignment_4_1_in_rule__IntegerProperty__Group_4__15879);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2999:1: rule__IntegerProperty__Group_5__0 : ( 'max' ) rule__IntegerProperty__Group_5__1 ;
    public final void rule__IntegerProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3003:1: ( ( 'max' ) rule__IntegerProperty__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3004:1: ( 'max' ) rule__IntegerProperty__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3004:1: ( 'max' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3005:1: 'max'
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0()); 
            match(input,34,FOLLOW_34_in_rule__IntegerProperty__Group_5__05918); 
             after(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_5__1_in_rule__IntegerProperty__Group_5__05928);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3019:1: rule__IntegerProperty__Group_5__1 : ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) ;
    public final void rule__IntegerProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3023:1: ( ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3024:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3024:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3025:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3026:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3026:2: rule__IntegerProperty__MaxValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__MaxValueAssignment_5_1_in_rule__IntegerProperty__Group_5__15956);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3040:1: rule__DecimalProperty__Group__0 : ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 ;
    public final void rule__DecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3044:1: ( ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3045:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3045:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3046:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3047:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3047:2: rule__DecimalProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DecimalProperty__DescriptionAssignment_0_in_rule__DecimalProperty__Group__05994);
                    rule__DecimalProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DecimalProperty__Group__1_in_rule__DecimalProperty__Group__06004);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3058:1: rule__DecimalProperty__Group__1 : ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 ;
    public final void rule__DecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3062:1: ( ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3063:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3063:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3064:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3065:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3065:2: rule__DecimalProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DecimalProperty__DataTypeAssignment_1_in_rule__DecimalProperty__Group__16032);
            rule__DecimalProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DecimalProperty__Group__2_in_rule__DecimalProperty__Group__16041);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3076:1: rule__DecimalProperty__Group__2 : ( ( rule__DecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3080:1: ( ( ( rule__DecimalProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3081:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3081:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3082:1: ( rule__DecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3083:1: ( rule__DecimalProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3083:2: rule__DecimalProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DecimalProperty__NameAssignment_2_in_rule__DecimalProperty__Group__26069);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3099:1: rule__EnumerationProperty__Group__0 : ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 ;
    public final void rule__EnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3103:1: ( ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3104:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3104:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3105:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3106:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3106:2: rule__EnumerationProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumerationProperty__DescriptionAssignment_0_in_rule__EnumerationProperty__Group__06109);
                    rule__EnumerationProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__1_in_rule__EnumerationProperty__Group__06119);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3117:1: rule__EnumerationProperty__Group__1 : ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 ;
    public final void rule__EnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3121:1: ( ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3122:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3122:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3123:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3124:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3124:2: rule__EnumerationProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__TypeAssignment_1_in_rule__EnumerationProperty__Group__16147);
            rule__EnumerationProperty__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__2_in_rule__EnumerationProperty__Group__16156);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3135:1: rule__EnumerationProperty__Group__2 : ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 ;
    public final void rule__EnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3139:1: ( ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3140:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3140:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3141:1: ( rule__EnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3142:1: ( rule__EnumerationProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3142:2: rule__EnumerationProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__NameAssignment_2_in_rule__EnumerationProperty__Group__26184);
            rule__EnumerationProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__3_in_rule__EnumerationProperty__Group__26193);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3153:1: rule__EnumerationProperty__Group__3 : ( ( rule__EnumerationProperty__Group_3__0 )? ) ;
    public final void rule__EnumerationProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3157:1: ( ( ( rule__EnumerationProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3158:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3158:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3159:1: ( rule__EnumerationProperty__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3160:1: ( rule__EnumerationProperty__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3160:2: rule__EnumerationProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationProperty__Group_3__0_in_rule__EnumerationProperty__Group__36221);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3178:1: rule__EnumerationProperty__Group_3__0 : ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 ;
    public final void rule__EnumerationProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3182:1: ( ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3183:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3183:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3184:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3185:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3185:2: rule__EnumerationProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__HasDefaultAssignment_3_0_in_rule__EnumerationProperty__Group_3__06264);
            rule__EnumerationProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group_3__1_in_rule__EnumerationProperty__Group_3__06273);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3196:1: rule__EnumerationProperty__Group_3__1 : ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3200:1: ( ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3201:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3201:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3202:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3203:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3203:2: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationProperty__Group_3__16301);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3217:1: rule__BusinessDomainModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessDomainModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3221:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3222:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3222:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3223:1: RULE_STRING
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessDomainModel__DescriptionAssignment_06339); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3232:1: rule__BusinessDomainModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessDomainModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3236:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3237:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3237:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3238:1: RULE_ID
            {
             before(grammarAccess.getBusinessDomainModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessDomainModel__NameAssignment_26370); 
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


    // $ANTLR start rule__BusinessDomainModel__TypesAssignment_4_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3247:1: rule__BusinessDomainModel__TypesAssignment_4_0 : ( ruleBusinessClass ) ;
    public final void rule__BusinessDomainModel__TypesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3251:1: ( ( ruleBusinessClass ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3252:1: ( ruleBusinessClass )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3252:1: ( ruleBusinessClass )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3253:1: ruleBusinessClass
            {
             before(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleBusinessClass_in_rule__BusinessDomainModel__TypesAssignment_4_06401);
            ruleBusinessClass();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_4_0_0()); 

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
    // $ANTLR end rule__BusinessDomainModel__TypesAssignment_4_0


    // $ANTLR start rule__BusinessDomainModel__EnumerationsAssignment_4_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3262:1: rule__BusinessDomainModel__EnumerationsAssignment_4_1 : ( ruleEnumeration ) ;
    public final void rule__BusinessDomainModel__EnumerationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3266:1: ( ( ruleEnumeration ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3267:1: ( ruleEnumeration )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3267:1: ( ruleEnumeration )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3268:1: ruleEnumeration
            {
             before(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEnumeration_in_rule__BusinessDomainModel__EnumerationsAssignment_4_16432);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getEnumerationsEnumerationParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__BusinessDomainModel__EnumerationsAssignment_4_1


    // $ANTLR start rule__BusinessDomainModel__AssociationsAssignment_4_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3277:1: rule__BusinessDomainModel__AssociationsAssignment_4_2 : ( ruleAssociation ) ;
    public final void rule__BusinessDomainModel__AssociationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3281:1: ( ( ruleAssociation ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3282:1: ( ruleAssociation )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3282:1: ( ruleAssociation )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3283:1: ruleAssociation
            {
             before(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__BusinessDomainModel__AssociationsAssignment_4_26463);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_4_2_0()); 

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
    // $ANTLR end rule__BusinessDomainModel__AssociationsAssignment_4_2


    // $ANTLR start rule__Association__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3292:1: rule__Association__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Association__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3296:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3297:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3297:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3298:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__DescriptionAssignment_06494); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3307:1: rule__Association__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3311:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3312:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3312:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3313:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3314:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3315:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_26529); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3326:1: rule__Association__SourceRoleNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Association__SourceRoleNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3330:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3331:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3331:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3332:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceRoleNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceRoleNameAssignment_36564); 
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


    // $ANTLR start rule__Association__SourceForeignKeyAssignment_4_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3341:1: rule__Association__SourceForeignKeyAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Association__SourceForeignKeyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3345:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3346:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3346:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3347:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceForeignKeyIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceForeignKeyAssignment_4_16595); 
             after(grammarAccess.getAssociationAccess().getSourceForeignKeyIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end rule__Association__SourceForeignKeyAssignment_4_1


    // $ANTLR start rule__Association__SourceMultiplicityAssignment_5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3356:1: rule__Association__SourceMultiplicityAssignment_5 : ( ruleMultiplicity ) ;
    public final void rule__Association__SourceMultiplicityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3360:1: ( ( ruleMultiplicity ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3361:1: ( ruleMultiplicity )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3361:1: ( ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3362:1: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Association__SourceMultiplicityAssignment_56626);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_5_0()); 

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
    // $ANTLR end rule__Association__SourceMultiplicityAssignment_5


    // $ANTLR start rule__Association__BidirectionalAssignment_6_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3371:1: rule__Association__BidirectionalAssignment_6_0 : ( ( '<->' ) ) ;
    public final void rule__Association__BidirectionalAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3375:1: ( ( ( '<->' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3376:1: ( ( '<->' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3376:1: ( ( '<->' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3377:1: ( '<->' )
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_6_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3378:1: ( '<->' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3379:1: '<->'
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_6_0_0()); 
            match(input,35,FOLLOW_35_in_rule__Association__BidirectionalAssignment_6_06662); 
             after(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_6_0_0()); 

            }

             after(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_6_0_0()); 

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
    // $ANTLR end rule__Association__BidirectionalAssignment_6_0


    // $ANTLR start rule__Association__TargetMultiplicityAssignment_7
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3394:1: rule__Association__TargetMultiplicityAssignment_7 : ( ruleMultiplicity ) ;
    public final void rule__Association__TargetMultiplicityAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3398:1: ( ( ruleMultiplicity ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3399:1: ( ruleMultiplicity )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3399:1: ( ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3400:1: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Association__TargetMultiplicityAssignment_76701);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_7_0()); 

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
    // $ANTLR end rule__Association__TargetMultiplicityAssignment_7


    // $ANTLR start rule__Association__TableAssignment_8_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3409:1: rule__Association__TableAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__Association__TableAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3413:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3414:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3414:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3415:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTableIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TableAssignment_8_16732); 
             after(grammarAccess.getAssociationAccess().getTableIDTerminalRuleCall_8_1_0()); 

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
    // $ANTLR end rule__Association__TableAssignment_8_1


    // $ANTLR start rule__Association__TargetAssignment_9
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3424:1: rule__Association__TargetAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3428:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3429:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3429:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3430:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_9_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3431:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3432:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_96767); 
             after(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_9_0()); 

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
    // $ANTLR end rule__Association__TargetAssignment_9


    // $ANTLR start rule__Association__TargetRoleNameAssignment_10
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3443:1: rule__Association__TargetRoleNameAssignment_10 : ( RULE_ID ) ;
    public final void rule__Association__TargetRoleNameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3447:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3448:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3448:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3449:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_10_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetRoleNameAssignment_106802); 
             after(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_10_0()); 

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
    // $ANTLR end rule__Association__TargetRoleNameAssignment_10


    // $ANTLR start rule__Association__TargetForeignKeyAssignment_11_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3458:1: rule__Association__TargetForeignKeyAssignment_11_1 : ( RULE_ID ) ;
    public final void rule__Association__TargetForeignKeyAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3462:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3463:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3463:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3464:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetForeignKeyIDTerminalRuleCall_11_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetForeignKeyAssignment_11_16833); 
             after(grammarAccess.getAssociationAccess().getTargetForeignKeyIDTerminalRuleCall_11_1_0()); 

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
    // $ANTLR end rule__Association__TargetForeignKeyAssignment_11_1


    // $ANTLR start rule__Association__OrderedAssignment_12_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3473:1: rule__Association__OrderedAssignment_12_0 : ( ( 'ordered' ) ) ;
    public final void rule__Association__OrderedAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3477:1: ( ( ( 'ordered' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3478:1: ( ( 'ordered' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3478:1: ( ( 'ordered' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3479:1: ( 'ordered' )
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_12_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3480:1: ( 'ordered' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3481:1: 'ordered'
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_12_0_0()); 
            match(input,36,FOLLOW_36_in_rule__Association__OrderedAssignment_12_06869); 
             after(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_12_0_0()); 

            }

             after(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_12_0_0()); 

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
    // $ANTLR end rule__Association__OrderedAssignment_12_0


    // $ANTLR start rule__Association__OrderingColumnAssignment_12_1_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3496:1: rule__Association__OrderingColumnAssignment_12_1_1 : ( RULE_ID ) ;
    public final void rule__Association__OrderingColumnAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3500:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3501:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3501:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3502:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getOrderingColumnIDTerminalRuleCall_12_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__OrderingColumnAssignment_12_1_16908); 
             after(grammarAccess.getAssociationAccess().getOrderingColumnIDTerminalRuleCall_12_1_1_0()); 

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
    // $ANTLR end rule__Association__OrderingColumnAssignment_12_1_1


    // $ANTLR start rule__BusinessClass__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3511:1: rule__BusinessClass__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClass__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3515:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3516:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3516:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3517:1: RULE_STRING
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessClass__DescriptionAssignment_06939); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3526:1: rule__BusinessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3530:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3531:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3531:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3532:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__NameAssignment_26970); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3541:1: rule__BusinessClass__SuperclassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClass__SuperclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3545:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3546:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3546:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3547:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3548:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3549:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__SuperclassAssignment_3_17005); 
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


    // $ANTLR start rule__BusinessClass__TableAssignment_4_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3560:1: rule__BusinessClass__TableAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__BusinessClass__TableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3564:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3565:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3565:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3566:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getTableIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__TableAssignment_4_17040); 
             after(grammarAccess.getBusinessClassAccess().getTableIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end rule__BusinessClass__TableAssignment_4_1


    // $ANTLR start rule__BusinessClass__PropertiesAssignment_6
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3575:1: rule__BusinessClass__PropertiesAssignment_6 : ( ruleProperty ) ;
    public final void rule__BusinessClass__PropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3579:1: ( ( ruleProperty ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3580:1: ( ruleProperty )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3580:1: ( ruleProperty )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3581:1: ruleProperty
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__BusinessClass__PropertiesAssignment_67071);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_6_0()); 

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
    // $ANTLR end rule__BusinessClass__PropertiesAssignment_6


    // $ANTLR start rule__BusinessClass__BusinessRulesAssignment_7_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3590:1: rule__BusinessClass__BusinessRulesAssignment_7_2 : ( ruleAbstractBusinessRule ) ;
    public final void rule__BusinessClass__BusinessRulesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3594:1: ( ( ruleAbstractBusinessRule ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3595:1: ( ruleAbstractBusinessRule )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3595:1: ( ruleAbstractBusinessRule )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3596:1: ruleAbstractBusinessRule
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_rule__BusinessClass__BusinessRulesAssignment_7_27102);
            ruleAbstractBusinessRule();
            _fsp--;

             after(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_7_2_0()); 

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
    // $ANTLR end rule__BusinessClass__BusinessRulesAssignment_7_2


    // $ANTLR start rule__Enumeration__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3605:1: rule__Enumeration__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Enumeration__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3609:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3610:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3610:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3611:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enumeration__DescriptionAssignment_07133); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3620:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3624:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3625:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3625:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3626:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_27164); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3635:1: rule__Enumeration__EnumerationLiteralsAssignment_4 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3639:1: ( ( ruleEnumerationLiteral ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3640:1: ( ruleEnumerationLiteral )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3640:1: ( ruleEnumerationLiteral )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3641:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_47195);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3650:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3654:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3655:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3655:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3656:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_07226); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3665:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3669:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3670:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3670:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3671:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_17257); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3680:1: rule__BusinessRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3684:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3685:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3685:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3686:1: RULE_STRING
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessRule__DescriptionAssignment_07288); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3695:1: rule__BusinessRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3699:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3700:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3700:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3701:1: RULE_ID
            {
             before(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_17319); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3710:1: rule__UniqueRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__UniqueRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3714:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3715:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3715:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3716:1: RULE_STRING
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UniqueRule__DescriptionAssignment_07350); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3725:1: rule__UniqueRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UniqueRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3729:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3730:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3730:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3731:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__NameAssignment_27381); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3740:1: rule__UniqueRule__PropertiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3744:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3745:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3745:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3746:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3747:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3748:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_47416); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3759:1: rule__UniqueRule__PropertiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3763:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3764:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3764:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3765:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3766:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3767:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_5_17455); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3778:1: rule__Property__NullableAssignment_1 : ( ( 'nullable' ) ) ;
    public final void rule__Property__NullableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3782:1: ( ( ( 'nullable' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3783:1: ( ( 'nullable' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3783:1: ( ( 'nullable' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3784:1: ( 'nullable' )
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3785:1: ( 'nullable' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3786:1: 'nullable'
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Property__NullableAssignment_17495); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3801:1: rule__Property__DerivedAssignment_2_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3805:1: ( ( ( 'derived' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3806:1: ( ( 'derived' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3806:1: ( ( 'derived' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3807:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3808:1: ( 'derived' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3809:1: 'derived'
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Property__DerivedAssignment_2_07539); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3824:1: rule__Property__WritableAssignment_2_1 : ( ( 'writable' ) ) ;
    public final void rule__Property__WritableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3828:1: ( ( ( 'writable' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3829:1: ( ( 'writable' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3829:1: ( ( 'writable' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3830:1: ( 'writable' )
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3831:1: ( 'writable' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3832:1: 'writable'
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Property__WritableAssignment_2_17583); 
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


    // $ANTLR start rule__Property__ColumnAssignment_3_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3847:1: rule__Property__ColumnAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Property__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3851:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3852:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3852:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3853:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getColumnIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__ColumnAssignment_3_17622); 
             after(grammarAccess.getPropertyAccess().getColumnIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Property__ColumnAssignment_3_1


    // $ANTLR start rule__BoolProperty__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3862:1: rule__BoolProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BoolProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3866:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3867:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3867:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3868:1: RULE_STRING
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BoolProperty__DescriptionAssignment_07653); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3877:1: rule__BoolProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__BoolProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3881:1: ( ( ( 'boolean' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3882:1: ( ( 'boolean' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3882:1: ( ( 'boolean' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3883:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3884:1: ( 'boolean' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3885:1: 'boolean'
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__BoolProperty__DataTypeAssignment_17689); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3900:1: rule__BoolProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BoolProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3904:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3905:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3905:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3906:1: RULE_ID
            {
             before(grammarAccess.getBoolPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolProperty__NameAssignment_27728); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3915:1: rule__BoolProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__BoolProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3919:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3920:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3920:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3921:1: ( 'default' )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3922:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3923:1: 'default'
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,41,FOLLOW_41_in_rule__BoolProperty__HasDefaultAssignment_3_07764); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3938:1: rule__BoolProperty__DefaultValueAssignment_3_1_0 : ( ( 'true' ) ) ;
    public final void rule__BoolProperty__DefaultValueAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3942:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3943:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3943:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3944:1: ( 'true' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3945:1: ( 'true' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3946:1: 'true'
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            match(input,42,FOLLOW_42_in_rule__BoolProperty__DefaultValueAssignment_3_1_07808); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3961:1: rule__StringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3965:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3966:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3966:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3967:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__DescriptionAssignment_07847); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3976:1: rule__StringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__StringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3980:1: ( ( ( 'string' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:1: ( ( 'string' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:1: ( ( 'string' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3982:1: ( 'string' )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:1: ( 'string' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3984:1: 'string'
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__StringProperty__DataTypeAssignment_17883); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3999:1: rule__StringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4003:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4004:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4004:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4005:1: RULE_ID
            {
             before(grammarAccess.getStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringProperty__NameAssignment_27922); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4014:1: rule__StringProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__StringProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4018:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4019:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4019:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4020:1: ( 'default' )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4021:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4022:1: 'default'
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,41,FOLLOW_41_in_rule__StringProperty__HasDefaultAssignment_3_07958); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4037:1: rule__StringProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4041:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4042:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4042:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4043:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__DefaultValueAssignment_3_17997); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4052:1: rule__StringProperty__MinLengthAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MinLengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4056:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4057:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4057:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4058:1: RULE_INT
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringProperty__MinLengthAssignment_4_18028); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4067:1: rule__StringProperty__MaxLengthAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MaxLengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4071:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4072:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4072:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4073:1: RULE_INT
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringProperty__MaxLengthAssignment_5_18059); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4082:1: rule__StringProperty__RegularExpressionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__RegularExpressionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4086:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4087:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4087:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4088:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__RegularExpressionAssignment_6_18090); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4097:1: rule__DateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4101:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4102:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4102:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4103:1: RULE_STRING
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DescriptionAssignment_08121); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4112:1: rule__DateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4116:1: ( ( ( 'datetime' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4117:1: ( ( 'datetime' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4117:1: ( ( 'datetime' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4118:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4119:1: ( 'datetime' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4120:1: 'datetime'
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__DateTimeProperty__DataTypeAssignment_18157); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4135:1: rule__DateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4139:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4140:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4140:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4141:1: RULE_ID
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateTimeProperty__NameAssignment_28196); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4150:1: rule__DateTimeProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4154:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4155:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4155:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4156:1: ( 'default' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4157:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4158:1: 'default'
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,41,FOLLOW_41_in_rule__DateTimeProperty__HasDefaultAssignment_3_08232); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4173:1: rule__DateTimeProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4177:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4178:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4178:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4179:1: RULE_STRING
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DefaultValueAssignment_3_18271); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4188:1: rule__IntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__IntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4192:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4193:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4193:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4194:1: RULE_STRING
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IntegerProperty__DescriptionAssignment_08302); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4203:1: rule__IntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__IntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4207:1: ( ( ( 'integer' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4208:1: ( ( 'integer' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4208:1: ( ( 'integer' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4209:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4210:1: ( 'integer' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4211:1: 'integer'
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__IntegerProperty__DataTypeAssignment_18338); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4226:1: rule__IntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4230:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4231:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4231:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4232:1: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerProperty__NameAssignment_28377); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4241:1: rule__IntegerProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__IntegerProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4245:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4246:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4246:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4247:1: ( 'default' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4248:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4249:1: 'default'
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,41,FOLLOW_41_in_rule__IntegerProperty__HasDefaultAssignment_3_08413); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4264:1: rule__IntegerProperty__DefaultValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4268:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4269:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4269:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4270:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__DefaultValueAssignment_3_18452); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4279:1: rule__IntegerProperty__MinValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MinValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4283:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4284:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4284:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4285:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__MinValueAssignment_4_18483); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4294:1: rule__IntegerProperty__MaxValueAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MaxValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4298:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4299:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4299:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4300:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__MaxValueAssignment_5_18514); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4309:1: rule__DecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4313:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4314:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4314:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4315:1: RULE_STRING
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecimalProperty__DescriptionAssignment_08545); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4324:1: rule__DecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4328:1: ( ( ( 'decimal' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4329:1: ( ( 'decimal' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4329:1: ( ( 'decimal' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4330:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4331:1: ( 'decimal' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4332:1: 'decimal'
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__DecimalProperty__DataTypeAssignment_18581); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4347:1: rule__DecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4351:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4352:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4352:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4353:1: RULE_ID
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecimalProperty__NameAssignment_28620); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4362:1: rule__EnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4366:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4367:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4367:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4368:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationProperty__DescriptionAssignment_08651); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4377:1: rule__EnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4381:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4382:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4382:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4383:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4384:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4385:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__TypeAssignment_18686); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4396:1: rule__EnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4400:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4401:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4401:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4402:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__NameAssignment_28721); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4411:1: rule__EnumerationProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4415:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4416:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4416:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4417:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4418:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4419:1: 'default'
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,41,FOLLOW_41_in_rule__EnumerationProperty__HasDefaultAssignment_3_08757); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4434:1: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4438:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4439:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4439:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4440:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_18796); 
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
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_entryRuleBusinessClass180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessClass187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__0_in_ruleBusinessClass214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_entryRuleAbstractBusinessRule360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBusinessRule367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractBusinessRule__Alternatives_in_ruleAbstractBusinessRule394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_entryRuleUniqueRule480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueRule487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__0_in_ruleUniqueRule514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_entryRuleBoolProperty600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolProperty607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__0_in_ruleBoolProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_entryRuleStringProperty660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringProperty667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__0_in_ruleStringProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_entryRuleDateTimeProperty720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeProperty727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__0_in_ruleDateTimeProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_entryRuleIntegerProperty780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerProperty787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__0_in_ruleIntegerProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_entryRuleDecimalProperty840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalProperty847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__0_in_ruleDecimalProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_entryRuleEnumerationProperty900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationProperty907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__0_in_ruleEnumerationProperty934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Alternatives_in_ruleMultiplicity971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__TypesAssignment_4_0_in_rule__BusinessDomainModel__Alternatives_41010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__EnumerationsAssignment_4_1_in_rule__BusinessDomainModel__Alternatives_41028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__AssociationsAssignment_4_2_in_rule__BusinessDomainModel__Alternatives_41046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__BidirectionalAssignment_6_0_in_rule__Association__Alternatives_61079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Association__Alternatives_61098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_rule__AbstractBusinessRule__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueRule_in_rule__AbstractBusinessRule__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolProperty_in_rule__Property__Alternatives_01181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringProperty_in_rule__Property__Alternatives_01198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeProperty_in_rule__Property__Alternatives_01215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerProperty_in_rule__Property__Alternatives_01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalProperty_in_rule__Property__Alternatives_01249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationProperty_in_rule__Property__Alternatives_01266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DefaultValueAssignment_3_1_0_in_rule__BoolProperty__Alternatives_3_11298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BoolProperty__Alternatives_3_11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Multiplicity__Alternatives1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Multiplicity__Alternatives1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__DescriptionAssignment_0_in_rule__BusinessDomainModel__Group__01412 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__1_in_rule__BusinessDomainModel__Group__01422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessDomainModel__Group__11451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__2_in_rule__BusinessDomainModel__Group__11461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__NameAssignment_2_in_rule__BusinessDomainModel__Group__21489 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__3_in_rule__BusinessDomainModel__Group__21498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessDomainModel__Group__31527 = new BitSet(new long[]{0x0000000004220012L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__4_in_rule__BusinessDomainModel__Group__31537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Alternatives_4_in_rule__BusinessDomainModel__Group__41565 = new BitSet(new long[]{0x0000000004220012L});
    public static final BitSet FOLLOW_rule__Association__DescriptionAssignment_0_in_rule__Association__Group__01610 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Association__Group__11649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_2_in_rule__Association__Group__21687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__21696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceRoleNameAssignment_3_in_rule__Association__Group__31724 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__31733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_4__0_in_rule__Association__Group__41761 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Association__Group__5_in_rule__Association__Group__41771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceMultiplicityAssignment_5_in_rule__Association__Group__51799 = new BitSet(new long[]{0x0000000800000800L});
    public static final BitSet FOLLOW_rule__Association__Group__6_in_rule__Association__Group__51808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Alternatives_6_in_rule__Association__Group__61836 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Association__Group__7_in_rule__Association__Group__61845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetMultiplicityAssignment_7_in_rule__Association__Group__71873 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Association__Group__8_in_rule__Association__Group__71882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_8__0_in_rule__Association__Group__81910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__9_in_rule__Association__Group__81920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_9_in_rule__Association__Group__91948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__10_in_rule__Association__Group__91957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetRoleNameAssignment_10_in_rule__Association__Group__101985 = new BitSet(new long[]{0x0000001000050000L});
    public static final BitSet FOLLOW_rule__Association__Group__11_in_rule__Association__Group__101994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_11__0_in_rule__Association__Group__112022 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_rule__Association__Group__12_in_rule__Association__Group__112032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_12__0_in_rule__Association__Group__122060 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Association__Group__13_in_rule__Association__Group__122070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Association__Group__132099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Association__Group_4__02163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_4__1_in_rule__Association__Group_4__02173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceForeignKeyAssignment_4_1_in_rule__Association__Group_4__12201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Association__Group_8__02240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_8__1_in_rule__Association__Group_8__02250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TableAssignment_8_1_in_rule__Association__Group_8__12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Association__Group_11__02317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_11__1_in_rule__Association__Group_11__02327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetForeignKeyAssignment_11_1_in_rule__Association__Group_11__12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__OrderedAssignment_12_0_in_rule__Association__Group_12__02393 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Association__Group_12__1_in_rule__Association__Group_12__02402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_12_1__0_in_rule__Association__Group_12__12430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Association__Group_12_1__02470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_12_1__1_in_rule__Association__Group_12_1__02480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__OrderingColumnAssignment_12_1_1_in_rule__Association__Group_12_1__12508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__DescriptionAssignment_0_in_rule__BusinessClass__Group__02546 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__1_in_rule__BusinessClass__Group__02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessClass__Group__12585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__2_in_rule__BusinessClass__Group__12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__NameAssignment_2_in_rule__BusinessClass__Group__22623 = new BitSet(new long[]{0x0000000001480000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__3_in_rule__BusinessClass__Group__22632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_3__0_in_rule__BusinessClass__Group__32660 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__4_in_rule__BusinessClass__Group__32670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_4__0_in_rule__BusinessClass__Group__42698 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__5_in_rule__BusinessClass__Group__42708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessClass__Group__52737 = new BitSet(new long[]{0x0000790002800030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__6_in_rule__BusinessClass__Group__52747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__PropertiesAssignment_6_in_rule__BusinessClass__Group__62775 = new BitSet(new long[]{0x0000790002800030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__7_in_rule__BusinessClass__Group__62785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_7__0_in_rule__BusinessClass__Group__72813 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__8_in_rule__BusinessClass__Group__72823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BusinessClass__Group__82852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BusinessClass__Group_3__02906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_3__1_in_rule__BusinessClass__Group_3__02916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__SuperclassAssignment_3_1_in_rule__BusinessClass__Group_3__12944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BusinessClass__Group_4__02983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_4__1_in_rule__BusinessClass__Group_4__02993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__TableAssignment_4_1_in_rule__BusinessClass__Group_4__13021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BusinessClass__Group_7__03060 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_7__1_in_rule__BusinessClass__Group_7__03070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessClass__Group_7__13099 = new BitSet(new long[]{0x0000000010800030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_7__2_in_rule__BusinessClass__Group_7__13109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__BusinessRulesAssignment_7_2_in_rule__BusinessClass__Group_7__23137 = new BitSet(new long[]{0x0000000010800030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_7__3_in_rule__BusinessClass__Group_7__23147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BusinessClass__Group_7__33176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__DescriptionAssignment_0_in_rule__Enumeration__Group__03219 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__03229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Enumeration__Group__13258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__13268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_2_in_rule__Enumeration__Group__23296 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__23305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Enumeration__Group__33334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43374 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43386 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Enumeration__Group__53427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__03474 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__03483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__13511 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__13520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumerationLiteral__Group__23549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnumerationLiteral__Group_1__03591 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__13629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__DescriptionAssignment_0_in_rule__BusinessRule__Group__03667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__13705 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessRule__Group__23743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__DescriptionAssignment_0_in_rule__UniqueRule__Group__03784 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__1_in_rule__UniqueRule__Group__03794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UniqueRule__Group__13823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__2_in_rule__UniqueRule__Group__13833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__NameAssignment_2_in_rule__UniqueRule__Group__23861 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__3_in_rule__UniqueRule__Group__23870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UniqueRule__Group__33899 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__4_in_rule__UniqueRule__Group__33909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__PropertiesAssignment_4_in_rule__UniqueRule__Group__43937 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__5_in_rule__UniqueRule__Group__43946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group_5__0_in_rule__UniqueRule__Group__53974 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__6_in_rule__UniqueRule__Group__53984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UniqueRule__Group__64013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UniqueRule__Group_5__04063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group_5__1_in_rule__UniqueRule__Group_5__04073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__PropertiesAssignment_5_1_in_rule__UniqueRule__Group_5__14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__04139 = new BitSet(new long[]{0x0000006000110000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NullableAssignment_1_in_rule__Property__Group__14176 = new BitSet(new long[]{0x0000004000110000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__24214 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__34252 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Property__Group__44291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DerivedAssignment_2_0_in_rule__Property__Group_2__04336 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__04345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__WritableAssignment_2_1_in_rule__Property__Group_2__14373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Property__Group_3__04413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__04423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ColumnAssignment_3_1_in_rule__Property__Group_3__14451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DescriptionAssignment_0_in_rule__BoolProperty__Group__04489 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__1_in_rule__BoolProperty__Group__04499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DataTypeAssignment_1_in_rule__BoolProperty__Group__14527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__2_in_rule__BoolProperty__Group__14536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__NameAssignment_2_in_rule__BoolProperty__Group__24564 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__3_in_rule__BoolProperty__Group__24573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group_3__0_in_rule__BoolProperty__Group__34601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__HasDefaultAssignment_3_0_in_rule__BoolProperty__Group_3__04644 = new BitSet(new long[]{0x0000040000001000L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group_3__1_in_rule__BoolProperty__Group_3__04653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Alternatives_3_1_in_rule__BoolProperty__Group_3__14681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DescriptionAssignment_0_in_rule__StringProperty__Group__04719 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__1_in_rule__StringProperty__Group__04729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DataTypeAssignment_1_in_rule__StringProperty__Group__14757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__2_in_rule__StringProperty__Group__14766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__NameAssignment_2_in_rule__StringProperty__Group__24794 = new BitSet(new long[]{0x00000201C0000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__3_in_rule__StringProperty__Group__24803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_3__0_in_rule__StringProperty__Group__34831 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__4_in_rule__StringProperty__Group__34841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_4__0_in_rule__StringProperty__Group__44869 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__5_in_rule__StringProperty__Group__44879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_5__0_in_rule__StringProperty__Group__54907 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__6_in_rule__StringProperty__Group__54917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_6__0_in_rule__StringProperty__Group__64945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__HasDefaultAssignment_3_0_in_rule__StringProperty__Group_3__04994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_3__1_in_rule__StringProperty__Group_3__05003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DefaultValueAssignment_3_1_in_rule__StringProperty__Group_3__15031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StringProperty__Group_4__05070 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_4__1_in_rule__StringProperty__Group_4__05080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__MinLengthAssignment_4_1_in_rule__StringProperty__Group_4__15108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StringProperty__Group_5__05147 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_5__1_in_rule__StringProperty__Group_5__05157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__MaxLengthAssignment_5_1_in_rule__StringProperty__Group_5__15185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringProperty__Group_6__05224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_6__1_in_rule__StringProperty__Group_6__05234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__RegularExpressionAssignment_6_1_in_rule__StringProperty__Group_6__15262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DescriptionAssignment_0_in_rule__DateTimeProperty__Group__05300 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__1_in_rule__DateTimeProperty__Group__05310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DataTypeAssignment_1_in_rule__DateTimeProperty__Group__15338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__2_in_rule__DateTimeProperty__Group__15347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__NameAssignment_2_in_rule__DateTimeProperty__Group__25375 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__3_in_rule__DateTimeProperty__Group__25384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group_3__0_in_rule__DateTimeProperty__Group__35412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__HasDefaultAssignment_3_0_in_rule__DateTimeProperty__Group_3__05455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group_3__1_in_rule__DateTimeProperty__Group_3__05464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DefaultValueAssignment_3_1_in_rule__DateTimeProperty__Group_3__15492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DescriptionAssignment_0_in_rule__IntegerProperty__Group__05530 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__1_in_rule__IntegerProperty__Group__05540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DataTypeAssignment_1_in_rule__IntegerProperty__Group__15568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__2_in_rule__IntegerProperty__Group__15577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__NameAssignment_2_in_rule__IntegerProperty__Group__25605 = new BitSet(new long[]{0x0000020600000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__3_in_rule__IntegerProperty__Group__25614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_3__0_in_rule__IntegerProperty__Group__35642 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__4_in_rule__IntegerProperty__Group__35652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_4__0_in_rule__IntegerProperty__Group__45680 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__5_in_rule__IntegerProperty__Group__45690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_5__0_in_rule__IntegerProperty__Group__55718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__HasDefaultAssignment_3_0_in_rule__IntegerProperty__Group_3__05765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_3__1_in_rule__IntegerProperty__Group_3__05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DefaultValueAssignment_3_1_in_rule__IntegerProperty__Group_3__15802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntegerProperty__Group_4__05841 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_4__1_in_rule__IntegerProperty__Group_4__05851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__MinValueAssignment_4_1_in_rule__IntegerProperty__Group_4__15879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerProperty__Group_5__05918 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_5__1_in_rule__IntegerProperty__Group_5__05928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__MaxValueAssignment_5_1_in_rule__IntegerProperty__Group_5__15956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__DescriptionAssignment_0_in_rule__DecimalProperty__Group__05994 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__1_in_rule__DecimalProperty__Group__06004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__DataTypeAssignment_1_in_rule__DecimalProperty__Group__16032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__2_in_rule__DecimalProperty__Group__16041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__NameAssignment_2_in_rule__DecimalProperty__Group__26069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__DescriptionAssignment_0_in_rule__EnumerationProperty__Group__06109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__1_in_rule__EnumerationProperty__Group__06119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__TypeAssignment_1_in_rule__EnumerationProperty__Group__16147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__2_in_rule__EnumerationProperty__Group__16156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__NameAssignment_2_in_rule__EnumerationProperty__Group__26184 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__3_in_rule__EnumerationProperty__Group__26193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group_3__0_in_rule__EnumerationProperty__Group__36221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__HasDefaultAssignment_3_0_in_rule__EnumerationProperty__Group_3__06264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group_3__1_in_rule__EnumerationProperty__Group_3__06273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationProperty__Group_3__16301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessDomainModel__DescriptionAssignment_06339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessDomainModel__NameAssignment_26370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_rule__BusinessDomainModel__TypesAssignment_4_06401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__BusinessDomainModel__EnumerationsAssignment_4_16432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__BusinessDomainModel__AssociationsAssignment_4_26463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__DescriptionAssignment_06494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_26529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceRoleNameAssignment_36564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceForeignKeyAssignment_4_16595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Association__SourceMultiplicityAssignment_56626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Association__BidirectionalAssignment_6_06662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Association__TargetMultiplicityAssignment_76701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TableAssignment_8_16732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_96767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetRoleNameAssignment_106802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetForeignKeyAssignment_11_16833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Association__OrderedAssignment_12_06869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__OrderingColumnAssignment_12_1_16908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessClass__DescriptionAssignment_06939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__NameAssignment_26970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__SuperclassAssignment_3_17005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__TableAssignment_4_17040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__BusinessClass__PropertiesAssignment_67071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_rule__BusinessClass__BusinessRulesAssignment_7_27102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enumeration__DescriptionAssignment_07133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_27164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_47195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_07226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessRule__DescriptionAssignment_07288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_17319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UniqueRule__DescriptionAssignment_07350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__NameAssignment_27381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_47416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_5_17455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Property__NullableAssignment_17495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Property__DerivedAssignment_2_07539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Property__WritableAssignment_2_17583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__ColumnAssignment_3_17622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BoolProperty__DescriptionAssignment_07653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__BoolProperty__DataTypeAssignment_17689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolProperty__NameAssignment_27728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BoolProperty__HasDefaultAssignment_3_07764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__BoolProperty__DefaultValueAssignment_3_1_07808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__DescriptionAssignment_07847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StringProperty__DataTypeAssignment_17883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringProperty__NameAssignment_27922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StringProperty__HasDefaultAssignment_3_07958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__DefaultValueAssignment_3_17997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringProperty__MinLengthAssignment_4_18028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringProperty__MaxLengthAssignment_5_18059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__RegularExpressionAssignment_6_18090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DescriptionAssignment_08121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DateTimeProperty__DataTypeAssignment_18157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateTimeProperty__NameAssignment_28196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DateTimeProperty__HasDefaultAssignment_3_08232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DefaultValueAssignment_3_18271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IntegerProperty__DescriptionAssignment_08302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__IntegerProperty__DataTypeAssignment_18338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerProperty__NameAssignment_28377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IntegerProperty__HasDefaultAssignment_3_08413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__DefaultValueAssignment_3_18452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__MinValueAssignment_4_18483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__MaxValueAssignment_5_18514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecimalProperty__DescriptionAssignment_08545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DecimalProperty__DataTypeAssignment_18581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecimalProperty__NameAssignment_28620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationProperty__DescriptionAssignment_08651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__TypeAssignment_18686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__NameAssignment_28721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumerationProperty__HasDefaultAssignment_3_08757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_18796 = new BitSet(new long[]{0x0000000000000002L});

}