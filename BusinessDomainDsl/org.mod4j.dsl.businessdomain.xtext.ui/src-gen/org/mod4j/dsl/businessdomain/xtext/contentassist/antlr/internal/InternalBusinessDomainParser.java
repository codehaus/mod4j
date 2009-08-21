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




    // $ANTLR start entryRuleBusinessDomainModel
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:55:1: entryRuleBusinessDomainModel : ruleBusinessDomainModel EOF ;
    public final void entryRuleBusinessDomainModel() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:55:30: ( ruleBusinessDomainModel EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:56:1: ruleBusinessDomainModel EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:63:1: ruleBusinessDomainModel : ( ( rule__BusinessDomainModel__Group__0 ) ) ;
    public final void ruleBusinessDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:67:2: ( ( ( rule__BusinessDomainModel__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:68:1: ( ( rule__BusinessDomainModel__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:68:1: ( ( rule__BusinessDomainModel__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:69:1: ( rule__BusinessDomainModel__Group__0 )
            {
             before(grammarAccess.getBusinessDomainModelAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:70:1: ( rule__BusinessDomainModel__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:70:2: rule__BusinessDomainModel__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:82:1: entryRuleBusinessClassReference : ruleBusinessClassReference EOF ;
    public final void entryRuleBusinessClassReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:82:33: ( ruleBusinessClassReference EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:83:1: ruleBusinessClassReference EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:90:1: ruleBusinessClassReference : ( ( rule__BusinessClassReference__Group__0 ) ) ;
    public final void ruleBusinessClassReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:94:2: ( ( ( rule__BusinessClassReference__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:95:1: ( ( rule__BusinessClassReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:95:1: ( ( rule__BusinessClassReference__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:96:1: ( rule__BusinessClassReference__Group__0 )
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:97:1: ( rule__BusinessClassReference__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:97:2: rule__BusinessClassReference__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:109:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:109:22: ( ruleAssociation EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:110:1: ruleAssociation EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:117:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:121:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:122:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:122:1: ( ( rule__Association__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:123:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:124:1: ( rule__Association__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:124:2: rule__Association__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:136:1: entryRuleBusinessClass : ruleBusinessClass EOF ;
    public final void entryRuleBusinessClass() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:136:24: ( ruleBusinessClass EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:137:1: ruleBusinessClass EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:144:1: ruleBusinessClass : ( ( rule__BusinessClass__Group__0 ) ) ;
    public final void ruleBusinessClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:148:2: ( ( ( rule__BusinessClass__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:149:1: ( ( rule__BusinessClass__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:149:1: ( ( rule__BusinessClass__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:150:1: ( rule__BusinessClass__Group__0 )
            {
             before(grammarAccess.getBusinessClassAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:151:1: ( rule__BusinessClass__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:151:2: rule__BusinessClass__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:163:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:163:22: ( ruleEnumeration EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:164:1: ruleEnumeration EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:171:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:175:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:176:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:176:1: ( ( rule__Enumeration__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:177:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:178:1: ( rule__Enumeration__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:178:2: rule__Enumeration__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:190:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:190:29: ( ruleEnumerationLiteral EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:191:1: ruleEnumerationLiteral EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:198:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:202:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:203:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:203:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:204:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:205:1: ( rule__EnumerationLiteral__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:205:2: rule__EnumerationLiteral__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:217:1: entryRuleAbstractBusinessRule : ruleAbstractBusinessRule EOF ;
    public final void entryRuleAbstractBusinessRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:217:31: ( ruleAbstractBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:218:1: ruleAbstractBusinessRule EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:225:1: ruleAbstractBusinessRule : ( ( rule__AbstractBusinessRule__Alternatives ) ) ;
    public final void ruleAbstractBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:229:2: ( ( ( rule__AbstractBusinessRule__Alternatives ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:230:1: ( ( rule__AbstractBusinessRule__Alternatives ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:230:1: ( ( rule__AbstractBusinessRule__Alternatives ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:231:1: ( rule__AbstractBusinessRule__Alternatives )
            {
             before(grammarAccess.getAbstractBusinessRuleAccess().getAlternatives()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:232:1: ( rule__AbstractBusinessRule__Alternatives )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:232:2: rule__AbstractBusinessRule__Alternatives
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:244:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:244:23: ( ruleBusinessRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:245:1: ruleBusinessRule EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:252:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:256:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:257:1: ( ( rule__BusinessRule__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:257:1: ( ( rule__BusinessRule__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:258:1: ( rule__BusinessRule__Group__0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:259:1: ( rule__BusinessRule__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:259:2: rule__BusinessRule__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:271:1: entryRuleUniqueRule : ruleUniqueRule EOF ;
    public final void entryRuleUniqueRule() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:271:21: ( ruleUniqueRule EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:272:1: ruleUniqueRule EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:279:1: ruleUniqueRule : ( ( rule__UniqueRule__Group__0 ) ) ;
    public final void ruleUniqueRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:283:2: ( ( ( rule__UniqueRule__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:284:1: ( ( rule__UniqueRule__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:284:1: ( ( rule__UniqueRule__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:285:1: ( rule__UniqueRule__Group__0 )
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:286:1: ( rule__UniqueRule__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:286:2: rule__UniqueRule__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:298:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:298:19: ( ruleProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:299:1: ruleProperty EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:306:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:310:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:311:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:311:1: ( ( rule__Property__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:312:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:313:1: ( rule__Property__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:313:2: rule__Property__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:325:1: entryRuleBoolProperty : ruleBoolProperty EOF ;
    public final void entryRuleBoolProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:325:23: ( ruleBoolProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:326:1: ruleBoolProperty EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:333:1: ruleBoolProperty : ( ( rule__BoolProperty__Group__0 ) ) ;
    public final void ruleBoolProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:337:2: ( ( ( rule__BoolProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:338:1: ( ( rule__BoolProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:338:1: ( ( rule__BoolProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:339:1: ( rule__BoolProperty__Group__0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:340:1: ( rule__BoolProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:340:2: rule__BoolProperty__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:352:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:352:25: ( ruleStringProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:353:1: ruleStringProperty EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:360:1: ruleStringProperty : ( ( rule__StringProperty__Group__0 ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:364:2: ( ( ( rule__StringProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:365:1: ( ( rule__StringProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:365:1: ( ( rule__StringProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:366:1: ( rule__StringProperty__Group__0 )
            {
             before(grammarAccess.getStringPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:367:1: ( rule__StringProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:367:2: rule__StringProperty__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:379:1: entryRuleDateTimeProperty : ruleDateTimeProperty EOF ;
    public final void entryRuleDateTimeProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:379:27: ( ruleDateTimeProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:380:1: ruleDateTimeProperty EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:387:1: ruleDateTimeProperty : ( ( rule__DateTimeProperty__Group__0 ) ) ;
    public final void ruleDateTimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:391:2: ( ( ( rule__DateTimeProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:392:1: ( ( rule__DateTimeProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:392:1: ( ( rule__DateTimeProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:393:1: ( rule__DateTimeProperty__Group__0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:394:1: ( rule__DateTimeProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:394:2: rule__DateTimeProperty__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:406:1: entryRuleIntegerProperty : ruleIntegerProperty EOF ;
    public final void entryRuleIntegerProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:406:26: ( ruleIntegerProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:407:1: ruleIntegerProperty EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:414:1: ruleIntegerProperty : ( ( rule__IntegerProperty__Group__0 ) ) ;
    public final void ruleIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:418:2: ( ( ( rule__IntegerProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:419:1: ( ( rule__IntegerProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:419:1: ( ( rule__IntegerProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:420:1: ( rule__IntegerProperty__Group__0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:421:1: ( rule__IntegerProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:421:2: rule__IntegerProperty__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:433:1: entryRuleDecimalProperty : ruleDecimalProperty EOF ;
    public final void entryRuleDecimalProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:433:26: ( ruleDecimalProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:434:1: ruleDecimalProperty EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:441:1: ruleDecimalProperty : ( ( rule__DecimalProperty__Group__0 ) ) ;
    public final void ruleDecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:445:2: ( ( ( rule__DecimalProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:446:1: ( ( rule__DecimalProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:446:1: ( ( rule__DecimalProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:447:1: ( rule__DecimalProperty__Group__0 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:448:1: ( rule__DecimalProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:448:2: rule__DecimalProperty__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:460:1: entryRuleEnumerationProperty : ruleEnumerationProperty EOF ;
    public final void entryRuleEnumerationProperty() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:460:30: ( ruleEnumerationProperty EOF )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:461:1: ruleEnumerationProperty EOF
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:468:1: ruleEnumerationProperty : ( ( rule__EnumerationProperty__Group__0 ) ) ;
    public final void ruleEnumerationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:472:2: ( ( ( rule__EnumerationProperty__Group__0 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:473:1: ( ( rule__EnumerationProperty__Group__0 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:473:1: ( ( rule__EnumerationProperty__Group__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:474:1: ( rule__EnumerationProperty__Group__0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:475:1: ( rule__EnumerationProperty__Group__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:475:2: rule__EnumerationProperty__Group__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:488:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:492:1: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:493:1: ( ( rule__Multiplicity__Alternatives ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:493:1: ( ( rule__Multiplicity__Alternatives ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:494:1: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:495:1: ( rule__Multiplicity__Alternatives )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:495:2: rule__Multiplicity__Alternatives
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:510:1: rule__BusinessDomainModel__Alternatives_5 : ( ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) ) );
    public final void rule__BusinessDomainModel__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:514:1: ( ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) ) )
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
                        new NoViableAltException("510:1: rule__BusinessDomainModel__Alternatives_5 : ( ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) ) );", 1, 1, input);

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
                    new NoViableAltException("510:1: rule__BusinessDomainModel__Alternatives_5 : ( ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) ) | ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) ) | ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:515:1: ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:515:1: ( ( rule__BusinessDomainModel__TypesAssignment_5_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:516:1: ( rule__BusinessDomainModel__TypesAssignment_5_0 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_5_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:517:1: ( rule__BusinessDomainModel__TypesAssignment_5_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:517:2: rule__BusinessDomainModel__TypesAssignment_5_0
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:6: ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:521:6: ( ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:522:1: ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getEnumerationsAssignment_5_1()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:523:1: ( rule__BusinessDomainModel__EnumerationsAssignment_5_1 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:523:2: rule__BusinessDomainModel__EnumerationsAssignment_5_1
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:6: ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:527:6: ( ( rule__BusinessDomainModel__AssociationsAssignment_5_2 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:528:1: ( rule__BusinessDomainModel__AssociationsAssignment_5_2 )
                    {
                     before(grammarAccess.getBusinessDomainModelAccess().getAssociationsAssignment_5_2()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:529:1: ( rule__BusinessDomainModel__AssociationsAssignment_5_2 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:529:2: rule__BusinessDomainModel__AssociationsAssignment_5_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:538:1: rule__Association__Alternatives_5 : ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) );
    public final void rule__Association__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:542:1: ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) )
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
                    new NoViableAltException("538:1: rule__Association__Alternatives_5 : ( ( ( rule__Association__BidirectionalAssignment_5_0 ) ) | ( '->' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:543:1: ( ( rule__Association__BidirectionalAssignment_5_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:543:1: ( ( rule__Association__BidirectionalAssignment_5_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:544:1: ( rule__Association__BidirectionalAssignment_5_0 )
                    {
                     before(grammarAccess.getAssociationAccess().getBidirectionalAssignment_5_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:545:1: ( rule__Association__BidirectionalAssignment_5_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:545:2: rule__Association__BidirectionalAssignment_5_0
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:549:6: ( '->' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:549:6: ( '->' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:550:1: '->'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:562:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );
    public final void rule__AbstractBusinessRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:566:1: ( ( ruleBusinessRule ) | ( ruleUniqueRule ) )
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
                        new NoViableAltException("562:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );", 3, 1, input);

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
                    new NoViableAltException("562:1: rule__AbstractBusinessRule__Alternatives : ( ( ruleBusinessRule ) | ( ruleUniqueRule ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:567:1: ( ruleBusinessRule )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:567:1: ( ruleBusinessRule )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:568:1: ruleBusinessRule
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:573:6: ( ruleUniqueRule )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:573:6: ( ruleUniqueRule )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:574:1: ruleUniqueRule
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:584:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );
    public final void rule__Property__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:588:1: ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) )
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
                        new NoViableAltException("584:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 1, input);

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
                    new NoViableAltException("584:1: rule__Property__Alternatives_0 : ( ( ruleBoolProperty ) | ( ruleStringProperty ) | ( ruleDateTimeProperty ) | ( ruleIntegerProperty ) | ( ruleDecimalProperty ) | ( ruleEnumerationProperty ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:589:1: ( ruleBoolProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:589:1: ( ruleBoolProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:590:1: ruleBoolProperty
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:595:6: ( ruleStringProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:595:6: ( ruleStringProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:596:1: ruleStringProperty
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:601:6: ( ruleDateTimeProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:601:6: ( ruleDateTimeProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:602:1: ruleDateTimeProperty
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:607:6: ( ruleIntegerProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:607:6: ( ruleIntegerProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:608:1: ruleIntegerProperty
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:613:6: ( ruleDecimalProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:613:6: ( ruleDecimalProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:614:1: ruleDecimalProperty
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:619:6: ( ruleEnumerationProperty )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:619:6: ( ruleEnumerationProperty )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:620:1: ruleEnumerationProperty
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:630:1: rule__BoolProperty__Alternatives_3_1 : ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) );
    public final void rule__BoolProperty__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:634:1: ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) )
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
                    new NoViableAltException("630:1: rule__BoolProperty__Alternatives_3_1 : ( ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:635:1: ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:635:1: ( ( rule__BoolProperty__DefaultValueAssignment_3_1_0 ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:636:1: ( rule__BoolProperty__DefaultValueAssignment_3_1_0 )
                    {
                     before(grammarAccess.getBoolPropertyAccess().getDefaultValueAssignment_3_1_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:637:1: ( rule__BoolProperty__DefaultValueAssignment_3_1_0 )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:637:2: rule__BoolProperty__DefaultValueAssignment_3_1_0
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
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:641:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:641:6: ( 'false' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:642:1: 'false'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:654:1: rule__Multiplicity__Alternatives : ( ( ( 'many' ) ) | ( ( 'one' ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:658:1: ( ( ( 'many' ) ) | ( ( 'one' ) ) )
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
                    new NoViableAltException("654:1: rule__Multiplicity__Alternatives : ( ( ( 'many' ) ) | ( ( 'one' ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:659:1: ( ( 'many' ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:659:1: ( ( 'many' ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:660:1: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:661:1: ( 'many' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:661:3: 'many'
                    {
                    match(input,13,FOLLOW_13_in_rule__Multiplicity__Alternatives1412); 

                    }

                     after(grammarAccess.getMultiplicityAccess().getZeroManyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:666:6: ( ( 'one' ) )
                    {
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:666:6: ( ( 'one' ) )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:667:1: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityAccess().getZeroOneEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:668:1: ( 'one' )
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:668:3: 'one'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:682:1: rule__BusinessDomainModel__Group__0 : ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1 ;
    public final void rule__BusinessDomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:686:1: ( ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:687:1: ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? ) rule__BusinessDomainModel__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:687:1: ( ( rule__BusinessDomainModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:688:1: ( rule__BusinessDomainModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessDomainModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:689:1: ( rule__BusinessDomainModel__DescriptionAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:689:2: rule__BusinessDomainModel__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:700:1: rule__BusinessDomainModel__Group__1 : ( 'domain' ) rule__BusinessDomainModel__Group__2 ;
    public final void rule__BusinessDomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:704:1: ( ( 'domain' ) rule__BusinessDomainModel__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:705:1: ( 'domain' ) rule__BusinessDomainModel__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:705:1: ( 'domain' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:706:1: 'domain'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:720:1: rule__BusinessDomainModel__Group__2 : ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3 ;
    public final void rule__BusinessDomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:724:1: ( ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:725:1: ( ( rule__BusinessDomainModel__NameAssignment_2 ) ) rule__BusinessDomainModel__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:725:1: ( ( rule__BusinessDomainModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:726:1: ( rule__BusinessDomainModel__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessDomainModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:727:1: ( rule__BusinessDomainModel__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:727:2: rule__BusinessDomainModel__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:738:1: rule__BusinessDomainModel__Group__3 : ( ';' ) rule__BusinessDomainModel__Group__4 ;
    public final void rule__BusinessDomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:742:1: ( ( ';' ) rule__BusinessDomainModel__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:743:1: ( ';' ) rule__BusinessDomainModel__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:743:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:744:1: ';'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:758:1: rule__BusinessDomainModel__Group__4 : ( ( rule__BusinessDomainModel__TypesAssignment_4 )* ) rule__BusinessDomainModel__Group__5 ;
    public final void rule__BusinessDomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:762:1: ( ( ( rule__BusinessDomainModel__TypesAssignment_4 )* ) rule__BusinessDomainModel__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:763:1: ( ( rule__BusinessDomainModel__TypesAssignment_4 )* ) rule__BusinessDomainModel__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:763:1: ( ( rule__BusinessDomainModel__TypesAssignment_4 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:764:1: ( rule__BusinessDomainModel__TypesAssignment_4 )*
            {
             before(grammarAccess.getBusinessDomainModelAccess().getTypesAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:765:1: ( rule__BusinessDomainModel__TypesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:765:2: rule__BusinessDomainModel__TypesAssignment_4
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:776:1: rule__BusinessDomainModel__Group__5 : ( ( rule__BusinessDomainModel__Alternatives_5 )* ) ;
    public final void rule__BusinessDomainModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:780:1: ( ( ( rule__BusinessDomainModel__Alternatives_5 )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:781:1: ( ( rule__BusinessDomainModel__Alternatives_5 )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:781:1: ( ( rule__BusinessDomainModel__Alternatives_5 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:782:1: ( rule__BusinessDomainModel__Alternatives_5 )*
            {
             before(grammarAccess.getBusinessDomainModelAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:783:1: ( rule__BusinessDomainModel__Alternatives_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||(LA9_0>=19 && LA9_0<=20)||LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:783:2: rule__BusinessDomainModel__Alternatives_5
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:805:1: rule__BusinessClassReference__Group__0 : ( 'from' ) rule__BusinessClassReference__Group__1 ;
    public final void rule__BusinessClassReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:809:1: ( ( 'from' ) rule__BusinessClassReference__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:810:1: ( 'from' ) rule__BusinessClassReference__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:810:1: ( 'from' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:811:1: 'from'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:825:1: rule__BusinessClassReference__Group__1 : ( ( rule__BusinessClassReference__ReferredModelAssignment_1 ) ) rule__BusinessClassReference__Group__2 ;
    public final void rule__BusinessClassReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:829:1: ( ( ( rule__BusinessClassReference__ReferredModelAssignment_1 ) ) rule__BusinessClassReference__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:830:1: ( ( rule__BusinessClassReference__ReferredModelAssignment_1 ) ) rule__BusinessClassReference__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:830:1: ( ( rule__BusinessClassReference__ReferredModelAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:831:1: ( rule__BusinessClassReference__ReferredModelAssignment_1 )
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getReferredModelAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:832:1: ( rule__BusinessClassReference__ReferredModelAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:832:2: rule__BusinessClassReference__ReferredModelAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:843:1: rule__BusinessClassReference__Group__2 : ( 'import' ) rule__BusinessClassReference__Group__3 ;
    public final void rule__BusinessClassReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:847:1: ( ( 'import' ) rule__BusinessClassReference__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:848:1: ( 'import' ) rule__BusinessClassReference__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:848:1: ( 'import' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:849:1: 'import'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:863:1: rule__BusinessClassReference__Group__3 : ( ( rule__BusinessClassReference__NameAssignment_3 ) ) rule__BusinessClassReference__Group__4 ;
    public final void rule__BusinessClassReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:867:1: ( ( ( rule__BusinessClassReference__NameAssignment_3 ) ) rule__BusinessClassReference__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:868:1: ( ( rule__BusinessClassReference__NameAssignment_3 ) ) rule__BusinessClassReference__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:868:1: ( ( rule__BusinessClassReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:869:1: ( rule__BusinessClassReference__NameAssignment_3 )
            {
             before(grammarAccess.getBusinessClassReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:870:1: ( rule__BusinessClassReference__NameAssignment_3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:870:2: rule__BusinessClassReference__NameAssignment_3
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:881:1: rule__BusinessClassReference__Group__4 : ( ';' ) ;
    public final void rule__BusinessClassReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:885:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:886:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:886:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:887:1: ';'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:910:1: rule__Association__Group__0 : ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:914:1: ( ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:915:1: ( ( rule__Association__DescriptionAssignment_0 )? ) rule__Association__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:915:1: ( ( rule__Association__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:916:1: ( rule__Association__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getAssociationAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:917:1: ( rule__Association__DescriptionAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:917:2: rule__Association__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:928:1: rule__Association__Group__1 : ( 'association' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:932:1: ( ( 'association' ) rule__Association__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:933:1: ( 'association' ) rule__Association__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:933:1: ( 'association' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:934:1: 'association'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:948:1: rule__Association__Group__2 : ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:952:1: ( ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:953:1: ( ( rule__Association__SourceAssignment_2 ) ) rule__Association__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:953:1: ( ( rule__Association__SourceAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:954:1: ( rule__Association__SourceAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:955:1: ( rule__Association__SourceAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:955:2: rule__Association__SourceAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:966:1: rule__Association__Group__3 : ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:970:1: ( ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:971:1: ( ( rule__Association__SourceRoleNameAssignment_3 ) ) rule__Association__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:971:1: ( ( rule__Association__SourceRoleNameAssignment_3 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:972:1: ( rule__Association__SourceRoleNameAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getSourceRoleNameAssignment_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:973:1: ( rule__Association__SourceRoleNameAssignment_3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:973:2: rule__Association__SourceRoleNameAssignment_3
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:984:1: rule__Association__Group__4 : ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:988:1: ( ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:989:1: ( ( rule__Association__SourceMultiplicityAssignment_4 ) ) rule__Association__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:989:1: ( ( rule__Association__SourceMultiplicityAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:990:1: ( rule__Association__SourceMultiplicityAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getSourceMultiplicityAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:991:1: ( rule__Association__SourceMultiplicityAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:991:2: rule__Association__SourceMultiplicityAssignment_4
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1002:1: rule__Association__Group__5 : ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1006:1: ( ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1007:1: ( ( rule__Association__Alternatives_5 ) ) rule__Association__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1007:1: ( ( rule__Association__Alternatives_5 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1008:1: ( rule__Association__Alternatives_5 )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1009:1: ( rule__Association__Alternatives_5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1009:2: rule__Association__Alternatives_5
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1020:1: rule__Association__Group__6 : ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1024:1: ( ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1025:1: ( ( rule__Association__TargetMultiplicityAssignment_6 ) ) rule__Association__Group__7
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1025:1: ( ( rule__Association__TargetMultiplicityAssignment_6 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1026:1: ( rule__Association__TargetMultiplicityAssignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getTargetMultiplicityAssignment_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1027:1: ( rule__Association__TargetMultiplicityAssignment_6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1027:2: rule__Association__TargetMultiplicityAssignment_6
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1038:1: rule__Association__Group__7 : ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1042:1: ( ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1043:1: ( ( rule__Association__TargetAssignment_7 ) ) rule__Association__Group__8
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1043:1: ( ( rule__Association__TargetAssignment_7 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1044:1: ( rule__Association__TargetAssignment_7 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_7()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1045:1: ( rule__Association__TargetAssignment_7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1045:2: rule__Association__TargetAssignment_7
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1056:1: rule__Association__Group__8 : ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1060:1: ( ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1061:1: ( ( rule__Association__TargetRoleNameAssignment_8 ) ) rule__Association__Group__9
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1061:1: ( ( rule__Association__TargetRoleNameAssignment_8 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1062:1: ( rule__Association__TargetRoleNameAssignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getTargetRoleNameAssignment_8()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1063:1: ( rule__Association__TargetRoleNameAssignment_8 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1063:2: rule__Association__TargetRoleNameAssignment_8
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1074:1: rule__Association__Group__9 : ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1078:1: ( ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1079:1: ( ( rule__Association__OrderedAssignment_9 )? ) rule__Association__Group__10
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1079:1: ( ( rule__Association__OrderedAssignment_9 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1080:1: ( rule__Association__OrderedAssignment_9 )?
            {
             before(grammarAccess.getAssociationAccess().getOrderedAssignment_9()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1081:1: ( rule__Association__OrderedAssignment_9 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1081:2: rule__Association__OrderedAssignment_9
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1092:1: rule__Association__Group__10 : ( ';' ) ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1096:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1097:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1097:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1098:1: ';'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1133:1: rule__BusinessClass__Group__0 : ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 ;
    public final void rule__BusinessClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1137:1: ( ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1138:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? ) rule__BusinessClass__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1138:1: ( ( rule__BusinessClass__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1139:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1140:1: ( rule__BusinessClass__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1140:2: rule__BusinessClass__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1151:1: rule__BusinessClass__Group__1 : ( 'class' ) rule__BusinessClass__Group__2 ;
    public final void rule__BusinessClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1155:1: ( ( 'class' ) rule__BusinessClass__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1156:1: ( 'class' ) rule__BusinessClass__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1156:1: ( 'class' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1157:1: 'class'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1171:1: rule__BusinessClass__Group__2 : ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 ;
    public final void rule__BusinessClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1175:1: ( ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1176:1: ( ( rule__BusinessClass__NameAssignment_2 ) ) rule__BusinessClass__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1176:1: ( ( rule__BusinessClass__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1177:1: ( rule__BusinessClass__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessClassAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1178:1: ( rule__BusinessClass__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1178:2: rule__BusinessClass__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1189:1: rule__BusinessClass__Group__3 : ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 ;
    public final void rule__BusinessClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1193:1: ( ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1194:1: ( ( rule__BusinessClass__Group_3__0 )? ) rule__BusinessClass__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1194:1: ( ( rule__BusinessClass__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1195:1: ( rule__BusinessClass__Group_3__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1196:1: ( rule__BusinessClass__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1196:2: rule__BusinessClass__Group_3__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1207:1: rule__BusinessClass__Group__4 : ( '[' ) rule__BusinessClass__Group__5 ;
    public final void rule__BusinessClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1211:1: ( ( '[' ) rule__BusinessClass__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1212:1: ( '[' ) rule__BusinessClass__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1212:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1213:1: '['
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1227:1: rule__BusinessClass__Group__5 : ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6 ;
    public final void rule__BusinessClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1231:1: ( ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1232:1: ( ( rule__BusinessClass__PropertiesAssignment_5 )* ) rule__BusinessClass__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1232:1: ( ( rule__BusinessClass__PropertiesAssignment_5 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1233:1: ( rule__BusinessClass__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getBusinessClassAccess().getPropertiesAssignment_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1234:1: ( rule__BusinessClass__PropertiesAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==39||(LA14_0>=42 && LA14_0<=45)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1234:2: rule__BusinessClass__PropertiesAssignment_5
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1245:1: rule__BusinessClass__Group__6 : ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7 ;
    public final void rule__BusinessClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1249:1: ( ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1250:1: ( ( rule__BusinessClass__Group_6__0 )? ) rule__BusinessClass__Group__7
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1250:1: ( ( rule__BusinessClass__Group_6__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1251:1: ( rule__BusinessClass__Group_6__0 )?
            {
             before(grammarAccess.getBusinessClassAccess().getGroup_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1252:1: ( rule__BusinessClass__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1252:2: rule__BusinessClass__Group_6__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1263:1: rule__BusinessClass__Group__7 : ( ']' ) ;
    public final void rule__BusinessClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1267:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1268:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1268:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1269:1: ']'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1298:1: rule__BusinessClass__Group_3__0 : ( 'inherits' ) rule__BusinessClass__Group_3__1 ;
    public final void rule__BusinessClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1302:1: ( ( 'inherits' ) rule__BusinessClass__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1303:1: ( 'inherits' ) rule__BusinessClass__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1303:1: ( 'inherits' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1304:1: 'inherits'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1318:1: rule__BusinessClass__Group_3__1 : ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) ;
    public final void rule__BusinessClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1322:1: ( ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1323:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1323:1: ( ( rule__BusinessClass__SuperclassAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1324:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1325:1: ( rule__BusinessClass__SuperclassAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1325:2: rule__BusinessClass__SuperclassAssignment_3_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1339:1: rule__BusinessClass__Group_6__0 : ( 'rules' ) rule__BusinessClass__Group_6__1 ;
    public final void rule__BusinessClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1343:1: ( ( 'rules' ) rule__BusinessClass__Group_6__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1344:1: ( 'rules' ) rule__BusinessClass__Group_6__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1344:1: ( 'rules' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1345:1: 'rules'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1359:1: rule__BusinessClass__Group_6__1 : ( '[' ) rule__BusinessClass__Group_6__2 ;
    public final void rule__BusinessClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1363:1: ( ( '[' ) rule__BusinessClass__Group_6__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1364:1: ( '[' ) rule__BusinessClass__Group_6__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1364:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1365:1: '['
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1379:1: rule__BusinessClass__Group_6__2 : ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3 ;
    public final void rule__BusinessClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1383:1: ( ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1384:1: ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* ) rule__BusinessClass__Group_6__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1384:1: ( ( rule__BusinessClass__BusinessRulesAssignment_6_2 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1385:1: ( rule__BusinessClass__BusinessRulesAssignment_6_2 )*
            {
             before(grammarAccess.getBusinessClassAccess().getBusinessRulesAssignment_6_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1386:1: ( rule__BusinessClass__BusinessRulesAssignment_6_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1386:2: rule__BusinessClass__BusinessRulesAssignment_6_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1397:1: rule__BusinessClass__Group_6__3 : ( ']' ) ;
    public final void rule__BusinessClass__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1401:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1402:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1402:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1403:1: ']'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1424:1: rule__Enumeration__Group__0 : ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1428:1: ( ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1429:1: ( ( rule__Enumeration__DescriptionAssignment_0 )? ) rule__Enumeration__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1429:1: ( ( rule__Enumeration__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1430:1: ( rule__Enumeration__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1431:1: ( rule__Enumeration__DescriptionAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1431:2: rule__Enumeration__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1442:1: rule__Enumeration__Group__1 : ( 'enumeration' ) rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1446:1: ( ( 'enumeration' ) rule__Enumeration__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1447:1: ( 'enumeration' ) rule__Enumeration__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1447:1: ( 'enumeration' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1448:1: 'enumeration'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1462:1: rule__Enumeration__Group__2 : ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1466:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1467:1: ( ( rule__Enumeration__NameAssignment_2 ) ) rule__Enumeration__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1467:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1468:1: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1469:1: ( rule__Enumeration__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1469:2: rule__Enumeration__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1480:1: rule__Enumeration__Group__3 : ( '[' ) rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1484:1: ( ( '[' ) rule__Enumeration__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1485:1: ( '[' ) rule__Enumeration__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1485:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1486:1: '['
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1500:1: rule__Enumeration__Group__4 : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1504:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1505:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) ) rule__Enumeration__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1505:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1506:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1506:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1507:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1508:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1508:2: rule__Enumeration__EnumerationLiteralsAssignment_4
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_4_in_rule__Enumeration__Group__43051);
            rule__Enumeration__EnumerationLiteralsAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 

            }

            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1511:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_4 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1512:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1513:1: ( rule__Enumeration__EnumerationLiteralsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1513:2: rule__Enumeration__EnumerationLiteralsAssignment_4
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1525:1: rule__Enumeration__Group__5 : ( ']' ) ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1529:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1530:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1530:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1531:1: ']'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1556:1: rule__EnumerationLiteral__Group__0 : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1560:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1561:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) rule__EnumerationLiteral__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1561:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1562:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1563:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1563:2: rule__EnumerationLiteral__NameAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1574:1: rule__EnumerationLiteral__Group__1 : ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1578:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1579:1: ( ( rule__EnumerationLiteral__Group_1__0 ) ) rule__EnumerationLiteral__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1579:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1580:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1581:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1581:2: rule__EnumerationLiteral__Group_1__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1592:1: rule__EnumerationLiteral__Group__2 : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1596:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1597:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1597:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1598:1: ';'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1617:1: rule__EnumerationLiteral__Group_1__0 : ( '=' ) rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1621:1: ( ( '=' ) rule__EnumerationLiteral__Group_1__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1622:1: ( '=' ) rule__EnumerationLiteral__Group_1__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1622:1: ( '=' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1623:1: '='
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1637:1: rule__EnumerationLiteral__Group_1__1 : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1641:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1642:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1642:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1643:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1644:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1644:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1658:1: rule__BusinessRule__Group__0 : ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1662:1: ( ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1663:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? ) rule__BusinessRule__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1663:1: ( ( rule__BusinessRule__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1664:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBusinessRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1665:1: ( rule__BusinessRule__DescriptionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1665:2: rule__BusinessRule__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1676:1: rule__BusinessRule__Group__1 : ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1680:1: ( ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1681:1: ( ( rule__BusinessRule__NameAssignment_1 ) ) rule__BusinessRule__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1681:1: ( ( rule__BusinessRule__NameAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1682:1: ( rule__BusinessRule__NameAssignment_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1683:1: ( rule__BusinessRule__NameAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1683:2: rule__BusinessRule__NameAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1694:1: rule__BusinessRule__Group__2 : ( ';' ) ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1698:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1699:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1699:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1700:1: ';'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1719:1: rule__UniqueRule__Group__0 : ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 ;
    public final void rule__UniqueRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1723:1: ( ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1724:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? ) rule__UniqueRule__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1724:1: ( ( rule__UniqueRule__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1725:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getUniqueRuleAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1726:1: ( rule__UniqueRule__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1726:2: rule__UniqueRule__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1737:1: rule__UniqueRule__Group__1 : ( 'unique' ) rule__UniqueRule__Group__2 ;
    public final void rule__UniqueRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1741:1: ( ( 'unique' ) rule__UniqueRule__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1742:1: ( 'unique' ) rule__UniqueRule__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1742:1: ( 'unique' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1743:1: 'unique'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1757:1: rule__UniqueRule__Group__2 : ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 ;
    public final void rule__UniqueRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1761:1: ( ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1762:1: ( ( rule__UniqueRule__NameAssignment_2 ) ) rule__UniqueRule__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1762:1: ( ( rule__UniqueRule__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1763:1: ( rule__UniqueRule__NameAssignment_2 )
            {
             before(grammarAccess.getUniqueRuleAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1764:1: ( rule__UniqueRule__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1764:2: rule__UniqueRule__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1775:1: rule__UniqueRule__Group__3 : ( '[' ) rule__UniqueRule__Group__4 ;
    public final void rule__UniqueRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1779:1: ( ( '[' ) rule__UniqueRule__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1780:1: ( '[' ) rule__UniqueRule__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1780:1: ( '[' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1781:1: '['
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1795:1: rule__UniqueRule__Group__4 : ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 ;
    public final void rule__UniqueRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1799:1: ( ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1800:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) ) rule__UniqueRule__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1800:1: ( ( rule__UniqueRule__PropertiesAssignment_4 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1801:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1802:1: ( rule__UniqueRule__PropertiesAssignment_4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1802:2: rule__UniqueRule__PropertiesAssignment_4
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1813:1: rule__UniqueRule__Group__5 : ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 ;
    public final void rule__UniqueRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1817:1: ( ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1818:1: ( ( rule__UniqueRule__Group_5__0 )* ) rule__UniqueRule__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1818:1: ( ( rule__UniqueRule__Group_5__0 )* )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1819:1: ( rule__UniqueRule__Group_5__0 )*
            {
             before(grammarAccess.getUniqueRuleAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1820:1: ( rule__UniqueRule__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1820:2: rule__UniqueRule__Group_5__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1831:1: rule__UniqueRule__Group__6 : ( ']' ) ;
    public final void rule__UniqueRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1835:1: ( ( ']' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1836:1: ( ']' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1836:1: ( ']' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1837:1: ']'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1864:1: rule__UniqueRule__Group_5__0 : ( ',' ) rule__UniqueRule__Group_5__1 ;
    public final void rule__UniqueRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1868:1: ( ( ',' ) rule__UniqueRule__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1869:1: ( ',' ) rule__UniqueRule__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1869:1: ( ',' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1870:1: ','
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1884:1: rule__UniqueRule__Group_5__1 : ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) ;
    public final void rule__UniqueRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1888:1: ( ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1889:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1889:1: ( ( rule__UniqueRule__PropertiesAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1890:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1891:1: ( rule__UniqueRule__PropertiesAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1891:2: rule__UniqueRule__PropertiesAssignment_5_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1905:1: rule__Property__Group__0 : ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1909:1: ( ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1910:1: ( ( rule__Property__Alternatives_0 ) ) rule__Property__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1910:1: ( ( rule__Property__Alternatives_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1911:1: ( rule__Property__Alternatives_0 )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1912:1: ( rule__Property__Alternatives_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1912:2: rule__Property__Alternatives_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1923:1: rule__Property__Group__1 : ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1927:1: ( ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1928:1: ( ( rule__Property__NullableAssignment_1 )? ) rule__Property__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1928:1: ( ( rule__Property__NullableAssignment_1 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1929:1: ( rule__Property__NullableAssignment_1 )?
            {
             before(grammarAccess.getPropertyAccess().getNullableAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1930:1: ( rule__Property__NullableAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1930:2: rule__Property__NullableAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1941:1: rule__Property__Group__2 : ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1945:1: ( ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1946:1: ( ( rule__Property__Group_2__0 )? ) rule__Property__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1946:1: ( ( rule__Property__Group_2__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1947:1: ( rule__Property__Group_2__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1948:1: ( rule__Property__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1948:2: rule__Property__Group_2__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1959:1: rule__Property__Group__3 : ( ';' ) ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1963:1: ( ( ';' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1964:1: ( ';' )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1964:1: ( ';' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1965:1: ';'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1986:1: rule__Property__Group_2__0 : ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1990:1: ( ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1991:1: ( ( rule__Property__DerivedAssignment_2_0 ) ) rule__Property__Group_2__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1991:1: ( ( rule__Property__DerivedAssignment_2_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1992:1: ( rule__Property__DerivedAssignment_2_0 )
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_2_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1993:1: ( rule__Property__DerivedAssignment_2_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:1993:2: rule__Property__DerivedAssignment_2_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2004:1: rule__Property__Group_2__1 : ( ( rule__Property__WritableAssignment_2_1 )? ) ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2008:1: ( ( ( rule__Property__WritableAssignment_2_1 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2009:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2009:1: ( ( rule__Property__WritableAssignment_2_1 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2010:1: ( rule__Property__WritableAssignment_2_1 )?
            {
             before(grammarAccess.getPropertyAccess().getWritableAssignment_2_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2011:1: ( rule__Property__WritableAssignment_2_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2011:2: rule__Property__WritableAssignment_2_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2025:1: rule__BoolProperty__Group__0 : ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2029:1: ( ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2030:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? ) rule__BoolProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2030:1: ( ( rule__BoolProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2031:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2032:1: ( rule__BoolProperty__DescriptionAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2032:2: rule__BoolProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2043:1: rule__BoolProperty__Group__1 : ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2047:1: ( ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2048:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) ) rule__BoolProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2048:1: ( ( rule__BoolProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2049:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2050:1: ( rule__BoolProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2050:2: rule__BoolProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2061:1: rule__BoolProperty__Group__2 : ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2065:1: ( ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2066:1: ( ( rule__BoolProperty__NameAssignment_2 ) ) rule__BoolProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2066:1: ( ( rule__BoolProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2067:1: ( rule__BoolProperty__NameAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2068:1: ( rule__BoolProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2068:2: rule__BoolProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2079:1: rule__BoolProperty__Group__3 : ( ( rule__BoolProperty__Group_3__0 )? ) ;
    public final void rule__BoolProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2083:1: ( ( ( rule__BoolProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2084:1: ( ( rule__BoolProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2084:1: ( ( rule__BoolProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2085:1: ( rule__BoolProperty__Group_3__0 )?
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2086:1: ( rule__BoolProperty__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2086:2: rule__BoolProperty__Group_3__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2104:1: rule__BoolProperty__Group_3__0 : ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 ;
    public final void rule__BoolProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2108:1: ( ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2109:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) ) rule__BoolProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2109:1: ( ( rule__BoolProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2110:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2111:1: ( rule__BoolProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2111:2: rule__BoolProperty__HasDefaultAssignment_3_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2122:1: rule__BoolProperty__Group_3__1 : ( ( rule__BoolProperty__Alternatives_3_1 ) ) ;
    public final void rule__BoolProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2126:1: ( ( ( rule__BoolProperty__Alternatives_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2127:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2127:1: ( ( rule__BoolProperty__Alternatives_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2128:1: ( rule__BoolProperty__Alternatives_3_1 )
            {
             before(grammarAccess.getBoolPropertyAccess().getAlternatives_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2129:1: ( rule__BoolProperty__Alternatives_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2129:2: rule__BoolProperty__Alternatives_3_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2143:1: rule__StringProperty__Group__0 : ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2147:1: ( ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2148:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? ) rule__StringProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2148:1: ( ( rule__StringProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2149:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2150:1: ( rule__StringProperty__DescriptionAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2150:2: rule__StringProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2161:1: rule__StringProperty__Group__1 : ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2165:1: ( ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2166:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) ) rule__StringProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2166:1: ( ( rule__StringProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2167:1: ( rule__StringProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2168:1: ( rule__StringProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2168:2: rule__StringProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2179:1: rule__StringProperty__Group__2 : ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2183:1: ( ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2184:1: ( ( rule__StringProperty__NameAssignment_2 ) ) rule__StringProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2184:1: ( ( rule__StringProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2185:1: ( rule__StringProperty__NameAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2186:1: ( rule__StringProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2186:2: rule__StringProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2197:1: rule__StringProperty__Group__3 : ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 ;
    public final void rule__StringProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2201:1: ( ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2202:1: ( ( rule__StringProperty__Group_3__0 )? ) rule__StringProperty__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2202:1: ( ( rule__StringProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2203:1: ( rule__StringProperty__Group_3__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2204:1: ( rule__StringProperty__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2204:2: rule__StringProperty__Group_3__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2215:1: rule__StringProperty__Group__4 : ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 ;
    public final void rule__StringProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2219:1: ( ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2220:1: ( ( rule__StringProperty__Group_4__0 )? ) rule__StringProperty__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2220:1: ( ( rule__StringProperty__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2221:1: ( rule__StringProperty__Group_4__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2222:1: ( rule__StringProperty__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2222:2: rule__StringProperty__Group_4__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2233:1: rule__StringProperty__Group__5 : ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 ;
    public final void rule__StringProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2237:1: ( ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2238:1: ( ( rule__StringProperty__Group_5__0 )? ) rule__StringProperty__Group__6
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2238:1: ( ( rule__StringProperty__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2239:1: ( rule__StringProperty__Group_5__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2240:1: ( rule__StringProperty__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2240:2: rule__StringProperty__Group_5__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2251:1: rule__StringProperty__Group__6 : ( ( rule__StringProperty__Group_6__0 )? ) ;
    public final void rule__StringProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2255:1: ( ( ( rule__StringProperty__Group_6__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2256:1: ( ( rule__StringProperty__Group_6__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2256:1: ( ( rule__StringProperty__Group_6__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2257:1: ( rule__StringProperty__Group_6__0 )?
            {
             before(grammarAccess.getStringPropertyAccess().getGroup_6()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2258:1: ( rule__StringProperty__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2258:2: rule__StringProperty__Group_6__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2282:1: rule__StringProperty__Group_3__0 : ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 ;
    public final void rule__StringProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2286:1: ( ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2287:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) ) rule__StringProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2287:1: ( ( rule__StringProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2288:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2289:1: ( rule__StringProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2289:2: rule__StringProperty__HasDefaultAssignment_3_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2300:1: rule__StringProperty__Group_3__1 : ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__StringProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2304:1: ( ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2305:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2305:1: ( ( rule__StringProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2306:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2307:1: ( rule__StringProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2307:2: rule__StringProperty__DefaultValueAssignment_3_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2321:1: rule__StringProperty__Group_4__0 : ( 'minlength' ) rule__StringProperty__Group_4__1 ;
    public final void rule__StringProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2325:1: ( ( 'minlength' ) rule__StringProperty__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2326:1: ( 'minlength' ) rule__StringProperty__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2326:1: ( 'minlength' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2327:1: 'minlength'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2341:1: rule__StringProperty__Group_4__1 : ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) ;
    public final void rule__StringProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2345:1: ( ( ( rule__StringProperty__MinLengthAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2346:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2346:1: ( ( rule__StringProperty__MinLengthAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2347:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMinLengthAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2348:1: ( rule__StringProperty__MinLengthAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2348:2: rule__StringProperty__MinLengthAssignment_4_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2362:1: rule__StringProperty__Group_5__0 : ( 'maxlength' ) rule__StringProperty__Group_5__1 ;
    public final void rule__StringProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2366:1: ( ( 'maxlength' ) rule__StringProperty__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2367:1: ( 'maxlength' ) rule__StringProperty__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2367:1: ( 'maxlength' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2368:1: 'maxlength'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2382:1: rule__StringProperty__Group_5__1 : ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) ;
    public final void rule__StringProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2386:1: ( ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2387:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2387:1: ( ( rule__StringProperty__MaxLengthAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2388:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getMaxLengthAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2389:1: ( rule__StringProperty__MaxLengthAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2389:2: rule__StringProperty__MaxLengthAssignment_5_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2403:1: rule__StringProperty__Group_6__0 : ( 'regexp' ) rule__StringProperty__Group_6__1 ;
    public final void rule__StringProperty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2407:1: ( ( 'regexp' ) rule__StringProperty__Group_6__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2408:1: ( 'regexp' ) rule__StringProperty__Group_6__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2408:1: ( 'regexp' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2409:1: 'regexp'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2423:1: rule__StringProperty__Group_6__1 : ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) ;
    public final void rule__StringProperty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2427:1: ( ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2428:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2428:1: ( ( rule__StringProperty__RegularExpressionAssignment_6_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2429:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            {
             before(grammarAccess.getStringPropertyAccess().getRegularExpressionAssignment_6_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2430:1: ( rule__StringProperty__RegularExpressionAssignment_6_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2430:2: rule__StringProperty__RegularExpressionAssignment_6_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2444:1: rule__DateTimeProperty__Group__0 : ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 ;
    public final void rule__DateTimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2448:1: ( ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2449:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? ) rule__DateTimeProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2449:1: ( ( rule__DateTimeProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2450:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2451:1: ( rule__DateTimeProperty__DescriptionAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2451:2: rule__DateTimeProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2462:1: rule__DateTimeProperty__Group__1 : ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 ;
    public final void rule__DateTimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2466:1: ( ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2467:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) ) rule__DateTimeProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2467:1: ( ( rule__DateTimeProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2468:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2469:1: ( rule__DateTimeProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2469:2: rule__DateTimeProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2480:1: rule__DateTimeProperty__Group__2 : ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 ;
    public final void rule__DateTimeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2484:1: ( ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2485:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) ) rule__DateTimeProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2485:1: ( ( rule__DateTimeProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2486:1: ( rule__DateTimeProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2487:1: ( rule__DateTimeProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2487:2: rule__DateTimeProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2498:1: rule__DateTimeProperty__Group__3 : ( ( rule__DateTimeProperty__Group_3__0 )? ) ;
    public final void rule__DateTimeProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2502:1: ( ( ( rule__DateTimeProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2503:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2503:1: ( ( rule__DateTimeProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2504:1: ( rule__DateTimeProperty__Group_3__0 )?
            {
             before(grammarAccess.getDateTimePropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2505:1: ( rule__DateTimeProperty__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2505:2: rule__DateTimeProperty__Group_3__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2523:1: rule__DateTimeProperty__Group_3__0 : ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 ;
    public final void rule__DateTimeProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2527:1: ( ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2528:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) ) rule__DateTimeProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2528:1: ( ( rule__DateTimeProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2529:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2530:1: ( rule__DateTimeProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2530:2: rule__DateTimeProperty__HasDefaultAssignment_3_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2541:1: rule__DateTimeProperty__Group_3__1 : ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__DateTimeProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2545:1: ( ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2546:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2546:1: ( ( rule__DateTimeProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2547:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2548:1: ( rule__DateTimeProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2548:2: rule__DateTimeProperty__DefaultValueAssignment_3_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2562:1: rule__IntegerProperty__Group__0 : ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 ;
    public final void rule__IntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2566:1: ( ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2567:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? ) rule__IntegerProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2567:1: ( ( rule__IntegerProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2568:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2569:1: ( rule__IntegerProperty__DescriptionAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2569:2: rule__IntegerProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2580:1: rule__IntegerProperty__Group__1 : ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 ;
    public final void rule__IntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2584:1: ( ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2585:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) ) rule__IntegerProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2585:1: ( ( rule__IntegerProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2586:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2587:1: ( rule__IntegerProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2587:2: rule__IntegerProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2598:1: rule__IntegerProperty__Group__2 : ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 ;
    public final void rule__IntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2602:1: ( ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2603:1: ( ( rule__IntegerProperty__NameAssignment_2 ) ) rule__IntegerProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2603:1: ( ( rule__IntegerProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2604:1: ( rule__IntegerProperty__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2605:1: ( rule__IntegerProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2605:2: rule__IntegerProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2616:1: rule__IntegerProperty__Group__3 : ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 ;
    public final void rule__IntegerProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2620:1: ( ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2621:1: ( ( rule__IntegerProperty__Group_3__0 )? ) rule__IntegerProperty__Group__4
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2621:1: ( ( rule__IntegerProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2622:1: ( rule__IntegerProperty__Group_3__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2623:1: ( rule__IntegerProperty__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2623:2: rule__IntegerProperty__Group_3__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2634:1: rule__IntegerProperty__Group__4 : ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 ;
    public final void rule__IntegerProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2638:1: ( ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2639:1: ( ( rule__IntegerProperty__Group_4__0 )? ) rule__IntegerProperty__Group__5
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2639:1: ( ( rule__IntegerProperty__Group_4__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2640:1: ( rule__IntegerProperty__Group_4__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2641:1: ( rule__IntegerProperty__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2641:2: rule__IntegerProperty__Group_4__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2652:1: rule__IntegerProperty__Group__5 : ( ( rule__IntegerProperty__Group_5__0 )? ) ;
    public final void rule__IntegerProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2656:1: ( ( ( rule__IntegerProperty__Group_5__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2657:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2657:1: ( ( rule__IntegerProperty__Group_5__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2658:1: ( rule__IntegerProperty__Group_5__0 )?
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2659:1: ( rule__IntegerProperty__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2659:2: rule__IntegerProperty__Group_5__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2681:1: rule__IntegerProperty__Group_3__0 : ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 ;
    public final void rule__IntegerProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2685:1: ( ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2686:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) ) rule__IntegerProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2686:1: ( ( rule__IntegerProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2687:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2688:1: ( rule__IntegerProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2688:2: rule__IntegerProperty__HasDefaultAssignment_3_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2699:1: rule__IntegerProperty__Group_3__1 : ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__IntegerProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2703:1: ( ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2704:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2704:1: ( ( rule__IntegerProperty__DefaultValueAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2705:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDefaultValueAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2706:1: ( rule__IntegerProperty__DefaultValueAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2706:2: rule__IntegerProperty__DefaultValueAssignment_3_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2720:1: rule__IntegerProperty__Group_4__0 : ( 'min' ) rule__IntegerProperty__Group_4__1 ;
    public final void rule__IntegerProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2724:1: ( ( 'min' ) rule__IntegerProperty__Group_4__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2725:1: ( 'min' ) rule__IntegerProperty__Group_4__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2725:1: ( 'min' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2726:1: 'min'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2740:1: rule__IntegerProperty__Group_4__1 : ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) ;
    public final void rule__IntegerProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2744:1: ( ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2745:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2745:1: ( ( rule__IntegerProperty__MinValueAssignment_4_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2746:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMinValueAssignment_4_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2747:1: ( rule__IntegerProperty__MinValueAssignment_4_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2747:2: rule__IntegerProperty__MinValueAssignment_4_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2761:1: rule__IntegerProperty__Group_5__0 : ( 'max' ) rule__IntegerProperty__Group_5__1 ;
    public final void rule__IntegerProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2765:1: ( ( 'max' ) rule__IntegerProperty__Group_5__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2766:1: ( 'max' ) rule__IntegerProperty__Group_5__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2766:1: ( 'max' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2767:1: 'max'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2781:1: rule__IntegerProperty__Group_5__1 : ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) ;
    public final void rule__IntegerProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2785:1: ( ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2786:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2786:1: ( ( rule__IntegerProperty__MaxValueAssignment_5_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2787:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getMaxValueAssignment_5_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2788:1: ( rule__IntegerProperty__MaxValueAssignment_5_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2788:2: rule__IntegerProperty__MaxValueAssignment_5_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2802:1: rule__DecimalProperty__Group__0 : ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 ;
    public final void rule__DecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2806:1: ( ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2807:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? ) rule__DecimalProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2807:1: ( ( rule__DecimalProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2808:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getDecimalPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2809:1: ( rule__DecimalProperty__DescriptionAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2809:2: rule__DecimalProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2820:1: rule__DecimalProperty__Group__1 : ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 ;
    public final void rule__DecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2824:1: ( ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2825:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) ) rule__DecimalProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2825:1: ( ( rule__DecimalProperty__DataTypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2826:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2827:1: ( rule__DecimalProperty__DataTypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2827:2: rule__DecimalProperty__DataTypeAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2838:1: rule__DecimalProperty__Group__2 : ( ( rule__DecimalProperty__NameAssignment_2 ) ) ;
    public final void rule__DecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2842:1: ( ( ( rule__DecimalProperty__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2843:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2843:1: ( ( rule__DecimalProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2844:1: ( rule__DecimalProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2845:1: ( rule__DecimalProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2845:2: rule__DecimalProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2861:1: rule__EnumerationProperty__Group__0 : ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 ;
    public final void rule__EnumerationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2865:1: ( ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2866:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? ) rule__EnumerationProperty__Group__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2866:1: ( ( rule__EnumerationProperty__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2867:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2868:1: ( rule__EnumerationProperty__DescriptionAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2868:2: rule__EnumerationProperty__DescriptionAssignment_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2879:1: rule__EnumerationProperty__Group__1 : ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 ;
    public final void rule__EnumerationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2883:1: ( ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2884:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) ) rule__EnumerationProperty__Group__2
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2884:1: ( ( rule__EnumerationProperty__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2885:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2886:1: ( rule__EnumerationProperty__TypeAssignment_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2886:2: rule__EnumerationProperty__TypeAssignment_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2897:1: rule__EnumerationProperty__Group__2 : ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 ;
    public final void rule__EnumerationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2901:1: ( ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2902:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) ) rule__EnumerationProperty__Group__3
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2902:1: ( ( rule__EnumerationProperty__NameAssignment_2 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2903:1: ( rule__EnumerationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2904:1: ( rule__EnumerationProperty__NameAssignment_2 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2904:2: rule__EnumerationProperty__NameAssignment_2
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2915:1: rule__EnumerationProperty__Group__3 : ( ( rule__EnumerationProperty__Group_3__0 )? ) ;
    public final void rule__EnumerationProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2919:1: ( ( ( rule__EnumerationProperty__Group_3__0 )? ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2920:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2920:1: ( ( rule__EnumerationProperty__Group_3__0 )? )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2921:1: ( rule__EnumerationProperty__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationPropertyAccess().getGroup_3()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2922:1: ( rule__EnumerationProperty__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2922:2: rule__EnumerationProperty__Group_3__0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2940:1: rule__EnumerationProperty__Group_3__0 : ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 ;
    public final void rule__EnumerationProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2944:1: ( ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2945:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) ) rule__EnumerationProperty__Group_3__1
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2945:1: ( ( rule__EnumerationProperty__HasDefaultAssignment_3_0 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2946:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultAssignment_3_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2947:1: ( rule__EnumerationProperty__HasDefaultAssignment_3_0 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2947:2: rule__EnumerationProperty__HasDefaultAssignment_3_0
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2958:1: rule__EnumerationProperty__Group_3__1 : ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2962:1: ( ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2963:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2963:1: ( ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2964:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2965:1: ( rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2965:2: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2979:1: rule__BusinessDomainModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessDomainModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2983:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2984:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2984:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2985:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2994:1: rule__BusinessDomainModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessDomainModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2998:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2999:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:2999:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3000:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3009:1: rule__BusinessDomainModel__TypesAssignment_4 : ( ruleBusinessClassReference ) ;
    public final void rule__BusinessDomainModel__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3013:1: ( ( ruleBusinessClassReference ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3014:1: ( ruleBusinessClassReference )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3014:1: ( ruleBusinessClassReference )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3015:1: ruleBusinessClassReference
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3024:1: rule__BusinessDomainModel__TypesAssignment_5_0 : ( ruleBusinessClass ) ;
    public final void rule__BusinessDomainModel__TypesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3028:1: ( ( ruleBusinessClass ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3029:1: ( ruleBusinessClass )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3029:1: ( ruleBusinessClass )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3030:1: ruleBusinessClass
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3039:1: rule__BusinessDomainModel__EnumerationsAssignment_5_1 : ( ruleEnumeration ) ;
    public final void rule__BusinessDomainModel__EnumerationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3043:1: ( ( ruleEnumeration ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3044:1: ( ruleEnumeration )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3044:1: ( ruleEnumeration )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3045:1: ruleEnumeration
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3054:1: rule__BusinessDomainModel__AssociationsAssignment_5_2 : ( ruleAssociation ) ;
    public final void rule__BusinessDomainModel__AssociationsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3058:1: ( ( ruleAssociation ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3059:1: ( ruleAssociation )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3059:1: ( ruleAssociation )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3060:1: ruleAssociation
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3069:1: rule__BusinessClassReference__ReferredModelAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessClassReference__ReferredModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3073:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3074:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3074:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3075:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3084:1: rule__BusinessClassReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__BusinessClassReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3088:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3089:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3089:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3090:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3099:1: rule__Association__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Association__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3103:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3104:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3104:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3105:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3114:1: rule__Association__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3118:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3119:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3119:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3120:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceBusinessClassCrossReference_2_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3121:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3122:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3133:1: rule__Association__SourceRoleNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Association__SourceRoleNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3137:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3138:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3138:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3139:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3148:1: rule__Association__SourceMultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Association__SourceMultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3152:1: ( ( ruleMultiplicity ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3153:1: ( ruleMultiplicity )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3153:1: ( ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3154:1: ruleMultiplicity
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3163:1: rule__Association__BidirectionalAssignment_5_0 : ( ( '<->' ) ) ;
    public final void rule__Association__BidirectionalAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3167:1: ( ( ( '<->' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3168:1: ( ( '<->' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3168:1: ( ( '<->' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3169:1: ( '<->' )
            {
             before(grammarAccess.getAssociationAccess().getBidirectionalLessThanSignHyphenMinusGreaterThanSignKeyword_5_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3170:1: ( '<->' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3171:1: '<->'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3186:1: rule__Association__TargetMultiplicityAssignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Association__TargetMultiplicityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3190:1: ( ( ruleMultiplicity ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3191:1: ( ruleMultiplicity )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3191:1: ( ruleMultiplicity )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3192:1: ruleMultiplicity
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3201:1: rule__Association__TargetAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3205:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3206:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3206:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3207:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetAbstractBusinessClassCrossReference_7_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3208:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3209:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3220:1: rule__Association__TargetRoleNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__Association__TargetRoleNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3224:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3225:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3225:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3226:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3235:1: rule__Association__OrderedAssignment_9 : ( ( 'ordered' ) ) ;
    public final void rule__Association__OrderedAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3239:1: ( ( ( 'ordered' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3240:1: ( ( 'ordered' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3240:1: ( ( 'ordered' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3241:1: ( 'ordered' )
            {
             before(grammarAccess.getAssociationAccess().getOrderedOrderedKeyword_9_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3242:1: ( 'ordered' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3243:1: 'ordered'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3258:1: rule__BusinessClass__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessClass__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3262:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3263:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3263:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3264:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3273:1: rule__BusinessClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3277:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3278:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3278:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3279:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3288:1: rule__BusinessClass__SuperclassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__BusinessClass__SuperclassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3292:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3293:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3293:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3294:1: ( RULE_ID )
            {
             before(grammarAccess.getBusinessClassAccess().getSuperclassBusinessClassCrossReference_3_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3295:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3296:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3307:1: rule__BusinessClass__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__BusinessClass__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3311:1: ( ( ruleProperty ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3312:1: ( ruleProperty )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3312:1: ( ruleProperty )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3313:1: ruleProperty
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3322:1: rule__BusinessClass__BusinessRulesAssignment_6_2 : ( ruleAbstractBusinessRule ) ;
    public final void rule__BusinessClass__BusinessRulesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3326:1: ( ( ruleAbstractBusinessRule ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3327:1: ( ruleAbstractBusinessRule )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3327:1: ( ruleAbstractBusinessRule )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3328:1: ruleAbstractBusinessRule
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3337:1: rule__Enumeration__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Enumeration__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3341:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3342:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3342:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3343:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3352:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3356:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3357:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3357:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3358:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3367:1: rule__Enumeration__EnumerationLiteralsAssignment_4 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3371:1: ( ( ruleEnumerationLiteral ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3372:1: ( ruleEnumerationLiteral )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3372:1: ( ruleEnumerationLiteral )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3373:1: ruleEnumerationLiteral
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3382:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3386:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3387:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3387:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3388:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3397:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3401:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3402:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3402:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3403:1: RULE_INT
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3412:1: rule__BusinessRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BusinessRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3416:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3417:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3417:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3418:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3427:1: rule__BusinessRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3431:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3432:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3432:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3433:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3442:1: rule__UniqueRule__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__UniqueRule__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3446:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3447:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3447:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3448:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3457:1: rule__UniqueRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UniqueRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3461:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3462:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3462:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3463:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3472:1: rule__UniqueRule__PropertiesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3476:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3477:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3477:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3478:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_4_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3479:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3480:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3491:1: rule__UniqueRule__PropertiesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueRule__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3495:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3496:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3496:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3497:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueRuleAccess().getPropertiesPropertyCrossReference_5_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3498:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3499:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3510:1: rule__Property__NullableAssignment_1 : ( ( 'nullable' ) ) ;
    public final void rule__Property__NullableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3514:1: ( ( ( 'nullable' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3515:1: ( ( 'nullable' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3515:1: ( ( 'nullable' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3516:1: ( 'nullable' )
            {
             before(grammarAccess.getPropertyAccess().getNullableNullableKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3517:1: ( 'nullable' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3518:1: 'nullable'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3533:1: rule__Property__DerivedAssignment_2_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3537:1: ( ( ( 'derived' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3538:1: ( ( 'derived' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3538:1: ( ( 'derived' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3539:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_2_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3540:1: ( 'derived' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3541:1: 'derived'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3556:1: rule__Property__WritableAssignment_2_1 : ( ( 'writable' ) ) ;
    public final void rule__Property__WritableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3560:1: ( ( ( 'writable' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3561:1: ( ( 'writable' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3561:1: ( ( 'writable' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3562:1: ( 'writable' )
            {
             before(grammarAccess.getPropertyAccess().getWritableWritableKeyword_2_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3563:1: ( 'writable' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3564:1: 'writable'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3579:1: rule__BoolProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BoolProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3583:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3584:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3584:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3585:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3594:1: rule__BoolProperty__DataTypeAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__BoolProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3598:1: ( ( ( 'boolean' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3599:1: ( ( 'boolean' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3599:1: ( ( 'boolean' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3600:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDataTypeBooleanKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3601:1: ( 'boolean' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3602:1: 'boolean'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3617:1: rule__BoolProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BoolProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3621:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3622:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3622:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3623:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3632:1: rule__BoolProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__BoolProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3636:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3637:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3637:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3638:1: ( 'default' )
            {
             before(grammarAccess.getBoolPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3639:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3640:1: 'default'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3655:1: rule__BoolProperty__DefaultValueAssignment_3_1_0 : ( ( 'true' ) ) ;
    public final void rule__BoolProperty__DefaultValueAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3659:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3660:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3660:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3661:1: ( 'true' )
            {
             before(grammarAccess.getBoolPropertyAccess().getDefaultValueTrueKeyword_3_1_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3662:1: ( 'true' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3663:1: 'true'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3678:1: rule__StringProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3682:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3683:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3683:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3684:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3693:1: rule__StringProperty__DataTypeAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__StringProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3697:1: ( ( ( 'string' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3698:1: ( ( 'string' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3698:1: ( ( 'string' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3699:1: ( 'string' )
            {
             before(grammarAccess.getStringPropertyAccess().getDataTypeStringKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3700:1: ( 'string' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3701:1: 'string'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3716:1: rule__StringProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StringProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3720:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3721:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3721:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3722:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3731:1: rule__StringProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__StringProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3735:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3736:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3736:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3737:1: ( 'default' )
            {
             before(grammarAccess.getStringPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3738:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3739:1: 'default'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3754:1: rule__StringProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3758:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3759:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3759:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3760:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3769:1: rule__StringProperty__MinLengthAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MinLengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3773:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3774:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3774:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3775:1: RULE_INT
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3784:1: rule__StringProperty__MaxLengthAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__StringProperty__MaxLengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3788:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3789:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3789:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3790:1: RULE_INT
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3799:1: rule__StringProperty__RegularExpressionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__StringProperty__RegularExpressionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3803:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3804:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3804:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3805:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3814:1: rule__DateTimeProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3818:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3819:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3819:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3820:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3829:1: rule__DateTimeProperty__DataTypeAssignment_1 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3833:1: ( ( ( 'datetime' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3834:1: ( ( 'datetime' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3834:1: ( ( 'datetime' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3835:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getDataTypeDatetimeKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3836:1: ( 'datetime' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3837:1: 'datetime'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3852:1: rule__DateTimeProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DateTimeProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3856:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3857:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3857:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3858:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3867:1: rule__DateTimeProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3871:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3872:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3872:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3873:1: ( 'default' )
            {
             before(grammarAccess.getDateTimePropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3874:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3875:1: 'default'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3890:1: rule__DateTimeProperty__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3894:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3895:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3895:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3896:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3905:1: rule__IntegerProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__IntegerProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3909:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3910:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3910:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3911:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3920:1: rule__IntegerProperty__DataTypeAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__IntegerProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3924:1: ( ( ( 'integer' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3925:1: ( ( 'integer' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3925:1: ( ( 'integer' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3926:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getDataTypeIntegerKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3927:1: ( 'integer' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3928:1: 'integer'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3943:1: rule__IntegerProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3947:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3948:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3948:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3949:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3958:1: rule__IntegerProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__IntegerProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3962:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3963:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3963:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3964:1: ( 'default' )
            {
             before(grammarAccess.getIntegerPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3965:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3966:1: 'default'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3981:1: rule__IntegerProperty__DefaultValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3985:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3986:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3986:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3987:1: RULE_INT
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:3996:1: rule__IntegerProperty__MinValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MinValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4000:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4001:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4001:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4002:1: RULE_INT
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4011:1: rule__IntegerProperty__MaxValueAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__IntegerProperty__MaxValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4015:1: ( ( RULE_INT ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4016:1: ( RULE_INT )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4016:1: ( RULE_INT )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4017:1: RULE_INT
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4026:1: rule__DecimalProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DecimalProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4030:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4031:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4031:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4032:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4041:1: rule__DecimalProperty__DataTypeAssignment_1 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalProperty__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4045:1: ( ( ( 'decimal' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4046:1: ( ( 'decimal' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4046:1: ( ( 'decimal' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4047:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalPropertyAccess().getDataTypeDecimalKeyword_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4048:1: ( 'decimal' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4049:1: 'decimal'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4064:1: rule__DecimalProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DecimalProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4068:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4069:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4069:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4070:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4079:1: rule__EnumerationProperty__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__EnumerationProperty__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4083:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4084:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4084:1: ( RULE_STRING )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4085:1: RULE_STRING
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4094:1: rule__EnumerationProperty__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4098:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4099:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4099:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4100:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getTypeEnumerationCrossReference_1_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4101:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4102:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4113:1: rule__EnumerationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4117:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4118:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4118:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4119:1: RULE_ID
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4128:1: rule__EnumerationProperty__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationProperty__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4132:1: ( ( ( 'default' ) ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4133:1: ( ( 'default' ) )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4133:1: ( ( 'default' ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4134:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationPropertyAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4135:1: ( 'default' )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4136:1: 'default'
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
    // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4151:1: rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationProperty__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4155:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4156:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4156:1: ( RULE_ID )
            // ../org.mod4j.dsl.businessdomain.xtext.ui/src-gen/org/mod4j/dsl/businessdomain/xtext/contentassist/antlr/internal/InternalBusinessDomain.g:4157:1: RULE_ID
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