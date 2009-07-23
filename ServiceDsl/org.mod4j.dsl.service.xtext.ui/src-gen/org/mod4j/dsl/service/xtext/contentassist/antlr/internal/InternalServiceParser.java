package org.mod4j.dsl.service.xtext.contentassist.antlr.internal; 

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
import org.mod4j.dsl.service.xtext.services.ServiceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalServiceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'read'", "'update'", "'delete'", "'listall'", "'find'", "'add'", "'remove'", "'get'", "'service'", "';'", "'for'", "'reference'", "'from'", "'import'", "'method'", "'in'", "'['", "']'", "'out'", "'crud'"
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
    public String getGrammarFileName() { return "../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g"; }


     
     	private ServiceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ServiceGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }




    // $ANTLR start entryRuleServiceModel
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:55:1: entryRuleServiceModel : ruleServiceModel EOF ;
    public final void entryRuleServiceModel() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:55:23: ( ruleServiceModel EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:56:1: ruleServiceModel EOF
            {
             before(grammarAccess.getServiceModelRule()); 
            pushFollow(FOLLOW_ruleServiceModel_in_entryRuleServiceModel60);
            ruleServiceModel();
            _fsp--;

             after(grammarAccess.getServiceModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceModel67); 

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
    // $ANTLR end entryRuleServiceModel


    // $ANTLR start ruleServiceModel
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:63:1: ruleServiceModel : ( ( rule__ServiceModel__Group ) ) ;
    public final void ruleServiceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:67:2: ( ( ( rule__ServiceModel__Group ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:68:1: ( ( rule__ServiceModel__Group ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:68:1: ( ( rule__ServiceModel__Group ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:69:1: ( rule__ServiceModel__Group )
            {
             before(grammarAccess.getServiceModelAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:70:1: ( rule__ServiceModel__Group )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:70:2: rule__ServiceModel__Group
            {
            pushFollow(FOLLOW_rule__ServiceModel__Group_in_ruleServiceModel94);
            rule__ServiceModel__Group();
            _fsp--;


            }

             after(grammarAccess.getServiceModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleServiceModel


    // $ANTLR start entryRuleAssociationMethod
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:81:1: entryRuleAssociationMethod : ruleAssociationMethod EOF ;
    public final void entryRuleAssociationMethod() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:81:28: ( ruleAssociationMethod EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:82:1: ruleAssociationMethod EOF
            {
             before(grammarAccess.getAssociationMethodRule()); 
            pushFollow(FOLLOW_ruleAssociationMethod_in_entryRuleAssociationMethod119);
            ruleAssociationMethod();
            _fsp--;

             after(grammarAccess.getAssociationMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationMethod126); 

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
    // $ANTLR end entryRuleAssociationMethod


    // $ANTLR start ruleAssociationMethod
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:89:1: ruleAssociationMethod : ( ( rule__AssociationMethod__Group ) ) ;
    public final void ruleAssociationMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:93:2: ( ( ( rule__AssociationMethod__Group ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:94:1: ( ( rule__AssociationMethod__Group ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:94:1: ( ( rule__AssociationMethod__Group ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:95:1: ( rule__AssociationMethod__Group )
            {
             before(grammarAccess.getAssociationMethodAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:96:1: ( rule__AssociationMethod__Group )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:96:2: rule__AssociationMethod__Group
            {
            pushFollow(FOLLOW_rule__AssociationMethod__Group_in_ruleAssociationMethod153);
            rule__AssociationMethod__Group();
            _fsp--;


            }

             after(grammarAccess.getAssociationMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssociationMethod


    // $ANTLR start entryRuleDtoReference
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:107:1: entryRuleDtoReference : ruleDtoReference EOF ;
    public final void entryRuleDtoReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:107:23: ( ruleDtoReference EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:108:1: ruleDtoReference EOF
            {
             before(grammarAccess.getDtoReferenceRule()); 
            pushFollow(FOLLOW_ruleDtoReference_in_entryRuleDtoReference178);
            ruleDtoReference();
            _fsp--;

             after(grammarAccess.getDtoReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoReference185); 

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
    // $ANTLR end entryRuleDtoReference


    // $ANTLR start ruleDtoReference
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:115:1: ruleDtoReference : ( ( rule__DtoReference__Group ) ) ;
    public final void ruleDtoReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:119:2: ( ( ( rule__DtoReference__Group ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:120:1: ( ( rule__DtoReference__Group ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:120:1: ( ( rule__DtoReference__Group ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:121:1: ( rule__DtoReference__Group )
            {
             before(grammarAccess.getDtoReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:122:1: ( rule__DtoReference__Group )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:122:2: rule__DtoReference__Group
            {
            pushFollow(FOLLOW_rule__DtoReference__Group_in_ruleDtoReference212);
            rule__DtoReference__Group();
            _fsp--;


            }

             after(grammarAccess.getDtoReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoReference


    // $ANTLR start entryRuleServiceMethod
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:133:1: entryRuleServiceMethod : ruleServiceMethod EOF ;
    public final void entryRuleServiceMethod() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:133:24: ( ruleServiceMethod EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:134:1: ruleServiceMethod EOF
            {
             before(grammarAccess.getServiceMethodRule()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod237);
            ruleServiceMethod();
            _fsp--;

             after(grammarAccess.getServiceMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethod244); 

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
    // $ANTLR end entryRuleServiceMethod


    // $ANTLR start ruleServiceMethod
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:141:1: ruleServiceMethod : ( ( rule__ServiceMethod__Alternatives ) ) ;
    public final void ruleServiceMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:145:2: ( ( ( rule__ServiceMethod__Alternatives ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:146:1: ( ( rule__ServiceMethod__Alternatives ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:146:1: ( ( rule__ServiceMethod__Alternatives ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:147:1: ( rule__ServiceMethod__Alternatives )
            {
             before(grammarAccess.getServiceMethodAccess().getAlternatives()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:148:1: ( rule__ServiceMethod__Alternatives )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:148:2: rule__ServiceMethod__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Alternatives_in_ruleServiceMethod271);
            rule__ServiceMethod__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getServiceMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleServiceMethod


    // $ANTLR start entryRuleCustomMethod
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:159:1: entryRuleCustomMethod : ruleCustomMethod EOF ;
    public final void entryRuleCustomMethod() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:159:23: ( ruleCustomMethod EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:160:1: ruleCustomMethod EOF
            {
             before(grammarAccess.getCustomMethodRule()); 
            pushFollow(FOLLOW_ruleCustomMethod_in_entryRuleCustomMethod296);
            ruleCustomMethod();
            _fsp--;

             after(grammarAccess.getCustomMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomMethod303); 

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
    // $ANTLR end entryRuleCustomMethod


    // $ANTLR start ruleCustomMethod
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:167:1: ruleCustomMethod : ( ( rule__CustomMethod__Group ) ) ;
    public final void ruleCustomMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:171:2: ( ( ( rule__CustomMethod__Group ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:172:1: ( ( rule__CustomMethod__Group ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:172:1: ( ( rule__CustomMethod__Group ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:173:1: ( rule__CustomMethod__Group )
            {
             before(grammarAccess.getCustomMethodAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:174:1: ( rule__CustomMethod__Group )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:174:2: rule__CustomMethod__Group
            {
            pushFollow(FOLLOW_rule__CustomMethod__Group_in_ruleCustomMethod330);
            rule__CustomMethod__Group();
            _fsp--;


            }

             after(grammarAccess.getCustomMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCustomMethod


    // $ANTLR start entryRuleParameter
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:185:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:185:20: ( ruleParameter EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:186:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter355);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter362); 

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:193:1: ruleParameter : ( ( rule__Parameter__Group ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:197:2: ( ( ( rule__Parameter__Group ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:198:1: ( ( rule__Parameter__Group ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:198:1: ( ( rule__Parameter__Group ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:199:1: ( rule__Parameter__Group )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:200:1: ( rule__Parameter__Group )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:200:2: rule__Parameter__Group
            {
            pushFollow(FOLLOW_rule__Parameter__Group_in_ruleParameter389);
            rule__Parameter__Group();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleSpecialMethod
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:211:1: entryRuleSpecialMethod : ruleSpecialMethod EOF ;
    public final void entryRuleSpecialMethod() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:211:24: ( ruleSpecialMethod EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:212:1: ruleSpecialMethod EOF
            {
             before(grammarAccess.getSpecialMethodRule()); 
            pushFollow(FOLLOW_ruleSpecialMethod_in_entryRuleSpecialMethod414);
            ruleSpecialMethod();
            _fsp--;

             after(grammarAccess.getSpecialMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialMethod421); 

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
    // $ANTLR end entryRuleSpecialMethod


    // $ANTLR start ruleSpecialMethod
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:219:1: ruleSpecialMethod : ( ( rule__SpecialMethod__Group ) ) ;
    public final void ruleSpecialMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:223:2: ( ( ( rule__SpecialMethod__Group ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:224:1: ( ( rule__SpecialMethod__Group ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:224:1: ( ( rule__SpecialMethod__Group ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:225:1: ( rule__SpecialMethod__Group )
            {
             before(grammarAccess.getSpecialMethodAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:226:1: ( rule__SpecialMethod__Group )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:226:2: rule__SpecialMethod__Group
            {
            pushFollow(FOLLOW_rule__SpecialMethod__Group_in_ruleSpecialMethod448);
            rule__SpecialMethod__Group();
            _fsp--;


            }

             after(grammarAccess.getSpecialMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSpecialMethod


    // $ANTLR start entryRuleCrudService
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:237:1: entryRuleCrudService : ruleCrudService EOF ;
    public final void entryRuleCrudService() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:237:22: ( ruleCrudService EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:238:1: ruleCrudService EOF
            {
             before(grammarAccess.getCrudServiceRule()); 
            pushFollow(FOLLOW_ruleCrudService_in_entryRuleCrudService473);
            ruleCrudService();
            _fsp--;

             after(grammarAccess.getCrudServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrudService480); 

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
    // $ANTLR end entryRuleCrudService


    // $ANTLR start ruleCrudService
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:245:1: ruleCrudService : ( ( rule__CrudService__Group ) ) ;
    public final void ruleCrudService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:249:2: ( ( ( rule__CrudService__Group ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:250:1: ( ( rule__CrudService__Group ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:250:1: ( ( rule__CrudService__Group ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:251:1: ( rule__CrudService__Group )
            {
             before(grammarAccess.getCrudServiceAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:252:1: ( rule__CrudService__Group )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:252:2: rule__CrudService__Group
            {
            pushFollow(FOLLOW_rule__CrudService__Group_in_ruleCrudService507);
            rule__CrudService__Group();
            _fsp--;


            }

             after(grammarAccess.getCrudServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCrudService


    // $ANTLR start ruleSpecialMethodType
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:264:1: ruleSpecialMethodType : ( ( rule__SpecialMethodType__Alternatives ) ) ;
    public final void ruleSpecialMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:268:1: ( ( ( rule__SpecialMethodType__Alternatives ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:269:1: ( ( rule__SpecialMethodType__Alternatives ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:269:1: ( ( rule__SpecialMethodType__Alternatives ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:270:1: ( rule__SpecialMethodType__Alternatives )
            {
             before(grammarAccess.getSpecialMethodTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:271:1: ( rule__SpecialMethodType__Alternatives )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:271:2: rule__SpecialMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecialMethodType__Alternatives_in_ruleSpecialMethodType543);
            rule__SpecialMethodType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSpecialMethodTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSpecialMethodType


    // $ANTLR start ruleAssociationMethodType
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:282:1: ruleAssociationMethodType : ( ( rule__AssociationMethodType__Alternatives ) ) ;
    public final void ruleAssociationMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:286:1: ( ( ( rule__AssociationMethodType__Alternatives ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:287:1: ( ( rule__AssociationMethodType__Alternatives ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:287:1: ( ( rule__AssociationMethodType__Alternatives ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:288:1: ( rule__AssociationMethodType__Alternatives )
            {
             before(grammarAccess.getAssociationMethodTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:289:1: ( rule__AssociationMethodType__Alternatives )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:289:2: rule__AssociationMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__AssociationMethodType__Alternatives_in_ruleAssociationMethodType578);
            rule__AssociationMethodType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAssociationMethodTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssociationMethodType


    // $ANTLR start rule__ServiceModel__Alternatives_5
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:299:1: rule__ServiceModel__Alternatives_5 : ( ( ( ( ruleCrudService ) ) ) | ( ( ( ruleServiceMethod ) ) ) );
    public final void rule__ServiceModel__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:303:1: ( ( ( ( ruleCrudService ) ) ) | ( ( ( ruleServiceMethod ) ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=11 && LA1_1<=16)||LA1_1==22||LA1_1==26) ) {
                    alt1=2;
                }
                else if ( (LA1_1==31) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("299:1: rule__ServiceModel__Alternatives_5 : ( ( ( ( ruleCrudService ) ) ) | ( ( ( ruleServiceMethod ) ) ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt1=1;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 22:
            case 26:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("299:1: rule__ServiceModel__Alternatives_5 : ( ( ( ( ruleCrudService ) ) ) | ( ( ( ruleServiceMethod ) ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:304:1: ( ( ( ruleCrudService ) ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:304:1: ( ( ( ruleCrudService ) ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:305:1: ( ( ruleCrudService ) )
                    {
                     before(grammarAccess.getServiceModelAccess().getCrudServicesAssignment_5_0()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:306:1: ( ( ruleCrudService ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:307:1: ( ruleCrudService )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:307:1: ( ruleCrudService )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:308:1: ruleCrudService
                    {
                     before(grammarAccess.getServiceModelAccess().getCrudServicesCrudServiceParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_ruleCrudService_in_rule__ServiceModel__Alternatives_5619);
                    ruleCrudService();
                    _fsp--;

                     after(grammarAccess.getServiceModelAccess().getCrudServicesCrudServiceParserRuleCall_5_0_0()); 

                    }


                    }

                     after(grammarAccess.getServiceModelAccess().getCrudServicesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:315:6: ( ( ( ruleServiceMethod ) ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:315:6: ( ( ( ruleServiceMethod ) ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:316:1: ( ( ruleServiceMethod ) )
                    {
                     before(grammarAccess.getServiceModelAccess().getMethodsAssignment_5_1()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:317:1: ( ( ruleServiceMethod ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:318:1: ( ruleServiceMethod )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:318:1: ( ruleServiceMethod )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:319:1: ruleServiceMethod
                    {
                     before(grammarAccess.getServiceModelAccess().getMethodsServiceMethodParserRuleCall_5_1_0()); 
                    pushFollow(FOLLOW_ruleServiceMethod_in_rule__ServiceModel__Alternatives_5649);
                    ruleServiceMethod();
                    _fsp--;

                     after(grammarAccess.getServiceModelAccess().getMethodsServiceMethodParserRuleCall_5_1_0()); 

                    }


                    }

                     after(grammarAccess.getServiceModelAccess().getMethodsAssignment_5_1()); 

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
    // $ANTLR end rule__ServiceModel__Alternatives_5


    // $ANTLR start rule__ServiceMethod__Alternatives
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:331:1: rule__ServiceMethod__Alternatives : ( ( ruleCustomMethod ) | ( ruleSpecialMethod ) | ( ruleAssociationMethod ) );
    public final void rule__ServiceMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:335:1: ( ( ruleCustomMethod ) | ( ruleSpecialMethod ) | ( ruleAssociationMethod ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    {
                    alt2=2;
                    }
                    break;
                case 26:
                    {
                    alt2=1;
                    }
                    break;
                case 22:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("331:1: rule__ServiceMethod__Alternatives : ( ( ruleCustomMethod ) | ( ruleSpecialMethod ) | ( ruleAssociationMethod ) );", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 26:
                {
                alt2=1;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("331:1: rule__ServiceMethod__Alternatives : ( ( ruleCustomMethod ) | ( ruleSpecialMethod ) | ( ruleAssociationMethod ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:336:1: ( ruleCustomMethod )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:336:1: ( ruleCustomMethod )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:337:1: ruleCustomMethod
                    {
                     before(grammarAccess.getServiceMethodAccess().getCustomMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCustomMethod_in_rule__ServiceMethod__Alternatives687);
                    ruleCustomMethod();
                    _fsp--;

                     after(grammarAccess.getServiceMethodAccess().getCustomMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:341:6: ( ruleSpecialMethod )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:341:6: ( ruleSpecialMethod )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:342:1: ruleSpecialMethod
                    {
                     before(grammarAccess.getServiceMethodAccess().getSpecialMethodParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSpecialMethod_in_rule__ServiceMethod__Alternatives703);
                    ruleSpecialMethod();
                    _fsp--;

                     after(grammarAccess.getServiceMethodAccess().getSpecialMethodParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:346:6: ( ruleAssociationMethod )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:346:6: ( ruleAssociationMethod )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:347:1: ruleAssociationMethod
                    {
                     before(grammarAccess.getServiceMethodAccess().getAssociationMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAssociationMethod_in_rule__ServiceMethod__Alternatives719);
                    ruleAssociationMethod();
                    _fsp--;

                     after(grammarAccess.getServiceMethodAccess().getAssociationMethodParserRuleCall_2()); 

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
    // $ANTLR end rule__ServiceMethod__Alternatives


    // $ANTLR start rule__SpecialMethodType__Alternatives
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:356:1: rule__SpecialMethodType__Alternatives : ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) | ( ( 'listall' ) ) | ( ( 'find' ) ) );
    public final void rule__SpecialMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:360:1: ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) | ( ( 'listall' ) ) | ( ( 'find' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("356:1: rule__SpecialMethodType__Alternatives : ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) | ( ( 'listall' ) ) | ( ( 'find' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:361:1: ( ( 'create' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:361:1: ( ( 'create' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:362:1: ( 'create' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getCREATEEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:363:1: ( 'create' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:363:3: 'create'
                    {
                    match(input,11,FOLLOW_11_in_rule__SpecialMethodType__Alternatives751); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getCREATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:367:6: ( ( 'read' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:367:6: ( ( 'read' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:368:1: ( 'read' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getREADEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:369:1: ( 'read' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:369:3: 'read'
                    {
                    match(input,12,FOLLOW_12_in_rule__SpecialMethodType__Alternatives771); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getREADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:373:6: ( ( 'update' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:373:6: ( ( 'update' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:374:1: ( 'update' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getUPDATEEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:375:1: ( 'update' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:375:3: 'update'
                    {
                    match(input,13,FOLLOW_13_in_rule__SpecialMethodType__Alternatives791); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getUPDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:379:6: ( ( 'delete' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:379:6: ( ( 'delete' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:380:1: ( 'delete' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:381:1: ( 'delete' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:381:3: 'delete'
                    {
                    match(input,14,FOLLOW_14_in_rule__SpecialMethodType__Alternatives811); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:385:6: ( ( 'listall' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:385:6: ( ( 'listall' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:386:1: ( 'listall' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getLISTALLEnumLiteralDeclaration_4()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:387:1: ( 'listall' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:387:3: 'listall'
                    {
                    match(input,15,FOLLOW_15_in_rule__SpecialMethodType__Alternatives831); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getLISTALLEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:391:6: ( ( 'find' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:391:6: ( ( 'find' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:392:1: ( 'find' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getFINDEnumLiteralDeclaration_5()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:393:1: ( 'find' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:393:3: 'find'
                    {
                    match(input,16,FOLLOW_16_in_rule__SpecialMethodType__Alternatives851); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getFINDEnumLiteralDeclaration_5()); 

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
    // $ANTLR end rule__SpecialMethodType__Alternatives


    // $ANTLR start rule__AssociationMethodType__Alternatives
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:402:1: rule__AssociationMethodType__Alternatives : ( ( ( 'add' ) ) | ( ( 'remove' ) ) | ( ( 'get' ) ) );
    public final void rule__AssociationMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:406:1: ( ( ( 'add' ) ) | ( ( 'remove' ) ) | ( ( 'get' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("402:1: rule__AssociationMethodType__Alternatives : ( ( ( 'add' ) ) | ( ( 'remove' ) ) | ( ( 'get' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:407:1: ( ( 'add' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:407:1: ( ( 'add' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:408:1: ( 'add' )
                    {
                     before(grammarAccess.getAssociationMethodTypeAccess().getADDTOEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:409:1: ( 'add' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:409:3: 'add'
                    {
                    match(input,17,FOLLOW_17_in_rule__AssociationMethodType__Alternatives886); 

                    }

                     after(grammarAccess.getAssociationMethodTypeAccess().getADDTOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:413:6: ( ( 'remove' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:413:6: ( ( 'remove' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:414:1: ( 'remove' )
                    {
                     before(grammarAccess.getAssociationMethodTypeAccess().getREMOVEFROMEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:415:1: ( 'remove' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:415:3: 'remove'
                    {
                    match(input,18,FOLLOW_18_in_rule__AssociationMethodType__Alternatives906); 

                    }

                     after(grammarAccess.getAssociationMethodTypeAccess().getREMOVEFROMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:419:6: ( ( 'get' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:419:6: ( ( 'get' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:420:1: ( 'get' )
                    {
                     before(grammarAccess.getAssociationMethodTypeAccess().getGETFROMEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:421:1: ( 'get' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:421:3: 'get'
                    {
                    match(input,19,FOLLOW_19_in_rule__AssociationMethodType__Alternatives926); 

                    }

                     after(grammarAccess.getAssociationMethodTypeAccess().getGETFROMEnumLiteralDeclaration_2()); 

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
    // $ANTLR end rule__AssociationMethodType__Alternatives


    // $ANTLR start rule__ServiceModel__Group
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:431:1: rule__ServiceModel__Group : ( ( ( RULE_STRING ) )? ) ( 'service' ) ( ( ( RULE_ID ) ) ) ( ';' ) ( ( ( ruleDtoReference ) )* ) ( ( rule__ServiceModel__Alternatives_5 )* ) ;
    public final void rule__ServiceModel__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:435:1: ( ( ( ( RULE_STRING ) )? ) ( 'service' ) ( ( ( RULE_ID ) ) ) ( ';' ) ( ( ( ruleDtoReference ) )* ) ( ( rule__ServiceModel__Alternatives_5 )* ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:436:1: ( ( ( RULE_STRING ) )? ) ( 'service' ) ( ( ( RULE_ID ) ) ) ( ';' ) ( ( ( ruleDtoReference ) )* ) ( ( rule__ServiceModel__Alternatives_5 )* )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:436:1: ( ( ( RULE_STRING ) )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:437:1: ( ( RULE_STRING ) )?
            {
             before(grammarAccess.getServiceModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:438:1: ( ( RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:439:1: ( RULE_STRING )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:439:1: ( RULE_STRING )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:440:1: RULE_STRING
                    {
                     before(grammarAccess.getServiceModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceModel__Group968); 
                     after(grammarAccess.getServiceModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;

            }

             after(grammarAccess.getServiceModelAccess().getDescriptionAssignment_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:446:1: ( 'service' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:447:1: 'service'
            {
             before(grammarAccess.getServiceModelAccess().getServiceKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ServiceModel__Group987); 
             after(grammarAccess.getServiceModelAccess().getServiceKeyword_1()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:452:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:453:1: ( ( RULE_ID ) )
            {
             before(grammarAccess.getServiceModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:454:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:455:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:455:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:456:1: RULE_ID
            {
             before(grammarAccess.getServiceModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceModel__Group1006); 
             after(grammarAccess.getServiceModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

             after(grammarAccess.getServiceModelAccess().getNameAssignment_2()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:462:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:463:1: ';'
            {
             before(grammarAccess.getServiceModelAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ServiceModel__Group1024); 
             after(grammarAccess.getServiceModelAccess().getSemicolonKeyword_3()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:468:1: ( ( ( ruleDtoReference ) )* )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:469:1: ( ( ruleDtoReference ) )*
            {
             before(grammarAccess.getServiceModelAccess().getDtoReferencesAssignment_4()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:470:1: ( ( ruleDtoReference ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:471:1: ( ruleDtoReference )
            	    {
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:471:1: ( ruleDtoReference )
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:472:1: ruleDtoReference
            	    {
            	     before(grammarAccess.getServiceModelAccess().getDtoReferencesDtoReferenceParserRuleCall_4_0()); 
            	    pushFollow(FOLLOW_ruleDtoReference_in_rule__ServiceModel__Group1043);
            	    ruleDtoReference();
            	    _fsp--;

            	     after(grammarAccess.getServiceModelAccess().getDtoReferencesDtoReferenceParserRuleCall_4_0()); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getServiceModelAccess().getDtoReferencesAssignment_4()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:478:1: ( ( rule__ServiceModel__Alternatives_5 )* )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:479:1: ( rule__ServiceModel__Alternatives_5 )*
            {
             before(grammarAccess.getServiceModelAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:480:1: ( rule__ServiceModel__Alternatives_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||(LA7_0>=11 && LA7_0<=16)||LA7_0==22||LA7_0==26||LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:480:2: rule__ServiceModel__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__ServiceModel__Alternatives_5_in_rule__ServiceModel__Group1061);
            	    rule__ServiceModel__Alternatives_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getServiceModelAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__Group


    // $ANTLR start rule__AssociationMethod__Group
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:488:1: rule__AssociationMethod__Group : ( ( ( RULE_STRING ) )? ) ( ( ( ( 'for' ) ) ) ) ( ( ( ( RULE_ID ) ) ) ) ( 'reference' ) ( ( ( RULE_ID ) ) ) ( ( ( ruleAssociationMethodType ) ) ) ( ( ( ( RULE_ID ) ) ) ) ( ';' ) ;
    public final void rule__AssociationMethod__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:492:1: ( ( ( ( RULE_STRING ) )? ) ( ( ( ( 'for' ) ) ) ) ( ( ( ( RULE_ID ) ) ) ) ( 'reference' ) ( ( ( RULE_ID ) ) ) ( ( ( ruleAssociationMethodType ) ) ) ( ( ( ( RULE_ID ) ) ) ) ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:493:1: ( ( ( RULE_STRING ) )? ) ( ( ( ( 'for' ) ) ) ) ( ( ( ( RULE_ID ) ) ) ) ( 'reference' ) ( ( ( RULE_ID ) ) ) ( ( ( ruleAssociationMethodType ) ) ) ( ( ( ( RULE_ID ) ) ) ) ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:493:1: ( ( ( RULE_STRING ) )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:494:1: ( ( RULE_STRING ) )?
            {
             before(grammarAccess.getAssociationMethodAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:495:1: ( ( RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:496:1: ( RULE_STRING )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:496:1: ( RULE_STRING )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:497:1: RULE_STRING
                    {
                     before(grammarAccess.getAssociationMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AssociationMethod__Group1101); 
                     after(grammarAccess.getAssociationMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;

            }

             after(grammarAccess.getAssociationMethodAccess().getDescriptionAssignment_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:503:1: ( ( ( ( 'for' ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:504:1: ( ( ( 'for' ) ) )
            {
             before(grammarAccess.getAssociationMethodAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:505:1: ( ( ( 'for' ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:506:1: ( ( 'for' ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:506:1: ( ( 'for' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:507:1: ( 'for' )
            {
             before(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:508:1: ( 'for' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:509:1: 'for'
            {
             before(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__AssociationMethod__Group1131); 
             after(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0()); 

            }

             after(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0()); 

            }


            }

             after(grammarAccess.getAssociationMethodAccess().getNameAssignment_1()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:520:1: ( ( ( ( RULE_ID ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:521:1: ( ( ( RULE_ID ) ) )
            {
             before(grammarAccess.getAssociationMethodAccess().getMainAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:522:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:523:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:523:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:524:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceCrossReference_2_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:525:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:526:1: RULE_ID
            {
             before(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationMethod__Group1166); 
             after(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceCrossReference_2_0()); 

            }


            }

             after(grammarAccess.getAssociationMethodAccess().getMainAssignment_2()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:534:1: ( 'reference' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:535:1: 'reference'
            {
             before(grammarAccess.getAssociationMethodAccess().getReferenceKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__AssociationMethod__Group1188); 
             after(grammarAccess.getAssociationMethodAccess().getReferenceKeyword_3()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:540:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:541:1: ( ( RULE_ID ) )
            {
             before(grammarAccess.getAssociationMethodAccess().getRolenameAssignment_4()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:542:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:543:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:543:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:544:1: RULE_ID
            {
             before(grammarAccess.getAssociationMethodAccess().getRolenameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationMethod__Group1207); 
             after(grammarAccess.getAssociationMethodAccess().getRolenameIDTerminalRuleCall_4_0()); 

            }


            }

             after(grammarAccess.getAssociationMethodAccess().getRolenameAssignment_4()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:550:1: ( ( ( ruleAssociationMethodType ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:551:1: ( ( ruleAssociationMethodType ) )
            {
             before(grammarAccess.getAssociationMethodAccess().getTypeAssignment_5()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:552:1: ( ( ruleAssociationMethodType ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:553:1: ( ruleAssociationMethodType )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:553:1: ( ruleAssociationMethodType )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:554:1: ruleAssociationMethodType
            {
             before(grammarAccess.getAssociationMethodAccess().getTypeAssociationMethodTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAssociationMethodType_in_rule__AssociationMethod__Group1231);
            ruleAssociationMethodType();
            _fsp--;

             after(grammarAccess.getAssociationMethodAccess().getTypeAssociationMethodTypeEnumRuleCall_5_0()); 

            }


            }

             after(grammarAccess.getAssociationMethodAccess().getTypeAssignment_5()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:560:1: ( ( ( ( RULE_ID ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:561:1: ( ( ( RULE_ID ) ) )
            {
             before(grammarAccess.getAssociationMethodAccess().getPartAssignment_6()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:562:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:563:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:563:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:564:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceCrossReference_6_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:565:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:566:1: RULE_ID
            {
             before(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationMethod__Group1259); 
             after(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceCrossReference_6_0()); 

            }


            }

             after(grammarAccess.getAssociationMethodAccess().getPartAssignment_6()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:574:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:575:1: ';'
            {
             before(grammarAccess.getAssociationMethodAccess().getSemicolonKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__AssociationMethod__Group1281); 
             after(grammarAccess.getAssociationMethodAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__Group


    // $ANTLR start rule__DtoReference__Group
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:586:1: rule__DtoReference__Group : ( 'from' ) ( ( ( RULE_ID ) ) ) ( 'import' ) ( ( ( RULE_ID ) ) ) ( ';' ) ;
    public final void rule__DtoReference__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:590:1: ( ( 'from' ) ( ( ( RULE_ID ) ) ) ( 'import' ) ( ( ( RULE_ID ) ) ) ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:591:1: ( 'from' ) ( ( ( RULE_ID ) ) ) ( 'import' ) ( ( ( RULE_ID ) ) ) ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:591:1: ( 'from' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:592:1: 'from'
            {
             before(grammarAccess.getDtoReferenceAccess().getFromKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__DtoReference__Group1315); 
             after(grammarAccess.getDtoReferenceAccess().getFromKeyword_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:597:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:598:1: ( ( RULE_ID ) )
            {
             before(grammarAccess.getDtoReferenceAccess().getModelnameAssignment_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:599:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:600:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:600:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:601:1: RULE_ID
            {
             before(grammarAccess.getDtoReferenceAccess().getModelnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoReference__Group1334); 
             after(grammarAccess.getDtoReferenceAccess().getModelnameIDTerminalRuleCall_1_0()); 

            }


            }

             after(grammarAccess.getDtoReferenceAccess().getModelnameAssignment_1()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:607:1: ( 'import' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:608:1: 'import'
            {
             before(grammarAccess.getDtoReferenceAccess().getImportKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__DtoReference__Group1352); 
             after(grammarAccess.getDtoReferenceAccess().getImportKeyword_2()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:613:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:614:1: ( ( RULE_ID ) )
            {
             before(grammarAccess.getDtoReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:615:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:616:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:616:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:617:1: RULE_ID
            {
             before(grammarAccess.getDtoReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoReference__Group1371); 
             after(grammarAccess.getDtoReferenceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

             after(grammarAccess.getDtoReferenceAccess().getNameAssignment_3()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:623:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:624:1: ';'
            {
             before(grammarAccess.getDtoReferenceAccess().getSemicolonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__DtoReference__Group1389); 
             after(grammarAccess.getDtoReferenceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoReference__Group


    // $ANTLR start rule__CustomMethod__Group
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:635:1: rule__CustomMethod__Group : ( ( ( RULE_STRING ) )? ) ( 'method' ) ( ( ( RULE_ID ) ) ) ( ( rule__CustomMethod__Group_3 )? ) ( ( rule__CustomMethod__Group_4 )? ) ( ';' ) ;
    public final void rule__CustomMethod__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:639:1: ( ( ( ( RULE_STRING ) )? ) ( 'method' ) ( ( ( RULE_ID ) ) ) ( ( rule__CustomMethod__Group_3 )? ) ( ( rule__CustomMethod__Group_4 )? ) ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:640:1: ( ( ( RULE_STRING ) )? ) ( 'method' ) ( ( ( RULE_ID ) ) ) ( ( rule__CustomMethod__Group_3 )? ) ( ( rule__CustomMethod__Group_4 )? ) ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:640:1: ( ( ( RULE_STRING ) )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:641:1: ( ( RULE_STRING ) )?
            {
             before(grammarAccess.getCustomMethodAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:642:1: ( ( RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:643:1: ( RULE_STRING )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:643:1: ( RULE_STRING )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:644:1: RULE_STRING
                    {
                     before(grammarAccess.getCustomMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomMethod__Group1429); 
                     after(grammarAccess.getCustomMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;

            }

             after(grammarAccess.getCustomMethodAccess().getDescriptionAssignment_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:650:1: ( 'method' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:651:1: 'method'
            {
             before(grammarAccess.getCustomMethodAccess().getMethodKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__CustomMethod__Group1448); 
             after(grammarAccess.getCustomMethodAccess().getMethodKeyword_1()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:656:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:657:1: ( ( RULE_ID ) )
            {
             before(grammarAccess.getCustomMethodAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:658:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:659:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:659:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:660:1: RULE_ID
            {
             before(grammarAccess.getCustomMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomMethod__Group1467); 
             after(grammarAccess.getCustomMethodAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

             after(grammarAccess.getCustomMethodAccess().getNameAssignment_2()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:666:1: ( ( rule__CustomMethod__Group_3 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:667:1: ( rule__CustomMethod__Group_3 )?
            {
             before(grammarAccess.getCustomMethodAccess().getGroup_3()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:668:1: ( rule__CustomMethod__Group_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:668:2: rule__CustomMethod__Group_3
                    {
                    pushFollow(FOLLOW_rule__CustomMethod__Group_3_in_rule__CustomMethod__Group1484);
                    rule__CustomMethod__Group_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomMethodAccess().getGroup_3()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:670:1: ( ( rule__CustomMethod__Group_4 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:671:1: ( rule__CustomMethod__Group_4 )?
            {
             before(grammarAccess.getCustomMethodAccess().getGroup_4()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:672:1: ( rule__CustomMethod__Group_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:672:2: rule__CustomMethod__Group_4
                    {
                    pushFollow(FOLLOW_rule__CustomMethod__Group_4_in_rule__CustomMethod__Group1496);
                    rule__CustomMethod__Group_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomMethodAccess().getGroup_4()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:674:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:675:1: ';'
            {
             before(grammarAccess.getCustomMethodAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__CustomMethod__Group1509); 
             after(grammarAccess.getCustomMethodAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group


    // $ANTLR start rule__CustomMethod__Group_3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:686:1: rule__CustomMethod__Group_3 : ( 'in' ) ( '[' ) ( ( rule__CustomMethod__Group_3_2 )* ) ( ']' ) ;
    public final void rule__CustomMethod__Group_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:690:1: ( ( 'in' ) ( '[' ) ( ( rule__CustomMethod__Group_3_2 )* ) ( ']' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:691:1: ( 'in' ) ( '[' ) ( ( rule__CustomMethod__Group_3_2 )* ) ( ']' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:691:1: ( 'in' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:692:1: 'in'
            {
             before(grammarAccess.getCustomMethodAccess().getInKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__CustomMethod__Group_31543); 
             after(grammarAccess.getCustomMethodAccess().getInKeyword_3_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:697:1: ( '[' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:698:1: '['
            {
             before(grammarAccess.getCustomMethodAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,28,FOLLOW_28_in_rule__CustomMethod__Group_31556); 
             after(grammarAccess.getCustomMethodAccess().getLeftSquareBracketKeyword_3_1()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:703:1: ( ( rule__CustomMethod__Group_3_2 )* )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:704:1: ( rule__CustomMethod__Group_3_2 )*
            {
             before(grammarAccess.getCustomMethodAccess().getGroup_3_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:705:1: ( rule__CustomMethod__Group_3_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:705:2: rule__CustomMethod__Group_3_2
            	    {
            	    pushFollow(FOLLOW_rule__CustomMethod__Group_3_2_in_rule__CustomMethod__Group_31568);
            	    rule__CustomMethod__Group_3_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCustomMethodAccess().getGroup_3_2()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:707:1: ( ']' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:708:1: ']'
            {
             before(grammarAccess.getCustomMethodAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,29,FOLLOW_29_in_rule__CustomMethod__Group_31581); 
             after(grammarAccess.getCustomMethodAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group_3


    // $ANTLR start rule__CustomMethod__Group_3_2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:719:1: rule__CustomMethod__Group_3_2 : ( ( ( ruleParameter ) ) ) ( ';' ) ;
    public final void rule__CustomMethod__Group_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:723:1: ( ( ( ( ruleParameter ) ) ) ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:724:1: ( ( ( ruleParameter ) ) ) ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:724:1: ( ( ( ruleParameter ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:725:1: ( ( ruleParameter ) )
            {
             before(grammarAccess.getCustomMethodAccess().getInParametersAssignment_3_2_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:726:1: ( ( ruleParameter ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:727:1: ( ruleParameter )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:727:1: ( ruleParameter )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:728:1: ruleParameter
            {
             before(grammarAccess.getCustomMethodAccess().getInParametersParameterParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__CustomMethod__Group_3_21621);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getCustomMethodAccess().getInParametersParameterParserRuleCall_3_2_0_0()); 

            }


            }

             after(grammarAccess.getCustomMethodAccess().getInParametersAssignment_3_2_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:734:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:735:1: ';'
            {
             before(grammarAccess.getCustomMethodAccess().getSemicolonKeyword_3_2_1()); 
            match(input,21,FOLLOW_21_in_rule__CustomMethod__Group_3_21639); 
             after(grammarAccess.getCustomMethodAccess().getSemicolonKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group_3_2


    // $ANTLR start rule__CustomMethod__Group_4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:746:1: rule__CustomMethod__Group_4 : ( 'out' ) ( ( ( ( RULE_ID ) ) ) ) ;
    public final void rule__CustomMethod__Group_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:750:1: ( ( 'out' ) ( ( ( ( RULE_ID ) ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:751:1: ( 'out' ) ( ( ( ( RULE_ID ) ) ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:751:1: ( 'out' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:752:1: 'out'
            {
             before(grammarAccess.getCustomMethodAccess().getOutKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__CustomMethod__Group_41673); 
             after(grammarAccess.getCustomMethodAccess().getOutKeyword_4_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:757:1: ( ( ( ( RULE_ID ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:758:1: ( ( ( RULE_ID ) ) )
            {
             before(grammarAccess.getCustomMethodAccess().getOutputAssignment_4_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:759:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:760:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:760:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:761:1: ( RULE_ID )
            {
             before(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceCrossReference_4_1_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:762:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:763:1: RULE_ID
            {
             before(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomMethod__Group_41696); 
             after(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceCrossReference_4_1_0()); 

            }


            }

             after(grammarAccess.getCustomMethodAccess().getOutputAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group_4


    // $ANTLR start rule__Parameter__Group
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:777:1: rule__Parameter__Group : ( ( ( ( RULE_ID ) ) ) ) ( ( ( RULE_ID ) ) ) ;
    public final void rule__Parameter__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:781:1: ( ( ( ( ( RULE_ID ) ) ) ) ( ( ( RULE_ID ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:782:1: ( ( ( ( RULE_ID ) ) ) ) ( ( ( RULE_ID ) ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:782:1: ( ( ( ( RULE_ID ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:783:1: ( ( ( RULE_ID ) ) )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:784:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:785:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:785:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:786:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeDtoReferenceCrossReference_0_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:787:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:788:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeDtoReferenceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__Group1749); 
             after(grammarAccess.getParameterAccess().getTypeDtoReferenceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeDtoReferenceCrossReference_0_0()); 

            }


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:796:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:797:1: ( ( RULE_ID ) )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:798:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:799:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:799:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:800:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__Group1777); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group


    // $ANTLR start rule__SpecialMethod__Group
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:812:1: rule__SpecialMethod__Group : ( ( ( RULE_STRING ) )? ) ( ( ( ruleSpecialMethodType ) ) ) ( ( ( RULE_ID ) ) ) ( 'for' ) ( ( ( ( RULE_ID ) ) ) ) ( ';' ) ;
    public final void rule__SpecialMethod__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:816:1: ( ( ( ( RULE_STRING ) )? ) ( ( ( ruleSpecialMethodType ) ) ) ( ( ( RULE_ID ) ) ) ( 'for' ) ( ( ( ( RULE_ID ) ) ) ) ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:817:1: ( ( ( RULE_STRING ) )? ) ( ( ( ruleSpecialMethodType ) ) ) ( ( ( RULE_ID ) ) ) ( 'for' ) ( ( ( ( RULE_ID ) ) ) ) ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:817:1: ( ( ( RULE_STRING ) )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:818:1: ( ( RULE_STRING ) )?
            {
             before(grammarAccess.getSpecialMethodAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:819:1: ( ( RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:820:1: ( RULE_STRING )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:820:1: ( RULE_STRING )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:821:1: RULE_STRING
                    {
                     before(grammarAccess.getSpecialMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialMethod__Group1822); 
                     after(grammarAccess.getSpecialMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;

            }

             after(grammarAccess.getSpecialMethodAccess().getDescriptionAssignment_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:827:1: ( ( ( ruleSpecialMethodType ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:828:1: ( ( ruleSpecialMethodType ) )
            {
             before(grammarAccess.getSpecialMethodAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:829:1: ( ( ruleSpecialMethodType ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:830:1: ( ruleSpecialMethodType )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:830:1: ( ruleSpecialMethodType )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:831:1: ruleSpecialMethodType
            {
             before(grammarAccess.getSpecialMethodAccess().getTypeSpecialMethodTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSpecialMethodType_in_rule__SpecialMethod__Group1847);
            ruleSpecialMethodType();
            _fsp--;

             after(grammarAccess.getSpecialMethodAccess().getTypeSpecialMethodTypeEnumRuleCall_1_0()); 

            }


            }

             after(grammarAccess.getSpecialMethodAccess().getTypeAssignment_1()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:837:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:838:1: ( ( RULE_ID ) )
            {
             before(grammarAccess.getSpecialMethodAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:839:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:840:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:840:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:841:1: RULE_ID
            {
             before(grammarAccess.getSpecialMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialMethod__Group1871); 
             after(grammarAccess.getSpecialMethodAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

             after(grammarAccess.getSpecialMethodAccess().getNameAssignment_2()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:847:1: ( 'for' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:848:1: 'for'
            {
             before(grammarAccess.getSpecialMethodAccess().getForKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__SpecialMethod__Group1889); 
             after(grammarAccess.getSpecialMethodAccess().getForKeyword_3()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:853:1: ( ( ( ( RULE_ID ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:854:1: ( ( ( RULE_ID ) ) )
            {
             before(grammarAccess.getSpecialMethodAccess().getDtoAssignment_4()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:855:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:856:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:856:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:857:1: ( RULE_ID )
            {
             before(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:858:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:859:1: RULE_ID
            {
             before(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialMethod__Group1912); 
             after(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceCrossReference_4_0()); 

            }


            }

             after(grammarAccess.getSpecialMethodAccess().getDtoAssignment_4()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:867:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:868:1: ';'
            {
             before(grammarAccess.getSpecialMethodAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__SpecialMethod__Group1934); 
             after(grammarAccess.getSpecialMethodAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__Group


    // $ANTLR start rule__CrudService__Group
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:879:1: rule__CrudService__Group : ( ( ( RULE_STRING ) )? ) ( 'crud' ) ( ( ( ( RULE_ID ) ) ) ) ( ';' ) ;
    public final void rule__CrudService__Group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:883:1: ( ( ( ( RULE_STRING ) )? ) ( 'crud' ) ( ( ( ( RULE_ID ) ) ) ) ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:884:1: ( ( ( RULE_STRING ) )? ) ( 'crud' ) ( ( ( ( RULE_ID ) ) ) ) ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:884:1: ( ( ( RULE_STRING ) )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:885:1: ( ( RULE_STRING ) )?
            {
             before(grammarAccess.getCrudServiceAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:886:1: ( ( RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:887:1: ( RULE_STRING )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:887:1: ( RULE_STRING )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:888:1: RULE_STRING
                    {
                     before(grammarAccess.getCrudServiceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CrudService__Group1974); 
                     after(grammarAccess.getCrudServiceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;

            }

             after(grammarAccess.getCrudServiceAccess().getDescriptionAssignment_0()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:894:1: ( 'crud' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:895:1: 'crud'
            {
             before(grammarAccess.getCrudServiceAccess().getCrudKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__CrudService__Group1993); 
             after(grammarAccess.getCrudServiceAccess().getCrudKeyword_1()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:900:1: ( ( ( ( RULE_ID ) ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:901:1: ( ( ( RULE_ID ) ) )
            {
             before(grammarAccess.getCrudServiceAccess().getDtoAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:902:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:903:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:903:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:904:1: ( RULE_ID )
            {
             before(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceCrossReference_2_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:905:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:906:1: RULE_ID
            {
             before(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CrudService__Group2016); 
             after(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceCrossReference_2_0()); 

            }


            }

             after(grammarAccess.getCrudServiceAccess().getDtoAssignment_2()); 

            }

            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:914:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:915:1: ';'
            {
             before(grammarAccess.getCrudServiceAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__CrudService__Group2038); 
             after(grammarAccess.getCrudServiceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CrudService__Group


 

    public static final BitSet FOLLOW_ruleServiceModel_in_entryRuleServiceModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceModel__Group_in_ruleServiceModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationMethod_in_entryRuleAssociationMethod119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationMethod126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group_in_ruleAssociationMethod153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoReference_in_entryRuleDtoReference178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoReference185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoReference__Group_in_ruleDtoReference212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethod244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Alternatives_in_ruleServiceMethod271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_entryRuleCustomMethod296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomMethod303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_in_ruleCustomMethod330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_in_ruleParameter389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_entryRuleSpecialMethod414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialMethod421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialMethod__Group_in_ruleSpecialMethod448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_entryRuleCrudService473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrudService480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__Group_in_ruleCrudService507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialMethodType__Alternatives_in_ruleSpecialMethodType543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethodType__Alternatives_in_ruleAssociationMethodType578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_rule__ServiceModel__Alternatives_5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_rule__ServiceModel__Alternatives_5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_rule__ServiceMethod__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_rule__ServiceMethod__Alternatives703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationMethod_in_rule__ServiceMethod__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SpecialMethodType__Alternatives751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SpecialMethodType__Alternatives771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SpecialMethodType__Alternatives791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialMethodType__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SpecialMethodType__Alternatives831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SpecialMethodType__Alternatives851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AssociationMethodType__Alternatives886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AssociationMethodType__Alternatives906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AssociationMethodType__Alternatives926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceModel__Group968 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rule__ServiceModel__Group987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceModel__Group1006 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule__ServiceModel__Group1024 = new BitSet(new long[]{0x000000008541F812L});
    public static final BitSet FOLLOW_ruleDtoReference_in_rule__ServiceModel__Group1043 = new BitSet(new long[]{0x000000008541F812L});
    public static final BitSet FOLLOW_rule__ServiceModel__Alternatives_5_in_rule__ServiceModel__Group1061 = new BitSet(new long[]{0x000000008441F812L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AssociationMethod__Group1101 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rule__AssociationMethod__Group1131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationMethod__Group1166 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rule__AssociationMethod__Group1188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationMethod__Group1207 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleAssociationMethodType_in_rule__AssociationMethod__Group1231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationMethod__Group1259 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule__AssociationMethod__Group1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DtoReference__Group1315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoReference__Group1334 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rule__DtoReference__Group1352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoReference__Group1371 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule__DtoReference__Group1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomMethod__Group1429 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rule__CustomMethod__Group1448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomMethod__Group1467 = new BitSet(new long[]{0x0000000048200000L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_3_in_rule__CustomMethod__Group1484 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_4_in_rule__CustomMethod__Group1496 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule__CustomMethod__Group1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CustomMethod__Group_31543 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rule__CustomMethod__Group_31556 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_3_2_in_rule__CustomMethod__Group_31568 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_29_in_rule__CustomMethod__Group_31581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CustomMethod__Group_3_21621 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule__CustomMethod__Group_3_21639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CustomMethod__Group_41673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomMethod__Group_41696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__Group1749 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__Group1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialMethod__Group1822 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_ruleSpecialMethodType_in_rule__SpecialMethod__Group1847 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialMethod__Group1871 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rule__SpecialMethod__Group1889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialMethod__Group1912 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule__SpecialMethod__Group1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CrudService__Group1974 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rule__CrudService__Group1993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CrudService__Group2016 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rule__CrudService__Group2038 = new BitSet(new long[]{0x0000000000000002L});

}