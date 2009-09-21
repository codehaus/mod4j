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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'read'", "'update'", "'delete'", "'listall'", "'find'", "'add'", "'remove'", "'get'", "'service'", "';'", "'reference'", "'from'", "'import'", "'method'", "'in'", "'['", "']'", "'out'", "'for'", "'crud'"
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:63:1: ruleServiceModel : ( ( rule__ServiceModel__Group__0 ) ) ;
    public final void ruleServiceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:67:2: ( ( ( rule__ServiceModel__Group__0 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:68:1: ( ( rule__ServiceModel__Group__0 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:68:1: ( ( rule__ServiceModel__Group__0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:69:1: ( rule__ServiceModel__Group__0 )
            {
             before(grammarAccess.getServiceModelAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:70:1: ( rule__ServiceModel__Group__0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:70:2: rule__ServiceModel__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceModel__Group__0_in_ruleServiceModel94);
            rule__ServiceModel__Group__0();
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:82:1: entryRuleAssociationMethod : ruleAssociationMethod EOF ;
    public final void entryRuleAssociationMethod() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:82:28: ( ruleAssociationMethod EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:83:1: ruleAssociationMethod EOF
            {
             before(grammarAccess.getAssociationMethodRule()); 
            pushFollow(FOLLOW_ruleAssociationMethod_in_entryRuleAssociationMethod120);
            ruleAssociationMethod();
            _fsp--;

             after(grammarAccess.getAssociationMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationMethod127); 

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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:90:1: ruleAssociationMethod : ( ( rule__AssociationMethod__Group__0 ) ) ;
    public final void ruleAssociationMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:94:2: ( ( ( rule__AssociationMethod__Group__0 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:95:1: ( ( rule__AssociationMethod__Group__0 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:95:1: ( ( rule__AssociationMethod__Group__0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:96:1: ( rule__AssociationMethod__Group__0 )
            {
             before(grammarAccess.getAssociationMethodAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:97:1: ( rule__AssociationMethod__Group__0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:97:2: rule__AssociationMethod__Group__0
            {
            pushFollow(FOLLOW_rule__AssociationMethod__Group__0_in_ruleAssociationMethod154);
            rule__AssociationMethod__Group__0();
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:109:1: entryRuleDtoReference : ruleDtoReference EOF ;
    public final void entryRuleDtoReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:109:23: ( ruleDtoReference EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:110:1: ruleDtoReference EOF
            {
             before(grammarAccess.getDtoReferenceRule()); 
            pushFollow(FOLLOW_ruleDtoReference_in_entryRuleDtoReference180);
            ruleDtoReference();
            _fsp--;

             after(grammarAccess.getDtoReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoReference187); 

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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:117:1: ruleDtoReference : ( ( rule__DtoReference__Group__0 ) ) ;
    public final void ruleDtoReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:121:2: ( ( ( rule__DtoReference__Group__0 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:122:1: ( ( rule__DtoReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:122:1: ( ( rule__DtoReference__Group__0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:123:1: ( rule__DtoReference__Group__0 )
            {
             before(grammarAccess.getDtoReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:124:1: ( rule__DtoReference__Group__0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:124:2: rule__DtoReference__Group__0
            {
            pushFollow(FOLLOW_rule__DtoReference__Group__0_in_ruleDtoReference214);
            rule__DtoReference__Group__0();
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:136:1: entryRuleServiceMethod : ruleServiceMethod EOF ;
    public final void entryRuleServiceMethod() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:136:24: ( ruleServiceMethod EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:137:1: ruleServiceMethod EOF
            {
             before(grammarAccess.getServiceMethodRule()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod240);
            ruleServiceMethod();
            _fsp--;

             after(grammarAccess.getServiceMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethod247); 

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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:144:1: ruleServiceMethod : ( ( rule__ServiceMethod__Alternatives ) ) ;
    public final void ruleServiceMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:148:2: ( ( ( rule__ServiceMethod__Alternatives ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:149:1: ( ( rule__ServiceMethod__Alternatives ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:149:1: ( ( rule__ServiceMethod__Alternatives ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:150:1: ( rule__ServiceMethod__Alternatives )
            {
             before(grammarAccess.getServiceMethodAccess().getAlternatives()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:151:1: ( rule__ServiceMethod__Alternatives )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:151:2: rule__ServiceMethod__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Alternatives_in_ruleServiceMethod274);
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:163:1: entryRuleCustomMethod : ruleCustomMethod EOF ;
    public final void entryRuleCustomMethod() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:163:23: ( ruleCustomMethod EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:164:1: ruleCustomMethod EOF
            {
             before(grammarAccess.getCustomMethodRule()); 
            pushFollow(FOLLOW_ruleCustomMethod_in_entryRuleCustomMethod300);
            ruleCustomMethod();
            _fsp--;

             after(grammarAccess.getCustomMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomMethod307); 

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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:171:1: ruleCustomMethod : ( ( rule__CustomMethod__Group__0 ) ) ;
    public final void ruleCustomMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:175:2: ( ( ( rule__CustomMethod__Group__0 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:176:1: ( ( rule__CustomMethod__Group__0 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:176:1: ( ( rule__CustomMethod__Group__0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:177:1: ( rule__CustomMethod__Group__0 )
            {
             before(grammarAccess.getCustomMethodAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:178:1: ( rule__CustomMethod__Group__0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:178:2: rule__CustomMethod__Group__0
            {
            pushFollow(FOLLOW_rule__CustomMethod__Group__0_in_ruleCustomMethod334);
            rule__CustomMethod__Group__0();
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:190:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:190:20: ( ruleParameter EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:191:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter360);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter367); 

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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:198:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:202:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:203:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:203:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:204:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:205:1: ( rule__Parameter__Group__0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:205:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter394);
            rule__Parameter__Group__0();
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:217:1: entryRuleSpecialMethod : ruleSpecialMethod EOF ;
    public final void entryRuleSpecialMethod() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:217:24: ( ruleSpecialMethod EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:218:1: ruleSpecialMethod EOF
            {
             before(grammarAccess.getSpecialMethodRule()); 
            pushFollow(FOLLOW_ruleSpecialMethod_in_entryRuleSpecialMethod420);
            ruleSpecialMethod();
            _fsp--;

             after(grammarAccess.getSpecialMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialMethod427); 

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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:225:1: ruleSpecialMethod : ( ( rule__SpecialMethod__Group__0 ) ) ;
    public final void ruleSpecialMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:229:2: ( ( ( rule__SpecialMethod__Group__0 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:230:1: ( ( rule__SpecialMethod__Group__0 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:230:1: ( ( rule__SpecialMethod__Group__0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:231:1: ( rule__SpecialMethod__Group__0 )
            {
             before(grammarAccess.getSpecialMethodAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:232:1: ( rule__SpecialMethod__Group__0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:232:2: rule__SpecialMethod__Group__0
            {
            pushFollow(FOLLOW_rule__SpecialMethod__Group__0_in_ruleSpecialMethod454);
            rule__SpecialMethod__Group__0();
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:244:1: entryRuleCrudService : ruleCrudService EOF ;
    public final void entryRuleCrudService() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:244:22: ( ruleCrudService EOF )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:245:1: ruleCrudService EOF
            {
             before(grammarAccess.getCrudServiceRule()); 
            pushFollow(FOLLOW_ruleCrudService_in_entryRuleCrudService480);
            ruleCrudService();
            _fsp--;

             after(grammarAccess.getCrudServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrudService487); 

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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:252:1: ruleCrudService : ( ( rule__CrudService__Group__0 ) ) ;
    public final void ruleCrudService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:256:2: ( ( ( rule__CrudService__Group__0 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:257:1: ( ( rule__CrudService__Group__0 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:257:1: ( ( rule__CrudService__Group__0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:258:1: ( rule__CrudService__Group__0 )
            {
             before(grammarAccess.getCrudServiceAccess().getGroup()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:259:1: ( rule__CrudService__Group__0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:259:2: rule__CrudService__Group__0
            {
            pushFollow(FOLLOW_rule__CrudService__Group__0_in_ruleCrudService514);
            rule__CrudService__Group__0();
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:272:1: ruleSpecialMethodType : ( ( rule__SpecialMethodType__Alternatives ) ) ;
    public final void ruleSpecialMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:276:1: ( ( ( rule__SpecialMethodType__Alternatives ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:277:1: ( ( rule__SpecialMethodType__Alternatives ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:277:1: ( ( rule__SpecialMethodType__Alternatives ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:278:1: ( rule__SpecialMethodType__Alternatives )
            {
             before(grammarAccess.getSpecialMethodTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:279:1: ( rule__SpecialMethodType__Alternatives )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:279:2: rule__SpecialMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecialMethodType__Alternatives_in_ruleSpecialMethodType551);
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:291:1: ruleAssociationMethodType : ( ( rule__AssociationMethodType__Alternatives ) ) ;
    public final void ruleAssociationMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:295:1: ( ( ( rule__AssociationMethodType__Alternatives ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:296:1: ( ( rule__AssociationMethodType__Alternatives ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:296:1: ( ( rule__AssociationMethodType__Alternatives ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:297:1: ( rule__AssociationMethodType__Alternatives )
            {
             before(grammarAccess.getAssociationMethodTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:298:1: ( rule__AssociationMethodType__Alternatives )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:298:2: rule__AssociationMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__AssociationMethodType__Alternatives_in_ruleAssociationMethodType587);
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:309:1: rule__ServiceModel__Alternatives_5 : ( ( ( rule__ServiceModel__CrudServicesAssignment_5_0 ) ) | ( ( rule__ServiceModel__MethodsAssignment_5_1 ) ) );
    public final void rule__ServiceModel__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:313:1: ( ( ( rule__ServiceModel__CrudServicesAssignment_5_0 ) ) | ( ( rule__ServiceModel__MethodsAssignment_5_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=11 && LA1_1<=16)||LA1_1==25||LA1_1==30) ) {
                    alt1=2;
                }
                else if ( (LA1_1==31) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("309:1: rule__ServiceModel__Alternatives_5 : ( ( ( rule__ServiceModel__CrudServicesAssignment_5_0 ) ) | ( ( rule__ServiceModel__MethodsAssignment_5_1 ) ) );", 1, 1, input);

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
            case 25:
            case 30:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("309:1: rule__ServiceModel__Alternatives_5 : ( ( ( rule__ServiceModel__CrudServicesAssignment_5_0 ) ) | ( ( rule__ServiceModel__MethodsAssignment_5_1 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:314:1: ( ( rule__ServiceModel__CrudServicesAssignment_5_0 ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:314:1: ( ( rule__ServiceModel__CrudServicesAssignment_5_0 ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:315:1: ( rule__ServiceModel__CrudServicesAssignment_5_0 )
                    {
                     before(grammarAccess.getServiceModelAccess().getCrudServicesAssignment_5_0()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:316:1: ( rule__ServiceModel__CrudServicesAssignment_5_0 )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:316:2: rule__ServiceModel__CrudServicesAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__ServiceModel__CrudServicesAssignment_5_0_in_rule__ServiceModel__Alternatives_5622);
                    rule__ServiceModel__CrudServicesAssignment_5_0();
                    _fsp--;


                    }

                     after(grammarAccess.getServiceModelAccess().getCrudServicesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:320:6: ( ( rule__ServiceModel__MethodsAssignment_5_1 ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:320:6: ( ( rule__ServiceModel__MethodsAssignment_5_1 ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:321:1: ( rule__ServiceModel__MethodsAssignment_5_1 )
                    {
                     before(grammarAccess.getServiceModelAccess().getMethodsAssignment_5_1()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:322:1: ( rule__ServiceModel__MethodsAssignment_5_1 )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:322:2: rule__ServiceModel__MethodsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__ServiceModel__MethodsAssignment_5_1_in_rule__ServiceModel__Alternatives_5640);
                    rule__ServiceModel__MethodsAssignment_5_1();
                    _fsp--;


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
                case 30:
                    {
                    alt2=3;
                    }
                    break;
                case 25:
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("331:1: rule__ServiceMethod__Alternatives : ( ( ruleCustomMethod ) | ( ruleSpecialMethod ) | ( ruleAssociationMethod ) );", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 25:
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
            case 30:
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
                    pushFollow(FOLLOW_ruleCustomMethod_in_rule__ServiceMethod__Alternatives673);
                    ruleCustomMethod();
                    _fsp--;

                     after(grammarAccess.getServiceMethodAccess().getCustomMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:342:6: ( ruleSpecialMethod )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:342:6: ( ruleSpecialMethod )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:343:1: ruleSpecialMethod
                    {
                     before(grammarAccess.getServiceMethodAccess().getSpecialMethodParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSpecialMethod_in_rule__ServiceMethod__Alternatives690);
                    ruleSpecialMethod();
                    _fsp--;

                     after(grammarAccess.getServiceMethodAccess().getSpecialMethodParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:348:6: ( ruleAssociationMethod )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:348:6: ( ruleAssociationMethod )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:349:1: ruleAssociationMethod
                    {
                     before(grammarAccess.getServiceMethodAccess().getAssociationMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAssociationMethod_in_rule__ServiceMethod__Alternatives707);
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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:359:1: rule__SpecialMethodType__Alternatives : ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) | ( ( 'listall' ) ) | ( ( 'find' ) ) );
    public final void rule__SpecialMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:363:1: ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) | ( ( 'listall' ) ) | ( ( 'find' ) ) )
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
                    new NoViableAltException("359:1: rule__SpecialMethodType__Alternatives : ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) | ( ( 'listall' ) ) | ( ( 'find' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:364:1: ( ( 'create' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:364:1: ( ( 'create' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:365:1: ( 'create' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getCREATEEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:366:1: ( 'create' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:366:3: 'create'
                    {
                    match(input,11,FOLLOW_11_in_rule__SpecialMethodType__Alternatives740); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getCREATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:371:6: ( ( 'read' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:371:6: ( ( 'read' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:372:1: ( 'read' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getREADEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:373:1: ( 'read' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:373:3: 'read'
                    {
                    match(input,12,FOLLOW_12_in_rule__SpecialMethodType__Alternatives761); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getREADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:378:6: ( ( 'update' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:378:6: ( ( 'update' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:379:1: ( 'update' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getUPDATEEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:380:1: ( 'update' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:380:3: 'update'
                    {
                    match(input,13,FOLLOW_13_in_rule__SpecialMethodType__Alternatives782); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getUPDATEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:385:6: ( ( 'delete' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:385:6: ( ( 'delete' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:386:1: ( 'delete' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:387:1: ( 'delete' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:387:3: 'delete'
                    {
                    match(input,14,FOLLOW_14_in_rule__SpecialMethodType__Alternatives803); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:392:6: ( ( 'listall' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:392:6: ( ( 'listall' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:393:1: ( 'listall' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getLISTALLEnumLiteralDeclaration_4()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:394:1: ( 'listall' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:394:3: 'listall'
                    {
                    match(input,15,FOLLOW_15_in_rule__SpecialMethodType__Alternatives824); 

                    }

                     after(grammarAccess.getSpecialMethodTypeAccess().getLISTALLEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:399:6: ( ( 'find' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:399:6: ( ( 'find' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:400:1: ( 'find' )
                    {
                     before(grammarAccess.getSpecialMethodTypeAccess().getFINDEnumLiteralDeclaration_5()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:401:1: ( 'find' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:401:3: 'find'
                    {
                    match(input,16,FOLLOW_16_in_rule__SpecialMethodType__Alternatives845); 

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
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:411:1: rule__AssociationMethodType__Alternatives : ( ( ( 'add' ) ) | ( ( 'remove' ) ) | ( ( 'get' ) ) );
    public final void rule__AssociationMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:415:1: ( ( ( 'add' ) ) | ( ( 'remove' ) ) | ( ( 'get' ) ) )
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
                    new NoViableAltException("411:1: rule__AssociationMethodType__Alternatives : ( ( ( 'add' ) ) | ( ( 'remove' ) ) | ( ( 'get' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:416:1: ( ( 'add' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:416:1: ( ( 'add' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:417:1: ( 'add' )
                    {
                     before(grammarAccess.getAssociationMethodTypeAccess().getADDTOEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:418:1: ( 'add' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:418:3: 'add'
                    {
                    match(input,17,FOLLOW_17_in_rule__AssociationMethodType__Alternatives881); 

                    }

                     after(grammarAccess.getAssociationMethodTypeAccess().getADDTOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:423:6: ( ( 'remove' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:423:6: ( ( 'remove' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:424:1: ( 'remove' )
                    {
                     before(grammarAccess.getAssociationMethodTypeAccess().getREMOVEFROMEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:425:1: ( 'remove' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:425:3: 'remove'
                    {
                    match(input,18,FOLLOW_18_in_rule__AssociationMethodType__Alternatives902); 

                    }

                     after(grammarAccess.getAssociationMethodTypeAccess().getREMOVEFROMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:430:6: ( ( 'get' ) )
                    {
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:430:6: ( ( 'get' ) )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:431:1: ( 'get' )
                    {
                     before(grammarAccess.getAssociationMethodTypeAccess().getGETFROMEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:432:1: ( 'get' )
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:432:3: 'get'
                    {
                    match(input,19,FOLLOW_19_in_rule__AssociationMethodType__Alternatives923); 

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


    // $ANTLR start rule__ServiceModel__Group__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:444:1: rule__ServiceModel__Group__0 : ( ( rule__ServiceModel__DescriptionAssignment_0 )? ) rule__ServiceModel__Group__1 ;
    public final void rule__ServiceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:448:1: ( ( ( rule__ServiceModel__DescriptionAssignment_0 )? ) rule__ServiceModel__Group__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:449:1: ( ( rule__ServiceModel__DescriptionAssignment_0 )? ) rule__ServiceModel__Group__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:449:1: ( ( rule__ServiceModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:450:1: ( rule__ServiceModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getServiceModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:451:1: ( rule__ServiceModel__DescriptionAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:451:2: rule__ServiceModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ServiceModel__DescriptionAssignment_0_in_rule__ServiceModel__Group__0960);
                    rule__ServiceModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ServiceModel__Group__1_in_rule__ServiceModel__Group__0970);
            rule__ServiceModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__Group__0


    // $ANTLR start rule__ServiceModel__Group__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:462:1: rule__ServiceModel__Group__1 : ( 'service' ) rule__ServiceModel__Group__2 ;
    public final void rule__ServiceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:466:1: ( ( 'service' ) rule__ServiceModel__Group__2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:467:1: ( 'service' ) rule__ServiceModel__Group__2
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:467:1: ( 'service' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:468:1: 'service'
            {
             before(grammarAccess.getServiceModelAccess().getServiceKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ServiceModel__Group__1999); 
             after(grammarAccess.getServiceModelAccess().getServiceKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ServiceModel__Group__2_in_rule__ServiceModel__Group__11009);
            rule__ServiceModel__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__Group__1


    // $ANTLR start rule__ServiceModel__Group__2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:482:1: rule__ServiceModel__Group__2 : ( ( rule__ServiceModel__NameAssignment_2 ) ) rule__ServiceModel__Group__3 ;
    public final void rule__ServiceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:486:1: ( ( ( rule__ServiceModel__NameAssignment_2 ) ) rule__ServiceModel__Group__3 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:487:1: ( ( rule__ServiceModel__NameAssignment_2 ) ) rule__ServiceModel__Group__3
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:487:1: ( ( rule__ServiceModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:488:1: ( rule__ServiceModel__NameAssignment_2 )
            {
             before(grammarAccess.getServiceModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:489:1: ( rule__ServiceModel__NameAssignment_2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:489:2: rule__ServiceModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ServiceModel__NameAssignment_2_in_rule__ServiceModel__Group__21037);
            rule__ServiceModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getServiceModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ServiceModel__Group__3_in_rule__ServiceModel__Group__21046);
            rule__ServiceModel__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__Group__2


    // $ANTLR start rule__ServiceModel__Group__3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:500:1: rule__ServiceModel__Group__3 : ( ';' ) rule__ServiceModel__Group__4 ;
    public final void rule__ServiceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:504:1: ( ( ';' ) rule__ServiceModel__Group__4 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:505:1: ( ';' ) rule__ServiceModel__Group__4
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:505:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:506:1: ';'
            {
             before(grammarAccess.getServiceModelAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ServiceModel__Group__31075); 
             after(grammarAccess.getServiceModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ServiceModel__Group__4_in_rule__ServiceModel__Group__31085);
            rule__ServiceModel__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__Group__3


    // $ANTLR start rule__ServiceModel__Group__4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:520:1: rule__ServiceModel__Group__4 : ( ( rule__ServiceModel__DtoReferencesAssignment_4 )* ) rule__ServiceModel__Group__5 ;
    public final void rule__ServiceModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:524:1: ( ( ( rule__ServiceModel__DtoReferencesAssignment_4 )* ) rule__ServiceModel__Group__5 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:525:1: ( ( rule__ServiceModel__DtoReferencesAssignment_4 )* ) rule__ServiceModel__Group__5
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:525:1: ( ( rule__ServiceModel__DtoReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:526:1: ( rule__ServiceModel__DtoReferencesAssignment_4 )*
            {
             before(grammarAccess.getServiceModelAccess().getDtoReferencesAssignment_4()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:527:1: ( rule__ServiceModel__DtoReferencesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:527:2: rule__ServiceModel__DtoReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ServiceModel__DtoReferencesAssignment_4_in_rule__ServiceModel__Group__41113);
            	    rule__ServiceModel__DtoReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getServiceModelAccess().getDtoReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ServiceModel__Group__5_in_rule__ServiceModel__Group__41123);
            rule__ServiceModel__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__Group__4


    // $ANTLR start rule__ServiceModel__Group__5
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:538:1: rule__ServiceModel__Group__5 : ( ( rule__ServiceModel__Alternatives_5 )* ) ;
    public final void rule__ServiceModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:542:1: ( ( ( rule__ServiceModel__Alternatives_5 )* ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:543:1: ( ( rule__ServiceModel__Alternatives_5 )* )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:543:1: ( ( rule__ServiceModel__Alternatives_5 )* )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:544:1: ( rule__ServiceModel__Alternatives_5 )*
            {
             before(grammarAccess.getServiceModelAccess().getAlternatives_5()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:545:1: ( rule__ServiceModel__Alternatives_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||(LA7_0>=11 && LA7_0<=16)||LA7_0==25||(LA7_0>=30 && LA7_0<=31)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:545:2: rule__ServiceModel__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__ServiceModel__Alternatives_5_in_rule__ServiceModel__Group__51151);
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
    // $ANTLR end rule__ServiceModel__Group__5


    // $ANTLR start rule__AssociationMethod__Group__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:567:1: rule__AssociationMethod__Group__0 : ( ( rule__AssociationMethod__DescriptionAssignment_0 )? ) rule__AssociationMethod__Group__1 ;
    public final void rule__AssociationMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:571:1: ( ( ( rule__AssociationMethod__DescriptionAssignment_0 )? ) rule__AssociationMethod__Group__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:572:1: ( ( rule__AssociationMethod__DescriptionAssignment_0 )? ) rule__AssociationMethod__Group__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:572:1: ( ( rule__AssociationMethod__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:573:1: ( rule__AssociationMethod__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getAssociationMethodAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:574:1: ( rule__AssociationMethod__DescriptionAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:574:2: rule__AssociationMethod__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AssociationMethod__DescriptionAssignment_0_in_rule__AssociationMethod__Group__01198);
                    rule__AssociationMethod__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationMethodAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AssociationMethod__Group__1_in_rule__AssociationMethod__Group__01208);
            rule__AssociationMethod__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__Group__0


    // $ANTLR start rule__AssociationMethod__Group__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:585:1: rule__AssociationMethod__Group__1 : ( ( rule__AssociationMethod__NameAssignment_1 ) ) rule__AssociationMethod__Group__2 ;
    public final void rule__AssociationMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:589:1: ( ( ( rule__AssociationMethod__NameAssignment_1 ) ) rule__AssociationMethod__Group__2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:590:1: ( ( rule__AssociationMethod__NameAssignment_1 ) ) rule__AssociationMethod__Group__2
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:590:1: ( ( rule__AssociationMethod__NameAssignment_1 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:591:1: ( rule__AssociationMethod__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationMethodAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:592:1: ( rule__AssociationMethod__NameAssignment_1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:592:2: rule__AssociationMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AssociationMethod__NameAssignment_1_in_rule__AssociationMethod__Group__11236);
            rule__AssociationMethod__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAssociationMethodAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__AssociationMethod__Group__2_in_rule__AssociationMethod__Group__11245);
            rule__AssociationMethod__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__Group__1


    // $ANTLR start rule__AssociationMethod__Group__2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:603:1: rule__AssociationMethod__Group__2 : ( ( rule__AssociationMethod__MainAssignment_2 ) ) rule__AssociationMethod__Group__3 ;
    public final void rule__AssociationMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:607:1: ( ( ( rule__AssociationMethod__MainAssignment_2 ) ) rule__AssociationMethod__Group__3 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:608:1: ( ( rule__AssociationMethod__MainAssignment_2 ) ) rule__AssociationMethod__Group__3
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:608:1: ( ( rule__AssociationMethod__MainAssignment_2 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:609:1: ( rule__AssociationMethod__MainAssignment_2 )
            {
             before(grammarAccess.getAssociationMethodAccess().getMainAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:610:1: ( rule__AssociationMethod__MainAssignment_2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:610:2: rule__AssociationMethod__MainAssignment_2
            {
            pushFollow(FOLLOW_rule__AssociationMethod__MainAssignment_2_in_rule__AssociationMethod__Group__21273);
            rule__AssociationMethod__MainAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAssociationMethodAccess().getMainAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__AssociationMethod__Group__3_in_rule__AssociationMethod__Group__21282);
            rule__AssociationMethod__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__Group__2


    // $ANTLR start rule__AssociationMethod__Group__3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:621:1: rule__AssociationMethod__Group__3 : ( 'reference' ) rule__AssociationMethod__Group__4 ;
    public final void rule__AssociationMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:625:1: ( ( 'reference' ) rule__AssociationMethod__Group__4 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:626:1: ( 'reference' ) rule__AssociationMethod__Group__4
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:626:1: ( 'reference' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:627:1: 'reference'
            {
             before(grammarAccess.getAssociationMethodAccess().getReferenceKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__AssociationMethod__Group__31311); 
             after(grammarAccess.getAssociationMethodAccess().getReferenceKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__AssociationMethod__Group__4_in_rule__AssociationMethod__Group__31321);
            rule__AssociationMethod__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__Group__3


    // $ANTLR start rule__AssociationMethod__Group__4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:641:1: rule__AssociationMethod__Group__4 : ( ( rule__AssociationMethod__RolenameAssignment_4 ) ) rule__AssociationMethod__Group__5 ;
    public final void rule__AssociationMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:645:1: ( ( ( rule__AssociationMethod__RolenameAssignment_4 ) ) rule__AssociationMethod__Group__5 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:646:1: ( ( rule__AssociationMethod__RolenameAssignment_4 ) ) rule__AssociationMethod__Group__5
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:646:1: ( ( rule__AssociationMethod__RolenameAssignment_4 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:647:1: ( rule__AssociationMethod__RolenameAssignment_4 )
            {
             before(grammarAccess.getAssociationMethodAccess().getRolenameAssignment_4()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:648:1: ( rule__AssociationMethod__RolenameAssignment_4 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:648:2: rule__AssociationMethod__RolenameAssignment_4
            {
            pushFollow(FOLLOW_rule__AssociationMethod__RolenameAssignment_4_in_rule__AssociationMethod__Group__41349);
            rule__AssociationMethod__RolenameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAssociationMethodAccess().getRolenameAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__AssociationMethod__Group__5_in_rule__AssociationMethod__Group__41358);
            rule__AssociationMethod__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__Group__4


    // $ANTLR start rule__AssociationMethod__Group__5
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:659:1: rule__AssociationMethod__Group__5 : ( ( rule__AssociationMethod__TypeAssignment_5 ) ) rule__AssociationMethod__Group__6 ;
    public final void rule__AssociationMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:663:1: ( ( ( rule__AssociationMethod__TypeAssignment_5 ) ) rule__AssociationMethod__Group__6 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:664:1: ( ( rule__AssociationMethod__TypeAssignment_5 ) ) rule__AssociationMethod__Group__6
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:664:1: ( ( rule__AssociationMethod__TypeAssignment_5 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:665:1: ( rule__AssociationMethod__TypeAssignment_5 )
            {
             before(grammarAccess.getAssociationMethodAccess().getTypeAssignment_5()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:666:1: ( rule__AssociationMethod__TypeAssignment_5 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:666:2: rule__AssociationMethod__TypeAssignment_5
            {
            pushFollow(FOLLOW_rule__AssociationMethod__TypeAssignment_5_in_rule__AssociationMethod__Group__51386);
            rule__AssociationMethod__TypeAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAssociationMethodAccess().getTypeAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__AssociationMethod__Group__6_in_rule__AssociationMethod__Group__51395);
            rule__AssociationMethod__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__Group__5


    // $ANTLR start rule__AssociationMethod__Group__6
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:677:1: rule__AssociationMethod__Group__6 : ( ( rule__AssociationMethod__PartAssignment_6 ) ) rule__AssociationMethod__Group__7 ;
    public final void rule__AssociationMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:681:1: ( ( ( rule__AssociationMethod__PartAssignment_6 ) ) rule__AssociationMethod__Group__7 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:682:1: ( ( rule__AssociationMethod__PartAssignment_6 ) ) rule__AssociationMethod__Group__7
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:682:1: ( ( rule__AssociationMethod__PartAssignment_6 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:683:1: ( rule__AssociationMethod__PartAssignment_6 )
            {
             before(grammarAccess.getAssociationMethodAccess().getPartAssignment_6()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:684:1: ( rule__AssociationMethod__PartAssignment_6 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:684:2: rule__AssociationMethod__PartAssignment_6
            {
            pushFollow(FOLLOW_rule__AssociationMethod__PartAssignment_6_in_rule__AssociationMethod__Group__61423);
            rule__AssociationMethod__PartAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAssociationMethodAccess().getPartAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__AssociationMethod__Group__7_in_rule__AssociationMethod__Group__61432);
            rule__AssociationMethod__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__Group__6


    // $ANTLR start rule__AssociationMethod__Group__7
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:695:1: rule__AssociationMethod__Group__7 : ( ';' ) ;
    public final void rule__AssociationMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:699:1: ( ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:700:1: ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:700:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:701:1: ';'
            {
             before(grammarAccess.getAssociationMethodAccess().getSemicolonKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__AssociationMethod__Group__71461); 
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
    // $ANTLR end rule__AssociationMethod__Group__7


    // $ANTLR start rule__DtoReference__Group__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:730:1: rule__DtoReference__Group__0 : ( 'from' ) rule__DtoReference__Group__1 ;
    public final void rule__DtoReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:734:1: ( ( 'from' ) rule__DtoReference__Group__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:735:1: ( 'from' ) rule__DtoReference__Group__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:735:1: ( 'from' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:736:1: 'from'
            {
             before(grammarAccess.getDtoReferenceAccess().getFromKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__DtoReference__Group__01513); 
             after(grammarAccess.getDtoReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__DtoReference__Group__1_in_rule__DtoReference__Group__01523);
            rule__DtoReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoReference__Group__0


    // $ANTLR start rule__DtoReference__Group__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:750:1: rule__DtoReference__Group__1 : ( ( rule__DtoReference__ModelnameAssignment_1 ) ) rule__DtoReference__Group__2 ;
    public final void rule__DtoReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:754:1: ( ( ( rule__DtoReference__ModelnameAssignment_1 ) ) rule__DtoReference__Group__2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:755:1: ( ( rule__DtoReference__ModelnameAssignment_1 ) ) rule__DtoReference__Group__2
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:755:1: ( ( rule__DtoReference__ModelnameAssignment_1 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:756:1: ( rule__DtoReference__ModelnameAssignment_1 )
            {
             before(grammarAccess.getDtoReferenceAccess().getModelnameAssignment_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:757:1: ( rule__DtoReference__ModelnameAssignment_1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:757:2: rule__DtoReference__ModelnameAssignment_1
            {
            pushFollow(FOLLOW_rule__DtoReference__ModelnameAssignment_1_in_rule__DtoReference__Group__11551);
            rule__DtoReference__ModelnameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDtoReferenceAccess().getModelnameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__DtoReference__Group__2_in_rule__DtoReference__Group__11560);
            rule__DtoReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoReference__Group__1


    // $ANTLR start rule__DtoReference__Group__2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:768:1: rule__DtoReference__Group__2 : ( 'import' ) rule__DtoReference__Group__3 ;
    public final void rule__DtoReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:772:1: ( ( 'import' ) rule__DtoReference__Group__3 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:773:1: ( 'import' ) rule__DtoReference__Group__3
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:773:1: ( 'import' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:774:1: 'import'
            {
             before(grammarAccess.getDtoReferenceAccess().getImportKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__DtoReference__Group__21589); 
             after(grammarAccess.getDtoReferenceAccess().getImportKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__DtoReference__Group__3_in_rule__DtoReference__Group__21599);
            rule__DtoReference__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoReference__Group__2


    // $ANTLR start rule__DtoReference__Group__3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:788:1: rule__DtoReference__Group__3 : ( ( rule__DtoReference__NameAssignment_3 ) ) rule__DtoReference__Group__4 ;
    public final void rule__DtoReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:792:1: ( ( ( rule__DtoReference__NameAssignment_3 ) ) rule__DtoReference__Group__4 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:793:1: ( ( rule__DtoReference__NameAssignment_3 ) ) rule__DtoReference__Group__4
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:793:1: ( ( rule__DtoReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:794:1: ( rule__DtoReference__NameAssignment_3 )
            {
             before(grammarAccess.getDtoReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:795:1: ( rule__DtoReference__NameAssignment_3 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:795:2: rule__DtoReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__DtoReference__NameAssignment_3_in_rule__DtoReference__Group__31627);
            rule__DtoReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDtoReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__DtoReference__Group__4_in_rule__DtoReference__Group__31636);
            rule__DtoReference__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoReference__Group__3


    // $ANTLR start rule__DtoReference__Group__4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:806:1: rule__DtoReference__Group__4 : ( ';' ) ;
    public final void rule__DtoReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:810:1: ( ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:811:1: ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:811:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:812:1: ';'
            {
             before(grammarAccess.getDtoReferenceAccess().getSemicolonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__DtoReference__Group__41665); 
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
    // $ANTLR end rule__DtoReference__Group__4


    // $ANTLR start rule__CustomMethod__Group__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:835:1: rule__CustomMethod__Group__0 : ( ( rule__CustomMethod__DescriptionAssignment_0 )? ) rule__CustomMethod__Group__1 ;
    public final void rule__CustomMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:839:1: ( ( ( rule__CustomMethod__DescriptionAssignment_0 )? ) rule__CustomMethod__Group__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:840:1: ( ( rule__CustomMethod__DescriptionAssignment_0 )? ) rule__CustomMethod__Group__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:840:1: ( ( rule__CustomMethod__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:841:1: ( rule__CustomMethod__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCustomMethodAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:842:1: ( rule__CustomMethod__DescriptionAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:842:2: rule__CustomMethod__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CustomMethod__DescriptionAssignment_0_in_rule__CustomMethod__Group__01710);
                    rule__CustomMethod__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomMethodAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group__1_in_rule__CustomMethod__Group__01720);
            rule__CustomMethod__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group__0


    // $ANTLR start rule__CustomMethod__Group__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:853:1: rule__CustomMethod__Group__1 : ( 'method' ) rule__CustomMethod__Group__2 ;
    public final void rule__CustomMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:857:1: ( ( 'method' ) rule__CustomMethod__Group__2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:858:1: ( 'method' ) rule__CustomMethod__Group__2
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:858:1: ( 'method' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:859:1: 'method'
            {
             before(grammarAccess.getCustomMethodAccess().getMethodKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__CustomMethod__Group__11749); 
             after(grammarAccess.getCustomMethodAccess().getMethodKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group__2_in_rule__CustomMethod__Group__11759);
            rule__CustomMethod__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group__1


    // $ANTLR start rule__CustomMethod__Group__2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:873:1: rule__CustomMethod__Group__2 : ( ( rule__CustomMethod__NameAssignment_2 ) ) rule__CustomMethod__Group__3 ;
    public final void rule__CustomMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:877:1: ( ( ( rule__CustomMethod__NameAssignment_2 ) ) rule__CustomMethod__Group__3 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:878:1: ( ( rule__CustomMethod__NameAssignment_2 ) ) rule__CustomMethod__Group__3
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:878:1: ( ( rule__CustomMethod__NameAssignment_2 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:879:1: ( rule__CustomMethod__NameAssignment_2 )
            {
             before(grammarAccess.getCustomMethodAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:880:1: ( rule__CustomMethod__NameAssignment_2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:880:2: rule__CustomMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CustomMethod__NameAssignment_2_in_rule__CustomMethod__Group__21787);
            rule__CustomMethod__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCustomMethodAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group__3_in_rule__CustomMethod__Group__21796);
            rule__CustomMethod__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group__2


    // $ANTLR start rule__CustomMethod__Group__3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:891:1: rule__CustomMethod__Group__3 : ( ( rule__CustomMethod__Group_3__0 )? ) rule__CustomMethod__Group__4 ;
    public final void rule__CustomMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:895:1: ( ( ( rule__CustomMethod__Group_3__0 )? ) rule__CustomMethod__Group__4 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:896:1: ( ( rule__CustomMethod__Group_3__0 )? ) rule__CustomMethod__Group__4
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:896:1: ( ( rule__CustomMethod__Group_3__0 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:897:1: ( rule__CustomMethod__Group_3__0 )?
            {
             before(grammarAccess.getCustomMethodAccess().getGroup_3()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:898:1: ( rule__CustomMethod__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:898:2: rule__CustomMethod__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CustomMethod__Group_3__0_in_rule__CustomMethod__Group__31824);
                    rule__CustomMethod__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomMethodAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group__4_in_rule__CustomMethod__Group__31834);
            rule__CustomMethod__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group__3


    // $ANTLR start rule__CustomMethod__Group__4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:909:1: rule__CustomMethod__Group__4 : ( ( rule__CustomMethod__Group_4__0 )? ) rule__CustomMethod__Group__5 ;
    public final void rule__CustomMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:913:1: ( ( ( rule__CustomMethod__Group_4__0 )? ) rule__CustomMethod__Group__5 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:914:1: ( ( rule__CustomMethod__Group_4__0 )? ) rule__CustomMethod__Group__5
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:914:1: ( ( rule__CustomMethod__Group_4__0 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:915:1: ( rule__CustomMethod__Group_4__0 )?
            {
             before(grammarAccess.getCustomMethodAccess().getGroup_4()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:916:1: ( rule__CustomMethod__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:916:2: rule__CustomMethod__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CustomMethod__Group_4__0_in_rule__CustomMethod__Group__41862);
                    rule__CustomMethod__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomMethodAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group__5_in_rule__CustomMethod__Group__41872);
            rule__CustomMethod__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group__4


    // $ANTLR start rule__CustomMethod__Group__5
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:927:1: rule__CustomMethod__Group__5 : ( ';' ) ;
    public final void rule__CustomMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:931:1: ( ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:932:1: ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:932:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:933:1: ';'
            {
             before(grammarAccess.getCustomMethodAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__CustomMethod__Group__51901); 
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
    // $ANTLR end rule__CustomMethod__Group__5


    // $ANTLR start rule__CustomMethod__Group_3__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:958:1: rule__CustomMethod__Group_3__0 : ( 'in' ) rule__CustomMethod__Group_3__1 ;
    public final void rule__CustomMethod__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:962:1: ( ( 'in' ) rule__CustomMethod__Group_3__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:963:1: ( 'in' ) rule__CustomMethod__Group_3__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:963:1: ( 'in' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:964:1: 'in'
            {
             before(grammarAccess.getCustomMethodAccess().getInKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__CustomMethod__Group_3__01949); 
             after(grammarAccess.getCustomMethodAccess().getInKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group_3__1_in_rule__CustomMethod__Group_3__01959);
            rule__CustomMethod__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group_3__0


    // $ANTLR start rule__CustomMethod__Group_3__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:978:1: rule__CustomMethod__Group_3__1 : ( '[' ) rule__CustomMethod__Group_3__2 ;
    public final void rule__CustomMethod__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:982:1: ( ( '[' ) rule__CustomMethod__Group_3__2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:983:1: ( '[' ) rule__CustomMethod__Group_3__2
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:983:1: ( '[' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:984:1: '['
            {
             before(grammarAccess.getCustomMethodAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,27,FOLLOW_27_in_rule__CustomMethod__Group_3__11988); 
             after(grammarAccess.getCustomMethodAccess().getLeftSquareBracketKeyword_3_1()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group_3__2_in_rule__CustomMethod__Group_3__11998);
            rule__CustomMethod__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group_3__1


    // $ANTLR start rule__CustomMethod__Group_3__2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:998:1: rule__CustomMethod__Group_3__2 : ( ( rule__CustomMethod__Group_3_2__0 )* ) rule__CustomMethod__Group_3__3 ;
    public final void rule__CustomMethod__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1002:1: ( ( ( rule__CustomMethod__Group_3_2__0 )* ) rule__CustomMethod__Group_3__3 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1003:1: ( ( rule__CustomMethod__Group_3_2__0 )* ) rule__CustomMethod__Group_3__3
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1003:1: ( ( rule__CustomMethod__Group_3_2__0 )* )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1004:1: ( rule__CustomMethod__Group_3_2__0 )*
            {
             before(grammarAccess.getCustomMethodAccess().getGroup_3_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1005:1: ( rule__CustomMethod__Group_3_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1005:2: rule__CustomMethod__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CustomMethod__Group_3_2__0_in_rule__CustomMethod__Group_3__22026);
            	    rule__CustomMethod__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCustomMethodAccess().getGroup_3_2()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group_3__3_in_rule__CustomMethod__Group_3__22036);
            rule__CustomMethod__Group_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group_3__2


    // $ANTLR start rule__CustomMethod__Group_3__3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1016:1: rule__CustomMethod__Group_3__3 : ( ']' ) ;
    public final void rule__CustomMethod__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1020:1: ( ( ']' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1021:1: ( ']' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1021:1: ( ']' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1022:1: ']'
            {
             before(grammarAccess.getCustomMethodAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,28,FOLLOW_28_in_rule__CustomMethod__Group_3__32065); 
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
    // $ANTLR end rule__CustomMethod__Group_3__3


    // $ANTLR start rule__CustomMethod__Group_3_2__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1043:1: rule__CustomMethod__Group_3_2__0 : ( ( rule__CustomMethod__InParametersAssignment_3_2_0 ) ) rule__CustomMethod__Group_3_2__1 ;
    public final void rule__CustomMethod__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1047:1: ( ( ( rule__CustomMethod__InParametersAssignment_3_2_0 ) ) rule__CustomMethod__Group_3_2__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1048:1: ( ( rule__CustomMethod__InParametersAssignment_3_2_0 ) ) rule__CustomMethod__Group_3_2__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1048:1: ( ( rule__CustomMethod__InParametersAssignment_3_2_0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1049:1: ( rule__CustomMethod__InParametersAssignment_3_2_0 )
            {
             before(grammarAccess.getCustomMethodAccess().getInParametersAssignment_3_2_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1050:1: ( rule__CustomMethod__InParametersAssignment_3_2_0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1050:2: rule__CustomMethod__InParametersAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__CustomMethod__InParametersAssignment_3_2_0_in_rule__CustomMethod__Group_3_2__02108);
            rule__CustomMethod__InParametersAssignment_3_2_0();
            _fsp--;


            }

             after(grammarAccess.getCustomMethodAccess().getInParametersAssignment_3_2_0()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group_3_2__1_in_rule__CustomMethod__Group_3_2__02117);
            rule__CustomMethod__Group_3_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group_3_2__0


    // $ANTLR start rule__CustomMethod__Group_3_2__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1061:1: rule__CustomMethod__Group_3_2__1 : ( ';' ) ;
    public final void rule__CustomMethod__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1065:1: ( ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1066:1: ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1066:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1067:1: ';'
            {
             before(grammarAccess.getCustomMethodAccess().getSemicolonKeyword_3_2_1()); 
            match(input,21,FOLLOW_21_in_rule__CustomMethod__Group_3_2__12146); 
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
    // $ANTLR end rule__CustomMethod__Group_3_2__1


    // $ANTLR start rule__CustomMethod__Group_4__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1084:1: rule__CustomMethod__Group_4__0 : ( 'out' ) rule__CustomMethod__Group_4__1 ;
    public final void rule__CustomMethod__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1088:1: ( ( 'out' ) rule__CustomMethod__Group_4__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1089:1: ( 'out' ) rule__CustomMethod__Group_4__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1089:1: ( 'out' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1090:1: 'out'
            {
             before(grammarAccess.getCustomMethodAccess().getOutKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__CustomMethod__Group_4__02186); 
             after(grammarAccess.getCustomMethodAccess().getOutKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__CustomMethod__Group_4__1_in_rule__CustomMethod__Group_4__02196);
            rule__CustomMethod__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__Group_4__0


    // $ANTLR start rule__CustomMethod__Group_4__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1104:1: rule__CustomMethod__Group_4__1 : ( ( rule__CustomMethod__OutputAssignment_4_1 ) ) ;
    public final void rule__CustomMethod__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1108:1: ( ( ( rule__CustomMethod__OutputAssignment_4_1 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1109:1: ( ( rule__CustomMethod__OutputAssignment_4_1 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1109:1: ( ( rule__CustomMethod__OutputAssignment_4_1 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1110:1: ( rule__CustomMethod__OutputAssignment_4_1 )
            {
             before(grammarAccess.getCustomMethodAccess().getOutputAssignment_4_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1111:1: ( rule__CustomMethod__OutputAssignment_4_1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1111:2: rule__CustomMethod__OutputAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CustomMethod__OutputAssignment_4_1_in_rule__CustomMethod__Group_4__12224);
            rule__CustomMethod__OutputAssignment_4_1();
            _fsp--;


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
    // $ANTLR end rule__CustomMethod__Group_4__1


    // $ANTLR start rule__Parameter__Group__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1125:1: rule__Parameter__Group__0 : ( ( rule__Parameter__TypeAssignment_0 ) ) rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1129:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) rule__Parameter__Group__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1130:1: ( ( rule__Parameter__TypeAssignment_0 ) ) rule__Parameter__Group__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1130:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1131:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1132:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1132:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__02262);
            rule__Parameter__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02271);
            rule__Parameter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__0


    // $ANTLR start rule__Parameter__Group__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1143:1: rule__Parameter__Group__1 : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1147:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1148:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1148:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1149:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1150:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1150:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__12299);
            rule__Parameter__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__Parameter__Group__1


    // $ANTLR start rule__SpecialMethod__Group__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1164:1: rule__SpecialMethod__Group__0 : ( ( rule__SpecialMethod__DescriptionAssignment_0 )? ) rule__SpecialMethod__Group__1 ;
    public final void rule__SpecialMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1168:1: ( ( ( rule__SpecialMethod__DescriptionAssignment_0 )? ) rule__SpecialMethod__Group__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1169:1: ( ( rule__SpecialMethod__DescriptionAssignment_0 )? ) rule__SpecialMethod__Group__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1169:1: ( ( rule__SpecialMethod__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1170:1: ( rule__SpecialMethod__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getSpecialMethodAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1171:1: ( rule__SpecialMethod__DescriptionAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1171:2: rule__SpecialMethod__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SpecialMethod__DescriptionAssignment_0_in_rule__SpecialMethod__Group__02337);
                    rule__SpecialMethod__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecialMethodAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__SpecialMethod__Group__1_in_rule__SpecialMethod__Group__02347);
            rule__SpecialMethod__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__Group__0


    // $ANTLR start rule__SpecialMethod__Group__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1182:1: rule__SpecialMethod__Group__1 : ( ( rule__SpecialMethod__TypeAssignment_1 ) ) rule__SpecialMethod__Group__2 ;
    public final void rule__SpecialMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1186:1: ( ( ( rule__SpecialMethod__TypeAssignment_1 ) ) rule__SpecialMethod__Group__2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1187:1: ( ( rule__SpecialMethod__TypeAssignment_1 ) ) rule__SpecialMethod__Group__2
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1187:1: ( ( rule__SpecialMethod__TypeAssignment_1 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1188:1: ( rule__SpecialMethod__TypeAssignment_1 )
            {
             before(grammarAccess.getSpecialMethodAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1189:1: ( rule__SpecialMethod__TypeAssignment_1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1189:2: rule__SpecialMethod__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SpecialMethod__TypeAssignment_1_in_rule__SpecialMethod__Group__12375);
            rule__SpecialMethod__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSpecialMethodAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SpecialMethod__Group__2_in_rule__SpecialMethod__Group__12384);
            rule__SpecialMethod__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__Group__1


    // $ANTLR start rule__SpecialMethod__Group__2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1200:1: rule__SpecialMethod__Group__2 : ( ( rule__SpecialMethod__NameAssignment_2 ) ) rule__SpecialMethod__Group__3 ;
    public final void rule__SpecialMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1204:1: ( ( ( rule__SpecialMethod__NameAssignment_2 ) ) rule__SpecialMethod__Group__3 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1205:1: ( ( rule__SpecialMethod__NameAssignment_2 ) ) rule__SpecialMethod__Group__3
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1205:1: ( ( rule__SpecialMethod__NameAssignment_2 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1206:1: ( rule__SpecialMethod__NameAssignment_2 )
            {
             before(grammarAccess.getSpecialMethodAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1207:1: ( rule__SpecialMethod__NameAssignment_2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1207:2: rule__SpecialMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SpecialMethod__NameAssignment_2_in_rule__SpecialMethod__Group__22412);
            rule__SpecialMethod__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSpecialMethodAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__SpecialMethod__Group__3_in_rule__SpecialMethod__Group__22421);
            rule__SpecialMethod__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__Group__2


    // $ANTLR start rule__SpecialMethod__Group__3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1218:1: rule__SpecialMethod__Group__3 : ( 'for' ) rule__SpecialMethod__Group__4 ;
    public final void rule__SpecialMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1222:1: ( ( 'for' ) rule__SpecialMethod__Group__4 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1223:1: ( 'for' ) rule__SpecialMethod__Group__4
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1223:1: ( 'for' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1224:1: 'for'
            {
             before(grammarAccess.getSpecialMethodAccess().getForKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__SpecialMethod__Group__32450); 
             after(grammarAccess.getSpecialMethodAccess().getForKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__SpecialMethod__Group__4_in_rule__SpecialMethod__Group__32460);
            rule__SpecialMethod__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__Group__3


    // $ANTLR start rule__SpecialMethod__Group__4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1238:1: rule__SpecialMethod__Group__4 : ( ( rule__SpecialMethod__DtoAssignment_4 ) ) rule__SpecialMethod__Group__5 ;
    public final void rule__SpecialMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1242:1: ( ( ( rule__SpecialMethod__DtoAssignment_4 ) ) rule__SpecialMethod__Group__5 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1243:1: ( ( rule__SpecialMethod__DtoAssignment_4 ) ) rule__SpecialMethod__Group__5
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1243:1: ( ( rule__SpecialMethod__DtoAssignment_4 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1244:1: ( rule__SpecialMethod__DtoAssignment_4 )
            {
             before(grammarAccess.getSpecialMethodAccess().getDtoAssignment_4()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1245:1: ( rule__SpecialMethod__DtoAssignment_4 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1245:2: rule__SpecialMethod__DtoAssignment_4
            {
            pushFollow(FOLLOW_rule__SpecialMethod__DtoAssignment_4_in_rule__SpecialMethod__Group__42488);
            rule__SpecialMethod__DtoAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getSpecialMethodAccess().getDtoAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__SpecialMethod__Group__5_in_rule__SpecialMethod__Group__42497);
            rule__SpecialMethod__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__Group__4


    // $ANTLR start rule__SpecialMethod__Group__5
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1256:1: rule__SpecialMethod__Group__5 : ( ';' ) ;
    public final void rule__SpecialMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1260:1: ( ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1261:1: ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1261:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1262:1: ';'
            {
             before(grammarAccess.getSpecialMethodAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__SpecialMethod__Group__52526); 
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
    // $ANTLR end rule__SpecialMethod__Group__5


    // $ANTLR start rule__CrudService__Group__0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1287:1: rule__CrudService__Group__0 : ( ( rule__CrudService__DescriptionAssignment_0 )? ) rule__CrudService__Group__1 ;
    public final void rule__CrudService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1291:1: ( ( ( rule__CrudService__DescriptionAssignment_0 )? ) rule__CrudService__Group__1 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1292:1: ( ( rule__CrudService__DescriptionAssignment_0 )? ) rule__CrudService__Group__1
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1292:1: ( ( rule__CrudService__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1293:1: ( rule__CrudService__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCrudServiceAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1294:1: ( rule__CrudService__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1294:2: rule__CrudService__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CrudService__DescriptionAssignment_0_in_rule__CrudService__Group__02573);
                    rule__CrudService__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCrudServiceAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CrudService__Group__1_in_rule__CrudService__Group__02583);
            rule__CrudService__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CrudService__Group__0


    // $ANTLR start rule__CrudService__Group__1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1305:1: rule__CrudService__Group__1 : ( 'crud' ) rule__CrudService__Group__2 ;
    public final void rule__CrudService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1309:1: ( ( 'crud' ) rule__CrudService__Group__2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1310:1: ( 'crud' ) rule__CrudService__Group__2
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1310:1: ( 'crud' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1311:1: 'crud'
            {
             before(grammarAccess.getCrudServiceAccess().getCrudKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__CrudService__Group__12612); 
             after(grammarAccess.getCrudServiceAccess().getCrudKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CrudService__Group__2_in_rule__CrudService__Group__12622);
            rule__CrudService__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CrudService__Group__1


    // $ANTLR start rule__CrudService__Group__2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1325:1: rule__CrudService__Group__2 : ( ( rule__CrudService__DtoAssignment_2 ) ) rule__CrudService__Group__3 ;
    public final void rule__CrudService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1329:1: ( ( ( rule__CrudService__DtoAssignment_2 ) ) rule__CrudService__Group__3 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1330:1: ( ( rule__CrudService__DtoAssignment_2 ) ) rule__CrudService__Group__3
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1330:1: ( ( rule__CrudService__DtoAssignment_2 ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1331:1: ( rule__CrudService__DtoAssignment_2 )
            {
             before(grammarAccess.getCrudServiceAccess().getDtoAssignment_2()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1332:1: ( rule__CrudService__DtoAssignment_2 )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1332:2: rule__CrudService__DtoAssignment_2
            {
            pushFollow(FOLLOW_rule__CrudService__DtoAssignment_2_in_rule__CrudService__Group__22650);
            rule__CrudService__DtoAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCrudServiceAccess().getDtoAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CrudService__Group__3_in_rule__CrudService__Group__22659);
            rule__CrudService__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CrudService__Group__2


    // $ANTLR start rule__CrudService__Group__3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1343:1: rule__CrudService__Group__3 : ( ';' ) ;
    public final void rule__CrudService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1347:1: ( ( ';' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1348:1: ( ';' )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1348:1: ( ';' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1349:1: ';'
            {
             before(grammarAccess.getCrudServiceAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__CrudService__Group__32688); 
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
    // $ANTLR end rule__CrudService__Group__3


    // $ANTLR start rule__ServiceModel__DescriptionAssignment_0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1370:1: rule__ServiceModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ServiceModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1374:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1375:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1375:1: ( RULE_STRING )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1376:1: RULE_STRING
            {
             before(grammarAccess.getServiceModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceModel__DescriptionAssignment_02731); 
             after(grammarAccess.getServiceModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__DescriptionAssignment_0


    // $ANTLR start rule__ServiceModel__NameAssignment_2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1385:1: rule__ServiceModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1389:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1390:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1390:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1391:1: RULE_ID
            {
             before(grammarAccess.getServiceModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceModel__NameAssignment_22762); 
             after(grammarAccess.getServiceModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__NameAssignment_2


    // $ANTLR start rule__ServiceModel__DtoReferencesAssignment_4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1400:1: rule__ServiceModel__DtoReferencesAssignment_4 : ( ruleDtoReference ) ;
    public final void rule__ServiceModel__DtoReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1404:1: ( ( ruleDtoReference ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1405:1: ( ruleDtoReference )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1405:1: ( ruleDtoReference )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1406:1: ruleDtoReference
            {
             before(grammarAccess.getServiceModelAccess().getDtoReferencesDtoReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDtoReference_in_rule__ServiceModel__DtoReferencesAssignment_42793);
            ruleDtoReference();
            _fsp--;

             after(grammarAccess.getServiceModelAccess().getDtoReferencesDtoReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__DtoReferencesAssignment_4


    // $ANTLR start rule__ServiceModel__CrudServicesAssignment_5_0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1415:1: rule__ServiceModel__CrudServicesAssignment_5_0 : ( ruleCrudService ) ;
    public final void rule__ServiceModel__CrudServicesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1419:1: ( ( ruleCrudService ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1420:1: ( ruleCrudService )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1420:1: ( ruleCrudService )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1421:1: ruleCrudService
            {
             before(grammarAccess.getServiceModelAccess().getCrudServicesCrudServiceParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleCrudService_in_rule__ServiceModel__CrudServicesAssignment_5_02824);
            ruleCrudService();
            _fsp--;

             after(grammarAccess.getServiceModelAccess().getCrudServicesCrudServiceParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__CrudServicesAssignment_5_0


    // $ANTLR start rule__ServiceModel__MethodsAssignment_5_1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1430:1: rule__ServiceModel__MethodsAssignment_5_1 : ( ruleServiceMethod ) ;
    public final void rule__ServiceModel__MethodsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1434:1: ( ( ruleServiceMethod ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1435:1: ( ruleServiceMethod )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1435:1: ( ruleServiceMethod )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1436:1: ruleServiceMethod
            {
             before(grammarAccess.getServiceModelAccess().getMethodsServiceMethodParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_rule__ServiceModel__MethodsAssignment_5_12855);
            ruleServiceMethod();
            _fsp--;

             after(grammarAccess.getServiceModelAccess().getMethodsServiceMethodParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceModel__MethodsAssignment_5_1


    // $ANTLR start rule__AssociationMethod__DescriptionAssignment_0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1445:1: rule__AssociationMethod__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AssociationMethod__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1449:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1450:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1450:1: ( RULE_STRING )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1451:1: RULE_STRING
            {
             before(grammarAccess.getAssociationMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AssociationMethod__DescriptionAssignment_02886); 
             after(grammarAccess.getAssociationMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__DescriptionAssignment_0


    // $ANTLR start rule__AssociationMethod__NameAssignment_1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1460:1: rule__AssociationMethod__NameAssignment_1 : ( ( 'for' ) ) ;
    public final void rule__AssociationMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1464:1: ( ( ( 'for' ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1465:1: ( ( 'for' ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1465:1: ( ( 'for' ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1466:1: ( 'for' )
            {
             before(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1467:1: ( 'for' )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1468:1: 'for'
            {
             before(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__AssociationMethod__NameAssignment_12922); 
             after(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0()); 

            }

             after(grammarAccess.getAssociationMethodAccess().getNameForKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__NameAssignment_1


    // $ANTLR start rule__AssociationMethod__MainAssignment_2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1483:1: rule__AssociationMethod__MainAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationMethod__MainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1487:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1488:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1488:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1489:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceCrossReference_2_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1490:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1491:1: RULE_ID
            {
             before(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationMethod__MainAssignment_22965); 
             after(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssociationMethodAccess().getMainDtoReferenceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__MainAssignment_2


    // $ANTLR start rule__AssociationMethod__RolenameAssignment_4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1502:1: rule__AssociationMethod__RolenameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AssociationMethod__RolenameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1506:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1507:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1507:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1508:1: RULE_ID
            {
             before(grammarAccess.getAssociationMethodAccess().getRolenameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationMethod__RolenameAssignment_43000); 
             after(grammarAccess.getAssociationMethodAccess().getRolenameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__RolenameAssignment_4


    // $ANTLR start rule__AssociationMethod__TypeAssignment_5
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1517:1: rule__AssociationMethod__TypeAssignment_5 : ( ruleAssociationMethodType ) ;
    public final void rule__AssociationMethod__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1521:1: ( ( ruleAssociationMethodType ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1522:1: ( ruleAssociationMethodType )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1522:1: ( ruleAssociationMethodType )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1523:1: ruleAssociationMethodType
            {
             before(grammarAccess.getAssociationMethodAccess().getTypeAssociationMethodTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAssociationMethodType_in_rule__AssociationMethod__TypeAssignment_53031);
            ruleAssociationMethodType();
            _fsp--;

             after(grammarAccess.getAssociationMethodAccess().getTypeAssociationMethodTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__TypeAssignment_5


    // $ANTLR start rule__AssociationMethod__PartAssignment_6
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1532:1: rule__AssociationMethod__PartAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationMethod__PartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1536:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1537:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1537:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1538:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceCrossReference_6_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1539:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1540:1: RULE_ID
            {
             before(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationMethod__PartAssignment_63066); 
             after(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAssociationMethodAccess().getPartDtoReferenceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationMethod__PartAssignment_6


    // $ANTLR start rule__DtoReference__ModelnameAssignment_1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1551:1: rule__DtoReference__ModelnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DtoReference__ModelnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1555:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1556:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1556:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1557:1: RULE_ID
            {
             before(grammarAccess.getDtoReferenceAccess().getModelnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoReference__ModelnameAssignment_13101); 
             after(grammarAccess.getDtoReferenceAccess().getModelnameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoReference__ModelnameAssignment_1


    // $ANTLR start rule__DtoReference__NameAssignment_3
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1566:1: rule__DtoReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DtoReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1570:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1571:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1571:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1572:1: RULE_ID
            {
             before(grammarAccess.getDtoReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoReference__NameAssignment_33132); 
             after(grammarAccess.getDtoReferenceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoReference__NameAssignment_3


    // $ANTLR start rule__CustomMethod__DescriptionAssignment_0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1581:1: rule__CustomMethod__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CustomMethod__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1585:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1586:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1586:1: ( RULE_STRING )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1587:1: RULE_STRING
            {
             before(grammarAccess.getCustomMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomMethod__DescriptionAssignment_03163); 
             after(grammarAccess.getCustomMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__DescriptionAssignment_0


    // $ANTLR start rule__CustomMethod__NameAssignment_2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1596:1: rule__CustomMethod__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1600:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1601:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1601:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1602:1: RULE_ID
            {
             before(grammarAccess.getCustomMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomMethod__NameAssignment_23194); 
             after(grammarAccess.getCustomMethodAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__NameAssignment_2


    // $ANTLR start rule__CustomMethod__InParametersAssignment_3_2_0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1611:1: rule__CustomMethod__InParametersAssignment_3_2_0 : ( ruleParameter ) ;
    public final void rule__CustomMethod__InParametersAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1615:1: ( ( ruleParameter ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1616:1: ( ruleParameter )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1616:1: ( ruleParameter )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1617:1: ruleParameter
            {
             before(grammarAccess.getCustomMethodAccess().getInParametersParameterParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__CustomMethod__InParametersAssignment_3_2_03225);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getCustomMethodAccess().getInParametersParameterParserRuleCall_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__InParametersAssignment_3_2_0


    // $ANTLR start rule__CustomMethod__OutputAssignment_4_1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1626:1: rule__CustomMethod__OutputAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomMethod__OutputAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1630:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1631:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1631:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1632:1: ( RULE_ID )
            {
             before(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceCrossReference_4_1_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1633:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1634:1: RULE_ID
            {
             before(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomMethod__OutputAssignment_4_13260); 
             after(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCustomMethodAccess().getOutputDtoReferenceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomMethod__OutputAssignment_4_1


    // $ANTLR start rule__Parameter__TypeAssignment_0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1645:1: rule__Parameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1649:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1650:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1650:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1651:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeDtoReferenceCrossReference_0_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1652:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1653:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeDtoReferenceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_03299); 
             after(grammarAccess.getParameterAccess().getTypeDtoReferenceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeDtoReferenceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__TypeAssignment_0


    // $ANTLR start rule__Parameter__NameAssignment_1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1664:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1668:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1669:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1669:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1670:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_13334); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__NameAssignment_1


    // $ANTLR start rule__SpecialMethod__DescriptionAssignment_0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1679:1: rule__SpecialMethod__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SpecialMethod__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1683:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1684:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1684:1: ( RULE_STRING )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1685:1: RULE_STRING
            {
             before(grammarAccess.getSpecialMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialMethod__DescriptionAssignment_03365); 
             after(grammarAccess.getSpecialMethodAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__DescriptionAssignment_0


    // $ANTLR start rule__SpecialMethod__TypeAssignment_1
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1694:1: rule__SpecialMethod__TypeAssignment_1 : ( ruleSpecialMethodType ) ;
    public final void rule__SpecialMethod__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1698:1: ( ( ruleSpecialMethodType ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1699:1: ( ruleSpecialMethodType )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1699:1: ( ruleSpecialMethodType )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1700:1: ruleSpecialMethodType
            {
             before(grammarAccess.getSpecialMethodAccess().getTypeSpecialMethodTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSpecialMethodType_in_rule__SpecialMethod__TypeAssignment_13396);
            ruleSpecialMethodType();
            _fsp--;

             after(grammarAccess.getSpecialMethodAccess().getTypeSpecialMethodTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__TypeAssignment_1


    // $ANTLR start rule__SpecialMethod__NameAssignment_2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1709:1: rule__SpecialMethod__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SpecialMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1713:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1714:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1714:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1715:1: RULE_ID
            {
             before(grammarAccess.getSpecialMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialMethod__NameAssignment_23427); 
             after(grammarAccess.getSpecialMethodAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__NameAssignment_2


    // $ANTLR start rule__SpecialMethod__DtoAssignment_4
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1724:1: rule__SpecialMethod__DtoAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SpecialMethod__DtoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1728:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1729:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1729:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1730:1: ( RULE_ID )
            {
             before(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1731:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1732:1: RULE_ID
            {
             before(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialMethod__DtoAssignment_43462); 
             after(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSpecialMethodAccess().getDtoDtoReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialMethod__DtoAssignment_4


    // $ANTLR start rule__CrudService__DescriptionAssignment_0
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1743:1: rule__CrudService__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CrudService__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1747:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1748:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1748:1: ( RULE_STRING )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1749:1: RULE_STRING
            {
             before(grammarAccess.getCrudServiceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CrudService__DescriptionAssignment_03497); 
             after(grammarAccess.getCrudServiceAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CrudService__DescriptionAssignment_0


    // $ANTLR start rule__CrudService__DtoAssignment_2
    // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1758:1: rule__CrudService__DtoAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__CrudService__DtoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1762:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1763:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1763:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1764:1: ( RULE_ID )
            {
             before(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceCrossReference_2_0()); 
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1765:1: ( RULE_ID )
            // ../org.mod4j.dsl.service.xtext.ui/src-gen/org/mod4j/dsl/service/xtext/contentassist/antlr/internal/InternalService.g:1766:1: RULE_ID
            {
             before(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CrudService__DtoAssignment_23532); 
             after(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCrudServiceAccess().getDtoDtoReferenceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CrudService__DtoAssignment_2


 

    public static final BitSet FOLLOW_ruleServiceModel_in_entryRuleServiceModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceModel__Group__0_in_ruleServiceModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationMethod_in_entryRuleAssociationMethod120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationMethod127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group__0_in_ruleAssociationMethod154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoReference_in_entryRuleDtoReference180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoReference187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__0_in_ruleDtoReference214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethod247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Alternatives_in_ruleServiceMethod274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_entryRuleCustomMethod300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomMethod307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group__0_in_ruleCustomMethod334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_entryRuleSpecialMethod420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialMethod427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialMethod__Group__0_in_ruleSpecialMethod454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_entryRuleCrudService480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrudService487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__Group__0_in_ruleCrudService514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialMethodType__Alternatives_in_ruleSpecialMethodType551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethodType__Alternatives_in_ruleAssociationMethodType587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceModel__CrudServicesAssignment_5_0_in_rule__ServiceModel__Alternatives_5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceModel__MethodsAssignment_5_1_in_rule__ServiceModel__Alternatives_5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomMethod_in_rule__ServiceMethod__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethod_in_rule__ServiceMethod__Alternatives690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationMethod_in_rule__ServiceMethod__Alternatives707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SpecialMethodType__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SpecialMethodType__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SpecialMethodType__Alternatives782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialMethodType__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SpecialMethodType__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SpecialMethodType__Alternatives845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AssociationMethodType__Alternatives881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AssociationMethodType__Alternatives902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AssociationMethodType__Alternatives923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceModel__DescriptionAssignment_0_in_rule__ServiceModel__Group__0960 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ServiceModel__Group__1_in_rule__ServiceModel__Group__0970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ServiceModel__Group__1999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceModel__Group__2_in_rule__ServiceModel__Group__11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceModel__NameAssignment_2_in_rule__ServiceModel__Group__21037 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ServiceModel__Group__3_in_rule__ServiceModel__Group__21046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ServiceModel__Group__31075 = new BitSet(new long[]{0x00000000C281F812L});
    public static final BitSet FOLLOW_rule__ServiceModel__Group__4_in_rule__ServiceModel__Group__31085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceModel__DtoReferencesAssignment_4_in_rule__ServiceModel__Group__41113 = new BitSet(new long[]{0x00000000C281F812L});
    public static final BitSet FOLLOW_rule__ServiceModel__Group__5_in_rule__ServiceModel__Group__41123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceModel__Alternatives_5_in_rule__ServiceModel__Group__51151 = new BitSet(new long[]{0x00000000C201F812L});
    public static final BitSet FOLLOW_rule__AssociationMethod__DescriptionAssignment_0_in_rule__AssociationMethod__Group__01198 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group__1_in_rule__AssociationMethod__Group__01208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethod__NameAssignment_1_in_rule__AssociationMethod__Group__11236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group__2_in_rule__AssociationMethod__Group__11245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethod__MainAssignment_2_in_rule__AssociationMethod__Group__21273 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group__3_in_rule__AssociationMethod__Group__21282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AssociationMethod__Group__31311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group__4_in_rule__AssociationMethod__Group__31321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethod__RolenameAssignment_4_in_rule__AssociationMethod__Group__41349 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group__5_in_rule__AssociationMethod__Group__41358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethod__TypeAssignment_5_in_rule__AssociationMethod__Group__51386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group__6_in_rule__AssociationMethod__Group__51395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationMethod__PartAssignment_6_in_rule__AssociationMethod__Group__61423 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__AssociationMethod__Group__7_in_rule__AssociationMethod__Group__61432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AssociationMethod__Group__71461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DtoReference__Group__01513 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__1_in_rule__DtoReference__Group__01523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoReference__ModelnameAssignment_1_in_rule__DtoReference__Group__11551 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__2_in_rule__DtoReference__Group__11560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DtoReference__Group__21589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__3_in_rule__DtoReference__Group__21599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoReference__NameAssignment_3_in_rule__DtoReference__Group__31627 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DtoReference__Group__4_in_rule__DtoReference__Group__31636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DtoReference__Group__41665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__DescriptionAssignment_0_in_rule__CustomMethod__Group__01710 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group__1_in_rule__CustomMethod__Group__01720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CustomMethod__Group__11749 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group__2_in_rule__CustomMethod__Group__11759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__NameAssignment_2_in_rule__CustomMethod__Group__21787 = new BitSet(new long[]{0x0000000024200000L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group__3_in_rule__CustomMethod__Group__21796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_3__0_in_rule__CustomMethod__Group__31824 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group__4_in_rule__CustomMethod__Group__31834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_4__0_in_rule__CustomMethod__Group__41862 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group__5_in_rule__CustomMethod__Group__41872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CustomMethod__Group__51901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CustomMethod__Group_3__01949 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_3__1_in_rule__CustomMethod__Group_3__01959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CustomMethod__Group_3__11988 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_3__2_in_rule__CustomMethod__Group_3__11998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_3_2__0_in_rule__CustomMethod__Group_3__22026 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_3__3_in_rule__CustomMethod__Group_3__22036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CustomMethod__Group_3__32065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__InParametersAssignment_3_2_0_in_rule__CustomMethod__Group_3_2__02108 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_3_2__1_in_rule__CustomMethod__Group_3_2__02117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CustomMethod__Group_3_2__12146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CustomMethod__Group_4__02186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomMethod__Group_4__1_in_rule__CustomMethod__Group_4__02196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomMethod__OutputAssignment_4_1_in_rule__CustomMethod__Group_4__12224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__02262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialMethod__DescriptionAssignment_0_in_rule__SpecialMethod__Group__02337 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__SpecialMethod__Group__1_in_rule__SpecialMethod__Group__02347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialMethod__TypeAssignment_1_in_rule__SpecialMethod__Group__12375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecialMethod__Group__2_in_rule__SpecialMethod__Group__12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialMethod__NameAssignment_2_in_rule__SpecialMethod__Group__22412 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SpecialMethod__Group__3_in_rule__SpecialMethod__Group__22421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SpecialMethod__Group__32450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecialMethod__Group__4_in_rule__SpecialMethod__Group__32460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialMethod__DtoAssignment_4_in_rule__SpecialMethod__Group__42488 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SpecialMethod__Group__5_in_rule__SpecialMethod__Group__42497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SpecialMethod__Group__52526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__DescriptionAssignment_0_in_rule__CrudService__Group__02573 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CrudService__Group__1_in_rule__CrudService__Group__02583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CrudService__Group__12612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CrudService__Group__2_in_rule__CrudService__Group__12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__DtoAssignment_2_in_rule__CrudService__Group__22650 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CrudService__Group__3_in_rule__CrudService__Group__22659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CrudService__Group__32688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceModel__DescriptionAssignment_02731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceModel__NameAssignment_22762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoReference_in_rule__ServiceModel__DtoReferencesAssignment_42793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_rule__ServiceModel__CrudServicesAssignment_5_02824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_rule__ServiceModel__MethodsAssignment_5_12855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AssociationMethod__DescriptionAssignment_02886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AssociationMethod__NameAssignment_12922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationMethod__MainAssignment_22965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationMethod__RolenameAssignment_43000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationMethodType_in_rule__AssociationMethod__TypeAssignment_53031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationMethod__PartAssignment_63066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoReference__ModelnameAssignment_13101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoReference__NameAssignment_33132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomMethod__DescriptionAssignment_03163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomMethod__NameAssignment_23194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CustomMethod__InParametersAssignment_3_2_03225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomMethod__OutputAssignment_4_13260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__TypeAssignment_03299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_13334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialMethod__DescriptionAssignment_03365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialMethodType_in_rule__SpecialMethod__TypeAssignment_13396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialMethod__NameAssignment_23427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialMethod__DtoAssignment_43462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CrudService__DescriptionAssignment_03497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CrudService__DtoAssignment_23532 = new BitSet(new long[]{0x0000000000000002L});

}