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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'false'", "'many'", "'one'", "'domain'", "';'", "'association'", "'foreign key'", "'references'", "'table'", "'column'", "'class'", "'['", "']'", "'inherits'", "'rules'", "'enumeration'", "'='", "'unique'", "','", "'minlength'", "'maxlength'", "'regexp'", "'min'", "'max'", "'<->'", "'ordered'", "'nullable'", "'derived'", "'writable'", "'boolean'", "'default'", "'true'", "'string'", "'datetime'", "'integer'", "'decimal'"
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


    // $ANTLR start entryRuleIntegerEnumeration
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:141:1: entryRuleIntegerEnumeration : ruleIntegerEnumeration EOF ;
    public final void entryRuleIntegerEnumeration() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:141:29: ( ruleIntegerEnumeration EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:142:1: ruleIntegerEnumeration EOF
            {
             before(grammarAccess.getIntegerEnumerationRule()); 
            pushFollow(FOLLOW_ruleIntegerEnumeration_in_entryRuleIntegerEnumeration240);
            ruleIntegerEnumeration();
            _fsp--;

             after(grammarAccess.getIntegerEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerEnumeration247); 

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
    // $ANTLR end entryRuleIntegerEnumeration


    // $ANTLR start ruleIntegerEnumeration
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:149:1: ruleIntegerEnumeration : ( ( rule__IntegerEnumeration__Group__0 ) ) ;
    public final void ruleIntegerEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:153:2: ( ( ( rule__IntegerEnumeration__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:154:1: ( ( rule__IntegerEnumeration__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:154:1: ( ( rule__IntegerEnumeration__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:155:1: ( rule__IntegerEnumeration__Group__0 )
            {
             before(grammarAccess.getIntegerEnumerationAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:156:1: ( rule__IntegerEnumeration__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:156:2: rule__IntegerEnumeration__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerEnumeration__Group__0_in_ruleIntegerEnumeration274);
            rule__IntegerEnumeration__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntegerEnumerationAccess().getGroup()); 

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
    // $ANTLR end ruleIntegerEnumeration


    // $ANTLR start entryRuleIntegerEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:168:1: entryRuleIntegerEnumerationLiteral : ruleIntegerEnumerationLiteral EOF ;
    public final void entryRuleIntegerEnumerationLiteral() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:168:36: ( ruleIntegerEnumerationLiteral EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:169:1: ruleIntegerEnumerationLiteral EOF
            {
             before(grammarAccess.getIntegerEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerEnumerationLiteral_in_entryRuleIntegerEnumerationLiteral300);
            ruleIntegerEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getIntegerEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerEnumerationLiteral307); 

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
    // $ANTLR end entryRuleIntegerEnumerationLiteral


    // $ANTLR start ruleIntegerEnumerationLiteral
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:176:1: ruleIntegerEnumerationLiteral : ( ( rule__IntegerEnumerationLiteral__Group__0 ) ) ;
    public final void ruleIntegerEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:180:2: ( ( ( rule__IntegerEnumerationLiteral__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:181:1: ( ( rule__IntegerEnumerationLiteral__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:181:1: ( ( rule__IntegerEnumerationLiteral__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:182:1: ( rule__IntegerEnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getIntegerEnumerationLiteralAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:183:1: ( rule__IntegerEnumerationLiteral__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:183:2: rule__IntegerEnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerEnumerationLiteral__Group__0_in_ruleIntegerEnumerationLiteral334);
            rule__IntegerEnumerationLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntegerEnumerationLiteralAccess().getGroup()); 

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
    // $ANTLR end ruleIntegerEnumerationLiteral


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
                case 27:
                    {
                    alt1=2;
                    }
                    break;
                case 17:
                    {
                    alt1=3;
                    }
                    break;
                case 22:
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
            case 22:
                {
                alt1=1;
                }
                break;
            case 27:
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


    // $ANTLR start rule__Association__Alternatives_7
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:516:1: rule__Association__Alternatives_7 : ( ( ( rule__Association__BidirectionalAssignment_7_0 ) ) | ( '->' ) );
    public final void rule__Association__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:520:1: ( ( ( rule__Association__BidirectionalAssignment_7_0 ) ) | ( '->' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("516:1: rule__Association__Alternatives_7 : ( ( ( rule__Association__BidirectionalAssignment_7_0 ) ) | ( '->' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:1: ( ( rule__Association__BidirectionalAssignment_7_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:1: ( ( rule__Association__BidirectionalAssignment_7_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:522:1: ( rule__Association__BidirectionalAssignment_7_0 )
                    {
                     before(grammarAccess.getAssociationAccess().getBidirectionalAssignment_7_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:523:1: ( rule__Association__BidirectionalAssignment_7_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:523:2: rule__Association__BidirectionalAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Association__BidirectionalAssignment_7_0_in_rule__Association__Alternatives_71079);
                    rule__Association__BidirectionalAssignment_7_0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssociationAccess().getBidirectionalAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:6: ( '->' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:6: ( '->' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:528:1: '->'
                    {
                     before(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_7_1()); 
                    match(input,11,FOLLOW_11_in_rule__Association__Alternatives_71098); 
                     after(grammarAccess.getAssociationAccess().getHyphenMinusGreaterThanSignKeyword_7_1()); 

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
    // $ANTLR end rule__Association__Alternatives_7


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

                if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==29) ) {
                    alt3=2;
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
            case 29:
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
                    alt4=2;
                    }
                    break;
                case 47:
                    {
                    alt4=5;
                    }
                    break;
                case 41:
                    {
                    alt4=1;
                    }
                    break;
                case 45:
                    {
                    alt4=3;
                    }
                    break;
                case 46:
                    {
                    alt4=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt4=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("562:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 41:
                {
                alt4=1;
                }
                break;
            case 44:
                {
                alt4=2;
                }
                break;
            case 45:
                {
                alt4=3;
                }
                break;
            case 46:
                {
                alt4=4;
                }
                break;
            case 47:
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

            if ( (LA5_0==43) ) {
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

                if ( (LA8_0==RULE_STRING||LA8_0==17||LA8_0==22||LA8_0==27) ) {
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:855:1: rule__Association__Group__5 : ( ( rule__Association__Group_5__0 )? ) rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:859:1: ( ( ( rule__Association__Group_5__0 )? ) rule__Association__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:860:1: ( ( rule__Association__Group_5__0 )? ) rule__Association__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:860:1: ( ( rule__Association__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:861:1: ( rule__Association__Group_5__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:862:1: ( rule__Association__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:862:2: rule__Association__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_5__0_in_rule__Association__Group__51799);
                    rule__Association__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__6_in_rule__Association__Group__51809);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:873:1: rule__Association__Group__6 : ( ( rule__Association__SourceMultiplicityAssignment_6 ) ) rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:877:1: ( ( ( rule__Association__SourceMultiplicityAssignment_6 ) ) rule__Association__Group__7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:878:1: ( ( rule__Association__SourceMultiplicityAssignment_6 ) ) rule__Association__Group__7
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:878:1: ( ( rule__Association__SourceMultiplicityAssignment_6 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:879:1: ( rule__Association__SourceMultiplicityAssignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:880:1: ( rule__Association__SourceMultiplicityAssignment_6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:880:2: rule__Association__SourceMultiplicityAssignment_6
            {
            pushFollow(FOLLOW_rule__Association__SourceMultiplicityAssignment_6_in_rule__Association__Group__61837);
            rule__Association__SourceMultiplicityAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__7_in_rule__Association__Group__61846);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:891:1: rule__Association__Group__7 : ( ( rule__Association__Alternatives_7 ) ) rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:895:1: ( ( ( rule__Association__Alternatives_7 ) ) rule__Association__Group__8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:896:1: ( ( rule__Association__Alternatives_7 ) ) rule__Association__Group__8
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:896:1: ( ( rule__Association__Alternatives_7 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:897:1: ( rule__Association__Alternatives_7 )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives_7()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:898:1: ( rule__Association__Alternatives_7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:898:2: rule__Association__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Association__Alternatives_7_in_rule__Association__Group__71874);
            rule__Association__Alternatives_7();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAlternatives_7()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__8_in_rule__Association__Group__71883);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:909:1: rule__Association__Group__8 : ( ( rule__Association__TargetMultiplicityAssignment_8 ) ) rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:913:1: ( ( ( rule__Association__TargetMultiplicityAssignment_8 ) ) rule__Association__Group__9 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:914:1: ( ( rule__Association__TargetMultiplicityAssignment_8 ) ) rule__Association__Group__9
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:914:1: ( ( rule__Association__TargetMultiplicityAssignment_8 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:915:1: ( rule__Association__TargetMultiplicityAssignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_8()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:916:1: ( rule__Association__TargetMultiplicityAssignment_8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:916:2: rule__Association__TargetMultiplicityAssignment_8
            {
            pushFollow(FOLLOW_rule__Association__TargetMultiplicityAssignment_8_in_rule__Association__Group__81911);
            rule__Association__TargetMultiplicityAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_8()); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:927:1: rule__Association__Group__9 : ( ( rule__Association__Group_9__0 )? ) rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:931:1: ( ( ( rule__Association__Group_9__0 )? ) rule__Association__Group__10 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:932:1: ( ( rule__Association__Group_9__0 )? ) rule__Association__Group__10
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:932:1: ( ( rule__Association__Group_9__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:933:1: ( rule__Association__Group_9__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_9()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:934:1: ( rule__Association__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:934:2: rule__Association__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_9__0_in_rule__Association__Group__91948);
                    rule__Association__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_9()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__10_in_rule__Association__Group__91958);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:945:1: rule__Association__Group__10 : ( ( rule__Association__TargetAssignment_10 ) ) rule__Association__Group__11 ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:949:1: ( ( ( rule__Association__TargetAssignment_10 ) ) rule__Association__Group__11 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:950:1: ( ( rule__Association__TargetAssignment_10 ) ) rule__Association__Group__11
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:950:1: ( ( rule__Association__TargetAssignment_10 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:951:1: ( rule__Association__TargetAssignment_10 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_10()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:952:1: ( rule__Association__TargetAssignment_10 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:952:2: rule__Association__TargetAssignment_10
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_10_in_rule__Association__Group__101986);
            rule__Association__TargetAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__11_in_rule__Association__Group__101995);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:963:1: rule__Association__Group__11 : ( ( rule__Association__TargetRoleNameAssignment_11 ) ) rule__Association__Group__12 ;
    public final void rule__Association__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:967:1: ( ( ( rule__Association__TargetRoleNameAssignment_11 ) ) rule__Association__Group__12 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:968:1: ( ( rule__Association__TargetRoleNameAssignment_11 ) ) rule__Association__Group__12
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:968:1: ( ( rule__Association__TargetRoleNameAssignment_11 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:969:1: ( rule__Association__TargetRoleNameAssignment_11 )
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_11()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:970:1: ( rule__Association__TargetRoleNameAssignment_11 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:970:2: rule__Association__TargetRoleNameAssignment_11
            {
            pushFollow(FOLLOW_rule__Association__TargetRoleNameAssignment_11_in_rule__Association__Group__112023);
            rule__Association__TargetRoleNameAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_11()); 

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

            if ( (LA13_0==18) ) {
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:999:1: rule__Association__Group__13 : ( ( rule__Association__Group_13__0 )? ) rule__Association__Group__14 ;
    public final void rule__Association__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1003:1: ( ( ( rule__Association__Group_13__0 )? ) rule__Association__Group__14 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1004:1: ( ( rule__Association__Group_13__0 )? ) rule__Association__Group__14
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1004:1: ( ( rule__Association__Group_13__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1005:1: ( rule__Association__Group_13__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_13()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1006:1: ( rule__Association__Group_13__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1006:2: rule__Association__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_13__0_in_rule__Association__Group__132098);
                    rule__Association__Group_13__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_13()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__14_in_rule__Association__Group__132108);
            rule__Association__Group__14();
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
    // $ANTLR end rule__Association__Group__13


    // $ANTLR start rule__Association__Group__14
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1017:1: rule__Association__Group__14 : ( ( rule__Association__Group_14__0 )? ) rule__Association__Group__15 ;
    public final void rule__Association__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1021:1: ( ( ( rule__Association__Group_14__0 )? ) rule__Association__Group__15 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1022:1: ( ( rule__Association__Group_14__0 )? ) rule__Association__Group__15
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1022:1: ( ( rule__Association__Group_14__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1023:1: ( rule__Association__Group_14__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_14()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1024:1: ( rule__Association__Group_14__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1024:2: rule__Association__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_14__0_in_rule__Association__Group__142136);
                    rule__Association__Group_14__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_14()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__15_in_rule__Association__Group__142146);
            rule__Association__Group__15();
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
    // $ANTLR end rule__Association__Group__14


    // $ANTLR start rule__Association__Group__15
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1035:1: rule__Association__Group__15 : ( ';' ) ;
    public final void rule__Association__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1039:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1040:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1040:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1041:1: ';'
            {
             before(grammarAccess.getAssociationAccess().getSemicolonKeyword_15()); 
            match(input,16,FOLLOW_16_in_rule__Association__Group__152175); 
             after(grammarAccess.getAssociationAccess().getSemicolonKeyword_15()); 

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
    // $ANTLR end rule__Association__Group__15


    // $ANTLR start rule__Association__Group_4__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1086:1: rule__Association__Group_4__0 : ( 'foreign key' ) rule__Association__Group_4__1 ;
    public final void rule__Association__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1090:1: ( ( 'foreign key' ) rule__Association__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1091:1: ( 'foreign key' ) rule__Association__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1091:1: ( 'foreign key' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1092:1: 'foreign key'
            {
             before(grammarAccess.getAssociationAccess().getForeignKeyKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Association__Group_4__02243); 
             after(grammarAccess.getAssociationAccess().getForeignKeyKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_4__1_in_rule__Association__Group_4__02253);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1106:1: rule__Association__Group_4__1 : ( ( rule__Association__SourceForeignKeyAssignment_4_1 ) ) ;
    public final void rule__Association__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1110:1: ( ( ( rule__Association__SourceForeignKeyAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1111:1: ( ( rule__Association__SourceForeignKeyAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1111:1: ( ( rule__Association__SourceForeignKeyAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1112:1: ( rule__Association__SourceForeignKeyAssignment_4_1 )
            {
             before(grammarAccess.getAssociationAccess().getSourceForeignKeyAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1113:1: ( rule__Association__SourceForeignKeyAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1113:2: rule__Association__SourceForeignKeyAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Association__SourceForeignKeyAssignment_4_1_in_rule__Association__Group_4__12281);
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


    // $ANTLR start rule__Association__Group_5__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1127:1: rule__Association__Group_5__0 : ( 'references' ) rule__Association__Group_5__1 ;
    public final void rule__Association__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1131:1: ( ( 'references' ) rule__Association__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1132:1: ( 'references' ) rule__Association__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1132:1: ( 'references' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1133:1: 'references'
            {
             before(grammarAccess.getAssociationAccess().getReferencesKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__Association__Group_5__02320); 
             after(grammarAccess.getAssociationAccess().getReferencesKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_5__1_in_rule__Association__Group_5__02330);
            rule__Association__Group_5__1();
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
    // $ANTLR end rule__Association__Group_5__0


    // $ANTLR start rule__Association__Group_5__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1147:1: rule__Association__Group_5__1 : ( ( rule__Association__SourceAlternateKeyAssignment_5_1 ) ) ;
    public final void rule__Association__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1151:1: ( ( ( rule__Association__SourceAlternateKeyAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1152:1: ( ( rule__Association__SourceAlternateKeyAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1152:1: ( ( rule__Association__SourceAlternateKeyAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1153:1: ( rule__Association__SourceAlternateKeyAssignment_5_1 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAlternateKeyAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1154:1: ( rule__Association__SourceAlternateKeyAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1154:2: rule__Association__SourceAlternateKeyAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Association__SourceAlternateKeyAssignment_5_1_in_rule__Association__Group_5__12358);
            rule__Association__SourceAlternateKeyAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAlternateKeyAssignment_5_1()); 

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
    // $ANTLR end rule__Association__Group_5__1


    // $ANTLR start rule__Association__Group_9__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1168:1: rule__Association__Group_9__0 : ( 'table' ) rule__Association__Group_9__1 ;
    public final void rule__Association__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1172:1: ( ( 'table' ) rule__Association__Group_9__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1173:1: ( 'table' ) rule__Association__Group_9__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1173:1: ( 'table' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1174:1: 'table'
            {
             before(grammarAccess.getAssociationAccess().getTableKeyword_9_0()); 
            match(input,20,FOLLOW_20_in_rule__Association__Group_9__02397); 
             after(grammarAccess.getAssociationAccess().getTableKeyword_9_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_9__1_in_rule__Association__Group_9__02407);
            rule__Association__Group_9__1();
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
    // $ANTLR end rule__Association__Group_9__0


    // $ANTLR start rule__Association__Group_9__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1188:1: rule__Association__Group_9__1 : ( ( rule__Association__TableAssignment_9_1 ) ) ;
    public final void rule__Association__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1192:1: ( ( ( rule__Association__TableAssignment_9_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1193:1: ( ( rule__Association__TableAssignment_9_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1193:1: ( ( rule__Association__TableAssignment_9_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1194:1: ( rule__Association__TableAssignment_9_1 )
            {
             before(grammarAccess.getAssociationAccess().getTableAssignment_9_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1195:1: ( rule__Association__TableAssignment_9_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1195:2: rule__Association__TableAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Association__TableAssignment_9_1_in_rule__Association__Group_9__12435);
            rule__Association__TableAssignment_9_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTableAssignment_9_1()); 

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
    // $ANTLR end rule__Association__Group_9__1


    // $ANTLR start rule__Association__Group_12__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1209:1: rule__Association__Group_12__0 : ( 'foreign key' ) rule__Association__Group_12__1 ;
    public final void rule__Association__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1213:1: ( ( 'foreign key' ) rule__Association__Group_12__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1214:1: ( 'foreign key' ) rule__Association__Group_12__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1214:1: ( 'foreign key' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1215:1: 'foreign key'
            {
             before(grammarAccess.getAssociationAccess().getForeignKeyKeyword_12_0()); 
            match(input,18,FOLLOW_18_in_rule__Association__Group_12__02474); 
             after(grammarAccess.getAssociationAccess().getForeignKeyKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_12__1_in_rule__Association__Group_12__02484);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1229:1: rule__Association__Group_12__1 : ( ( rule__Association__TargetForeignKeyAssignment_12_1 ) ) ;
    public final void rule__Association__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1233:1: ( ( ( rule__Association__TargetForeignKeyAssignment_12_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1234:1: ( ( rule__Association__TargetForeignKeyAssignment_12_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1234:1: ( ( rule__Association__TargetForeignKeyAssignment_12_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1235:1: ( rule__Association__TargetForeignKeyAssignment_12_1 )
            {
             before(grammarAccess.getAssociationAccess().getTargetForeignKeyAssignment_12_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1236:1: ( rule__Association__TargetForeignKeyAssignment_12_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1236:2: rule__Association__TargetForeignKeyAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Association__TargetForeignKeyAssignment_12_1_in_rule__Association__Group_12__12512);
            rule__Association__TargetForeignKeyAssignment_12_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetForeignKeyAssignment_12_1()); 

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


    // $ANTLR start rule__Association__Group_13__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1250:1: rule__Association__Group_13__0 : ( 'references' ) rule__Association__Group_13__1 ;
    public final void rule__Association__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1254:1: ( ( 'references' ) rule__Association__Group_13__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1255:1: ( 'references' ) rule__Association__Group_13__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1255:1: ( 'references' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1256:1: 'references'
            {
             before(grammarAccess.getAssociationAccess().getReferencesKeyword_13_0()); 
            match(input,19,FOLLOW_19_in_rule__Association__Group_13__02551); 
             after(grammarAccess.getAssociationAccess().getReferencesKeyword_13_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_13__1_in_rule__Association__Group_13__02561);
            rule__Association__Group_13__1();
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
    // $ANTLR end rule__Association__Group_13__0


    // $ANTLR start rule__Association__Group_13__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1270:1: rule__Association__Group_13__1 : ( ( rule__Association__TargetAlternateKeyAssignment_13_1 ) ) ;
    public final void rule__Association__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1274:1: ( ( ( rule__Association__TargetAlternateKeyAssignment_13_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1275:1: ( ( rule__Association__TargetAlternateKeyAssignment_13_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1275:1: ( ( rule__Association__TargetAlternateKeyAssignment_13_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1276:1: ( rule__Association__TargetAlternateKeyAssignment_13_1 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAlternateKeyAssignment_13_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1277:1: ( rule__Association__TargetAlternateKeyAssignment_13_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1277:2: rule__Association__TargetAlternateKeyAssignment_13_1
            {
            pushFollow(FOLLOW_rule__Association__TargetAlternateKeyAssignment_13_1_in_rule__Association__Group_13__12589);
            rule__Association__TargetAlternateKeyAssignment_13_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAlternateKeyAssignment_13_1()); 

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
    // $ANTLR end rule__Association__Group_13__1


    // $ANTLR start rule__Association__Group_14__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1291:1: rule__Association__Group_14__0 : ( ( rule__Association__OrderedAssignment_14_0 ) ) rule__Association__Group_14__1 ;
    public final void rule__Association__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1295:1: ( ( ( rule__Association__OrderedAssignment_14_0 ) ) rule__Association__Group_14__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1296:1: ( ( rule__Association__OrderedAssignment_14_0 ) ) rule__Association__Group_14__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1296:1: ( ( rule__Association__OrderedAssignment_14_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1297:1: ( rule__Association__OrderedAssignment_14_0 )
            {
             before(grammarAccess.getAssociationAccess().getOrderedAssignment_14_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1298:1: ( rule__Association__OrderedAssignment_14_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1298:2: rule__Association__OrderedAssignment_14_0
            {
            pushFollow(FOLLOW_rule__Association__OrderedAssignment_14_0_in_rule__Association__Group_14__02627);
            rule__Association__OrderedAssignment_14_0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getOrderedAssignment_14_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_14__1_in_rule__Association__Group_14__02636);
            rule__Association__Group_14__1();
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
    // $ANTLR end rule__Association__Group_14__0


    // $ANTLR start rule__Association__Group_14__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1309:1: rule__Association__Group_14__1 : ( ( rule__Association__Group_14_1__0 )? ) ;
    public final void rule__Association__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1313:1: ( ( ( rule__Association__Group_14_1__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1314:1: ( ( rule__Association__Group_14_1__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1314:1: ( ( rule__Association__Group_14_1__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1315:1: ( rule__Association__Group_14_1__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_14_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1316:1: ( rule__Association__Group_14_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1316:2: rule__Association__Group_14_1__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_14_1__0_in_rule__Association__Group_14__12664);
                    rule__Association__Group_14_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_14_1()); 

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
    // $ANTLR end rule__Association__Group_14__1


    // $ANTLR start rule__Association__Group_14_1__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1330:1: rule__Association__Group_14_1__0 : ( 'column' ) rule__Association__Group_14_1__1 ;
    public final void rule__Association__Group_14_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1334:1: ( ( 'column' ) rule__Association__Group_14_1__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1335:1: ( 'column' ) rule__Association__Group_14_1__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1335:1: ( 'column' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1336:1: 'column'
            {
             before(grammarAccess.getAssociationAccess().getColumnKeyword_14_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Association__Group_14_1__02704); 
             after(grammarAccess.getAssociationAccess().getColumnKeyword_14_1_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group_14_1__1_in_rule__Association__Group_14_1__02714);
            rule__Association__Group_14_1__1();
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
    // $ANTLR end rule__Association__Group_14_1__0


    // $ANTLR start rule__Association__Group_14_1__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1350:1: rule__Association__Group_14_1__1 : ( ( rule__Association__OrderingColumnAssignment_14_1_1 ) ) ;
    public final void rule__Association__Group_14_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1354:1: ( ( ( rule__Association__OrderingColumnAssignment_14_1_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1355:1: ( ( rule__Association__OrderingColumnAssignment_14_1_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1355:1: ( ( rule__Association__OrderingColumnAssignment_14_1_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1356:1: ( rule__Association__OrderingColumnAssignment_14_1_1 )
            {
             before(grammarAccess.getAssociationAccess().getOrderingColumnAssignment_14_1_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1357:1: ( rule__Association__OrderingColumnAssignment_14_1_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1357:2: rule__Association__OrderingColumnAssignment_14_1_1
            {
            pushFollow(FOLLOW_rule__Association__OrderingColumnAssignment_14_1_1_in_rule__Association__Group_14_1__12742);
            rule__Association__OrderingColumnAssignment_14_1_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getOrderingColumnAssignment_14_1_1()); 

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
    // $ANTLR end rule__Association__Group_14_1__1


    // $ANTLR start rule__BusinessClass__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1371:1: rule__BusinessClass__Group__0 : ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 ;
    public final void rule__BusinessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1375:1: ( ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1376:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1376:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1377:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1378:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1378:2: rule__BusinessClass__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__DescriptionAssignment_0_in_rule__BusinessClass__Group__02780);
                    rule__BusinessClass__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__1_in_rule__BusinessClass__Group__02790);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1389:1: rule__BusinessClass__Group__1 : ( 'class' ) rule__BusinessClass__Group__2 ;
    public final void rule__BusinessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1393:1: ( ( 'class' ) rule__BusinessClass__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1394:1: ( 'class' ) rule__BusinessClass__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1394:1: ( 'class' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1395:1: 'class'
            {
             before(grammarAccess.getBusinessClassAccess().getClassKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__BusinessClass__Group__12819); 
             after(grammarAccess.getBusinessClassAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__2_in_rule__BusinessClass__Group__12829);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1409:1: rule__BusinessClass__Group__2 : ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 ;
    public final void rule__BusinessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1413:1: ( ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1414:1: ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1414:1: ( ( rule__BusinessClass__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1415:1: ( rule__BusinessClass__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1416:1: ( rule__BusinessClass__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1416:2: rule__BusinessClass__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessClass__NameAssignment_2_in_rule__BusinessClass__Group__22857);
            rule__BusinessClass__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__3_in_rule__BusinessClass__Group__22866);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1427:1: rule__BusinessClass__Group__3 : ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 ;
    public final void rule__BusinessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1431:1: ( ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1432:1: ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1432:1: ( ( rule__BusinessClass__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1433:1: ( rule__BusinessClass__Group_3__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1434:1: ( rule__BusinessClass__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1434:2: rule__BusinessClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_3__0_in_rule__BusinessClass__Group__32894);
                    rule__BusinessClass__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__4_in_rule__BusinessClass__Group__32904);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1445:1: rule__BusinessClass__Group__4 : ( ( rule__BusinessClass__Group_4__0 )? ) rule__BusinessClass__Group__5 ;
    public final void rule__BusinessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1449:1: ( ( ( rule__BusinessClass__Group_4__0 )? ) rule__BusinessClass__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1450:1: ( ( rule__BusinessClass__Group_4__0 )? ) rule__BusinessClass__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1450:1: ( ( rule__BusinessClass__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1451:1: ( rule__BusinessClass__Group_4__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1452:1: ( rule__BusinessClass__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1452:2: rule__BusinessClass__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_4__0_in_rule__BusinessClass__Group__42932);
                    rule__BusinessClass__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__5_in_rule__BusinessClass__Group__42942);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1463:1: rule__BusinessClass__Group__5 : ( '[' ) rule__BusinessClass__Group__6 ;
    public final void rule__BusinessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1467:1: ( ( '[' ) rule__BusinessClass__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1468:1: ( '[' ) rule__BusinessClass__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1468:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1469:1: '['
            {
             before(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__BusinessClass__Group__52971); 
             after(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__6_in_rule__BusinessClass__Group__52981);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1483:1: rule__BusinessClass__Group__6 : ( ( rule__BusinessClass__PropertiesAssignment_6 )* ) rule__BusinessClass__Group__7 ;
    public final void rule__BusinessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1487:1: ( ( ( rule__BusinessClass__PropertiesAssignment_6 )* ) rule__BusinessClass__Group__7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1488:1: ( ( rule__BusinessClass__PropertiesAssignment_6 )* ) rule__BusinessClass__Group__7
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1488:1: ( ( rule__BusinessClass__PropertiesAssignment_6 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1489:1: ( rule__BusinessClass__PropertiesAssignment_6 )*
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1490:1: ( rule__BusinessClass__PropertiesAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==41||(LA20_0>=44 && LA20_0<=47)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1490:2: rule__BusinessClass__PropertiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClass__PropertiesAssignment_6_in_rule__BusinessClass__Group__63009);
            	    rule__BusinessClass__PropertiesAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__7_in_rule__BusinessClass__Group__63019);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1501:1: rule__BusinessClass__Group__7 : ( ( rule__BusinessClass__Group_7__0 )? ) rule__BusinessClass__Group__8 ;
    public final void rule__BusinessClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1505:1: ( ( ( rule__BusinessClass__Group_7__0 )? ) rule__BusinessClass__Group__8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1506:1: ( ( rule__BusinessClass__Group_7__0 )? ) rule__BusinessClass__Group__8
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1506:1: ( ( rule__BusinessClass__Group_7__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1507:1: ( rule__BusinessClass__Group_7__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_7()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1508:1: ( rule__BusinessClass__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1508:2: rule__BusinessClass__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__BusinessClass__Group_7__0_in_rule__BusinessClass__Group__73047);
                    rule__BusinessClass__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessClassAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group__8_in_rule__BusinessClass__Group__73057);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1519:1: rule__BusinessClass__Group__8 : ( ']' ) ;
    public final void rule__BusinessClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1523:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1524:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1524:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1525:1: ']'
            {
             before(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__BusinessClass__Group__83086); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1556:1: rule__BusinessClass__Group_3__0 : ( 'inherits' ) rule__BusinessClass__Group_3__1 ;
    public final void rule__BusinessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1560:1: ( ( 'inherits' ) rule__BusinessClass__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1561:1: ( 'inherits' ) rule__BusinessClass__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1561:1: ( 'inherits' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1562:1: 'inherits'
            {
             before(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__BusinessClass__Group_3__03140); 
             after(grammarAccess.getBusinessClassAccess().getInheritsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_3__1_in_rule__BusinessClass__Group_3__03150);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1576:1: rule__BusinessClass__Group_3__1 : ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) ;
    public final void rule__BusinessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1580:1: ( ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1581:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1581:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1582:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1583:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1583:2: rule__BusinessClass__SuperclassAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BusinessClass__SuperclassAssignment_3_1_in_rule__BusinessClass__Group_3__13178);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1597:1: rule__BusinessClass__Group_4__0 : ( 'table' ) rule__BusinessClass__Group_4__1 ;
    public final void rule__BusinessClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1601:1: ( ( 'table' ) rule__BusinessClass__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1602:1: ( 'table' ) rule__BusinessClass__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1602:1: ( 'table' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1603:1: 'table'
            {
             before(grammarAccess.getBusinessClassAccess().getTableKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__BusinessClass__Group_4__03217); 
             after(grammarAccess.getBusinessClassAccess().getTableKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_4__1_in_rule__BusinessClass__Group_4__03227);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1617:1: rule__BusinessClass__Group_4__1 : ( ( rule__BusinessClass__TableAssignment_4_1 ) ) ;
    public final void rule__BusinessClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1621:1: ( ( ( rule__BusinessClass__TableAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1622:1: ( ( rule__BusinessClass__TableAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1622:1: ( ( rule__BusinessClass__TableAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1623:1: ( rule__BusinessClass__TableAssignment_4_1 )
            {
             before(grammarAccess.getBusinessClassAccess().getTableAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1624:1: ( rule__BusinessClass__TableAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1624:2: rule__BusinessClass__TableAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BusinessClass__TableAssignment_4_1_in_rule__BusinessClass__Group_4__13255);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1638:1: rule__BusinessClass__Group_7__0 : ( 'rules' ) rule__BusinessClass__Group_7__1 ;
    public final void rule__BusinessClass__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1642:1: ( ( 'rules' ) rule__BusinessClass__Group_7__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1643:1: ( 'rules' ) rule__BusinessClass__Group_7__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1643:1: ( 'rules' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1644:1: 'rules'
            {
             before(grammarAccess.getBusinessClassAccess().getRulesKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__BusinessClass__Group_7__03294); 
             after(grammarAccess.getBusinessClassAccess().getRulesKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_7__1_in_rule__BusinessClass__Group_7__03304);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1658:1: rule__BusinessClass__Group_7__1 : ( '[' ) rule__BusinessClass__Group_7__2 ;
    public final void rule__BusinessClass__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1662:1: ( ( '[' ) rule__BusinessClass__Group_7__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1663:1: ( '[' ) rule__BusinessClass__Group_7__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1663:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1664:1: '['
            {
             before(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,23,FOLLOW_23_in_rule__BusinessClass__Group_7__13333); 
             after(grammarAccess.getBusinessClassAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_7__2_in_rule__BusinessClass__Group_7__13343);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1678:1: rule__BusinessClass__Group_7__2 : ( ( rule__BusinessClass__BusinessRulesAssignment_7_2 )* ) rule__BusinessClass__Group_7__3 ;
    public final void rule__BusinessClass__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1682:1: ( ( ( rule__BusinessClass__BusinessRulesAssignment_7_2 )* ) rule__BusinessClass__Group_7__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1683:1: ( ( rule__BusinessClass__BusinessRulesAssignment_7_2 )* ) rule__BusinessClass__Group_7__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1683:1: ( ( rule__BusinessClass__BusinessRulesAssignment_7_2 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1684:1: ( rule__BusinessClass__BusinessRulesAssignment_7_2 )*
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_7_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1685:1: ( rule__BusinessClass__BusinessRulesAssignment_7_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1685:2: rule__BusinessClass__BusinessRulesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__BusinessClass__BusinessRulesAssignment_7_2_in_rule__BusinessClass__Group_7__23371);
            	    rule__BusinessClass__BusinessRulesAssignment_7_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_7_2()); 

            }

            pushFollow(FOLLOW_rule__BusinessClass__Group_7__3_in_rule__BusinessClass__Group_7__23381);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1696:1: rule__BusinessClass__Group_7__3 : ( ']' ) ;
    public final void rule__BusinessClass__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1700:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1701:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1701:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1702:1: ']'
            {
             before(grammarAccess.getBusinessClassAccess().getRightSquareBracketKeyword_7_3()); 
            match(input,24,FOLLOW_24_in_rule__BusinessClass__Group_7__33410); 
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


    // $ANTLR start rule__IntegerEnumeration__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1723:1: rule__IntegerEnumeration__Group__0 : ( ( rule__IntegerEnumeration__DescriptionAssignment_0 )? ) rule__IntegerEnumeration__Group__1 ;
    public final void rule__IntegerEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1727:1: ( ( ( rule__IntegerEnumeration__DescriptionAssignment_0 )? ) rule__IntegerEnumeration__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1728:1: ( ( rule__IntegerEnumeration__DescriptionAssignment_0 )? ) rule__IntegerEnumeration__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1728:1: ( ( rule__IntegerEnumeration__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1729:1: ( rule__IntegerEnumeration__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getIntegerEnumerationAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1730:1: ( rule__IntegerEnumeration__DescriptionAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1730:2: rule__IntegerEnumeration__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IntegerEnumeration__DescriptionAssignment_0_in_rule__IntegerEnumeration__Group__03453);
                    rule__IntegerEnumeration__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerEnumerationAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerEnumeration__Group__1_in_rule__IntegerEnumeration__Group__03463);
            rule__IntegerEnumeration__Group__1();
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
    // $ANTLR end rule__IntegerEnumeration__Group__0


    // $ANTLR start rule__IntegerEnumeration__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1741:1: rule__IntegerEnumeration__Group__1 : ( 'enumeration' ) rule__IntegerEnumeration__Group__2 ;
    public final void rule__IntegerEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1745:1: ( ( 'enumeration' ) rule__IntegerEnumeration__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1746:1: ( 'enumeration' ) rule__IntegerEnumeration__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1746:1: ( 'enumeration' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1747:1: 'enumeration'
            {
             before(grammarAccess.getIntegerEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__IntegerEnumeration__Group__13492); 
             after(grammarAccess.getIntegerEnumerationAccess().getEnumerationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__IntegerEnumeration__Group__2_in_rule__IntegerEnumeration__Group__13502);
            rule__IntegerEnumeration__Group__2();
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
    // $ANTLR end rule__IntegerEnumeration__Group__1


    // $ANTLR start rule__IntegerEnumeration__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1761:1: rule__IntegerEnumeration__Group__2 : ( ( rule__IntegerEnumeration__NameAssignment_2 ) ) rule__IntegerEnumeration__Group__3 ;
    public final void rule__IntegerEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1765:1: ( ( ( rule__IntegerEnumeration__NameAssignment_2 ) ) rule__IntegerEnumeration__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1766:1: ( ( rule__IntegerEnumeration__NameAssignment_2 ) ) rule__IntegerEnumeration__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1766:1: ( ( rule__IntegerEnumeration__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1767:1: ( rule__IntegerEnumeration__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerEnumerationAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1768:1: ( rule__IntegerEnumeration__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1768:2: rule__IntegerEnumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerEnumeration__NameAssignment_2_in_rule__IntegerEnumeration__Group__23530);
            rule__IntegerEnumeration__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getIntegerEnumerationAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__IntegerEnumeration__Group__3_in_rule__IntegerEnumeration__Group__23539);
            rule__IntegerEnumeration__Group__3();
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
    // $ANTLR end rule__IntegerEnumeration__Group__2


    // $ANTLR start rule__IntegerEnumeration__Group__3
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1779:1: rule__IntegerEnumeration__Group__3 : ( '[' ) rule__IntegerEnumeration__Group__4 ;
    public final void rule__IntegerEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1783:1: ( ( '[' ) rule__IntegerEnumeration__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1784:1: ( '[' ) rule__IntegerEnumeration__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1784:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1785:1: '['
            {
             before(grammarAccess.getIntegerEnumerationAccess().getLeftSquareBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__IntegerEnumeration__Group__33568); 
             after(grammarAccess.getIntegerEnumerationAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__IntegerEnumeration__Group__4_in_rule__IntegerEnumeration__Group__33578);
            rule__IntegerEnumeration__Group__4();
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
    // $ANTLR end rule__IntegerEnumeration__Group__3


    // $ANTLR start rule__IntegerEnumeration__Group__4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1799:1: rule__IntegerEnumeration__Group__4 : ( ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__IntegerEnumeration__Group__5 ;
    public final void rule__IntegerEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1803:1: ( ( ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__IntegerEnumeration__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1804:1: ( ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__IntegerEnumeration__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1804:1: ( ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1805:1: ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1805:1: ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1806:1: ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )
            {
             before(grammarAccess.getIntegerEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1807:1: ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1807:2: rule__IntegerEnumeration__EnumerationLiteralsAssignment_4
            {
            pushFollow(FOLLOW_rule__IntegerEnumeration__EnumerationLiteralsAssignment_4_in_rule__IntegerEnumeration__Group__43608);
            rule__IntegerEnumeration__EnumerationLiteralsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getIntegerEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }

            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1810:1: ( ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1811:1: ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )*
            {
             before(grammarAccess.getIntegerEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1812:1: ( rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1812:2: rule__IntegerEnumeration__EnumerationLiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__IntegerEnumeration__EnumerationLiteralsAssignment_4_in_rule__IntegerEnumeration__Group__43620);
            	    rule__IntegerEnumeration__EnumerationLiteralsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getIntegerEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }


            }

            pushFollow(FOLLOW_rule__IntegerEnumeration__Group__5_in_rule__IntegerEnumeration__Group__43632);
            rule__IntegerEnumeration__Group__5();
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
    // $ANTLR end rule__IntegerEnumeration__Group__4


    // $ANTLR start rule__IntegerEnumeration__Group__5
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1824:1: rule__IntegerEnumeration__Group__5 : ( ']' ) ;
    public final void rule__IntegerEnumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1828:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1829:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1829:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1830:1: ']'
            {
             before(grammarAccess.getIntegerEnumerationAccess().getRightSquareBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__IntegerEnumeration__Group__53661); 
             after(grammarAccess.getIntegerEnumerationAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end rule__IntegerEnumeration__Group__5


    // $ANTLR start rule__IntegerEnumerationLiteral__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1855:1: rule__IntegerEnumerationLiteral__Group__0 : ( ( rule__IntegerEnumerationLiteral__NameAssignment_0 ) ) rule__IntegerEnumerationLiteral__Group__1 ;
    public final void rule__IntegerEnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1859:1: ( ( ( rule__IntegerEnumerationLiteral__NameAssignment_0 ) ) rule__IntegerEnumerationLiteral__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1860:1: ( ( rule__IntegerEnumerationLiteral__NameAssignment_0 ) ) rule__IntegerEnumerationLiteral__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1860:1: ( ( rule__IntegerEnumerationLiteral__NameAssignment_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1861:1: ( rule__IntegerEnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getIntegerEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1862:1: ( rule__IntegerEnumerationLiteral__NameAssignment_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1862:2: rule__IntegerEnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerEnumerationLiteral__NameAssignment_0_in_rule__IntegerEnumerationLiteral__Group__03708);
            rule__IntegerEnumerationLiteral__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerEnumerationLiteralAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerEnumerationLiteral__Group__1_in_rule__IntegerEnumerationLiteral__Group__03717);
            rule__IntegerEnumerationLiteral__Group__1();
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
    // $ANTLR end rule__IntegerEnumerationLiteral__Group__0


    // $ANTLR start rule__IntegerEnumerationLiteral__Group__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1873:1: rule__IntegerEnumerationLiteral__Group__1 : ( ( rule__IntegerEnumerationLiteral__Group_1__0 ) ) rule__IntegerEnumerationLiteral__Group__2 ;
    public final void rule__IntegerEnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1877:1: ( ( ( rule__IntegerEnumerationLiteral__Group_1__0 ) ) rule__IntegerEnumerationLiteral__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1878:1: ( ( rule__IntegerEnumerationLiteral__Group_1__0 ) ) rule__IntegerEnumerationLiteral__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1878:1: ( ( rule__IntegerEnumerationLiteral__Group_1__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1879:1: ( rule__IntegerEnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getIntegerEnumerationLiteralAccess().getGroup_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1880:1: ( rule__IntegerEnumerationLiteral__Group_1__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1880:2: rule__IntegerEnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__IntegerEnumerationLiteral__Group_1__0_in_rule__IntegerEnumerationLiteral__Group__13745);
            rule__IntegerEnumerationLiteral__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getIntegerEnumerationLiteralAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__IntegerEnumerationLiteral__Group__2_in_rule__IntegerEnumerationLiteral__Group__13754);
            rule__IntegerEnumerationLiteral__Group__2();
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
    // $ANTLR end rule__IntegerEnumerationLiteral__Group__1


    // $ANTLR start rule__IntegerEnumerationLiteral__Group__2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1891:1: rule__IntegerEnumerationLiteral__Group__2 : ( ';' ) ;
    public final void rule__IntegerEnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1895:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1896:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1896:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1897:1: ';'
            {
             before(grammarAccess.getIntegerEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__IntegerEnumerationLiteral__Group__23783); 
             after(grammarAccess.getIntegerEnumerationLiteralAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end rule__IntegerEnumerationLiteral__Group__2


    // $ANTLR start rule__IntegerEnumerationLiteral__Group_1__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1916:1: rule__IntegerEnumerationLiteral__Group_1__0 : ( '=' ) rule__IntegerEnumerationLiteral__Group_1__1 ;
    public final void rule__IntegerEnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1920:1: ( ( '=' ) rule__IntegerEnumerationLiteral__Group_1__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1921:1: ( '=' ) rule__IntegerEnumerationLiteral__Group_1__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1921:1: ( '=' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1922:1: '='
            {
             before(grammarAccess.getIntegerEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__IntegerEnumerationLiteral__Group_1__03825); 
             after(grammarAccess.getIntegerEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerEnumerationLiteral__Group_1__1_in_rule__IntegerEnumerationLiteral__Group_1__03835);
            rule__IntegerEnumerationLiteral__Group_1__1();
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
    // $ANTLR end rule__IntegerEnumerationLiteral__Group_1__0


    // $ANTLR start rule__IntegerEnumerationLiteral__Group_1__1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1936:1: rule__IntegerEnumerationLiteral__Group_1__1 : ( ( rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__IntegerEnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1940:1: ( ( ( rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1941:1: ( ( rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1941:1: ( ( rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1942:1: ( rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getIntegerEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1943:1: ( rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1943:2: rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1_in_rule__IntegerEnumerationLiteral__Group_1__13863);
            rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 

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
    // $ANTLR end rule__IntegerEnumerationLiteral__Group_1__1


    // $ANTLR start rule__BusinessRule__Group__0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1957:1: rule__BusinessRule__Group__0 : ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1961:1: ( ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1962:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1962:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1963:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1964:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1964:2: rule__BusinessRule__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BusinessRule__DescriptionAssignment_0_in_rule__BusinessRule__Group__03901);
                    rule__BusinessRule__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03911);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1975:1: rule__BusinessRule__Group__1 : ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1979:1: ( ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1980:1: ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1980:1: ( ( rule__BusinessRule__NameAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1981:1: ( rule__BusinessRule__NameAssignment_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1982:1: ( rule__BusinessRule__NameAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1982:2: rule__BusinessRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__13939);
            rule__BusinessRule__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13948);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1993:1: rule__BusinessRule__Group__2 : ( ';' ) ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1997:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1998:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1998:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1999:1: ';'
            {
             before(grammarAccess.getBusinessRuleAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__BusinessRule__Group__23977); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2018:1: rule__UniqueRule__Group__0 : ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 ;
    public final void rule__UniqueRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2022:1: ( ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2023:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2023:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2024:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2025:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2025:2: rule__UniqueRule__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UniqueRule__DescriptionAssignment_0_in_rule__UniqueRule__Group__04018);
                    rule__UniqueRule__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__1_in_rule__UniqueRule__Group__04028);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2036:1: rule__UniqueRule__Group__1 : ( 'unique' ) rule__UniqueRule__Group__2 ;
    public final void rule__UniqueRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2040:1: ( ( 'unique' ) rule__UniqueRule__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2041:1: ( 'unique' ) rule__UniqueRule__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2041:1: ( 'unique' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2042:1: 'unique'
            {
             before(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__UniqueRule__Group__14057); 
             after(grammarAccess.getUniqueRuleAccess().getUniqueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__2_in_rule__UniqueRule__Group__14067);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2056:1: rule__UniqueRule__Group__2 : ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 ;
    public final void rule__UniqueRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2060:1: ( ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2061:1: ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2061:1: ( ( rule__UniqueRule__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2062:1: ( rule__UniqueRule__NameAssignment_2 )
            {
             before(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2063:1: ( rule__UniqueRule__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2063:2: rule__UniqueRule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UniqueRule__NameAssignment_2_in_rule__UniqueRule__Group__24095);
            rule__UniqueRule__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__3_in_rule__UniqueRule__Group__24104);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2074:1: rule__UniqueRule__Group__3 : ( '[' ) rule__UniqueRule__Group__4 ;
    public final void rule__UniqueRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2078:1: ( ( '[' ) rule__UniqueRule__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2079:1: ( '[' ) rule__UniqueRule__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2079:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2080:1: '['
            {
             before(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__UniqueRule__Group__34133); 
             after(grammarAccess.getUniqueRuleAccess().getLeftSquareBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__4_in_rule__UniqueRule__Group__34143);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2094:1: rule__UniqueRule__Group__4 : ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 ;
    public final void rule__UniqueRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2098:1: ( ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2099:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2099:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2100:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2101:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2101:2: rule__UniqueRule__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_rule__UniqueRule__PropertiesAssignment_4_in_rule__UniqueRule__Group__44171);
            rule__UniqueRule__PropertiesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__5_in_rule__UniqueRule__Group__44180);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2112:1: rule__UniqueRule__Group__5 : ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 ;
    public final void rule__UniqueRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2116:1: ( ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2117:1: ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2117:1: ( ( rule__UniqueRule__Group_5__0 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2118:1: ( rule__UniqueRule__Group_5__0 )*
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2119:1: ( rule__UniqueRule__Group_5__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2119:2: rule__UniqueRule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__UniqueRule__Group_5__0_in_rule__UniqueRule__Group__54208);
            	    rule__UniqueRule__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getUniqueRuleAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group__6_in_rule__UniqueRule__Group__54218);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2130:1: rule__UniqueRule__Group__6 : ( ']' ) ;
    public final void rule__UniqueRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2134:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2135:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2135:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2136:1: ']'
            {
             before(grammarAccess.getUniqueRuleAccess().getRightSquareBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__UniqueRule__Group__64247); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2163:1: rule__UniqueRule__Group_5__0 : ( ',' ) rule__UniqueRule__Group_5__1 ;
    public final void rule__UniqueRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2167:1: ( ( ',' ) rule__UniqueRule__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2168:1: ( ',' ) rule__UniqueRule__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2168:1: ( ',' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2169:1: ','
            {
             before(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__UniqueRule__Group_5__04297); 
             after(grammarAccess.getUniqueRuleAccess().getCommaKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__UniqueRule__Group_5__1_in_rule__UniqueRule__Group_5__04307);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2183:1: rule__UniqueRule__Group_5__1 : ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) ;
    public final void rule__UniqueRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2187:1: ( ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2188:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2188:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2189:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2190:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2190:2: rule__UniqueRule__PropertiesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__UniqueRule__PropertiesAssignment_5_1_in_rule__UniqueRule__Group_5__14335);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2204:1: rule__Property__Group__0 : ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2208:1: ( ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2209:1: ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2209:1: ( ( rule__Property__Alternatives_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2210:1: ( rule__Property__Alternatives_0 )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2211:1: ( rule__Property__Alternatives_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2211:2: rule__Property__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__04373);
            rule__Property__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04382);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2222:1: rule__Property__Group__1 : ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2226:1: ( ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2227:1: ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2227:1: ( ( rule__Property__NullableAssignment_1 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2228:1: ( rule__Property__NullableAssignment_1 )?
            {
             before(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2229:1: ( rule__Property__NullableAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2229:2: rule__Property__NullableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Property__NullableAssignment_1_in_rule__Property__Group__14410);
                    rule__Property__NullableAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14420);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2240:1: rule__Property__Group__2 : ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2244:1: ( ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2245:1: ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2245:1: ( ( rule__Property__Group_2__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2246:1: ( rule__Property__Group_2__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2247:1: ( rule__Property__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2247:2: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__24448);
                    rule__Property__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24458);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2258:1: rule__Property__Group__3 : ( ( rule__Property__Group_3__0 )? ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2262:1: ( ( ( rule__Property__Group_3__0 )? ) rule__Property__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2263:1: ( ( rule__Property__Group_3__0 )? ) rule__Property__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2263:1: ( ( rule__Property__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2264:1: ( rule__Property__Group_3__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2265:1: ( rule__Property__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2265:2: rule__Property__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__34486);
                    rule__Property__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34496);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2276:1: rule__Property__Group__4 : ( ';' ) ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2280:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2281:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2281:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2282:1: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Property__Group__44525); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2305:1: rule__Property__Group_2__0 : ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2309:1: ( ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2310:1: ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2310:1: ( ( rule__Property__DerivedAssignment_2_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2311:1: ( rule__Property__DerivedAssignment_2_0 )
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2312:1: ( rule__Property__DerivedAssignment_2_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2312:2: rule__Property__DerivedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Property__DerivedAssignment_2_0_in_rule__Property__Group_2__04570);
            rule__Property__DerivedAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__04579);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2323:1: rule__Property__Group_2__1 : ( ( rule__Property__WritableAssignment_2_1 )? ) ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2327:1: ( ( ( rule__Property__WritableAssignment_2_1 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2328:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2328:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2329:1: ( rule__Property__WritableAssignment_2_1 )?
            {
             before(grammarAccess.getPropertyAccess().getWritableAssignment_2_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2330:1: ( rule__Property__WritableAssignment_2_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2330:2: rule__Property__WritableAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Property__WritableAssignment_2_1_in_rule__Property__Group_2__14607);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2344:1: rule__Property__Group_3__0 : ( 'column' ) rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2348:1: ( ( 'column' ) rule__Property__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2349:1: ( 'column' ) rule__Property__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2349:1: ( 'column' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2350:1: 'column'
            {
             before(grammarAccess.getPropertyAccess().getColumnKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Property__Group_3__04647); 
             after(grammarAccess.getPropertyAccess().getColumnKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__04657);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2364:1: rule__Property__Group_3__1 : ( ( rule__Property__ColumnAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2368:1: ( ( ( rule__Property__ColumnAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2369:1: ( ( rule__Property__ColumnAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2369:1: ( ( rule__Property__ColumnAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2370:1: ( rule__Property__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getPropertyAccess().getColumnAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2371:1: ( rule__Property__ColumnAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2371:2: rule__Property__ColumnAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Property__ColumnAssignment_3_1_in_rule__Property__Group_3__14685);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2385:1: rule__BoolProperty__Group__0 : ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2389:1: ( ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2390:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2390:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2391:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2392:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2392:2: rule__BoolProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__DescriptionAssignment_0_in_rule__BoolProperty__Group__04723);
                    rule__BoolProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__1_in_rule__BoolProperty__Group__04733);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2403:1: rule__BoolProperty__Group__1 : ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2407:1: ( ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2408:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2408:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2409:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2410:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2410:2: rule__BoolProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BoolProperty__DataTypeAssignment_1_in_rule__BoolProperty__Group__14761);
            rule__BoolProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__2_in_rule__BoolProperty__Group__14770);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2421:1: rule__BoolProperty__Group__2 : ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2425:1: ( ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2426:1: ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2426:1: ( ( rule__BoolProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2427:1: ( rule__BoolProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2428:1: ( rule__BoolProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2428:2: rule__BoolProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BoolProperty__NameAssignment_2_in_rule__BoolProperty__Group__24798);
            rule__BoolProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group__3_in_rule__BoolProperty__Group__24807);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2439:1: rule__BoolProperty__Group__3 : ( ( rule__BoolProperty__Group_3__0 )? ) ;
    public final void rule__BoolProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2443:1: ( ( ( rule__BoolProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2444:1: ( ( rule__BoolProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2444:1: ( ( rule__BoolProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2445:1: ( rule__BoolProperty__Group_3__0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2446:1: ( rule__BoolProperty__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2446:2: rule__BoolProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BoolProperty__Group_3__0_in_rule__BoolProperty__Group__34835);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2464:1: rule__BoolProperty__Group_3__0 : ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 ;
    public final void rule__BoolProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2468:1: ( ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2469:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2469:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2470:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2471:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2471:2: rule__BoolProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__BoolProperty__HasDefaultAssignment_3_0_in_rule__BoolProperty__Group_3__04878);
            rule__BoolProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__BoolProperty__Group_3__1_in_rule__BoolProperty__Group_3__04887);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2482:1: rule__BoolProperty__Group_3__1 : ( ( rule__BoolProperty__Alternatives_3_1 ) ) ;
    public final void rule__BoolProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2486:1: ( ( ( rule__BoolProperty__Alternatives_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2487:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2487:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2488:1: ( rule__BoolProperty__Alternatives_3_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getAlternatives_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2489:1: ( rule__BoolProperty__Alternatives_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2489:2: rule__BoolProperty__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__BoolProperty__Alternatives_3_1_in_rule__BoolProperty__Group_3__14915);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2503:1: rule__StringProperty__Group__0 : ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2507:1: ( ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2508:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2508:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2509:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2510:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2510:2: rule__StringProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__DescriptionAssignment_0_in_rule__StringProperty__Group__04953);
                    rule__StringProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__1_in_rule__StringProperty__Group__04963);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2521:1: rule__StringProperty__Group__1 : ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2525:1: ( ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2526:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2526:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2527:1: ( rule__StringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2528:1: ( rule__StringProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2528:2: rule__StringProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__StringProperty__DataTypeAssignment_1_in_rule__StringProperty__Group__14991);
            rule__StringProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__2_in_rule__StringProperty__Group__15000);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2539:1: rule__StringProperty__Group__2 : ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2543:1: ( ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2544:1: ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2544:1: ( ( rule__StringProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2545:1: ( rule__StringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2546:1: ( rule__StringProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2546:2: rule__StringProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__StringProperty__NameAssignment_2_in_rule__StringProperty__Group__25028);
            rule__StringProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__3_in_rule__StringProperty__Group__25037);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2557:1: rule__StringProperty__Group__3 : ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 ;
    public final void rule__StringProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2561:1: ( ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2562:1: ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2562:1: ( ( rule__StringProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2563:1: ( rule__StringProperty__Group_3__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2564:1: ( rule__StringProperty__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2564:2: rule__StringProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_3__0_in_rule__StringProperty__Group__35065);
                    rule__StringProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__4_in_rule__StringProperty__Group__35075);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2575:1: rule__StringProperty__Group__4 : ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 ;
    public final void rule__StringProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2579:1: ( ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2580:1: ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2580:1: ( ( rule__StringProperty__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2581:1: ( rule__StringProperty__Group_4__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2582:1: ( rule__StringProperty__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2582:2: rule__StringProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_4__0_in_rule__StringProperty__Group__45103);
                    rule__StringProperty__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__5_in_rule__StringProperty__Group__45113);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2593:1: rule__StringProperty__Group__5 : ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 ;
    public final void rule__StringProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2597:1: ( ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2598:1: ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2598:1: ( ( rule__StringProperty__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2599:1: ( rule__StringProperty__Group_5__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2600:1: ( rule__StringProperty__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2600:2: rule__StringProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_5__0_in_rule__StringProperty__Group__55141);
                    rule__StringProperty__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPropertyAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group__6_in_rule__StringProperty__Group__55151);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2611:1: rule__StringProperty__Group__6 : ( ( rule__StringProperty__Group_6__0 )? ) ;
    public final void rule__StringProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2615:1: ( ( ( rule__StringProperty__Group_6__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2616:1: ( ( rule__StringProperty__Group_6__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2616:1: ( ( rule__StringProperty__Group_6__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2617:1: ( rule__StringProperty__Group_6__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2618:1: ( rule__StringProperty__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2618:2: rule__StringProperty__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__StringProperty__Group_6__0_in_rule__StringProperty__Group__65179);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2642:1: rule__StringProperty__Group_3__0 : ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 ;
    public final void rule__StringProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2646:1: ( ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2647:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2647:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2648:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2649:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2649:2: rule__StringProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__StringProperty__HasDefaultAssignment_3_0_in_rule__StringProperty__Group_3__05228);
            rule__StringProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_3__1_in_rule__StringProperty__Group_3__05237);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2660:1: rule__StringProperty__Group_3__1 : ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__StringProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2664:1: ( ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2665:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2665:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2666:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2667:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2667:2: rule__StringProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StringProperty__DefaultValueAssignment_3_1_in_rule__StringProperty__Group_3__15265);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2681:1: rule__StringProperty__Group_4__0 : ( 'minlength' ) rule__StringProperty__Group_4__1 ;
    public final void rule__StringProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2685:1: ( ( 'minlength' ) rule__StringProperty__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2686:1: ( 'minlength' ) rule__StringProperty__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2686:1: ( 'minlength' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2687:1: 'minlength'
            {
             before(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__StringProperty__Group_4__05304); 
             after(grammarAccess.getStringPropertyAccess().getMinlengthKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_4__1_in_rule__StringProperty__Group_4__05314);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2701:1: rule__StringProperty__Group_4__1 : ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) ;
    public final void rule__StringProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2705:1: ( ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2706:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2706:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2707:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2708:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2708:2: rule__StringProperty__MinLengthAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StringProperty__MinLengthAssignment_4_1_in_rule__StringProperty__Group_4__15342);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2722:1: rule__StringProperty__Group_5__0 : ( 'maxlength' ) rule__StringProperty__Group_5__1 ;
    public final void rule__StringProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2726:1: ( ( 'maxlength' ) rule__StringProperty__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2727:1: ( 'maxlength' ) rule__StringProperty__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2727:1: ( 'maxlength' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2728:1: 'maxlength'
            {
             before(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0()); 
            match(input,32,FOLLOW_32_in_rule__StringProperty__Group_5__05381); 
             after(grammarAccess.getStringPropertyAccess().getMaxlengthKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_5__1_in_rule__StringProperty__Group_5__05391);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2742:1: rule__StringProperty__Group_5__1 : ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) ;
    public final void rule__StringProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2746:1: ( ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2747:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2747:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2748:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2749:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2749:2: rule__StringProperty__MaxLengthAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StringProperty__MaxLengthAssignment_5_1_in_rule__StringProperty__Group_5__15419);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2763:1: rule__StringProperty__Group_6__0 : ( 'regexp' ) rule__StringProperty__Group_6__1 ;
    public final void rule__StringProperty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2767:1: ( ( 'regexp' ) rule__StringProperty__Group_6__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2768:1: ( 'regexp' ) rule__StringProperty__Group_6__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2768:1: ( 'regexp' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2769:1: 'regexp'
            {
             before(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0()); 
            match(input,33,FOLLOW_33_in_rule__StringProperty__Group_6__05458); 
             after(grammarAccess.getStringPropertyAccess().getRegexpKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__StringProperty__Group_6__1_in_rule__StringProperty__Group_6__05468);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2783:1: rule__StringProperty__Group_6__1 : ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) ;
    public final void rule__StringProperty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2787:1: ( ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2788:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2788:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2789:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionAssignment_6_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2790:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2790:2: rule__StringProperty__RegularExpressionAssignment_6_1
            {
            pushFollow(FOLLOW_rule__StringProperty__RegularExpressionAssignment_6_1_in_rule__StringProperty__Group_6__15496);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2804:1: rule__DateTimeProperty__Group__0 : ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 ;
    public final void rule__DateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2808:1: ( ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2809:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2809:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2810:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2811:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2811:2: rule__DateTimeProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DateTimeProperty__DescriptionAssignment_0_in_rule__DateTimeProperty__Group__05534);
                    rule__DateTimeProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__1_in_rule__DateTimeProperty__Group__05544);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2822:1: rule__DateTimeProperty__Group__1 : ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 ;
    public final void rule__DateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2826:1: ( ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2827:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2827:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2828:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2829:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2829:2: rule__DateTimeProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__DataTypeAssignment_1_in_rule__DateTimeProperty__Group__15572);
            rule__DateTimeProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__2_in_rule__DateTimeProperty__Group__15581);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2840:1: rule__DateTimeProperty__Group__2 : ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 ;
    public final void rule__DateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2844:1: ( ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2845:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2845:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2846:1: ( rule__DateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2847:1: ( rule__DateTimeProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2847:2: rule__DateTimeProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__NameAssignment_2_in_rule__DateTimeProperty__Group__25609);
            rule__DateTimeProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group__3_in_rule__DateTimeProperty__Group__25618);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2858:1: rule__DateTimeProperty__Group__3 : ( ( rule__DateTimeProperty__Group_3__0 )? ) ;
    public final void rule__DateTimeProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2862:1: ( ( ( rule__DateTimeProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2863:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2863:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2864:1: ( rule__DateTimeProperty__Group_3__0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2865:1: ( rule__DateTimeProperty__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2865:2: rule__DateTimeProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeProperty__Group_3__0_in_rule__DateTimeProperty__Group__35646);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2883:1: rule__DateTimeProperty__Group_3__0 : ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 ;
    public final void rule__DateTimeProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2887:1: ( ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2888:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2888:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2889:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2890:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2890:2: rule__DateTimeProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__HasDefaultAssignment_3_0_in_rule__DateTimeProperty__Group_3__05689);
            rule__DateTimeProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__DateTimeProperty__Group_3__1_in_rule__DateTimeProperty__Group_3__05698);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2901:1: rule__DateTimeProperty__Group_3__1 : ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__DateTimeProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2905:1: ( ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2906:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2906:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2907:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2908:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2908:2: rule__DateTimeProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DateTimeProperty__DefaultValueAssignment_3_1_in_rule__DateTimeProperty__Group_3__15726);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2922:1: rule__IntegerProperty__Group__0 : ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 ;
    public final void rule__IntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2926:1: ( ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2927:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2927:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2928:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2929:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2929:2: rule__IntegerProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__DescriptionAssignment_0_in_rule__IntegerProperty__Group__05764);
                    rule__IntegerProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__1_in_rule__IntegerProperty__Group__05774);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2940:1: rule__IntegerProperty__Group__1 : ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 ;
    public final void rule__IntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2944:1: ( ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2945:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2945:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2946:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2947:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2947:2: rule__IntegerProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__DataTypeAssignment_1_in_rule__IntegerProperty__Group__15802);
            rule__IntegerProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__2_in_rule__IntegerProperty__Group__15811);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2958:1: rule__IntegerProperty__Group__2 : ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 ;
    public final void rule__IntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2962:1: ( ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2963:1: ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2963:1: ( ( rule__IntegerProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2964:1: ( rule__IntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2965:1: ( rule__IntegerProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2965:2: rule__IntegerProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerProperty__NameAssignment_2_in_rule__IntegerProperty__Group__25839);
            rule__IntegerProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__3_in_rule__IntegerProperty__Group__25848);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2976:1: rule__IntegerProperty__Group__3 : ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 ;
    public final void rule__IntegerProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2980:1: ( ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2981:1: ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2981:1: ( ( rule__IntegerProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2982:1: ( rule__IntegerProperty__Group_3__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2983:1: ( rule__IntegerProperty__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2983:2: rule__IntegerProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_3__0_in_rule__IntegerProperty__Group__35876);
                    rule__IntegerProperty__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__4_in_rule__IntegerProperty__Group__35886);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2994:1: rule__IntegerProperty__Group__4 : ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 ;
    public final void rule__IntegerProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2998:1: ( ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2999:1: ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2999:1: ( ( rule__IntegerProperty__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3000:1: ( rule__IntegerProperty__Group_4__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3001:1: ( rule__IntegerProperty__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3001:2: rule__IntegerProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_4__0_in_rule__IntegerProperty__Group__45914);
                    rule__IntegerProperty__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group__5_in_rule__IntegerProperty__Group__45924);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3012:1: rule__IntegerProperty__Group__5 : ( ( rule__IntegerProperty__Group_5__0 )? ) ;
    public final void rule__IntegerProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3016:1: ( ( ( rule__IntegerProperty__Group_5__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3017:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3017:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3018:1: ( rule__IntegerProperty__Group_5__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3019:1: ( rule__IntegerProperty__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3019:2: rule__IntegerProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IntegerProperty__Group_5__0_in_rule__IntegerProperty__Group__55952);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3041:1: rule__IntegerProperty__Group_3__0 : ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 ;
    public final void rule__IntegerProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3045:1: ( ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3046:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3046:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3047:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3048:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3048:2: rule__IntegerProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__IntegerProperty__HasDefaultAssignment_3_0_in_rule__IntegerProperty__Group_3__05999);
            rule__IntegerProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_3__1_in_rule__IntegerProperty__Group_3__06008);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3059:1: rule__IntegerProperty__Group_3__1 : ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__IntegerProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3063:1: ( ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3064:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3064:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3065:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3066:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3066:2: rule__IntegerProperty__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__DefaultValueAssignment_3_1_in_rule__IntegerProperty__Group_3__16036);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3080:1: rule__IntegerProperty__Group_4__0 : ( 'min' ) rule__IntegerProperty__Group_4__1 ;
    public final void rule__IntegerProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3084:1: ( ( 'min' ) rule__IntegerProperty__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3085:1: ( 'min' ) rule__IntegerProperty__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3085:1: ( 'min' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3086:1: 'min'
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__IntegerProperty__Group_4__06075); 
             after(grammarAccess.getIntegerPropertyAccess().getMinKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_4__1_in_rule__IntegerProperty__Group_4__06085);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3100:1: rule__IntegerProperty__Group_4__1 : ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) ;
    public final void rule__IntegerProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3104:1: ( ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3105:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3105:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3106:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3107:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3107:2: rule__IntegerProperty__MinValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__MinValueAssignment_4_1_in_rule__IntegerProperty__Group_4__16113);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3121:1: rule__IntegerProperty__Group_5__0 : ( 'max' ) rule__IntegerProperty__Group_5__1 ;
    public final void rule__IntegerProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3125:1: ( ( 'max' ) rule__IntegerProperty__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3126:1: ( 'max' ) rule__IntegerProperty__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3126:1: ( 'max' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3127:1: 'max'
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0()); 
            match(input,35,FOLLOW_35_in_rule__IntegerProperty__Group_5__06152); 
             after(grammarAccess.getIntegerPropertyAccess().getMaxKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__IntegerProperty__Group_5__1_in_rule__IntegerProperty__Group_5__06162);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3141:1: rule__IntegerProperty__Group_5__1 : ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) ;
    public final void rule__IntegerProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3145:1: ( ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3146:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3146:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3147:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3148:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3148:2: rule__IntegerProperty__MaxValueAssignment_5_1
            {
            pushFollow(FOLLOW_rule__IntegerProperty__MaxValueAssignment_5_1_in_rule__IntegerProperty__Group_5__16190);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3162:1: rule__DecimalProperty__Group__0 : ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 ;
    public final void rule__DecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3166:1: ( ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3167:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3167:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3168:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3169:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3169:2: rule__DecimalProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DecimalProperty__DescriptionAssignment_0_in_rule__DecimalProperty__Group__06228);
                    rule__DecimalProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__DecimalProperty__Group__1_in_rule__DecimalProperty__Group__06238);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3180:1: rule__DecimalProperty__Group__1 : ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 ;
    public final void rule__DecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3184:1: ( ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3185:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3185:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3186:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3187:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3187:2: rule__DecimalProperty__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DecimalProperty__DataTypeAssignment_1_in_rule__DecimalProperty__Group__16266);
            rule__DecimalProperty__DataTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DecimalProperty__Group__2_in_rule__DecimalProperty__Group__16275);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3198:1: rule__DecimalProperty__Group__2 : ( ( rule__DecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3202:1: ( ( ( rule__DecimalProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3203:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3203:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3204:1: ( rule__DecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3205:1: ( rule__DecimalProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3205:2: rule__DecimalProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DecimalProperty__NameAssignment_2_in_rule__DecimalProperty__Group__26303);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3221:1: rule__EnumerationProperty__Group__0 : ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 ;
    public final void rule__EnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3225:1: ( ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3226:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3226:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3227:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3228:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3228:2: rule__EnumerationProperty__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumerationProperty__DescriptionAssignment_0_in_rule__EnumerationProperty__Group__06343);
                    rule__EnumerationProperty__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__1_in_rule__EnumerationProperty__Group__06353);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3239:1: rule__EnumerationProperty__Group__1 : ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 ;
    public final void rule__EnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3243:1: ( ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3244:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3244:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3245:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3246:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3246:2: rule__EnumerationProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__TypeAssignment_1_in_rule__EnumerationProperty__Group__16381);
            rule__EnumerationProperty__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__2_in_rule__EnumerationProperty__Group__16390);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3257:1: rule__EnumerationProperty__Group__2 : ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 ;
    public final void rule__EnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3261:1: ( ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3262:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3262:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3263:1: ( rule__EnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3264:1: ( rule__EnumerationProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3264:2: rule__EnumerationProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__NameAssignment_2_in_rule__EnumerationProperty__Group__26418);
            rule__EnumerationProperty__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group__3_in_rule__EnumerationProperty__Group__26427);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3275:1: rule__EnumerationProperty__Group__3 : ( ( rule__EnumerationProperty__Group_3__0 )? ) ;
    public final void rule__EnumerationProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3279:1: ( ( ( rule__EnumerationProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3280:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3280:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3281:1: ( rule__EnumerationProperty__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3282:1: ( rule__EnumerationProperty__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==42) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3282:2: rule__EnumerationProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationProperty__Group_3__0_in_rule__EnumerationProperty__Group__36455);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3300:1: rule__EnumerationProperty__Group_3__0 : ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 ;
    public final void rule__EnumerationProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3304:1: ( ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3305:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3305:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3306:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3307:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3307:2: rule__EnumerationProperty__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__HasDefaultAssignment_3_0_in_rule__EnumerationProperty__Group_3__06498);
            rule__EnumerationProperty__HasDefaultAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__EnumerationProperty__Group_3__1_in_rule__EnumerationProperty__Group_3__06507);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3318:1: rule__EnumerationProperty__Group_3__1 : ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3322:1: ( ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3323:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3323:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3324:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3325:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3325:2: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationProperty__Group_3__16535);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3339:1: rule__BusinessDomainModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessDomainModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3343:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3344:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3344:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3345:1: RULE_STRING
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessDomainModel__DescriptionAssignment_06573); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3354:1: rule__BusinessDomainModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessDomainModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3358:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3359:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3359:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3360:1: RULE_ID
            {
             before(grammarAccess.getBusinessDomainModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessDomainModel__NameAssignment_26604); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3369:1: rule__BusinessDomainModel__TypesAssignment_4_0 : ( ruleBusinessClass ) ;
    public final void rule__BusinessDomainModel__TypesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3373:1: ( ( ruleBusinessClass ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3374:1: ( ruleBusinessClass )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3374:1: ( ruleBusinessClass )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3375:1: ruleBusinessClass
            {
             before(grammarAccess.getBusinessDomainModelAccess().getTypesBusinessClassParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleBusinessClass_in_rule__BusinessDomainModel__TypesAssignment_4_06635);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3384:1: rule__BusinessDomainModel__EnumerationsAssignment_4_1 : ( ruleIntegerEnumeration ) ;
    public final void rule__BusinessDomainModel__EnumerationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3388:1: ( ( ruleIntegerEnumeration ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3389:1: ( ruleIntegerEnumeration )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3389:1: ( ruleIntegerEnumeration )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3390:1: ruleIntegerEnumeration
            {
             before(grammarAccess.getBusinessDomainModelAccess().getEnumerationsIntegerEnumerationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleIntegerEnumeration_in_rule__BusinessDomainModel__EnumerationsAssignment_4_16666);
            ruleIntegerEnumeration();
            _fsp--;

             after(grammarAccess.getBusinessDomainModelAccess().getEnumerationsIntegerEnumerationParserRuleCall_4_1_0()); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3399:1: rule__BusinessDomainModel__AssociationsAssignment_4_2 : ( ruleAssociation ) ;
    public final void rule__BusinessDomainModel__AssociationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3403:1: ( ( ruleAssociation ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3404:1: ( ruleAssociation )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3404:1: ( ruleAssociation )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3405:1: ruleAssociation
            {
             before(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssociationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__BusinessDomainModel__AssociationsAssignment_4_26697);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3414:1: rule__Association__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Association__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3418:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3419:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3419:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3420:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__DescriptionAssignment_06728); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3429:1: rule__Association__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3433:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3434:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3434:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3435:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3436:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3437:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_26763); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3448:1: rule__Association__SourceRoleNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Association__SourceRoleNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3452:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3453:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3453:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3454:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceRoleNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceRoleNameAssignment_36798); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3463:1: rule__Association__SourceForeignKeyAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Association__SourceForeignKeyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3467:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3468:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3468:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3469:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceForeignKeyIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceForeignKeyAssignment_4_16829); 
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


    // $ANTLR start rule__Association__SourceAlternateKeyAssignment_5_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3478:1: rule__Association__SourceAlternateKeyAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Association__SourceAlternateKeyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3482:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3483:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3483:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3484:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceAlternateKeyIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAlternateKeyAssignment_5_16860); 
             after(grammarAccess.getAssociationAccess().getSourceAlternateKeyIDTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end rule__Association__SourceAlternateKeyAssignment_5_1


    // $ANTLR start rule__Association__SourceMultiplicityAssignment_6
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3493:1: rule__Association__SourceMultiplicityAssignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Association__SourceMultiplicityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3497:1: ( ( ruleMultiplicity ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3498:1: ( ruleMultiplicity )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3498:1: ( ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3499:1: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Association__SourceMultiplicityAssignment_66891);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getAssociationAccess().getSourceMultiplicityMultiplicityEnumRuleCall_6_0()); 

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
    // $ANTLR end rule__Association__SourceMultiplicityAssignment_6


    // $ANTLR start rule__Association__BidirectionalAssignment_7_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3508:1: rule__Association__BidirectionalAssignment_7_0 : ( ( '<->' ) ) ;
    public final void rule__Association__BidirectionalAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3512:1: ( ( ( '<->' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3513:1: ( ( '<->' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3513:1: ( ( '<->' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3514:1: ( '<->' )
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_7_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3515:1: ( '<->' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3516:1: '<->'
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_7_0_0()); 
            match(input,36,FOLLOW_36_in_rule__Association__BidirectionalAssignment_7_06927); 
             after(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_7_0_0()); 

            }

             after(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_7_0_0()); 

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
    // $ANTLR end rule__Association__BidirectionalAssignment_7_0


    // $ANTLR start rule__Association__TargetMultiplicityAssignment_8
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3531:1: rule__Association__TargetMultiplicityAssignment_8 : ( ruleMultiplicity ) ;
    public final void rule__Association__TargetMultiplicityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3535:1: ( ( ruleMultiplicity ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3536:1: ( ruleMultiplicity )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3536:1: ( ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3537:1: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Association__TargetMultiplicityAssignment_86966);
            ruleMultiplicity();
            _fsp--;

             after(grammarAccess.getAssociationAccess().getTargetMultiplicityMultiplicityEnumRuleCall_8_0()); 

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
    // $ANTLR end rule__Association__TargetMultiplicityAssignment_8


    // $ANTLR start rule__Association__TableAssignment_9_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3546:1: rule__Association__TableAssignment_9_1 : ( RULE_ID ) ;
    public final void rule__Association__TableAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3550:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3551:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3551:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3552:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTableIDTerminalRuleCall_9_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TableAssignment_9_16997); 
             after(grammarAccess.getAssociationAccess().getTableIDTerminalRuleCall_9_1_0()); 

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
    // $ANTLR end rule__Association__TableAssignment_9_1


    // $ANTLR start rule__Association__TargetAssignment_10
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3561:1: rule__Association__TargetAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3565:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3566:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3566:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3567:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_10_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3568:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3569:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_107032); 
             after(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_10_0()); 

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
    // $ANTLR end rule__Association__TargetAssignment_10


    // $ANTLR start rule__Association__TargetRoleNameAssignment_11
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3580:1: rule__Association__TargetRoleNameAssignment_11 : ( RULE_ID ) ;
    public final void rule__Association__TargetRoleNameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3584:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3585:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3585:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3586:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetRoleNameAssignment_117067); 
             after(grammarAccess.getAssociationAccess().getTargetRoleNameIDTerminalRuleCall_11_0()); 

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
    // $ANTLR end rule__Association__TargetRoleNameAssignment_11


    // $ANTLR start rule__Association__TargetForeignKeyAssignment_12_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3595:1: rule__Association__TargetForeignKeyAssignment_12_1 : ( RULE_ID ) ;
    public final void rule__Association__TargetForeignKeyAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3599:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3600:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3600:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3601:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetForeignKeyIDTerminalRuleCall_12_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetForeignKeyAssignment_12_17098); 
             after(grammarAccess.getAssociationAccess().getTargetForeignKeyIDTerminalRuleCall_12_1_0()); 

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
    // $ANTLR end rule__Association__TargetForeignKeyAssignment_12_1


    // $ANTLR start rule__Association__TargetAlternateKeyAssignment_13_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3610:1: rule__Association__TargetAlternateKeyAssignment_13_1 : ( RULE_ID ) ;
    public final void rule__Association__TargetAlternateKeyAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3614:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3615:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3615:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3616:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetAlternateKeyIDTerminalRuleCall_13_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAlternateKeyAssignment_13_17129); 
             after(grammarAccess.getAssociationAccess().getTargetAlternateKeyIDTerminalRuleCall_13_1_0()); 

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
    // $ANTLR end rule__Association__TargetAlternateKeyAssignment_13_1


    // $ANTLR start rule__Association__OrderedAssignment_14_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3625:1: rule__Association__OrderedAssignment_14_0 : ( ( 'ordered' ) ) ;
    public final void rule__Association__OrderedAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3629:1: ( ( ( 'ordered' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3630:1: ( ( 'ordered' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3630:1: ( ( 'ordered' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3631:1: ( 'ordered' )
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_14_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3632:1: ( 'ordered' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3633:1: 'ordered'
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_14_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Association__OrderedAssignment_14_07165); 
             after(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_14_0_0()); 

            }

             after(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_14_0_0()); 

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
    // $ANTLR end rule__Association__OrderedAssignment_14_0


    // $ANTLR start rule__Association__OrderingColumnAssignment_14_1_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3648:1: rule__Association__OrderingColumnAssignment_14_1_1 : ( RULE_ID ) ;
    public final void rule__Association__OrderingColumnAssignment_14_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3652:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3653:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3653:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3654:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getOrderingColumnIDTerminalRuleCall_14_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__OrderingColumnAssignment_14_1_17204); 
             after(grammarAccess.getAssociationAccess().getOrderingColumnIDTerminalRuleCall_14_1_1_0()); 

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
    // $ANTLR end rule__Association__OrderingColumnAssignment_14_1_1


    // $ANTLR start rule__BusinessClass__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3663:1: rule__BusinessClass__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClass__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3667:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3668:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3668:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3669:1: RULE_STRING
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessClass__DescriptionAssignment_07235); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3678:1: rule__BusinessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3682:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3683:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3683:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3684:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__NameAssignment_27266); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3693:1: rule__BusinessClass__SuperclassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClass__SuperclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3697:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3698:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3698:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3699:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3700:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3701:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__SuperclassAssignment_3_17301); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3712:1: rule__BusinessClass__TableAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__BusinessClass__TableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3716:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3717:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3717:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3718:1: RULE_ID
            {
             before(grammarAccess.getBusinessClassAccess().getTableIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessClass__TableAssignment_4_17336); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3727:1: rule__BusinessClass__PropertiesAssignment_6 : ( ruleProperty ) ;
    public final void rule__BusinessClass__PropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3731:1: ( ( ruleProperty ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3732:1: ( ruleProperty )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3732:1: ( ruleProperty )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3733:1: ruleProperty
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesPropertyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__BusinessClass__PropertiesAssignment_67367);
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3742:1: rule__BusinessClass__BusinessRulesAssignment_7_2 : ( ruleAbstractBusinessRule ) ;
    public final void rule__BusinessClass__BusinessRulesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3746:1: ( ( ruleAbstractBusinessRule ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3747:1: ( ruleAbstractBusinessRule )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3747:1: ( ruleAbstractBusinessRule )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3748:1: ruleAbstractBusinessRule
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAbstractBusinessRuleParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleAbstractBusinessRule_in_rule__BusinessClass__BusinessRulesAssignment_7_27398);
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


    // $ANTLR start rule__IntegerEnumeration__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3757:1: rule__IntegerEnumeration__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__IntegerEnumeration__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3761:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3762:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3762:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3763:1: RULE_STRING
            {
             before(grammarAccess.getIntegerEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IntegerEnumeration__DescriptionAssignment_07429); 
             after(grammarAccess.getIntegerEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__IntegerEnumeration__DescriptionAssignment_0


    // $ANTLR start rule__IntegerEnumeration__NameAssignment_2
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3772:1: rule__IntegerEnumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerEnumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3776:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3777:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3777:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3778:1: RULE_ID
            {
             before(grammarAccess.getIntegerEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerEnumeration__NameAssignment_27460); 
             after(grammarAccess.getIntegerEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__IntegerEnumeration__NameAssignment_2


    // $ANTLR start rule__IntegerEnumeration__EnumerationLiteralsAssignment_4
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3787:1: rule__IntegerEnumeration__EnumerationLiteralsAssignment_4 : ( ruleIntegerEnumerationLiteral ) ;
    public final void rule__IntegerEnumeration__EnumerationLiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3791:1: ( ( ruleIntegerEnumerationLiteral ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3792:1: ( ruleIntegerEnumerationLiteral )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3792:1: ( ruleIntegerEnumerationLiteral )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3793:1: ruleIntegerEnumerationLiteral
            {
             before(grammarAccess.getIntegerEnumerationAccess().getEnumerationLiteralsIntegerEnumerationLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntegerEnumerationLiteral_in_rule__IntegerEnumeration__EnumerationLiteralsAssignment_47491);
            ruleIntegerEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getIntegerEnumerationAccess().getEnumerationLiteralsIntegerEnumerationLiteralParserRuleCall_4_0()); 

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
    // $ANTLR end rule__IntegerEnumeration__EnumerationLiteralsAssignment_4


    // $ANTLR start rule__IntegerEnumerationLiteral__NameAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3802:1: rule__IntegerEnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IntegerEnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3806:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3807:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3807:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3808:1: RULE_ID
            {
             before(grammarAccess.getIntegerEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerEnumerationLiteral__NameAssignment_07522); 
             after(grammarAccess.getIntegerEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__IntegerEnumerationLiteral__NameAssignment_0


    // $ANTLR start rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3817:1: rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3821:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3822:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3822:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3823:1: RULE_INT
            {
             before(grammarAccess.getIntegerEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_17553); 
             after(grammarAccess.getIntegerEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1


    // $ANTLR start rule__BusinessRule__DescriptionAssignment_0
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3832:1: rule__BusinessRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3836:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3837:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3837:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3838:1: RULE_STRING
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BusinessRule__DescriptionAssignment_07584); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3847:1: rule__BusinessRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3851:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3852:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3852:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3853:1: RULE_ID
            {
             before(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_17615); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3862:1: rule__UniqueRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__UniqueRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3866:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3867:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3867:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3868:1: RULE_STRING
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UniqueRule__DescriptionAssignment_07646); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3877:1: rule__UniqueRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UniqueRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3881:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3882:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3882:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3883:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__NameAssignment_27677); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3892:1: rule__UniqueRule__PropertiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3896:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3897:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3897:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3898:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3899:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3900:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_47712); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3911:1: rule__UniqueRule__PropertiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3915:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3916:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3916:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3917:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3918:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3919:1: RULE_ID
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_5_17751); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3930:1: rule__Property__NullableAssignment_1 : ( ( 'nullable' ) ) ;
    public final void rule__Property__NullableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3934:1: ( ( ( 'nullable' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3935:1: ( ( 'nullable' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3935:1: ( ( 'nullable' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3936:1: ( 'nullable' )
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3937:1: ( 'nullable' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3938:1: 'nullable'
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Property__NullableAssignment_17791); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3953:1: rule__Property__DerivedAssignment_2_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3957:1: ( ( ( 'derived' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3958:1: ( ( 'derived' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3958:1: ( ( 'derived' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3959:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3960:1: ( 'derived' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3961:1: 'derived'
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Property__DerivedAssignment_2_07835); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3976:1: rule__Property__WritableAssignment_2_1 : ( ( 'writable' ) ) ;
    public final void rule__Property__WritableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3980:1: ( ( ( 'writable' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:1: ( ( 'writable' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:1: ( ( 'writable' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3982:1: ( 'writable' )
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3983:1: ( 'writable' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3984:1: 'writable'
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Property__WritableAssignment_2_17879); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3999:1: rule__Property__ColumnAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Property__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4003:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4004:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4004:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4005:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getColumnIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__ColumnAssignment_3_17918); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4014:1: rule__BoolProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BoolProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4018:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4019:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4019:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4020:1: RULE_STRING
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BoolProperty__DescriptionAssignment_07949); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4029:1: rule__BoolProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__BoolProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4033:1: ( ( ( 'boolean' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4034:1: ( ( 'boolean' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4034:1: ( ( 'boolean' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4035:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4036:1: ( 'boolean' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4037:1: 'boolean'
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__BoolProperty__DataTypeAssignment_17985); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4052:1: rule__BoolProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BoolProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4056:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4057:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4057:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4058:1: RULE_ID
            {
             before(grammarAccess.getBoolPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BoolProperty__NameAssignment_28024); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4067:1: rule__BoolProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__BoolProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4071:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4072:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4072:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4073:1: ( 'default' )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4074:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4075:1: 'default'
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,42,FOLLOW_42_in_rule__BoolProperty__HasDefaultAssignment_3_08060); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4090:1: rule__BoolProperty__DefaultValueAssignment_3_1_0 : ( ( 'true' ) ) ;
    public final void rule__BoolProperty__DefaultValueAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4094:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4095:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4095:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4096:1: ( 'true' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4097:1: ( 'true' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4098:1: 'true'
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            match(input,43,FOLLOW_43_in_rule__BoolProperty__DefaultValueAssignment_3_1_08104); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4113:1: rule__StringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4117:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4118:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4118:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4119:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__DescriptionAssignment_08143); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4128:1: rule__StringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__StringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4132:1: ( ( ( 'string' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4133:1: ( ( 'string' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4133:1: ( ( 'string' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4134:1: ( 'string' )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4135:1: ( 'string' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4136:1: 'string'
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__StringProperty__DataTypeAssignment_18179); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4151:1: rule__StringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4155:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4156:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4156:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4157:1: RULE_ID
            {
             before(grammarAccess.getStringPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringProperty__NameAssignment_28218); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4166:1: rule__StringProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__StringProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4170:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4171:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4171:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4172:1: ( 'default' )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4173:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4174:1: 'default'
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,42,FOLLOW_42_in_rule__StringProperty__HasDefaultAssignment_3_08254); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4189:1: rule__StringProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4193:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4194:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4194:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4195:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__DefaultValueAssignment_3_18293); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4204:1: rule__StringProperty__MinLengthAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MinLengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4208:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4209:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4209:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4210:1: RULE_INT
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringProperty__MinLengthAssignment_4_18324); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4219:1: rule__StringProperty__MaxLengthAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MaxLengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4223:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4224:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4224:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4225:1: RULE_INT
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringProperty__MaxLengthAssignment_5_18355); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4234:1: rule__StringProperty__RegularExpressionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__RegularExpressionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4238:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4239:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4239:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4240:1: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringProperty__RegularExpressionAssignment_6_18386); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4249:1: rule__DateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4253:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4254:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4254:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4255:1: RULE_STRING
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DescriptionAssignment_08417); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4264:1: rule__DateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4268:1: ( ( ( 'datetime' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4269:1: ( ( 'datetime' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4269:1: ( ( 'datetime' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4270:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4271:1: ( 'datetime' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4272:1: 'datetime'
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__DateTimeProperty__DataTypeAssignment_18453); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4287:1: rule__DateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4291:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4292:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4292:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4293:1: RULE_ID
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateTimeProperty__NameAssignment_28492); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4302:1: rule__DateTimeProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4306:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4307:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4307:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4308:1: ( 'default' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4309:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4310:1: 'default'
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,42,FOLLOW_42_in_rule__DateTimeProperty__HasDefaultAssignment_3_08528); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4325:1: rule__DateTimeProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4329:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4330:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4330:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4331:1: RULE_STRING
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DefaultValueAssignment_3_18567); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4340:1: rule__IntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__IntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4344:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4345:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4345:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4346:1: RULE_STRING
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IntegerProperty__DescriptionAssignment_08598); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4355:1: rule__IntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__IntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4359:1: ( ( ( 'integer' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4360:1: ( ( 'integer' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4360:1: ( ( 'integer' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4361:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4362:1: ( 'integer' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4363:1: 'integer'
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__IntegerProperty__DataTypeAssignment_18634); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4378:1: rule__IntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4382:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4383:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4383:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4384:1: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerProperty__NameAssignment_28673); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4393:1: rule__IntegerProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__IntegerProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4397:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4398:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4398:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4399:1: ( 'default' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4400:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4401:1: 'default'
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,42,FOLLOW_42_in_rule__IntegerProperty__HasDefaultAssignment_3_08709); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4416:1: rule__IntegerProperty__DefaultValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4420:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4421:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4421:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4422:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__DefaultValueAssignment_3_18748); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4431:1: rule__IntegerProperty__MinValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MinValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4435:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4436:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4436:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4437:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__MinValueAssignment_4_18779); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4446:1: rule__IntegerProperty__MaxValueAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MaxValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4450:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4451:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4451:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4452:1: RULE_INT
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerProperty__MaxValueAssignment_5_18810); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4461:1: rule__DecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4465:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4466:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4466:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4467:1: RULE_STRING
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecimalProperty__DescriptionAssignment_08841); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4476:1: rule__DecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4480:1: ( ( ( 'decimal' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4481:1: ( ( 'decimal' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4481:1: ( ( 'decimal' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4482:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4483:1: ( 'decimal' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4484:1: 'decimal'
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__DecimalProperty__DataTypeAssignment_18877); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4499:1: rule__DecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4503:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4504:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4504:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4505:1: RULE_ID
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DecimalProperty__NameAssignment_28916); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4514:1: rule__EnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4518:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4519:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4519:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4520:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationProperty__DescriptionAssignment_08947); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4529:1: rule__EnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4533:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4534:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4534:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4535:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeIntegerEnumerationCrossReference_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4536:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4537:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeIntegerEnumerationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__TypeAssignment_18982); 
             after(grammarAccess.getEnumerationPropertyAccess().getTypeIntegerEnumerationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumerationPropertyAccess().getTypeIntegerEnumerationCrossReference_1_0()); 

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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4548:1: rule__EnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4552:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4553:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4553:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4554:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__NameAssignment_29017); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4563:1: rule__EnumerationProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4567:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4568:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4568:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4569:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4570:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4571:1: 'default'
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,42,FOLLOW_42_in_rule__EnumerationProperty__HasDefaultAssignment_3_09053); 
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4586:1: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4590:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4591:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4591:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4592:1: RULE_ID
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_19092); 
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
    public static final BitSet FOLLOW_ruleIntegerEnumeration_in_entryRuleIntegerEnumeration240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerEnumeration247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__Group__0_in_ruleIntegerEnumeration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerEnumerationLiteral_in_entryRuleIntegerEnumerationLiteral300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerEnumerationLiteral307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerEnumerationLiteral__Group__0_in_ruleIntegerEnumerationLiteral334 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Association__BidirectionalAssignment_7_0_in_rule__Association__Alternatives_71079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Association__Alternatives_71098 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_16_in_rule__BusinessDomainModel__Group__31527 = new BitSet(new long[]{0x0000000008420012L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Group__4_in_rule__BusinessDomainModel__Group__31537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessDomainModel__Alternatives_4_in_rule__BusinessDomainModel__Group__41565 = new BitSet(new long[]{0x0000000008420012L});
    public static final BitSet FOLLOW_rule__Association__DescriptionAssignment_0_in_rule__Association__Group__01610 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__01620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Association__Group__11649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_2_in_rule__Association__Group__21687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__21696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceRoleNameAssignment_3_in_rule__Association__Group__31724 = new BitSet(new long[]{0x00000000000C6000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__31733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_4__0_in_rule__Association__Group__41761 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_rule__Association__Group__5_in_rule__Association__Group__41771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_5__0_in_rule__Association__Group__51799 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Association__Group__6_in_rule__Association__Group__51809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceMultiplicityAssignment_6_in_rule__Association__Group__61837 = new BitSet(new long[]{0x0000001000000800L});
    public static final BitSet FOLLOW_rule__Association__Group__7_in_rule__Association__Group__61846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Alternatives_7_in_rule__Association__Group__71874 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Association__Group__8_in_rule__Association__Group__71883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetMultiplicityAssignment_8_in_rule__Association__Group__81911 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Association__Group__9_in_rule__Association__Group__81920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_9__0_in_rule__Association__Group__91948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__10_in_rule__Association__Group__91958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_10_in_rule__Association__Group__101986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__11_in_rule__Association__Group__101995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetRoleNameAssignment_11_in_rule__Association__Group__112023 = new BitSet(new long[]{0x00000020000D0000L});
    public static final BitSet FOLLOW_rule__Association__Group__12_in_rule__Association__Group__112032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_12__0_in_rule__Association__Group__122060 = new BitSet(new long[]{0x0000002000090000L});
    public static final BitSet FOLLOW_rule__Association__Group__13_in_rule__Association__Group__122070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_13__0_in_rule__Association__Group__132098 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_rule__Association__Group__14_in_rule__Association__Group__132108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_14__0_in_rule__Association__Group__142136 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Association__Group__15_in_rule__Association__Group__142146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Association__Group__152175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Association__Group_4__02243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_4__1_in_rule__Association__Group_4__02253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceForeignKeyAssignment_4_1_in_rule__Association__Group_4__12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Association__Group_5__02320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_5__1_in_rule__Association__Group_5__02330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAlternateKeyAssignment_5_1_in_rule__Association__Group_5__12358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Association__Group_9__02397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_9__1_in_rule__Association__Group_9__02407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TableAssignment_9_1_in_rule__Association__Group_9__12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Association__Group_12__02474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_12__1_in_rule__Association__Group_12__02484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetForeignKeyAssignment_12_1_in_rule__Association__Group_12__12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Association__Group_13__02551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_13__1_in_rule__Association__Group_13__02561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAlternateKeyAssignment_13_1_in_rule__Association__Group_13__12589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__OrderedAssignment_14_0_in_rule__Association__Group_14__02627 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Association__Group_14__1_in_rule__Association__Group_14__02636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_14_1__0_in_rule__Association__Group_14__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Association__Group_14_1__02704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_14_1__1_in_rule__Association__Group_14_1__02714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__OrderingColumnAssignment_14_1_1_in_rule__Association__Group_14_1__12742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__DescriptionAssignment_0_in_rule__BusinessClass__Group__02780 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__1_in_rule__BusinessClass__Group__02790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessClass__Group__12819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__2_in_rule__BusinessClass__Group__12829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__NameAssignment_2_in_rule__BusinessClass__Group__22857 = new BitSet(new long[]{0x0000000002900000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__3_in_rule__BusinessClass__Group__22866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_3__0_in_rule__BusinessClass__Group__32894 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__4_in_rule__BusinessClass__Group__32904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_4__0_in_rule__BusinessClass__Group__42932 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__5_in_rule__BusinessClass__Group__42942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BusinessClass__Group__52971 = new BitSet(new long[]{0x0000F20005000030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__6_in_rule__BusinessClass__Group__52981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__PropertiesAssignment_6_in_rule__BusinessClass__Group__63009 = new BitSet(new long[]{0x0000F20005000030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__7_in_rule__BusinessClass__Group__63019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_7__0_in_rule__BusinessClass__Group__73047 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group__8_in_rule__BusinessClass__Group__73057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BusinessClass__Group__83086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BusinessClass__Group_3__03140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_3__1_in_rule__BusinessClass__Group_3__03150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__SuperclassAssignment_3_1_in_rule__BusinessClass__Group_3__13178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BusinessClass__Group_4__03217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_4__1_in_rule__BusinessClass__Group_4__03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__TableAssignment_4_1_in_rule__BusinessClass__Group_4__13255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BusinessClass__Group_7__03294 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_7__1_in_rule__BusinessClass__Group_7__03304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BusinessClass__Group_7__13333 = new BitSet(new long[]{0x0000000021000030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_7__2_in_rule__BusinessClass__Group_7__13343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessClass__BusinessRulesAssignment_7_2_in_rule__BusinessClass__Group_7__23371 = new BitSet(new long[]{0x0000000021000030L});
    public static final BitSet FOLLOW_rule__BusinessClass__Group_7__3_in_rule__BusinessClass__Group_7__23381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BusinessClass__Group_7__33410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__DescriptionAssignment_0_in_rule__IntegerEnumeration__Group__03453 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__Group__1_in_rule__IntegerEnumeration__Group__03463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IntegerEnumeration__Group__13492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__Group__2_in_rule__IntegerEnumeration__Group__13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__NameAssignment_2_in_rule__IntegerEnumeration__Group__23530 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__Group__3_in_rule__IntegerEnumeration__Group__23539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IntegerEnumeration__Group__33568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__Group__4_in_rule__IntegerEnumeration__Group__33578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__EnumerationLiteralsAssignment_4_in_rule__IntegerEnumeration__Group__43608 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__EnumerationLiteralsAssignment_4_in_rule__IntegerEnumeration__Group__43620 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__IntegerEnumeration__Group__5_in_rule__IntegerEnumeration__Group__43632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IntegerEnumeration__Group__53661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerEnumerationLiteral__NameAssignment_0_in_rule__IntegerEnumerationLiteral__Group__03708 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__IntegerEnumerationLiteral__Group__1_in_rule__IntegerEnumerationLiteral__Group__03717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerEnumerationLiteral__Group_1__0_in_rule__IntegerEnumerationLiteral__Group__13745 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__IntegerEnumerationLiteral__Group__2_in_rule__IntegerEnumerationLiteral__Group__13754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__IntegerEnumerationLiteral__Group__23783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IntegerEnumerationLiteral__Group_1__03825 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerEnumerationLiteral__Group_1__1_in_rule__IntegerEnumerationLiteral__Group_1__03835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_1_in_rule__IntegerEnumerationLiteral__Group_1__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__DescriptionAssignment_0_in_rule__BusinessRule__Group__03901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__NameAssignment_1_in_rule__BusinessRule__Group__13939 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessRule__Group__23977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__DescriptionAssignment_0_in_rule__UniqueRule__Group__04018 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__1_in_rule__UniqueRule__Group__04028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UniqueRule__Group__14057 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__2_in_rule__UniqueRule__Group__14067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__NameAssignment_2_in_rule__UniqueRule__Group__24095 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__3_in_rule__UniqueRule__Group__24104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UniqueRule__Group__34133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__4_in_rule__UniqueRule__Group__34143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__PropertiesAssignment_4_in_rule__UniqueRule__Group__44171 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__5_in_rule__UniqueRule__Group__44180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group_5__0_in_rule__UniqueRule__Group__54208 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group__6_in_rule__UniqueRule__Group__54218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UniqueRule__Group__64247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UniqueRule__Group_5__04297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UniqueRule__Group_5__1_in_rule__UniqueRule__Group_5__04307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueRule__PropertiesAssignment_5_1_in_rule__UniqueRule__Group_5__14335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__04373 = new BitSet(new long[]{0x000000C000210000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NullableAssignment_1_in_rule__Property__Group__14410 = new BitSet(new long[]{0x0000008000210000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__24448 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__34486 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Property__Group__44525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DerivedAssignment_2_0_in_rule__Property__Group_2__04570 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__04579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__WritableAssignment_2_1_in_rule__Property__Group_2__14607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Property__Group_3__04647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__04657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ColumnAssignment_3_1_in_rule__Property__Group_3__14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DescriptionAssignment_0_in_rule__BoolProperty__Group__04723 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__1_in_rule__BoolProperty__Group__04733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__DataTypeAssignment_1_in_rule__BoolProperty__Group__14761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__2_in_rule__BoolProperty__Group__14770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__NameAssignment_2_in_rule__BoolProperty__Group__24798 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group__3_in_rule__BoolProperty__Group__24807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group_3__0_in_rule__BoolProperty__Group__34835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__HasDefaultAssignment_3_0_in_rule__BoolProperty__Group_3__04878 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_rule__BoolProperty__Group_3__1_in_rule__BoolProperty__Group_3__04887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolProperty__Alternatives_3_1_in_rule__BoolProperty__Group_3__14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DescriptionAssignment_0_in_rule__StringProperty__Group__04953 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__1_in_rule__StringProperty__Group__04963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DataTypeAssignment_1_in_rule__StringProperty__Group__14991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__2_in_rule__StringProperty__Group__15000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__NameAssignment_2_in_rule__StringProperty__Group__25028 = new BitSet(new long[]{0x0000040380000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__3_in_rule__StringProperty__Group__25037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_3__0_in_rule__StringProperty__Group__35065 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__4_in_rule__StringProperty__Group__35075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_4__0_in_rule__StringProperty__Group__45103 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__5_in_rule__StringProperty__Group__45113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_5__0_in_rule__StringProperty__Group__55141 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group__6_in_rule__StringProperty__Group__55151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_6__0_in_rule__StringProperty__Group__65179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__HasDefaultAssignment_3_0_in_rule__StringProperty__Group_3__05228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_3__1_in_rule__StringProperty__Group_3__05237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__DefaultValueAssignment_3_1_in_rule__StringProperty__Group_3__15265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StringProperty__Group_4__05304 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_4__1_in_rule__StringProperty__Group_4__05314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__MinLengthAssignment_4_1_in_rule__StringProperty__Group_4__15342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringProperty__Group_5__05381 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_5__1_in_rule__StringProperty__Group_5__05391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__MaxLengthAssignment_5_1_in_rule__StringProperty__Group_5__15419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringProperty__Group_6__05458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringProperty__Group_6__1_in_rule__StringProperty__Group_6__05468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringProperty__RegularExpressionAssignment_6_1_in_rule__StringProperty__Group_6__15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DescriptionAssignment_0_in_rule__DateTimeProperty__Group__05534 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__1_in_rule__DateTimeProperty__Group__05544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DataTypeAssignment_1_in_rule__DateTimeProperty__Group__15572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__2_in_rule__DateTimeProperty__Group__15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__NameAssignment_2_in_rule__DateTimeProperty__Group__25609 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group__3_in_rule__DateTimeProperty__Group__25618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group_3__0_in_rule__DateTimeProperty__Group__35646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__HasDefaultAssignment_3_0_in_rule__DateTimeProperty__Group_3__05689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__Group_3__1_in_rule__DateTimeProperty__Group_3__05698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeProperty__DefaultValueAssignment_3_1_in_rule__DateTimeProperty__Group_3__15726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DescriptionAssignment_0_in_rule__IntegerProperty__Group__05764 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__1_in_rule__IntegerProperty__Group__05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DataTypeAssignment_1_in_rule__IntegerProperty__Group__15802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__2_in_rule__IntegerProperty__Group__15811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__NameAssignment_2_in_rule__IntegerProperty__Group__25839 = new BitSet(new long[]{0x0000040C00000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__3_in_rule__IntegerProperty__Group__25848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_3__0_in_rule__IntegerProperty__Group__35876 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__4_in_rule__IntegerProperty__Group__35886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_4__0_in_rule__IntegerProperty__Group__45914 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group__5_in_rule__IntegerProperty__Group__45924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_5__0_in_rule__IntegerProperty__Group__55952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__HasDefaultAssignment_3_0_in_rule__IntegerProperty__Group_3__05999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_3__1_in_rule__IntegerProperty__Group_3__06008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__DefaultValueAssignment_3_1_in_rule__IntegerProperty__Group_3__16036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerProperty__Group_4__06075 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_4__1_in_rule__IntegerProperty__Group_4__06085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__MinValueAssignment_4_1_in_rule__IntegerProperty__Group_4__16113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__IntegerProperty__Group_5__06152 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerProperty__Group_5__1_in_rule__IntegerProperty__Group_5__06162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerProperty__MaxValueAssignment_5_1_in_rule__IntegerProperty__Group_5__16190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__DescriptionAssignment_0_in_rule__DecimalProperty__Group__06228 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__1_in_rule__DecimalProperty__Group__06238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__DataTypeAssignment_1_in_rule__DecimalProperty__Group__16266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalProperty__Group__2_in_rule__DecimalProperty__Group__16275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalProperty__NameAssignment_2_in_rule__DecimalProperty__Group__26303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__DescriptionAssignment_0_in_rule__EnumerationProperty__Group__06343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__1_in_rule__EnumerationProperty__Group__06353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__TypeAssignment_1_in_rule__EnumerationProperty__Group__16381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__2_in_rule__EnumerationProperty__Group__16390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__NameAssignment_2_in_rule__EnumerationProperty__Group__26418 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group__3_in_rule__EnumerationProperty__Group__26427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group_3__0_in_rule__EnumerationProperty__Group__36455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__HasDefaultAssignment_3_0_in_rule__EnumerationProperty__Group_3__06498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__Group_3__1_in_rule__EnumerationProperty__Group_3__06507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationProperty__Group_3__16535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessDomainModel__DescriptionAssignment_06573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessDomainModel__NameAssignment_26604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessClass_in_rule__BusinessDomainModel__TypesAssignment_4_06635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerEnumeration_in_rule__BusinessDomainModel__EnumerationsAssignment_4_16666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__BusinessDomainModel__AssociationsAssignment_4_26697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__DescriptionAssignment_06728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_26763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceRoleNameAssignment_36798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceForeignKeyAssignment_4_16829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAlternateKeyAssignment_5_16860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Association__SourceMultiplicityAssignment_66891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Association__BidirectionalAssignment_7_06927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Association__TargetMultiplicityAssignment_86966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TableAssignment_9_16997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_107032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetRoleNameAssignment_117067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetForeignKeyAssignment_12_17098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAlternateKeyAssignment_13_17129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Association__OrderedAssignment_14_07165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__OrderingColumnAssignment_14_1_17204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessClass__DescriptionAssignment_07235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__NameAssignment_27266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__SuperclassAssignment_3_17301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessClass__TableAssignment_4_17336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__BusinessClass__PropertiesAssignment_67367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBusinessRule_in_rule__BusinessClass__BusinessRulesAssignment_7_27398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IntegerEnumeration__DescriptionAssignment_07429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerEnumeration__NameAssignment_27460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerEnumerationLiteral_in_rule__IntegerEnumeration__EnumerationLiteralsAssignment_47491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerEnumerationLiteral__NameAssignment_07522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerEnumerationLiteral__PersistedValueAssignment_1_17553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BusinessRule__DescriptionAssignment_07584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_17615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UniqueRule__DescriptionAssignment_07646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__NameAssignment_27677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_47712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueRule__PropertiesAssignment_5_17751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Property__NullableAssignment_17791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Property__DerivedAssignment_2_07835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Property__WritableAssignment_2_17879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__ColumnAssignment_3_17918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BoolProperty__DescriptionAssignment_07949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BoolProperty__DataTypeAssignment_17985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BoolProperty__NameAssignment_28024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__BoolProperty__HasDefaultAssignment_3_08060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__BoolProperty__DefaultValueAssignment_3_1_08104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__DescriptionAssignment_08143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StringProperty__DataTypeAssignment_18179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringProperty__NameAssignment_28218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StringProperty__HasDefaultAssignment_3_08254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__DefaultValueAssignment_3_18293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringProperty__MinLengthAssignment_4_18324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringProperty__MaxLengthAssignment_5_18355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringProperty__RegularExpressionAssignment_6_18386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DescriptionAssignment_08417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__DateTimeProperty__DataTypeAssignment_18453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateTimeProperty__NameAssignment_28492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__DateTimeProperty__HasDefaultAssignment_3_08528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeProperty__DefaultValueAssignment_3_18567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IntegerProperty__DescriptionAssignment_08598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__IntegerProperty__DataTypeAssignment_18634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerProperty__NameAssignment_28673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IntegerProperty__HasDefaultAssignment_3_08709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__DefaultValueAssignment_3_18748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__MinValueAssignment_4_18779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerProperty__MaxValueAssignment_5_18810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecimalProperty__DescriptionAssignment_08841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DecimalProperty__DataTypeAssignment_18877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DecimalProperty__NameAssignment_28916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationProperty__DescriptionAssignment_08947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__TypeAssignment_18982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__NameAssignment_29017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumerationProperty__HasDefaultAssignment_3_09053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationProperty__DefaultValueAsStringAssignment_3_19092 = new BitSet(new long[]{0x0000000000000002L});

}