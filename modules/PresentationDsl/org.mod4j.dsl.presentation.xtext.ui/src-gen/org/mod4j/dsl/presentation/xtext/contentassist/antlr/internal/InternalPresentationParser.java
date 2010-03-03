package org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal; 

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
import org.mod4j.dsl.presentation.xtext.services.PresentationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalPresentationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'false'", "';'", "'new'", "'save'", "'edit'", "'delete'", "'cancel'", "'removefrom'", "'addto'", "'all'", "'find'", "'application'", "'from'", "'process'", "'presentation'", "'['", "']'", "'import'", "'form'", "'context'", "'readonly'", "'actions'", "'processes'", "'label'", "'CompoundDialogue'", "'dialogues'", "'CollectionDialogue'", "'MasterDetail'", "'master'", "'detail'", "'element'", "':'", "'if'", "'('", "')'", "'call'", "'service'", "'.'", "'navigate'", "'list'", "'true'", "'composite'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalPresentationParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g"; }


     
     	private PresentationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PresentationGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRulePresentationModel
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:60:1: entryRulePresentationModel : rulePresentationModel EOF ;
    public final void entryRulePresentationModel() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:60:28: ( rulePresentationModel EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:61:1: rulePresentationModel EOF
            {
             before(grammarAccess.getPresentationModelRule()); 
            pushFollow(FOLLOW_rulePresentationModel_in_entryRulePresentationModel60);
            rulePresentationModel();
            _fsp--;

             after(grammarAccess.getPresentationModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentationModel67); 

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
    // $ANTLR end entryRulePresentationModel


    // $ANTLR start rulePresentationModel
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:68:1: rulePresentationModel : ( ( rule__PresentationModel__Alternatives ) ) ;
    public final void rulePresentationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:72:2: ( ( ( rule__PresentationModel__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:73:1: ( ( rule__PresentationModel__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:73:1: ( ( rule__PresentationModel__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:74:1: ( rule__PresentationModel__Alternatives )
            {
             before(grammarAccess.getPresentationModelAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:75:1: ( rule__PresentationModel__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:75:2: rule__PresentationModel__Alternatives
            {
            pushFollow(FOLLOW_rule__PresentationModel__Alternatives_in_rulePresentationModel94);
            rule__PresentationModel__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPresentationModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePresentationModel


    // $ANTLR start entryRuleApplicationModel
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:87:1: entryRuleApplicationModel : ruleApplicationModel EOF ;
    public final void entryRuleApplicationModel() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:87:27: ( ruleApplicationModel EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:88:1: ruleApplicationModel EOF
            {
             before(grammarAccess.getApplicationModelRule()); 
            pushFollow(FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel120);
            ruleApplicationModel();
            _fsp--;

             after(grammarAccess.getApplicationModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationModel127); 

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
    // $ANTLR end entryRuleApplicationModel


    // $ANTLR start ruleApplicationModel
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:95:1: ruleApplicationModel : ( ( rule__ApplicationModel__Group__0 ) ) ;
    public final void ruleApplicationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:99:2: ( ( ( rule__ApplicationModel__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:100:1: ( ( rule__ApplicationModel__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:100:1: ( ( rule__ApplicationModel__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:101:1: ( rule__ApplicationModel__Group__0 )
            {
             before(grammarAccess.getApplicationModelAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:102:1: ( rule__ApplicationModel__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:102:2: rule__ApplicationModel__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__0_in_ruleApplicationModel154);
            rule__ApplicationModel__Group__0();
            _fsp--;


            }

             after(grammarAccess.getApplicationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleApplicationModel


    // $ANTLR start entryRuleProcessReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:114:1: entryRuleProcessReference : ruleProcessReference EOF ;
    public final void entryRuleProcessReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:114:27: ( ruleProcessReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:115:1: ruleProcessReference EOF
            {
             before(grammarAccess.getProcessReferenceRule()); 
            pushFollow(FOLLOW_ruleProcessReference_in_entryRuleProcessReference180);
            ruleProcessReference();
            _fsp--;

             after(grammarAccess.getProcessReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessReference187); 

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
    // $ANTLR end entryRuleProcessReference


    // $ANTLR start ruleProcessReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:122:1: ruleProcessReference : ( ( rule__ProcessReference__Group__0 ) ) ;
    public final void ruleProcessReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:126:2: ( ( ( rule__ProcessReference__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:127:1: ( ( rule__ProcessReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:127:1: ( ( rule__ProcessReference__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:128:1: ( rule__ProcessReference__Group__0 )
            {
             before(grammarAccess.getProcessReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:129:1: ( rule__ProcessReference__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:129:2: rule__ProcessReference__Group__0
            {
            pushFollow(FOLLOW_rule__ProcessReference__Group__0_in_ruleProcessReference214);
            rule__ProcessReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProcessReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProcessReference


    // $ANTLR start entryRuleFormsAndProcesses
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:141:1: entryRuleFormsAndProcesses : ruleFormsAndProcesses EOF ;
    public final void entryRuleFormsAndProcesses() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:141:28: ( ruleFormsAndProcesses EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:142:1: ruleFormsAndProcesses EOF
            {
             before(grammarAccess.getFormsAndProcessesRule()); 
            pushFollow(FOLLOW_ruleFormsAndProcesses_in_entryRuleFormsAndProcesses240);
            ruleFormsAndProcesses();
            _fsp--;

             after(grammarAccess.getFormsAndProcessesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormsAndProcesses247); 

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
    // $ANTLR end entryRuleFormsAndProcesses


    // $ANTLR start ruleFormsAndProcesses
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:149:1: ruleFormsAndProcesses : ( ( rule__FormsAndProcesses__Group__0 ) ) ;
    public final void ruleFormsAndProcesses() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:153:2: ( ( ( rule__FormsAndProcesses__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:154:1: ( ( rule__FormsAndProcesses__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:154:1: ( ( rule__FormsAndProcesses__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:155:1: ( rule__FormsAndProcesses__Group__0 )
            {
             before(grammarAccess.getFormsAndProcessesAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:156:1: ( rule__FormsAndProcesses__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:156:2: rule__FormsAndProcesses__Group__0
            {
            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__0_in_ruleFormsAndProcesses274);
            rule__FormsAndProcesses__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFormsAndProcessesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFormsAndProcesses


    // $ANTLR start entryRuleApplication
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:168:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:168:22: ( ruleApplication EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:169:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication300);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication307); 

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
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:176:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:180:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:181:1: ( ( rule__Application__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:181:1: ( ( rule__Application__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:182:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:183:1: ( rule__Application__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:183:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication334);
            rule__Application__Group__0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleExternalReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:195:1: entryRuleExternalReference : ruleExternalReference EOF ;
    public final void entryRuleExternalReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:195:28: ( ruleExternalReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:196:1: ruleExternalReference EOF
            {
             before(grammarAccess.getExternalReferenceRule()); 
            pushFollow(FOLLOW_ruleExternalReference_in_entryRuleExternalReference360);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getExternalReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalReference367); 

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
    // $ANTLR end entryRuleExternalReference


    // $ANTLR start ruleExternalReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:203:1: ruleExternalReference : ( ( rule__ExternalReference__Group__0 ) ) ;
    public final void ruleExternalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:207:2: ( ( ( rule__ExternalReference__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:208:1: ( ( rule__ExternalReference__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:208:1: ( ( rule__ExternalReference__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:209:1: ( rule__ExternalReference__Group__0 )
            {
             before(grammarAccess.getExternalReferenceAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:210:1: ( rule__ExternalReference__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:210:2: rule__ExternalReference__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference394);
            rule__ExternalReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExternalReference


    // $ANTLR start entryRuleModelElementWithContext
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:222:1: entryRuleModelElementWithContext : ruleModelElementWithContext EOF ;
    public final void entryRuleModelElementWithContext() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:222:34: ( ruleModelElementWithContext EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:223:1: ruleModelElementWithContext EOF
            {
             before(grammarAccess.getModelElementWithContextRule()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext420);
            ruleModelElementWithContext();
            _fsp--;

             after(grammarAccess.getModelElementWithContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElementWithContext427); 

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
    // $ANTLR end entryRuleModelElementWithContext


    // $ANTLR start ruleModelElementWithContext
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:230:1: ruleModelElementWithContext : ( ruleUIModelElement ) ;
    public final void ruleModelElementWithContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:234:2: ( ( ruleUIModelElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:235:1: ( ruleUIModelElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:235:1: ( ruleUIModelElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:236:1: ruleUIModelElement
            {
             before(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall()); 
            pushFollow(FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext454);
            ruleUIModelElement();
            _fsp--;

             after(grammarAccess.getModelElementWithContextAccess().getUIModelElementParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModelElementWithContext


    // $ANTLR start entryRuleUIModelElement
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:249:1: entryRuleUIModelElement : ruleUIModelElement EOF ;
    public final void entryRuleUIModelElement() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:249:25: ( ruleUIModelElement EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:250:1: ruleUIModelElement EOF
            {
             before(grammarAccess.getUIModelElementRule()); 
            pushFollow(FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement479);
            ruleUIModelElement();
            _fsp--;

             after(grammarAccess.getUIModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIModelElement486); 

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
    // $ANTLR end entryRuleUIModelElement


    // $ANTLR start ruleUIModelElement
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:257:1: ruleUIModelElement : ( ( rule__UIModelElement__Alternatives ) ) ;
    public final void ruleUIModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:261:2: ( ( ( rule__UIModelElement__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:262:1: ( ( rule__UIModelElement__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:262:1: ( ( rule__UIModelElement__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:263:1: ( rule__UIModelElement__Alternatives )
            {
             before(grammarAccess.getUIModelElementAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:264:1: ( rule__UIModelElement__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:264:2: rule__UIModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__UIModelElement__Alternatives_in_ruleUIModelElement513);
            rule__UIModelElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getUIModelElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUIModelElement


    // $ANTLR start entryRuleDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:276:1: entryRuleDialogue : ruleDialogue EOF ;
    public final void entryRuleDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:276:19: ( ruleDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:277:1: ruleDialogue EOF
            {
             before(grammarAccess.getDialogueRule()); 
            pushFollow(FOLLOW_ruleDialogue_in_entryRuleDialogue539);
            ruleDialogue();
            _fsp--;

             after(grammarAccess.getDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogue546); 

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
    // $ANTLR end entryRuleDialogue


    // $ANTLR start ruleDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:284:1: ruleDialogue : ( ( rule__Dialogue__Alternatives ) ) ;
    public final void ruleDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:288:2: ( ( ( rule__Dialogue__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:289:1: ( ( rule__Dialogue__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:289:1: ( ( rule__Dialogue__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:290:1: ( rule__Dialogue__Alternatives )
            {
             before(grammarAccess.getDialogueAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:291:1: ( rule__Dialogue__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:291:2: rule__Dialogue__Alternatives
            {
            pushFollow(FOLLOW_rule__Dialogue__Alternatives_in_ruleDialogue573);
            rule__Dialogue__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDialogueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDialogue


    // $ANTLR start entryRuleContentForm
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:303:1: entryRuleContentForm : ruleContentForm EOF ;
    public final void entryRuleContentForm() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:303:22: ( ruleContentForm EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:304:1: ruleContentForm EOF
            {
             before(grammarAccess.getContentFormRule()); 
            pushFollow(FOLLOW_ruleContentForm_in_entryRuleContentForm599);
            ruleContentForm();
            _fsp--;

             after(grammarAccess.getContentFormRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentForm606); 

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
    // $ANTLR end entryRuleContentForm


    // $ANTLR start ruleContentForm
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:311:1: ruleContentForm : ( ( rule__ContentForm__Group__0 ) ) ;
    public final void ruleContentForm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:315:2: ( ( ( rule__ContentForm__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:316:1: ( ( rule__ContentForm__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:316:1: ( ( rule__ContentForm__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:317:1: ( rule__ContentForm__Group__0 )
            {
             before(grammarAccess.getContentFormAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:318:1: ( rule__ContentForm__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:318:2: rule__ContentForm__Group__0
            {
            pushFollow(FOLLOW_rule__ContentForm__Group__0_in_ruleContentForm633);
            rule__ContentForm__Group__0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContentForm


    // $ANTLR start entryRuleAction
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:330:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:330:17: ( ruleAction EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:331:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction659);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction666); 

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
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:338:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:342:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:343:1: ( ( rule__Action__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:343:1: ( ( rule__Action__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:344:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:345:1: ( rule__Action__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:345:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction693);
            rule__Action__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleCompoundDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:357:1: entryRuleCompoundDialogue : ruleCompoundDialogue EOF ;
    public final void entryRuleCompoundDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:357:27: ( ruleCompoundDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:358:1: ruleCompoundDialogue EOF
            {
             before(grammarAccess.getCompoundDialogueRule()); 
            pushFollow(FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue719);
            ruleCompoundDialogue();
            _fsp--;

             after(grammarAccess.getCompoundDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundDialogue726); 

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
    // $ANTLR end entryRuleCompoundDialogue


    // $ANTLR start ruleCompoundDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:365:1: ruleCompoundDialogue : ( ( rule__CompoundDialogue__Alternatives ) ) ;
    public final void ruleCompoundDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:369:2: ( ( ( rule__CompoundDialogue__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:370:1: ( ( rule__CompoundDialogue__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:370:1: ( ( rule__CompoundDialogue__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:371:1: ( rule__CompoundDialogue__Alternatives )
            {
             before(grammarAccess.getCompoundDialogueAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:372:1: ( rule__CompoundDialogue__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:372:2: rule__CompoundDialogue__Alternatives
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__Alternatives_in_ruleCompoundDialogue753);
            rule__CompoundDialogue__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompoundDialogue


    // $ANTLR start entryRuleCollectionDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:384:1: entryRuleCollectionDialogue : ruleCollectionDialogue EOF ;
    public final void entryRuleCollectionDialogue() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:384:29: ( ruleCollectionDialogue EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:385:1: ruleCollectionDialogue EOF
            {
             before(grammarAccess.getCollectionDialogueRule()); 
            pushFollow(FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue779);
            ruleCollectionDialogue();
            _fsp--;

             after(grammarAccess.getCollectionDialogueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionDialogue786); 

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
    // $ANTLR end entryRuleCollectionDialogue


    // $ANTLR start ruleCollectionDialogue
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:392:1: ruleCollectionDialogue : ( ( rule__CollectionDialogue__Group__0 ) ) ;
    public final void ruleCollectionDialogue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:396:2: ( ( ( rule__CollectionDialogue__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:397:1: ( ( rule__CollectionDialogue__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:397:1: ( ( rule__CollectionDialogue__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:398:1: ( rule__CollectionDialogue__Group__0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:399:1: ( rule__CollectionDialogue__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:399:2: rule__CollectionDialogue__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__Group__0_in_ruleCollectionDialogue813);
            rule__CollectionDialogue__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionDialogue


    // $ANTLR start entryRuleMasterDetail
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:411:1: entryRuleMasterDetail : ruleMasterDetail EOF ;
    public final void entryRuleMasterDetail() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:411:23: ( ruleMasterDetail EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:412:1: ruleMasterDetail EOF
            {
             before(grammarAccess.getMasterDetailRule()); 
            pushFollow(FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail839);
            ruleMasterDetail();
            _fsp--;

             after(grammarAccess.getMasterDetailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterDetail846); 

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
    // $ANTLR end entryRuleMasterDetail


    // $ANTLR start ruleMasterDetail
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:419:1: ruleMasterDetail : ( ( rule__MasterDetail__Group__0 ) ) ;
    public final void ruleMasterDetail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:423:2: ( ( ( rule__MasterDetail__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:424:1: ( ( rule__MasterDetail__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:424:1: ( ( rule__MasterDetail__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:425:1: ( rule__MasterDetail__Group__0 )
            {
             before(grammarAccess.getMasterDetailAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:426:1: ( rule__MasterDetail__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:426:2: rule__MasterDetail__Group__0
            {
            pushFollow(FOLLOW_rule__MasterDetail__Group__0_in_ruleMasterDetail873);
            rule__MasterDetail__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMasterDetail


    // $ANTLR start entryRuleProcess
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:438:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:438:18: ( ruleProcess EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:439:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess899);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess906); 

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
    // $ANTLR end entryRuleProcess


    // $ANTLR start ruleProcess
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:446:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:450:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:451:1: ( ( rule__Process__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:451:1: ( ( rule__Process__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:452:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:453:1: ( rule__Process__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:453:2: rule__Process__Group__0
            {
            pushFollow(FOLLOW_rule__Process__Group__0_in_ruleProcess933);
            rule__Process__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleFormElement
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:465:1: entryRuleFormElement : ruleFormElement EOF ;
    public final void entryRuleFormElement() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:465:22: ( ruleFormElement EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:466:1: ruleFormElement EOF
            {
             before(grammarAccess.getFormElementRule()); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement959);
            ruleFormElement();
            _fsp--;

             after(grammarAccess.getFormElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement966); 

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
    // $ANTLR end entryRuleFormElement


    // $ANTLR start ruleFormElement
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:473:1: ruleFormElement : ( ( rule__FormElement__Group__0 ) ) ;
    public final void ruleFormElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:477:2: ( ( ( rule__FormElement__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:478:1: ( ( rule__FormElement__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:478:1: ( ( rule__FormElement__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:479:1: ( rule__FormElement__Group__0 )
            {
             before(grammarAccess.getFormElementAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:480:1: ( rule__FormElement__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:480:2: rule__FormElement__Group__0
            {
            pushFollow(FOLLOW_rule__FormElement__Group__0_in_ruleFormElement993);
            rule__FormElement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFormElement


    // $ANTLR start entryRuleActionDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:492:1: entryRuleActionDialogueCall : ruleActionDialogueCall EOF ;
    public final void entryRuleActionDialogueCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:492:29: ( ruleActionDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:493:1: ruleActionDialogueCall EOF
            {
             before(grammarAccess.getActionDialogueCallRule()); 
            pushFollow(FOLLOW_ruleActionDialogueCall_in_entryRuleActionDialogueCall1019);
            ruleActionDialogueCall();
            _fsp--;

             after(grammarAccess.getActionDialogueCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDialogueCall1026); 

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
    // $ANTLR end entryRuleActionDialogueCall


    // $ANTLR start ruleActionDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:500:1: ruleActionDialogueCall : ( ( rule__ActionDialogueCall__Group__0 ) ) ;
    public final void ruleActionDialogueCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:504:2: ( ( ( rule__ActionDialogueCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:505:1: ( ( rule__ActionDialogueCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:505:1: ( ( rule__ActionDialogueCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:506:1: ( rule__ActionDialogueCall__Group__0 )
            {
             before(grammarAccess.getActionDialogueCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:507:1: ( rule__ActionDialogueCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:507:2: rule__ActionDialogueCall__Group__0
            {
            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__0_in_ruleActionDialogueCall1053);
            rule__ActionDialogueCall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActionDialogueCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleActionDialogueCall


    // $ANTLR start entryRuleDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:519:1: entryRuleDialogueCall : ruleDialogueCall EOF ;
    public final void entryRuleDialogueCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:519:23: ( ruleDialogueCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:520:1: ruleDialogueCall EOF
            {
             before(grammarAccess.getDialogueCallRule()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall1079);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getDialogueCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogueCall1086); 

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
    // $ANTLR end entryRuleDialogueCall


    // $ANTLR start ruleDialogueCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:527:1: ruleDialogueCall : ( ( rule__DialogueCall__Group__0 ) ) ;
    public final void ruleDialogueCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:531:2: ( ( ( rule__DialogueCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:532:1: ( ( rule__DialogueCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:532:1: ( ( rule__DialogueCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:533:1: ( rule__DialogueCall__Group__0 )
            {
             before(grammarAccess.getDialogueCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:534:1: ( rule__DialogueCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:534:2: rule__DialogueCall__Group__0
            {
            pushFollow(FOLLOW_rule__DialogueCall__Group__0_in_ruleDialogueCall1113);
            rule__DialogueCall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDialogueCall


    // $ANTLR start entryRuleExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:546:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:546:21: ( ruleExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:547:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1139);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1146); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:554:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:558:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:559:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:559:1: ( ( rule__Expression__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:560:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:561:1: ( rule__Expression__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:561:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression1173);
            rule__Expression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:573:1: entryRuleProcessCall : ruleProcessCall EOF ;
    public final void entryRuleProcessCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:573:22: ( ruleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:574:1: ruleProcessCall EOF
            {
             before(grammarAccess.getProcessCallRule()); 
            pushFollow(FOLLOW_ruleProcessCall_in_entryRuleProcessCall1199);
            ruleProcessCall();
            _fsp--;

             after(grammarAccess.getProcessCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessCall1206); 

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
    // $ANTLR end entryRuleProcessCall


    // $ANTLR start ruleProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:581:1: ruleProcessCall : ( ( rule__ProcessCall__Group__0 ) ) ;
    public final void ruleProcessCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:585:2: ( ( ( rule__ProcessCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:586:1: ( ( rule__ProcessCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:586:1: ( ( rule__ProcessCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:587:1: ( rule__ProcessCall__Group__0 )
            {
             before(grammarAccess.getProcessCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:588:1: ( rule__ProcessCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:588:2: rule__ProcessCall__Group__0
            {
            pushFollow(FOLLOW_rule__ProcessCall__Group__0_in_ruleProcessCall1233);
            rule__ProcessCall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProcessCall


    // $ANTLR start entryRuleOperationExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:600:1: entryRuleOperationExpression : ruleOperationExpression EOF ;
    public final void entryRuleOperationExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:600:30: ( ruleOperationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:601:1: ruleOperationExpression EOF
            {
             before(grammarAccess.getOperationExpressionRule()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression1259);
            ruleOperationExpression();
            _fsp--;

             after(grammarAccess.getOperationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationExpression1266); 

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
    // $ANTLR end entryRuleOperationExpression


    // $ANTLR start ruleOperationExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:608:1: ruleOperationExpression : ( ( rule__OperationExpression__Group__0 ) ) ;
    public final void ruleOperationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:612:2: ( ( ( rule__OperationExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:613:1: ( ( rule__OperationExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:613:1: ( ( rule__OperationExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:614:1: ( rule__OperationExpression__Group__0 )
            {
             before(grammarAccess.getOperationExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:615:1: ( rule__OperationExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:615:2: rule__OperationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OperationExpression__Group__0_in_ruleOperationExpression1293);
            rule__OperationExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOperationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOperationExpression


    // $ANTLR start entryRuleSimpleProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:627:1: entryRuleSimpleProcessCall : ruleSimpleProcessCall EOF ;
    public final void entryRuleSimpleProcessCall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:627:28: ( ruleSimpleProcessCall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:628:1: ruleSimpleProcessCall EOF
            {
             before(grammarAccess.getSimpleProcessCallRule()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_entryRuleSimpleProcessCall1319);
            ruleSimpleProcessCall();
            _fsp--;

             after(grammarAccess.getSimpleProcessCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleProcessCall1326); 

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
    // $ANTLR end entryRuleSimpleProcessCall


    // $ANTLR start ruleSimpleProcessCall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:635:1: ruleSimpleProcessCall : ( ( rule__SimpleProcessCall__Group__0 ) ) ;
    public final void ruleSimpleProcessCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:639:2: ( ( ( rule__SimpleProcessCall__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:640:1: ( ( rule__SimpleProcessCall__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:640:1: ( ( rule__SimpleProcessCall__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:641:1: ( rule__SimpleProcessCall__Group__0 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:642:1: ( rule__SimpleProcessCall__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:642:2: rule__SimpleProcessCall__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__Group__0_in_ruleSimpleProcessCall1353);
            rule__SimpleProcessCall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleProcessCall


    // $ANTLR start entryRuleStandardExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:654:1: entryRuleStandardExpression : ruleStandardExpression EOF ;
    public final void entryRuleStandardExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:654:29: ( ruleStandardExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:655:1: ruleStandardExpression EOF
            {
             before(grammarAccess.getStandardExpressionRule()); 
            pushFollow(FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression1379);
            ruleStandardExpression();
            _fsp--;

             after(grammarAccess.getStandardExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardExpression1386); 

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
    // $ANTLR end entryRuleStandardExpression


    // $ANTLR start ruleStandardExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:662:1: ruleStandardExpression : ( ( rule__StandardExpression__TypeAssignment ) ) ;
    public final void ruleStandardExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:666:2: ( ( ( rule__StandardExpression__TypeAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:667:1: ( ( rule__StandardExpression__TypeAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:667:1: ( ( rule__StandardExpression__TypeAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:668:1: ( rule__StandardExpression__TypeAssignment )
            {
             before(grammarAccess.getStandardExpressionAccess().getTypeAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:669:1: ( rule__StandardExpression__TypeAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:669:2: rule__StandardExpression__TypeAssignment
            {
            pushFollow(FOLLOW_rule__StandardExpression__TypeAssignment_in_ruleStandardExpression1413);
            rule__StandardExpression__TypeAssignment();
            _fsp--;


            }

             after(grammarAccess.getStandardExpressionAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStandardExpression


    // $ANTLR start entryRuleServiceExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:681:1: entryRuleServiceExpression : ruleServiceExpression EOF ;
    public final void entryRuleServiceExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:681:28: ( ruleServiceExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:682:1: ruleServiceExpression EOF
            {
             before(grammarAccess.getServiceExpressionRule()); 
            pushFollow(FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression1439);
            ruleServiceExpression();
            _fsp--;

             after(grammarAccess.getServiceExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceExpression1446); 

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
    // $ANTLR end entryRuleServiceExpression


    // $ANTLR start ruleServiceExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:689:1: ruleServiceExpression : ( ( rule__ServiceExpression__Group__0 ) ) ;
    public final void ruleServiceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:693:2: ( ( ( rule__ServiceExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:694:1: ( ( rule__ServiceExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:694:1: ( ( rule__ServiceExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:695:1: ( rule__ServiceExpression__Group__0 )
            {
             before(grammarAccess.getServiceExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:696:1: ( rule__ServiceExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:696:2: rule__ServiceExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceExpression__Group__0_in_ruleServiceExpression1473);
            rule__ServiceExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getServiceExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleServiceExpression


    // $ANTLR start entryRuleNavigationExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:708:1: entryRuleNavigationExpression : ruleNavigationExpression EOF ;
    public final void entryRuleNavigationExpression() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:708:31: ( ruleNavigationExpression EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:709:1: ruleNavigationExpression EOF
            {
             before(grammarAccess.getNavigationExpressionRule()); 
            pushFollow(FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression1499);
            ruleNavigationExpression();
            _fsp--;

             after(grammarAccess.getNavigationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationExpression1506); 

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
    // $ANTLR end entryRuleNavigationExpression


    // $ANTLR start ruleNavigationExpression
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:716:1: ruleNavigationExpression : ( ( rule__NavigationExpression__Group__0 ) ) ;
    public final void ruleNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:720:2: ( ( ( rule__NavigationExpression__Group__0 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:721:1: ( ( rule__NavigationExpression__Group__0 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:721:1: ( ( rule__NavigationExpression__Group__0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:722:1: ( rule__NavigationExpression__Group__0 )
            {
             before(grammarAccess.getNavigationExpressionAccess().getGroup()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:723:1: ( rule__NavigationExpression__Group__0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:723:2: rule__NavigationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NavigationExpression__Group__0_in_ruleNavigationExpression1533);
            rule__NavigationExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNavigationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNavigationExpression


    // $ANTLR start entryRuleDtoPropertyReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:735:1: entryRuleDtoPropertyReference : ruleDtoPropertyReference EOF ;
    public final void entryRuleDtoPropertyReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:735:31: ( ruleDtoPropertyReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:736:1: ruleDtoPropertyReference EOF
            {
             before(grammarAccess.getDtoPropertyReferenceRule()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference1559);
            ruleDtoPropertyReference();
            _fsp--;

             after(grammarAccess.getDtoPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDtoPropertyReference1566); 

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
    // $ANTLR end entryRuleDtoPropertyReference


    // $ANTLR start ruleDtoPropertyReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:743:1: ruleDtoPropertyReference : ( ( rule__DtoPropertyReference__NameAssignment ) ) ;
    public final void ruleDtoPropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:747:2: ( ( ( rule__DtoPropertyReference__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:748:1: ( ( rule__DtoPropertyReference__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:748:1: ( ( rule__DtoPropertyReference__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:749:1: ( rule__DtoPropertyReference__NameAssignment )
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:750:1: ( rule__DtoPropertyReference__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:750:2: rule__DtoPropertyReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__DtoPropertyReference__NameAssignment_in_ruleDtoPropertyReference1593);
            rule__DtoPropertyReference__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getDtoPropertyReferenceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDtoPropertyReference


    // $ANTLR start entryRuleAssociationRoleReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:762:1: entryRuleAssociationRoleReference : ruleAssociationRoleReference EOF ;
    public final void entryRuleAssociationRoleReference() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:762:35: ( ruleAssociationRoleReference EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:763:1: ruleAssociationRoleReference EOF
            {
             before(grammarAccess.getAssociationRoleReferenceRule()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference1619);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getAssociationRoleReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationRoleReference1626); 

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
    // $ANTLR end entryRuleAssociationRoleReference


    // $ANTLR start ruleAssociationRoleReference
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:770:1: ruleAssociationRoleReference : ( ( rule__AssociationRoleReference__NameAssignment ) ) ;
    public final void ruleAssociationRoleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:774:2: ( ( ( rule__AssociationRoleReference__NameAssignment ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:775:1: ( ( rule__AssociationRoleReference__NameAssignment ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:775:1: ( ( rule__AssociationRoleReference__NameAssignment ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:776:1: ( rule__AssociationRoleReference__NameAssignment )
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameAssignment()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:777:1: ( rule__AssociationRoleReference__NameAssignment )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:777:2: rule__AssociationRoleReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__AssociationRoleReference__NameAssignment_in_ruleAssociationRoleReference1653);
            rule__AssociationRoleReference__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getAssociationRoleReferenceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssociationRoleReference


    // $ANTLR start entryRuleUICall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:789:1: entryRuleUICall : ruleUICall EOF ;
    public final void entryRuleUICall() throws RecognitionException {
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:789:17: ( ruleUICall EOF )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:790:1: ruleUICall EOF
            {
             before(grammarAccess.getUICallRule()); 
            pushFollow(FOLLOW_ruleUICall_in_entryRuleUICall1679);
            ruleUICall();
            _fsp--;

             after(grammarAccess.getUICallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUICall1686); 

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
    // $ANTLR end entryRuleUICall


    // $ANTLR start ruleUICall
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:797:1: ruleUICall : ( ( rule__UICall__Alternatives ) ) ;
    public final void ruleUICall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:801:2: ( ( ( rule__UICall__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:802:1: ( ( rule__UICall__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:802:1: ( ( rule__UICall__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:803:1: ( rule__UICall__Alternatives )
            {
             before(grammarAccess.getUICallAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:804:1: ( rule__UICall__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:804:2: rule__UICall__Alternatives
            {
            pushFollow(FOLLOW_rule__UICall__Alternatives_in_ruleUICall1713);
            rule__UICall__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getUICallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUICall


    // $ANTLR start ruleProcessType
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:817:1: ruleProcessType : ( ( rule__ProcessType__Alternatives ) ) ;
    public final void ruleProcessType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:821:1: ( ( ( rule__ProcessType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:822:1: ( ( rule__ProcessType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:822:1: ( ( rule__ProcessType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:823:1: ( rule__ProcessType__Alternatives )
            {
             before(grammarAccess.getProcessTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:824:1: ( rule__ProcessType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:824:2: rule__ProcessType__Alternatives
            {
            pushFollow(FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1750);
            rule__ProcessType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getProcessTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProcessType


    // $ANTLR start ruleProcessTypeLink
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:836:1: ruleProcessTypeLink : ( ( 'link' ) ) ;
    public final void ruleProcessTypeLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:840:1: ( ( ( 'link' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:841:1: ( ( 'link' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:841:1: ( ( 'link' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:842:1: ( 'link' )
            {
             before(grammarAccess.getProcessTypeLinkAccess().getLINKEnumLiteralDeclaration()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:843:1: ( 'link' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:843:3: 'link'
            {
            match(input,11,FOLLOW_11_in_ruleProcessTypeLink1787); 

            }

             after(grammarAccess.getProcessTypeLinkAccess().getLINKEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProcessTypeLink


    // $ANTLR start ruleExpressionType
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:856:1: ruleExpressionType : ( ( rule__ExpressionType__Alternatives ) ) ;
    public final void ruleExpressionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:860:1: ( ( ( rule__ExpressionType__Alternatives ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:861:1: ( ( rule__ExpressionType__Alternatives ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:861:1: ( ( rule__ExpressionType__Alternatives ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:862:1: ( rule__ExpressionType__Alternatives )
            {
             before(grammarAccess.getExpressionTypeAccess().getAlternatives()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:863:1: ( rule__ExpressionType__Alternatives )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:863:2: rule__ExpressionType__Alternatives
            {
            pushFollow(FOLLOW_rule__ExpressionType__Alternatives_in_ruleExpressionType1825);
            rule__ExpressionType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExpressionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpressionType


    // $ANTLR start rule__PresentationModel__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:874:1: rule__PresentationModel__Alternatives : ( ( ruleApplicationModel ) | ( ruleFormsAndProcesses ) );
    public final void rule__PresentationModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:878:1: ( ( ruleApplicationModel ) | ( ruleFormsAndProcesses ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==26) ) {
                    alt1=2;
                }
                else if ( (LA1_1==23) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("874:1: rule__PresentationModel__Alternatives : ( ( ruleApplicationModel ) | ( ruleFormsAndProcesses ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("874:1: rule__PresentationModel__Alternatives : ( ( ruleApplicationModel ) | ( ruleFormsAndProcesses ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:879:1: ( ruleApplicationModel )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:879:1: ( ruleApplicationModel )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:880:1: ruleApplicationModel
                    {
                     before(grammarAccess.getPresentationModelAccess().getApplicationModelParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleApplicationModel_in_rule__PresentationModel__Alternatives1860);
                    ruleApplicationModel();
                    _fsp--;

                     after(grammarAccess.getPresentationModelAccess().getApplicationModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:885:6: ( ruleFormsAndProcesses )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:885:6: ( ruleFormsAndProcesses )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:886:1: ruleFormsAndProcesses
                    {
                     before(grammarAccess.getPresentationModelAccess().getFormsAndProcessesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFormsAndProcesses_in_rule__PresentationModel__Alternatives1877);
                    ruleFormsAndProcesses();
                    _fsp--;

                     after(grammarAccess.getPresentationModelAccess().getFormsAndProcessesParserRuleCall_1()); 

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
    // $ANTLR end rule__PresentationModel__Alternatives


    // $ANTLR start rule__UIModelElement__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:896:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );
    public final void rule__UIModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:900:1: ( ( ruleDialogue ) | ( ruleProcess ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==25) ) {
                    alt2=2;
                }
                else if ( (LA2_1==30||LA2_1==36||(LA2_1>=38 && LA2_1<=39)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("896:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 30:
            case 36:
            case 38:
            case 39:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("896:1: rule__UIModelElement__Alternatives : ( ( ruleDialogue ) | ( ruleProcess ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:901:1: ( ruleDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:901:1: ( ruleDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:902:1: ruleDialogue
                    {
                     before(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDialogue_in_rule__UIModelElement__Alternatives1909);
                    ruleDialogue();
                    _fsp--;

                     after(grammarAccess.getUIModelElementAccess().getDialogueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:907:6: ( ruleProcess )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:907:6: ( ruleProcess )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:908:1: ruleProcess
                    {
                     before(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcess_in_rule__UIModelElement__Alternatives1926);
                    ruleProcess();
                    _fsp--;

                     after(grammarAccess.getUIModelElementAccess().getProcessParserRuleCall_1()); 

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
    // $ANTLR end rule__UIModelElement__Alternatives


    // $ANTLR start rule__Dialogue__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:918:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );
    public final void rule__Dialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:922:1: ( ( ruleContentForm ) | ( ruleCompoundDialogue ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==36||(LA3_1>=38 && LA3_1<=39)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==30) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("918:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt3=1;
                }
                break;
            case 36:
            case 38:
            case 39:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("918:1: rule__Dialogue__Alternatives : ( ( ruleContentForm ) | ( ruleCompoundDialogue ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:923:1: ( ruleContentForm )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:923:1: ( ruleContentForm )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:924:1: ruleContentForm
                    {
                     before(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleContentForm_in_rule__Dialogue__Alternatives1958);
                    ruleContentForm();
                    _fsp--;

                     after(grammarAccess.getDialogueAccess().getContentFormParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:929:6: ( ruleCompoundDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:929:6: ( ruleCompoundDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:930:1: ruleCompoundDialogue
                    {
                     before(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompoundDialogue_in_rule__Dialogue__Alternatives1975);
                    ruleCompoundDialogue();
                    _fsp--;

                     after(grammarAccess.getDialogueAccess().getCompoundDialogueParserRuleCall_1()); 

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
    // $ANTLR end rule__Dialogue__Alternatives


    // $ANTLR start rule__ContentForm__Alternatives_7_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:940:1: rule__ContentForm__Alternatives_7_1 : ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) );
    public final void rule__ContentForm__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:944:1: ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("940:1: rule__ContentForm__Alternatives_7_1 : ( ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) ) | ( 'false' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:945:1: ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:945:1: ( ( rule__ContentForm__ReadonlyAssignment_7_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:946:1: ( rule__ContentForm__ReadonlyAssignment_7_1_0 )
                    {
                     before(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:947:1: ( rule__ContentForm__ReadonlyAssignment_7_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:947:2: rule__ContentForm__ReadonlyAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__ReadonlyAssignment_7_1_0_in_rule__ContentForm__Alternatives_7_12007);
                    rule__ContentForm__ReadonlyAssignment_7_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:951:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:951:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:952:1: 'false'
                    {
                     before(grammarAccess.getContentFormAccess().getFalseKeyword_7_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__ContentForm__Alternatives_7_12026); 
                     after(grammarAccess.getContentFormAccess().getFalseKeyword_7_1_1()); 

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
    // $ANTLR end rule__ContentForm__Alternatives_7_1


    // $ANTLR start rule__CompoundDialogue__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:964:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );
    public final void rule__CompoundDialogue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:968:1: ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt5=3;
                    }
                    break;
                case 38:
                    {
                    alt5=2;
                    }
                    break;
                case 36:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("964:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 36:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 39:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("964:1: rule__CompoundDialogue__Alternatives : ( ( ( rule__CompoundDialogue__Group_0__0 ) ) | ( ruleCollectionDialogue ) | ( ruleMasterDetail ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:969:1: ( ( rule__CompoundDialogue__Group_0__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:969:1: ( ( rule__CompoundDialogue__Group_0__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:970:1: ( rule__CompoundDialogue__Group_0__0 )
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getGroup_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:971:1: ( rule__CompoundDialogue__Group_0__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:971:2: rule__CompoundDialogue__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__0_in_rule__CompoundDialogue__Alternatives2060);
                    rule__CompoundDialogue__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundDialogueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:975:6: ( ruleCollectionDialogue )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:975:6: ( ruleCollectionDialogue )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:976:1: ruleCollectionDialogue
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionDialogue_in_rule__CompoundDialogue__Alternatives2078);
                    ruleCollectionDialogue();
                    _fsp--;

                     after(grammarAccess.getCompoundDialogueAccess().getCollectionDialogueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:981:6: ( ruleMasterDetail )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:981:6: ( ruleMasterDetail )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:982:1: ruleMasterDetail
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMasterDetail_in_rule__CompoundDialogue__Alternatives2095);
                    ruleMasterDetail();
                    _fsp--;

                     after(grammarAccess.getCompoundDialogueAccess().getMasterDetailParserRuleCall_2()); 

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
    // $ANTLR end rule__CompoundDialogue__Alternatives


    // $ANTLR start rule__CompoundDialogue__Alternatives_0_5_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:992:1: rule__CompoundDialogue__Alternatives_0_5_1 : ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) );
    public final void rule__CompoundDialogue__Alternatives_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:996:1: ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==52) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("992:1: rule__CompoundDialogue__Alternatives_0_5_1 : ( ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) ) | ( 'false' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:997:1: ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:997:1: ( ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:998:1: ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 )
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:999:1: ( rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:999:2: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0_in_rule__CompoundDialogue__Alternatives_0_5_12127);
                    rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1003:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1003:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1004:1: 'false'
                    {
                     before(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__CompoundDialogue__Alternatives_0_5_12146); 
                     after(grammarAccess.getCompoundDialogueAccess().getFalseKeyword_0_5_1_1()); 

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
    // $ANTLR end rule__CompoundDialogue__Alternatives_0_5_1


    // $ANTLR start rule__CollectionDialogue__Alternatives_6_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1016:1: rule__CollectionDialogue__Alternatives_6_1 : ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) );
    public final void rule__CollectionDialogue__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1020:1: ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==52) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1016:1: rule__CollectionDialogue__Alternatives_6_1 : ( ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) ) | ( 'false' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1021:1: ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1021:1: ( ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1022:1: ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 )
                    {
                     before(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1023:1: ( rule__CollectionDialogue__ReadonlyAssignment_6_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1023:2: rule__CollectionDialogue__ReadonlyAssignment_6_1_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__ReadonlyAssignment_6_1_0_in_rule__CollectionDialogue__Alternatives_6_12180);
                    rule__CollectionDialogue__ReadonlyAssignment_6_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1027:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1027:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1028:1: 'false'
                    {
                     before(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__CollectionDialogue__Alternatives_6_12199); 
                     after(grammarAccess.getCollectionDialogueAccess().getFalseKeyword_6_1_1()); 

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
    // $ANTLR end rule__CollectionDialogue__Alternatives_6_1


    // $ANTLR start rule__MasterDetail__Alternatives_5_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1040:1: rule__MasterDetail__Alternatives_5_1 : ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );
    public final void rule__MasterDetail__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1044:1: ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1040:1: rule__MasterDetail__Alternatives_5_1 : ( ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) ) | ( 'false' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1045:1: ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1045:1: ( ( rule__MasterDetail__ReadonlyAssignment_5_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1046:1: ( rule__MasterDetail__ReadonlyAssignment_5_1_0 )
                    {
                     before(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1047:1: ( rule__MasterDetail__ReadonlyAssignment_5_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1047:2: rule__MasterDetail__ReadonlyAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__ReadonlyAssignment_5_1_0_in_rule__MasterDetail__Alternatives_5_12233);
                    rule__MasterDetail__ReadonlyAssignment_5_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1051:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1051:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1052:1: 'false'
                    {
                     before(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__MasterDetail__Alternatives_5_12252); 
                     after(grammarAccess.getMasterDetailAccess().getFalseKeyword_5_1_1()); 

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
    // $ANTLR end rule__MasterDetail__Alternatives_5_1


    // $ANTLR start rule__Process__Alternatives_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1064:1: rule__Process__Alternatives_2 : ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) );
    public final void rule__Process__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1068:1: ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=20)) ) {
                alt9=1;
            }
            else if ( (LA9_0==11) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1064:1: rule__Process__Alternatives_2 : ( ( ( rule__Process__TypeAssignment_2_0 ) ) | ( ( rule__Process__Group_2_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1069:1: ( ( rule__Process__TypeAssignment_2_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1069:1: ( ( rule__Process__TypeAssignment_2_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1070:1: ( rule__Process__TypeAssignment_2_0 )
                    {
                     before(grammarAccess.getProcessAccess().getTypeAssignment_2_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1071:1: ( rule__Process__TypeAssignment_2_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1071:2: rule__Process__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Process__TypeAssignment_2_0_in_rule__Process__Alternatives_22286);
                    rule__Process__TypeAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1075:6: ( ( rule__Process__Group_2_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1075:6: ( ( rule__Process__Group_2_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1076:1: ( rule__Process__Group_2_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_2_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1077:1: ( rule__Process__Group_2_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1077:2: rule__Process__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_2_1__0_in_rule__Process__Alternatives_22304);
                    rule__Process__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__Process__Alternatives_2


    // $ANTLR start rule__Process__Alternatives_7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1086:1: rule__Process__Alternatives_7 : ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) );
    public final void rule__Process__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1090:1: ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1086:1: rule__Process__Alternatives_7 : ( ( ';' ) | ( ( rule__Process__Group_7_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1091:1: ( ';' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1091:1: ( ';' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1092:1: ';'
                    {
                     before(grammarAccess.getProcessAccess().getSemicolonKeyword_7_0()); 
                    match(input,13,FOLLOW_13_in_rule__Process__Alternatives_72338); 
                     after(grammarAccess.getProcessAccess().getSemicolonKeyword_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1099:6: ( ( rule__Process__Group_7_1__0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1099:6: ( ( rule__Process__Group_7_1__0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1100:1: ( rule__Process__Group_7_1__0 )
                    {
                     before(grammarAccess.getProcessAccess().getGroup_7_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1101:1: ( rule__Process__Group_7_1__0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1101:2: rule__Process__Group_7_1__0
                    {
                    pushFollow(FOLLOW_rule__Process__Group_7_1__0_in_rule__Process__Alternatives_72357);
                    rule__Process__Group_7_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProcessAccess().getGroup_7_1()); 

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
    // $ANTLR end rule__Process__Alternatives_7


    // $ANTLR start rule__FormElement__Alternatives_4_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1110:1: rule__FormElement__Alternatives_4_1 : ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) );
    public final void rule__FormElement__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1114:1: ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==52) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1110:1: rule__FormElement__Alternatives_4_1 : ( ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) ) | ( 'false' ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1115:1: ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1115:1: ( ( rule__FormElement__ReadonlyAssignment_4_1_0 ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1116:1: ( rule__FormElement__ReadonlyAssignment_4_1_0 )
                    {
                     before(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1117:1: ( rule__FormElement__ReadonlyAssignment_4_1_0 )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1117:2: rule__FormElement__ReadonlyAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__ReadonlyAssignment_4_1_0_in_rule__FormElement__Alternatives_4_12390);
                    rule__FormElement__ReadonlyAssignment_4_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFormElementAccess().getReadonlyAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1121:6: ( 'false' )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1121:6: ( 'false' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1122:1: 'false'
                    {
                     before(grammarAccess.getFormElementAccess().getFalseKeyword_4_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__FormElement__Alternatives_4_12409); 
                     after(grammarAccess.getFormElementAccess().getFalseKeyword_4_1_1()); 

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
    // $ANTLR end rule__FormElement__Alternatives_4_1


    // $ANTLR start rule__Expression__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1134:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1138:1: ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt12=1;
                }
                break;
            case 50:
            case 53:
                {
                alt12=2;
                }
                break;
            case 21:
            case 22:
                {
                alt12=3;
                }
                break;
            case 47:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1134:1: rule__Expression__Alternatives : ( ( ruleServiceExpression ) | ( ruleNavigationExpression ) | ( ruleStandardExpression ) | ( ruleOperationExpression ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1139:1: ( ruleServiceExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1139:1: ( ruleServiceExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1140:1: ruleServiceExpression
                    {
                     before(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2443);
                    ruleServiceExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getServiceExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1145:6: ( ruleNavigationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1145:6: ( ruleNavigationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1146:1: ruleNavigationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2460);
                    ruleNavigationExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getNavigationExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1151:6: ( ruleStandardExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1151:6: ( ruleStandardExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1152:1: ruleStandardExpression
                    {
                     before(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2477);
                    ruleStandardExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStandardExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1157:6: ( ruleOperationExpression )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1157:6: ( ruleOperationExpression )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1158:1: ruleOperationExpression
                    {
                     before(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2494);
                    ruleOperationExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getOperationExpressionParserRuleCall_3()); 

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
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__UICall__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );
    public final void rule__UICall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1172:1: ( ( ruleDialogueCall ) | ( ruleProcessCall ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==43) ) {
                    switch ( input.LA(3) ) {
                    case 44:
                        {
                        int LA13_2 = input.LA(4);

                        if ( (LA13_2==45) ) {
                            int LA13_12 = input.LA(5);

                            if ( (LA13_12==47) ) {
                                int LA13_16 = input.LA(6);

                                if ( (LA13_16==RULE_ID) ) {
                                    int LA13_18 = input.LA(7);

                                    if ( (LA13_18==46) ) {
                                        switch ( input.LA(8) ) {
                                        case 48:
                                            {
                                            int LA13_3 = input.LA(9);

                                            if ( (LA13_3==RULE_ID) ) {
                                                int LA13_13 = input.LA(10);

                                                if ( (LA13_13==49) ) {
                                                    int LA13_17 = input.LA(11);

                                                    if ( (LA13_17==RULE_ID) ) {
                                                        int LA13_19 = input.LA(12);

                                                        if ( (LA13_19==25) ) {
                                                            alt13=2;
                                                        }
                                                        else if ( (LA13_19==30) ) {
                                                            alt13=1;
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 19, input);

                                                            throw nvae;
                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 17, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 13, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 3, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 53:
                                            {
                                            int LA13_4 = input.LA(9);

                                            if ( (LA13_4==50) ) {
                                                int LA13_5 = input.LA(10);

                                                if ( (LA13_5==RULE_ID) ) {
                                                    int LA13_14 = input.LA(11);

                                                    if ( (LA13_14==25) ) {
                                                        alt13=2;
                                                    }
                                                    else if ( (LA13_14==30) ) {
                                                        alt13=1;
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 14, input);

                                                        throw nvae;
                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 5, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 4, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 50:
                                            {
                                            int LA13_5 = input.LA(9);

                                            if ( (LA13_5==RULE_ID) ) {
                                                int LA13_14 = input.LA(10);

                                                if ( (LA13_14==25) ) {
                                                    alt13=2;
                                                }
                                                else if ( (LA13_14==30) ) {
                                                    alt13=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 14, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 5, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 21:
                                            {
                                            int LA13_6 = input.LA(9);

                                            if ( (LA13_6==30) ) {
                                                alt13=1;
                                            }
                                            else if ( (LA13_6==25) ) {
                                                alt13=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 6, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 22:
                                            {
                                            int LA13_7 = input.LA(9);

                                            if ( (LA13_7==30) ) {
                                                alt13=1;
                                            }
                                            else if ( (LA13_7==25) ) {
                                                alt13=2;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 7, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 47:
                                            {
                                            int LA13_8 = input.LA(9);

                                            if ( (LA13_8==RULE_ID) ) {
                                                int LA13_15 = input.LA(10);

                                                if ( (LA13_15==30) ) {
                                                    alt13=1;
                                                }
                                                else if ( (LA13_15==25) ) {
                                                    alt13=2;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 15, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 8, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case 25:
                                            {
                                            alt13=2;
                                            }
                                            break;
                                        case 30:
                                            {
                                            alt13=1;
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 20, input);

                                            throw nvae;
                                        }

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 18, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 12, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 48:
                        {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3==RULE_ID) ) {
                            int LA13_13 = input.LA(5);

                            if ( (LA13_13==49) ) {
                                int LA13_17 = input.LA(6);

                                if ( (LA13_17==RULE_ID) ) {
                                    int LA13_19 = input.LA(7);

                                    if ( (LA13_19==25) ) {
                                        alt13=2;
                                    }
                                    else if ( (LA13_19==30) ) {
                                        alt13=1;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 19, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 13, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 53:
                        {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==50) ) {
                            int LA13_5 = input.LA(5);

                            if ( (LA13_5==RULE_ID) ) {
                                int LA13_14 = input.LA(6);

                                if ( (LA13_14==25) ) {
                                    alt13=2;
                                }
                                else if ( (LA13_14==30) ) {
                                    alt13=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 14, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 50:
                        {
                        int LA13_5 = input.LA(4);

                        if ( (LA13_5==RULE_ID) ) {
                            int LA13_14 = input.LA(5);

                            if ( (LA13_14==25) ) {
                                alt13=2;
                            }
                            else if ( (LA13_14==30) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 21:
                        {
                        int LA13_6 = input.LA(4);

                        if ( (LA13_6==30) ) {
                            alt13=1;
                        }
                        else if ( (LA13_6==25) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 22:
                        {
                        int LA13_7 = input.LA(4);

                        if ( (LA13_7==30) ) {
                            alt13=1;
                        }
                        else if ( (LA13_7==25) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 47:
                        {
                        int LA13_8 = input.LA(4);

                        if ( (LA13_8==RULE_ID) ) {
                            int LA13_15 = input.LA(5);

                            if ( (LA13_15==30) ) {
                                alt13=1;
                            }
                            else if ( (LA13_15==25) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 30:
                        {
                        alt13=1;
                        }
                        break;
                    case 25:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 11, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==45) ) {
                    int LA13_12 = input.LA(3);

                    if ( (LA13_12==47) ) {
                        int LA13_16 = input.LA(4);

                        if ( (LA13_16==RULE_ID) ) {
                            int LA13_18 = input.LA(5);

                            if ( (LA13_18==46) ) {
                                switch ( input.LA(6) ) {
                                case 48:
                                    {
                                    int LA13_3 = input.LA(7);

                                    if ( (LA13_3==RULE_ID) ) {
                                        int LA13_13 = input.LA(8);

                                        if ( (LA13_13==49) ) {
                                            int LA13_17 = input.LA(9);

                                            if ( (LA13_17==RULE_ID) ) {
                                                int LA13_19 = input.LA(10);

                                                if ( (LA13_19==25) ) {
                                                    alt13=2;
                                                }
                                                else if ( (LA13_19==30) ) {
                                                    alt13=1;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 19, input);

                                                    throw nvae;
                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 17, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 13, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 3, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 53:
                                    {
                                    int LA13_4 = input.LA(7);

                                    if ( (LA13_4==50) ) {
                                        int LA13_5 = input.LA(8);

                                        if ( (LA13_5==RULE_ID) ) {
                                            int LA13_14 = input.LA(9);

                                            if ( (LA13_14==25) ) {
                                                alt13=2;
                                            }
                                            else if ( (LA13_14==30) ) {
                                                alt13=1;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 14, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 4, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 50:
                                    {
                                    int LA13_5 = input.LA(7);

                                    if ( (LA13_5==RULE_ID) ) {
                                        int LA13_14 = input.LA(8);

                                        if ( (LA13_14==25) ) {
                                            alt13=2;
                                        }
                                        else if ( (LA13_14==30) ) {
                                            alt13=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 14, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 5, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 21:
                                    {
                                    int LA13_6 = input.LA(7);

                                    if ( (LA13_6==30) ) {
                                        alt13=1;
                                    }
                                    else if ( (LA13_6==25) ) {
                                        alt13=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 6, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 22:
                                    {
                                    int LA13_7 = input.LA(7);

                                    if ( (LA13_7==30) ) {
                                        alt13=1;
                                    }
                                    else if ( (LA13_7==25) ) {
                                        alt13=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 7, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 47:
                                    {
                                    int LA13_8 = input.LA(7);

                                    if ( (LA13_8==RULE_ID) ) {
                                        int LA13_15 = input.LA(8);

                                        if ( (LA13_15==30) ) {
                                            alt13=1;
                                        }
                                        else if ( (LA13_15==25) ) {
                                            alt13=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 15, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 8, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 25:
                                    {
                                    alt13=2;
                                    }
                                    break;
                                case 30:
                                    {
                                    alt13=1;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 20, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 18, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 12, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==RULE_ID) ) {
                    int LA13_13 = input.LA(3);

                    if ( (LA13_13==49) ) {
                        int LA13_17 = input.LA(4);

                        if ( (LA13_17==RULE_ID) ) {
                            int LA13_19 = input.LA(5);

                            if ( (LA13_19==25) ) {
                                alt13=2;
                            }
                            else if ( (LA13_19==30) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 19, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 17, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 13, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA13_4 = input.LA(2);

                if ( (LA13_4==50) ) {
                    int LA13_5 = input.LA(3);

                    if ( (LA13_5==RULE_ID) ) {
                        int LA13_14 = input.LA(4);

                        if ( (LA13_14==25) ) {
                            alt13=2;
                        }
                        else if ( (LA13_14==30) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                int LA13_5 = input.LA(2);

                if ( (LA13_5==RULE_ID) ) {
                    int LA13_14 = input.LA(3);

                    if ( (LA13_14==25) ) {
                        alt13=2;
                    }
                    else if ( (LA13_14==30) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 14, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA13_6 = input.LA(2);

                if ( (LA13_6==30) ) {
                    alt13=1;
                }
                else if ( (LA13_6==25) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 6, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA13_7 = input.LA(2);

                if ( (LA13_7==30) ) {
                    alt13=1;
                }
                else if ( (LA13_7==25) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 7, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA13_8 = input.LA(2);

                if ( (LA13_8==RULE_ID) ) {
                    int LA13_15 = input.LA(3);

                    if ( (LA13_15==30) ) {
                        alt13=1;
                    }
                    else if ( (LA13_15==25) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 15, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 8, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1168:1: rule__UICall__Alternatives : ( ( ruleDialogueCall ) | ( ruleProcessCall ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1173:1: ( ruleDialogueCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1173:1: ( ruleDialogueCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1174:1: ruleDialogueCall
                    {
                     before(grammarAccess.getUICallAccess().getDialogueCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDialogueCall_in_rule__UICall__Alternatives2526);
                    ruleDialogueCall();
                    _fsp--;

                     after(grammarAccess.getUICallAccess().getDialogueCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1179:6: ( ruleProcessCall )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1179:6: ( ruleProcessCall )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1180:1: ruleProcessCall
                    {
                     before(grammarAccess.getUICallAccess().getProcessCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcessCall_in_rule__UICall__Alternatives2543);
                    ruleProcessCall();
                    _fsp--;

                     after(grammarAccess.getUICallAccess().getProcessCallParserRuleCall_1()); 

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
    // $ANTLR end rule__UICall__Alternatives


    // $ANTLR start rule__ProcessType__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1190:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) );
    public final void rule__ProcessType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1194:1: ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt14=1;
                }
                break;
            case 15:
                {
                alt14=2;
                }
                break;
            case 16:
                {
                alt14=3;
                }
                break;
            case 17:
                {
                alt14=4;
                }
                break;
            case 18:
                {
                alt14=5;
                }
                break;
            case 19:
                {
                alt14=6;
                }
                break;
            case 20:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1190:1: rule__ProcessType__Alternatives : ( ( ( 'new' ) ) | ( ( 'save' ) ) | ( ( 'edit' ) ) | ( ( 'delete' ) ) | ( ( 'cancel' ) ) | ( ( 'removefrom' ) ) | ( ( 'addto' ) ) );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1195:1: ( ( 'new' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1195:1: ( ( 'new' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1196:1: ( 'new' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1197:1: ( 'new' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1197:3: 'new'
                    {
                    match(input,14,FOLLOW_14_in_rule__ProcessType__Alternatives2576); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getNEWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1202:6: ( ( 'save' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1202:6: ( ( 'save' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1203:1: ( 'save' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1204:1: ( 'save' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1204:3: 'save'
                    {
                    match(input,15,FOLLOW_15_in_rule__ProcessType__Alternatives2597); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getSAVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1209:6: ( ( 'edit' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1209:6: ( ( 'edit' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1210:1: ( 'edit' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1211:1: ( 'edit' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1211:3: 'edit'
                    {
                    match(input,16,FOLLOW_16_in_rule__ProcessType__Alternatives2618); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getEDITEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1216:6: ( ( 'delete' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1216:6: ( ( 'delete' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1217:1: ( 'delete' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1218:1: ( 'delete' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1218:3: 'delete'
                    {
                    match(input,17,FOLLOW_17_in_rule__ProcessType__Alternatives2639); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1223:6: ( ( 'cancel' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1223:6: ( ( 'cancel' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1224:1: ( 'cancel' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1225:1: ( 'cancel' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1225:3: 'cancel'
                    {
                    match(input,18,FOLLOW_18_in_rule__ProcessType__Alternatives2660); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getCANCELEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1230:6: ( ( 'removefrom' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1230:6: ( ( 'removefrom' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1231:1: ( 'removefrom' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1232:1: ( 'removefrom' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1232:3: 'removefrom'
                    {
                    match(input,19,FOLLOW_19_in_rule__ProcessType__Alternatives2681); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getREMOVEFROMEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1237:6: ( ( 'addto' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1237:6: ( ( 'addto' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1238:1: ( 'addto' )
                    {
                     before(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1239:1: ( 'addto' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1239:3: 'addto'
                    {
                    match(input,20,FOLLOW_20_in_rule__ProcessType__Alternatives2702); 

                    }

                     after(grammarAccess.getProcessTypeAccess().getADDTOEnumLiteralDeclaration_6()); 

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
    // $ANTLR end rule__ProcessType__Alternatives


    // $ANTLR start rule__ExpressionType__Alternatives
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1249:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );
    public final void rule__ExpressionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1253:1: ( ( ( 'all' ) ) | ( ( 'find' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            else if ( (LA15_0==22) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1249:1: rule__ExpressionType__Alternatives : ( ( ( 'all' ) ) | ( ( 'find' ) ) );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1254:1: ( ( 'all' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1254:1: ( ( 'all' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1255:1: ( 'all' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1256:1: ( 'all' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1256:3: 'all'
                    {
                    match(input,21,FOLLOW_21_in_rule__ExpressionType__Alternatives2738); 

                    }

                     after(grammarAccess.getExpressionTypeAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1261:6: ( ( 'find' ) )
                    {
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1261:6: ( ( 'find' ) )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1262:1: ( 'find' )
                    {
                     before(grammarAccess.getExpressionTypeAccess().getFINDEnumLiteralDeclaration_1()); 
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1263:1: ( 'find' )
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1263:3: 'find'
                    {
                    match(input,22,FOLLOW_22_in_rule__ExpressionType__Alternatives2759); 

                    }

                     after(grammarAccess.getExpressionTypeAccess().getFINDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__ExpressionType__Alternatives


    // $ANTLR start rule__ApplicationModel__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1275:1: rule__ApplicationModel__Group__0 : ( ( rule__ApplicationModel__DescriptionAssignment_0 )? ) rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1279:1: ( ( ( rule__ApplicationModel__DescriptionAssignment_0 )? ) rule__ApplicationModel__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1280:1: ( ( rule__ApplicationModel__DescriptionAssignment_0 )? ) rule__ApplicationModel__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1280:1: ( ( rule__ApplicationModel__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1281:1: ( rule__ApplicationModel__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getApplicationModelAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1282:1: ( rule__ApplicationModel__DescriptionAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1282:2: rule__ApplicationModel__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ApplicationModel__DescriptionAssignment_0_in_rule__ApplicationModel__Group__02796);
                    rule__ApplicationModel__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationModelAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__02806);
            rule__ApplicationModel__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__Group__0


    // $ANTLR start rule__ApplicationModel__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1293:1: rule__ApplicationModel__Group__1 : ( 'application' ) rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1297:1: ( ( 'application' ) rule__ApplicationModel__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1298:1: ( 'application' ) rule__ApplicationModel__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1298:1: ( 'application' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1299:1: 'application'
            {
             before(grammarAccess.getApplicationModelAccess().getApplicationKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ApplicationModel__Group__12835); 
             after(grammarAccess.getApplicationModelAccess().getApplicationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__12845);
            rule__ApplicationModel__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__Group__1


    // $ANTLR start rule__ApplicationModel__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1313:1: rule__ApplicationModel__Group__2 : ( ( rule__ApplicationModel__NameAssignment_2 ) ) rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1317:1: ( ( ( rule__ApplicationModel__NameAssignment_2 ) ) rule__ApplicationModel__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1318:1: ( ( rule__ApplicationModel__NameAssignment_2 ) ) rule__ApplicationModel__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1318:1: ( ( rule__ApplicationModel__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1319:1: ( rule__ApplicationModel__NameAssignment_2 )
            {
             before(grammarAccess.getApplicationModelAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1320:1: ( rule__ApplicationModel__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1320:2: rule__ApplicationModel__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ApplicationModel__NameAssignment_2_in_rule__ApplicationModel__Group__22873);
            rule__ApplicationModel__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getApplicationModelAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__22882);
            rule__ApplicationModel__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__Group__2


    // $ANTLR start rule__ApplicationModel__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1331:1: rule__ApplicationModel__Group__3 : ( ';' ) rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1335:1: ( ( ';' ) rule__ApplicationModel__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1336:1: ( ';' ) rule__ApplicationModel__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1336:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1337:1: ';'
            {
             before(grammarAccess.getApplicationModelAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ApplicationModel__Group__32911); 
             after(grammarAccess.getApplicationModelAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__32921);
            rule__ApplicationModel__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__Group__3


    // $ANTLR start rule__ApplicationModel__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1351:1: rule__ApplicationModel__Group__4 : ( ( rule__ApplicationModel__ExternalReferencesAssignment_4 )* ) rule__ApplicationModel__Group__5 ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1355:1: ( ( ( rule__ApplicationModel__ExternalReferencesAssignment_4 )* ) rule__ApplicationModel__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1356:1: ( ( rule__ApplicationModel__ExternalReferencesAssignment_4 )* ) rule__ApplicationModel__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1356:1: ( ( rule__ApplicationModel__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1357:1: ( rule__ApplicationModel__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getApplicationModelAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1358:1: ( rule__ApplicationModel__ExternalReferencesAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1358:2: rule__ApplicationModel__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationModel__ExternalReferencesAssignment_4_in_rule__ApplicationModel__Group__42949);
            	    rule__ApplicationModel__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getApplicationModelAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__42959);
            rule__ApplicationModel__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__Group__4


    // $ANTLR start rule__ApplicationModel__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1369:1: rule__ApplicationModel__Group__5 : ( ( rule__ApplicationModel__StartAssignment_5 ) ) ;
    public final void rule__ApplicationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1373:1: ( ( ( rule__ApplicationModel__StartAssignment_5 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1374:1: ( ( rule__ApplicationModel__StartAssignment_5 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1374:1: ( ( rule__ApplicationModel__StartAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1375:1: ( rule__ApplicationModel__StartAssignment_5 )
            {
             before(grammarAccess.getApplicationModelAccess().getStartAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1376:1: ( rule__ApplicationModel__StartAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1376:2: rule__ApplicationModel__StartAssignment_5
            {
            pushFollow(FOLLOW_rule__ApplicationModel__StartAssignment_5_in_rule__ApplicationModel__Group__52987);
            rule__ApplicationModel__StartAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getApplicationModelAccess().getStartAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__Group__5


    // $ANTLR start rule__ProcessReference__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1398:1: rule__ProcessReference__Group__0 : ( 'from' ) rule__ProcessReference__Group__1 ;
    public final void rule__ProcessReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1402:1: ( ( 'from' ) rule__ProcessReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1403:1: ( 'from' ) rule__ProcessReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1403:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1404:1: 'from'
            {
             before(grammarAccess.getProcessReferenceAccess().getFromKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ProcessReference__Group__03034); 
             after(grammarAccess.getProcessReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessReference__Group__1_in_rule__ProcessReference__Group__03044);
            rule__ProcessReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessReference__Group__0


    // $ANTLR start rule__ProcessReference__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1418:1: rule__ProcessReference__Group__1 : ( ( rule__ProcessReference__ModelNameAssignment_1 ) ) rule__ProcessReference__Group__2 ;
    public final void rule__ProcessReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1422:1: ( ( ( rule__ProcessReference__ModelNameAssignment_1 ) ) rule__ProcessReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1423:1: ( ( rule__ProcessReference__ModelNameAssignment_1 ) ) rule__ProcessReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1423:1: ( ( rule__ProcessReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1424:1: ( rule__ProcessReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getProcessReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1425:1: ( rule__ProcessReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1425:2: rule__ProcessReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ProcessReference__ModelNameAssignment_1_in_rule__ProcessReference__Group__13072);
            rule__ProcessReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getProcessReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessReference__Group__2_in_rule__ProcessReference__Group__13081);
            rule__ProcessReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessReference__Group__1


    // $ANTLR start rule__ProcessReference__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1436:1: rule__ProcessReference__Group__2 : ( 'process' ) rule__ProcessReference__Group__3 ;
    public final void rule__ProcessReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1440:1: ( ( 'process' ) rule__ProcessReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1441:1: ( 'process' ) rule__ProcessReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1441:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1442:1: 'process'
            {
             before(grammarAccess.getProcessReferenceAccess().getProcessKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__ProcessReference__Group__23110); 
             after(grammarAccess.getProcessReferenceAccess().getProcessKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessReference__Group__3_in_rule__ProcessReference__Group__23120);
            rule__ProcessReference__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessReference__Group__2


    // $ANTLR start rule__ProcessReference__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1456:1: rule__ProcessReference__Group__3 : ( ( rule__ProcessReference__NameAssignment_3 ) ) rule__ProcessReference__Group__4 ;
    public final void rule__ProcessReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1460:1: ( ( ( rule__ProcessReference__NameAssignment_3 ) ) rule__ProcessReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1461:1: ( ( rule__ProcessReference__NameAssignment_3 ) ) rule__ProcessReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1461:1: ( ( rule__ProcessReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1462:1: ( rule__ProcessReference__NameAssignment_3 )
            {
             before(grammarAccess.getProcessReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1463:1: ( rule__ProcessReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1463:2: rule__ProcessReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ProcessReference__NameAssignment_3_in_rule__ProcessReference__Group__33148);
            rule__ProcessReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getProcessReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ProcessReference__Group__4_in_rule__ProcessReference__Group__33157);
            rule__ProcessReference__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessReference__Group__3


    // $ANTLR start rule__ProcessReference__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1474:1: rule__ProcessReference__Group__4 : ( ';' ) ;
    public final void rule__ProcessReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1478:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1479:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1479:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1480:1: ';'
            {
             before(grammarAccess.getProcessReferenceAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ProcessReference__Group__43186); 
             after(grammarAccess.getProcessReferenceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessReference__Group__4


    // $ANTLR start rule__FormsAndProcesses__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1503:1: rule__FormsAndProcesses__Group__0 : ( ( rule__FormsAndProcesses__DescriptionAssignment_0 )? ) rule__FormsAndProcesses__Group__1 ;
    public final void rule__FormsAndProcesses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1507:1: ( ( ( rule__FormsAndProcesses__DescriptionAssignment_0 )? ) rule__FormsAndProcesses__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1508:1: ( ( rule__FormsAndProcesses__DescriptionAssignment_0 )? ) rule__FormsAndProcesses__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1508:1: ( ( rule__FormsAndProcesses__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1509:1: ( rule__FormsAndProcesses__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFormsAndProcessesAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1510:1: ( rule__FormsAndProcesses__DescriptionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1510:2: rule__FormsAndProcesses__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormsAndProcesses__DescriptionAssignment_0_in_rule__FormsAndProcesses__Group__03231);
                    rule__FormsAndProcesses__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormsAndProcessesAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__1_in_rule__FormsAndProcesses__Group__03241);
            rule__FormsAndProcesses__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__Group__0


    // $ANTLR start rule__FormsAndProcesses__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1521:1: rule__FormsAndProcesses__Group__1 : ( 'presentation' ) rule__FormsAndProcesses__Group__2 ;
    public final void rule__FormsAndProcesses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1525:1: ( ( 'presentation' ) rule__FormsAndProcesses__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1526:1: ( 'presentation' ) rule__FormsAndProcesses__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1526:1: ( 'presentation' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1527:1: 'presentation'
            {
             before(grammarAccess.getFormsAndProcessesAccess().getPresentationKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__FormsAndProcesses__Group__13270); 
             after(grammarAccess.getFormsAndProcessesAccess().getPresentationKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__2_in_rule__FormsAndProcesses__Group__13280);
            rule__FormsAndProcesses__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__Group__1


    // $ANTLR start rule__FormsAndProcesses__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1541:1: rule__FormsAndProcesses__Group__2 : ( ( rule__FormsAndProcesses__NameAssignment_2 ) ) rule__FormsAndProcesses__Group__3 ;
    public final void rule__FormsAndProcesses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1545:1: ( ( ( rule__FormsAndProcesses__NameAssignment_2 ) ) rule__FormsAndProcesses__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1546:1: ( ( rule__FormsAndProcesses__NameAssignment_2 ) ) rule__FormsAndProcesses__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1546:1: ( ( rule__FormsAndProcesses__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1547:1: ( rule__FormsAndProcesses__NameAssignment_2 )
            {
             before(grammarAccess.getFormsAndProcessesAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1548:1: ( rule__FormsAndProcesses__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1548:2: rule__FormsAndProcesses__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FormsAndProcesses__NameAssignment_2_in_rule__FormsAndProcesses__Group__23308);
            rule__FormsAndProcesses__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormsAndProcessesAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__3_in_rule__FormsAndProcesses__Group__23317);
            rule__FormsAndProcesses__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__Group__2


    // $ANTLR start rule__FormsAndProcesses__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1559:1: rule__FormsAndProcesses__Group__3 : ( ';' ) rule__FormsAndProcesses__Group__4 ;
    public final void rule__FormsAndProcesses__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1563:1: ( ( ';' ) rule__FormsAndProcesses__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1564:1: ( ';' ) rule__FormsAndProcesses__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1564:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1565:1: ';'
            {
             before(grammarAccess.getFormsAndProcessesAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__FormsAndProcesses__Group__33346); 
             after(grammarAccess.getFormsAndProcessesAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__4_in_rule__FormsAndProcesses__Group__33356);
            rule__FormsAndProcesses__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__Group__3


    // $ANTLR start rule__FormsAndProcesses__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1579:1: rule__FormsAndProcesses__Group__4 : ( ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )* ) rule__FormsAndProcesses__Group__5 ;
    public final void rule__FormsAndProcesses__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1583:1: ( ( ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )* ) rule__FormsAndProcesses__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1584:1: ( ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )* ) rule__FormsAndProcesses__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1584:1: ( ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1585:1: ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )*
            {
             before(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1586:1: ( rule__FormsAndProcesses__ExternalReferencesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1586:2: rule__FormsAndProcesses__ExternalReferencesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__FormsAndProcesses__ExternalReferencesAssignment_4_in_rule__FormsAndProcesses__Group__43384);
            	    rule__FormsAndProcesses__ExternalReferencesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__5_in_rule__FormsAndProcesses__Group__43394);
            rule__FormsAndProcesses__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__Group__4


    // $ANTLR start rule__FormsAndProcesses__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1597:1: rule__FormsAndProcesses__Group__5 : ( ( rule__FormsAndProcesses__StartAssignment_5 )? ) rule__FormsAndProcesses__Group__6 ;
    public final void rule__FormsAndProcesses__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1601:1: ( ( ( rule__FormsAndProcesses__StartAssignment_5 )? ) rule__FormsAndProcesses__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1602:1: ( ( rule__FormsAndProcesses__StartAssignment_5 )? ) rule__FormsAndProcesses__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1602:1: ( ( rule__FormsAndProcesses__StartAssignment_5 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1603:1: ( rule__FormsAndProcesses__StartAssignment_5 )?
            {
             before(grammarAccess.getFormsAndProcessesAccess().getStartAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1604:1: ( rule__FormsAndProcesses__StartAssignment_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1604:2: rule__FormsAndProcesses__StartAssignment_5
                    {
                    pushFollow(FOLLOW_rule__FormsAndProcesses__StartAssignment_5_in_rule__FormsAndProcesses__Group__53422);
                    rule__FormsAndProcesses__StartAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormsAndProcessesAccess().getStartAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__FormsAndProcesses__Group__6_in_rule__FormsAndProcesses__Group__53432);
            rule__FormsAndProcesses__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__Group__5


    // $ANTLR start rule__FormsAndProcesses__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1615:1: rule__FormsAndProcesses__Group__6 : ( ( rule__FormsAndProcesses__ElementsAssignment_6 )* ) ;
    public final void rule__FormsAndProcesses__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1619:1: ( ( ( rule__FormsAndProcesses__ElementsAssignment_6 )* ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1620:1: ( ( rule__FormsAndProcesses__ElementsAssignment_6 )* )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1620:1: ( ( rule__FormsAndProcesses__ElementsAssignment_6 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1621:1: ( rule__FormsAndProcesses__ElementsAssignment_6 )*
            {
             before(grammarAccess.getFormsAndProcessesAccess().getElementsAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1622:1: ( rule__FormsAndProcesses__ElementsAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING||LA21_0==25||LA21_0==30||LA21_0==36||(LA21_0>=38 && LA21_0<=39)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1622:2: rule__FormsAndProcesses__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__FormsAndProcesses__ElementsAssignment_6_in_rule__FormsAndProcesses__Group__63460);
            	    rule__FormsAndProcesses__ElementsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFormsAndProcessesAccess().getElementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__Group__6


    // $ANTLR start rule__Application__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1646:1: rule__Application__Group__0 : ( 'application' ) rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1650:1: ( ( 'application' ) rule__Application__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1651:1: ( 'application' ) rule__Application__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1651:1: ( 'application' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1652:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Application__Group__03510); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03520);
            rule__Application__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__0


    // $ANTLR start rule__Application__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1666:1: rule__Application__Group__1 : ( '[' ) rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1670:1: ( ( '[' ) rule__Application__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1671:1: ( '[' ) rule__Application__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1671:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1672:1: '['
            {
             before(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Application__Group__13549); 
             after(grammarAccess.getApplicationAccess().getLeftSquareBracketKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13559);
            rule__Application__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__1


    // $ANTLR start rule__Application__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1686:1: rule__Application__Group__2 : ( ( rule__Application__StartProcessesAssignment_2 ) ) rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1690:1: ( ( ( rule__Application__StartProcessesAssignment_2 ) ) rule__Application__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1691:1: ( ( rule__Application__StartProcessesAssignment_2 ) ) rule__Application__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1691:1: ( ( rule__Application__StartProcessesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1692:1: ( rule__Application__StartProcessesAssignment_2 )
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1693:1: ( rule__Application__StartProcessesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1693:2: rule__Application__StartProcessesAssignment_2
            {
            pushFollow(FOLLOW_rule__Application__StartProcessesAssignment_2_in_rule__Application__Group__23587);
            rule__Application__StartProcessesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getStartProcessesAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23596);
            rule__Application__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__2


    // $ANTLR start rule__Application__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1704:1: rule__Application__Group__3 : ( ';' ) rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1708:1: ( ( ';' ) rule__Application__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1709:1: ( ';' ) rule__Application__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1709:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1710:1: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group__33625); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33635);
            rule__Application__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__3


    // $ANTLR start rule__Application__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1724:1: rule__Application__Group__4 : ( ( rule__Application__Group_4__0 )* ) rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1728:1: ( ( ( rule__Application__Group_4__0 )* ) rule__Application__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1729:1: ( ( rule__Application__Group_4__0 )* ) rule__Application__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1729:1: ( ( rule__Application__Group_4__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1730:1: ( rule__Application__Group_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1731:1: ( rule__Application__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1731:2: rule__Application__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__43663);
            	    rule__Application__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43673);
            rule__Application__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__4


    // $ANTLR start rule__Application__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1742:1: rule__Application__Group__5 : ( ']' ) ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1746:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1747:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1747:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1748:1: ']'
            {
             before(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Application__Group__53702); 
             after(grammarAccess.getApplicationAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__5


    // $ANTLR start rule__Application__Group_4__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1773:1: rule__Application__Group_4__0 : ( ( rule__Application__StartProcessesAssignment_4_0 ) ) rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1777:1: ( ( ( rule__Application__StartProcessesAssignment_4_0 ) ) rule__Application__Group_4__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1778:1: ( ( rule__Application__StartProcessesAssignment_4_0 ) ) rule__Application__Group_4__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1778:1: ( ( rule__Application__StartProcessesAssignment_4_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1779:1: ( rule__Application__StartProcessesAssignment_4_0 )
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesAssignment_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1780:1: ( rule__Application__StartProcessesAssignment_4_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1780:2: rule__Application__StartProcessesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Application__StartProcessesAssignment_4_0_in_rule__Application__Group_4__03749);
            rule__Application__StartProcessesAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getStartProcessesAssignment_4_0()); 

            }

            pushFollow(FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03758);
            rule__Application__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_4__0


    // $ANTLR start rule__Application__Group_4__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1791:1: rule__Application__Group_4__1 : ( ';' ) ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1795:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1796:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1796:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1797:1: ';'
            {
             before(grammarAccess.getApplicationAccess().getSemicolonKeyword_4_1()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group_4__13787); 
             after(grammarAccess.getApplicationAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_4__1


    // $ANTLR start rule__ExternalReference__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1814:1: rule__ExternalReference__Group__0 : ( 'from' ) rule__ExternalReference__Group__1 ;
    public final void rule__ExternalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1818:1: ( ( 'from' ) rule__ExternalReference__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1819:1: ( 'from' ) rule__ExternalReference__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1819:1: ( 'from' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1820:1: 'from'
            {
             before(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ExternalReference__Group__03827); 
             after(grammarAccess.getExternalReferenceAccess().getFromKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03837);
            rule__ExternalReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__Group__0


    // $ANTLR start rule__ExternalReference__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1834:1: rule__ExternalReference__Group__1 : ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 ;
    public final void rule__ExternalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1838:1: ( ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1839:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) ) rule__ExternalReference__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1839:1: ( ( rule__ExternalReference__ModelNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1840:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1841:1: ( rule__ExternalReference__ModelNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1841:2: rule__ExternalReference__ModelNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13865);
            rule__ExternalReference__ModelNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13874);
            rule__ExternalReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__Group__1


    // $ANTLR start rule__ExternalReference__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1852:1: rule__ExternalReference__Group__2 : ( 'import' ) rule__ExternalReference__Group__3 ;
    public final void rule__ExternalReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1856:1: ( ( 'import' ) rule__ExternalReference__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1857:1: ( 'import' ) rule__ExternalReference__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1857:1: ( 'import' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1858:1: 'import'
            {
             before(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__ExternalReference__Group__23903); 
             after(grammarAccess.getExternalReferenceAccess().getImportKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23913);
            rule__ExternalReference__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__Group__2


    // $ANTLR start rule__ExternalReference__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1872:1: rule__ExternalReference__Group__3 : ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 ;
    public final void rule__ExternalReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1876:1: ( ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1877:1: ( ( rule__ExternalReference__NameAssignment_3 ) ) rule__ExternalReference__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1877:1: ( ( rule__ExternalReference__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1878:1: ( rule__ExternalReference__NameAssignment_3 )
            {
             before(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1879:1: ( rule__ExternalReference__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1879:2: rule__ExternalReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33941);
            rule__ExternalReference__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getExternalReferenceAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33950);
            rule__ExternalReference__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__Group__3


    // $ANTLR start rule__ExternalReference__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1890:1: rule__ExternalReference__Group__4 : ( ';' ) ;
    public final void rule__ExternalReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1894:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1895:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1895:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1896:1: ';'
            {
             before(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ExternalReference__Group__43979); 
             after(grammarAccess.getExternalReferenceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__Group__4


    // $ANTLR start rule__ContentForm__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1919:1: rule__ContentForm__Group__0 : ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 ;
    public final void rule__ContentForm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1923:1: ( ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1924:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? ) rule__ContentForm__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1924:1: ( ( rule__ContentForm__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1925:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1926:1: ( rule__ContentForm__DescriptionAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1926:2: rule__ContentForm__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__04024);
                    rule__ContentForm__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__04034);
            rule__ContentForm__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__0


    // $ANTLR start rule__ContentForm__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1937:1: rule__ContentForm__Group__1 : ( 'form' ) rule__ContentForm__Group__2 ;
    public final void rule__ContentForm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1941:1: ( ( 'form' ) rule__ContentForm__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1942:1: ( 'form' ) rule__ContentForm__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1942:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1943:1: 'form'
            {
             before(grammarAccess.getContentFormAccess().getFormKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ContentForm__Group__14063); 
             after(grammarAccess.getContentFormAccess().getFormKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__14073);
            rule__ContentForm__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__1


    // $ANTLR start rule__ContentForm__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1957:1: rule__ContentForm__Group__2 : ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 ;
    public final void rule__ContentForm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1961:1: ( ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1962:1: ( ( rule__ContentForm__NameAssignment_2 ) ) rule__ContentForm__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1962:1: ( ( rule__ContentForm__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1963:1: ( rule__ContentForm__NameAssignment_2 )
            {
             before(grammarAccess.getContentFormAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1964:1: ( rule__ContentForm__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1964:2: rule__ContentForm__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__24101);
            rule__ContentForm__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__24110);
            rule__ContentForm__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__2


    // $ANTLR start rule__ContentForm__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1975:1: rule__ContentForm__Group__3 : ( 'context' ) rule__ContentForm__Group__4 ;
    public final void rule__ContentForm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1979:1: ( ( 'context' ) rule__ContentForm__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1980:1: ( 'context' ) rule__ContentForm__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1980:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1981:1: 'context'
            {
             before(grammarAccess.getContentFormAccess().getContextKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__ContentForm__Group__34139); 
             after(grammarAccess.getContentFormAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__34149);
            rule__ContentForm__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__3


    // $ANTLR start rule__ContentForm__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1995:1: rule__ContentForm__Group__4 : ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5 ;
    public final void rule__ContentForm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:1999:1: ( ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2000:1: ( ( rule__ContentForm__CollectionContextAssignment_4 )? ) rule__ContentForm__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2000:1: ( ( rule__ContentForm__CollectionContextAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2001:1: ( rule__ContentForm__CollectionContextAssignment_4 )?
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2002:1: ( rule__ContentForm__CollectionContextAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2002:2: rule__ContentForm__CollectionContextAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ContentForm__CollectionContextAssignment_4_in_rule__ContentForm__Group__44177);
                    rule__ContentForm__CollectionContextAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getCollectionContextAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__44187);
            rule__ContentForm__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__4


    // $ANTLR start rule__ContentForm__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2013:1: rule__ContentForm__Group__5 : ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 ;
    public final void rule__ContentForm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2017:1: ( ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2018:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) ) rule__ContentForm__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2018:1: ( ( rule__ContentForm__ContextRefAssignment_5 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2019:1: ( rule__ContentForm__ContextRefAssignment_5 )
            {
             before(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2020:1: ( rule__ContentForm__ContextRefAssignment_5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2020:2: rule__ContentForm__ContextRefAssignment_5
            {
            pushFollow(FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__54215);
            rule__ContentForm__ContextRefAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getContextRefAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__54224);
            rule__ContentForm__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__5


    // $ANTLR start rule__ContentForm__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2031:1: rule__ContentForm__Group__6 : ( '[' ) rule__ContentForm__Group__7 ;
    public final void rule__ContentForm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2035:1: ( ( '[' ) rule__ContentForm__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2036:1: ( '[' ) rule__ContentForm__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2036:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2037:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__ContentForm__Group__64253); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__64263);
            rule__ContentForm__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__6


    // $ANTLR start rule__ContentForm__Group__7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2051:1: rule__ContentForm__Group__7 : ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 ;
    public final void rule__ContentForm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2055:1: ( ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2056:1: ( ( rule__ContentForm__Group_7__0 )? ) rule__ContentForm__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2056:1: ( ( rule__ContentForm__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2057:1: ( rule__ContentForm__Group_7__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2058:1: ( rule__ContentForm__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2058:2: rule__ContentForm__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__74291);
                    rule__ContentForm__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__74301);
            rule__ContentForm__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__7


    // $ANTLR start rule__ContentForm__Group__8
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2069:1: rule__ContentForm__Group__8 : ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 ;
    public final void rule__ContentForm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2073:1: ( ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2074:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* ) rule__ContentForm__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2074:1: ( ( rule__ContentForm__FormElementsAssignment_8 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2075:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            {
             before(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2076:1: ( rule__ContentForm__FormElementsAssignment_8 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING||LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2076:2: rule__ContentForm__FormElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__84329);
            	    rule__ContentForm__FormElementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getFormElementsAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__84339);
            rule__ContentForm__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__8


    // $ANTLR start rule__ContentForm__Group__9
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2087:1: rule__ContentForm__Group__9 : ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 ;
    public final void rule__ContentForm__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2091:1: ( ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2092:1: ( ( rule__ContentForm__Group_9__0 )? ) rule__ContentForm__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2092:1: ( ( rule__ContentForm__Group_9__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2093:1: ( rule__ContentForm__Group_9__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_9()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2094:1: ( rule__ContentForm__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2094:2: rule__ContentForm__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__94367);
                    rule__ContentForm__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_9()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__94377);
            rule__ContentForm__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__9


    // $ANTLR start rule__ContentForm__Group__10
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2105:1: rule__ContentForm__Group__10 : ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 ;
    public final void rule__ContentForm__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2109:1: ( ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2110:1: ( ( rule__ContentForm__Group_10__0 )? ) rule__ContentForm__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2110:1: ( ( rule__ContentForm__Group_10__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2111:1: ( rule__ContentForm__Group_10__0 )?
            {
             before(grammarAccess.getContentFormAccess().getGroup_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2112:1: ( rule__ContentForm__Group_10__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2112:2: rule__ContentForm__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__104405);
                    rule__ContentForm__Group_10__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentFormAccess().getGroup_10()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__104415);
            rule__ContentForm__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__10


    // $ANTLR start rule__ContentForm__Group__11
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2123:1: rule__ContentForm__Group__11 : ( ']' ) ;
    public final void rule__ContentForm__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2127:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2128:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2128:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2129:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_11()); 
            match(input,28,FOLLOW_28_in_rule__ContentForm__Group__114444); 
             after(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group__11


    // $ANTLR start rule__ContentForm__Group_7__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2166:1: rule__ContentForm__Group_7__0 : ( 'readonly' ) rule__ContentForm__Group_7__1 ;
    public final void rule__ContentForm__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2170:1: ( ( 'readonly' ) rule__ContentForm__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2171:1: ( 'readonly' ) rule__ContentForm__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2171:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2172:1: 'readonly'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 
            match(input,32,FOLLOW_32_in_rule__ContentForm__Group_7__04504); 
             after(grammarAccess.getContentFormAccess().getReadonlyKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__04514);
            rule__ContentForm__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_7__0


    // $ANTLR start rule__ContentForm__Group_7__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2186:1: rule__ContentForm__Group_7__1 : ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 ;
    public final void rule__ContentForm__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2190:1: ( ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2191:1: ( ( rule__ContentForm__Alternatives_7_1 ) ) rule__ContentForm__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2191:1: ( ( rule__ContentForm__Alternatives_7_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2192:1: ( rule__ContentForm__Alternatives_7_1 )
            {
             before(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2193:1: ( rule__ContentForm__Alternatives_7_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2193:2: rule__ContentForm__Alternatives_7_1
            {
            pushFollow(FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__14542);
            rule__ContentForm__Alternatives_7_1();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getAlternatives_7_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__14551);
            rule__ContentForm__Group_7__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_7__1


    // $ANTLR start rule__ContentForm__Group_7__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2204:1: rule__ContentForm__Group_7__2 : ( ';' ) ;
    public final void rule__ContentForm__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2208:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2209:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2209:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2210:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_7_2()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_7__24580); 
             after(grammarAccess.getContentFormAccess().getSemicolonKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_7__2


    // $ANTLR start rule__ContentForm__Group_9__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2229:1: rule__ContentForm__Group_9__0 : ( 'actions' ) rule__ContentForm__Group_9__1 ;
    public final void rule__ContentForm__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2233:1: ( ( 'actions' ) rule__ContentForm__Group_9__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2234:1: ( 'actions' ) rule__ContentForm__Group_9__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2234:1: ( 'actions' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2235:1: 'actions'
            {
             before(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 
            match(input,33,FOLLOW_33_in_rule__ContentForm__Group_9__04622); 
             after(grammarAccess.getContentFormAccess().getActionsKeyword_9_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__04632);
            rule__ContentForm__Group_9__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_9__0


    // $ANTLR start rule__ContentForm__Group_9__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2249:1: rule__ContentForm__Group_9__1 : ( '[' ) rule__ContentForm__Group_9__2 ;
    public final void rule__ContentForm__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2253:1: ( ( '[' ) rule__ContentForm__Group_9__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2254:1: ( '[' ) rule__ContentForm__Group_9__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2254:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2255:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 
            match(input,27,FOLLOW_27_in_rule__ContentForm__Group_9__14661); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_9_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__14671);
            rule__ContentForm__Group_9__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_9__1


    // $ANTLR start rule__ContentForm__Group_9__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2269:1: rule__ContentForm__Group_9__2 : ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 ;
    public final void rule__ContentForm__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2273:1: ( ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2274:1: ( ( rule__ContentForm__Group_9_2__0 )* ) rule__ContentForm__Group_9__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2274:1: ( ( rule__ContentForm__Group_9_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2275:1: ( rule__ContentForm__Group_9_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_9_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2276:1: ( rule__ContentForm__Group_9_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||(LA29_0>=14 && LA29_0<=20)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2276:2: rule__ContentForm__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__24699);
            	    rule__ContentForm__Group_9_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getGroup_9_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__24709);
            rule__ContentForm__Group_9__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_9__2


    // $ANTLR start rule__ContentForm__Group_9__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2287:1: rule__ContentForm__Group_9__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2291:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2292:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2292:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2293:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3()); 
            match(input,28,FOLLOW_28_in_rule__ContentForm__Group_9__34738); 
             after(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_9__3


    // $ANTLR start rule__ContentForm__Group_9_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2314:1: rule__ContentForm__Group_9_2__0 : ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 ;
    public final void rule__ContentForm__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2318:1: ( ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2319:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) ) rule__ContentForm__Group_9_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2319:1: ( ( rule__ContentForm__ActionsAssignment_9_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2320:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2321:1: ( rule__ContentForm__ActionsAssignment_9_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2321:2: rule__ContentForm__ActionsAssignment_9_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__04781);
            rule__ContentForm__ActionsAssignment_9_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__04790);
            rule__ContentForm__Group_9_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_9_2__0


    // $ANTLR start rule__ContentForm__Group_9_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2332:1: rule__ContentForm__Group_9_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2336:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2337:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2337:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2338:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_9_2__14819); 
             after(grammarAccess.getContentFormAccess().getSemicolonKeyword_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_9_2__1


    // $ANTLR start rule__ContentForm__Group_10__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2355:1: rule__ContentForm__Group_10__0 : ( 'processes' ) rule__ContentForm__Group_10__1 ;
    public final void rule__ContentForm__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2359:1: ( ( 'processes' ) rule__ContentForm__Group_10__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2360:1: ( 'processes' ) rule__ContentForm__Group_10__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2360:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2361:1: 'processes'
            {
             before(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 
            match(input,34,FOLLOW_34_in_rule__ContentForm__Group_10__04859); 
             after(grammarAccess.getContentFormAccess().getProcessesKeyword_10_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04869);
            rule__ContentForm__Group_10__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_10__0


    // $ANTLR start rule__ContentForm__Group_10__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2375:1: rule__ContentForm__Group_10__1 : ( '[' ) rule__ContentForm__Group_10__2 ;
    public final void rule__ContentForm__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2379:1: ( ( '[' ) rule__ContentForm__Group_10__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2380:1: ( '[' ) rule__ContentForm__Group_10__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2380:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2381:1: '['
            {
             before(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 
            match(input,27,FOLLOW_27_in_rule__ContentForm__Group_10__14898); 
             after(grammarAccess.getContentFormAccess().getLeftSquareBracketKeyword_10_1()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14908);
            rule__ContentForm__Group_10__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_10__1


    // $ANTLR start rule__ContentForm__Group_10__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2395:1: rule__ContentForm__Group_10__2 : ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 ;
    public final void rule__ContentForm__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2399:1: ( ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2400:1: ( ( rule__ContentForm__Group_10_2__0 )* ) rule__ContentForm__Group_10__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2400:1: ( ( rule__ContentForm__Group_10_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2401:1: ( rule__ContentForm__Group_10_2__0 )*
            {
             before(grammarAccess.getContentFormAccess().getGroup_10_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2402:1: ( rule__ContentForm__Group_10_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2402:2: rule__ContentForm__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24936);
            	    rule__ContentForm__Group_10_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getContentFormAccess().getGroup_10_2()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24946);
            rule__ContentForm__Group_10__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_10__2


    // $ANTLR start rule__ContentForm__Group_10__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2413:1: rule__ContentForm__Group_10__3 : ( ']' ) ;
    public final void rule__ContentForm__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2417:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2418:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2418:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2419:1: ']'
            {
             before(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10_3()); 
            match(input,28,FOLLOW_28_in_rule__ContentForm__Group_10__34975); 
             after(grammarAccess.getContentFormAccess().getRightSquareBracketKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_10__3


    // $ANTLR start rule__ContentForm__Group_10_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2440:1: rule__ContentForm__Group_10_2__0 : ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 ;
    public final void rule__ContentForm__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2444:1: ( ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2445:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) ) rule__ContentForm__Group_10_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2445:1: ( ( rule__ContentForm__ProcessesAssignment_10_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2446:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            {
             before(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2447:1: ( rule__ContentForm__ProcessesAssignment_10_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2447:2: rule__ContentForm__ProcessesAssignment_10_2_0
            {
            pushFollow(FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__05018);
            rule__ContentForm__ProcessesAssignment_10_2_0();
            _fsp--;


            }

             after(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0()); 

            }

            pushFollow(FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__05027);
            rule__ContentForm__Group_10_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_10_2__0


    // $ANTLR start rule__ContentForm__Group_10_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2458:1: rule__ContentForm__Group_10_2__1 : ( ';' ) ;
    public final void rule__ContentForm__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2462:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2463:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2463:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2464:1: ';'
            {
             before(grammarAccess.getContentFormAccess().getSemicolonKeyword_10_2_1()); 
            match(input,13,FOLLOW_13_in_rule__ContentForm__Group_10_2__15056); 
             after(grammarAccess.getContentFormAccess().getSemicolonKeyword_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__Group_10_2__1


    // $ANTLR start rule__Action__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2481:1: rule__Action__Group__0 : ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2485:1: ( ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2486:1: ( ( rule__Action__DescriptionAssignment_0 )? ) rule__Action__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2486:1: ( ( rule__Action__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2487:1: ( rule__Action__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2488:1: ( rule__Action__DescriptionAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2488:2: rule__Action__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__05095);
                    rule__Action__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__05105);
            rule__Action__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__0


    // $ANTLR start rule__Action__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2499:1: rule__Action__Group__1 : ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2503:1: ( ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2504:1: ( ( rule__Action__TypeAssignment_1 )? ) rule__Action__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2504:1: ( ( rule__Action__TypeAssignment_1 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2505:1: ( rule__Action__TypeAssignment_1 )?
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2506:1: ( rule__Action__TypeAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=14 && LA32_0<=20)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2506:2: rule__Action__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__15133);
                    rule__Action__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__15143);
            rule__Action__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__1


    // $ANTLR start rule__Action__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2517:1: rule__Action__Group__2 : ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2521:1: ( ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2522:1: ( ( rule__Action__NameAssignment_2 ) ) rule__Action__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2522:1: ( ( rule__Action__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2523:1: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2524:1: ( rule__Action__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2524:2: rule__Action__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__25171);
            rule__Action__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__25180);
            rule__Action__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__2


    // $ANTLR start rule__Action__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2535:1: rule__Action__Group__3 : ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2539:1: ( ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2540:1: ( ( rule__Action__Group_3__0 )? ) rule__Action__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2540:1: ( ( rule__Action__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2541:1: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2542:1: ( rule__Action__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2542:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__35208);
                    rule__Action__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__35218);
            rule__Action__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__3


    // $ANTLR start rule__Action__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2553:1: rule__Action__Group__4 : ( ( rule__Action__ProcessElementsAssignment_4 )? ) ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2557:1: ( ( ( rule__Action__ProcessElementsAssignment_4 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2558:1: ( ( rule__Action__ProcessElementsAssignment_4 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2558:1: ( ( rule__Action__ProcessElementsAssignment_4 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2559:1: ( rule__Action__ProcessElementsAssignment_4 )?
            {
             before(grammarAccess.getActionAccess().getProcessElementsAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2560:1: ( rule__Action__ProcessElementsAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=21 && LA34_0<=22)||LA34_0==30||(LA34_0>=47 && LA34_0<=48)||LA34_0==50||LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2560:2: rule__Action__ProcessElementsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Action__ProcessElementsAssignment_4_in_rule__Action__Group__45246);
                    rule__Action__ProcessElementsAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getProcessElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__4


    // $ANTLR start rule__Action__Group_3__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2580:1: rule__Action__Group_3__0 : ( 'label' ) rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2584:1: ( ( 'label' ) rule__Action__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2585:1: ( 'label' ) rule__Action__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2585:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2586:1: 'label'
            {
             before(grammarAccess.getActionAccess().getLabelKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__Action__Group_3__05292); 
             after(grammarAccess.getActionAccess().getLabelKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__05302);
            rule__Action__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__0


    // $ANTLR start rule__Action__Group_3__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2600:1: rule__Action__Group_3__1 : ( ( rule__Action__LabelAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2604:1: ( ( ( rule__Action__LabelAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2605:1: ( ( rule__Action__LabelAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2605:1: ( ( rule__Action__LabelAssignment_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2606:1: ( rule__Action__LabelAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getLabelAssignment_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2607:1: ( rule__Action__LabelAssignment_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2607:2: rule__Action__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Action__LabelAssignment_3_1_in_rule__Action__Group_3__15330);
            rule__Action__LabelAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getLabelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__1


    // $ANTLR start rule__CompoundDialogue__Group_0__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2621:1: rule__CompoundDialogue__Group_0__0 : ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 ;
    public final void rule__CompoundDialogue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2625:1: ( ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2626:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? ) rule__CompoundDialogue__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2626:1: ( ( rule__CompoundDialogue__DescriptionAssignment_0_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2627:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2628:1: ( rule__CompoundDialogue__DescriptionAssignment_0_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2628:2: rule__CompoundDialogue__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__05368);
                    rule__CompoundDialogue__DescriptionAssignment_0_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__05378);
            rule__CompoundDialogue__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0__0


    // $ANTLR start rule__CompoundDialogue__Group_0__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2639:1: rule__CompoundDialogue__Group_0__1 : ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 ;
    public final void rule__CompoundDialogue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2643:1: ( ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2644:1: ( 'CompoundDialogue' ) rule__CompoundDialogue__Group_0__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2644:1: ( 'CompoundDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2645:1: 'CompoundDialogue'
            {
             before(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 
            match(input,36,FOLLOW_36_in_rule__CompoundDialogue__Group_0__15407); 
             after(grammarAccess.getCompoundDialogueAccess().getCompoundDialogueKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__15417);
            rule__CompoundDialogue__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0__1


    // $ANTLR start rule__CompoundDialogue__Group_0__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2659:1: rule__CompoundDialogue__Group_0__2 : ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 ;
    public final void rule__CompoundDialogue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2663:1: ( ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2664:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) ) rule__CompoundDialogue__Group_0__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2664:1: ( ( rule__CompoundDialogue__NameAssignment_0_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2665:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2666:1: ( rule__CompoundDialogue__NameAssignment_0_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2666:2: rule__CompoundDialogue__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__25445);
            rule__CompoundDialogue__NameAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__25454);
            rule__CompoundDialogue__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0__2


    // $ANTLR start rule__CompoundDialogue__Group_0__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2677:1: rule__CompoundDialogue__Group_0__3 : ( 'context' ) rule__CompoundDialogue__Group_0__4 ;
    public final void rule__CompoundDialogue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2681:1: ( ( 'context' ) rule__CompoundDialogue__Group_0__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2682:1: ( 'context' ) rule__CompoundDialogue__Group_0__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2682:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2683:1: 'context'
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 
            match(input,31,FOLLOW_31_in_rule__CompoundDialogue__Group_0__35483); 
             after(grammarAccess.getCompoundDialogueAccess().getContextKeyword_0_3()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__35493);
            rule__CompoundDialogue__Group_0__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0__3


    // $ANTLR start rule__CompoundDialogue__Group_0__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2697:1: rule__CompoundDialogue__Group_0__4 : ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 ;
    public final void rule__CompoundDialogue__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2701:1: ( ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2702:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) ) rule__CompoundDialogue__Group_0__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2702:1: ( ( rule__CompoundDialogue__ContextRefAssignment_0_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2703:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2704:1: ( rule__CompoundDialogue__ContextRefAssignment_0_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2704:2: rule__CompoundDialogue__ContextRefAssignment_0_4
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__45521);
            rule__CompoundDialogue__ContextRefAssignment_0_4();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__45530);
            rule__CompoundDialogue__Group_0__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0__4


    // $ANTLR start rule__CompoundDialogue__Group_0__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2715:1: rule__CompoundDialogue__Group_0__5 : ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 ;
    public final void rule__CompoundDialogue__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2719:1: ( ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2720:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? ) rule__CompoundDialogue__Group_0__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2720:1: ( ( rule__CompoundDialogue__Group_0_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2721:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2722:1: ( rule__CompoundDialogue__Group_0_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2722:2: rule__CompoundDialogue__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__55558);
                    rule__CompoundDialogue__Group_0_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_5()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__55568);
            rule__CompoundDialogue__Group_0__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0__5


    // $ANTLR start rule__CompoundDialogue__Group_0__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2733:1: rule__CompoundDialogue__Group_0__6 : ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 ;
    public final void rule__CompoundDialogue__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2737:1: ( ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2738:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? ) rule__CompoundDialogue__Group_0__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2738:1: ( ( rule__CompoundDialogue__Group_0_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2739:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2740:1: ( rule__CompoundDialogue__Group_0_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2740:2: rule__CompoundDialogue__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__65596);
                    rule__CompoundDialogue__Group_0_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__65606);
            rule__CompoundDialogue__Group_0__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0__6


    // $ANTLR start rule__CompoundDialogue__Group_0__7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2751:1: rule__CompoundDialogue__Group_0__7 : ( ( rule__CompoundDialogue__Group_0_7__0 )? ) ;
    public final void rule__CompoundDialogue__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2755:1: ( ( ( rule__CompoundDialogue__Group_0_7__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2756:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2756:1: ( ( rule__CompoundDialogue__Group_0_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2757:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2758:1: ( rule__CompoundDialogue__Group_0_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2758:2: rule__CompoundDialogue__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__75634);
                    rule__CompoundDialogue__Group_0_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0__7


    // $ANTLR start rule__CompoundDialogue__Group_0_5__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2784:1: rule__CompoundDialogue__Group_0_5__0 : ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 ;
    public final void rule__CompoundDialogue__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2788:1: ( ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2789:1: ( 'readonly' ) rule__CompoundDialogue__Group_0_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2789:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2790:1: 'readonly'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 
            match(input,32,FOLLOW_32_in_rule__CompoundDialogue__Group_0_5__05686); 
             after(grammarAccess.getCompoundDialogueAccess().getReadonlyKeyword_0_5_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__05696);
            rule__CompoundDialogue__Group_0_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_5__0


    // $ANTLR start rule__CompoundDialogue__Group_0_5__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2804:1: rule__CompoundDialogue__Group_0_5__1 : ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 ;
    public final void rule__CompoundDialogue__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2808:1: ( ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2809:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) ) rule__CompoundDialogue__Group_0_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2809:1: ( ( rule__CompoundDialogue__Alternatives_0_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2810:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2811:1: ( rule__CompoundDialogue__Alternatives_0_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2811:2: rule__CompoundDialogue__Alternatives_0_5_1
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__15724);
            rule__CompoundDialogue__Alternatives_0_5_1();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__15733);
            rule__CompoundDialogue__Group_0_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_5__1


    // $ANTLR start rule__CompoundDialogue__Group_0_5__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2822:1: rule__CompoundDialogue__Group_0_5__2 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2826:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2827:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2827:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2828:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_5__25762); 
             after(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_5__2


    // $ANTLR start rule__CompoundDialogue__Group_0_6__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2847:1: rule__CompoundDialogue__Group_0_6__0 : ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 ;
    public final void rule__CompoundDialogue__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2851:1: ( ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2852:1: ( 'dialogues' ) rule__CompoundDialogue__Group_0_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2852:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2853:1: 'dialogues'
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 
            match(input,37,FOLLOW_37_in_rule__CompoundDialogue__Group_0_6__05804); 
             after(grammarAccess.getCompoundDialogueAccess().getDialoguesKeyword_0_6_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__05814);
            rule__CompoundDialogue__Group_0_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_6__0


    // $ANTLR start rule__CompoundDialogue__Group_0_6__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2867:1: rule__CompoundDialogue__Group_0_6__1 : ( '[' ) rule__CompoundDialogue__Group_0_6__2 ;
    public final void rule__CompoundDialogue__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2871:1: ( ( '[' ) rule__CompoundDialogue__Group_0_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2872:1: ( '[' ) rule__CompoundDialogue__Group_0_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2872:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2873:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 
            match(input,27,FOLLOW_27_in_rule__CompoundDialogue__Group_0_6__15843); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_6_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__15853);
            rule__CompoundDialogue__Group_0_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_6__1


    // $ANTLR start rule__CompoundDialogue__Group_0_6__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2887:1: rule__CompoundDialogue__Group_0_6__2 : ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 ;
    public final void rule__CompoundDialogue__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2891:1: ( ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2892:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* ) rule__CompoundDialogue__Group_0_6__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2892:1: ( ( rule__CompoundDialogue__Group_0_6_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2893:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2894:1: ( rule__CompoundDialogue__Group_0_6_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_STRING||(LA39_0>=21 && LA39_0<=22)||LA39_0==30||LA39_0==44||(LA39_0>=47 && LA39_0<=48)||LA39_0==50||LA39_0==53) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2894:2: rule__CompoundDialogue__Group_0_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__25881);
            	    rule__CompoundDialogue__Group_0_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25891);
            rule__CompoundDialogue__Group_0_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_6__2


    // $ANTLR start rule__CompoundDialogue__Group_0_6__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2905:1: rule__CompoundDialogue__Group_0_6__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2909:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2910:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2910:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2911:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3()); 
            match(input,28,FOLLOW_28_in_rule__CompoundDialogue__Group_0_6__35920); 
             after(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_6__3


    // $ANTLR start rule__CompoundDialogue__Group_0_6_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2932:1: rule__CompoundDialogue__Group_0_6_2__0 : ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 ;
    public final void rule__CompoundDialogue__Group_0_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2936:1: ( ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2937:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) ) rule__CompoundDialogue__Group_0_6_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2937:1: ( ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2938:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2939:1: ( rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2939:2: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05963);
            rule__CompoundDialogue__DialoguesAssignment_0_6_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05972);
            rule__CompoundDialogue__Group_0_6_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_6_2__0


    // $ANTLR start rule__CompoundDialogue__Group_0_6_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2950:1: rule__CompoundDialogue__Group_0_6_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2954:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2955:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2955:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2956:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_6_2__16001); 
             after(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_6_2__1


    // $ANTLR start rule__CompoundDialogue__Group_0_7__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2973:1: rule__CompoundDialogue__Group_0_7__0 : ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 ;
    public final void rule__CompoundDialogue__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2977:1: ( ( 'processes' ) rule__CompoundDialogue__Group_0_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2978:1: ( 'processes' ) rule__CompoundDialogue__Group_0_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2978:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2979:1: 'processes'
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 
            match(input,34,FOLLOW_34_in_rule__CompoundDialogue__Group_0_7__06041); 
             after(grammarAccess.getCompoundDialogueAccess().getProcessesKeyword_0_7_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__06051);
            rule__CompoundDialogue__Group_0_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_7__0


    // $ANTLR start rule__CompoundDialogue__Group_0_7__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2993:1: rule__CompoundDialogue__Group_0_7__1 : ( '[' ) rule__CompoundDialogue__Group_0_7__2 ;
    public final void rule__CompoundDialogue__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2997:1: ( ( '[' ) rule__CompoundDialogue__Group_0_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2998:1: ( '[' ) rule__CompoundDialogue__Group_0_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2998:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:2999:1: '['
            {
             before(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 
            match(input,27,FOLLOW_27_in_rule__CompoundDialogue__Group_0_7__16080); 
             after(grammarAccess.getCompoundDialogueAccess().getLeftSquareBracketKeyword_0_7_1()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__16090);
            rule__CompoundDialogue__Group_0_7__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_7__1


    // $ANTLR start rule__CompoundDialogue__Group_0_7__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3013:1: rule__CompoundDialogue__Group_0_7__2 : ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 ;
    public final void rule__CompoundDialogue__Group_0_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3017:1: ( ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3018:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* ) rule__CompoundDialogue__Group_0_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3018:1: ( ( rule__CompoundDialogue__Group_0_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3019:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            {
             before(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3020:1: ( rule__CompoundDialogue__Group_0_7_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_STRING||(LA40_0>=21 && LA40_0<=22)||LA40_0==25||LA40_0==44||(LA40_0>=47 && LA40_0<=48)||LA40_0==50||LA40_0==53) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3020:2: rule__CompoundDialogue__Group_0_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__26118);
            	    rule__CompoundDialogue__Group_0_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__26128);
            rule__CompoundDialogue__Group_0_7__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_7__2


    // $ANTLR start rule__CompoundDialogue__Group_0_7__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3031:1: rule__CompoundDialogue__Group_0_7__3 : ( ']' ) ;
    public final void rule__CompoundDialogue__Group_0_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3035:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3036:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3036:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3037:1: ']'
            {
             before(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3()); 
            match(input,28,FOLLOW_28_in_rule__CompoundDialogue__Group_0_7__36157); 
             after(grammarAccess.getCompoundDialogueAccess().getRightSquareBracketKeyword_0_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_7__3


    // $ANTLR start rule__CompoundDialogue__Group_0_7_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3058:1: rule__CompoundDialogue__Group_0_7_2__0 : ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 ;
    public final void rule__CompoundDialogue__Group_0_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3062:1: ( ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3063:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) ) rule__CompoundDialogue__Group_0_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3063:1: ( ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3064:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3065:1: ( rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3065:2: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0
            {
            pushFollow(FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__06200);
            rule__CompoundDialogue__ProcessesAssignment_0_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__06209);
            rule__CompoundDialogue__Group_0_7_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_7_2__0


    // $ANTLR start rule__CompoundDialogue__Group_0_7_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3076:1: rule__CompoundDialogue__Group_0_7_2__1 : ( ';' ) ;
    public final void rule__CompoundDialogue__Group_0_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3080:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3081:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3081:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3082:1: ';'
            {
             before(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CompoundDialogue__Group_0_7_2__16238); 
             after(grammarAccess.getCompoundDialogueAccess().getSemicolonKeyword_0_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__Group_0_7_2__1


    // $ANTLR start rule__CollectionDialogue__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3099:1: rule__CollectionDialogue__Group__0 : ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 ;
    public final void rule__CollectionDialogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3103:1: ( ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3104:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? ) rule__CollectionDialogue__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3104:1: ( ( rule__CollectionDialogue__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3105:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3106:1: ( rule__CollectionDialogue__DescriptionAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3106:2: rule__CollectionDialogue__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__06277);
                    rule__CollectionDialogue__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__06287);
            rule__CollectionDialogue__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__0


    // $ANTLR start rule__CollectionDialogue__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3117:1: rule__CollectionDialogue__Group__1 : ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 ;
    public final void rule__CollectionDialogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3121:1: ( ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3122:1: ( 'CollectionDialogue' ) rule__CollectionDialogue__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3122:1: ( 'CollectionDialogue' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3123:1: 'CollectionDialogue'
            {
             before(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__CollectionDialogue__Group__16316); 
             after(grammarAccess.getCollectionDialogueAccess().getCollectionDialogueKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__16326);
            rule__CollectionDialogue__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__1


    // $ANTLR start rule__CollectionDialogue__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3137:1: rule__CollectionDialogue__Group__2 : ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 ;
    public final void rule__CollectionDialogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3141:1: ( ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3142:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) ) rule__CollectionDialogue__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3142:1: ( ( rule__CollectionDialogue__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3143:1: ( rule__CollectionDialogue__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3144:1: ( rule__CollectionDialogue__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3144:2: rule__CollectionDialogue__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__26354);
            rule__CollectionDialogue__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__26363);
            rule__CollectionDialogue__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__2


    // $ANTLR start rule__CollectionDialogue__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3155:1: rule__CollectionDialogue__Group__3 : ( 'context' ) rule__CollectionDialogue__Group__4 ;
    public final void rule__CollectionDialogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3159:1: ( ( 'context' ) rule__CollectionDialogue__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3160:1: ( 'context' ) rule__CollectionDialogue__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3160:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3161:1: 'context'
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__CollectionDialogue__Group__36392); 
             after(grammarAccess.getCollectionDialogueAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__36402);
            rule__CollectionDialogue__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__3


    // $ANTLR start rule__CollectionDialogue__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3175:1: rule__CollectionDialogue__Group__4 : ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 ;
    public final void rule__CollectionDialogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3179:1: ( ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3180:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) ) rule__CollectionDialogue__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3180:1: ( ( rule__CollectionDialogue__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3181:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3182:1: ( rule__CollectionDialogue__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3182:2: rule__CollectionDialogue__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__46430);
            rule__CollectionDialogue__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__46439);
            rule__CollectionDialogue__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__4


    // $ANTLR start rule__CollectionDialogue__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3193:1: rule__CollectionDialogue__Group__5 : ( '[' ) rule__CollectionDialogue__Group__6 ;
    public final void rule__CollectionDialogue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3197:1: ( ( '[' ) rule__CollectionDialogue__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3198:1: ( '[' ) rule__CollectionDialogue__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3198:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3199:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__CollectionDialogue__Group__56468); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__56478);
            rule__CollectionDialogue__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__5


    // $ANTLR start rule__CollectionDialogue__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3213:1: rule__CollectionDialogue__Group__6 : ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 ;
    public final void rule__CollectionDialogue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3217:1: ( ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3218:1: ( ( rule__CollectionDialogue__Group_6__0 )? ) rule__CollectionDialogue__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3218:1: ( ( rule__CollectionDialogue__Group_6__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3219:1: ( rule__CollectionDialogue__Group_6__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3220:1: ( rule__CollectionDialogue__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3220:2: rule__CollectionDialogue__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__66506);
                    rule__CollectionDialogue__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_6()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__66516);
            rule__CollectionDialogue__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__6


    // $ANTLR start rule__CollectionDialogue__Group__7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3231:1: rule__CollectionDialogue__Group__7 : ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 ;
    public final void rule__CollectionDialogue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3235:1: ( ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3236:1: ( ( rule__CollectionDialogue__Group_7__0 )? ) rule__CollectionDialogue__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3236:1: ( ( rule__CollectionDialogue__Group_7__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3237:1: ( rule__CollectionDialogue__Group_7__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3238:1: ( rule__CollectionDialogue__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3238:2: rule__CollectionDialogue__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__76544);
                    rule__CollectionDialogue__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__76554);
            rule__CollectionDialogue__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__7


    // $ANTLR start rule__CollectionDialogue__Group__8
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3249:1: rule__CollectionDialogue__Group__8 : ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 ;
    public final void rule__CollectionDialogue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3253:1: ( ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3254:1: ( ( rule__CollectionDialogue__Group_8__0 )? ) rule__CollectionDialogue__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3254:1: ( ( rule__CollectionDialogue__Group_8__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3255:1: ( rule__CollectionDialogue__Group_8__0 )?
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3256:1: ( rule__CollectionDialogue__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3256:2: rule__CollectionDialogue__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__86582);
                    rule__CollectionDialogue__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__86592);
            rule__CollectionDialogue__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__8


    // $ANTLR start rule__CollectionDialogue__Group__9
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3267:1: rule__CollectionDialogue__Group__9 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3271:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3272:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3272:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3273:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_9()); 
            match(input,28,FOLLOW_28_in_rule__CollectionDialogue__Group__96621); 
             after(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group__9


    // $ANTLR start rule__CollectionDialogue__Group_6__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3306:1: rule__CollectionDialogue__Group_6__0 : ( 'readonly' ) rule__CollectionDialogue__Group_6__1 ;
    public final void rule__CollectionDialogue__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3310:1: ( ( 'readonly' ) rule__CollectionDialogue__Group_6__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3311:1: ( 'readonly' ) rule__CollectionDialogue__Group_6__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3311:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3312:1: 'readonly'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 
            match(input,32,FOLLOW_32_in_rule__CollectionDialogue__Group_6__06677); 
             after(grammarAccess.getCollectionDialogueAccess().getReadonlyKeyword_6_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__06687);
            rule__CollectionDialogue__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_6__0


    // $ANTLR start rule__CollectionDialogue__Group_6__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3326:1: rule__CollectionDialogue__Group_6__1 : ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 ;
    public final void rule__CollectionDialogue__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3330:1: ( ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3331:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) ) rule__CollectionDialogue__Group_6__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3331:1: ( ( rule__CollectionDialogue__Alternatives_6_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3332:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3333:1: ( rule__CollectionDialogue__Alternatives_6_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3333:2: rule__CollectionDialogue__Alternatives_6_1
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__16715);
            rule__CollectionDialogue__Alternatives_6_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__16724);
            rule__CollectionDialogue__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_6__1


    // $ANTLR start rule__CollectionDialogue__Group_6__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3344:1: rule__CollectionDialogue__Group_6__2 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3348:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3349:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3349:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3350:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_6__26753); 
             after(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_6__2


    // $ANTLR start rule__CollectionDialogue__Group_7__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3369:1: rule__CollectionDialogue__Group_7__0 : ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 ;
    public final void rule__CollectionDialogue__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3373:1: ( ( 'dialogues' ) rule__CollectionDialogue__Group_7__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3374:1: ( 'dialogues' ) rule__CollectionDialogue__Group_7__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3374:1: ( 'dialogues' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3375:1: 'dialogues'
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 
            match(input,37,FOLLOW_37_in_rule__CollectionDialogue__Group_7__06795); 
             after(grammarAccess.getCollectionDialogueAccess().getDialoguesKeyword_7_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__06805);
            rule__CollectionDialogue__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_7__0


    // $ANTLR start rule__CollectionDialogue__Group_7__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3389:1: rule__CollectionDialogue__Group_7__1 : ( '[' ) rule__CollectionDialogue__Group_7__2 ;
    public final void rule__CollectionDialogue__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3393:1: ( ( '[' ) rule__CollectionDialogue__Group_7__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:1: ( '[' ) rule__CollectionDialogue__Group_7__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3394:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3395:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,27,FOLLOW_27_in_rule__CollectionDialogue__Group_7__16834); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_7_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__16844);
            rule__CollectionDialogue__Group_7__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_7__1


    // $ANTLR start rule__CollectionDialogue__Group_7__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3409:1: rule__CollectionDialogue__Group_7__2 : ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 ;
    public final void rule__CollectionDialogue__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3413:1: ( ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3414:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* ) rule__CollectionDialogue__Group_7__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3414:1: ( ( rule__CollectionDialogue__Group_7_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3415:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3416:1: ( rule__CollectionDialogue__Group_7_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_STRING||(LA45_0>=21 && LA45_0<=22)||LA45_0==30||LA45_0==44||(LA45_0>=47 && LA45_0<=48)||LA45_0==50||LA45_0==53) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3416:2: rule__CollectionDialogue__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__26872);
            	    rule__CollectionDialogue__Group_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getCollectionDialogueAccess().getGroup_7_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__26882);
            rule__CollectionDialogue__Group_7__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_7__2


    // $ANTLR start rule__CollectionDialogue__Group_7__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3427:1: rule__CollectionDialogue__Group_7__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3431:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3432:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3432:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3433:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3()); 
            match(input,28,FOLLOW_28_in_rule__CollectionDialogue__Group_7__36911); 
             after(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_7__3


    // $ANTLR start rule__CollectionDialogue__Group_7_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3454:1: rule__CollectionDialogue__Group_7_2__0 : ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 ;
    public final void rule__CollectionDialogue__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3458:1: ( ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3459:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) ) rule__CollectionDialogue__Group_7_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3459:1: ( ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3460:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3461:1: ( rule__CollectionDialogue__DialoguesAssignment_7_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3461:2: rule__CollectionDialogue__DialoguesAssignment_7_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06954);
            rule__CollectionDialogue__DialoguesAssignment_7_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06963);
            rule__CollectionDialogue__Group_7_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_7_2__0


    // $ANTLR start rule__CollectionDialogue__Group_7_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3472:1: rule__CollectionDialogue__Group_7_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3476:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3477:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3477:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3478:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_7_2__16992); 
             after(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_7_2__1


    // $ANTLR start rule__CollectionDialogue__Group_8__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3495:1: rule__CollectionDialogue__Group_8__0 : ( 'processes' ) rule__CollectionDialogue__Group_8__1 ;
    public final void rule__CollectionDialogue__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3499:1: ( ( 'processes' ) rule__CollectionDialogue__Group_8__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3500:1: ( 'processes' ) rule__CollectionDialogue__Group_8__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3500:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3501:1: 'processes'
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 
            match(input,34,FOLLOW_34_in_rule__CollectionDialogue__Group_8__07032); 
             after(grammarAccess.getCollectionDialogueAccess().getProcessesKeyword_8_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__07042);
            rule__CollectionDialogue__Group_8__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_8__0


    // $ANTLR start rule__CollectionDialogue__Group_8__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3515:1: rule__CollectionDialogue__Group_8__1 : ( '[' ) rule__CollectionDialogue__Group_8__2 ;
    public final void rule__CollectionDialogue__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3519:1: ( ( '[' ) rule__CollectionDialogue__Group_8__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3520:1: ( '[' ) rule__CollectionDialogue__Group_8__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3520:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3521:1: '['
            {
             before(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 
            match(input,27,FOLLOW_27_in_rule__CollectionDialogue__Group_8__17071); 
             after(grammarAccess.getCollectionDialogueAccess().getLeftSquareBracketKeyword_8_1()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__17081);
            rule__CollectionDialogue__Group_8__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_8__1


    // $ANTLR start rule__CollectionDialogue__Group_8__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3535:1: rule__CollectionDialogue__Group_8__2 : ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 ;
    public final void rule__CollectionDialogue__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3539:1: ( ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3540:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* ) rule__CollectionDialogue__Group_8__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3540:1: ( ( rule__CollectionDialogue__Group_8_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3541:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            {
             before(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3542:1: ( rule__CollectionDialogue__Group_8_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_STRING||(LA46_0>=21 && LA46_0<=22)||LA46_0==25||LA46_0==44||(LA46_0>=47 && LA46_0<=48)||LA46_0==50||LA46_0==53) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3542:2: rule__CollectionDialogue__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__27109);
            	    rule__CollectionDialogue__Group_8_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCollectionDialogueAccess().getGroup_8_2()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__27119);
            rule__CollectionDialogue__Group_8__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_8__2


    // $ANTLR start rule__CollectionDialogue__Group_8__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3553:1: rule__CollectionDialogue__Group_8__3 : ( ']' ) ;
    public final void rule__CollectionDialogue__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3557:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3558:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3558:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3559:1: ']'
            {
             before(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3()); 
            match(input,28,FOLLOW_28_in_rule__CollectionDialogue__Group_8__37148); 
             after(grammarAccess.getCollectionDialogueAccess().getRightSquareBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_8__3


    // $ANTLR start rule__CollectionDialogue__Group_8_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3580:1: rule__CollectionDialogue__Group_8_2__0 : ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 ;
    public final void rule__CollectionDialogue__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3584:1: ( ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3585:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) ) rule__CollectionDialogue__Group_8_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3585:1: ( ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3586:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3587:1: ( rule__CollectionDialogue__ProcessesAssignment_8_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3587:2: rule__CollectionDialogue__ProcessesAssignment_8_2_0
            {
            pushFollow(FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__07191);
            rule__CollectionDialogue__ProcessesAssignment_8_2_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0()); 

            }

            pushFollow(FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__07200);
            rule__CollectionDialogue__Group_8_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_8_2__0


    // $ANTLR start rule__CollectionDialogue__Group_8_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3598:1: rule__CollectionDialogue__Group_8_2__1 : ( ';' ) ;
    public final void rule__CollectionDialogue__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3602:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3603:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3603:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3604:1: ';'
            {
             before(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1()); 
            match(input,13,FOLLOW_13_in_rule__CollectionDialogue__Group_8_2__17229); 
             after(grammarAccess.getCollectionDialogueAccess().getSemicolonKeyword_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__Group_8_2__1


    // $ANTLR start rule__MasterDetail__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3621:1: rule__MasterDetail__Group__0 : ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 ;
    public final void rule__MasterDetail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3625:1: ( ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3626:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? ) rule__MasterDetail__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3626:1: ( ( rule__MasterDetail__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3627:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3628:1: ( rule__MasterDetail__DescriptionAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3628:2: rule__MasterDetail__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__07268);
                    rule__MasterDetail__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__07278);
            rule__MasterDetail__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__0


    // $ANTLR start rule__MasterDetail__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3639:1: rule__MasterDetail__Group__1 : ( 'MasterDetail' ) rule__MasterDetail__Group__2 ;
    public final void rule__MasterDetail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3643:1: ( ( 'MasterDetail' ) rule__MasterDetail__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3644:1: ( 'MasterDetail' ) rule__MasterDetail__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3644:1: ( 'MasterDetail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3645:1: 'MasterDetail'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__MasterDetail__Group__17307); 
             after(grammarAccess.getMasterDetailAccess().getMasterDetailKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__17317);
            rule__MasterDetail__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__1


    // $ANTLR start rule__MasterDetail__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3659:1: rule__MasterDetail__Group__2 : ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 ;
    public final void rule__MasterDetail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3663:1: ( ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3664:1: ( ( rule__MasterDetail__NameAssignment_2 ) ) rule__MasterDetail__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3664:1: ( ( rule__MasterDetail__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3665:1: ( rule__MasterDetail__NameAssignment_2 )
            {
             before(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3666:1: ( rule__MasterDetail__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3666:2: rule__MasterDetail__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__27345);
            rule__MasterDetail__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__27354);
            rule__MasterDetail__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__2


    // $ANTLR start rule__MasterDetail__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3677:1: rule__MasterDetail__Group__3 : ( 'context' ) rule__MasterDetail__Group__4 ;
    public final void rule__MasterDetail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3681:1: ( ( 'context' ) rule__MasterDetail__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3682:1: ( 'context' ) rule__MasterDetail__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3682:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3683:1: 'context'
            {
             before(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__MasterDetail__Group__37383); 
             after(grammarAccess.getMasterDetailAccess().getContextKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__37393);
            rule__MasterDetail__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__3


    // $ANTLR start rule__MasterDetail__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3697:1: rule__MasterDetail__Group__4 : ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 ;
    public final void rule__MasterDetail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3701:1: ( ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3702:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) ) rule__MasterDetail__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3702:1: ( ( rule__MasterDetail__ContextRefAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3703:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3704:1: ( rule__MasterDetail__ContextRefAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3704:2: rule__MasterDetail__ContextRefAssignment_4
            {
            pushFollow(FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__47421);
            rule__MasterDetail__ContextRefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__47430);
            rule__MasterDetail__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__4


    // $ANTLR start rule__MasterDetail__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3715:1: rule__MasterDetail__Group__5 : ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 ;
    public final void rule__MasterDetail__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3719:1: ( ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3720:1: ( ( rule__MasterDetail__Group_5__0 )? ) rule__MasterDetail__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3720:1: ( ( rule__MasterDetail__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3721:1: ( rule__MasterDetail__Group_5__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3722:1: ( rule__MasterDetail__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3722:2: rule__MasterDetail__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__57458);
                    rule__MasterDetail__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getGroup_5()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__57468);
            rule__MasterDetail__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__5


    // $ANTLR start rule__MasterDetail__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3733:1: rule__MasterDetail__Group__6 : ( 'master' ) rule__MasterDetail__Group__7 ;
    public final void rule__MasterDetail__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3737:1: ( ( 'master' ) rule__MasterDetail__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3738:1: ( 'master' ) rule__MasterDetail__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3738:1: ( 'master' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3739:1: 'master'
            {
             before(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 
            match(input,40,FOLLOW_40_in_rule__MasterDetail__Group__67497); 
             after(grammarAccess.getMasterDetailAccess().getMasterKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__67507);
            rule__MasterDetail__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__6


    // $ANTLR start rule__MasterDetail__Group__7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3753:1: rule__MasterDetail__Group__7 : ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 ;
    public final void rule__MasterDetail__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3757:1: ( ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3758:1: ( ( rule__MasterDetail__MasterAssignment_7 ) ) rule__MasterDetail__Group__8
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3758:1: ( ( rule__MasterDetail__MasterAssignment_7 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3759:1: ( rule__MasterDetail__MasterAssignment_7 )
            {
             before(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3760:1: ( rule__MasterDetail__MasterAssignment_7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3760:2: rule__MasterDetail__MasterAssignment_7
            {
            pushFollow(FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__77535);
            rule__MasterDetail__MasterAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getMasterAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__77544);
            rule__MasterDetail__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__7


    // $ANTLR start rule__MasterDetail__Group__8
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3771:1: rule__MasterDetail__Group__8 : ( ';' ) rule__MasterDetail__Group__9 ;
    public final void rule__MasterDetail__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3775:1: ( ( ';' ) rule__MasterDetail__Group__9 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3776:1: ( ';' ) rule__MasterDetail__Group__9
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3776:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3777:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group__87573); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__87583);
            rule__MasterDetail__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__8


    // $ANTLR start rule__MasterDetail__Group__9
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3791:1: rule__MasterDetail__Group__9 : ( 'detail' ) rule__MasterDetail__Group__10 ;
    public final void rule__MasterDetail__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3795:1: ( ( 'detail' ) rule__MasterDetail__Group__10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3796:1: ( 'detail' ) rule__MasterDetail__Group__10
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3796:1: ( 'detail' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3797:1: 'detail'
            {
             before(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 
            match(input,41,FOLLOW_41_in_rule__MasterDetail__Group__97612); 
             after(grammarAccess.getMasterDetailAccess().getDetailKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__97622);
            rule__MasterDetail__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__9


    // $ANTLR start rule__MasterDetail__Group__10
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3811:1: rule__MasterDetail__Group__10 : ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 ;
    public final void rule__MasterDetail__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3815:1: ( ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3816:1: ( ( rule__MasterDetail__DetailAssignment_10 ) ) rule__MasterDetail__Group__11
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3816:1: ( ( rule__MasterDetail__DetailAssignment_10 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3817:1: ( rule__MasterDetail__DetailAssignment_10 )
            {
             before(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3818:1: ( rule__MasterDetail__DetailAssignment_10 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3818:2: rule__MasterDetail__DetailAssignment_10
            {
            pushFollow(FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__107650);
            rule__MasterDetail__DetailAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getDetailAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__107659);
            rule__MasterDetail__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__10


    // $ANTLR start rule__MasterDetail__Group__11
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3829:1: rule__MasterDetail__Group__11 : ( ';' ) rule__MasterDetail__Group__12 ;
    public final void rule__MasterDetail__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3833:1: ( ( ';' ) rule__MasterDetail__Group__12 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3834:1: ( ';' ) rule__MasterDetail__Group__12
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3834:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3835:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group__117688); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_11()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__117698);
            rule__MasterDetail__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__11


    // $ANTLR start rule__MasterDetail__Group__12
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3849:1: rule__MasterDetail__Group__12 : ( ( rule__MasterDetail__Group_12__0 )? ) ;
    public final void rule__MasterDetail__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3853:1: ( ( ( rule__MasterDetail__Group_12__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3854:1: ( ( rule__MasterDetail__Group_12__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3854:1: ( ( rule__MasterDetail__Group_12__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3855:1: ( rule__MasterDetail__Group_12__0 )?
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3856:1: ( rule__MasterDetail__Group_12__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3856:2: rule__MasterDetail__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__127726);
                    rule__MasterDetail__Group_12__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMasterDetailAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group__12


    // $ANTLR start rule__MasterDetail__Group_5__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3892:1: rule__MasterDetail__Group_5__0 : ( 'readonly' ) rule__MasterDetail__Group_5__1 ;
    public final void rule__MasterDetail__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3896:1: ( ( 'readonly' ) rule__MasterDetail__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3897:1: ( 'readonly' ) rule__MasterDetail__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3897:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3898:1: 'readonly'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 
            match(input,32,FOLLOW_32_in_rule__MasterDetail__Group_5__07788); 
             after(grammarAccess.getMasterDetailAccess().getReadonlyKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__07798);
            rule__MasterDetail__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_5__0


    // $ANTLR start rule__MasterDetail__Group_5__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3912:1: rule__MasterDetail__Group_5__1 : ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 ;
    public final void rule__MasterDetail__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3916:1: ( ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3917:1: ( ( rule__MasterDetail__Alternatives_5_1 ) ) rule__MasterDetail__Group_5__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3917:1: ( ( rule__MasterDetail__Alternatives_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3918:1: ( rule__MasterDetail__Alternatives_5_1 )
            {
             before(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3919:1: ( rule__MasterDetail__Alternatives_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3919:2: rule__MasterDetail__Alternatives_5_1
            {
            pushFollow(FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__17826);
            rule__MasterDetail__Alternatives_5_1();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getAlternatives_5_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__17835);
            rule__MasterDetail__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_5__1


    // $ANTLR start rule__MasterDetail__Group_5__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3930:1: rule__MasterDetail__Group_5__2 : ( ';' ) ;
    public final void rule__MasterDetail__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3934:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3935:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3935:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3936:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group_5__27864); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_5__2


    // $ANTLR start rule__MasterDetail__Group_12__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3955:1: rule__MasterDetail__Group_12__0 : ( 'processes' ) rule__MasterDetail__Group_12__1 ;
    public final void rule__MasterDetail__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3959:1: ( ( 'processes' ) rule__MasterDetail__Group_12__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3960:1: ( 'processes' ) rule__MasterDetail__Group_12__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3960:1: ( 'processes' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3961:1: 'processes'
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 
            match(input,34,FOLLOW_34_in_rule__MasterDetail__Group_12__07906); 
             after(grammarAccess.getMasterDetailAccess().getProcessesKeyword_12_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07916);
            rule__MasterDetail__Group_12__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_12__0


    // $ANTLR start rule__MasterDetail__Group_12__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3975:1: rule__MasterDetail__Group_12__1 : ( '[' ) rule__MasterDetail__Group_12__2 ;
    public final void rule__MasterDetail__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3979:1: ( ( '[' ) rule__MasterDetail__Group_12__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3980:1: ( '[' ) rule__MasterDetail__Group_12__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3980:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3981:1: '['
            {
             before(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,27,FOLLOW_27_in_rule__MasterDetail__Group_12__17945); 
             after(grammarAccess.getMasterDetailAccess().getLeftSquareBracketKeyword_12_1()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17955);
            rule__MasterDetail__Group_12__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_12__1


    // $ANTLR start rule__MasterDetail__Group_12__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3995:1: rule__MasterDetail__Group_12__2 : ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 ;
    public final void rule__MasterDetail__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:3999:1: ( ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4000:1: ( ( rule__MasterDetail__Group_12_2__0 )* ) rule__MasterDetail__Group_12__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4000:1: ( ( rule__MasterDetail__Group_12_2__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4001:1: ( rule__MasterDetail__Group_12_2__0 )*
            {
             before(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4002:1: ( rule__MasterDetail__Group_12_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_STRING||(LA50_0>=21 && LA50_0<=22)||LA50_0==25||LA50_0==44||(LA50_0>=47 && LA50_0<=48)||LA50_0==50||LA50_0==53) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4002:2: rule__MasterDetail__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27983);
            	    rule__MasterDetail__Group_12_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getMasterDetailAccess().getGroup_12_2()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27993);
            rule__MasterDetail__Group_12__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_12__2


    // $ANTLR start rule__MasterDetail__Group_12__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4013:1: rule__MasterDetail__Group_12__3 : ( ']' ) ;
    public final void rule__MasterDetail__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4017:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4018:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4018:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4019:1: ']'
            {
             before(grammarAccess.getMasterDetailAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,28,FOLLOW_28_in_rule__MasterDetail__Group_12__38022); 
             after(grammarAccess.getMasterDetailAccess().getRightSquareBracketKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_12__3


    // $ANTLR start rule__MasterDetail__Group_12_2__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4040:1: rule__MasterDetail__Group_12_2__0 : ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 ;
    public final void rule__MasterDetail__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4044:1: ( ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4045:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) ) rule__MasterDetail__Group_12_2__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4045:1: ( ( rule__MasterDetail__ProcessesAssignment_12_2_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4046:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4047:1: ( rule__MasterDetail__ProcessesAssignment_12_2_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4047:2: rule__MasterDetail__ProcessesAssignment_12_2_0
            {
            pushFollow(FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__08065);
            rule__MasterDetail__ProcessesAssignment_12_2_0();
            _fsp--;


            }

             after(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0()); 

            }

            pushFollow(FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__08074);
            rule__MasterDetail__Group_12_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_12_2__0


    // $ANTLR start rule__MasterDetail__Group_12_2__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4058:1: rule__MasterDetail__Group_12_2__1 : ( ';' ) ;
    public final void rule__MasterDetail__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4062:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4063:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4063:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4064:1: ';'
            {
             before(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1()); 
            match(input,13,FOLLOW_13_in_rule__MasterDetail__Group_12_2__18103); 
             after(grammarAccess.getMasterDetailAccess().getSemicolonKeyword_12_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__Group_12_2__1


    // $ANTLR start rule__Process__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4081:1: rule__Process__Group__0 : ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4085:1: ( ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4086:1: ( ( rule__Process__DescriptionAssignment_0 )? ) rule__Process__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4086:1: ( ( rule__Process__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4087:1: ( rule__Process__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProcessAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4088:1: ( rule__Process__DescriptionAssignment_0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4088:2: rule__Process__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Process__DescriptionAssignment_0_in_rule__Process__Group__08142);
                    rule__Process__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__1_in_rule__Process__Group__08152);
            rule__Process__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__0


    // $ANTLR start rule__Process__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4099:1: rule__Process__Group__1 : ( 'process' ) rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4103:1: ( ( 'process' ) rule__Process__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4104:1: ( 'process' ) rule__Process__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4104:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4105:1: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Process__Group__18181); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__2_in_rule__Process__Group__18191);
            rule__Process__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__1


    // $ANTLR start rule__Process__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4119:1: rule__Process__Group__2 : ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4123:1: ( ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4124:1: ( ( rule__Process__Alternatives_2 )? ) rule__Process__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4124:1: ( ( rule__Process__Alternatives_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4125:1: ( rule__Process__Alternatives_2 )?
            {
             before(grammarAccess.getProcessAccess().getAlternatives_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4126:1: ( rule__Process__Alternatives_2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==11||(LA52_0>=14 && LA52_0<=20)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4126:2: rule__Process__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Process__Alternatives_2_in_rule__Process__Group__28219);
                    rule__Process__Alternatives_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__3_in_rule__Process__Group__28229);
            rule__Process__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__2


    // $ANTLR start rule__Process__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4137:1: rule__Process__Group__3 : ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4141:1: ( ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4142:1: ( ( rule__Process__NameAssignment_3 ) ) rule__Process__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4142:1: ( ( rule__Process__NameAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4143:1: ( rule__Process__NameAssignment_3 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4144:1: ( rule__Process__NameAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4144:2: rule__Process__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Process__NameAssignment_3_in_rule__Process__Group__38257);
            rule__Process__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__4_in_rule__Process__Group__38266);
            rule__Process__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__3


    // $ANTLR start rule__Process__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4155:1: rule__Process__Group__4 : ( 'context' ) rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4159:1: ( ( 'context' ) rule__Process__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4160:1: ( 'context' ) rule__Process__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4160:1: ( 'context' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4161:1: 'context'
            {
             before(grammarAccess.getProcessAccess().getContextKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Process__Group__48295); 
             after(grammarAccess.getProcessAccess().getContextKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__5_in_rule__Process__Group__48305);
            rule__Process__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__4


    // $ANTLR start rule__Process__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4175:1: rule__Process__Group__5 : ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4179:1: ( ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4180:1: ( ( rule__Process__CollectionContextAssignment_5 )? ) rule__Process__Group__6
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4180:1: ( ( rule__Process__CollectionContextAssignment_5 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4181:1: ( rule__Process__CollectionContextAssignment_5 )?
            {
             before(grammarAccess.getProcessAccess().getCollectionContextAssignment_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4182:1: ( rule__Process__CollectionContextAssignment_5 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==51) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4182:2: rule__Process__CollectionContextAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Process__CollectionContextAssignment_5_in_rule__Process__Group__58333);
                    rule__Process__CollectionContextAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getCollectionContextAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__6_in_rule__Process__Group__58343);
            rule__Process__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__5


    // $ANTLR start rule__Process__Group__6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4193:1: rule__Process__Group__6 : ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4197:1: ( ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4198:1: ( ( rule__Process__ContextRefAssignment_6 ) ) rule__Process__Group__7
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4198:1: ( ( rule__Process__ContextRefAssignment_6 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4199:1: ( rule__Process__ContextRefAssignment_6 )
            {
             before(grammarAccess.getProcessAccess().getContextRefAssignment_6()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4200:1: ( rule__Process__ContextRefAssignment_6 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4200:2: rule__Process__ContextRefAssignment_6
            {
            pushFollow(FOLLOW_rule__Process__ContextRefAssignment_6_in_rule__Process__Group__68371);
            rule__Process__ContextRefAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getContextRefAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Process__Group__7_in_rule__Process__Group__68380);
            rule__Process__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__6


    // $ANTLR start rule__Process__Group__7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4211:1: rule__Process__Group__7 : ( ( rule__Process__Alternatives_7 ) ) ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4215:1: ( ( ( rule__Process__Alternatives_7 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4216:1: ( ( rule__Process__Alternatives_7 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4216:1: ( ( rule__Process__Alternatives_7 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4217:1: ( rule__Process__Alternatives_7 )
            {
             before(grammarAccess.getProcessAccess().getAlternatives_7()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4218:1: ( rule__Process__Alternatives_7 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4218:2: rule__Process__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_7_in_rule__Process__Group__78408);
            rule__Process__Alternatives_7();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group__7


    // $ANTLR start rule__Process__Group_2_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4244:1: rule__Process__Group_2_1__0 : ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1 ;
    public final void rule__Process__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4248:1: ( ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4249:1: ( ( rule__Process__TypeAssignment_2_1_0 ) ) rule__Process__Group_2_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4249:1: ( ( rule__Process__TypeAssignment_2_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4250:1: ( rule__Process__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getProcessAccess().getTypeAssignment_2_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4251:1: ( rule__Process__TypeAssignment_2_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4251:2: rule__Process__TypeAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Process__TypeAssignment_2_1_0_in_rule__Process__Group_2_1__08458);
            rule__Process__TypeAssignment_2_1_0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getTypeAssignment_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_2_1__1_in_rule__Process__Group_2_1__08467);
            rule__Process__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_2_1__0


    // $ANTLR start rule__Process__Group_2_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4262:1: rule__Process__Group_2_1__1 : ( ( rule__Process__LinkAssignment_2_1_1 ) ) ;
    public final void rule__Process__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4266:1: ( ( ( rule__Process__LinkAssignment_2_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4267:1: ( ( rule__Process__LinkAssignment_2_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4267:1: ( ( rule__Process__LinkAssignment_2_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4268:1: ( rule__Process__LinkAssignment_2_1_1 )
            {
             before(grammarAccess.getProcessAccess().getLinkAssignment_2_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4269:1: ( rule__Process__LinkAssignment_2_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4269:2: rule__Process__LinkAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Process__LinkAssignment_2_1_1_in_rule__Process__Group_2_1__18495);
            rule__Process__LinkAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getLinkAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_2_1__1


    // $ANTLR start rule__Process__Group_7_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4283:1: rule__Process__Group_7_1__0 : ( '[' ) rule__Process__Group_7_1__1 ;
    public final void rule__Process__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4287:1: ( ( '[' ) rule__Process__Group_7_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4288:1: ( '[' ) rule__Process__Group_7_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4288:1: ( '[' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4289:1: '['
            {
             before(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_7_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Process__Group_7_1__08534); 
             after(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_7_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1__1_in_rule__Process__Group_7_1__08544);
            rule__Process__Group_7_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_7_1__0


    // $ANTLR start rule__Process__Group_7_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4303:1: rule__Process__Group_7_1__1 : ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2 ;
    public final void rule__Process__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4307:1: ( ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4308:1: ( ( rule__Process__Group_7_1_1__0 )* ) rule__Process__Group_7_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4308:1: ( ( rule__Process__Group_7_1_1__0 )* )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4309:1: ( rule__Process__Group_7_1_1__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_7_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4310:1: ( rule__Process__Group_7_1_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_STRING||(LA54_0>=21 && LA54_0<=22)||LA54_0==25||LA54_0==30||LA54_0==44||(LA54_0>=47 && LA54_0<=48)||LA54_0==50||LA54_0==53) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4310:2: rule__Process__Group_7_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Process__Group_7_1_1__0_in_rule__Process__Group_7_1__18572);
            	    rule__Process__Group_7_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_7_1_1()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1__2_in_rule__Process__Group_7_1__18582);
            rule__Process__Group_7_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_7_1__1


    // $ANTLR start rule__Process__Group_7_1__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4321:1: rule__Process__Group_7_1__2 : ( ']' ) ;
    public final void rule__Process__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4325:1: ( ( ']' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4326:1: ( ']' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4326:1: ( ']' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4327:1: ']'
            {
             before(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_7_1_2()); 
            match(input,28,FOLLOW_28_in_rule__Process__Group_7_1__28611); 
             after(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_7_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_7_1__2


    // $ANTLR start rule__Process__Group_7_1_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4346:1: rule__Process__Group_7_1_1__0 : ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1 ;
    public final void rule__Process__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4350:1: ( ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4351:1: ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) ) rule__Process__Group_7_1_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4351:1: ( ( rule__Process__ProcessElementsAssignment_7_1_1_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4352:1: ( rule__Process__ProcessElementsAssignment_7_1_1_0 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_7_1_1_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4353:1: ( rule__Process__ProcessElementsAssignment_7_1_1_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4353:2: rule__Process__ProcessElementsAssignment_7_1_1_0
            {
            pushFollow(FOLLOW_rule__Process__ProcessElementsAssignment_7_1_1_0_in_rule__Process__Group_7_1_1__08652);
            rule__Process__ProcessElementsAssignment_7_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_7_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Process__Group_7_1_1__1_in_rule__Process__Group_7_1_1__08661);
            rule__Process__Group_7_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_7_1_1__0


    // $ANTLR start rule__Process__Group_7_1_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4364:1: rule__Process__Group_7_1_1__1 : ( ';' ) ;
    public final void rule__Process__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4368:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4369:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4369:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4370:1: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_7_1_1_1()); 
            match(input,13,FOLLOW_13_in_rule__Process__Group_7_1_1__18690); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_7_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__Group_7_1_1__1


    // $ANTLR start rule__FormElement__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4387:1: rule__FormElement__Group__0 : ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 ;
    public final void rule__FormElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4391:1: ( ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4392:1: ( ( rule__FormElement__DescriptionAssignment_0 )? ) rule__FormElement__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4392:1: ( ( rule__FormElement__DescriptionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4393:1: ( rule__FormElement__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4394:1: ( rule__FormElement__DescriptionAssignment_0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_STRING) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4394:2: rule__FormElement__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__08729);
                    rule__FormElement__DescriptionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__08739);
            rule__FormElement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group__0


    // $ANTLR start rule__FormElement__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4405:1: rule__FormElement__Group__1 : ( 'element' ) rule__FormElement__Group__2 ;
    public final void rule__FormElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4409:1: ( ( 'element' ) rule__FormElement__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4410:1: ( 'element' ) rule__FormElement__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4410:1: ( 'element' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4411:1: 'element'
            {
             before(grammarAccess.getFormElementAccess().getElementKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__FormElement__Group__18768); 
             after(grammarAccess.getFormElementAccess().getElementKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18778);
            rule__FormElement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group__1


    // $ANTLR start rule__FormElement__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4425:1: rule__FormElement__Group__2 : ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 ;
    public final void rule__FormElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4429:1: ( ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4430:1: ( ( rule__FormElement__ReferencesAssignment_2 ) ) rule__FormElement__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4430:1: ( ( rule__FormElement__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4431:1: ( rule__FormElement__ReferencesAssignment_2 )
            {
             before(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4432:1: ( rule__FormElement__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4432:2: rule__FormElement__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28806);
            rule__FormElement__ReferencesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getReferencesAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28815);
            rule__FormElement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group__2


    // $ANTLR start rule__FormElement__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4443:1: rule__FormElement__Group__3 : ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 ;
    public final void rule__FormElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4447:1: ( ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4448:1: ( ( rule__FormElement__Group_3__0 )? ) rule__FormElement__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4448:1: ( ( rule__FormElement__Group_3__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4449:1: ( rule__FormElement__Group_3__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4450:1: ( rule__FormElement__Group_3__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4450:2: rule__FormElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__38843);
                    rule__FormElement__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38853);
            rule__FormElement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group__3


    // $ANTLR start rule__FormElement__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4461:1: rule__FormElement__Group__4 : ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5 ;
    public final void rule__FormElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4465:1: ( ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4466:1: ( ( rule__FormElement__Group_4__0 )? ) rule__FormElement__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4466:1: ( ( rule__FormElement__Group_4__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4467:1: ( rule__FormElement__Group_4__0 )?
            {
             before(grammarAccess.getFormElementAccess().getGroup_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4468:1: ( rule__FormElement__Group_4__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==32) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4468:2: rule__FormElement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FormElement__Group_4__0_in_rule__FormElement__Group__48881);
                    rule__FormElement__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormElementAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48891);
            rule__FormElement__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group__4


    // $ANTLR start rule__FormElement__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4479:1: rule__FormElement__Group__5 : ( ';' ) ;
    public final void rule__FormElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4483:1: ( ( ';' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4484:1: ( ';' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4484:1: ( ';' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4485:1: ';'
            {
             before(grammarAccess.getFormElementAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__FormElement__Group__58920); 
             after(grammarAccess.getFormElementAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group__5


    // $ANTLR start rule__FormElement__Group_3__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4510:1: rule__FormElement__Group_3__0 : ( 'label' ) rule__FormElement__Group_3__1 ;
    public final void rule__FormElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4514:1: ( ( 'label' ) rule__FormElement__Group_3__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4515:1: ( 'label' ) rule__FormElement__Group_3__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4515:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4516:1: 'label'
            {
             before(grammarAccess.getFormElementAccess().getLabelKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__FormElement__Group_3__08968); 
             after(grammarAccess.getFormElementAccess().getLabelKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__08978);
            rule__FormElement__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group_3__0


    // $ANTLR start rule__FormElement__Group_3__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4530:1: rule__FormElement__Group_3__1 : ( ( rule__FormElement__LabelAssignment_3_1 ) ) ;
    public final void rule__FormElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4534:1: ( ( ( rule__FormElement__LabelAssignment_3_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4535:1: ( ( rule__FormElement__LabelAssignment_3_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4535:1: ( ( rule__FormElement__LabelAssignment_3_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4536:1: ( rule__FormElement__LabelAssignment_3_1 )
            {
             before(grammarAccess.getFormElementAccess().getLabelAssignment_3_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4537:1: ( rule__FormElement__LabelAssignment_3_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4537:2: rule__FormElement__LabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FormElement__LabelAssignment_3_1_in_rule__FormElement__Group_3__19006);
            rule__FormElement__LabelAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getLabelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group_3__1


    // $ANTLR start rule__FormElement__Group_4__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4551:1: rule__FormElement__Group_4__0 : ( 'readonly' ) rule__FormElement__Group_4__1 ;
    public final void rule__FormElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4555:1: ( ( 'readonly' ) rule__FormElement__Group_4__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4556:1: ( 'readonly' ) rule__FormElement__Group_4__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4556:1: ( 'readonly' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4557:1: 'readonly'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__FormElement__Group_4__09045); 
             after(grammarAccess.getFormElementAccess().getReadonlyKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__FormElement__Group_4__1_in_rule__FormElement__Group_4__09055);
            rule__FormElement__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group_4__0


    // $ANTLR start rule__FormElement__Group_4__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4571:1: rule__FormElement__Group_4__1 : ( ( rule__FormElement__Alternatives_4_1 ) ) ;
    public final void rule__FormElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4575:1: ( ( ( rule__FormElement__Alternatives_4_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4576:1: ( ( rule__FormElement__Alternatives_4_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4576:1: ( ( rule__FormElement__Alternatives_4_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4577:1: ( rule__FormElement__Alternatives_4_1 )
            {
             before(grammarAccess.getFormElementAccess().getAlternatives_4_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4578:1: ( rule__FormElement__Alternatives_4_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4578:2: rule__FormElement__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__FormElement__Alternatives_4_1_in_rule__FormElement__Group_4__19083);
            rule__FormElement__Alternatives_4_1();
            _fsp--;


            }

             after(grammarAccess.getFormElementAccess().getAlternatives_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__Group_4__1


    // $ANTLR start rule__ActionDialogueCall__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4592:1: rule__ActionDialogueCall__Group__0 : ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1 ;
    public final void rule__ActionDialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4596:1: ( ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4597:1: ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? ) rule__ActionDialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4597:1: ( ( rule__ActionDialogueCall__ContextExpAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4598:1: ( rule__ActionDialogueCall__ContextExpAssignment_0 )?
            {
             before(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4599:1: ( rule__ActionDialogueCall__ContextExpAssignment_0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=21 && LA58_0<=22)||(LA58_0>=47 && LA58_0<=48)||LA58_0==50||LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4599:2: rule__ActionDialogueCall__ContextExpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActionDialogueCall__ContextExpAssignment_0_in_rule__ActionDialogueCall__Group__09121);
                    rule__ActionDialogueCall__ContextExpAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionDialogueCallAccess().getContextExpAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__1_in_rule__ActionDialogueCall__Group__09131);
            rule__ActionDialogueCall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionDialogueCall__Group__0


    // $ANTLR start rule__ActionDialogueCall__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4610:1: rule__ActionDialogueCall__Group__1 : ( 'form' ) rule__ActionDialogueCall__Group__2 ;
    public final void rule__ActionDialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4614:1: ( ( 'form' ) rule__ActionDialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4615:1: ( 'form' ) rule__ActionDialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4615:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4616:1: 'form'
            {
             before(grammarAccess.getActionDialogueCallAccess().getFormKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ActionDialogueCall__Group__19160); 
             after(grammarAccess.getActionDialogueCallAccess().getFormKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ActionDialogueCall__Group__2_in_rule__ActionDialogueCall__Group__19170);
            rule__ActionDialogueCall__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionDialogueCall__Group__1


    // $ANTLR start rule__ActionDialogueCall__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4630:1: rule__ActionDialogueCall__Group__2 : ( ( rule__ActionDialogueCall__NameAssignment_2 ) ) ;
    public final void rule__ActionDialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4634:1: ( ( ( rule__ActionDialogueCall__NameAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4635:1: ( ( rule__ActionDialogueCall__NameAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4635:1: ( ( rule__ActionDialogueCall__NameAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4636:1: ( rule__ActionDialogueCall__NameAssignment_2 )
            {
             before(grammarAccess.getActionDialogueCallAccess().getNameAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4637:1: ( rule__ActionDialogueCall__NameAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4637:2: rule__ActionDialogueCall__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActionDialogueCall__NameAssignment_2_in_rule__ActionDialogueCall__Group__29198);
            rule__ActionDialogueCall__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getActionDialogueCallAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionDialogueCall__Group__2


    // $ANTLR start rule__DialogueCall__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4653:1: rule__DialogueCall__Group__0 : ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1 ;
    public final void rule__DialogueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4657:1: ( ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4658:1: ( ( rule__DialogueCall__Group_0__0 )? ) rule__DialogueCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4658:1: ( ( rule__DialogueCall__Group_0__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4659:1: ( rule__DialogueCall__Group_0__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4660:1: ( rule__DialogueCall__Group_0__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4660:2: rule__DialogueCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_0__0_in_rule__DialogueCall__Group__09238);
                    rule__DialogueCall__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__09248);
            rule__DialogueCall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group__0


    // $ANTLR start rule__DialogueCall__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4671:1: rule__DialogueCall__Group__1 : ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2 ;
    public final void rule__DialogueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4675:1: ( ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4676:1: ( ( rule__DialogueCall__Group_1__0 )? ) rule__DialogueCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4676:1: ( ( rule__DialogueCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4677:1: ( rule__DialogueCall__Group_1__0 )?
            {
             before(grammarAccess.getDialogueCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4678:1: ( rule__DialogueCall__Group_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4678:2: rule__DialogueCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__19276);
                    rule__DialogueCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__2_in_rule__DialogueCall__Group__19286);
            rule__DialogueCall__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group__1


    // $ANTLR start rule__DialogueCall__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4689:1: rule__DialogueCall__Group__2 : ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3 ;
    public final void rule__DialogueCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4693:1: ( ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4694:1: ( ( rule__DialogueCall__ContextExpAssignment_2 )? ) rule__DialogueCall__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4694:1: ( ( rule__DialogueCall__ContextExpAssignment_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4695:1: ( rule__DialogueCall__ContextExpAssignment_2 )?
            {
             before(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4696:1: ( rule__DialogueCall__ContextExpAssignment_2 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=21 && LA61_0<=22)||(LA61_0>=47 && LA61_0<=48)||LA61_0==50||LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4696:2: rule__DialogueCall__ContextExpAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DialogueCall__ContextExpAssignment_2_in_rule__DialogueCall__Group__29314);
                    rule__DialogueCall__ContextExpAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDialogueCallAccess().getContextExpAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__3_in_rule__DialogueCall__Group__29324);
            rule__DialogueCall__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group__2


    // $ANTLR start rule__DialogueCall__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4707:1: rule__DialogueCall__Group__3 : ( 'form' ) rule__DialogueCall__Group__4 ;
    public final void rule__DialogueCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4711:1: ( ( 'form' ) rule__DialogueCall__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4712:1: ( 'form' ) rule__DialogueCall__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4712:1: ( 'form' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4713:1: 'form'
            {
             before(grammarAccess.getDialogueCallAccess().getFormKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__DialogueCall__Group__39353); 
             after(grammarAccess.getDialogueCallAccess().getFormKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group__4_in_rule__DialogueCall__Group__39363);
            rule__DialogueCall__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group__3


    // $ANTLR start rule__DialogueCall__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4727:1: rule__DialogueCall__Group__4 : ( ( rule__DialogueCall__NameAssignment_4 ) ) ;
    public final void rule__DialogueCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4731:1: ( ( ( rule__DialogueCall__NameAssignment_4 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4732:1: ( ( rule__DialogueCall__NameAssignment_4 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4732:1: ( ( rule__DialogueCall__NameAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4733:1: ( rule__DialogueCall__NameAssignment_4 )
            {
             before(grammarAccess.getDialogueCallAccess().getNameAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4734:1: ( rule__DialogueCall__NameAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4734:2: rule__DialogueCall__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__DialogueCall__NameAssignment_4_in_rule__DialogueCall__Group__49391);
            rule__DialogueCall__NameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group__4


    // $ANTLR start rule__DialogueCall__Group_0__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4754:1: rule__DialogueCall__Group_0__0 : ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1 ;
    public final void rule__DialogueCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4758:1: ( ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4759:1: ( ( rule__DialogueCall__LabelAssignment_0_0 ) ) rule__DialogueCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4759:1: ( ( rule__DialogueCall__LabelAssignment_0_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4760:1: ( rule__DialogueCall__LabelAssignment_0_0 )
            {
             before(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4761:1: ( rule__DialogueCall__LabelAssignment_0_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4761:2: rule__DialogueCall__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DialogueCall__LabelAssignment_0_0_in_rule__DialogueCall__Group_0__09435);
            rule__DialogueCall__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getLabelAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_0__1_in_rule__DialogueCall__Group_0__09444);
            rule__DialogueCall__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group_0__0


    // $ANTLR start rule__DialogueCall__Group_0__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4772:1: rule__DialogueCall__Group_0__1 : ( ':' ) ;
    public final void rule__DialogueCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4776:1: ( ( ':' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4777:1: ( ':' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4777:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4778:1: ':'
            {
             before(grammarAccess.getDialogueCallAccess().getColonKeyword_0_1()); 
            match(input,43,FOLLOW_43_in_rule__DialogueCall__Group_0__19473); 
             after(grammarAccess.getDialogueCallAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group_0__1


    // $ANTLR start rule__DialogueCall__Group_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4795:1: rule__DialogueCall__Group_1__0 : ( 'if' ) rule__DialogueCall__Group_1__1 ;
    public final void rule__DialogueCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4799:1: ( ( 'if' ) rule__DialogueCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4800:1: ( 'if' ) rule__DialogueCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4800:1: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4801:1: 'if'
            {
             before(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__DialogueCall__Group_1__09513); 
             after(grammarAccess.getDialogueCallAccess().getIfKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__09523);
            rule__DialogueCall__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group_1__0


    // $ANTLR start rule__DialogueCall__Group_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4815:1: rule__DialogueCall__Group_1__1 : ( '(' ) rule__DialogueCall__Group_1__2 ;
    public final void rule__DialogueCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4819:1: ( ( '(' ) rule__DialogueCall__Group_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4820:1: ( '(' ) rule__DialogueCall__Group_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4820:1: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4821:1: '('
            {
             before(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__DialogueCall__Group_1__19552); 
             after(grammarAccess.getDialogueCallAccess().getLeftParenthesisKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__2_in_rule__DialogueCall__Group_1__19562);
            rule__DialogueCall__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group_1__1


    // $ANTLR start rule__DialogueCall__Group_1__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4835:1: rule__DialogueCall__Group_1__2 : ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3 ;
    public final void rule__DialogueCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4839:1: ( ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4840:1: ( ( rule__DialogueCall__ConditionAssignment_1_2 ) ) rule__DialogueCall__Group_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4840:1: ( ( rule__DialogueCall__ConditionAssignment_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4841:1: ( rule__DialogueCall__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4842:1: ( rule__DialogueCall__ConditionAssignment_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4842:2: rule__DialogueCall__ConditionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DialogueCall__ConditionAssignment_1_2_in_rule__DialogueCall__Group_1__29590);
            rule__DialogueCall__ConditionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getDialogueCallAccess().getConditionAssignment_1_2()); 

            }

            pushFollow(FOLLOW_rule__DialogueCall__Group_1__3_in_rule__DialogueCall__Group_1__29599);
            rule__DialogueCall__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group_1__2


    // $ANTLR start rule__DialogueCall__Group_1__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4853:1: rule__DialogueCall__Group_1__3 : ( ')' ) ;
    public final void rule__DialogueCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4857:1: ( ( ')' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4858:1: ( ')' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4858:1: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4859:1: ')'
            {
             before(grammarAccess.getDialogueCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,46,FOLLOW_46_in_rule__DialogueCall__Group_1__39628); 
             after(grammarAccess.getDialogueCallAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__Group_1__3


    // $ANTLR start rule__ProcessCall__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4880:1: rule__ProcessCall__Group__0 : ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1 ;
    public final void rule__ProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4884:1: ( ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4885:1: ( ( rule__ProcessCall__Group_0__0 )? ) rule__ProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4885:1: ( ( rule__ProcessCall__Group_0__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4886:1: ( rule__ProcessCall__Group_0__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4887:1: ( rule__ProcessCall__Group_0__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_STRING) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4887:2: rule__ProcessCall__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_0__0_in_rule__ProcessCall__Group__09671);
                    rule__ProcessCall__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__09681);
            rule__ProcessCall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group__0


    // $ANTLR start rule__ProcessCall__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4898:1: rule__ProcessCall__Group__1 : ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2 ;
    public final void rule__ProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4902:1: ( ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4903:1: ( ( rule__ProcessCall__Group_1__0 )? ) rule__ProcessCall__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4903:1: ( ( rule__ProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4904:1: ( rule__ProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4905:1: ( rule__ProcessCall__Group_1__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==44) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4905:2: rule__ProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__19709);
                    rule__ProcessCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__2_in_rule__ProcessCall__Group__19719);
            rule__ProcessCall__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group__1


    // $ANTLR start rule__ProcessCall__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4916:1: rule__ProcessCall__Group__2 : ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3 ;
    public final void rule__ProcessCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4920:1: ( ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4921:1: ( ( rule__ProcessCall__ContextExpAssignment_2 )? ) rule__ProcessCall__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4921:1: ( ( rule__ProcessCall__ContextExpAssignment_2 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4922:1: ( rule__ProcessCall__ContextExpAssignment_2 )?
            {
             before(grammarAccess.getProcessCallAccess().getContextExpAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4923:1: ( rule__ProcessCall__ContextExpAssignment_2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=21 && LA64_0<=22)||(LA64_0>=47 && LA64_0<=48)||LA64_0==50||LA64_0==53) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4923:2: rule__ProcessCall__ContextExpAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__ContextExpAssignment_2_in_rule__ProcessCall__Group__29747);
                    rule__ProcessCall__ContextExpAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getContextExpAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__3_in_rule__ProcessCall__Group__29757);
            rule__ProcessCall__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group__2


    // $ANTLR start rule__ProcessCall__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4934:1: rule__ProcessCall__Group__3 : ( 'process' ) rule__ProcessCall__Group__4 ;
    public final void rule__ProcessCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4938:1: ( ( 'process' ) rule__ProcessCall__Group__4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4939:1: ( 'process' ) rule__ProcessCall__Group__4
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4939:1: ( 'process' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4940:1: 'process'
            {
             before(grammarAccess.getProcessCallAccess().getProcessKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__ProcessCall__Group__39786); 
             after(grammarAccess.getProcessCallAccess().getProcessKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__4_in_rule__ProcessCall__Group__39796);
            rule__ProcessCall__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group__3


    // $ANTLR start rule__ProcessCall__Group__4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4954:1: rule__ProcessCall__Group__4 : ( ( rule__ProcessCall__ReferredProcessAssignment_4 ) ) rule__ProcessCall__Group__5 ;
    public final void rule__ProcessCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4958:1: ( ( ( rule__ProcessCall__ReferredProcessAssignment_4 ) ) rule__ProcessCall__Group__5 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4959:1: ( ( rule__ProcessCall__ReferredProcessAssignment_4 ) ) rule__ProcessCall__Group__5
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4959:1: ( ( rule__ProcessCall__ReferredProcessAssignment_4 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4960:1: ( rule__ProcessCall__ReferredProcessAssignment_4 )
            {
             before(grammarAccess.getProcessCallAccess().getReferredProcessAssignment_4()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4961:1: ( rule__ProcessCall__ReferredProcessAssignment_4 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4961:2: rule__ProcessCall__ReferredProcessAssignment_4
            {
            pushFollow(FOLLOW_rule__ProcessCall__ReferredProcessAssignment_4_in_rule__ProcessCall__Group__49824);
            rule__ProcessCall__ReferredProcessAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getReferredProcessAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group__5_in_rule__ProcessCall__Group__49833);
            rule__ProcessCall__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group__4


    // $ANTLR start rule__ProcessCall__Group__5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4972:1: rule__ProcessCall__Group__5 : ( ( rule__ProcessCall__Group_5__0 )? ) ;
    public final void rule__ProcessCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4976:1: ( ( ( rule__ProcessCall__Group_5__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4977:1: ( ( rule__ProcessCall__Group_5__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4977:1: ( ( rule__ProcessCall__Group_5__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4978:1: ( rule__ProcessCall__Group_5__0 )?
            {
             before(grammarAccess.getProcessCallAccess().getGroup_5()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4979:1: ( rule__ProcessCall__Group_5__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==35) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:4979:2: rule__ProcessCall__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ProcessCall__Group_5__0_in_rule__ProcessCall__Group__59861);
                    rule__ProcessCall__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessCallAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group__5


    // $ANTLR start rule__ProcessCall__Group_0__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5001:1: rule__ProcessCall__Group_0__0 : ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1 ;
    public final void rule__ProcessCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5005:1: ( ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5006:1: ( ( rule__ProcessCall__LabelAssignment_0_0 ) ) rule__ProcessCall__Group_0__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5006:1: ( ( rule__ProcessCall__LabelAssignment_0_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5007:1: ( rule__ProcessCall__LabelAssignment_0_0 )
            {
             before(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5008:1: ( rule__ProcessCall__LabelAssignment_0_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5008:2: rule__ProcessCall__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ProcessCall__LabelAssignment_0_0_in_rule__ProcessCall__Group_0__09908);
            rule__ProcessCall__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getLabelAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_0__1_in_rule__ProcessCall__Group_0__09917);
            rule__ProcessCall__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group_0__0


    // $ANTLR start rule__ProcessCall__Group_0__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5019:1: rule__ProcessCall__Group_0__1 : ( ':' ) ;
    public final void rule__ProcessCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5023:1: ( ( ':' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5024:1: ( ':' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5024:1: ( ':' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5025:1: ':'
            {
             before(grammarAccess.getProcessCallAccess().getColonKeyword_0_1()); 
            match(input,43,FOLLOW_43_in_rule__ProcessCall__Group_0__19946); 
             after(grammarAccess.getProcessCallAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group_0__1


    // $ANTLR start rule__ProcessCall__Group_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5042:1: rule__ProcessCall__Group_1__0 : ( 'if' ) rule__ProcessCall__Group_1__1 ;
    public final void rule__ProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5046:1: ( ( 'if' ) rule__ProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5047:1: ( 'if' ) rule__ProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5047:1: ( 'if' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5048:1: 'if'
            {
             before(grammarAccess.getProcessCallAccess().getIfKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ProcessCall__Group_1__09986); 
             after(grammarAccess.getProcessCallAccess().getIfKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__09996);
            rule__ProcessCall__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group_1__0


    // $ANTLR start rule__ProcessCall__Group_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5062:1: rule__ProcessCall__Group_1__1 : ( '(' ) rule__ProcessCall__Group_1__2 ;
    public final void rule__ProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5066:1: ( ( '(' ) rule__ProcessCall__Group_1__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5067:1: ( '(' ) rule__ProcessCall__Group_1__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5067:1: ( '(' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5068:1: '('
            {
             before(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,45,FOLLOW_45_in_rule__ProcessCall__Group_1__110025); 
             after(grammarAccess.getProcessCallAccess().getLeftParenthesisKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__2_in_rule__ProcessCall__Group_1__110035);
            rule__ProcessCall__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group_1__1


    // $ANTLR start rule__ProcessCall__Group_1__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5082:1: rule__ProcessCall__Group_1__2 : ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3 ;
    public final void rule__ProcessCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5086:1: ( ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5087:1: ( ( rule__ProcessCall__ConditionAssignment_1_2 ) ) rule__ProcessCall__Group_1__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5087:1: ( ( rule__ProcessCall__ConditionAssignment_1_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5088:1: ( rule__ProcessCall__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5089:1: ( rule__ProcessCall__ConditionAssignment_1_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5089:2: rule__ProcessCall__ConditionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ProcessCall__ConditionAssignment_1_2_in_rule__ProcessCall__Group_1__210063);
            rule__ProcessCall__ConditionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getConditionAssignment_1_2()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_1__3_in_rule__ProcessCall__Group_1__210072);
            rule__ProcessCall__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group_1__2


    // $ANTLR start rule__ProcessCall__Group_1__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5100:1: rule__ProcessCall__Group_1__3 : ( ')' ) ;
    public final void rule__ProcessCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5104:1: ( ( ')' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5105:1: ( ')' )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5105:1: ( ')' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5106:1: ')'
            {
             before(grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,46,FOLLOW_46_in_rule__ProcessCall__Group_1__310101); 
             after(grammarAccess.getProcessCallAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group_1__3


    // $ANTLR start rule__ProcessCall__Group_5__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5127:1: rule__ProcessCall__Group_5__0 : ( 'label' ) rule__ProcessCall__Group_5__1 ;
    public final void rule__ProcessCall__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5131:1: ( ( 'label' ) rule__ProcessCall__Group_5__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5132:1: ( 'label' ) rule__ProcessCall__Group_5__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5132:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5133:1: 'label'
            {
             before(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0()); 
            match(input,35,FOLLOW_35_in_rule__ProcessCall__Group_5__010145); 
             after(grammarAccess.getProcessCallAccess().getLabelKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__ProcessCall__Group_5__1_in_rule__ProcessCall__Group_5__010155);
            rule__ProcessCall__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group_5__0


    // $ANTLR start rule__ProcessCall__Group_5__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5147:1: rule__ProcessCall__Group_5__1 : ( ( rule__ProcessCall__LabelAssignment_5_1 ) ) ;
    public final void rule__ProcessCall__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5151:1: ( ( ( rule__ProcessCall__LabelAssignment_5_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5152:1: ( ( rule__ProcessCall__LabelAssignment_5_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5152:1: ( ( rule__ProcessCall__LabelAssignment_5_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5153:1: ( rule__ProcessCall__LabelAssignment_5_1 )
            {
             before(grammarAccess.getProcessCallAccess().getLabelAssignment_5_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5154:1: ( rule__ProcessCall__LabelAssignment_5_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5154:2: rule__ProcessCall__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ProcessCall__LabelAssignment_5_1_in_rule__ProcessCall__Group_5__110183);
            rule__ProcessCall__LabelAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getProcessCallAccess().getLabelAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__Group_5__1


    // $ANTLR start rule__OperationExpression__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5168:1: rule__OperationExpression__Group__0 : ( 'call' ) rule__OperationExpression__Group__1 ;
    public final void rule__OperationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5172:1: ( ( 'call' ) rule__OperationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5173:1: ( 'call' ) rule__OperationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5173:1: ( 'call' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5174:1: 'call'
            {
             before(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__OperationExpression__Group__010222); 
             after(grammarAccess.getOperationExpressionAccess().getCallKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__010232);
            rule__OperationExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OperationExpression__Group__0


    // $ANTLR start rule__OperationExpression__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5188:1: rule__OperationExpression__Group__1 : ( ( rule__OperationExpression__NameAssignment_1 ) ) ;
    public final void rule__OperationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5192:1: ( ( ( rule__OperationExpression__NameAssignment_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5193:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5193:1: ( ( rule__OperationExpression__NameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5194:1: ( rule__OperationExpression__NameAssignment_1 )
            {
             before(grammarAccess.getOperationExpressionAccess().getNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5195:1: ( rule__OperationExpression__NameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5195:2: rule__OperationExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__110260);
            rule__OperationExpression__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getOperationExpressionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OperationExpression__Group__1


    // $ANTLR start rule__SimpleProcessCall__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5209:1: rule__SimpleProcessCall__Group__0 : ( ( rule__SimpleProcessCall__ReferredProcessAssignment_0 ) ) rule__SimpleProcessCall__Group__1 ;
    public final void rule__SimpleProcessCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5213:1: ( ( ( rule__SimpleProcessCall__ReferredProcessAssignment_0 ) ) rule__SimpleProcessCall__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5214:1: ( ( rule__SimpleProcessCall__ReferredProcessAssignment_0 ) ) rule__SimpleProcessCall__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5214:1: ( ( rule__SimpleProcessCall__ReferredProcessAssignment_0 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5215:1: ( rule__SimpleProcessCall__ReferredProcessAssignment_0 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getReferredProcessAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5216:1: ( rule__SimpleProcessCall__ReferredProcessAssignment_0 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5216:2: rule__SimpleProcessCall__ReferredProcessAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__ReferredProcessAssignment_0_in_rule__SimpleProcessCall__Group__010298);
            rule__SimpleProcessCall__ReferredProcessAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessCallAccess().getReferredProcessAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcessCall__Group__1_in_rule__SimpleProcessCall__Group__010307);
            rule__SimpleProcessCall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcessCall__Group__0


    // $ANTLR start rule__SimpleProcessCall__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5227:1: rule__SimpleProcessCall__Group__1 : ( ( rule__SimpleProcessCall__Group_1__0 )? ) ;
    public final void rule__SimpleProcessCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5231:1: ( ( ( rule__SimpleProcessCall__Group_1__0 )? ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5232:1: ( ( rule__SimpleProcessCall__Group_1__0 )? )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5232:1: ( ( rule__SimpleProcessCall__Group_1__0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5233:1: ( rule__SimpleProcessCall__Group_1__0 )?
            {
             before(grammarAccess.getSimpleProcessCallAccess().getGroup_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5234:1: ( rule__SimpleProcessCall__Group_1__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==35) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5234:2: rule__SimpleProcessCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SimpleProcessCall__Group_1__0_in_rule__SimpleProcessCall__Group__110335);
                    rule__SimpleProcessCall__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleProcessCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcessCall__Group__1


    // $ANTLR start rule__SimpleProcessCall__Group_1__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5248:1: rule__SimpleProcessCall__Group_1__0 : ( 'label' ) rule__SimpleProcessCall__Group_1__1 ;
    public final void rule__SimpleProcessCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5252:1: ( ( 'label' ) rule__SimpleProcessCall__Group_1__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5253:1: ( 'label' ) rule__SimpleProcessCall__Group_1__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5253:1: ( 'label' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5254:1: 'label'
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__SimpleProcessCall__Group_1__010375); 
             after(grammarAccess.getSimpleProcessCallAccess().getLabelKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__SimpleProcessCall__Group_1__1_in_rule__SimpleProcessCall__Group_1__010385);
            rule__SimpleProcessCall__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcessCall__Group_1__0


    // $ANTLR start rule__SimpleProcessCall__Group_1__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5268:1: rule__SimpleProcessCall__Group_1__1 : ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) ) ;
    public final void rule__SimpleProcessCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5272:1: ( ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5273:1: ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5273:1: ( ( rule__SimpleProcessCall__LabelAssignment_1_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5274:1: ( rule__SimpleProcessCall__LabelAssignment_1_1 )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelAssignment_1_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5275:1: ( rule__SimpleProcessCall__LabelAssignment_1_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5275:2: rule__SimpleProcessCall__LabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SimpleProcessCall__LabelAssignment_1_1_in_rule__SimpleProcessCall__Group_1__110413);
            rule__SimpleProcessCall__LabelAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleProcessCallAccess().getLabelAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcessCall__Group_1__1


    // $ANTLR start rule__ServiceExpression__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5289:1: rule__ServiceExpression__Group__0 : ( 'service' ) rule__ServiceExpression__Group__1 ;
    public final void rule__ServiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5293:1: ( ( 'service' ) rule__ServiceExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5294:1: ( 'service' ) rule__ServiceExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5294:1: ( 'service' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5295:1: 'service'
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__ServiceExpression__Group__010452); 
             after(grammarAccess.getServiceExpressionAccess().getServiceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__010462);
            rule__ServiceExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceExpression__Group__0


    // $ANTLR start rule__ServiceExpression__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5309:1: rule__ServiceExpression__Group__1 : ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2 ;
    public final void rule__ServiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5313:1: ( ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5314:1: ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) ) rule__ServiceExpression__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5314:1: ( ( rule__ServiceExpression__ServiceNameAssignment_1 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5315:1: ( rule__ServiceExpression__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5316:1: ( rule__ServiceExpression__ServiceNameAssignment_1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5316:2: rule__ServiceExpression__ServiceNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceNameAssignment_1_in_rule__ServiceExpression__Group__110490);
            rule__ServiceExpression__ServiceNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getServiceExpressionAccess().getServiceNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__2_in_rule__ServiceExpression__Group__110499);
            rule__ServiceExpression__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceExpression__Group__1


    // $ANTLR start rule__ServiceExpression__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5327:1: rule__ServiceExpression__Group__2 : ( '.' ) rule__ServiceExpression__Group__3 ;
    public final void rule__ServiceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5331:1: ( ( '.' ) rule__ServiceExpression__Group__3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5332:1: ( '.' ) rule__ServiceExpression__Group__3
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5332:1: ( '.' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5333:1: '.'
            {
             before(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2()); 
            match(input,49,FOLLOW_49_in_rule__ServiceExpression__Group__210528); 
             after(grammarAccess.getServiceExpressionAccess().getFullStopKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__ServiceExpression__Group__3_in_rule__ServiceExpression__Group__210538);
            rule__ServiceExpression__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceExpression__Group__2


    // $ANTLR start rule__ServiceExpression__Group__3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5347:1: rule__ServiceExpression__Group__3 : ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) ) ;
    public final void rule__ServiceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5351:1: ( ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5352:1: ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5352:1: ( ( rule__ServiceExpression__ServiceMethodAssignment_3 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5353:1: ( rule__ServiceExpression__ServiceMethodAssignment_3 )
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceMethodAssignment_3()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5354:1: ( rule__ServiceExpression__ServiceMethodAssignment_3 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5354:2: rule__ServiceExpression__ServiceMethodAssignment_3
            {
            pushFollow(FOLLOW_rule__ServiceExpression__ServiceMethodAssignment_3_in_rule__ServiceExpression__Group__310566);
            rule__ServiceExpression__ServiceMethodAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getServiceExpressionAccess().getServiceMethodAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceExpression__Group__3


    // $ANTLR start rule__NavigationExpression__Group__0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5372:1: rule__NavigationExpression__Group__0 : ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1 ;
    public final void rule__NavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5376:1: ( ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5377:1: ( ( rule__NavigationExpression__CompositionAssignment_0 )? ) rule__NavigationExpression__Group__1
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5377:1: ( ( rule__NavigationExpression__CompositionAssignment_0 )? )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5378:1: ( rule__NavigationExpression__CompositionAssignment_0 )?
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5379:1: ( rule__NavigationExpression__CompositionAssignment_0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==53) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5379:2: rule__NavigationExpression__CompositionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NavigationExpression__CompositionAssignment_0_in_rule__NavigationExpression__Group__010608);
                    rule__NavigationExpression__CompositionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavigationExpressionAccess().getCompositionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__010618);
            rule__NavigationExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NavigationExpression__Group__0


    // $ANTLR start rule__NavigationExpression__Group__1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5390:1: rule__NavigationExpression__Group__1 : ( 'navigate' ) rule__NavigationExpression__Group__2 ;
    public final void rule__NavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5394:1: ( ( 'navigate' ) rule__NavigationExpression__Group__2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5395:1: ( 'navigate' ) rule__NavigationExpression__Group__2
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5395:1: ( 'navigate' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5396:1: 'navigate'
            {
             before(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__NavigationExpression__Group__110647); 
             after(grammarAccess.getNavigationExpressionAccess().getNavigateKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__NavigationExpression__Group__2_in_rule__NavigationExpression__Group__110657);
            rule__NavigationExpression__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NavigationExpression__Group__1


    // $ANTLR start rule__NavigationExpression__Group__2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5410:1: rule__NavigationExpression__Group__2 : ( ( rule__NavigationExpression__ReferencesAssignment_2 ) ) ;
    public final void rule__NavigationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5414:1: ( ( ( rule__NavigationExpression__ReferencesAssignment_2 ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5415:1: ( ( rule__NavigationExpression__ReferencesAssignment_2 ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5415:1: ( ( rule__NavigationExpression__ReferencesAssignment_2 ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5416:1: ( rule__NavigationExpression__ReferencesAssignment_2 )
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssignment_2()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5417:1: ( rule__NavigationExpression__ReferencesAssignment_2 )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5417:2: rule__NavigationExpression__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__NavigationExpression__ReferencesAssignment_2_in_rule__NavigationExpression__Group__210685);
            rule__NavigationExpression__ReferencesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getNavigationExpressionAccess().getReferencesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NavigationExpression__Group__2


    // $ANTLR start rule__ApplicationModel__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5433:1: rule__ApplicationModel__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5437:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5438:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5438:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5439:1: RULE_STRING
            {
             before(grammarAccess.getApplicationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ApplicationModel__DescriptionAssignment_010725); 
             after(grammarAccess.getApplicationModelAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__DescriptionAssignment_0


    // $ANTLR start rule__ApplicationModel__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5448:1: rule__ApplicationModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5452:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5453:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5453:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5454:1: RULE_ID
            {
             before(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_210756); 
             after(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__NameAssignment_2


    // $ANTLR start rule__ApplicationModel__ExternalReferencesAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5463:1: rule__ApplicationModel__ExternalReferencesAssignment_4 : ( ruleProcessReference ) ;
    public final void rule__ApplicationModel__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5467:1: ( ( ruleProcessReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5468:1: ( ruleProcessReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5468:1: ( ruleProcessReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5469:1: ruleProcessReference
            {
             before(grammarAccess.getApplicationModelAccess().getExternalReferencesProcessReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProcessReference_in_rule__ApplicationModel__ExternalReferencesAssignment_410787);
            ruleProcessReference();
            _fsp--;

             after(grammarAccess.getApplicationModelAccess().getExternalReferencesProcessReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__ExternalReferencesAssignment_4


    // $ANTLR start rule__ApplicationModel__StartAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5478:1: rule__ApplicationModel__StartAssignment_5 : ( ruleApplication ) ;
    public final void rule__ApplicationModel__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5482:1: ( ( ruleApplication ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5483:1: ( ruleApplication )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5483:1: ( ruleApplication )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5484:1: ruleApplication
            {
             before(grammarAccess.getApplicationModelAccess().getStartApplicationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__ApplicationModel__StartAssignment_510818);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationModelAccess().getStartApplicationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ApplicationModel__StartAssignment_5


    // $ANTLR start rule__ProcessReference__ModelNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5493:1: rule__ProcessReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcessReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5497:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5498:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5498:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5499:1: RULE_ID
            {
             before(grammarAccess.getProcessReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessReference__ModelNameAssignment_110849); 
             after(grammarAccess.getProcessReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessReference__ModelNameAssignment_1


    // $ANTLR start rule__ProcessReference__NameAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5508:1: rule__ProcessReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ProcessReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5512:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5513:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5513:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5514:1: RULE_ID
            {
             before(grammarAccess.getProcessReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessReference__NameAssignment_310880); 
             after(grammarAccess.getProcessReferenceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessReference__NameAssignment_3


    // $ANTLR start rule__FormsAndProcesses__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5523:1: rule__FormsAndProcesses__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormsAndProcesses__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5527:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5528:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5528:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5529:1: RULE_STRING
            {
             before(grammarAccess.getFormsAndProcessesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormsAndProcesses__DescriptionAssignment_010911); 
             after(grammarAccess.getFormsAndProcessesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__DescriptionAssignment_0


    // $ANTLR start rule__FormsAndProcesses__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5538:1: rule__FormsAndProcesses__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FormsAndProcesses__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5542:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5543:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5543:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5544:1: RULE_ID
            {
             before(grammarAccess.getFormsAndProcessesAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FormsAndProcesses__NameAssignment_210942); 
             after(grammarAccess.getFormsAndProcessesAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__NameAssignment_2


    // $ANTLR start rule__FormsAndProcesses__ExternalReferencesAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5553:1: rule__FormsAndProcesses__ExternalReferencesAssignment_4 : ( ruleExternalReference ) ;
    public final void rule__FormsAndProcesses__ExternalReferencesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5557:1: ( ( ruleExternalReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5558:1: ( ruleExternalReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5558:1: ( ruleExternalReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5559:1: ruleExternalReference
            {
             before(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExternalReference_in_rule__FormsAndProcesses__ExternalReferencesAssignment_410973);
            ruleExternalReference();
            _fsp--;

             after(grammarAccess.getFormsAndProcessesAccess().getExternalReferencesExternalReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__ExternalReferencesAssignment_4


    // $ANTLR start rule__FormsAndProcesses__StartAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5568:1: rule__FormsAndProcesses__StartAssignment_5 : ( ruleApplication ) ;
    public final void rule__FormsAndProcesses__StartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5572:1: ( ( ruleApplication ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5573:1: ( ruleApplication )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5573:1: ( ruleApplication )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5574:1: ruleApplication
            {
             before(grammarAccess.getFormsAndProcessesAccess().getStartApplicationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__FormsAndProcesses__StartAssignment_511004);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getFormsAndProcessesAccess().getStartApplicationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__StartAssignment_5


    // $ANTLR start rule__FormsAndProcesses__ElementsAssignment_6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5583:1: rule__FormsAndProcesses__ElementsAssignment_6 : ( ruleModelElementWithContext ) ;
    public final void rule__FormsAndProcesses__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5587:1: ( ( ruleModelElementWithContext ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5588:1: ( ruleModelElementWithContext )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5588:1: ( ruleModelElementWithContext )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5589:1: ruleModelElementWithContext
            {
             before(grammarAccess.getFormsAndProcessesAccess().getElementsModelElementWithContextParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleModelElementWithContext_in_rule__FormsAndProcesses__ElementsAssignment_611035);
            ruleModelElementWithContext();
            _fsp--;

             after(grammarAccess.getFormsAndProcessesAccess().getElementsModelElementWithContextParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormsAndProcesses__ElementsAssignment_6


    // $ANTLR start rule__Application__StartProcessesAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5598:1: rule__Application__StartProcessesAssignment_2 : ( ruleSimpleProcessCall ) ;
    public final void rule__Application__StartProcessesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5602:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5603:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5603:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5604:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_211066);
            ruleSimpleProcessCall();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__StartProcessesAssignment_2


    // $ANTLR start rule__Application__StartProcessesAssignment_4_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5613:1: rule__Application__StartProcessesAssignment_4_0 : ( ruleSimpleProcessCall ) ;
    public final void rule__Application__StartProcessesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5617:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5618:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5618:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5619:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_4_011097);
            ruleSimpleProcessCall();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getStartProcessesSimpleProcessCallParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__StartProcessesAssignment_4_0


    // $ANTLR start rule__ExternalReference__ModelNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5628:1: rule__ExternalReference__ModelNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalReference__ModelNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5632:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5633:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5633:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5634:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_111128); 
             after(grammarAccess.getExternalReferenceAccess().getModelNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__ModelNameAssignment_1


    // $ANTLR start rule__ExternalReference__NameAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5643:1: rule__ExternalReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ExternalReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5647:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5648:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5648:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5649:1: RULE_ID
            {
             before(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_311159); 
             after(grammarAccess.getExternalReferenceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalReference__NameAssignment_3


    // $ANTLR start rule__ContentForm__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5658:1: rule__ContentForm__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ContentForm__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5662:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5663:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5663:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5664:1: RULE_STRING
            {
             before(grammarAccess.getContentFormAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_011190); 
             after(grammarAccess.getContentFormAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__DescriptionAssignment_0


    // $ANTLR start rule__ContentForm__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5673:1: rule__ContentForm__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ContentForm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5677:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5678:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5678:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5679:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_211221); 
             after(grammarAccess.getContentFormAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__NameAssignment_2


    // $ANTLR start rule__ContentForm__CollectionContextAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5688:1: rule__ContentForm__CollectionContextAssignment_4 : ( ( 'list' ) ) ;
    public final void rule__ContentForm__CollectionContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5692:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5693:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5693:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5694:1: ( 'list' )
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5695:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5696:1: 'list'
            {
             before(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__ContentForm__CollectionContextAssignment_411257); 
             after(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 

            }

             after(grammarAccess.getContentFormAccess().getCollectionContextListKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__CollectionContextAssignment_4


    // $ANTLR start rule__ContentForm__ContextRefAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5711:1: rule__ContentForm__ContextRefAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ContentForm__ContextRefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5715:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5716:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5716:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5717:1: ( RULE_ID )
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5718:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5719:1: RULE_ID
            {
             before(grammarAccess.getContentFormAccess().getContextRefExternalReferenceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_511300); 
             after(grammarAccess.getContentFormAccess().getContextRefExternalReferenceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getContentFormAccess().getContextRefExternalReferenceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__ContextRefAssignment_5


    // $ANTLR start rule__ContentForm__ReadonlyAssignment_7_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5730:1: rule__ContentForm__ReadonlyAssignment_7_1_0 : ( ( 'true' ) ) ;
    public final void rule__ContentForm__ReadonlyAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5734:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5735:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5735:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5736:1: ( 'true' )
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5737:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5738:1: 'true'
            {
             before(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__ContentForm__ReadonlyAssignment_7_1_011340); 
             after(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 

            }

             after(grammarAccess.getContentFormAccess().getReadonlyTrueKeyword_7_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__ReadonlyAssignment_7_1_0


    // $ANTLR start rule__ContentForm__FormElementsAssignment_8
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5753:1: rule__ContentForm__FormElementsAssignment_8 : ( ruleFormElement ) ;
    public final void rule__ContentForm__FormElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5757:1: ( ( ruleFormElement ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5758:1: ( ruleFormElement )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5758:1: ( ruleFormElement )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5759:1: ruleFormElement
            {
             before(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_811379);
            ruleFormElement();
            _fsp--;

             after(grammarAccess.getContentFormAccess().getFormElementsFormElementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__FormElementsAssignment_8


    // $ANTLR start rule__ContentForm__ActionsAssignment_9_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5768:1: rule__ContentForm__ActionsAssignment_9_2_0 : ( ruleAction ) ;
    public final void rule__ContentForm__ActionsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5772:1: ( ( ruleAction ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5773:1: ( ruleAction )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5773:1: ( ruleAction )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5774:1: ruleAction
            {
             before(grammarAccess.getContentFormAccess().getActionsActionParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__ContentForm__ActionsAssignment_9_2_011410);
            ruleAction();
            _fsp--;

             after(grammarAccess.getContentFormAccess().getActionsActionParserRuleCall_9_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__ActionsAssignment_9_2_0


    // $ANTLR start rule__ContentForm__ProcessesAssignment_10_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5783:1: rule__ContentForm__ProcessesAssignment_10_2_0 : ( ruleSimpleProcessCall ) ;
    public final void rule__ContentForm__ProcessesAssignment_10_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5787:1: ( ( ruleSimpleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5788:1: ( ruleSimpleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5788:1: ( ruleSimpleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5789:1: ruleSimpleProcessCall
            {
             before(grammarAccess.getContentFormAccess().getProcessesSimpleProcessCallParserRuleCall_10_2_0_0()); 
            pushFollow(FOLLOW_ruleSimpleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_011441);
            ruleSimpleProcessCall();
            _fsp--;

             after(grammarAccess.getContentFormAccess().getProcessesSimpleProcessCallParserRuleCall_10_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentForm__ProcessesAssignment_10_2_0


    // $ANTLR start rule__Action__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5798:1: rule__Action__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Action__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5802:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5803:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5803:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5804:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_011472); 
             after(grammarAccess.getActionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__DescriptionAssignment_0


    // $ANTLR start rule__Action__TypeAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5813:1: rule__Action__TypeAssignment_1 : ( ruleProcessType ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5817:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5818:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5818:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5819:1: ruleProcessType
            {
             before(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_111503);
            ruleProcessType();
            _fsp--;

             after(grammarAccess.getActionAccess().getTypeProcessTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__TypeAssignment_1


    // $ANTLR start rule__Action__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5828:1: rule__Action__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5832:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5833:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5833:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5834:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_211534); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__NameAssignment_2


    // $ANTLR start rule__Action__LabelAssignment_3_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5843:1: rule__Action__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Action__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5847:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5848:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5848:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5849:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_3_111565); 
             after(grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__LabelAssignment_3_1


    // $ANTLR start rule__Action__ProcessElementsAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5858:1: rule__Action__ProcessElementsAssignment_4 : ( ruleActionDialogueCall ) ;
    public final void rule__Action__ProcessElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5862:1: ( ( ruleActionDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5863:1: ( ruleActionDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5863:1: ( ruleActionDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5864:1: ruleActionDialogueCall
            {
             before(grammarAccess.getActionAccess().getProcessElementsActionDialogueCallParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActionDialogueCall_in_rule__Action__ProcessElementsAssignment_411596);
            ruleActionDialogueCall();
            _fsp--;

             after(grammarAccess.getActionAccess().getProcessElementsActionDialogueCallParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__ProcessElementsAssignment_4


    // $ANTLR start rule__CompoundDialogue__DescriptionAssignment_0_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5873:1: rule__CompoundDialogue__DescriptionAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__CompoundDialogue__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5877:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5878:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5878:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5879:1: RULE_STRING
            {
             before(grammarAccess.getCompoundDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_011627); 
             after(grammarAccess.getCompoundDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__DescriptionAssignment_0_0


    // $ANTLR start rule__CompoundDialogue__NameAssignment_0_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5888:1: rule__CompoundDialogue__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__CompoundDialogue__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5892:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5893:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5893:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5894:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_211658); 
             after(grammarAccess.getCompoundDialogueAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__NameAssignment_0_2


    // $ANTLR start rule__CompoundDialogue__ContextRefAssignment_0_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5903:1: rule__CompoundDialogue__ContextRefAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__CompoundDialogue__ContextRefAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5907:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5908:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5908:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5909:1: ( RULE_ID )
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5910:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5911:1: RULE_ID
            {
             before(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_411693); 
             after(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getCompoundDialogueAccess().getContextRefExternalReferenceCrossReference_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__ContextRefAssignment_0_4


    // $ANTLR start rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5922:1: rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5926:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5927:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5927:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5928:1: ( 'true' )
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5929:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5930:1: 'true'
            {
             before(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_011733); 
             after(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 

            }

             after(grammarAccess.getCompoundDialogueAccess().getReadonlyTrueKeyword_0_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0


    // $ANTLR start rule__CompoundDialogue__DialoguesAssignment_0_6_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5945:1: rule__CompoundDialogue__DialoguesAssignment_0_6_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CompoundDialogue__DialoguesAssignment_0_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5949:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5950:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5950:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5951:1: ruleDialogueCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_011772);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getCompoundDialogueAccess().getDialoguesDialogueCallParserRuleCall_0_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__DialoguesAssignment_0_6_2_0


    // $ANTLR start rule__CompoundDialogue__ProcessesAssignment_0_7_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5960:1: rule__CompoundDialogue__ProcessesAssignment_0_7_2_0 : ( ruleProcessCall ) ;
    public final void rule__CompoundDialogue__ProcessesAssignment_0_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5964:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5965:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5965:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5966:1: ruleProcessCall
            {
             before(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_011803);
            ruleProcessCall();
            _fsp--;

             after(grammarAccess.getCompoundDialogueAccess().getProcessesProcessCallParserRuleCall_0_7_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompoundDialogue__ProcessesAssignment_0_7_2_0


    // $ANTLR start rule__CollectionDialogue__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5975:1: rule__CollectionDialogue__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__CollectionDialogue__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5979:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5980:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5980:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5981:1: RULE_STRING
            {
             before(grammarAccess.getCollectionDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_011834); 
             after(grammarAccess.getCollectionDialogueAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__DescriptionAssignment_0


    // $ANTLR start rule__CollectionDialogue__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5990:1: rule__CollectionDialogue__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionDialogue__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5994:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5995:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5995:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:5996:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_211865); 
             after(grammarAccess.getCollectionDialogueAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__NameAssignment_2


    // $ANTLR start rule__CollectionDialogue__ContextRefAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6005:1: rule__CollectionDialogue__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollectionDialogue__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6009:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6010:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6010:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6011:1: ( RULE_ID )
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6012:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6013:1: RULE_ID
            {
             before(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_411900); 
             after(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCollectionDialogueAccess().getContextRefExternalReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__ContextRefAssignment_4


    // $ANTLR start rule__CollectionDialogue__ReadonlyAssignment_6_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6024:1: rule__CollectionDialogue__ReadonlyAssignment_6_1_0 : ( ( 'true' ) ) ;
    public final void rule__CollectionDialogue__ReadonlyAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6028:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6029:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6029:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6030:1: ( 'true' )
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6031:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6032:1: 'true'
            {
             before(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_011940); 
             after(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 

            }

             after(grammarAccess.getCollectionDialogueAccess().getReadonlyTrueKeyword_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__ReadonlyAssignment_6_1_0


    // $ANTLR start rule__CollectionDialogue__DialoguesAssignment_7_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6047:1: rule__CollectionDialogue__DialoguesAssignment_7_2_0 : ( ruleDialogueCall ) ;
    public final void rule__CollectionDialogue__DialoguesAssignment_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6051:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6052:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6052:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6053:1: ruleDialogueCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011979);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getCollectionDialogueAccess().getDialoguesDialogueCallParserRuleCall_7_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__DialoguesAssignment_7_2_0


    // $ANTLR start rule__CollectionDialogue__ProcessesAssignment_8_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6062:1: rule__CollectionDialogue__ProcessesAssignment_8_2_0 : ( ruleProcessCall ) ;
    public final void rule__CollectionDialogue__ProcessesAssignment_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6066:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6067:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6067:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6068:1: ruleProcessCall
            {
             before(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_012010);
            ruleProcessCall();
            _fsp--;

             after(grammarAccess.getCollectionDialogueAccess().getProcessesProcessCallParserRuleCall_8_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionDialogue__ProcessesAssignment_8_2_0


    // $ANTLR start rule__MasterDetail__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6077:1: rule__MasterDetail__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MasterDetail__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6081:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6082:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6082:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6083:1: RULE_STRING
            {
             before(grammarAccess.getMasterDetailAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_012041); 
             after(grammarAccess.getMasterDetailAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__DescriptionAssignment_0


    // $ANTLR start rule__MasterDetail__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6092:1: rule__MasterDetail__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MasterDetail__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6096:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6097:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6097:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6098:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_212072); 
             after(grammarAccess.getMasterDetailAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__NameAssignment_2


    // $ANTLR start rule__MasterDetail__ContextRefAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6107:1: rule__MasterDetail__ContextRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__MasterDetail__ContextRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6111:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6112:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6112:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6113:1: ( RULE_ID )
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6114:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6115:1: RULE_ID
            {
             before(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_412107); 
             after(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMasterDetailAccess().getContextRefExternalReferenceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__ContextRefAssignment_4


    // $ANTLR start rule__MasterDetail__ReadonlyAssignment_5_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6126:1: rule__MasterDetail__ReadonlyAssignment_5_1_0 : ( ( 'true' ) ) ;
    public final void rule__MasterDetail__ReadonlyAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6130:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6131:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6131:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6132:1: ( 'true' )
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6133:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6134:1: 'true'
            {
             before(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__MasterDetail__ReadonlyAssignment_5_1_012147); 
             after(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 

            }

             after(grammarAccess.getMasterDetailAccess().getReadonlyTrueKeyword_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__ReadonlyAssignment_5_1_0


    // $ANTLR start rule__MasterDetail__MasterAssignment_7
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6149:1: rule__MasterDetail__MasterAssignment_7 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__MasterAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6153:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6154:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6154:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6155:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_712186);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getMasterDetailAccess().getMasterDialogueCallParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__MasterAssignment_7


    // $ANTLR start rule__MasterDetail__DetailAssignment_10
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6164:1: rule__MasterDetail__DetailAssignment_10 : ( ruleDialogueCall ) ;
    public final void rule__MasterDetail__DetailAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6168:1: ( ( ruleDialogueCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6169:1: ( ruleDialogueCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6169:1: ( ruleDialogueCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6170:1: ruleDialogueCall
            {
             before(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1012217);
            ruleDialogueCall();
            _fsp--;

             after(grammarAccess.getMasterDetailAccess().getDetailDialogueCallParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__DetailAssignment_10


    // $ANTLR start rule__MasterDetail__ProcessesAssignment_12_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6179:1: rule__MasterDetail__ProcessesAssignment_12_2_0 : ( ruleProcessCall ) ;
    public final void rule__MasterDetail__ProcessesAssignment_12_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6183:1: ( ( ruleProcessCall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6184:1: ( ruleProcessCall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6184:1: ( ruleProcessCall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6185:1: ruleProcessCall
            {
             before(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_012248);
            ruleProcessCall();
            _fsp--;

             after(grammarAccess.getMasterDetailAccess().getProcessesProcessCallParserRuleCall_12_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MasterDetail__ProcessesAssignment_12_2_0


    // $ANTLR start rule__Process__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6194:1: rule__Process__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Process__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6198:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6199:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6199:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6200:1: RULE_STRING
            {
             before(grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Process__DescriptionAssignment_012279); 
             after(grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__DescriptionAssignment_0


    // $ANTLR start rule__Process__TypeAssignment_2_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6209:1: rule__Process__TypeAssignment_2_0 : ( ruleProcessType ) ;
    public final void rule__Process__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6213:1: ( ( ruleProcessType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6214:1: ( ruleProcessType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6214:1: ( ruleProcessType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6215:1: ruleProcessType
            {
             before(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleProcessType_in_rule__Process__TypeAssignment_2_012310);
            ruleProcessType();
            _fsp--;

             after(grammarAccess.getProcessAccess().getTypeProcessTypeEnumRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__TypeAssignment_2_0


    // $ANTLR start rule__Process__TypeAssignment_2_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6224:1: rule__Process__TypeAssignment_2_1_0 : ( ruleProcessTypeLink ) ;
    public final void rule__Process__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6228:1: ( ( ruleProcessTypeLink ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6229:1: ( ruleProcessTypeLink )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6229:1: ( ruleProcessTypeLink )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6230:1: ruleProcessTypeLink
            {
             before(grammarAccess.getProcessAccess().getTypeProcessTypeLinkEnumRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleProcessTypeLink_in_rule__Process__TypeAssignment_2_1_012341);
            ruleProcessTypeLink();
            _fsp--;

             after(grammarAccess.getProcessAccess().getTypeProcessTypeLinkEnumRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__TypeAssignment_2_1_0


    // $ANTLR start rule__Process__LinkAssignment_2_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6239:1: rule__Process__LinkAssignment_2_1_1 : ( ruleAssociationRoleReference ) ;
    public final void rule__Process__LinkAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6243:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6244:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6244:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6245:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getProcessAccess().getLinkAssociationRoleReferenceParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__Process__LinkAssignment_2_1_112372);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getProcessAccess().getLinkAssociationRoleReferenceParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__LinkAssignment_2_1_1


    // $ANTLR start rule__Process__NameAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6254:1: rule__Process__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6258:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6259:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6259:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6260:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__NameAssignment_312403); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__NameAssignment_3


    // $ANTLR start rule__Process__CollectionContextAssignment_5
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6269:1: rule__Process__CollectionContextAssignment_5 : ( ( 'list' ) ) ;
    public final void rule__Process__CollectionContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6273:1: ( ( ( 'list' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6274:1: ( ( 'list' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6274:1: ( ( 'list' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6275:1: ( 'list' )
            {
             before(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6276:1: ( 'list' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6277:1: 'list'
            {
             before(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0()); 
            match(input,51,FOLLOW_51_in_rule__Process__CollectionContextAssignment_512439); 
             after(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0()); 

            }

             after(grammarAccess.getProcessAccess().getCollectionContextListKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__CollectionContextAssignment_5


    // $ANTLR start rule__Process__ContextRefAssignment_6
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6292:1: rule__Process__ContextRefAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Process__ContextRefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6296:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6297:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6297:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6298:1: ( RULE_ID )
            {
             before(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_6_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6299:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6300:1: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Process__ContextRefAssignment_612482); 
             after(grammarAccess.getProcessAccess().getContextRefExternalReferenceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getProcessAccess().getContextRefExternalReferenceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__ContextRefAssignment_6


    // $ANTLR start rule__Process__ProcessElementsAssignment_7_1_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6311:1: rule__Process__ProcessElementsAssignment_7_1_1_0 : ( ruleUICall ) ;
    public final void rule__Process__ProcessElementsAssignment_7_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6315:1: ( ( ruleUICall ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6316:1: ( ruleUICall )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6316:1: ( ruleUICall )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6317:1: ruleUICall
            {
             before(grammarAccess.getProcessAccess().getProcessElementsUICallParserRuleCall_7_1_1_0_0()); 
            pushFollow(FOLLOW_ruleUICall_in_rule__Process__ProcessElementsAssignment_7_1_1_012517);
            ruleUICall();
            _fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsUICallParserRuleCall_7_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Process__ProcessElementsAssignment_7_1_1_0


    // $ANTLR start rule__FormElement__DescriptionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6326:1: rule__FormElement__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormElement__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6330:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6331:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6331:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6332:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_012548); 
             after(grammarAccess.getFormElementAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__DescriptionAssignment_0


    // $ANTLR start rule__FormElement__ReferencesAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6341:1: rule__FormElement__ReferencesAssignment_2 : ( ruleDtoPropertyReference ) ;
    public final void rule__FormElement__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6345:1: ( ( ruleDtoPropertyReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6346:1: ( ruleDtoPropertyReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6346:1: ( ruleDtoPropertyReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6347:1: ruleDtoPropertyReference
            {
             before(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_212579);
            ruleDtoPropertyReference();
            _fsp--;

             after(grammarAccess.getFormElementAccess().getReferencesDtoPropertyReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__ReferencesAssignment_2


    // $ANTLR start rule__FormElement__LabelAssignment_3_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6356:1: rule__FormElement__LabelAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__FormElement__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6360:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6361:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6361:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6362:1: RULE_STRING
            {
             before(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_3_112610); 
             after(grammarAccess.getFormElementAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__LabelAssignment_3_1


    // $ANTLR start rule__FormElement__ReadonlyAssignment_4_1_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6371:1: rule__FormElement__ReadonlyAssignment_4_1_0 : ( ( 'true' ) ) ;
    public final void rule__FormElement__ReadonlyAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6375:1: ( ( ( 'true' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6376:1: ( ( 'true' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6376:1: ( ( 'true' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6377:1: ( 'true' )
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6378:1: ( 'true' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6379:1: 'true'
            {
             before(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__FormElement__ReadonlyAssignment_4_1_012646); 
             after(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 

            }

             after(grammarAccess.getFormElementAccess().getReadonlyTrueKeyword_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FormElement__ReadonlyAssignment_4_1_0


    // $ANTLR start rule__ActionDialogueCall__ContextExpAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6394:1: rule__ActionDialogueCall__ContextExpAssignment_0 : ( ruleExpression ) ;
    public final void rule__ActionDialogueCall__ContextExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6398:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6399:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6399:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6400:1: ruleExpression
            {
             before(grammarAccess.getActionDialogueCallAccess().getContextExpExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ActionDialogueCall__ContextExpAssignment_012685);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getActionDialogueCallAccess().getContextExpExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionDialogueCall__ContextExpAssignment_0


    // $ANTLR start rule__ActionDialogueCall__NameAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6409:1: rule__ActionDialogueCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActionDialogueCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6413:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6414:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6414:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6415:1: RULE_ID
            {
             before(grammarAccess.getActionDialogueCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionDialogueCall__NameAssignment_212716); 
             after(grammarAccess.getActionDialogueCallAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionDialogueCall__NameAssignment_2


    // $ANTLR start rule__DialogueCall__LabelAssignment_0_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6424:1: rule__DialogueCall__LabelAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__DialogueCall__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6428:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6429:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6429:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6430:1: RULE_STRING
            {
             before(grammarAccess.getDialogueCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DialogueCall__LabelAssignment_0_012747); 
             after(grammarAccess.getDialogueCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__LabelAssignment_0_0


    // $ANTLR start rule__DialogueCall__ConditionAssignment_1_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6439:1: rule__DialogueCall__ConditionAssignment_1_2 : ( ruleOperationExpression ) ;
    public final void rule__DialogueCall__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6443:1: ( ( ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6444:1: ( ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6444:1: ( ruleOperationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6445:1: ruleOperationExpression
            {
             before(grammarAccess.getDialogueCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_rule__DialogueCall__ConditionAssignment_1_212778);
            ruleOperationExpression();
            _fsp--;

             after(grammarAccess.getDialogueCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__ConditionAssignment_1_2


    // $ANTLR start rule__DialogueCall__ContextExpAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6454:1: rule__DialogueCall__ContextExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__DialogueCall__ContextExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6458:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6459:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6459:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6460:1: ruleExpression
            {
             before(grammarAccess.getDialogueCallAccess().getContextExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__DialogueCall__ContextExpAssignment_212809);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getDialogueCallAccess().getContextExpExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__ContextExpAssignment_2


    // $ANTLR start rule__DialogueCall__NameAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6469:1: rule__DialogueCall__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__DialogueCall__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6473:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6474:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6474:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6475:1: RULE_ID
            {
             before(grammarAccess.getDialogueCallAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DialogueCall__NameAssignment_412840); 
             after(grammarAccess.getDialogueCallAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DialogueCall__NameAssignment_4


    // $ANTLR start rule__ProcessCall__LabelAssignment_0_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6484:1: rule__ProcessCall__LabelAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__ProcessCall__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6488:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6489:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6489:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6490:1: RULE_STRING
            {
             before(grammarAccess.getProcessCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProcessCall__LabelAssignment_0_012871); 
             after(grammarAccess.getProcessCallAccess().getLabelSTRINGTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__LabelAssignment_0_0


    // $ANTLR start rule__ProcessCall__ConditionAssignment_1_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6499:1: rule__ProcessCall__ConditionAssignment_1_2 : ( ruleOperationExpression ) ;
    public final void rule__ProcessCall__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6503:1: ( ( ruleOperationExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6504:1: ( ruleOperationExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6504:1: ( ruleOperationExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6505:1: ruleOperationExpression
            {
             before(grammarAccess.getProcessCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperationExpression_in_rule__ProcessCall__ConditionAssignment_1_212902);
            ruleOperationExpression();
            _fsp--;

             after(grammarAccess.getProcessCallAccess().getConditionOperationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__ConditionAssignment_1_2


    // $ANTLR start rule__ProcessCall__ContextExpAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6514:1: rule__ProcessCall__ContextExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__ProcessCall__ContextExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6518:1: ( ( ruleExpression ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6519:1: ( ruleExpression )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6519:1: ( ruleExpression )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6520:1: ruleExpression
            {
             before(grammarAccess.getProcessCallAccess().getContextExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProcessCall__ContextExpAssignment_212933);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getProcessCallAccess().getContextExpExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__ContextExpAssignment_2


    // $ANTLR start rule__ProcessCall__ReferredProcessAssignment_4
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6529:1: rule__ProcessCall__ReferredProcessAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ProcessCall__ReferredProcessAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6533:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6534:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6534:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6535:1: ( RULE_ID )
            {
             before(grammarAccess.getProcessCallAccess().getReferredProcessAbstractProcessCrossReference_4_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6536:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6537:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getReferredProcessAbstractProcessIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__ReferredProcessAssignment_412968); 
             after(grammarAccess.getProcessCallAccess().getReferredProcessAbstractProcessIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProcessCallAccess().getReferredProcessAbstractProcessCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__ReferredProcessAssignment_4


    // $ANTLR start rule__ProcessCall__LabelAssignment_5_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6548:1: rule__ProcessCall__LabelAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ProcessCall__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6552:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6553:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6553:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6554:1: RULE_ID
            {
             before(grammarAccess.getProcessCallAccess().getLabelIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessCall__LabelAssignment_5_113003); 
             after(grammarAccess.getProcessCallAccess().getLabelIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProcessCall__LabelAssignment_5_1


    // $ANTLR start rule__OperationExpression__NameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6563:1: rule__OperationExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6567:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6568:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6568:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6569:1: RULE_ID
            {
             before(grammarAccess.getOperationExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_113034); 
             after(grammarAccess.getOperationExpressionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OperationExpression__NameAssignment_1


    // $ANTLR start rule__SimpleProcessCall__ReferredProcessAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6578:1: rule__SimpleProcessCall__ReferredProcessAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleProcessCall__ReferredProcessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6582:1: ( ( ( RULE_ID ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6583:1: ( ( RULE_ID ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6583:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6584:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleProcessCallAccess().getReferredProcessAbstractProcessCrossReference_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6585:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6586:1: RULE_ID
            {
             before(grammarAccess.getSimpleProcessCallAccess().getReferredProcessAbstractProcessIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleProcessCall__ReferredProcessAssignment_013069); 
             after(grammarAccess.getSimpleProcessCallAccess().getReferredProcessAbstractProcessIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSimpleProcessCallAccess().getReferredProcessAbstractProcessCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcessCall__ReferredProcessAssignment_0


    // $ANTLR start rule__SimpleProcessCall__LabelAssignment_1_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6597:1: rule__SimpleProcessCall__LabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__SimpleProcessCall__LabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6601:1: ( ( RULE_STRING ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6602:1: ( RULE_STRING )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6602:1: ( RULE_STRING )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6603:1: RULE_STRING
            {
             before(grammarAccess.getSimpleProcessCallAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleProcessCall__LabelAssignment_1_113104); 
             after(grammarAccess.getSimpleProcessCallAccess().getLabelSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleProcessCall__LabelAssignment_1_1


    // $ANTLR start rule__StandardExpression__TypeAssignment
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6612:1: rule__StandardExpression__TypeAssignment : ( ruleExpressionType ) ;
    public final void rule__StandardExpression__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6616:1: ( ( ruleExpressionType ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6617:1: ( ruleExpressionType )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6617:1: ( ruleExpressionType )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6618:1: ruleExpressionType
            {
             before(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment13135);
            ruleExpressionType();
            _fsp--;

             after(grammarAccess.getStandardExpressionAccess().getTypeExpressionTypeEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StandardExpression__TypeAssignment


    // $ANTLR start rule__ServiceExpression__ServiceNameAssignment_1
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6627:1: rule__ServiceExpression__ServiceNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceExpression__ServiceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6631:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6632:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6632:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6633:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceNameAssignment_113166); 
             after(grammarAccess.getServiceExpressionAccess().getServiceNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceExpression__ServiceNameAssignment_1


    // $ANTLR start rule__ServiceExpression__ServiceMethodAssignment_3
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6642:1: rule__ServiceExpression__ServiceMethodAssignment_3 : ( RULE_ID ) ;
    public final void rule__ServiceExpression__ServiceMethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6646:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6647:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6647:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6648:1: RULE_ID
            {
             before(grammarAccess.getServiceExpressionAccess().getServiceMethodIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceMethodAssignment_313197); 
             after(grammarAccess.getServiceExpressionAccess().getServiceMethodIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceExpression__ServiceMethodAssignment_3


    // $ANTLR start rule__NavigationExpression__CompositionAssignment_0
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6657:1: rule__NavigationExpression__CompositionAssignment_0 : ( ( 'composite' ) ) ;
    public final void rule__NavigationExpression__CompositionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6661:1: ( ( ( 'composite' ) ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6662:1: ( ( 'composite' ) )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6662:1: ( ( 'composite' ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6663:1: ( 'composite' )
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6664:1: ( 'composite' )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6665:1: 'composite'
            {
             before(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__NavigationExpression__CompositionAssignment_013233); 
             after(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 

            }

             after(grammarAccess.getNavigationExpressionAccess().getCompositionCompositeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NavigationExpression__CompositionAssignment_0


    // $ANTLR start rule__NavigationExpression__ReferencesAssignment_2
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6680:1: rule__NavigationExpression__ReferencesAssignment_2 : ( ruleAssociationRoleReference ) ;
    public final void rule__NavigationExpression__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6684:1: ( ( ruleAssociationRoleReference ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6685:1: ( ruleAssociationRoleReference )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6685:1: ( ruleAssociationRoleReference )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6686:1: ruleAssociationRoleReference
            {
             before(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_213272);
            ruleAssociationRoleReference();
            _fsp--;

             after(grammarAccess.getNavigationExpressionAccess().getReferencesAssociationRoleReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NavigationExpression__ReferencesAssignment_2


    // $ANTLR start rule__DtoPropertyReference__NameAssignment
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6695:1: rule__DtoPropertyReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__DtoPropertyReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6699:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6700:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6700:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6701:1: RULE_ID
            {
             before(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment13303); 
             after(grammarAccess.getDtoPropertyReferenceAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DtoPropertyReference__NameAssignment


    // $ANTLR start rule__AssociationRoleReference__NameAssignment
    // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6710:1: rule__AssociationRoleReference__NameAssignment : ( RULE_ID ) ;
    public final void rule__AssociationRoleReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6714:1: ( ( RULE_ID ) )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6715:1: ( RULE_ID )
            {
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6715:1: ( RULE_ID )
            // ../org.mod4j.dsl.presentation.xtext.ui/src-gen/org/mod4j/dsl/presentation/xtext/contentassist/antlr/internal/InternalPresentation.g:6716:1: RULE_ID
            {
             before(grammarAccess.getAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment13334); 
             after(grammarAccess.getAssociationRoleReferenceAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssociationRoleReference__NameAssignment


 

    public static final BitSet FOLLOW_rulePresentationModel_in_entryRulePresentationModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentationModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PresentationModel__Alternatives_in_rulePresentationModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationModel127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__0_in_ruleApplicationModel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessReference_in_entryRuleProcessReference180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessReference187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessReference__Group__0_in_ruleProcessReference214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormsAndProcesses_in_entryRuleFormsAndProcesses240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormsAndProcesses247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__0_in_ruleFormsAndProcesses274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_entryRuleExternalReference360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalReference367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__0_in_ruleExternalReference394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_entryRuleModelElementWithContext420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElementWithContext427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_ruleModelElementWithContext454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIModelElement_in_entryRuleUIModelElement479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIModelElement486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIModelElement__Alternatives_in_ruleUIModelElement513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_entryRuleDialogue539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogue546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dialogue__Alternatives_in_ruleDialogue573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_entryRuleContentForm599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentForm606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__0_in_ruleContentForm633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_entryRuleCompoundDialogue719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundDialogue726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Alternatives_in_ruleCompoundDialogue753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_entryRuleCollectionDialogue779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionDialogue786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__0_in_ruleCollectionDialogue813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_entryRuleMasterDetail839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterDetail846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__0_in_ruleMasterDetail873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group__0_in_ruleProcess933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__0_in_ruleFormElement993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_entryRuleActionDialogueCall1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDialogueCall1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__0_in_ruleActionDialogueCall1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_entryRuleDialogueCall1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogueCall1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__0_in_ruleDialogueCall1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_entryRuleProcessCall1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessCall1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__0_in_ruleProcessCall1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_entryRuleOperationExpression1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationExpression1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationExpression__Group__0_in_ruleOperationExpression1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_entryRuleSimpleProcessCall1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleProcessCall1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group__0_in_ruleSimpleProcessCall1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_entryRuleStandardExpression1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardExpression1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardExpression__TypeAssignment_in_ruleStandardExpression1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_entryRuleServiceExpression1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceExpression1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__0_in_ruleServiceExpression1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_entryRuleNavigationExpression1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationExpression1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__0_in_ruleNavigationExpression1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_entryRuleDtoPropertyReference1559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDtoPropertyReference1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DtoPropertyReference__NameAssignment_in_ruleDtoPropertyReference1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_entryRuleAssociationRoleReference1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationRoleReference1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationRoleReference__NameAssignment_in_ruleAssociationRoleReference1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_entryRuleUICall1679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUICall1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UICall__Alternatives_in_ruleUICall1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessType__Alternatives_in_ruleProcessType1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcessTypeLink1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionType__Alternatives_in_ruleExpressionType1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_rule__PresentationModel__Alternatives1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormsAndProcesses_in_rule__PresentationModel__Alternatives1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogue_in_rule__UIModelElement__Alternatives1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__UIModelElement__Alternatives1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentForm_in_rule__Dialogue__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundDialogue_in_rule__Dialogue__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ReadonlyAssignment_7_1_0_in_rule__ContentForm__Alternatives_7_12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ContentForm__Alternatives_7_12026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__0_in_rule__CompoundDialogue__Alternatives2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionDialogue_in_rule__CompoundDialogue__Alternatives2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterDetail_in_rule__CompoundDialogue__Alternatives2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0_in_rule__CompoundDialogue__Alternatives_0_5_12127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CompoundDialogue__Alternatives_0_5_12146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ReadonlyAssignment_6_1_0_in_rule__CollectionDialogue__Alternatives_6_12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CollectionDialogue__Alternatives_6_12199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ReadonlyAssignment_5_1_0_in_rule__MasterDetail__Alternatives_5_12233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MasterDetail__Alternatives_5_12252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TypeAssignment_2_0_in_rule__Process__Alternatives_22286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_2_1__0_in_rule__Process__Alternatives_22304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Process__Alternatives_72338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__0_in_rule__Process__Alternatives_72357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReadonlyAssignment_4_1_0_in_rule__FormElement__Alternatives_4_12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FormElement__Alternatives_4_12409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceExpression_in_rule__Expression__Alternatives2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationExpression_in_rule__Expression__Alternatives2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardExpression_in_rule__Expression__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__Expression__Alternatives2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__UICall__Alternatives2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__UICall__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ProcessType__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ProcessType__Alternatives2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ProcessType__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ProcessType__Alternatives2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProcessType__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProcessType__Alternatives2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProcessType__Alternatives2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExpressionType__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ExpressionType__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__DescriptionAssignment_0_in_rule__ApplicationModel__Group__02796 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__02806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ApplicationModel__Group__12835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__12845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__NameAssignment_2_in_rule__ApplicationModel__Group__22873 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__22882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ApplicationModel__Group__32911 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__32921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__ExternalReferencesAssignment_4_in_rule__ApplicationModel__Group__42949 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__42959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__StartAssignment_5_in_rule__ApplicationModel__Group__52987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ProcessReference__Group__03034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessReference__Group__1_in_rule__ProcessReference__Group__03044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessReference__ModelNameAssignment_1_in_rule__ProcessReference__Group__13072 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProcessReference__Group__2_in_rule__ProcessReference__Group__13081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProcessReference__Group__23110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessReference__Group__3_in_rule__ProcessReference__Group__23120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessReference__NameAssignment_3_in_rule__ProcessReference__Group__33148 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ProcessReference__Group__4_in_rule__ProcessReference__Group__33157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ProcessReference__Group__43186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__DescriptionAssignment_0_in_rule__FormsAndProcesses__Group__03231 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__1_in_rule__FormsAndProcesses__Group__03241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FormsAndProcesses__Group__13270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__2_in_rule__FormsAndProcesses__Group__13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__NameAssignment_2_in_rule__FormsAndProcesses__Group__23308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__3_in_rule__FormsAndProcesses__Group__23317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FormsAndProcesses__Group__33346 = new BitSet(new long[]{0x000000D043800012L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__4_in_rule__FormsAndProcesses__Group__33356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__ExternalReferencesAssignment_4_in_rule__FormsAndProcesses__Group__43384 = new BitSet(new long[]{0x000000D043800012L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__5_in_rule__FormsAndProcesses__Group__43394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__StartAssignment_5_in_rule__FormsAndProcesses__Group__53422 = new BitSet(new long[]{0x000000D042000012L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__Group__6_in_rule__FormsAndProcesses__Group__53432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormsAndProcesses__ElementsAssignment_6_in_rule__FormsAndProcesses__Group__63460 = new BitSet(new long[]{0x000000D042000012L});
    public static final BitSet FOLLOW_23_in_rule__Application__Group__03510 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__03520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Application__Group__13549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__13559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__StartProcessesAssignment_2_in_rule__Application__Group__23587 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__23596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group__33625 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__33635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__43663 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__43673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Application__Group__53702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__StartProcessesAssignment_4_0_in_rule__Application__Group_4__03749 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__03758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group_4__13787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExternalReference__Group__03827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__1_in_rule__ExternalReference__Group__03837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__ModelNameAssignment_1_in_rule__ExternalReference__Group__13865 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__2_in_rule__ExternalReference__Group__13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ExternalReference__Group__23903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__3_in_rule__ExternalReference__Group__23913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalReference__NameAssignment_3_in_rule__ExternalReference__Group__33941 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExternalReference__Group__4_in_rule__ExternalReference__Group__33950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExternalReference__Group__43979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__DescriptionAssignment_0_in_rule__ContentForm__Group__04024 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__1_in_rule__ContentForm__Group__04034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ContentForm__Group__14063 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__2_in_rule__ContentForm__Group__14073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__NameAssignment_2_in_rule__ContentForm__Group__24101 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__3_in_rule__ContentForm__Group__24110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ContentForm__Group__34139 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__4_in_rule__ContentForm__Group__34149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__CollectionContextAssignment_4_in_rule__ContentForm__Group__44177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__5_in_rule__ContentForm__Group__44187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ContextRefAssignment_5_in_rule__ContentForm__Group__54215 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__6_in_rule__ContentForm__Group__54224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ContentForm__Group__64253 = new BitSet(new long[]{0x0000040710000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__7_in_rule__ContentForm__Group__64263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__0_in_rule__ContentForm__Group__74291 = new BitSet(new long[]{0x0000040610000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__8_in_rule__ContentForm__Group__74301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__FormElementsAssignment_8_in_rule__ContentForm__Group__84329 = new BitSet(new long[]{0x0000040610000010L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__9_in_rule__ContentForm__Group__84339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__0_in_rule__ContentForm__Group__94367 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__10_in_rule__ContentForm__Group__94377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__0_in_rule__ContentForm__Group__104405 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group__11_in_rule__ContentForm__Group__104415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ContentForm__Group__114444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ContentForm__Group_7__04504 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__1_in_rule__ContentForm__Group_7__04514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Alternatives_7_1_in_rule__ContentForm__Group_7__14542 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_7__2_in_rule__ContentForm__Group_7__14551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_7__24580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ContentForm__Group_9__04622 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__1_in_rule__ContentForm__Group_9__04632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ContentForm__Group_9__14661 = new BitSet(new long[]{0x00000000101FC030L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__2_in_rule__ContentForm__Group_9__14671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__0_in_rule__ContentForm__Group_9__24699 = new BitSet(new long[]{0x00000000101FC030L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9__3_in_rule__ContentForm__Group_9__24709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ContentForm__Group_9__34738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ActionsAssignment_9_2_0_in_rule__ContentForm__Group_9_2__04781 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_9_2__1_in_rule__ContentForm__Group_9_2__04790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_9_2__14819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ContentForm__Group_10__04859 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__1_in_rule__ContentForm__Group_10__04869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ContentForm__Group_10__14898 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__2_in_rule__ContentForm__Group_10__14908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__0_in_rule__ContentForm__Group_10__24936 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10__3_in_rule__ContentForm__Group_10__24946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ContentForm__Group_10__34975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentForm__ProcessesAssignment_10_2_0_in_rule__ContentForm__Group_10_2__05018 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ContentForm__Group_10_2__1_in_rule__ContentForm__Group_10_2__05027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContentForm__Group_10_2__15056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DescriptionAssignment_0_in_rule__Action__Group__05095 = new BitSet(new long[]{0x00000000001FC020L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__05105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__15133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__15143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Group__25171 = new BitSet(new long[]{0x0025800840600002L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__25180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__35208 = new BitSet(new long[]{0x0025800040600002L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__35218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ProcessElementsAssignment_4_in_rule__Action__Group__45246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Action__Group_3__05292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__05302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__LabelAssignment_3_1_in_rule__Action__Group_3__15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DescriptionAssignment_0_0_in_rule__CompoundDialogue__Group_0__05368 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__1_in_rule__CompoundDialogue__Group_0__05378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CompoundDialogue__Group_0__15407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__2_in_rule__CompoundDialogue__Group_0__15417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__NameAssignment_0_2_in_rule__CompoundDialogue__Group_0__25445 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__3_in_rule__CompoundDialogue__Group_0__25454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CompoundDialogue__Group_0__35483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__4_in_rule__CompoundDialogue__Group_0__35493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ContextRefAssignment_0_4_in_rule__CompoundDialogue__Group_0__45521 = new BitSet(new long[]{0x0000002500000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__5_in_rule__CompoundDialogue__Group_0__45530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__0_in_rule__CompoundDialogue__Group_0__55558 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__6_in_rule__CompoundDialogue__Group_0__55568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__0_in_rule__CompoundDialogue__Group_0__65596 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0__7_in_rule__CompoundDialogue__Group_0__65606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__0_in_rule__CompoundDialogue__Group_0__75634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CompoundDialogue__Group_0_5__05686 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__1_in_rule__CompoundDialogue__Group_0_5__05696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Alternatives_0_5_1_in_rule__CompoundDialogue__Group_0_5__15724 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_5__2_in_rule__CompoundDialogue__Group_0_5__15733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_5__25762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CompoundDialogue__Group_0_6__05804 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__1_in_rule__CompoundDialogue__Group_0_6__05814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompoundDialogue__Group_0_6__15843 = new BitSet(new long[]{0x0025900050600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__2_in_rule__CompoundDialogue__Group_0_6__15853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__0_in_rule__CompoundDialogue__Group_0_6__25881 = new BitSet(new long[]{0x0025900050600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6__3_in_rule__CompoundDialogue__Group_0_6__25891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompoundDialogue__Group_0_6__35920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__DialoguesAssignment_0_6_2_0_in_rule__CompoundDialogue__Group_0_6_2__05963 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_6_2__1_in_rule__CompoundDialogue__Group_0_6_2__05972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_6_2__16001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CompoundDialogue__Group_0_7__06041 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__1_in_rule__CompoundDialogue__Group_0_7__06051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompoundDialogue__Group_0_7__16080 = new BitSet(new long[]{0x0025900012600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__2_in_rule__CompoundDialogue__Group_0_7__16090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__0_in_rule__CompoundDialogue__Group_0_7__26118 = new BitSet(new long[]{0x0025900012600010L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7__3_in_rule__CompoundDialogue__Group_0_7__26128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompoundDialogue__Group_0_7__36157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__ProcessesAssignment_0_7_2_0_in_rule__CompoundDialogue__Group_0_7_2__06200 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CompoundDialogue__Group_0_7_2__1_in_rule__CompoundDialogue__Group_0_7_2__06209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CompoundDialogue__Group_0_7_2__16238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DescriptionAssignment_0_in_rule__CollectionDialogue__Group__06277 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__1_in_rule__CollectionDialogue__Group__06287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CollectionDialogue__Group__16316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__2_in_rule__CollectionDialogue__Group__16326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__NameAssignment_2_in_rule__CollectionDialogue__Group__26354 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__3_in_rule__CollectionDialogue__Group__26363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CollectionDialogue__Group__36392 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__4_in_rule__CollectionDialogue__Group__36402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ContextRefAssignment_4_in_rule__CollectionDialogue__Group__46430 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__5_in_rule__CollectionDialogue__Group__46439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CollectionDialogue__Group__56468 = new BitSet(new long[]{0x0000002510000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__6_in_rule__CollectionDialogue__Group__56478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__0_in_rule__CollectionDialogue__Group__66506 = new BitSet(new long[]{0x0000002410000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__7_in_rule__CollectionDialogue__Group__66516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__0_in_rule__CollectionDialogue__Group__76544 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__8_in_rule__CollectionDialogue__Group__76554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__0_in_rule__CollectionDialogue__Group__86582 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group__9_in_rule__CollectionDialogue__Group__86592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CollectionDialogue__Group__96621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CollectionDialogue__Group_6__06677 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__1_in_rule__CollectionDialogue__Group_6__06687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Alternatives_6_1_in_rule__CollectionDialogue__Group_6__16715 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_6__2_in_rule__CollectionDialogue__Group_6__16724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_6__26753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CollectionDialogue__Group_7__06795 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__1_in_rule__CollectionDialogue__Group_7__06805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CollectionDialogue__Group_7__16834 = new BitSet(new long[]{0x0025900050600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__2_in_rule__CollectionDialogue__Group_7__16844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__0_in_rule__CollectionDialogue__Group_7__26872 = new BitSet(new long[]{0x0025900050600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7__3_in_rule__CollectionDialogue__Group_7__26882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CollectionDialogue__Group_7__36911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__DialoguesAssignment_7_2_0_in_rule__CollectionDialogue__Group_7_2__06954 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_7_2__1_in_rule__CollectionDialogue__Group_7_2__06963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_7_2__16992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CollectionDialogue__Group_8__07032 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__1_in_rule__CollectionDialogue__Group_8__07042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CollectionDialogue__Group_8__17071 = new BitSet(new long[]{0x0025900012600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__2_in_rule__CollectionDialogue__Group_8__17081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__0_in_rule__CollectionDialogue__Group_8__27109 = new BitSet(new long[]{0x0025900012600010L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8__3_in_rule__CollectionDialogue__Group_8__27119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CollectionDialogue__Group_8__37148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__ProcessesAssignment_8_2_0_in_rule__CollectionDialogue__Group_8_2__07191 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CollectionDialogue__Group_8_2__1_in_rule__CollectionDialogue__Group_8_2__07200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionDialogue__Group_8_2__17229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DescriptionAssignment_0_in_rule__MasterDetail__Group__07268 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__1_in_rule__MasterDetail__Group__07278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MasterDetail__Group__17307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__2_in_rule__MasterDetail__Group__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__NameAssignment_2_in_rule__MasterDetail__Group__27345 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__3_in_rule__MasterDetail__Group__27354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MasterDetail__Group__37383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__4_in_rule__MasterDetail__Group__37393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ContextRefAssignment_4_in_rule__MasterDetail__Group__47421 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__5_in_rule__MasterDetail__Group__47430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__0_in_rule__MasterDetail__Group__57458 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__6_in_rule__MasterDetail__Group__57468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MasterDetail__Group__67497 = new BitSet(new long[]{0x0025900040600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__7_in_rule__MasterDetail__Group__67507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__MasterAssignment_7_in_rule__MasterDetail__Group__77535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__8_in_rule__MasterDetail__Group__77544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group__87573 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__9_in_rule__MasterDetail__Group__87583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MasterDetail__Group__97612 = new BitSet(new long[]{0x0025900040600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__10_in_rule__MasterDetail__Group__97622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__DetailAssignment_10_in_rule__MasterDetail__Group__107650 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__11_in_rule__MasterDetail__Group__107659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group__117688 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group__12_in_rule__MasterDetail__Group__117698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__0_in_rule__MasterDetail__Group__127726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MasterDetail__Group_5__07788 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__1_in_rule__MasterDetail__Group_5__07798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Alternatives_5_1_in_rule__MasterDetail__Group_5__17826 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_5__2_in_rule__MasterDetail__Group_5__17835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group_5__27864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MasterDetail__Group_12__07906 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__1_in_rule__MasterDetail__Group_12__07916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MasterDetail__Group_12__17945 = new BitSet(new long[]{0x0025900012600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__2_in_rule__MasterDetail__Group_12__17955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__0_in_rule__MasterDetail__Group_12__27983 = new BitSet(new long[]{0x0025900012600010L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12__3_in_rule__MasterDetail__Group_12__27993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MasterDetail__Group_12__38022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterDetail__ProcessesAssignment_12_2_0_in_rule__MasterDetail__Group_12_2__08065 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MasterDetail__Group_12_2__1_in_rule__MasterDetail__Group_12_2__08074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MasterDetail__Group_12_2__18103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__DescriptionAssignment_0_in_rule__Process__Group__08142 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__08152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Process__Group__18181 = new BitSet(new long[]{0x00000000001FC820L});
    public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__18191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_2_in_rule__Process__Group__28219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__28229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__NameAssignment_3_in_rule__Process__Group__38257 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__38266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Process__Group__48295 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__5_in_rule__Process__Group__48305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__CollectionContextAssignment_5_in_rule__Process__Group__58333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group__6_in_rule__Process__Group__58343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ContextRefAssignment_6_in_rule__Process__Group__68371 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_rule__Process__Group__7_in_rule__Process__Group__68380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_7_in_rule__Process__Group__78408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__TypeAssignment_2_1_0_in_rule__Process__Group_2_1__08458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Process__Group_2_1__1_in_rule__Process__Group_2_1__08467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__LinkAssignment_2_1_1_in_rule__Process__Group_2_1__18495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Process__Group_7_1__08534 = new BitSet(new long[]{0x0025900052600010L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__1_in_rule__Process__Group_7_1__08544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1_1__0_in_rule__Process__Group_7_1__18572 = new BitSet(new long[]{0x0025900052600010L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1__2_in_rule__Process__Group_7_1__18582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Process__Group_7_1__28611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_7_1_1_0_in_rule__Process__Group_7_1_1__08652 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Process__Group_7_1_1__1_in_rule__Process__Group_7_1_1__08661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Process__Group_7_1_1__18690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__DescriptionAssignment_0_in_rule__FormElement__Group__08729 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__08739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FormElement__Group__18768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__18778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ReferencesAssignment_2_in_rule__FormElement__Group__28806 = new BitSet(new long[]{0x0000000900002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__28815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__0_in_rule__FormElement__Group__38843 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__38853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group_4__0_in_rule__FormElement__Group__48881 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__48891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FormElement__Group__58920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FormElement__Group_3__08968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FormElement__Group_3__1_in_rule__FormElement__Group_3__08978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__LabelAssignment_3_1_in_rule__FormElement__Group_3__19006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FormElement__Group_4__09045 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__FormElement__Group_4__1_in_rule__FormElement__Group_4__09055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Alternatives_4_1_in_rule__FormElement__Group_4__19083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__ContextExpAssignment_0_in_rule__ActionDialogueCall__Group__09121 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__1_in_rule__ActionDialogueCall__Group__09131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ActionDialogueCall__Group__19160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__Group__2_in_rule__ActionDialogueCall__Group__19170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionDialogueCall__NameAssignment_2_in_rule__ActionDialogueCall__Group__29198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_0__0_in_rule__DialogueCall__Group__09238 = new BitSet(new long[]{0x0025900040600000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__1_in_rule__DialogueCall__Group__09248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__0_in_rule__DialogueCall__Group__19276 = new BitSet(new long[]{0x0025800040600000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__2_in_rule__DialogueCall__Group__19286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__ContextExpAssignment_2_in_rule__DialogueCall__Group__29314 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__3_in_rule__DialogueCall__Group__29324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DialogueCall__Group__39353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group__4_in_rule__DialogueCall__Group__39363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__NameAssignment_4_in_rule__DialogueCall__Group__49391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__LabelAssignment_0_0_in_rule__DialogueCall__Group_0__09435 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_0__1_in_rule__DialogueCall__Group_0__09444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DialogueCall__Group_0__19473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DialogueCall__Group_1__09513 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__1_in_rule__DialogueCall__Group_1__09523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__DialogueCall__Group_1__19552 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__2_in_rule__DialogueCall__Group_1__19562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DialogueCall__ConditionAssignment_1_2_in_rule__DialogueCall__Group_1__29590 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__DialogueCall__Group_1__3_in_rule__DialogueCall__Group_1__29599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DialogueCall__Group_1__39628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_0__0_in_rule__ProcessCall__Group__09671 = new BitSet(new long[]{0x0025900002600000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__1_in_rule__ProcessCall__Group__09681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__0_in_rule__ProcessCall__Group__19709 = new BitSet(new long[]{0x0025800002600000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__2_in_rule__ProcessCall__Group__19719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ContextExpAssignment_2_in_rule__ProcessCall__Group__29747 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__3_in_rule__ProcessCall__Group__29757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProcessCall__Group__39786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__4_in_rule__ProcessCall__Group__39796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ReferredProcessAssignment_4_in_rule__ProcessCall__Group__49824 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group__5_in_rule__ProcessCall__Group__49833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_5__0_in_rule__ProcessCall__Group__59861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__LabelAssignment_0_0_in_rule__ProcessCall__Group_0__09908 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_0__1_in_rule__ProcessCall__Group_0__09917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ProcessCall__Group_0__19946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ProcessCall__Group_1__09986 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__1_in_rule__ProcessCall__Group_1__09996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ProcessCall__Group_1__110025 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__2_in_rule__ProcessCall__Group_1__110035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__ConditionAssignment_1_2_in_rule__ProcessCall__Group_1__210063 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_1__3_in_rule__ProcessCall__Group_1__210072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ProcessCall__Group_1__310101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ProcessCall__Group_5__010145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProcessCall__Group_5__1_in_rule__ProcessCall__Group_5__010155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessCall__LabelAssignment_5_1_in_rule__ProcessCall__Group_5__110183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__OperationExpression__Group__010222 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OperationExpression__Group__1_in_rule__OperationExpression__Group__010232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationExpression__NameAssignment_1_in_rule__OperationExpression__Group__110260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__ReferredProcessAssignment_0_in_rule__SimpleProcessCall__Group__010298 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group__1_in_rule__SimpleProcessCall__Group__010307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group_1__0_in_rule__SimpleProcessCall__Group__110335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SimpleProcessCall__Group_1__010375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__Group_1__1_in_rule__SimpleProcessCall__Group_1__010385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleProcessCall__LabelAssignment_1_1_in_rule__SimpleProcessCall__Group_1__110413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ServiceExpression__Group__010452 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__1_in_rule__ServiceExpression__Group__010462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceNameAssignment_1_in_rule__ServiceExpression__Group__110490 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__2_in_rule__ServiceExpression__Group__110499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ServiceExpression__Group__210528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceExpression__Group__3_in_rule__ServiceExpression__Group__210538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceExpression__ServiceMethodAssignment_3_in_rule__ServiceExpression__Group__310566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__CompositionAssignment_0_in_rule__NavigationExpression__Group__010608 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__1_in_rule__NavigationExpression__Group__010618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NavigationExpression__Group__110647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NavigationExpression__Group__2_in_rule__NavigationExpression__Group__110657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationExpression__ReferencesAssignment_2_in_rule__NavigationExpression__Group__210685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ApplicationModel__DescriptionAssignment_010725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_210756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessReference_in_rule__ApplicationModel__ExternalReferencesAssignment_410787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__ApplicationModel__StartAssignment_510818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessReference__ModelNameAssignment_110849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessReference__NameAssignment_310880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormsAndProcesses__DescriptionAssignment_010911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FormsAndProcesses__NameAssignment_210942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalReference_in_rule__FormsAndProcesses__ExternalReferencesAssignment_410973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__FormsAndProcesses__StartAssignment_511004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElementWithContext_in_rule__FormsAndProcesses__ElementsAssignment_611035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_211066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__Application__StartProcessesAssignment_4_011097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__ModelNameAssignment_111128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalReference__NameAssignment_311159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ContentForm__DescriptionAssignment_011190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__NameAssignment_211221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ContentForm__CollectionContextAssignment_411257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentForm__ContextRefAssignment_511300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ContentForm__ReadonlyAssignment_7_1_011340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_rule__ContentForm__FormElementsAssignment_811379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__ContentForm__ActionsAssignment_9_2_011410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleProcessCall_in_rule__ContentForm__ProcessesAssignment_10_2_011441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__DescriptionAssignment_011472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Action__TypeAssignment_111503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_211534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__LabelAssignment_3_111565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDialogueCall_in_rule__Action__ProcessElementsAssignment_411596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CompoundDialogue__DescriptionAssignment_0_011627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__NameAssignment_0_211658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundDialogue__ContextRefAssignment_0_411693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CompoundDialogue__ReadonlyAssignment_0_5_1_011733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CompoundDialogue__DialoguesAssignment_0_6_2_011772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CompoundDialogue__ProcessesAssignment_0_7_2_011803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CollectionDialogue__DescriptionAssignment_011834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__NameAssignment_211865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionDialogue__ContextRefAssignment_411900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CollectionDialogue__ReadonlyAssignment_6_1_011940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__CollectionDialogue__DialoguesAssignment_7_2_011979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__CollectionDialogue__ProcessesAssignment_8_2_012010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MasterDetail__DescriptionAssignment_012041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__NameAssignment_212072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterDetail__ContextRefAssignment_412107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MasterDetail__ReadonlyAssignment_5_1_012147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__MasterAssignment_712186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogueCall_in_rule__MasterDetail__DetailAssignment_1012217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessCall_in_rule__MasterDetail__ProcessesAssignment_12_2_012248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Process__DescriptionAssignment_012279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessType_in_rule__Process__TypeAssignment_2_012310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessTypeLink_in_rule__Process__TypeAssignment_2_1_012341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__Process__LinkAssignment_2_1_112372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__NameAssignment_312403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Process__CollectionContextAssignment_512439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Process__ContextRefAssignment_612482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUICall_in_rule__Process__ProcessElementsAssignment_7_1_1_012517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__DescriptionAssignment_012548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDtoPropertyReference_in_rule__FormElement__ReferencesAssignment_212579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormElement__LabelAssignment_3_112610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__FormElement__ReadonlyAssignment_4_1_012646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ActionDialogueCall__ContextExpAssignment_012685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionDialogueCall__NameAssignment_212716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DialogueCall__LabelAssignment_0_012747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__DialogueCall__ConditionAssignment_1_212778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DialogueCall__ContextExpAssignment_212809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DialogueCall__NameAssignment_412840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProcessCall__LabelAssignment_0_012871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExpression_in_rule__ProcessCall__ConditionAssignment_1_212902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProcessCall__ContextExpAssignment_212933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__ReferredProcessAssignment_412968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessCall__LabelAssignment_5_113003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationExpression__NameAssignment_113034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleProcessCall__ReferredProcessAssignment_013069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleProcessCall__LabelAssignment_1_113104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionType_in_rule__StandardExpression__TypeAssignment13135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceNameAssignment_113166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceExpression__ServiceMethodAssignment_313197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__NavigationExpression__CompositionAssignment_013233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationRoleReference_in_rule__NavigationExpression__ReferencesAssignment_213272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DtoPropertyReference__NameAssignment13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationRoleReference__NameAssignment13334 = new BitSet(new long[]{0x0000000000000002L});

}